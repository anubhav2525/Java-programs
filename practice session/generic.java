// Generics 


public class generic
{
	public static <E> void array(E[] input)
	{
		for(E element:input)
		{
			System.out.printf("%s",element);
			System.out.println();
		}
	}
	public static void main(String []a)
	{
		Integer [] intarray={1,2,3,4};
		Double [] doublearray={1.2,2.5,3.5};
		array(intarray);
		array(doublearray);
	}
}