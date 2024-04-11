package br.com.lojinha.pojo;

public class ItemIncluso {
    private int quantidade;
    private String itens;


    public ItemIncluso(String itens, int quantidade){
        this.itens = itens;
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }
}
