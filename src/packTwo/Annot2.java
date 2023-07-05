package packTwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {

	
	@BeforeSuite
	public void installsoftware()
	{
		System.out.println("I am the First");
		System.out.println("I am the Second");
		System.out.println("I am the Third");
		System.out.println("I am the Fourth");
		
		System.out.println("I am the Tenth");
		System.out.println("I am the Tewleth");
		System.out.println("I am the Thirteen");
	}
	
	@Test
	public void software()
	{
		System.out.println("I am the Test");
	}
	@AfterSuite
	public void deinstallsoftware()
	{
		System.out.println("I am the Last");
	}
	
}
