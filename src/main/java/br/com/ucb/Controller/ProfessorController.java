package br.com.ucb.Controller;

import br.com.ucb.Model.Professor;

import java.awt.geom.Area;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfessorController extends GeradorID{
    SecureRandom random = new SecureRandom();
    String areaEscolhida;
    String nomeProfessor;
    Scanner sc = new Scanner(System.in);
    List<Professor> professoresCadastrados = new ArrayList<>();
    private static final String MSG_SUCESSO = "Professor cadastrado com sucesso!";

    public void cadastrarProfessor(){
        String tipoFuncionario = TipoFuncionario.PROFESSOR.toString();
        String statusProfessor = StatusProfessor.ATIVO.toString();
        Integer id = geradorId();
        System.out.println("Matricula: ");
        Integer matricula = random.nextInt(1000);
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
        mostraAreas();
        escolheArea();

        Professor p = new Professor(id, matricula, nome, cpf,email, telefone,dt , areaEscolhida, tipoFuncionario, statusProfessor);
        salvarDados(p);
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
            System.out.println(("Área do Conhecimento = ") + professoresCadastrados.get(i).getAreaDoConhecimento());
            System.out.println("Status do Professor: " + professoresCadastrados.get(i).getStatusProfessor());
        }
    }

    public void mostrarProfessoresDisponiveisParaNovasTurmas(){
        for(int i=0; i<professoresCadastrados.size(); i++){
            if(professoresCadastrados.get(i).getStatusProfessor()!= "ATIVO"
                    && professoresCadastrados.get(i).getStatusProfessor() != "INATIVO"){
                System.out.println("ID: " + professoresCadastrados.get(i).getId());
                System.out.println("Matricula: " + professoresCadastrados.get(i).getMatricula());
                System.out.println("Nome: " + professoresCadastrados.get(i).getNome());
                System.out.println("Area de conhecimento: " + professoresCadastrados.get(i).getAreaDoConhecimento());
                System.out.println("Status do Professor: " + professoresCadastrados.get(i).getStatusProfessor());

            }
        }
    }

    public String retornaNomeProfessorEscolhido(Integer professorEscolhido){
        for(int i=0; i<professoresCadastrados.size(); i++){
            if(professoresCadastrados.get(i).getStatusProfessor()!= "ATIVO"
                    && professoresCadastrados.get(i).getStatusProfessor() != "INATIVO"
            && professorEscolhido == professoresCadastrados.get(i).getId()){
                nomeProfessor = professoresCadastrados.get(i).getNome();
            }
        }

        return nomeProfessor;
    }

    public void salvarDados(Professor professor) {
        professoresCadastrados.add(professor);
    }

     public void mostraAreas(){
        AreaConhecimento area[] = AreaConhecimento.values();
        for(AreaConhecimento areaConhecimento : area){
            System.out.println(areaConhecimento + " - " + areaConhecimento.ordinal());
        }
    }

    public void escolheArea(){

        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                areaEscolhida = AreaConhecimento.PORTUGUES.toString();
                break;
            case 2:
                areaEscolhida = AreaConhecimento.MATEMATICA.toString();
                break;
            case 3:
                areaEscolhida = AreaConhecimento.HISTORIA.toString();
            case 4:
                areaEscolhida = AreaConhecimento.GEOGRAFIA.toString();
                break;
            case 5:
                areaEscolhida = AreaConhecimento.CIENCIAS.toString();
                break;
            case 6:
                areaEscolhida = AreaConhecimento.INGLES.toString();
                break;
            case 7:
                areaEscolhida = AreaConhecimento.ESPANHOL.toString();
                break;
            case 8:
                areaEscolhida = AreaConhecimento.BIOLOGIA.toString();
                break;
            case 9:
                areaEscolhida = AreaConhecimento.QUIMICA.toString();
                break;
            case 10:
                areaEscolhida = AreaConhecimento.FISICA.toString();
                break;
        }

    }

}
