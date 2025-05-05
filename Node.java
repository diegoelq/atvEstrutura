/*
Diego Estevão Lopes de Queiroz - 10419038
Ricardo Andre Lopes Ikeda - 10390256
Vinicius Gutierrez Gomes - 10425609
*/
public class Node <E> {
    E elemento;
    Node next;
    Node prev;
    public Node(E elemento) {
    this.elemento = elemento;
     this.next = null;
     this.prev = null;
    }
    public E getElemento(){
    return elemento;
    }
    public void setElemento(E elemento){
    this.elemento = elemento;
    }
    public Node getNext(){
     return next;
     }
    public void setNext(Node no){
    this.next = no;
    }
    }
    