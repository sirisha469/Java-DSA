package LinkedList;

import java.util.LinkedList;

class Book{
  int id;
  String name;

  Book(int id,String name){
    this.id = id;
    this.name = name;
  }

  public static void main(String[] args) {
    LinkedList<Book> ll = new LinkedList<>();
    Book b1 = new Book(121, "Let us C");
    Book b2 = new Book(131, "Java compiler");

    ll.add(b1);
    ll.add(b2);

    for(Book b:ll){
      System.out.println("Book id: "+b.id);
      System.out.println("Book name: "+b.name);
    }
  }
}