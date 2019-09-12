public class Point2D {
    private float x;
    private float y;

    private float[] arrCoordinate = new float[2];

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setCoordinate(){
        arrCoordinate[0] = getX();
        arrCoordinate[1] = getY();
    }

    public float[] getCoordinate() {
        return arrCoordinate;
    }

    @Override
    public String toString() {
        return "(" + arrCoordinate[0] + ", " + arrCoordinate[1] + ")";
    }
}
