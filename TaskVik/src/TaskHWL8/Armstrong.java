package TaskHWL8;

import java.util.Scanner;

public class Armstrong {

    public boolean isArmstrong(int n)
{
    int temp;
    int digits = 0;
    int last = 0;
    int sum = 0;
    temp=n;

    while(temp > 0)
    {
        temp = temp / 10;
        digits++;
    }

    temp = n;
    while(temp>0)
    {
        last = temp % 10;
        sum +=  (Math.pow(last, digits));
        temp = temp/10;
    }

    if(n == sum)

        return true;

    else return false;
}


    public void checkArmstrong(){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");

        Armstrong armstrong = new Armstrong();

        num=sc.nextInt();
        if(armstrong.isArmstrong(num))
        {
            System.out.print("Armstrong number.");
        }
        else
        {
            System.out.print("Not Armstrong number. ");
        }

    }

}


