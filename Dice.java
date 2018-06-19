import java.util.Random;
import java.util.Scanner;

public class Dice {

	int sides;

	public Dice(int sides) {
		this.sides = sides;
	}

	public int getsides() {
		return this.sides;
	}

public void rollDice()	{
	if (getsides()==2) {
		System.out.println("its a coin");
	int n=new Random().nextInt (2)+1;
	if (n==1)
	System.out.println("Head");
	if (n==2)
System.out.println("Tail");}
else if (getsides()==4)
{ System.out.println("4 sided cube");
System.out.println("Rolled number"+(new Random().nextInt(4)+1));
}
else if (getsides()==6) {
	System.out.println("6 sides cube");
	System.out.println("Rolled number  "+(new Random().nextInt(6)+1));
}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter sides");
	int n= sc.nextInt();
	Dice rd=new Dice(n);
	rd.rollDice();
	}
	
}
