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

    public void turnLeft(){
        switch (this.direction) {
            case EST:
                this.direction = Direction.NORD;
                break;
            case SUD:
                this.direction = Direction.EST;
                break;
            case OUEST:
                this.direction = Direction.SUD;
                break;
            case NORD:
                this.direction = Direction.OUEST;
                break;
        }
    }

    public void turnRight(){
        switch (this.direction) {
            case NORD:
                this.direction = Direction.EST;
                break;
            case EST:
                this.direction = Direction.SUD;
                break;
            case SUD:
                this.direction = Direction.OUEST;
                break;
            case OUEST:
                this.direction = Direction.NORD;
                break;
        }
    }

    public void avancer(Map map) {
        switch (this.direction) {
            case NORD:
                if (this.position.getY() < map.getHeight() - 1) {
                    this.position = new Position(this.position.getX(), this.position.getY() + 1);
                }
                break;
            case SUD:
                if (this.position.getY() > 0) {
                    this.position = new Position(this.position.getX(), this.position.getY() - 1);
                }
                break;
            case EST:
                if (this.position.getX() < map.getWidth() - 1) {
                    this.position = new Position(this.position.getX() + 1, this.position.getY());
                }
                break;
            case OUEST:
                if (this.position.getX() > 0) {
                    this.position = new Position(this.position.getX() - 1, this.position.getY());
                }
                break;
        }
    }
}
