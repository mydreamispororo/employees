package emp.views;

public class EmpView {
	
	public void header() {
		System.out.println("코리아아이티 사원관리시스템");
	}
	
	public void footer() {
		System.out.println("Tel. 051.710.1234, Addr. Busan");
	}

	public void viewMenu() {
		System.out.println("==================================");
		System.out.println("1. 사원등록  2. 사원목록  3. 사원수정  4. 사원삭제  5. 프로그램 종료");
		System.out.println("==================================");
		System.out.println();
	}

}
