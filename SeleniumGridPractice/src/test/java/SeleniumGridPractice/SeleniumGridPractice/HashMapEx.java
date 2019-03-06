package SeleniumGridPractice.SeleniumGridPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;

public class HashMapEx {
	
	public static void hashMapForEachLoop()
	{
		WebDriver driver;
		//driver.manage().window().maximize();
		HashMap<String,Integer> hMap=new HashMap<String, Integer>();
		hMap.put("Rasheed",12);
		hMap.put("Ahmed",13);
		hMap.put("Sheik",14);
		hMap.put("Rashi",15);
		for(Entry<String,Integer> entry:hMap.entrySet())
		{
			System.out.println("Key is  "+entry.getKey() +"value is"+ entry.getValue());
			
		}
		
		
		//Iterator< String> itr
	}
	
	
public static void main(String args[])
{

	HashMapEx.hashMapForEachLoop();

}

}
