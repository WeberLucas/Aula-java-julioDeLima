package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {

    private String nome;
    private String marca;
    protected double valor;
    private List<ItemIncluso> itensInclusos;

    private Tamanho tamanho;
    private int idadeProduto;

    public Produto(String marcaInicial, Tamanho tamanhoInicial) {
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        if (novoValor >0){
            this.valor = novoValor;
        } else{
            throw new IllegalArgumentException("Não pode ser menor que zero");
        }

    }
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public int getIdadeProduto() {
        return idadeProduto;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setMarca(String novoMarca) {
        this.marca = novoMarca;
    }

    public void setItensInclusos(List<ItemIncluso> novoItensInclusos) {
        this.itensInclusos = novoItensInclusos;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public void setIdadeProduto(int novoIdadeProduto) {
        this.idadeProduto = novoIdadeProduto;
    }

}
