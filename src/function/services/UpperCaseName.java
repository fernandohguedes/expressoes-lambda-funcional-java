package function.services;

import function.entities.Produto;

import java.util.function.Function;

public class UpperCaseName implements Function<Produto, String> {

    @Override
    public String apply(Produto produto) {
        return produto.getNome().toUpperCase();
    }
}
