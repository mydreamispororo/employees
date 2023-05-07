package emp;

import java.util.Scanner;

import emp.service.EmpService;
import emp.views.EmpView;

public class Emp_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmpView ev = new EmpView();
		EmpService es = new EmpService(); 
		
		boolean isFlag = true;
		
		ev.header();
		ev.footer();
		
		while(isFlag) {
			ev.viewMenu();
		
			System.out.print("선택 > ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				//사원을 저장하는 동작
				es.addEmp();
				break;
				
			case 2:
				//사원을 목록을 보여주는 동작
				es.listEmp();
				
				break;
				
			case 3:
				es.updateEmp();
				break;
				
			case 4:
				es.deleteEmp();
				break;
				
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
			
			
			
			
			
			
		}
		
	}

}
