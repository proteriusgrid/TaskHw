package TaskHWL8;

public class Reverse {
    public static void main( String[] args ) {
        String input = "dlrow olleH";
        char[] string = input.toCharArray();

        for (int i = string.length - 1; i >= 0; i--)
            System.out.print(string[i]);
    }

    public void main() {
    }
}

