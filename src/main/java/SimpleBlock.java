public class SimpleBlock implements Block {
    private String color;
    private String material;

    public SimpleBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return "SimpleBlock{color='" + color + "', material='" + material + "'}";
    }
}
