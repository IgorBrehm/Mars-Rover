import java.io.*;
import java.util.*;
public class Menu{
    public static void main(String[] args){
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("        Este programa implementa a solução para a tarefa do Mars Rover");
        System.out.println("");
        System.out.println("   Por favor, indique o caminho onde está o arquivo com os valores de entrada:");
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File file = new File(path);
        Leitor leitor = new Leitor();
        leitor.readFile(file);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }
}






