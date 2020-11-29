package funcoesComoParametro.services;

import funcoesComoParametro.entities.Produto;

import java.util.List;
import java.util.function.Predicate;

public class ProdutoService {

    public double filtraESoma(List<Produto> produtos, Predicate<Produto> criterio) {
        double soma = 0.0;
        for (Produto produto : produtos) {
            if (criterio.test(produto)) {
                soma += produto.getPreco();
            }
        }
        return soma;
    }
}
