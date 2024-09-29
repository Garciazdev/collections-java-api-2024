package aplicacaoExercicioCompras;

public class Item {
    private String nome;
    private double valor;
    private int quant;


    public Item(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quant = quantidade;
    }
    public String getNome(){
        return nome;
    }
    public double getValor(){
        return valor;
    }

    public int getQuantidade(){
        return quant;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quant +
                '}';
    }
}

