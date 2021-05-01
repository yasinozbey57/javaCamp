package javaHomework;

public class UserManager {
	public void add(User user) {
		System.out.println("Öðrenci Eklendi"+" "+user.name+" "+user.surname);
	}
	
	public void delete(User user) {
		System.out.println("Öðrenci Silindi"+" "+user.name+" "+user.surname);
	}
	
	public void update(User user) {
		System.out.println("Öðrenci Güncellendi"+" "+user.name+" "+user.surname);
	}
}
