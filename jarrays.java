import java.util.Random;
class arrayex{
  public static void main(String[] args){
    int bucky[]=new int[10];//the value in the second pair of bracets defines the number of elements within the bucky array
    bucky[0] = 87;
    bucky[1] = 21;
    bucky[2] = 43;
    bucky[3] = 12;
    bucky[9] = 1;
    System.out.println(bucky);
    System.out.println(bucky[1]);
  }
}

class arrayex2{
  public static void main(String[] args){
    int bucky[] = {1,23,54,221,122,45};
    System.out.println(bucky);
  }
}

class table{
  public static void main(String[] args){
    System.out.println("Index\tValue");
    int bucky[]={21,23,45,66,3,21};
    for(int counter=0;counter<bucky.length;counter++)
      System.out.println(counter + "\t" + bucky[counter]);
  }
}

class sum{
  public static void main(String[] args) {
    int bucky[] = {21,90,34,11,24,63, 43,35};
    int sum=0;
    for(int counter=0; counter< bucky.length; counter++){
      sum+=bucky[counter];
    }
    System.out.println("The sum is..."+sum);}
}


class dice{
  public static void main(String[] args){
    Random rand = new Random();
    int freq[] = new int[7];//7 defines the number of elements within the array we are "rolling" from => 0,1,2,3,4,5,6

    for(int roll=1; roll<1001; roll+=1){//roll = counter
      ++freq[1+rand.nextInt(6)];//"++" - counts indexes adding 1 each time the dice rolls/[]- the range between 0-5 changes to the range between 1-6 because of adding 1
    }
    System.out.println("Face\tFrequency");

    for(int face=1;face<freq.length;face++){//creates the table with the value of faces starting from 1
      System.out.println(face+"\t"+freq[face]);//outputs the value of each array index
    }
  }
}

class for_statement{
  public static void main(String[] args){
    int bucky[]={2,3,4,5,6,7,9};
    int total = 0;

    for(int x: bucky){
      total+=x;
    }
    System.out.println(total);
  }
}

class ar_met{
  public static void main(String[] args){
    int bucky[] = {1,2,3,4,5,6};
    change(bucky);

    for(int y:bucky)
      System.out.println(y);
  }
  public static void change(int x[]){
    for(int counter=0;counter<x.length;counter++)
      x[counter]+=5;
  }
}


