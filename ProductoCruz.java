import java.util.Scanner;
public class ProductoCruz{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame los 3 valores de U");
		int u1=sc.nextInt();
		int u2=sc.nextInt();
		int u3=sc.nextInt();
		System.out.println("Dame los valores de V");
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		int v3=sc.nextInt();
		int ri=((u2)*(v3)-(u3)*(v2));
		int rj=-((u1)*(v3)-(u3)*(v1));
		int rk=((u1)*(v2)-(u2)*(v1));
		System.out.println("|"+u1+" "+u2+" "+u3+"|=|"+u2+" "+u3+"|-|"+u1+" "+u3+"|+|"+u1+" "+u2+"|");
		System.out.println("|"+v1+" "+v2+" "+v3+"|=|"+v2+" "+v3+"|-|"+v1+" "+v3+"|+|"+v1+" "+v2+"|");
		System.out.println("UXV=(("+u2+")("+v3+")-("+u3+")("+v2+"))i-(("+u1+")("+v3+")-("+u3+")("+v1+"))j+(("+u1+")("+v2+")-("+u2+")("+v1+"))k");
		System.out.println("UXV="+ri+"i,"+rj+"j,"+rk+"k");
		
	}
}