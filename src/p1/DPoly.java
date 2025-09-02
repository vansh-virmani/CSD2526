package p1;

 class A1 {
    void m1(){
        System.out.println("coming from A1");

    }
}
class b1 extends A1{
    @Override
    void m1(){
        System.out.println("coming fo");}}


    public class DPoly{
     public static void main(String[] args){
         System.out.println("X");
         A1 b2 =new b1();
         b2.m1();
     }
    }

