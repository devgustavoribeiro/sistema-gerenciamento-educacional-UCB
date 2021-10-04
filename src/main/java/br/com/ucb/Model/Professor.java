package br.com.ucb.Model;

//IGOR
public class Professor extends Funcionario{

    private Integer areaDoConhecimento;


    public Professor(Integer id, String nome, String cpf, String email, String telefone, String dataNascimento, String tipoFuncionario) {
        super(id, nome, cpf, email, telefone, dataNascimento, tipoFuncionario);
    }
}
