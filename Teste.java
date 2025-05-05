/*
Diego Estevão Lopes de Queiroz - 10419038
Ricardo Andre Lopes Ikeda - 10390256
Vinicius Gutierrez Gomes - 10425609
*/
public class Teste {
    public static void main(String[] args) {
        // Teste com Integer
        LinkedList<Integer> listaInteiros = new LinkedList<>();
        listaInteiros.adicionar(3);
        listaInteiros.adicionar(1);
        listaInteiros.adicionar(2);
        System.out.println("Lista original (Integer): " + listaInteiros);
        System.out.println("Lista duplicada (Integer): " + listaInteiros.duplicarValores());

        // Teste com String
        LinkedList<String> listaStrings = new LinkedList<>();
        listaStrings.adicionar("A");
        listaStrings.adicionar("B");
        listaStrings.adicionar("C");
        System.out.println("Lista original (String): " + listaStrings);
        System.out.println("Lista duplicada (String): " + listaStrings.duplicarValores());
    }
}