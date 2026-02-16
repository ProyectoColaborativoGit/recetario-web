package postres;

import java.util.ArrayList;
import java.util.List;

public class ListaPostres {

    private List<Postre> postres = new ArrayList<>();

    public ListaPostres(){

        postres.add(new Postre("Flan",3.2,3));
        postres.add(new Postre("Arroz con leche",4.1,5));
        postres.add(new Postre("Helado",2.49,8));

        for (Postre postre : postres) {
            System.out.println(postre);
        }
    }

    

}
