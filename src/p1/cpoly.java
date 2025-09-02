package p1;
//static or early binding compile time polymorphism
public class cpoly {
        public static void main(String[] args){
            System.out.println("A");

    }
   // q for interviews
    //can constructor or public statc line be overloaded   YES is answer
    // can method datatype be int,char or it must be void? it must only be void else error
    void m1(int a){ //method
            System.out.println("B");
    }
    void m1(int a,String b){ //method
        System.out.println("B");
    }


}
