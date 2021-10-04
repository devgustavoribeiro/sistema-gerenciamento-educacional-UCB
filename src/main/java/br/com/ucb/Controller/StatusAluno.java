package br.com.ucb.Controller;

public enum StatusAluno {
    ATIVO(1),
    CURSANDO(2),
    APROVADO(3),
    REPROVADO(4);

    private int numeroStatus;
    StatusAluno(int valor) {
        numeroStatus = valor;
    }
}
