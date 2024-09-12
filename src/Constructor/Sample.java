package Constructor;

public class Sample {
int num,num1;
String sname;
char grade;

Sample(int a,int b)
{
	num=a;
	num1=b;
}

Sample(String c)
{
	sname=c;
}
Sample(char d)
{
	grade=d;
}

public void addition() {
	System.out.println(num+num1);
	
}
public void name() {
	System.out.println(sname);
	
}
public void sgrade() {
	System.out.println(grade);
	
}

public static void main(String[] args) {
	
	Sample s =new Sample(10,25);
	
	s.addition();
	
			
	Sample s1 =new Sample("bhagvanta");
	s1.name();
	Sample s3 =new Sample("A");
	s3.name();
}
}
