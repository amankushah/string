import java.util.*;
class reverseachword
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the string :");
        String str=sc.nextLine();
        str = str + " ";
        String ptr="";
        String z="";
        int l,i;
        char a;
        l=str.length();
        for(i=0;i<l;i++)
        {
            a=str.charAt(i);
            if(a!=' ')
            {
              ptr = a + ptr;
            }
            else
            {
                z += ptr + " ";
                ptr="";
            }
        }
        System.out.println("the output is : " + z);
    }
}
