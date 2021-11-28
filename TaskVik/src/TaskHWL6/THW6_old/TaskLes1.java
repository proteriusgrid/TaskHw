package TaskHWL6.THW6_old;

public class TaskLes1 {

        static void randomString( int mode, int length ) {

            if (mode == 1) {
                System.out.println(mode + " True ");
            } else {
                System.out.println(length + " False ");
            }
            System.out.println("BYE");
//
//            System.out.print(name+ " ");
//            System.out.println(age + " ");

        }

    public static void main( String[] args) {
        int mode = (int) ( Math.random() * 2 );

//        System.out.println (a);
        int length = mode;
        randomString((int) mode, length);

//        String randomString = new String();
//        System.out.println("random Number : "+ randomString);

    }

}




