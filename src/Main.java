import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book("İstenmeyenler", 308,"Lisa McMann",2011));
        bookList.add(new Book("Yaban Muzu", 165,"José Mauro De Vasconcelos",1969));
        bookList.add(new Book("Harry Potter ve Sırlar Odası",314,"J. K. Rowling",1998));
        bookList.add(new Book("Martıya Uçmayı Öğreten Kedi",125,"Luis Sepulveda",1999));
        bookList.add(new Book("Fatih-Harbiye",159,"Peyami Safa",2005));
        bookList.add(new Book("Eski Değirmendeki Sır",149,"Mustafa Hakkı Kurt",2020));
        bookList.add(new Book("Serçekuş", 96, "Cahit Zarifoğlu", 2016));
        bookList.add(new Book("Ay'a Yolculuk",80,"Jules Verne", 2017));
        bookList.add(new Book("Eve Dönüş", 86, "Eric Walters", 2020));
        bookList.add(new Book("Parbat Dağı'nın Esrarı", 142,"Gülten Dayıoğlu",2021));

        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getName(), book.getAuthorName()));

        for (String i : bookMap.keySet()) {
            System.out.println(i + " - " + bookMap.get(i));
        }
        System.out.println("\n");

        List<Book> filterBook = bookList.stream().filter(book -> book.getPageNo() > 300).collect(Collectors.toList());
        filterBook.stream().forEach(b -> System.out.println("Book Name: " + b.getName() + " " +
                "Page Number: " + b.getPageNo() + " " +
                "Author: " + b.getAuthorName() + " " +
                "Year: " + b.getYear()));
        System.out.println("----------------------------------------------------------------------");


        long count = filterBook.stream().count();
        System.out.println("Number of books: " + count);
    }
}