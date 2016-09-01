package string;
import java.util.*;
public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
ArrayList<Integer> arr=new ArrayList<Integer> ();
for(int i=0;i<a;i++)
{
	arr.add(s.nextInt());
}
for(int i=0;i<a;i++)
{
	int a1=(arr.get(i));
	int c=0;
	System.out.println(a1);
	for(int j=i+1;j<a-1;j++)
	{
		int b1=arr.get(j);
		System.out.println(b1);
		if(a1==b1)
		{
			c++;
			arr.remove(j);

		}
	}
	
	if(c==0)
	{
	System.out.println(arr.get(i));
}
}
	}

}
