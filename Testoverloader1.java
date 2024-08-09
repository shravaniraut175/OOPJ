import java.util.*;
import java.io.*;
class Testoverloader1
{
	public static void main(String args[])
	{
		System.out.println(Adder.add(10,10));
		System.out.println(Adder.add(12.5,12.5));
	}
}

class Adder
{
	static int add(int a, int b)
	{
		return a + b;
	}
	static double add(double a, double b)
	{
		return a + b;
	}
}
	