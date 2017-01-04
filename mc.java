class apples{
  public static void main(String[] args) {
    int age;
    age = 60;
    if (age < 50){
      System.out.println("You are young!");
    }else{
      System.out.println("You are old!");
      if(age > 75){
        System.out.println("You are really old!");
      }else{
        System.out.println("You are just old :)");
      }
    }
  }
}

class pears{
  public static void main(String[] args) {
    int age;
    age = 45;
    if(age > 60){
      System.out.println("You are a senior citizen");
    }else if(age >=50 && age < 60){
      System.out.println("You are in your 50s");
    }else if(age >=40 && age <50){
      System.out.println("You are in your 40s");
    }
  }
}

class pineapples{
  public static void main(String[] args) {
    int age;
    age = 21;

    System.out.println(age>50? "You are old" : "You are young");
  }
}