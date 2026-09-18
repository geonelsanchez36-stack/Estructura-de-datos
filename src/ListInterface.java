public interface ListInterface <E> {
    void add( E a);

    void add(E a,int index);

    E remove (int index);

    E get( int index);

    int size();

    void clear();

    boolean isEmpty();
}
