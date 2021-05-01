package javaHomework;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazılım Geliştirici Kampı C# + Angular",
				"Bu kursta nitelikli yazılım geliştirici yetiştirmeyi amaçlıyoruz.");
		course1.id = 1;
		course1.name = "Yazılım Geliştirici Kampı C# + Angular";
		course1.detail = "Bu kursta nitelikli yazılım geliştirici yetiştirmeyi amaçlıyoruz.";

		Course course2 = new Course(2, "Yazılım Geliştirici Kampı JAVA + REACT",
				"Bu kursta nitelikli yazılım geliştirici yetiştirmeyi amaçlıyoruz.");
		course2.id = 2;
		course2.name = "Yazılım Geliştirici Kampı JAVA + REACT";
		course2.detail = "Bu kursta nitelikli yazılım geliştirici yetiştirmeyi amaçlıyoruz.";

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println(course.name + " " + course.detail);
		}

		Student student1 = new Student(1,"Yasin","Özbey","25");
		student1.id = 1;
		student1.name = "Yasin";
		student1.surname = "Özbey";
		student1.age = "25";

		Student student2 = new Student(2,"Şeyma","Karaköse","19");
		student2.id = 2;
		student2.name = "Şeyma";
		student2.surname = "Karaköse";
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
