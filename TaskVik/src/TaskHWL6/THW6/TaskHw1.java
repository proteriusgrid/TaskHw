package TaskHWL6.THW6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskHw1 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter the word:");
            String word = reader.readLine();

            System.out.println(toUperCase(word));
            System.out.println(toLowCase(word));

            System.out.println("Please enter the sentence:");
            String sent = reader.readLine();
            System.out.println(toCapitalCase(sent));

        }
        public static String toUperCase(String word){
            word = word.toUpperCase();
            return word;
        }

        public static String toLowCase(String word){
            word = word.toLowerCase();
            return word;
        }

        public static String toCapitalCase(String sent){
            String[] list = sent.split(" ");
            String result = "";
            for (int i = 0; i < list.length; i++){
                result = result + list[i].substring(0, 1).toUpperCase() + list[i].substring(1) + " ";
            }
            return result;
        }
    }




