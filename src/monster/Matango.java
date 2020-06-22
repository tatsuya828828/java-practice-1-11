package monster;

public class Matango implements Monster {

	public int hp = 50;

	public void run() {
		System.out.println("おばけきのこは逃げ出した！");
	}

	public void attack() {
		System.out.println("おばけきのこは攻撃した");
	}
}
