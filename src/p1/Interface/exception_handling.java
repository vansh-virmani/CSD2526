package p1.Interface;

public class exception_handling {
    public static void main(String[] args){
        System.out.print("Hello");

        System.out.print("Hi");
        System.out.print("Hello");
        System.out.print("Hello");
       try{
           System.out.println(200/0);
       }
       catch(Exception e){
     System.out.println( e.toString());
       }

        System.out.print("Hello");
        System.out.print("Hello");
    }
}
