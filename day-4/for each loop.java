->in collections we dont have index values in those situations we have to use for each loop 
  ->example  
 import java.util.*;

public class Main {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    
    for(int i: arr){
      System.out.println(i);
    }
  }
}
