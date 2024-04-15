package minipro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

	private static String rootPath = System.getProperty("user.dir") + "\\";
	private static String filename = rootPath + "PhoneDB.txt";
	
	public static void main(String[] args) {
		
		List <Info> list = new ArrayList<>();
		
		System.out.println("*************************************************");
		System.out.println("*		전화번호 관리 프로그램		*");
		System.out.println("*************************************************");
		
		Scanner sc = new Scanner(System.in);
		
		boolean q = true;
		String str = "1. 리스트	2. 등록	3. 삭제	4. 검색	5.종료\n-------------------------------------------"
				+ "------\n>메뉴번호: ";
		
		while (q) {

			System.out.print(str);
			
			list = InfoList.infoList(filename);
			
			int num = sc.nextInt();
			
			switch (num) {
			
			case 1:
				System.out.println("<1. 리스트>");
				View.viewList(list);
				break;
				
			case 2:
				System.out.println("<2. 등록>");
				System.out.print(">이름: ");
				String name = sc.next();
				
				System.out.print(">휴대전화: ");
				String phone = sc.next();
				
				System.out.print(">회사전화: ");
				String hp = sc.next();
				Append.appendList(filename, name, phone, hp);
				break;
				
			case 3:
				System.out.println("<3. 삭제>");
				System.out.print(">번호: ");
				
				int deleteNum = sc.nextInt();
				 
				Delete.deleteList(deleteNum, list, filename);
				break;
				
			case 4:
				System.out.println("<4. 검색>");
				System.out.print(">이름: ");
				String searchName = sc.next();

				Search.searchList(list, filename, searchName);
				
				break;
				
			case 5: q = false;
				System.out.println("*************************************************");
				System.out.println("*			감사합니다			*");
				System.out.println("*************************************************");
				break;
			
			default :
				System.out.println("[다시입력해주세요]\n");
				break;
				
			}
		}
		
		sc.close();
	}
	
}
