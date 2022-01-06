/**
 * JAVA 2 Homework5
 *
 * @author Oksana Ilyakova
 * @version 06.01.2022
 */
import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HW5 {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("id");|
            sb.append(',');|
            sb.append("Name");|
            sb.append(',');|
            sb.append("Address");|
            sb.append('\n');|

            sb.append("100");|
            sb.append(',');|
            sb.append("Nora Bern");|
            sb.append(',');|
            sb.append("Munchen");|
            sb.append('\n');|

            writer.write(sb.toString());
            writer.close();
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        TestCSV testCSV =  new TestCSV();
        testCSV.readCSVFile();
    }

    public void readCSVFile(){
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("test.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(records.toString());
    }
    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
     public class AppData {
        private String_name;

         public string getName() {
             return Name;
         }

         public void setName(string name) {
             Name = name;
         }

         public string Name {

         }
        private int_id;

         public int getId() {
             return Id;
         }

         public void setId(int id) {
             Id = id;
         }

         public int Id {

         }
     }
}
