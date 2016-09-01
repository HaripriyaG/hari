package string;
import java.util.*;
public class dayss{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int arr[]=new int[a];
for(int i=0;i<a;i++)
{
	arr[i]=s.nextInt();
}
Arrays.sort(arr);
System.out.println(arr[1]);
 	}

}
