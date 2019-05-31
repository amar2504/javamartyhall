package assignment1;

public class PrintNumArgs {
	public static void main(String[] args) {
		int p=0;
		String a;
		StringBuilder j = new StringBuilder();
		
		for (String arg:args)
		{
			p ++;
			a = arg.toUpperCase();
			j.append(a);
			j.append(" ");
		}
		System.out.println(j);
		
	}

}
