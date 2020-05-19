import java.util.Arrays;

public class FlipProblem {
	
	public static void main(String args[]) {
		System.out.println(theFinalProblem("01001"));
		System.out.println(theFinalProblem("1111"));
		System.out.println(theFinalProblem("01011"));
	}
	
	public static int theFinalProblem(String target) {
			int flips=0; 
			char[] targetchars= target.toCharArray(); 
			char[] defaultchars=new char[targetchars.length];
			Arrays.fill(defaultchars,'0'); 
			for(int i=0;i<defaultchars.length;i++)
				{ 
					if(flips%2!=0) {
						targetchars[i]=(targetchars[i]=='0')?'1':'0'; 
					}
					if(defaultchars[i]!=targetchars[i]) 
					{
						defaultchars[i]='1';
						flips++;
					}
				}
			return flips;
	}
}
