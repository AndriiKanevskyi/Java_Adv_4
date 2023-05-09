package hw_2;

import java.io.*;
import java.util.StringTokenizer;

public class hw_2 {
    public static void main(String[] args) {
        String text = "";
        String result = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\andrii.kanevski\\IdeaProjects\\Java_Adv_4\\src\\hw_2\\original.txt"));) {
            while (reader.ready()) {
                text = text.concat(reader.readLine());

            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("original text: "+text);


        String[] arr = text.split("\\s");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("as") || arr[i].equalsIgnoreCase("the") || arr[i].equalsIgnoreCase("and")
                    || arr[i].equalsIgnoreCase("of")) {
                arr[i] = "Java";
            }
        }
        StringBuilder builder = new StringBuilder(result);
        for (String elem : arr
        ) {
            builder.append(elem + " ");
        }
        result = builder.toString();
        System.out.println("changed text: "+result);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\andrii.kanevski\\IdeaProjects\\Java_Adv_4\\src\\hw_2\\changed.txt"));) {
            writer.write(result);
            writer.flush();
        }catch (IOException e){
            System.out.println(e);
        }


    }
}
