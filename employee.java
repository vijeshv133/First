  class employer{
	   private void sum() {
		  int a=10;
		  int b=20;
		  int c=a+b;
		  System.out.println("the sum = "+c);
	  }
	
}
public class employee {
	public void product() {
		int d=40;
		int e=50;
		int f=d*e;
		System.out.println("the product is = "+f);
	}

	public static void main(String[] args) {
		employer ref=new employer();
		employee xyz=new employee();
		ref.sum();
		xyz.product();

	}

}