package br.com.ucb.Controller;

public enum TipoFuncionario {
    PROFESSOR(1),
    SECRETARIO_ESCOLAR(2),
    DIRETOR(3),
    COORDENADOR(4);

    public int numeroTipoFuncionario;
    TipoFuncionario(int num){numeroTipoFuncionario = num;}
}
