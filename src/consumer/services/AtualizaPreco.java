package consumer.services;

import consumer.entities.Produto;

import java.util.function.Consumer;

public class AtualizaPreco implements Consumer<Produto> {

    @Override
    public void accept(Produto produto) {
        produto.setPreco(produto.getPreco() * 1.1);
    }
}
