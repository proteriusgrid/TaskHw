package TaskHWL6.THW6;

public class TaskHw5_1 {

    static void rePlace( String str ) {
        String s1 = str.replace("b", "");
        System.out.println("Removing 'b' = "+s1);
    }
    static void rePlaceFirst( String str ) {
        String s2 = str.replaceFirst("ab", "");
        System.out.println("Removing First 'ab' = "+ s2);
    }
//     static void rePlaceAll( String str ) {
//        String s3= rePlaceAll("([a-z])");
//     System.out.println("Replacing all small letters = " +s3);
//     }
    public static void main( String[] args ) {

//        System.out.print("Input string: ");
//        Scanner scanner = new Scanner(System.in);
//        String str= scanner.next();
//
//        char []k = string.toCharArray();
//        String string = "Hello world ";
//        removeChar(string, 'Hello');

        String str = "abcdABC123";

        rePlace(str);

        rePlaceFirst(str);

//        rePlaceAll("([a-z])", str);
    }
}
