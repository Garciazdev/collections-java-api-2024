package aplicacaoExercicioCompras;
import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double valor, int quantidade) {
        Item item = new Item(nome, valor, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }else{
        System.out.println("A lista está vazia!");
    }
}

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item  : itemList) {
                double valorItem = item.getValor() * item.getQuantidade() ;
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void exibiritens() {
       if (!itemList.isEmpty()) {
           System.out.println(this.itemList);
       }else{
           System.out.println("A lista esta vazia!");
       }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Banana", 8.50, 2);
        carrinhoDeCompras.adicionarItem("Pudim",5.00,2);

        carrinhoDeCompras.exibiritens();

        carrinhoDeCompras.removerItem("Pudim");

        carrinhoDeCompras.exibiritens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());



    }
}
//    teste

