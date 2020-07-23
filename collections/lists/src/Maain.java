package lists;
import java.util.*;
public class Maain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		List<String> list=new ArrayList <String>();
		list.add("vamsi");
		list.add("ram");
		list.add("suhan");
		list.add("nandu");
		list.add("chandan");
		list.add("govind");
		list.add("chinnu");
		System.out.println("1:insert \n2:remove\n3:display\n4:exit\nenter option :");
		int opt=s.nextInt();
		String name;
		while(opt!=4) {
			switch(opt)
			{
			case 1:System.out.println("enter data to insert");
			       name=s.next();
			       list.add(name);
			       break;
			case 2:System.out.println("enter name to remove");
			       name=s.next();
			       if(list.contains(name)){
			       list.remove(name);}
			       else {
			    	   System.out.println(name+"is not in the list");
			       }
			       break;
			case 3:System.out.println("The deatails are:");
				for(String n:list ) {
				System.out.println(n);
			}
				break;
			}
			System.out.println("1:insert \n2:remove\n3:display\n4:exit\nenter option :");
			opt=s.nextInt();
		}
			 
			}
	}
