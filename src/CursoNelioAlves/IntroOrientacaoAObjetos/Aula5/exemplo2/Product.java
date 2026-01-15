package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.exemplo2;

public class Product {
    private String nome;
    private double preco;

    public Product(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", preço=" + preco +
                '}';
    }
}
