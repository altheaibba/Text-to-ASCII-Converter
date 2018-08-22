import java.util.Arrays;
import java.util.Scanner;

public class ASCII
{	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your sentence: ");
		String s = scan.nextLine();
		
		int [] ASCIIarray = new int [256];
		
		for(int i = 0; i<s.length(); i++)
		{
			int a = (int)s.charAt(i);
			String sentence = Integer.toBinaryString(a);
			
			while(sentence.length()<7)
			{
				sentence = "0" + sentence;
			}
			
			System.out.print(sentence + " ");
			ASCIIarray[a]++;
		}
		
		System.out.println();
		
		for(int i = 0; i<ASCIIarray.length; i++)
		{
			if(ASCIIarray[i]>0)
			{
				System.out.println("'" + (char)i +"' appeared " + ASCIIarray[i] + " times");
			}
		}
	}
	
}


