package br.com.ucb.Controller;

import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    private Integer matriculaInserida;
    private Integer senha;
    private boolean status = false;

    public Integer inserirMatricula() {
        System.out.println("Digite a matricula para entrar no sistema:");
        matriculaInserida = sc.nextInt();
        return matriculaInserida;
    }

    public Integer inserirSenha() {
        System.out.println("Digite a sua senha: ");
        senha = sc.nextInt();
        return senha;
    }

    public void verificaDados() {
        do {
            inserirMatricula();
            inserirSenha();
        } while (inserirMatricula() == 0 || inserirSenha() == 0);
    }

    public boolean acessar() {
        if (status == true) {
            return true;
        } else if (status == false) {
            System.out.println("Matricula ou senha não existem!");
            System.out.println("Tente novamente...");
            System.exit(1);
        }
        return false;

    }
}

