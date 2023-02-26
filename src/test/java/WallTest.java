import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WallTest {
    @Mock
    private Block mockBlock1;
    @Mock
    private Block mockBlock2;
    @Mock
    private Block mockBlock3;
    @Mock
    private CompositeBlock mockCompositeBlock;
    @InjectMocks
    private Wall wall;

    @Before
    public void setUp() {
        when(mockBlock2.getColor()).thenReturn("green");
        when(mockBlock2.getMaterial()).thenReturn("stone");
        when(mockBlock3.getColor()).thenReturn("blue");
        when(mockBlock3.getMaterial()).thenReturn("stone");

        List<Block> blocks = Arrays.asList(mockBlock1, mockBlock2, mockBlock3, mockCompositeBlock);
        this.wall = new Wall(blocks);
    }

    @Test
    public void getBlockByColor_Success() {
        //given-when
        Optional<Block> blockOptional = wall.findBlockByColor("green");

        //then
        Assertions.assertTrue(blockOptional.isPresent());
        Assertions.assertEquals(mockBlock2, blockOptional.get());
    }

    @Test
    public void getBlockByColor_WithWrongColor_ThrowsException() {
        //given-when-then
        Assertions.assertThrows(NullPointerException.class, () -> wall.findBlockByColor("abc"));
    }

    @Test
    public void getBlockByColor_WithNull_ThrowsException() {
        //given-when-then
        Assertions.assertThrows(NullPointerException.class, () -> wall.findBlockByColor(null));
    }

    @Test
    public void getBlockByColor_WithEmptyString_ThrowsException() {
        //given-when-then
        Assertions.assertThrows(NullPointerException.class, () -> wall.findBlockByColor(""));
    }

    @Test
    public void getBlocksByMaterial_Success() {
        //given-when
        List<Block> blocks = wall.findBlocksByMaterial("stone");

        //then
        Assertions.assertEquals(2, blocks.size());
        Assertions.assertTrue(blocks.contains(mockBlock2));
        Assertions.assertTrue(blocks.contains(mockBlock3));
    }

    @Test
    public void getCount_Success() {
        //given-when-then
        Assertions.assertEquals(4, wall.count());
    }
}
