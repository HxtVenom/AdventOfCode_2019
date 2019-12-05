import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class App {

    public static void main(String[] args) throws IOException {
        Path set1File = Paths.get("set1.txt");
        Path set2File = Paths.get("set2.txt");
        Set<Point> set1Points;
        Set<Point> set2Points;
        PointCreator calc = new PointCreator();

        FileHandler file = new FileHandler();

        ArrayList<Instruction> set1 = new ArrayList<>(file.getSet(set1File));
        set1Points = new LinkedHashSet<Point>(calc.calculatePoints(set1));
        ArrayList<Instruction> set2 = new ArrayList<>(file.getSet(set2File));
        set2Points = new LinkedHashSet<Point>(calc.calculatePoints(set2));

        HashSet<Point> sameSet = new HashSet<>();
        for(Point p1 : set1Points){
            for(Point p2: set2Points){
                System.out.println(p1.getX() + " " + p1.getY());
                if(p1.equals(p2)){
                    sameSet.add(p1);
                }
            }
        }
        for(Point p: sameSet){
            System.out.println(p.getX() + " " + p.getY());
        }
    }
}
