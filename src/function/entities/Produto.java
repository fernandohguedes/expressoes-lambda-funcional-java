package function.entities;

public class Produto {

    private String nome;
    private Double preco;
    private String cor;

    public Produto() {
    }

    public Produto(String nome, Double preco, String cor) {
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static String staticUpperCaseName(Produto produto){
        return produto.getNome().toUpperCase();
    }

    public String nonStaticUpperCaseName(){
        return nome = nome.toUpperCase();
    }

    @Override
    public String toString() {
        return "Produto { " + "nome = " + nome + ", preco = " + preco + " cor = " + cor + " }";
    }
}
