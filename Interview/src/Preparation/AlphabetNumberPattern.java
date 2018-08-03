package Preparation;

public class AlphabetNumberPattern {

	public static void main(String[] args) {
		
		
		char c ='A';
		char lowercaseletter = Character.toLowerCase(c);
		
		
		
		//System.out.println(AscIIValue);
		
		for (lowercaseletter='a';lowercaseletter<='z';lowercaseletter++)
		{
			int AscIIValue = lowercaseletter-96;
			System.out.print(c+""+AscIIValue+" ");	
			c++;
		}
		
		
		

	}

}
