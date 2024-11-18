package rover;

public class Map {
    private final int width;
    private final int height;
    private int[][] obstacles;

    public Map(int width, int height){
        this.width = width;
        this.height = height;
        this.obstacles = obstacles;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int[][] getObstacles(){
        return obstacles;
    }
}
