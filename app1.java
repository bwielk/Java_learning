import java.util.Scanner;


class apples{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int total, grade, average, counter;
    total = 0;
    counter = 0;

    while(counter < 10){
      System.out.println("Enter the grade: ");
      grade = input.nextInt();
      total += grade;
      counter += 1;
    }
    average = total/10;
    System.out.println("Your average is :" + average);
  }
}

class potato{
  public static void main(String[] args){
    for (int counter=1; counter<=100; counter +=10){
      System.out.println(counter);
    }
  }
}

class subs{
  public static void main(String[] args){
    double amount;
    double principle = 10000;
    double rate = 0.01;

    for(int day=1; day<=20; day+=1){
      amount = principle*Math.pow(1 + rate, day);
      System.out.println(day + "  =>  " + amount);
    }
  }
}

class doloop{
  public static void main(String[] args){
    int counter = 0;
    do{
      System.out.println(counter);
      counter+=1;

    }while(counter < 10);
  }
}


