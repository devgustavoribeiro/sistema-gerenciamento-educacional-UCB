package br.com.ucb.Program;

import br.com.ucb.Controller.AlunoController;

import java.util.Scanner;

public class AlunoTeste {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoController ac = new AlunoController();
        int op;
        do{
            System.out.println("Escolha uma opcao: ");
            System.out.println("1 - Matricular");
            System.out.println("2 - Listar");
            op = sc.nextInt();

            if(op == 1)
                ac.matricular();
            else if (op ==2)
                ac.listarEstudantes();
        } while(op != 0);

    }

}
