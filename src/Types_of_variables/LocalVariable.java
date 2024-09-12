package Types_of_variables;

public class LocalVariable {
	private static int a=10;
	private void m1()
	{
	int a=20;
	System.out.println(a);
	}
	public static void main(String[] args) {
		LocalVariable s1=new LocalVariable();
	s1.m1();
	System.out.println(a);
}
}