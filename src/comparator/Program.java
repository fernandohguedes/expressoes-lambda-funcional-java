package comparator;

import comparator.entities.Produto;
import comparator.services.MyComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("TV", 900.00, "Amarelo"));
        produtos.add(new Produto("Notebook", 1200.00, "Branco"));
        produtos.add(new Produto("Tablet", 450.00, "Azul"));
        produtos.add(new Produto("Balança", 250.00, "Preto"));

        System.out.println("--------------------------------------------------------------------------------");
        produtos.sort(new MyComparator());
        System.out.println(" Nesse ponto Criamos uma classe que implemta comparator e ordena pelo nome ");
        System.out.println("");

       for (Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" Nesse ponto vamos implemtar comparator direto na classe program,");
        System.out.println(" mas o critério de ordenação da lista agora é o preço ");
        System.out.println("");

        Comparator<Produto> comparator = new Comparator<Produto>() {
            @Override
            public int compare(Produto produto1, Produto produto2) {
                return produto1.getPreco().compareTo(produto2.getPreco());
            }
        };

        produtos.sort(comparator);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" Nesse ponto vamos implemtar comparator utilizando expressão lambda,");
        System.out.println(" mas o critério de ordenação da lista agora é a cor ");
        System.out.println("");

        Comparator<Produto> comparatorComLambda = (produto1, produto2) -> produto1.getCor().toUpperCase().compareTo(produto2.getCor().toUpperCase());


        produtos.sort(comparatorComLambda);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" Nesse ponto vamos implemtar comparator utilizando expressão lambda,");
        System.out.println(" para reduzir o excesso de código passamos a expressão lambda como ");
        System.out.println(" argumento da função, mas mantendo o critério de ordenação");
        System.out.println(" pela cor o critério de ordenação da lista agora é a cor ");
        System.out.println("");

        produtos.sort((p1, p2) -> p1.getCor().toUpperCase().compareTo(p2.getCor().toUpperCase()));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("----------------------------------------------------------------------");
    }
}
