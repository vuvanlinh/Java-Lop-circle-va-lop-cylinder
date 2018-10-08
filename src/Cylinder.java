public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;

    }


    public double getHeight() {
        return this.height;
    }

    public void setHeight() {
        this.height = height;
    }

    public double getVolume() {
        return getHeight() * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: color/" + getColor() + " radius/" + getRadius() + " height/" + height + " volume/" + getVolume();
    }


}
