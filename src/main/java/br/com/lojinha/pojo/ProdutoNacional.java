package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {
    private double impostoNacional;

    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double novoimpostoNacional) {
        this.impostoNacional = novoimpostoNacional;
    }


    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public String getDadosFavoritos(){
        return this.getNome() + ", "+ this.getMarca() + " e " +this.getValor();
    }
}
