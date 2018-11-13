
public class Average {
public static void main(String args[])
{
	int[]numbers= {4,-5,3,5,2,8,7,9};
	int sum=0;
	double Average;
	for (int number:numbers)
	sum += number;

int arraylength=numbers.length;
Average=((double)sum / (double)arraylength);
System.out.println("sum=" +sum);
System.out.println("Average="  +Average);
	
		
	}
}

