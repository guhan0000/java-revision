import java.util.*;
public class inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("what is ur name");
		String name=sc.nextLine();
		System.out.println("what is ur age");
		int age=sc.nextInt(); 
		System.out.println("what is ur fav food");
		sc.nextLine();
		String food=sc.nextLine(); 
		System.out.println("hello "+name);
		System.out.println("u r "+age+"years old");
		System.out.println("u r fav food is "+food);
		

	}

}
