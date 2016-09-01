package string;
import java.util.*;
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
String a=s.nextLine();
int len=a.length();
char c[]=new char[len];
c=a.toCharArray();
LinkedHashSet<Character> ts=new LinkedHashSet<Character>();
for(int i=0;i<len;i++)
{
	ts.add(c[i]);
}
Iterator it=ts.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
