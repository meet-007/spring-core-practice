package com.spring.practice.practicenew;

/**
 * Hello world!
 *
 */
abstract class p{
	abstract void display();
}
class q extends p{

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("from q");
	}

}
public class App
{
	public static void main( final String[] args )
	{
		final p p1 = new q();
		p1.display();
	}
}
