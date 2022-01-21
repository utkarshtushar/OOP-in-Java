public class Arrays{
  public static void main(String[] args) {

    //1-D Array

    int [] arr1 = new int[5];//OK
    int arr2[]= new int[]{2,4,6,8,9};//OK
    int arr3[]= new int[5]{1,2,3,4,5};//Can't mention size and value together.
    int arr4[]= new int[5];//OK
    int arr5[]={2,3,4,5,6,7};//OK

    int arr[];
    arr[0]=25,arr[1]=30;
    //Error as array has not formed yet(new int[] is missing.)

    arr = new int[5]//Now, OK

    System.out.println("arr4[0]="+arr4[0]);
    //Will not give error.Print 0.


    //2D-Array

    int [][]a = new int[4][5];//OK

    int [][]a=new int[][];//Error
    int [][]a=new int[][5];//Error
    int [][]a=new int[4][];//OK

    int [][]a=new int[][]{{3,4},{5,6},{7,8}};

    int [][]a=new int[4][];
    print a[0][0];//Gives Runtime-Error as a[0] itself is Null.
    print a[0];//print 'null' as it is null.
    print a.length;//print 4
    print a[0].length;//Error


  }
}

//Array is not blank.By default values are 0.
