package minipro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Append {

	public static void appendList(String filename, String name, String phone, String hp) {

		try(
				Writer fw = new FileWriter(filename, true);
				BufferedWriter bw = new BufferedWriter(fw);		
						){
					bw.write("\n" + name + "," + phone + "," + hp);
					bw.flush();
					System.out.println("[등록되었습니다.]");
				} catch (IOException e) {
					e.printStackTrace();
				}
		
	}

}
