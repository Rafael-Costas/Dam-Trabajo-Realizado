package CodigoLimpio;

public class User {

	String name;
	String type;
	public User(String name, String Type) {
		this.name=name;
		
	}
	
	float costOfLibrary() {
		return 10;
		
	}
	
}
class Teacher extends User{
	public Teacher(String name) {
		super(name, name);
	}
}
