package prototype.exemplo1.animation;


import prototype.exemplo1.animation.model.Person;
import prototype.exemplo1.animation.model.PersonSamples;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private static List<Person> frames = new ArrayList<Person>();
	
	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		System.out.println("* Adjust your screen's height!");
		System.out.println("* ");
		System.out.print("*********************************");
		Thread.sleep(3000);
		for(Person frame: frames) {
			frame.draw();
			Thread.sleep(500);
		}
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

		PersonSamples personSamples = new PersonSamples();

		Person person = personSamples.get("fatMan");
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		animate();
	}

	public static Person addLeft(Person p) throws CloneNotSupportedException {

		Person clone = (Person) p.clone();
		clone.left();
		frames.add(clone);

		return clone;
	}

	public static Person addRight(Person p) throws CloneNotSupportedException {

		Person clone = (Person) p.clone();
		clone.right();
		frames.add(clone);

		return clone;
	}

}
