package br.com.ucb.Controller;

import br.com.ucb.Model.Aluno;
import br.com.ucb.Model.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TurmaController{
    AlunoController ac = new AlunoController();
    GeradorID gerador = new GeradorID();
    List<Turma> turmasCadastradas = new ArrayList<>();
    ProfessorController pc = new ProfessorController();
    Mensagens msg = new Mensagens();
    Scanner sc = new Scanner(System.in);
    Integer opcao;
    Integer qtdeAlunos = 0;
    String anoEsc;
    String turno;


    public void cadastrarTurma(){
        String professor;
        Integer id = gerador.geradorId();

        Integer escolheProfessor;
        System.out.println("Digite o ano letivo dessa turma:");
        ac.mostraAnos();
        anoEsc = ac.escolheAno();
        System.out.println("Escolha o turno: ");
        turno = ac.escolheTurno();
        System.out.println("Defina o professor dessa turma pelo seu ID:");
        pc.mostrarProfessoresDisponiveisParaNovasTurmas();
        escolheProfessor = sc.nextInt();
        professor = pc.retornaNomeProfessorEscolhido(escolheProfessor);

        System.out.println("Defina os alunos que estarão nessa turma pela Matricula:");
        do{
            ac.exibirAlunosAptosParaNovasTurmas();
            Integer escolheAluno = sc.nextInt();
            ac.alteraStatusParaAlunoCursando(escolheAluno);
            System.out.println("Deseja adicionar mais alunos? [1] - SIM / [2] - NAO");
            opcao = sc.nextInt();
        } while(opcao == 1);


        Turma t = new Turma(id, anoEsc, turno, professor, qtdeAlunos++);
        salvarDados(t);
        msg.turmaCriadaSucesso();


    }

    public void salvarDados(Turma turma) {
        turmasCadastradas.add(turma);

    }

    public void exibirTurmas(){
        for(int i=0; i<turmasCadastradas.size(); i++){
            System.out.print(("ID: ") + turmasCadastradas.get(i).getId());
            System.out.println("Ano Escolar: " + turmasCadastradas.get(i).getAnoEscolar());
            System.out.println(("Turno = ") + turmasCadastradas.get(i).getTurno());
            System.out.println(("Professor = ") + turmasCadastradas.get(i).getProfessor());
            System.out.println(("Quantidade de alunos = ") + turmasCadastradas.get(i).getQtdAlunos());

        }
    }

}
