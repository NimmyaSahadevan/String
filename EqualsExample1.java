
public class EqualsExample1 
{

	public static void main(String[] args) 
	{
		String s1="facenow";
		String s2="facenow";
		String s3="faceNow";
		String s4="facenxt";
		System.out.println(s1.contentEquals(s2)); //true because content and case are same
		System.out.println(s1.contentEquals(s3)); //false because case is not same
		System.out.println(s1.contentEquals(s4)); //false because content is not same
	}

}
