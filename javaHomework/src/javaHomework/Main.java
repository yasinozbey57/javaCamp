package javaHomework;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Kamp� C# + Angular",
				"Bu kursta nitelikli yaz�l�m geli�tirici yeti�tirmeyi ama�l�yoruz.");
		course1.id = 1;
		course1.name = "Yaz�l�m Geli�tirici Kamp� C# + Angular";
		course1.detail = "Bu kursta nitelikli yaz�l�m geli�tirici yeti�tirmeyi ama�l�yoruz.";

		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Kamp� JAVA + REACT",
				"Bu kursta nitelikli yaz�l�m geli�tirici yeti�tirmeyi ama�l�yoruz.");
		course2.id = 2;
		course2.name = "Yaz�l�m Geli�tirici Kamp� JAVA + REACT";
		course2.detail = "Bu kursta nitelikli yaz�l�m geli�tirici yeti�tirmeyi ama�l�yoruz.";

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println(course.name + " " + course.detail);
		}

		Student student1 = new Student(1,"Yasin","�zbey","25");
		student1.id = 1;
		student1.name = "Yasin";
		student1.surname = "�zbey";
		student1.age = "25";

		Student student2 = new Student(2,"�eyma","Karak�se","19");
		student2.id = 2;
		student2.name = "�eyma";
		student2.surname = "Karak�se";
		student2.age = "19";

		Student[] students = { student1, student2 };

		for (Student student : students) {
			System.out.println(student.name+" "+student.surname);
		}

		CourseManager courseManager = new CourseManager();

		courseManager.add(course1);

		courseManager.add(course2);

		courseManager.comleted(course1);

		courseManager.comleted(course2);

		StudentManager studentManager = new StudentManager();

		studentManager.add(student1);
		
		studentManager.add(student2);

	}
}
