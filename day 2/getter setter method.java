import java.util.*;
class Main{
  public static void main(String[] args){
    Student obj=new Student();
    obj.setAge(10);
    int res = obj.getAge();
    System.out.println(res);
    
    obj.setName("smkmk");
    String res1 = obj.getName();
    System.out.println(res1);
    
    
    obj.setIspassedout(true);
    boolean res2 = obj.getIspassedout();
    System.out.println(res2);  
    
    obj.setMarks(67);
    float res3 = obj.getMarks();
    System.out.println(res3);
    
    obj.setErp(123456789);
    long res4=obj.getErp();
    System.out.println(res4);
    
  }
}
   
class Student {
  
     int age;
     String name;
     boolean passedout;
     float marks;
     long ERP;

    void setAge(int age1) {
        this.age = age1;
    }
    int getAge() {
        return age;
    }


    void setName(String name1) {
        this.name = name1;
    }
    String getName() {
        return name;
    }



    void setIspassedout(boolean passed1) {
        this.passedout = passed1;
    }
    boolean getIspassedout() {
        return passedout;
    }


    void setMarks(float marks1) {
        this.marks = marks1;
    }
    float getMarks() {
        return marks;
    }
   
    void setErp(long ERP1) {
        this.ERP = ERP1;
    }
    long getErp() {
        return ERP;
    }
}

