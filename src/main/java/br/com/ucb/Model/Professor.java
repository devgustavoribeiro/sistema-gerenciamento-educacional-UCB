package br.com.ucb.Model;

import java.util.ArrayList;

//IGOR
public class Professor extends Funcionario{

    private String areaDoConhecimento;

    ArrayList<Professor> cadastros = new ArrayList<Professor>();

    public Professor(Integer id, String nome, String cpf, String email, String telefone, String dataNascimento, String tipoFuncionario, String areaDoConhecimento) {
        super(id, nome, cpf, email, telefone, dataNascimento, tipoFuncionario);
        this.areaDoConhecimento = areaDoConhecimento;
    }

    public String getAreaDoConhecimento() {
        return areaDoConhecimento;
    }

    public void setAreaDoConhecimento(String areaDoConhecimento) {
        this.areaDoConhecimento = areaDoConhecimento;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + getId() + ", nome='" + getNome() + '\'' + ", cpf='" + getCpf() + '\'' + ", Email='" + getEmail() + '\'' + ", Telefone='" + getTelefone() + '\'' + ", dataNascimento ='" + getDataNascimento() + '\'' + ", tipoFuncionario='" + getTipoFuncionario() + '\'' + ",areaDoConhecimento='" + areaDoConhecimento + '\'' + '}';
    }

}
