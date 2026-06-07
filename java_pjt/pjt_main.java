package java_pjt;

public class pjt_main {

	public static void main(String[] args) {
		
		
		
		Student s1 = new Student("홍길동",25,25,25);
		Student s2 = new Student("손흥민",85,95,75);
		Student s3 = new Student("이강인",45,95,75);
	
		
		s1.dispInfo();
		s2.dispInfo();
		s3.dispInfo();
		
		
		Student top = s1;
		

		if(s2.totNum() > top.totNum()) {
		    top = s2;
		}else if(s3.totNum() > top.totNum()) {
		    top = s3;
		}

		System.out.println("1등은 " + top.name);
		

	}

}
