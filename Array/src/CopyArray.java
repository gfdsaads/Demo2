
public class CopyArray {
public static void main(String args[])
{
	char[] copyFrom= {'a','e','f','h','i','h','j','o','p','k'};
	char[] copyTo=new char[7];
	System.arraycopy(copyFrom,2,copyTo,0,7);
	System.out.println(new String(copyTo));
	
}
}
