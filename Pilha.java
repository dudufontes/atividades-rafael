import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> linguagens = new Stack<>();

        linguagens.push("Java");
        linguagens.push("Python");
        linguagens.push("C++");

        System.out.println("Pilha de linguagens de programação: " + linguagens);

        String removido = linguagens.pop();
        System.out.println("Elemento removido do topo: " + removido);
        System.out.println("Pilha após remoção: " + linguagens);

        linguagens.push("JavaScript");
        linguagens.push("Go");

        System.out.println("Pilha após adicionar mais duas linguagens: " + linguagens);
    }
}
