import java.util.LinkedList;
import java.util.Queue;

public class FilaCarlos {
    public static void main(String[] args) {
        Queue<String> filaAlunos = new LinkedList<>();

        filaAlunos.add("Ana");
        filaAlunos.add("Bruno");
        filaAlunos.add("Carlos");

        System.out.println("Fila de alunos: " + filaAlunos);

        String removido = filaAlunos.poll();
        System.out.println("Aluno removido da fila: " + removido);
        System.out.println("Fila após remoção: " + filaAlunos);

        filaAlunos.add("Diana");
        filaAlunos.add("Eduardo");

        System.out.println("Fila após adicionar mais dois alunos: " + filaAlunos);
    }
}
