package br.com.ucb.Model;

import br.com.ucb.Controller.AreaConhecimento;

import java.util.ArrayList;

//IGOR
public class Professor extends Funcionario{

    private String areaDoConhecimento;
    private String statusProfessor;

    ArrayList<Professor> cadastroProfessores = new ArrayList<Professor>();

    public Professor(Integer id, Integer matricula, String nome, String cpf, String email, String telefone, String dataNascimento, String tipoFuncionario, String areaDoConhecimento, String statusProfessor) {
        super(id, matricula, nome, cpf, email, telefone, dataNascimento, tipoFuncionario);
        this.areaDoConhecimento = areaDoConhecimento;
        this.statusProfessor = statusProfessor;
    }

    public String getAreaDoConhecimento() {
        return areaDoConhecimento;
    }

    public void setAreaDoConhecimento(String areaDoConhecimento) {
        this.areaDoConhecimento = areaDoConhecimento;
    }

    public String getStatusProfessor() {
        return statusProfessor;
    }

    public void setStatusProfessor(String statusProfessor) {
        this.statusProfessor = statusProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + getId() + ", nome='" + getNome() + '\'' + ", cpf='"
                + getCpf() + '\'' + ", Email='" + getEmail() + '\'' + ", Telefone='"
                + getTelefone() + '\'' + ", dataNascimento ='" + getDataNascimento() + '\'' + ", tipoFuncionario='"
                + getTipoFuncionario() + '\'' + ",areaDoConhecimento='" + areaDoConhecimento + '\'' + '}';
    }

}
