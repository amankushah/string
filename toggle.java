import java.util.*;
class toggle
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the string :");
        String str=sc.nextLine();
        String ptr="";
        int l,i;
        char a;
        l=str.length();
        for(i=0;i<l;i++)
        {
            a=str.charAt(i);
            if(a!=' ')
            {
              if((int)a<95)
              {
                a=Character.toLowerCase(a);
                ptr += a;

              }
              else{
                a=Character.toUpperCase(a);
                ptr += a;
              }
            }
              else
              {
                ptr += " ";
              }
              

            }

        System.out.println( "the output is :" + ptr);

     }
}