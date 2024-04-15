package minipro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class InfoList {

	public static List <Info> infoList(String filename) {
		 
		List <Info> list = new ArrayList<>();
		
		try (
				Reader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr);
				) {
			String line = "";
			list.clear();
			
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				while (st.hasMoreTokens()) {
					String name = st.nextToken();
					String phone = st.nextToken();
					String hp = st.nextToken();
					
					Info info = new Info (name, phone, hp);
					list.add(info);
				}
			}
			
			br.close();	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}
