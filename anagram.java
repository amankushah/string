import java.util.*;
class anagram
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the 1st string :");
        String s=sc.nextLine();
        System.out.print("enter the 2nd string :");
        String t=sc.nextLine();
        int l,i,n;
        l=s.length();
        n=t.length();

        char arr[] = new char[l];
        char brr[] = new char[n];
        
        for(i=0;i<l;i++)
        {
            arr[i]=s.charAt(i);
        }
        for(i=0;i<n;i++)
        {
            brr[i]=t.charAt(i);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        boolean m=false;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==brr[i]) m=true;
            else 
            {
                m=false;
                break;
            }
        }
        if(m==true) System.out.println("string is anagram");
        else System.out.println("string is not anagram");
        
    }
}

