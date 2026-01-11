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
    @Test
    void allDistance() {
        // Define two 2D arrays representing maps
        int[][]mat= {
                {1,1,1,1},
                {0,0,0,0},
                {0,1,0,0},
                {1,1,1,1},
        };

        int[][]mat2= {
                {1,0,0,1},
                {0,0,0,0},
                {0,1,0,0},
                {1,0,0,1},
        };
        // Create Map objects based on the defined maps
        Map map = new Map(mat);
        Map map2 = new Map(mat2);

        Pixel2D p1 = new Index2D(1,0);//start point
        Pixel2D p2 = new Index2D(0,1);//start point

        //Calculate the distances from the start points to all other pixels
        Map2D map_1 = map.allDistance(p1,1);
        Map2D map_2 = map2.allDistance(p2,1);

        // Get the resulting maps as 2D array
        int [][] result= map_1.getMap();
        int [][] result2= map_2.getMap();
        //
        // Define the expected maps
        int [][]expected= {
                {-1, -1, -1, -1},
                {0 , 1 , 2  , 1},
                {1 , -1 , 3 ,2},
                {-1, -1, -1, -1}
        };
        int [][]expected2= {
                { -1 , 0 , 1, -1},
                { 2 , 1 , 2  , 3},
                { 3 , -1 , 3 , 4},
                {-1 , 1 , 2 , -1}
        };
        assertArrayEquals(expected,result);
        assertArrayEquals(expected2,result2);
    }


}
