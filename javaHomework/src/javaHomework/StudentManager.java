package javaHomework;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println("Öğrenci Eklendi"+" "+student.name+" "+student.surname);
	}
	
	public void delete(Student student) {
		System.out.println("Öğrenci Silindi"+" "+student.name+" "+student.surname);
	}
	
	public void update(Student student) {
		System.out.println("Öğrenci Güncellendi"+" "+student.name+" "+student.surname);
	}

}
