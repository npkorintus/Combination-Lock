// Author: Nick Korintus

/*
public interface Lock
{

	// Default constructor
	// Creates a new Lock object with a combination of 0, 0, 0
	public Lock();


	// Overloaded constructor
	// Creates a new Lock object with a combination of values passed through
	public Lock(int x, int y, int z);


	// Copy constructor
	// Creates a new Lock object from a copy of a previously created one
	public Lock(Lock lock);


	// setX method
	// sets the first number of the combination
	// parameters: x
	// postcondition: The first number of the Lock combination has been set to x
	public void setX(int x);


	// setY method
	// sets the second number of the combination
	// parameters: y
	// post condition: The second number of the Lock combination has been set to y
	public void setY(int y);


	// setZ method
	// sets the third number of the combination
	// parameters: z
	// postcondition: The third number of the Lock combination has been set to z
	public void setZ(int z);


	// alter method
	// changes a new combination using three integers passed through
	// parameters: x, y, z
	// postcondition: The Lock is given a new combination
	public void alter(int x, int y, int z);


	// turn method
	// turns the dial to the three numbers being passed in
	// parameters: num1, num2, num3
	// postcondition: The Lock dial is turned three times
	public void turn(int num1, int num2, int num3);


	// close method
	// sets the lock to locked
	// postcondition: The Lock is locked
	public void close();


	// attempt method
	// trys to unlock the lock with the three numbers passed through
	// calls the turn() method
	// parameters: num1, num2, num3
	public void attempt(int num1, int num2, int num3);


	// inquire method
	// gives the status of the lock whether it is locked or unlocked
	public void inquire();


	// current method
	// returns the number on the dial is being pointed to
	public int current();

}
*/

public class Lock
{
	private int x, y, z;
	private int num1, num2, num3;
	private int pointer;

	private boolean unlocked;
	private boolean key1, key2, key3;

	private int[] dial = {   0,  1,  2,  3,  4,  5,  6,  7,  8,  9,
				10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
				20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
				30, 31, 32, 33, 34, 35, 36, 37, 38, 39 };


	// Default constructor
	public Lock()
	{
		x = 0;
		y = 0;
		z = 0;

		pointer = 0;
	}

	// Overloaded constructor
	public Lock(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;

		pointer = 0;
	}

	// Copy constructor
	public Lock(Lock lock)
	{
		x = lock.x;
		y = lock.y;
		z = lock.z;

		pointer = 0;
	}

	public void setX(int x)
	{
		this.x = x;

	}

	public void setY(int y)
	{
		this.y = y;

	}

	public void setZ(int z)
	{
		this.z = z;

	}

	public void alter(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;

	}

	public void turn(int num1, int num2, int num3)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;

		pointer = current();


		// first turn right
		System.out.print("First number (" + num1 + "): ");
		for (int i = pointer; i <= dial[39]; i++)
		{
			System.out.print(i + " ");
			pointer = i;
		}
		for (int i = 0; i <= num1; i++)
		{
			System.out.print(i + " ");
			pointer = i;

			if (pointer == x)
			key1 = true;
		}


		// turn left
		System.out.print("\nSecond number (" + num2 + "): ");
		for(int i = pointer; i >= dial[0]; i--)
		{
			System.out.print(i + " ");
			//pointer = i;
		}
		for(int i = 39; i >= dial[0]; i--)
		{
			System.out.print(i + " ");
			//pointer = i;
		}
		for(int i = dial[39]; i >= num2; i--)
		{
			System.out.print(i + " ");
			pointer = i;

			if (pointer == y)
			key2 = true;
		}


		// second turn right
		System.out.print("\nThird number (" + num3 + "): ");
		for(int i = pointer; i <= num3; i++)
		{
			System.out.print(i + " ");
			pointer = i;

			if (pointer == z)
			key3 = true;

		}

		System.out.println();

		if(key1 && key2 && key3)
			unlocked = true;
	}

	public void close()
	{
		unlocked = false;
	}

	public void attempt(int num1, int num2, int num3)
	{
		turn(num1, num2, num3);
	}

	public void inquire()
	{
		if(unlocked)
			System.out.println("The lock is unlocked.");
		else
			System.out.println("The lock is locked.");
	}

	public int current()
	{
		return pointer;
	}

	public String toString()
	{
		String str = "";


		return str;
	}
}
