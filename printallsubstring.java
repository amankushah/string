import java.util.*;
class printallsubstring
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the string :");
        String str=sc.nextLine();
        String ptr;
        int l,i;
        l=str.length();
        for(i=0;i<l;i++)
        {
            ptr=str.substring(0, i+1);
            System.out.print(ptr + "  , ");

        }
    }
}
