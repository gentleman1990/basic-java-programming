import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPart3_FileOperation {
    public static void main(String[] args) throws FileNotFoundException, IOException {

//        Scanner scanner = new Scanner(new File("src/main/resources/config.txt"));
//        //scanner.useDelimiter(";");
//        //System.out.println(scanner.next());
//        //System.out.println(scanner.next());
//        while(scanner.hasNext()){
//            System.out.println("Row");
//
//            Scanner scannerColumn = new Scanner(scanner.next());
//            scannerColumn.useDelimiter(";");
//            while(scannerColumn.hasNext()){
//                System.out.println("Column: " + scannerColumn.next());
//            }
//        }

//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        System.out.println("You entered string " + s);

        System.out.println("Stream");
        Stream<String> stream = Files.lines(Paths.get("src/main/resources/config.txt"));
        stream.forEach(System.out::println);

        System.out.println("Stream with filter");
        Stream<String> secondStream = Files.lines(Paths.get("src/main/resources/config.txt"));
        List<String> stringList = secondStream.filter(line -> line.contains("2")).map(String::toUpperCase).collect(Collectors.toList());
        stringList.forEach(System.out::println);


        System.out.println("Buffered reader with filter");
        BufferedReader br = Files.newBufferedReader(Paths.get("src/main/resources/config.txt"));
        List<String> brList = br.lines().collect(Collectors.toList());
        brList.forEach(System.out::println);
    }
}
