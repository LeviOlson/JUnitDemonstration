package model;

public final class StringManipulator {

	public static String add(String a, String b)
	{
		return a + b;
	}
	
	public static String add(String a, char b)
	{
		return a + b;
	}
		
	public static String makeNotNull(String a)
	{
		if (a == null)
		{
			return "";
		}
		else
		{
			return a;
		}
	}
}
