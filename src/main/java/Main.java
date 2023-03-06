import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Block b1 = new SimpleBlock("red", "wood");
        Block b2 = new SimpleBlock("blue", "concrete");
        Block b3 = new SimpleBlock("green", "wood");
        Block b4 = new SimpleBlock("yellow", "wood");
        Block b5 = new SimpleBlock("purple", "brick");
        Block b6 = new SimpleBlock("orange", "brick");

        List<Block> blocks = Arrays.asList(b1, b2, new CompositeBlockImpl(Arrays.asList(b3, b4)), new CompositeBlockImpl(Arrays.asList(b5, b6)));
        Wall wall = new Wall(blocks);

        Optional<Block> redBlock = wall.findBlockByColor("red");
        System.out.println("Red block: " + redBlock);

        List<Block> woodBlocks = wall.findBlocksByMaterial("wood");
        System.out.println("Wood blocks: " + woodBlocks);

        long blockCount = wall.count();
        System.out.println("Block count: " + blockCount);
    }
}

