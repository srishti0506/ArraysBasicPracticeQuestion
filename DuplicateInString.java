package Traversal;
import java.util.*;
public class StringCodility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = duplicate(str);
		System.out.println(ans);
	}
	public static String duplicate(String str) {
		HashMap<Character,Integer>hs=new HashMap<>();
		char c[]=str.toCharArray();
		for(char i: c){
			hs.put(i, hs.getOrDefault(i,0)+1);
			
		}
		String ans=" ";
		for(int i=0;i<str.length();i++) {
			if(hs.containsKey(c[i])&& hs.get(c[i])>1) {
				ans+=c[i];
				break;
			}
			
		}
		return ans;
	}
	}
