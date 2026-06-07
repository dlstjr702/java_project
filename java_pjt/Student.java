package java_pjt;

public class Student {
	String name;
	int kor,eng,math;
	
	
	
	public Student(String name,int kor, int eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	

	
	int totNum() {
		return kor+eng+math;
	}
	
	double avgNum() {
		return (double)totNum()/3;
	}
	
	
	void dispInfo() {
		System.out.printf("이름 %s 국어%d 영어%d 수학%d 총점 %d  평균 %.2f \n",name, kor, eng, math, totNum(),avgNum());
	}
	
	
}
