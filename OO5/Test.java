package OO5;

//impport MyTime;
public class Test {    
      public static void main(String[] args) {        
          MyTime a = new MyTime(9, 30, 35);        
          MyTime b = a;
          System.out.println("b = " + b.getHour() + ": " + b.getMinute() + ": " + b.getSecond());
          
          b = new MyTime(a);
          System.out.println("a = " + a.getHour() + ": " + a.getMinute() + ": " + a.getSecond());   
          System.out.println("b = " + b.getHour() + ": " + b.getMinute() + ": " + b.getSecond());
      }
   } 
