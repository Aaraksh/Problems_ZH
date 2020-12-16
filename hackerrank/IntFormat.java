package hackerrank;

import java.util.Scanner;

public class IntFormat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.print(s1);
                String str=String.format("%03d", x);
                System.out.println(str);
               
            }
        
            System.out.println("================================");

    }
}



