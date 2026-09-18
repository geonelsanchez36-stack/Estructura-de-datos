
public class MainArryList {
    static void main() {
        //Casos de correcta implementacion de ArrysList
        ArrayList<String> lista=new ArrayList<>();
        lista.add("Geonel");
        lista.add("Leonardo");
        lista.add("Edgar");
        System.out.println(lista.get(1));

        for (int i = 0; i <lista.size() ; i++) {
            System.out.println(lista.get(i));
        }
        lista.remove(1);

        //Casos de una incorrecta implementacion de ArraysList

        //Intentar obtener un elemento que se encuentra fuera del tamaño de la lista
        try {
            System.out.println(lista.get(5));

        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        //Eliminar un elemento que no existe
        try {
            lista.remove(5);
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        //Modificar misentras se itera
        try {
            for (int i = 0; i <lista.size() ; i++) {
                if (lista.equals("Geonel")){
                    lista.remove(i);
                }
            }
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }


    }
}
