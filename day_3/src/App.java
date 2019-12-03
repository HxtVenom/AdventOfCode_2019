import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class App {

    public static void main(String[] args) throws IOException {
        Path set1File = Paths.get("set1.txt");
        Path set2File = Paths.get("set2.txt");
        ArrayList<Point> set1Points= new ArrayList<>();

        FileHandler file = new FileHandler();

        LinkedHashMap<Integer, Character> set1 = new LinkedHashMap<Integer, Character>(file.getSet(set1File));
        LinkedHashMap<Integer, Character> set2 = new LinkedHashMap<Integer, Character>(file.getSet(set2File));;

        PointCreator calc = new PointCreator();

        calc.calculatePoints(set1);

    }
}
