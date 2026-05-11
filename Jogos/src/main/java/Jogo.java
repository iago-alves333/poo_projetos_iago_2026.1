import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Jogo {
    private String id;
    private String nome;
    private double preco;
    private String categoria;

    public Jogo() {
        this.id = gerarIdAleatorio();
    }

    public Jogo(String nome, double preco, String categoria) {
        this.id = gerarIdAleatorio();
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    private String gerarIdAleatorio() {
        return UUID.randomUUID().toString().substring(0, 8);
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Jogo [ID: " + id + ", Nome: " + nome + ", Preço: R$" + preco + ", Categoria: " + categoria + "]";
    }
}