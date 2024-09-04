import java.util.*;
class frequencyofcharacter
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the string :");
        String str=sc.nextLine();
        int i,l,c=1,b=0;
        char ch =' ';
        l=str.length();
        char arr[]=new char[l];
        if(l>1)
        {
        for(i=0;i<l;i++)
        {
            arr[i]=str.charAt(i);
        }
        Arrays.sort(arr);
        for(i=0;i<l-1;i++)
        {
          char a=arr[i];
           if(a==arr[i+1])
           {
              c++;
           }
           else{
            if(c>b)
            {
                b=c;
                ch=a;
                
            }
            c=1;

           }
        }
    
        if(b==1){
            System.out.println("all character have same frequency");

        }
        else
        {
        System.out.println("the maximum frequency is : "+b+" of character : "+ch);
        }
    }
    else{
        System.out.println("only single character");
    }

    }
}

           

