package br.com.ucb.Controller;

public enum AnoEscolar {

    PRIMEIRO_ANO_EF(1),
    SEGUNDO_ANO_EF(2),
    TERCEIRO_ANO_EF(3),
    QUARTO_ANO_EF(4),

    QUINTO_ANO_EF(5),
    SEXTO_ANO_EF(6),
    SETIMO_ANO_EF(7),
    OITAVO_ANO_EF(8),
    NONO_ANO_EF(9),

    PRIMEIRO_ANO_EM(10),
    SEGUNDO_ANO_EM(11),
    TERCEIRO_ANO_EM(12);

    public int numeroAnoEscolar;
    AnoEscolar(int num) {
        numeroAnoEscolar = num;

    }
}
