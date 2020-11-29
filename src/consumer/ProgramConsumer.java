package consumer;


import consumer.entities.Produto;
import consumer.services.AtualizaPreco;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProgramConsumer {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("TV", 900.00, "Amarelo"));
        produtos.add(new Produto("Notebook", 1200.00, "Branco"));
        produtos.add(new Produto("Tablet", 450.00, "Azul"));
        produtos.add(new Produto("Balança", 250.00, "Preto"));
        produtos.add(new Produto("Balança velha", 50.00, "Preto"));

        // implemtanção da interface Consumer
        produtos.forEach(new AtualizaPreco());

        // implementação através de referencia de método estático
        produtos.forEach(Produto::staticAtualizaPreco);

        // implementação através de referencia de método não estático
        produtos.forEach(Produto::nonStaticAtualizaPreco);

        // implementação através expressão lambda declarada
        Consumer<Produto> consumer = produto -> produto.setPreco(produto.getPreco() * 1.1);
        produtos.forEach(consumer);

        // implementação através expressão lambda inline
        produtos.forEach(produto -> produto.setPreco(produto.getPreco() * 1.1));

        produtos.forEach(System.out::println);

    }
}
