package function;


import function.entities.Produto;
import function.services.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramFunction {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("TV", 900.00, "Amarelo"));
        produtos.add(new Produto("Notebook", 1200.00, "Branco"));
        produtos.add(new Produto("Tablet", 450.00, "Azul"));
        produtos.add(new Produto("Balança", 250.00, "Preto"));
        produtos.add(new Produto("Balança velha", 50.00, "Preto"));

        System.out.println("----------------------------------------------------");
        System.out.println("implemtanção da interface function");

        List<String> nomes = produtos.stream().map(new UpperCaseName()).collect(Collectors.toList());
        nomes.forEach(System.out::println);

        System.out.println("----------------------------------------------------");
        System.out.println("implementação através de referencia de método estático");

        List<String> nomes2 = produtos.stream().map(Produto::staticUpperCaseName).collect(Collectors.toList());
        nomes2.forEach(System.out::println);

        System.out.println("----------------------------------------------------");
        System.out.println("implementação através de referencia de método não estático");

        List<String> nomes3 = produtos.stream().map(Produto::nonStaticUpperCaseName).collect(Collectors.toList());
        nomes3.forEach(System.out::println);

        System.out.println("----------------------------------------------------");
        System.out.println("implementação através expressão lambda declarada");

        Function<Produto, String> function = produto -> produto.getNome().toUpperCase();
        List<String> nomes4 = produtos.stream().map(function).collect(Collectors.toList());
        nomes4.forEach(System.out::println);

        System.out.println("----------------------------------------------------");
        System.out.println("implementação através expressão lambda inline");

        List<String> nomes5 = produtos.stream().map(produto -> produto.getNome().toUpperCase()).collect(Collectors.toList());
        nomes5.forEach(System.out::println);

        System.out.println("----------------------------------------------------");

    }
}
