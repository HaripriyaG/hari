package string;
import java.util.*;
public class repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int arr[]=new int[a];
int ans=0;
for(int i=0;i<a;i++)
{
	arr[i]=s.nextInt();
}
for(int i=0;i<a;i++)
{
	for(int j=i+1;j<a;j++)
	{
		if(arr[i]==arr[j])
		{
			ans=arr[i];
			break;
		}
	}
	
	
		System.out.println(ans);
		break;
	
}
	}

}
