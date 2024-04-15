package minipro;

import java.util.Iterator;
import java.util.List;

public class View {

	public static void viewList(List<Info> list) {

		int sun = 1;
		Iterator<Info> it = list.iterator();
		while(it.hasNext()) {
			Info a = it.next();
			System.out.println(sun +". " + a.toString());
			sun++;
		}
		System.out.println();
	}

}
