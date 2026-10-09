package domain.model;


import domain.entity.AggregateRoot;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends AggregateRoot {

    private int codigo;
    private String nome;
    private List<Loja> lojas = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Loja> getLojas() {
        return lojas;
    }

    public void setLojas(List<Loja> lojas) {
        this.lojas = lojas;
    }
}
