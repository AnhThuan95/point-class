public class Point3D extends Point2D {
    private float z;
    private float[] arrCoordinate = new float[3];

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setCoordinate() {
        arrCoordinate[0] = getX();
        arrCoordinate[1] = getY();
        arrCoordinate[2] = getZ();
    }

    @Override
    public float[] getCoordinate() {
        return arrCoordinate;
    }

    @Override
    public String toString() {
        return "(" + arrCoordinate[0] + ", " + arrCoordinate[1] + ", " + arrCoordinate[2] + ")";
    }
}
