package br.com.ucb.Controller;

import br.com.ucb.Model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoController {
    String anoEscolhido;
    Scanner sc = new Scanner(System.in);
    List<Aluno> alunosMatriculados = new ArrayList<>();
    private static final String MSG_SUCESSO = "Aluno matriculado com sucesso!";

    public void matricular(){

        System.out.println("Matricula: ");
        Integer id = sc.nextInt();
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("CPF: ");
        String cpf = sc.next();
        System.out.println("Data de nascimento: ");
        String dt = sc.next();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Escolha o ano escolar:");
        mostraAnos();
        escolheAno();
        String status = StatusAluno.ATIVO.toString();

        Aluno a = new Aluno(id, nome, cpf, dt, email, anoEscolhido, status);
        salvarDados(a);
        System.out.println(MSG_SUCESSO);


    }

    public void listarEstudantes(){
        for(int i=0; i<alunosMatriculados.size(); i++){
            System.out.print(("ID = ") + alunosMatriculados.get(i).getId() + '\n');
            System.out.println(("Nome = ") + alunosMatriculados.get(i).getNome());
            System.out.println(("CPF = ") + alunosMatriculados.get(i).getCpf());
            System.out.println(("Data de Nascimento = ") + alunosMatriculados.get(i).getDataNascimento());
            System.out.println(("E-mail = ") + alunosMatriculados.get(i).getEmail());
            System.out.println(("Ano Escolar = ") + alunosMatriculados.get(i).getAnoEscolar());
            System.out.println(("Status do Aluno = ") + alunosMatriculados.get(i).getStatusAluno());
        }


    }

    public void salvarDados(Aluno aluno) {
        alunosMatriculados.add(aluno);

    }

    public void mostraAnos(){
        AnoEscolar ano[] = AnoEscolar.values();
        for(AnoEscolar anoEscolar : ano){
            System.out.println(anoEscolar + " - " + anoEscolar.ordinal());
        }
    }

    public void escolheAno(){

        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                anoEscolhido = AnoEscolar.PRIMEIRO_ANO_EF.toString();
                break;
            case 2:
                anoEscolhido = AnoEscolar.SEGUNDO_ANO_EF.toString();
                break;
        }

    }

}




