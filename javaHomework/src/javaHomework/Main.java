package javaHomework;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Kampý C# + Angular",
				"Bu kursta nitelikli yazýlým geliþtirici yetiþtirmeyi amaçlýyoruz.");
		course1.id = 1;
		course1.name = "Yazýlým Geliþtirici Kampý C# + Angular";
		course1.detail = "Bu kursta nitelikli yazýlým geliþtirici yetiþtirmeyi amaçlýyoruz.";

		Course course2 = new Course(2, "Yazýlým Geliþtirici Kampý JAVA + REACT",
				"Bu kursta nitelikli yazýlým geliþtirici yetiþtirmeyi amaçlýyoruz.");
		course2.id = 2;
		course2.name = "Yazýlým Geliþtirici Kampý JAVA + REACT";
		course2.detail = "Bu kursta nitelikli yazýlým geliþtirici yetiþtirmeyi amaçlýyoruz.";

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println(course.name + " " + course.detail);
		}
		
		System.out.println("-----------------------");

		Student student1 = new Student(1,"Yasin","Özbey","25");
		student1.id = 1;
		student1.name = "Yasin";
		student1.surname = "Özbey";
		student1.age = "25";

		Student student2 = new Student(2,"Þeyma","Karaköse","19");
		student2.id = 2;
		student2.name = "Þeyma";
		student2.surname = "Karaköse";
		student2.age = "19";

		Student[] students = { student1, student2 };

		for (Student student : students) {
			System.out.println(student.name+" "+student.surname);
		}
		
		System.out.println("-----------------------");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð", 35, "Yazýlým geliþtirici yetiþtirmede uzman");
		instructor1.id =1;
		instructor1.name ="Engin";
		instructor1.surname ="Demiroð";
		instructor1.age =35;
		instructor1.information="Yazýlým geliþtirici yetiþtirmede uzman";
		
		Instructor instructor2 = new Instructor(2, "Kerem", "Varýþ", 32, "Uzman yazýlým geliþtirici");
		instructor2.id =2;
		instructor2.name ="Kerem";
		instructor2.surname ="Varýþ";
		instructor2.age =32;
		instructor2.information="Uzman yazýlým geliþtirici";
		
		
		Instructor[] instructors = {instructor1, instructor2};
		
		for(Instructor instructor : instructors) {
			System.out.println(instructor.name+" "+instructor.surname);
		}
		
		System.out.println("-----------------------");
		
	    InstructorManager instructorManager = new InstructorManager();
	    
	    instructorManager.add(instructor1);
	    
	    instructorManager.delete(instructor1);
	    
	    instructorManager.update(instructor1);
	    
	    System.out.println("-----------------------");

		CourseManager courseManager = new CourseManager();

		courseManager.add(course1);

		courseManager.add(course2);

		courseManager.completed(course1);

		courseManager.completed(course2);
		
		System.out.println("-----------------------");

		StudentManager studentManager = new StudentManager();

		studentManager.add(student1);
		
		studentManager.add(student2);

	}
}
