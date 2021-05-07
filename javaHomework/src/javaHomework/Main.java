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
		
		System.out.println("-----------------------");

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
		
		System.out.println("-----------------------");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�", 35, "Yaz�l�m geli�tirici yeti�tirmede uzman");
		instructor1.id =1;
		instructor1.name ="Engin";
		instructor1.surname ="Demiro�";
		instructor1.age =35;
		instructor1.information="Yaz�l�m geli�tirici yeti�tirmede uzman";
		
		Instructor instructor2 = new Instructor(2, "Kerem", "Var��", 32, "Uzman yaz�l�m geli�tirici");
		instructor2.id =2;
		instructor2.name ="Kerem";
		instructor2.surname ="Var��";
		instructor2.age =32;
		instructor2.information="Uzman yaz�l�m geli�tirici";
		
		
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
