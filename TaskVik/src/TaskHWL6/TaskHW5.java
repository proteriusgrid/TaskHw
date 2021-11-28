package TaskHWL6;

public class TaskHW5 {

    static void replace( String str ) {
        String s1 = str.replace("b", "");
        System.out.println("Removing 'b' = "+s1);
    }
    static void replaceFirst( String str ) {
        String s2 = str.replaceFirst("ab", "");
        System.out.println("Removing First 'ab' = "+ s2);
    }

    public static void main( String[] args ) {

        String str = "abcdABC123";

        replace(str);

        replaceFirst(str);


    }
}
