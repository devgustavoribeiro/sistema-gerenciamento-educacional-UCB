package br.com.ucb.Model;

// Gustavo

import br.com.ucb.Controller.AnoEscolar;
import br.com.ucb.Controller.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Aluno {

    private Integer id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String email;
    private String anoEscolar;
    private String statusAluno;

    ArrayList<Aluno> matriculas = new ArrayList<Aluno>();

    public Aluno(Integer id, String nome, String cpf, String dataNascimento, String email, String anoEscolar, String statusAluno) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.anoEscolar = anoEscolar;
        this.statusAluno = statusAluno;
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


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(String anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    public String getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(String statusAluno) {
        this.statusAluno = statusAluno;
    }


    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + ", dataNascimento='" + dataNascimento + '\'' + ", email='" + email + '\'' + ", anoEscolar='" + anoEscolar + '\'' + ", statusAluno='" + statusAluno + '\'' + '}';
    }
}
