public class MainListaEnlazada{
    static void main() {

        ListaEnlazada<String> lista=new ListaEnlazada<>();

        //Ejemplo de implementacion correcta de LinkedList

        // Agregar elementos
        lista.add("Geonel");
        lista.add("Leonardo");
        lista.add("Jorge");
        lista.add("Edgar");

        // Recorrer la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //Acceder a un elemento que este en el rango
        System.out.println(lista.get(1));

        //Ejemplos de una incorrecta Implementacion

        //Intentar modificar un elemento mietras se recorre la lista
        for (int i = 0; i < lista.size() ; i++) {
            if (lista.equals("Geonel")){
                lista.remove(i);
            }
        }
    }
}