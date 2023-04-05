package ads1;
import java.util.*;
public class DigitFrequency {
public static int frequency(int n,int d) {
	int c=0;
	while(n>0)
{
		int dig=n%10;
		n=n/10;
		if(dig==d) {
			c++;
		}
		}
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
int d=s.nextInt();
int sd=frequency(n,d);
System.out.println(sd);
	}

}
