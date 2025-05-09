-> collection of similar kind of data in a continuos allocation 
->  in c and c++ we have pointers so definitely elements will be strore in continuos format 
  -> in java we dont have pointers then there is a chance of elements might store in random places 
  ->syntax : datatype [] array_name;
-> primitive and non primitive 
  ->primitive datatypes cant be split or divided ,non primitive datatypes can be splitted or divided .
  ->primitive : int,floor,char 
-> non primitive : strings,all objects created by user.
  ex: class Node{
  int data ;
  Node next;
}
->all the objects will be stored in heap memory;
-> all the references will be stored in stack memory 
->  stack memory having less space compare to heap 


ex:
  import java.util.*;

public class Main {
    public static void main(String[] args) {
      datatype[] array name;
      int a=10;
      int b=12;
      int c=14;
      int d=16;
      
  }
}

all the variables are storing in same datatype 
->instead of creating multiple variables create and array

  ex:
 import java.util.*;

public class Main {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6};
      
      
  }
}


->if we create multiple variables  to get the data by simply printing data variale 
  -> when it comes to array if you want to print data we can print using index values 
  and bydefault indexvalues will start with 0.
  -> in heap memory the values of first element may store in random place 


ex:
class Main{
  public static void main(String[] args){
int[] =arr{1,2,3,4,5};/ /declaration and intialization happened in same line 


-> import java.util.*;

public class Main {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5};
     for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
     }
  }
}


    in array its array name .length and in strings its string name.length();
    
    
    
  
  
