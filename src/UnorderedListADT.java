public interface UnorderedListADT<T> extends ListADT{
   public void addToFront(T elem);
   public void addToRear(T elem);
   public void addAfter(T elem, T target);
}
