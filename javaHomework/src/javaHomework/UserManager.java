package javaHomework;

public class UserManager {
	public void add(User user) {
		System.out.println("��renci Eklendi"+" "+user.name+" "+user.surname);
	}
	
	public void delete(User user) {
		System.out.println("��renci Silindi"+" "+user.name+" "+user.surname);
	}
	
	public void update(User user) {
		System.out.println("��renci G�ncellendi"+" "+user.name+" "+user.surname);
	}
}
