# Repositório destinado a estudos de:
 
 - Expressões lambda; 
 - Programação funcional com a linguagem JAVA;




# Programação funcional

- Conceito
- O que é? 

Função Map:
- A função map é uma função que aplica uma função a todos elementos de uma stream, uma stream é uma sequencia de dados;
- A função map trabalha sempre a partir de uma sequência de dados;  

List para stream: .stream()
Stream para List: .collect(Collectors.toList())
````
Exemplo de aplicação do map, criamos uma função chamada UppercaseName, para retornar os nomes dos produtos
para maiusculo, e no final adicionamos a uma lista. exemplo da aplicação completa no projeto.

List<String> names = produtos.stream().map(new UpperCaseName()).collect(Collectors.toList());


````

Stream


# Expressões Lambda

- Conceito
- O que é? 
- Exemplos

- expressão lambda com apenas uma linha dispensa a utilização de chaves para definir o escopo da função.


