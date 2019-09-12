public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(1, 1);
        p2.setCoordinate(2,2);
        System.out.println("The point2D: " + p2.toString());

        Point3D p3 = new Point3D(3, 3, 3);
        p3.setCoordinate(4, 4, 4);
        System.out.println("The point3D: " + p3.toString());
    }
}
