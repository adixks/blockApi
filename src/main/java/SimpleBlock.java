public class SimpleBlock implements Block {
    private String color;
    private String material;

    public SimpleBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "SimpleBlock{color='" + color + "', material='" + material + "'}";
    }
}
