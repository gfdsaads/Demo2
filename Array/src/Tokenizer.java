import java.util.StringTokenizer;

public class Tokenizer {
public static void main (String args[])
{
	System.out.println("Using constructor1 -");
	StringTokenizer st1=new StringTokenizer("my name is saranya");
	while(st1.hasMoreTokens())
		System.out.println(st1.nextToken());
	System.out.println("Using constructor2 -");
	StringTokenizer st2=new StringTokenizer("this is miracle");
	while(st2.hasMoreTokens())
		System.out.println(st2.nextToken());
	System.out.println("Using constructor3 -");
	StringTokenizer st3=new StringTokenizer("emp number is 3212");
	while(st3.hasMoreTokens())
	System.out.println(st3.nextToken());
	
			
}
}
