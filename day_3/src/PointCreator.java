import java.util.*;

public class PointCreator {
    private int x = 0;
    private int y = 0;

    public /*HashSet<Point>*/void calculatePoints(LinkedHashMap<Integer, Character> inst) {
        LinkedList<Point> points = new LinkedList<>();

        try {
            for (Map.Entry<Integer, Character> entry : inst.entrySet()) {
                Point tempObj = new Point();
                if (entry.getValue() == 'D') {
                    x -= entry.getKey();
                    tempObj.x = x;
                    tempObj.y = y;
                    points.add(tempObj);
                } else if (entry.getValue() == 'U') {
                    x += entry.getKey();
                    tempObj.x = x;
                    tempObj.y = y;
                    points.add(tempObj);
                } else if (entry.getValue().equals('R')) {
                    y = y +  entry.getKey();
                    tempObj.x = x;
                    tempObj.y = y;
                    points.add(tempObj);
                } else if (entry.getValue().equals('L')) {
                    y -= entry.getKey();
                    tempObj.x = x;
                    tempObj.y = y;
                    points.add(tempObj);
                } else {
                    throw new Exception("INVALID DIRECTION!");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        for(Point p: points){
            System.out.println("x: " + p.x + " y: " + p.y);
        }
        //return points;
    }
}
