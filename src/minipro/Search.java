package minipro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class Search {

	public static void searchList(List <Info> list, String filename, String searchName) {
		
		try (
				Reader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr);
				) {
			String line = "";
			list.clear();
			int a = 1;
			
			while ((line = br.readLine()) != null) {	
				if (line.contains(searchName)){
					System.out.println(a + "." + line);
				}
				a += 1;
			}
			
			br.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
