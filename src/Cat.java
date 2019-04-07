
public class Cat extends Pet {
String cat_sound;
	
	public Cat(String petName) {
		super (petName);
		cat_sound="meow";
	}
	
	public String speak(){
		return cat_sound;
	}
}
