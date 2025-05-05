/*
Diego Estevão Lopes de Queiroz - 10419038
Ricardo Andre Lopes Ikeda - 10390256
Vinicius Gutierrez Gomes - 10425609
*/
public class LinkedList<T> {
    private Nodo<T> head;

    private static class Nodo<T> {
        T valor;
        Nodo<T> proximo;

        Nodo(T valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    public void adicionar(T valor) {
        if (head == null) {
            head = new Nodo<>(valor);
        } else {
            Nodo<T> atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = new Nodo<>(valor);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> atual = head;
        while (atual != null) {
            sb.append(atual.valor).append(" ");
            atual = atual.proximo;
        }
        return sb.toString().trim();
    }

    public LinkedList<T> duplicarValores() {
        LinkedList<T> duplicada = new LinkedList<>();
        Nodo<T> atual = head;
        while (atual != null) {
            duplicada.adicionar(atual.valor);
            duplicada.adicionar(atual.valor);
            atual = atual.proximo;
        }
        return duplicada;
    }
}