package rover;

public class RoverTest {

    public static void main(String[] args) {
        Map map = new Map(100, 100);
        Position position = new Position(0, 0);
        Rover rover = new Rover("Rover1", position, Direction.NORD, map);

        System.out.println(rover.getNom());
        System.out.println(rover.getPosition().getX());
        System.out.println(rover.getPosition().getY());
        System.out.println(rover.getDirection());
        rover.turnLeft();
        rover.move();
        System.out.println(rover.getPosition().getX());
        System.out.println(rover.getPosition().getY());
        System.out.println(rover.getDirection());
        rover.turnRight();
        for(int i = 0; i<99; i++){
            rover.move();
        }
        System.out.println(rover.getPosition().getX());
        System.out.println(rover.getPosition().getY());
        System.out.println(rover.getDirection());
    }
}