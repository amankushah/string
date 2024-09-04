import java.util.*;
public class stringbuilder
 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb.capacity());
        sb.append(12345);
        System.out.println(sb);
        sb.setCharAt(2, 'A');
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.delete(4, 6);
        System.out.println(sb);
        sb.insert(10,"AMAN");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }

    
 }
