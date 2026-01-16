// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalyzer
{
	//Instance Variable/Collection
	private ArrayList<Number> list;

	//Default Constructor
	public NumberAnalyzer()
	{
		//Just make the ArrayList exist.
	}

	//Modified Constructor
	public NumberAnalyzer(String numbers)
	{
		//Make the list exist first
		list = new ArrayList<Number>();
		//Filter the parameter through to the set method
		setList(numbers);
	}

	//Methods
	public void setList(String numbers)
	{
		//Clear the list
		list.clear();

		//Create a scanner to chop up the string of numbers
		Scanner chopper = new Scanner(numbers);

		//Chop up the string
		while(chopper.hasNextInt())
		{
			list.add(new Number(chopper.nextInt()));

		}

	}

	public int countOdds()
	{
      	int oddCount=0;
		//For each Number we will refer to as item in the Arraylist called list
		for(Number item: list)
		{
			//method call to isOdd if item is odd
			if(item.isOdd())
			{
				//if true count increases by 1
				oddCount++;
			}
		}

      	return oddCount;
	}

	public int countEvens()
	{
      	int evenCount=0;
		//For each Number we will refer to as item in the Arraylist called list
		for(Number item: list)
		{
			//method call to isOdd if item is not odd
			if(!item.isOdd())
			{
				//if true count increases by 1
				evenCount++;
			}
		}

      	return evenCount;

      	/*
      	 *Other option - If it's not odd, it's even
      	 *
      	 *return list.size()-countOdds();
      	 *
      	 */
	}

	public int countPerfects()
	{
      	int perfectCount=0;
		//For each Number we will refer to as item in the Arraylist called list
		for(Number item: list)
		{
			//method call to isPerfect if item is perfect
			if(item.isPerfect())
			{
				//if true count increases by 1
				perfectCount++;
			}
		}

      	return perfectCount;
	}

	public String toString( )
	{
		return "" + list;
	}
}