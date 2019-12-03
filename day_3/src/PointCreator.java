import java.util.*;

public class PointCreator {
    private int x = 0;
    private int y = 0;

    public ArrayList<Point> calculatePoints(ArrayList<Instruction> inst) {
        ArrayList<Point> points = new ArrayList<>();

        try {
            inst.forEach((i) -> {
                Point p = new Point();
                if(i.getInst() == 'U'){
                    x += i.getMove();
                    p.setX(x);
                    p.setY(y);
                    points.add(p);
                }else if(i.getInst() == 'D'){
                    x -= i.getMove();
                    p.setX(x);
                    p.setY(y);
                    points.add(p);
                }else if(i.getInst() == 'R'){
                    y += i.getMove();
                    p.setX(x);
                    p.setY(y);
                    points.add(p);
                }else if(i.getInst() == 'L'){
                    y -= i.getMove();
                    p.setX(x);
                    p.setY(y);
                    points.add(p);
                }
            });
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        /*points.forEach((temp) -> {
            System.out.println(temp.getX() + " " + temp.getY());
        });*/
        return points;
    }
}
