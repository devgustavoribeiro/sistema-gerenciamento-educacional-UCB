package br.com.ucb.Controller;

public class GeradorID {
    private Integer id = 0;
    public Integer geradorId(){
        return id++;
    }
}
