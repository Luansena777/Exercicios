package exerciciostreino.Jgerenciadordetarefas.dominio;

public class Task {
    private String descricao;
    private boolean completado;

    public Task(String descricao) {
        this.descricao = descricao;
        this.completado = false;
    }

    @Override
    public String toString() {
        return (completado ? "[X]" : "[]") + descricao;
    }

    public void markCompleted() {
        completado = true;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
