// Author: Nick Korintus


import java.util.*;


public class LockDemo
{
	public static void main(String[] args)
	{
		int choice, num1, num2, num3;

		Lock lock = new Lock();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("====\n");
		System.out.println("1: Set lock combination");
		System.out.println("2: Close lock");
		System.out.println("3: Check status");
		System.out.println("4: Attempt to open lock");
		System.out.println("5: Check which number dial is on");
		System.out.println("6: Exit program\n");
		System.out.print("Please make a selection: ");
		choice = keyboard.nextInt();

		do
		{
			if(choice == 1)
			{
				System.out.print("Enter 3 numbers to set new combination: ");

				num1 = keyboard.nextInt();
				num2 = keyboard.nextInt();
				num3 = keyboard.nextInt();

				lock.alter(num1, num2, num3);

				System.out.print("Make another selection: ");
				choice = keyboard.nextInt();
			}

			else if(choice == 2)
			{
				lock.close();
				System.out.println("The lock is now locked.");
				System.out.print("Make another selection: ");
				choice = keyboard.nextInt();
			}

			else if(choice == 3)
			{
				lock.inquire();
				System.out.print("Make another selection: ");
				choice = keyboard.nextInt();
			}

			else if(choice == 4)
			{
				System.out.println("Enter 3 numbers to attempt to open lock: ");

				num1 = keyboard.nextInt();
				num2 = keyboard.nextInt();
				num3 = keyboard.nextInt();

				lock.attempt(num1, num2, num3);

				System.out.print("Make another selection: ");
				choice = keyboard.nextInt();
			}

			else if(choice == 5)
			{
				System.out.println("The dial is currently pointing to " + lock.current());
				System.out.print("Make another selection: ");
				choice = keyboard.nextInt();
			}

			else if(choice == 6)
				return;

			else
			{
				System.out.print("Invalid Selection, please re-enter: ");
				choice = keyboard.nextInt();
			}

		}while(choice != 6);
	}
}
