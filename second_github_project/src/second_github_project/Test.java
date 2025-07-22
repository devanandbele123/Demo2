package second_github_project;

public class Test {
	public void add()
	{
		int a = 50;
		int b = 89;
		
		int c =a + b;
		System.out.println(c);
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}

	pubic void mul()
	{
		int a = 23;
		int b = 10;
		int c = a*b;
		System.out.println(c);
	}		
	
	public static void main(String[] args) {
		Test t = new Test();
		t.add();
		
		int res = t.sub(20, 10);
		System.out.println(res);
	}
}
