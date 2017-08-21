/**
 * @author Guilherme Munaretto
 * Classe destinada a armazenar as informações pertinentes aos Rovers a serem utilizados
 * pela aplicação principal
 */

public class Rover{

    private int xAxis;
    private int yAxis;
    private String position;

    public Rover(int x, int y, String pos){
        this.xAxis = x;
        this.yAxis = y;
        this.position = pos;
    }

    public int getX(){
        return this.xAxis;
    }

    public int getY(){
        return this.yAxis;
    }

    public String getPosition(){
        return this.position;
    }

    public void setX(int newX){
        this.xAxis = newX;
    }

    public void setY(int newY){
        this.yAxis = newY;
    }

    public void setPosition(String newPosition){
        this.position = newPosition;
    }
}
