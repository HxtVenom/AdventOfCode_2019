public class Point {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }else if(obj == null){
            return false;
        }else if(obj instanceof Point){
            Point p = (Point) obj;
            if((p.getX() == x) && (p.getY() == y)){
                return true;
            }
        }
        return false;
    }
}
