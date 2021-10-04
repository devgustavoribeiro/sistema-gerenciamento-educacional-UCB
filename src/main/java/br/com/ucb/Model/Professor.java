package br.com.ucb.Model;

//IGOR
public class Professor extends Funcionario{

    private Integer areaDoConhecimento;

    public Professor(String nome, String cpf, String email, String telefone, String dataNascimento, Enum tipoFuncionario, Integer areaDoConhecimento) {
        super(nome, cpf, email, telefone, dataNascimento, tipoFuncionario);
        this.areaDoConhecimento = areaDoConhecimento;
    }

    public Integer getAreaDoConhecimento() {
        return areaDoConhecimento;
    }

    public void setAreaDoConhecimento(Integer areaDoConhecimento) {
        this.areaDoConhecimento = areaDoConhecimento;
    }

}
