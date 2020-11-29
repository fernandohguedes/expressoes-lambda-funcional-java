package funcoesComoParametro;


import funcoesComoParametro.entities.Produto;
import funcoesComoParametro.services.ProdutoService;

import java.util.ArrayList;
import java.util.List;

public class ProgramFuncoesParametro {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("TV", 900.00, "Amarelo"));
        produtos.add(new Produto("Notebook", 1200.00, "Branco"));
        produtos.add(new Produto("Tablet", 450.00, "Azul"));
        produtos.add(new Produto("Balança", 250.00, "Preto"));


        ProdutoService service = new ProdutoService();
        double soma = service.filtraESoma(produtos, produto -> produto.getNome().charAt(0) == 'T');
        System.out.println(soma);

    }
}
