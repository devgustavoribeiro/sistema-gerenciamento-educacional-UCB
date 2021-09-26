package br.com.ucb.Model;

//Gustavo
public abstract class Funcionario {
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String dataNascimento;
    private Enum tipoFuncionario;

    public Funcionario(String nome, String cpf, String email, String telefone, String dataNascimento, Enum tipoFuncionario) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.tipoFuncionario = tipoFuncionario;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Enum getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(Enum tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
}
