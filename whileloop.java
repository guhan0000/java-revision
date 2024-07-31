import java.util.*;
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name="kavi";
		do
			
		{
			System.out.println("enter name");	
			name=sc.nextLine();
		}while(name.isEmpty());
		System.out.println("hello "+name);
	}

}
