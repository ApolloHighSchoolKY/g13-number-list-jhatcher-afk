// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class Lab16b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		System.out.println(test);
		System.out.println("odd count = "+test.countOdds());
		System.out.println("even count = "+test.countEvens());
		System.out.println("perfect count = "+test.countPerfects()+"\n\n");


		//add more test cases
		NumberAnalyzer testTwo = new NumberAnalyzer("6 7 12 4 23 78 45 63");
		System.out.println(testTwo);
		System.out.println("odd count = "+testTwo.countOdds());
		System.out.println("even count = "+testTwo.countEvens());
		System.out.println("perfect count = "+testTwo.countPerfects()+"\n\n");

		NumberAnalyzer testThree = new NumberAnalyzer("6 14 12 76 11 44 86 68");
		System.out.println(test);
		System.out.println("odd count = "+testThree.countOdds());
		System.out.println("even count = "+testThree.countEvens());
		System.out.println("perfect count = "+testThree.countPerfects()+"\n\n");



	}
}