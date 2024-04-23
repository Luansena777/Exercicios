package exerciciostreino.Jgerenciadordetarefas.dominio;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefa {
    private List<Task> tasks;

    public GerenciadorDeTarefa() {
        this.tasks = new ArrayList<>();
    }

    public void addTasks(String descricao){
        tasks.add(new Task(descricao));
    }

    public void mostrarTasks(){
        if (tasks.isEmpty()){
            System.out.println("Lista de tarefas vazia");
        }else {
            System.out.println("Tarefas:");
            for (Task task0 : tasks) {
                System.out.println(task0);
            }

        }
    }

    public void marcarComocompletado(int index){
        if (index >= 0 && index < tasks.size()){
            tasks.get(index).markCompleted();
            System.out.println("Tarefa marcada como concluída;");
        }else {
            System.out.println("Índice inválido");
        }
    }

}
