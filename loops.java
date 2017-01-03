class loop {
  public static void main(String args[]){
    int counter;
    counter = 1;
    while (counter < 10) {
      System.out.println(counter);
      counter++;
    }
  }
}

class tuna {
  public void simpleMessage(){
    System.out.println("This is another class");
  }
}

class salmon{
  public static void main(String[] args){
    tuna tunaObject = new tuna();
    tunaObject.simpleMessage();
  }
}