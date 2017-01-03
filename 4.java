import java.util.Scanner;

class project{
  public static void main (String args[]) {
    Scanner bucky = new Scanner(System.in);

    int girls, boys, people;
    girls = 7;
    boys = 3;
    people = girls + boys;
    people = girls * boys;
    people = girls % boys;
    System.out.println(people);
  }
}

class project1{
  public static void main (String args[]){
    Scanner bucky = new Scanner(System.in);
    int tuna, bass, salmon;
    tuna = 6;
    bass = 16;
    salmon = 116;
    ++salmon;
    System.out.println(++salmon);
    System.out.println(salmon++);
    System.out.println(++salmon);
    System.out.println(salmon + 100);
  }
}