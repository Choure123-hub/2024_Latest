package This_Super_Keyword;

public class thisKeyword extends superKeyword {
int a=20;

public void m1() {
	int a=40;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	
}
public static void main(String[] args) {
	thisKeyword t=new thisKeyword();
	t.m1();
}

}
