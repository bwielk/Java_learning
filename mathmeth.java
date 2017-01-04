import java.util.Random;

class tomato{
  public static void main(String[] args){
    System.out.println(Math.abs(-26.7)); //absolute value
    System.out.println(Math.floor(7.8)); //rounds down
    System.out.println(Math.max(6.7,2.1));//takes multiple params in a signle method - just this one and takes only two params!
    System.out.println(Math.min(8.5,2.5));//checks which of two params has lesser value
    System.out.println(Math.pow(5,3));//power method - read as 5 to the power of 3
    System.out.println(Math.sqrt(25));//the opposite of the above
  }
}


class randomnum{
  public static void main(String[] args){
    Random dice = new Random();
    int number;
    for (int counter = 1; counter<=10; counter+=1){
      number = 1+dice.nextInt(6);
      System.out.println(number + " ");
    }
  }
}