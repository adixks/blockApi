import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    public Optional<Block> findBlockByColor(String color) {
        return Optional.ofNullable(blocks.stream()
                .filter(block -> color.equals(block.getColor()))
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Block not found")));
    }

    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> material.equals(block.getMaterial()))
                .collect(Collectors.toList());
    }

    public long count() {
        return blocks.size();
    }
}
