import java.util.ArrayList;
public class Library {
    String[] book;
    int i=0;

    Library(){
        this.book=new String[100];
    }

 void addBook(String books){
     this.book[i]=books;
     i++;
     System.out.println(books + " is added");

    }
    void showBooks(){
        int j=0;
        System.out.println("...........show available books:..........");

        for(j=0;j<=i;j++){
            if(this.book[j]==null){
              break;
            }

            System.out.println("*"+this.book[j]);
        }
    }
    void isssuebook(String newbook){

        for(int j=0;j<=i;j++){

           if(this.book[j]!=null&&this.book[j].equals(newbook)){

               System.out.println(newbook+" is issued...");
               this.book[j]=null;
           }

        }
    }
    void returnbook(String newbook){
        for(int j=0;j<=this.book.length;j++){

            if(newbook==this.book[j]){
                System.out.println(newbook+" is returned...");
//              this.book[j]=this.book[j]-newbook;
            }

        }
    }




}
