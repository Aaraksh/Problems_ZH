package leet_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MedianArr 
{
	public static double median(int[] nums1, int[] nums2) {
        double sum=0.0;
		List<Integer> lis1=Arrays.stream(nums1).boxed().collect(Collectors.toList());
		List<Integer> lis2=Arrays.stream(nums2).boxed().collect(Collectors.toList());
		ArrayList<Integer> t1=new ArrayList<>();
		t1.addAll(lis1);
		t1.addAll(lis2);
        int n=t1.size();
        Integer a[]=new Integer[n];
        a=t1.toArray(a);
        Arrays.sort(a);
        int l=n/2;
		//Integer[] ar=t1.toArray(new Integer[t1.size()]);
		if(n%2==0)
        {  
            sum=((float)a[l]+a[l-1])/2;
        }
        else
		   sum=a[l];
        return sum;
    }

	public static void main(String[] args) 
	{
		int i,l1,l2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array1: ");
		l1=sc.nextInt();
		int[] a1=new int[l1];
		System.out.println("Enter the elements of array1: ");
		for(i=0;i<l1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter the length of array2: ");
		l2=sc.nextInt();
		int[] a2=new int[l2];
		System.out.println("Enter the elements of array2: ");
		for(i=0;i<l2;i++)
		{
			a2[i]=sc.nextInt();
		}
		
		double ans=median(a1,a2);
		System.out.println(ans);
		sc.close();

	}

}
