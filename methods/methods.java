//example 1

import java.util.*;
public class Main{
  public static void printing(){
    System.out.println("mesg printted ");
  }
  public static void main(String[] args){
    printing();
  }
}



//example 2
import java.util.*;

public class Main {
    public static void hello() {
        System.out.println("helloo all");
    }

    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println(sum); 
        return sum;
    }

    public static void main(String[] args) {
        hello();
        add(3, 4);
    }
}
