import java.util.Scanner;

class apple{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    greet greetObject = new greet ();
    System.out.println("Enter your name: ");
    String name = input.nextLine();
    greetObject.simpleMessage(name);
  }
}
class greet {
  public void simpleMessage(String name){
    System.out.println("Hello " + name);
  }
}
class pear {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    girlfriend girlObject = new girlfriend("Claire");
    girlfriend girlObject1 = new girlfriend("Kasia");
    // System.out.println("Enter the name of your friend:");
    // String temp = input.nextLine();
    // girlObject.setName(temp);
    // girlObject.setName;
    girlObject.saying();
    girlObject1.saying();
  }
}
class girlfriend {
  private String girlName;

  public girlfriend(String name){
    girlName = name;
  }

  public void setName(String name){
    girlName=name;
  }
  public String getName(){
    return girlName;
  }
  public void saying(){
    System.out.printf("Your friend's name is %s\n", getName());
  }
}
