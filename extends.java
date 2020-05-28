package uploadcode;
class Main{
	int a,b;
	public void main(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+","+b+"를 입력받았습니다");
	}
}
class Sum extends Main{
	public void sum()
	{
		System.out.println("a와 b의 합계는"+(a+b));
	}
}
class Mul extends Sum{
	public void mul()
	{
		System.out.println("a와 b의 곱셈은"+a*b);
	}
}

public class gang {

	public static void main(String[] args) {
		Mul base = new Mul();
		base.main(10, 2);
		base.sum();
		base.mul();
	}

}
