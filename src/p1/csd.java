package p1;
import java.util.Scanner;
public class csd {
    public static void main(String[] args) {


                int sum = 0;


                for (int i = 0; i < args.length; i++) {
                    try {

                        sum += Integer.parseInt(args[i]);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number: " + args[i]);
                    }
                }

                System.out.println("Sum = " + sum);
            }
        }

