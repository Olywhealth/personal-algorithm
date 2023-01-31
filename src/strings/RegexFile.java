package strings;

import java.util.regex.*;
import java.io.*;
import java.util.Scanner;

public class RegexFile {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         *         to use the code you should add a regex.txt file
         *         where the File will read from
         *         and also a text.txt file should be added where
         */
        File regexFile = new File("regex.txt");
        Scanner regexScanner = new Scanner(regexFile);
        String search = regexScanner.nextLine();
        regexScanner.close();

        File file = new File("text.txt");
        String text = "";
        try (Scanner sc = new Scanner(file)) {
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
            text = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pattern pattern = null;

        try {
            pattern = Pattern.compile(search);
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage());
        }
        Matcher matcher = pattern.matcher(text);
        boolean found = false;
        int matchNumber = 1;
        while (matcher.find()) {
            found = true;
            System.out.format("%d. Found \"%s\", at position [%d-%d]\n",
                    matchNumber++, matcher.group(), matcher.start(), matcher.end());
        }
        if (!found) {
            System.out.println("Match not found");
        }

    }
}
