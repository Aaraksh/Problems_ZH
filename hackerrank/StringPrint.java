package hackerrank;

import java.util.Scanner;
import java.lang.String;
public class StringPrint {

    public static void main(String[] args)
    {
        String s=new String();
    	Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer,Double and String: ");
        int i = scan.nextInt();
        double d=scan.nextDouble();
        //System.out.println("Enter teh String..");
        scan.nextLine();
        s=scan.nextLine();

        // Write your code here.

        System.out.println("OutPut: ");
        System.out.println(s);
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}

