package javaHomework;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println("��renci Eklendi"+" "+student.name+" "+student.surname);
	}
	
	public void delete(Student student) {
		System.out.println("��renci Silindi"+" "+student.name+" "+student.surname);
	}
	
	public void update(Student student) {
		System.out.println("��renci G�ncellendi"+" "+student.name+" "+student.surname);
	}

}
