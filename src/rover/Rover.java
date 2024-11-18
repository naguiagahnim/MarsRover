package rover;

public class Rover {
    private String nom;
    private Position position;
    private Direction direction;

    public Rover(String nom, Position position){
        this.nom = nom;
        this.position = position;
        this.direction = Direction.NORD;
    }

    public String getNom(){
        return nom;
    }

    public Position getPosition(){
        return position;
    }

    public Direction getDirection(){
        return direction;
    }
}
