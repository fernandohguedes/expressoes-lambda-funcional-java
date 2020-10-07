package predicate;


import predicate.entities.Produto;
import predicate.services.ProdutoPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("TV", 900.00, "Amarelo"));
        produtos.add(new Produto("Notebook", 1200.00, "Branco"));
        produtos.add(new Produto("Tablet", 450.00, "Azul"));
        produtos.add(new Produto("Balança", 250.00, "Preto"));
        produtos.add(new Produto("Balança velha", 50.00, "Preto"));

        // implemtanção da interface predicate
        produtos.removeIf(new ProdutoPredicate());

        // referencia de método estático
        produtos.removeIf(Produto::staticProdutoPredicate);

        // referencia de método não estático
        produtos.removeIf(Produto::nonStaticProdutoPredicate);

        // expressão lambda inline
        produtos.removeIf(produto -> produto.getPreco() >= 100.00);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
