package pac1.exemple.masterdetail.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookModel {

    // An array of sample (BookModel) items.
    public static final List<BookItem> ITEMS = new ArrayList<BookItem>();

    // A map of sample (BookModel) items, by ID.
    public static final Map<String, BookItem> ITEM_MAP = new HashMap<String, BookItem>();


    static {
        // Add 2 sample items.
        addItem(new BookItem(0, "Title1", "Author1", new Date (), "Description1", "HTTP1"));
        addItem(new BookItem(1, "Title2", "Author2", new Date (), "Description2",  "HTTP2"));
    }

    private static void addItem(BookItem item) {
        //ITEMS.add(item);
        //ITEM_MAP.put(item.id, item);
        ITEM_MAP.put(item.identificador.toString(), item);
        ITEMS.add(item);
    }

    public static class BookItem {
        public  Integer identificador;
        public  String Título;
        public  String Autor;
        public  Date fecha_pub;
        public  String Descripción;
        public  String URL_imagen;


        public BookItem(Integer identificador, String Título, String Autor, Date fecha_pub, String Descripción, String URL_imagen) {
            this.identificador = identificador;
            this.Título = Título;
            this.Autor = Autor;
            this.fecha_pub = fecha_pub;
            this.Descripción = Descripción;
            this.URL_imagen = URL_imagen;
        }

        @Override
        public String toString() {
            return Título + "  "  + Autor;
        }
    }
}
