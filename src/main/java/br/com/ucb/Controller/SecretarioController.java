package br.com.ucb.Controller;

public class SecretarioController {
    ProfessorController pc = new ProfessorController();
    AlunoController ac = new AlunoController();
    TurmaController tc = new TurmaController();

    public void matricularAluno(){
        ac.matricularAluno();
    }

    public void cadastrarProfessor(){
        pc.cadastrarProfessor();
    }

    public void cadastrarTurma(){
        tc.cadastrarTurma();

    }

    public void exibirListaProfessoresCadastrados(){
        pc.listarProfessores();

    }

    public void exibirTurmas(){
        tc.exibirTurmas();

    }

    public void exibirTodosAlunosMatriculados(){
        ac.listarEstudantes();

    }
}

