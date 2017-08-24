/**
 * @author Guilherme Munaretto
 * Classe destinada a armazenar as informações pertinentes aos Rovers a serem utilizados
 * pela aplicação principal
 */

public class Rover{

    private int xAxis;
    private int yAxis;
    private char position;

    public Rover(int x, int y, char pos){
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

    public char getPosition(){
        return this.position;
    }

    public void setX(int newX){
        this.xAxis = newX;
    }

    public void setY(int newY){
        this.yAxis = newY;
    }

    public void setPosition(char newPosition){
        this.position = newPosition;
    }
    /*
    * Método que realiza o movimento do rover
    * @author Igor Sgorla Brehm
    * @param oneRover objeto Rover contendo posição atual e coordenadas
    * @param aMaxY valor inteiro que indica o maior valor possível para o eixo Y
    * @param aMaxX valor inteiro que indica o maior valor possível para o eixo X
    * @param movement String contendo os movimentos que o Rover deve realizar, se possível
    * @return finalPos String com a posição final e coordenadas do rover após o movimento
    */
    public String move (Rover oneRover, int aMaxY, int aMaxX, String movement){
        int minY = 0;
        int minX = 0;
        int maxY = aMaxY;
        int maxX = aMaxX;
        String movAux = movement;
        if(oneRover.getY() < 0 || oneRover.getX() < 0){//teste de integridade de dados
            return "One Of The Values Is Invalid";
        }
        if(oneRover.getY() > maxY || oneRover.getX() > maxX){//teste de integridade de dados
            return "One Of The Values Is Invalid";
        }
        while(movAux.length() > 0){
            if(oneRover.getPosition() == 'N'){
                if(movAux.charAt(0) == 'L'){
                    oneRover.setPosition('W');
                }
                else if(movAux.charAt(0) == 'R'){
                    oneRover.setPosition('E');
                }
                else if(movAux.charAt(0) == 'M'){
                    if(oneRover.getY() != maxY){
                        oneRover.setY(oneRover.getY()+1);
                    }
                    else{
                        oneRover.setY(0);
                    }
                }
                else{
                    System.out.println("Erro");
                }
            }
            else if(oneRover.getPosition() == 'S'){
                if(movAux.charAt(0) == 'L'){
                    oneRover.setPosition('E');
                }
                else if(movAux.charAt(0) == 'R'){
                    oneRover.setPosition('W');
                }
                else if(movAux.charAt(0) == 'M'){
                    if(oneRover.getY() != 0){
                        oneRover.setY(oneRover.getY()-1);
                    }
                    else{
                        oneRover.setY(maxY);
                    }
                }
                else{
                    System.out.println("Erro");
                }
            }
            else if(oneRover.getPosition() == 'E'){
                if(movAux.charAt(0) == 'L'){
                    oneRover.setPosition('N');
                }
                else if(movAux.charAt(0) == 'R'){
                    oneRover.setPosition('S');
                }
                else if(movAux.charAt(0) == 'M'){
                    if(oneRover.getX() != maxX){
                        oneRover.setX(oneRover.getX()+1);
                    }
                    else{
                        oneRover.setX(0);
                    }
                }
                else{
                    System.out.println("Erro");
                }
            }
            else if(oneRover.getPosition() == 'W'){
                if(movAux.charAt(0) == 'L'){
                    oneRover.setPosition('S');
                }
                else if(movAux.charAt(0) == 'R'){
                    oneRover.setPosition('N');
                }
                else if(movAux.charAt(0) == 'M'){
                    if(oneRover.getX() != 0){
                        oneRover.setX(oneRover.getX()-1);
                    }
                    else{
                        oneRover.setX(maxX);
                    }
                }   
                else{
                    System.out.println("Erro");
                }         
            }
            else{
                System.out.println("Erro");
            }
            movAux = movAux.substring(1,movAux.length());
        }
        String finalPos = Integer.toString(oneRover.getX());
        finalPos = finalPos + " " + Integer.toString(oneRover.getY());
        finalPos = finalPos + " " + oneRover.getPosition();
        return finalPos;
    }
}
