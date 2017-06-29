package musicpreference;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		/*File file = new File("MusicSurveyData2017S.csv");
	        Scanner scanner = new Scanner(file);
	        Scanner line = null;
	        ArrayList<String> temp;
	        int column;
	        int inner;
	        int row = 0;
	        boolean proceed;
	        String hobby;
	        
	        
	        temp = new ArrayList<String>();
	        
	        temp.add(scanner.nextLine());
	        System.out.println(temp.get(0));
	        
	        temp.add(scanner.nextLine());
	        System.out.println(temp.get(1));
	        
	        temp.add(scanner.nextLine());
	        System.out.println(temp.get(2));
	        
	        temp.add(scanner.nextLine());
	        System.out.println(temp.get(3));
	        
	        
	        line = new Scanner(temp.get(3));
	        line.useDelimiter(",");
	        System.out.println(line.next());
	        System.out.println(line.next());
	        System.out.println(line.next());
	        System.out.println(line.next());
	        System.out.println(line.next());*/
		
		 File file = new File("SongList2017S.csv");
	        Scanner scanner = new Scanner(file);
	        Scanner line = null;
	        boolean proceed;
	        int column = 0;
	        System.out.println(scanner.nextLine());
	        System.out.println(scanner.nextLine());
	        
	        line = new Scanner(scanner.nextLine());
	        line.useDelimiter(",");
	        System.out.println(line.next());
	        System.out.println(line.next());
	        System.out.println(line.next());
	        System.out.println(line.next());
	        
	      
	        scanner.close();
	}

}
