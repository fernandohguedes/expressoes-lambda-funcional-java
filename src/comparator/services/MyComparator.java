package comparator.services;

import comparator.entities.Produto;

import java.util.Comparator;

public class MyComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto produto1, Produto produto2) {
        return produto1.getNome().toUpperCase().compareTo(produto2.getNome());
    }
}
