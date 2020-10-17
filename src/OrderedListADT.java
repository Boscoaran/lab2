public interface OrderedListADT<T> extends ListADT {
   public void add(T elem);
   public void merge(OrderedCircularLinkedList lista);
}
