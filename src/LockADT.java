// Author: Nick Korintus


public interface LockADT
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
