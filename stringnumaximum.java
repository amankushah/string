import java.util.*;
class stringnumaximum
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in); 
        int n,i,num;
        System.out.print("enter the number of string :");
        n=sc.nextInt();
        String arr[]= new String[n];
        System.out.print("enter the string elements :");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        int brr[] = new int[n];
        for(i=0;i<n;i++)
        {
            num=Integer.valueOf(arr[i]);
            brr[i]=num;
        }
        Arrays.sort(brr);
        System.out.println("the string which has maximum value is : "+brr[n-1]);

     }
}
