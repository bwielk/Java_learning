class condition {
  public static void main(String args[]){
    int test;
    test = 8;

    if (test <= 5 || test >=7){
      System.out.println("FALSE");
    }else{
      System.out.println("TRUE");
    }
  }
}

class condition1 {
  public static void main(String args[]){
    int boy,girl;
    boy = 19;
    girl = 15;

    if (boy < 18 || girl < 19){
      System.out.println("You are too young!");
    }else{
      System.out.println("Welcome!");
    }
  }
}

class condition2 {
  public static void main(String args[]) {
    int age;
    age = 7;

    switch (age) {
      case 1:
      System.out.println("You can crawl");
      break;
      case 2:
      System.out.println("You can talk");
      break;
      case 3:
      System.out.println("Trouble");
      break;
      default: 
      System.out.println("Too old");
      break;
    }
  }
}

