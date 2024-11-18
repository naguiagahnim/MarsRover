package rover;

public class Rover {
    private String nom;
    private Position position;
    private Direction direction;
    private Map map;

    public Rover(String nom, Position position, Direction direction, Map map){
        this.nom = nom;
        this.position = position;
        this.direction = direction;
        this.map = map;
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

    public void move() {
        switch (this.direction) {
            case EST:
                int nouvellePositionE = (this.position.getY() + 1) % map.getWidth();
                this.position.setY(nouvellePositionE);
                break;
            case SUD:
                if(this.position.getX() == 0){
                    this.position.setX(map.getHeight() - 1);
                }
                else {
                    int nouvellePositionS = map.getHeight() - 1 - ((this.position.getX() - 1) % map.getHeight());
                    this.position.setX(nouvellePositionS);
                }
                break;
            case OUEST:
                if(this.position.getY() == 0){
                    this.position.setY(map.getWidth() - 1);
                }
                else {
                    int nouvellePositionO = (this.position.getY() - 1) % map.getWidth();
                    this.position.setY(nouvellePositionO);
                }
                break;
            case NORD:
                int nouvellePositionN = map.getHeight() - 1 - ((this.position.getX() + 1) % map.getHeight());
                this.position.setX(nouvellePositionN);
                break;
        }
    }
}
