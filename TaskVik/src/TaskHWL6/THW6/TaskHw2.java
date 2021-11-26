package TaskHWL6.THW6;

import java.util.Scanner;

public class TaskHw2 {
    public static void main( String[] args ) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your String :");
    String s1=sc.nextLine();
    int count,j=1;
    char var='a';
    char ch[]=s1.toCharArray();
        while(j<=26)
    {
        count=0;
        for(int i=0; i<s1.length(); i++)
        {
            if(ch[i]==var || ch[i]==var-32)
            {
                count++;
            }
        }
        if(count>0){
            System.out.println("Frequency of "+var+" is "+count);
        }
        var++;
        j++;
    }}
}
