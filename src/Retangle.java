public class Retangle extends Geometry {
    private float length;
    private float width;
    public float getLength() {
        return length;
    }
    //Getter, Setter
    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    //Constructor
    public Retangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Retangle() {
    }
    //Method
    @Override
    public float dienTich() {
        return length * width;
    }
    @Override
    public float chuVi() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Thông tin hình chữ nhật: " +
                "chiều dài:" + length +
                ", chiều rộng: "+ width +
                ", diện tích: " + dienTich() +
                ", chu vi: " + chuVi() +
                '}';
    }
}
