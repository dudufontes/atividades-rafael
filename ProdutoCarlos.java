import java.util.LinkedList;

public class ProdutoCarlos {
    public static void main(String[] args) {
        LinkedList<Produto> lista = new LinkedList<>();

        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Mouse", 80.00);
        Produto p3 = new Produto("Teclado", 150.00);

        lista.addFirst(p1);
        lista.addLast(p2);
        lista.add(1, p3);

        System.out.println("Lista de produtos:");
        for (Produto p : lista) {
            System.out.println(p);
        }

        Produto removido = lista.remove(1);
        System.out.println("\nProduto removido (índice 1): " + removido);

        Produto novoInicio = new Produto("Monitor", 1200.00);
        Produto novoFim = new Produto("Fone de ouvido", 250.00);

        lista.addFirst(novoInicio);
        lista.addLast(novoFim);

        System.out.println("\nLista após adicionar produtos no início e no final:");
        for (Produto p : lista) {
            System.out.println(p);
        }
    }

    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        @Override
        public String toString() {
            return nome + " (R$ " + preco + ")";
        }
    }
}
