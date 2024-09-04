import java.util.*;
class compressthestring
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the string :");
        String str=sc.next();
        str=str+" ";
        String sum =" ";
        int i,l,c=1;
        char arr[]=str.toCharArray();
        char a=' ';
        l=str.length();
        for(i=0;i<l-1;i++)
        {
           if(arr[i]==arr[i+1])
           {
              c++;
           }
           else
           {
            System.out.print(arr[i]);
            System.out.print(c);

            c=1;
            
           }
        }
    }
}

