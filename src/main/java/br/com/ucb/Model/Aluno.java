package br.com.ucb.Model;

// Gustavo

public class Aluno {
    private Integer id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Enum anoEscolar;
    private String email;

    public Aluno(String nome, String cpf, String dataNascimento, Enum anoEscolar, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.anoEscolar = anoEscolar;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Enum getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(Enum anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
