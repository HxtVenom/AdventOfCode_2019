import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class App {

    public static void main(String[] args) throws IOException {
        Path set1File = Paths.get("set1.txt");
        Path set2File = Paths.get("set2.txt");
        ArrayList<Point> set1Points;
        ArrayList<Point> set2Points;
        ArrayList<Point> samePoints = new ArrayList<>();

        FileHandler file = new FileHandler();

        ArrayList<Instruction> set1 = new ArrayList<>(file.getSet(set1File));
        ArrayList<Instruction> set2 = new ArrayList<>(file.getSet(set2File));

        PointCreator calc = new PointCreator();

        set1Points = new ArrayList<>(calc.calculatePoints(set1));
        set2Points = new ArrayList<>(calc.calculatePoints(set2));

        for(int i = 0; i < set1Points.size(); i++){
            for(int j = 0; j < set2Points.size(); j++){
                if(set1Points.get(i).equals(set2Points.get(j))){
                    Point p = new Point();
                    p = set1Points.get(i);
                    samePoints.add(p);
                }
            }
        }

        for(int i = 0; i < samePoints.size(); i++){
            
        }
    }
}
