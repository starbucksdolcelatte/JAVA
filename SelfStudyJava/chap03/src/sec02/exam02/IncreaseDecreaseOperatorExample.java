package sec02.exam02;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.25
*/

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args)
	{ 
		int x = 10;
		int y = 20;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		z = x++; 	// 1. z = x   2. x++
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		z = ++x; 	// 1. ++x     2. z = x
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		z = ++x + y++; // 1. ++x  2. z = x+y    3. y++
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
