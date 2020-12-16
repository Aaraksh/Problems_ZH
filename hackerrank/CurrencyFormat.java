package hackerrank;

import java.math.BigDecimal;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat
{

	public String getIndianCurrencyFormat(String amount) {
	    StringBuilder stringBuilder = new StringBuilder();
	    char amountArray[] = amount.toCharArray();
	    int a = 0, b = 0;
	    for (int i = amountArray.length - 1; i >= 0; i--) {
	        if (a < 3) {
	            stringBuilder.append(amountArray[i]);
	            a++;
	        } else if (b < 2) {
	            if (b == 0) {
	                stringBuilder.append(",");
	                stringBuilder.append(amountArray[i]);
	                b++;
	            } else {
	                stringBuilder.append(amountArray[i]);
	                b = 0;
	            }
	        }
	    }
	    return stringBuilder.reverse().toString();
	}
	
	public static void main(String[] args) 
	{
		String amount;
		CurrencyFormat cc=new CurrencyFormat();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		amount=sc.next();
		String ss = cc.getIndianCurrencyFormat(amount);
		System.out.println(ss);
		sc.close();
	}

}
