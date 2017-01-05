class mdim{
  public static void main(String[] args) {
    int array1[][]={{1,2,3,4,5},{11,12,13,14,15}};
    int array2[][]={{21,22,23,24,25},{31,32,33,34,35}};

    System.out.println("This is the first array:");
    display(array1);

    System.out.println("This is the second array:");
    display(array2);
  }

  public static void display(int x[][]){
    for(int row=0;row<x.length;row++){
      for(int column=0;column<x[row].length;column++){
        System.out.print(x[row][column]+"\t");
      }
      System.out.println();
    }
  }
}