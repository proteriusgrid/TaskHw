package TaskHWL8;

public class Armstrong {
//    static long Armstrong( long n)
//    {
//        long count = 0;
//        for(long i = 1; i <= Integer.MAX_VALUE; i++)
//        {
//            long num = i, rem, digit = 0, sum = 0;
//            num = i;
//            digit = (long) Math.log10(num) + 1;
//
//            while(num > 0)
//            {
//                rem = num % 10;
//                sum = sum + (int)Math.pow(rem, digit);
//                num = num / 10;
//            }
//            if(i == sum)
//                count++;
//            if(count == n)
//                return   i;
//        }
//            return n;
//        }
//
//        public static void main(String[] args)
//        {
//          Scanner sc= new Scanner(System.in);
//         System.out.print("number: ");
//         long n=sc.nextLong();
////            long n = 12;
//            System.out.println(Armstrong(n));
//        }

    public void isArmstrong(String n)

    {
        char[] s=n.toCharArray();
        int size=s.length;
        int sum=0;
       for(char num:s)
        {int temp=1;
            int i=Integer.parseInt(Character.toString(num));
            for(int j=0;j<=size-1;j++)

            { temp *=i;}
            sum +=temp;
        }
        if(sum==Integer.parseInt(n))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static void main(String[] args)
    {
        Armstrong amrmstrong= new Armstrong();
        amrmstrong.isArmstrong("73");
        amrmstrong.isArmstrong("371");
        amrmstrong.isArmstrong("8208");


    }


    }

