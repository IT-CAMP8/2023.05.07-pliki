package pl.camp.it.pliki;

import java.io.*;

public class App {
    public static void main(String[] args) {
        // ZAPISYWANIE DO PLIKU
        String str = "234;234;234;222;2;42";
        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("test.csv"));
            writer.write(str);
            writer.newLine();
            writer.write("23;634;asad;3546;qaew;Janusz");
            writer.close();
        } catch (IOException e) {
            System.out.println("Plik sie zepsul !!!");
        }

        // ODCZYTYWANIE Z PLIKU
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.contains("Janusz")) {
                    System.out.println(line);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Plik sie zepsul !!!");
        }
    }
}
