// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Library l1=new Library();
       l1.addBook("forty rules of love");
        l1.addBook("How to program c");
        l1.addBook("Discrete Structures");
        l1.showBooks();

        l1.isssuebook("Discrete Structures");
        l1.showBooks();
    }
}