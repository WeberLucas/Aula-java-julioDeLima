package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Xiaomi",Tamanho.GRANDE);
        ItemIncluso meuItensInclusos = new ItemIncluso("carregador",10);
        ItemIncluso segundoItemIncluso =new ItemIncluso( "fone de ouvido",11);

        System.out.println(meuProduto.getMarca());
        meuProduto.setMarca("iphone");
        meuProduto.setNome("Poco F4");
        meuProduto.setIdadeProduto(2);
        meuProduto.setValor(2);
       // meuItensInclusos.setItens("carregador");
      //  meuItensInclusos.setQuantidade(10);
       // segundoItemIncluso.setItens("fone");
      //  segundoItemIncluso.setQuantidade(12);

        List<ItemIncluso> itensInclusos = new ArrayList<ItemIncluso>();
        itensInclusos.add(meuItensInclusos);
        itensInclusos.add(segundoItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

      //  System.out.println(meuProduto.getItensInclusos().size());
        System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        //System.out.println(meuProduto.getTamanho());
        //System.out.println(meuProduto.getMarca());

       // System.out.println(meuItensInclusos.getQuantidade());
       // System.out.println(meuItensInclusos.getItens());

       // System.out.println(segundoItemIncluso.getItens());
      //  System.out.println(segundoItemIncluso.getQuantidade());


        for(ItemIncluso itemAtual : meuProduto.getItensInclusos() ){
            System.out.println(itemAtual.getItens());
            System.out.println(itemAtual.getQuantidade());
        }

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("sansung",Tamanho.GRANDE);
        meuProdutoNacional.setImpostoNacional(0.5054);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("iphone",Tamanho.PEQUENO);
        meuProdutoInternacional.setTaxaImportacao(0.9999);
        System.out.println(meuProdutoInternacional.getTaxaImportacao());


        meuProdutoInternacional.setValor(-100);
        System.out.println(meuProdutoInternacional.getValor());
    }
}
