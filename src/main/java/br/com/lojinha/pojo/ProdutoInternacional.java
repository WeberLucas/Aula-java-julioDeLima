package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    private double taxaImportacao;



    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public void setValor(double novoValor) {
        if (novoValor > -100){
            this.valor = novoValor;
        } else{
            throw new IllegalArgumentException("tem que ser maior que -100");
        }

    }


    public String getDadosFavoritos() {
        return this.getNome() + ", "+ this.getMarca() + " e " +this.getValor(); }
}
