package br.com.ucb.Program;

import br.com.ucb.Controller.AlunoController;
import br.com.ucb.Controller.ProfessorController;

import java.util.Scanner;

public class Teste {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoController ac = new AlunoController();
        ProfessorController pc = new ProfessorController();
        int op;

        do {
            System.out.println("Escolha uma opcao: ");
            System.out.println("1 - Matricular Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Listar Professores");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    ac.matricularAluno();
                    break;
                case 2:
                    ac.listarEstudantes();
                    break;
                case 3:
                    pc.cadastrarProfessor();
                    break;
                case 4:
                    pc.listarProfessores();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        }while (op != 0) ;
    }
}
