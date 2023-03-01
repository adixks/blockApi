import java.util.List;

public class CompositeBlockImpl implements CompositeBlock {
    private List<Block> blocks;

    public CompositeBlockImpl(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public String getColor() {
        return blocks.get(0).getColor();
    }

    @Override
    public String getMaterial() {
        return blocks.get(0).getMaterial();
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public String toString() {
        return "CompositeBlockImpl{" +
                "blocks=" + blocks +
                '}';
    }
}