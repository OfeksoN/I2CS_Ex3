import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MapTests {

    @Test
    void init() {
        // Create a new map with width = 3, height = 3, and value = 5
        Map map =new Map(3,3,5);
        int [][]result=map.getMap();
        // Define the expected map
        int[][]exc= {
                {5,5,5},
                {5,5,5},
                {5,5,5}};
        assertArrayEquals(exc,result);

        Map map2 =new Map(2,3,6);
        int[][]exc2= {
                {6,6,6},
                {6,6,6}};
    }

}
