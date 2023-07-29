public class Square extends Geometry {
    private float side;

    //Getter, Setter
    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
    //Constructor
    public Square(float side) {
        this.side = side;
    }

    public Square() {
    }
    //Method
    @Override
    public float dienTich() {
        return side * side;
    }

    @Override
    public float chuVi() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Thông tin hình vuông: " +
                "cạnh:" + side +
                ", diện tích: " + dienTich() +
                ", chu vi: " + chuVi() +
                '}';
    }
}
