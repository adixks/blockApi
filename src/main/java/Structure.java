import java.util.List;
import java.util.Optional;

public interface Structure {
    Optional<Block> findBlockByColor(String var1);

    List<Block> findBlocksByMaterial(String var1);

    long count();
}
