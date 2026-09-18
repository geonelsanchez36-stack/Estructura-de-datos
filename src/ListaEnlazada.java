public class ListaEnlazada<E> implements ListInterface<E> {
    private Nodo<E> cabeza;
    private int size;

    public ListaEnlazada(){
        cabeza=null;
        size=0;
    }


    @Override
    public void add(E a) {
        if (isEmpty()){
            cabeza=new Nodo<E>(a);
        }else {
            Nodo<E> cursor=cabeza;
            Nodo<E> nuevo=new Nodo<E>(a);
            while (cursor.getNext() != null){
                cursor=cursor.getNext();
            }
            cursor.setNext(nuevo);
        }
        size++;
    }

    //Error al eliminar un nodo intermedio sin antes validar que actual.getNext no se null
    public void eleminarMedio(){
        try {
            Nodo<E>actual=cabeza;
            actual.setNext(actual.getNext().getNext());
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

    }

    //Intentar insertar un elemento en una lista que esta vacia
    // se debe verificar primero que la cabeza no sea nul
    public void insertarFinal(E info) {
        try {
            Nodo<E> nuevo = new Nodo<>(info);
            Nodo<E> actual = cabeza;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(nuevo);
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void add(E a, int index) {
        if (index >=0 && index <size){
            if (index==0){
                cabeza=new Nodo<E>(a);
            }else {
                Nodo<E> cursor=cabeza;
                for (int i = 0; i <index-1 ; i++) {
                    cursor=cursor.getNext();
                }
                Nodo<E> nuevo=new Nodo(a);
                nuevo.setNext(cursor.getNext());
                cursor.setNext(nuevo);
            }
            size++;
        }else {
            throw new UnsupportedOperationException("Indice fuera de rango");
        }
    }

    @Override
    public E remove(int index) {
        Nodo<E> cursor=cabeza;
        Nodo<E> temp=null;
        if (index >=0 && index <size){
            if (index==0){
                temp=cabeza;
                cabeza=temp.getNext();
            }else {
                for (int i = 0; i <index-1 ; i++) {
                    cursor=cursor.getNext();
                }
                temp= cursor.getNext();
                cursor.setNext(temp.getNext());
            }
            size--;
            return   temp.getInfo();
        }else {
            throw new UnsupportedOperationException("Indice fuera de rango");
        }
    }

    @Override
    public E get(int index) {
        if (index >=0 && index < size){
            Nodo<E> cursor=cabeza;
            for (int i = 0; i <index ; i++) {
                cursor=cursor.getNext();
            }
            return cursor.getInfo();
        }else {
            throw new UnsupportedOperationException("Indice fuera de rango");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        cabeza=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        if (cabeza==null){
            return true;
        }else {
            return false;
        }
    }
}
