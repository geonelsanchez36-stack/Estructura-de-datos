public class ArrayList<E> implements ListInterface<E> {
    private Object[] items;
    private int size;
    private int capacity;

    public ArrayList(){
        this.size=0;
        this.capacity=10;
        this.items=new Object[capacity];
    }

    protected void Expand(){
        Object[] auxiliar=new Object[capacity+10];
        System.arraycopy(items,0,auxiliar,0,size);
        capacity+=10;
        items=auxiliar;
    }

    protected boolean isFull(){
        return capacity==size;
    }
    @Override
    public void add(E a) {
        if (isFull()){
            Expand();
        }
        items[size++]=a;
    }

    @Override
    public void add(E a, int index) {
        if (index < size){
            if (isFull()){
                Expand();
            }
            for (int i = size; i >index ; i--) {
                items[i+1]=items[i];
                items[i]=items[i-1];
            }
            items[index]=a;
            size++;
        }
    }

    @Override
    public E remove(int index) {
       if (index < size){
           E auxiliar=(E) items[index];
           for (int i = index; i <size-1 ; i++) {
               items[i]=items[i+1];
           }
           size--;
           return auxiliar;
       }
       return null;
    }

    @Override
    public E get(int index) {
        return (E) items[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        capacity=10;
        items=new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
