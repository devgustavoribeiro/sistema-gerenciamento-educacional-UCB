package br.com.ucb.Controller;

import br.com.ucb.Model.Aluno;
import br.com.ucb.Model.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TurmaController extends AlunoController{

    GeradorID gerador = new GeradorID();
    List<Turma> turmasCadastradas = new ArrayList<>();
    ProfessorController pc = new ProfessorController();
    Mensagens msg = new Mensagens();
    Scanner sc = new Scanner(System.in);
    Integer opcao;
    Integer qtdeAlunos = 0;


    public void cadastrarTurma(){
        String professor;
        Integer id = geradorId();
        Integer escolheProfessor;
        System.out.println("Digite o ano letivo dessa turma:");
        mostraAnos();
        escolheAno();
        System.out.println("Defina o professor dessa turma pelo seu ID:");
        pc.mostrarProfessoresDisponiveisParaNovasTurmas();
        escolheProfessor = sc.nextInt();
        professor = pc.retornaNomeProfessorEscolhido(escolheProfessor);

        System.out.println("Defina os alunos que estarão nessa turma pela Matricula:");
        do{
            exibirAlunosAptosParaNovasTurmas();
            Integer escolheAluno = sc.nextInt();
            alteraStatusParaAlunoCursando(escolheAluno);
            System.out.println("Deseja adicionar mais alunos? [1] - SIM / [2] - NAO");
            opcao = sc.nextInt();
        } while(opcao == 1);
        qtdeAlunos++;
        Turma t = new Turma(id, anoEscolhido, turno, professor, qtdeAlunos);
        salvarDados(t);
        msg.turmaCriadaSucesso();


    }

    public void salvarDados(Turma turma) {
        turmasCadastradas.add(turma);

    }

}
