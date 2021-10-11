package br.com.ucb.Controller;

import br.com.ucb.Model.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfessorController {
    String tipoFuncionarioEscolhido;
    Scanner sc = new Scanner(System.in);
    List<Professor> professoresCadastrados = new ArrayList<>();
    private static final String MSG_SUCESSO = "Professor cadastrado com sucesso!";

    public void cadastrar(){

        System.out.println("Matricula: ");
        Integer id = sc.nextInt();
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("CPF: ");
        String cpf = sc.next();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Telefone: ");
        String telefone = sc.next();
        System.out.println("Data de nascimento: ");
        String dt = sc.next();
        System.out.println("Área do Conhecimento: ");
        String areaDoConhecimento = sc.next();
        System.out.println("Escolha sua função:");
        mostraFuncoes();
        escolheFuncao();

        Professor a = new Professor(id, nome, cpf,email, telefone,dt , areaDoConhecimento, tipoFuncionarioEscolhido);
        salvarDados(a);
        System.out.println(MSG_SUCESSO);

    }

    public void listarProfessores(){
        for(int i=0; i<professoresCadastrados.size(); i++){
            System.out.print(("ID = ") + professoresCadastrados.get(i).getId() + '\n');
            System.out.println(("Nome = ") + professoresCadastrados.get(i).getNome());
            System.out.println(("CPF = ") + professoresCadastrados.get(i).getCpf());
            System.out.println(("E-mail = ") + professoresCadastrados.get(i).getEmail());
            System.out.println(("Telefone = ") + professoresCadastrados.get(i).getTelefone());
            System.out.println(("Data de Nascimento = ") + professoresCadastrados.get(i).getDataNascimento());
            System.out.println(("Função = ") + professoresCadastrados.get(i).getAreaDoConhecimento());
            System.out.println(("Área do Conhecimento = ") + professoresCadastrados.get(i).getTipoFuncionario());
        }
    }

    public void salvarDados(Professor professor) {
        professoresCadastrados.add(professor);
    }

    public void mostraFuncoes(){
        TipoFuncionario funcao[] = TipoFuncionario.values();
        for(TipoFuncionario tipoFuncionario : funcao){
            System.out.println(tipoFuncionario + " - " + tipoFuncionario.ordinal());
        }
    }

    public void escolheFuncao(){

        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                tipoFuncionarioEscolhido = TipoFuncionario.PROFESSOR.toString();
                break;
            case 2:
                tipoFuncionarioEscolhido = TipoFuncionario.COORDENADOR.toString();
                break;
            case 3:
                tipoFuncionarioEscolhido = TipoFuncionario.DIRETOR.toString();
            case 4:
                tipoFuncionarioEscolhido = TipoFuncionario.SECRETARIO_ESCOLAR.toString();
        }

    }

}
