import java.util.*;
class isomorphic
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the 1st string :");
        String s=sc.nextLine();
        System.out.print("enter the 2nd string :");
        String t=sc.nextLine();
        int l,i,n,j,flag=1,tri=1;
        char ch,a;
        char arr[] = new char[128];
        char brr[] = new char[128];
        l=s.length();
        n=t.length();
        if(l!=n) System.out.println(" length is not same.");
        else
        {
            for(i=0;i<l;i++)
            {
              a=s.charAt(i);
              ch=t.charAt(i);
              j=(int)a;
              if(arr[j]=='\0') arr[j]=ch;
              else
              {
                if(arr[j]!=ch) flag = 0;
                break;
              }
            }
            for(i=0;i<l;i++)
            {
              a=s.charAt(i);
              ch=t.charAt(i);
              j=(int)ch;
              if(brr[j]=='\0') brr[j]=a;
              else
              {
                if(brr[j]!=a) tri = 0;
                break;
              }
            }
            if(flag == 1 && tri == 1) 
            System.out.println("the strings are isomorphic");
            else
            System.out.println("the strings are not isomorphic");
        }
    }
}

