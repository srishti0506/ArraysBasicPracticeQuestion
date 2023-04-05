package ads1;
import java.util.*;
public class DecimalBase {
public static int DecimalBase(int n,int b) {
	int rv=0;
	int p=1;
	while(n>0) {
		int dig=n%b;
		n=n/b;
		rv+=dig*p;
		p=p*10;
	}
	return rv;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int b=s.nextInt();
int sd=DecimalBase(n,b);
System.out.println(sd);
	}

}
