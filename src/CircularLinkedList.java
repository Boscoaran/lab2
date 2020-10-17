public class CircularLinkedList<T> implements ListADT{

        private Node<T> last;
        private String descr;
        private int count;

    public CircularLinkedList(String descr){
        this.count = 0;
        this.last = null;
        this.descr = descr;
    }
    
    public void setDescr(String nom) {
        this.descr = nom;
    }

    public String getDescr() {
        return this.descr;
    }

    public T removeFirst() {
        Node<T> aux;
        if (count > 1){
            aux = last.next;
            last.next=last.next.next;
            count--;
            return(aux.data);
        }
        else if (count == 1){
            aux=last;
            last=null;
            count--;
            return(aux.data);
        }
        else {return null;}   
    }

    public T removeLast() {
        if (count<1){
           
        }
        else {return null;}
    }

    public T first() {
        return (last.prev);
    }

    public Node last() {
        return (last);
    }

    public boolean contains(T elem) {
        boolean contains = false;
        LinkedIterator<T> itr = new LinkedIterator<T>(last, last.next);
        while (itr.hasNext()){
            if
        }
        return contains;
    }

    public T find(T elem) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean isEmpty() {
        if (last==null){return(true);}
        else {return true;}
    }

    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public Iterator<T> iterator() {
        
        return null;
    }

    @Override
    public boolean conatins(T elem) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T find(T elem) {
        // TODO Auto-generated method stub
        return null;
    }


  

    @Override
    public Object find(Object elem) {
        // TODO Auto-generated method stub
        return null;
    }
}
