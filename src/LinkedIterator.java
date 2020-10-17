import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedIterator<T> implements Iterator<T> {
    private Node<T> nodo;
    private Node<T> last;

    LinkedIterator(Node<T> pLast, Node<T> pFirst){
        nodo = pFirst;
        last = pLast;
    }
    public boolean hasNext() {
       return (nodo.next != last);
    }

    public T next(){
        if (this.hasNext()){
            throw new NoSuchElementException();
        }
        T result = this.nodo.data;
        nodo = nodo.next;
        return result;
    }
}