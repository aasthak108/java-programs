import java.util.*;

public class Split
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println();
		int i;
		String a[]=new String[100];
		String s[]= scan.nextLine().split(" ");
		for(i =0 ;i < s.length;i++){
		 a[i]= String.parseString(s[i]);
		}
		for(i =0 ;i < s.length;i++)
		 System.out.println(a[i]);
	}
}