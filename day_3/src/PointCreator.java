import java.util.*;
import java.awt.Point;

public class PointCreator {
    private Point p = new Point(0, 0);

    public Set calculatePoints(ArrayList<Instruction> inst) {
        Set<Point> points = new LinkedHashSet<>();

        try {
            inst.forEach((i) -> {
                if(i.getInst() == 'U'){
                    for(int j = 0; j < i.getMove(); j++){
                        Point p2 = new Point((int)p.getX() + 1, (int)p.getY());
                        p.setLocation(p2.getX(), p2.getY());
                        points.add(p2);
                    }
                }else if(i.getInst() == 'D'){
                    for(int j = 0; j < i.getMove(); j++){
                        Point p2 = new Point((int)p.getX() - 1, (int)p.getY());
                        p.setLocation(p2.getX(), p2.getY());
                        points.add(p2);
                    }
                }else if(i.getInst() == 'R'){
                    for(int j = 0; j < i.getMove(); j++){
                        Point p2 = new Point((int)p.getX(), (int)p.getY() + 1);
                        p.setLocation(p2.getX(), p2.getY());
                        points.add(p2);
                    }
                }else if(i.getInst() == 'L'){
                    for(int j = 0; j < i.getMove(); j++){
                        Point p2 = new Point((int)p.getX(), (int)p.getY() -1);
                        p.setLocation(p2.getX(), p2.getY());
                        points.add(p2);
                    }
                }
            });
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        /*points.forEach((temp) -> {
            System.out.println((int)temp.getX() + " " + (int)temp.getY());
        });*/
        return points;
    }
}
