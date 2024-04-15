package minipro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Delete {

	public static void deleteList(int deleteNum, List<Info> list, String filename) {
		if (deleteNum >= 1 && deleteNum <= list.size()) {
	        list.remove(deleteNum - 1);
	        try (
	            Writer fw = new FileWriter(filename, false);
	            BufferedWriter bw = new BufferedWriter(fw);
	        ) {
	            for (Info info : list) {
	                bw.write(info.getName() + "," + info.getPhone() + "," + info.getHp() + "\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        System.out.println("[삭제되었습니다.]");
	    } else {
	        System.out.println("유효하지 않은 번호입니다.");
	    }
	}
}
