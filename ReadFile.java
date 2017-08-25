import java.io.*;

/**
 * Este metodo le o arquivo que contem as posicoes e instrucoes para os Rovers
 * 
 * @author Vinicius Parmeggiani Vianna
 * @param file o arquivo com os dados de posicao e movimentacao dos Rovers
 */
public void readFile(File file){
	try{
		FileReader arq = new FileReader(file);
        	BufferedReader readF = new BufferedReader(arq);
           
        	String lineOne = readF.readLine();//Primeira linha do arquivo
        	String[] tabuleiro = lineOne.split(" ");
        	int maxX = Integer.parseInt(tabuleiro[0]);
        	int maxY = Integer.parseInt(tabuleiro[1]);
        
		String line = readF.readLine();//Segunda linha do arquivo
		while(line != null){
            		String[] positions = line.split(" ");
            		int x = Integer.parseInt(positions[0]);
            		int y = Integer.parseInt(positions[1]);
            		char[] direction = positions[2].toCharArray();
            		Rover rover = new Rover(x,y,direction[0]);
            		
			line = readF.readLine();
            		String result = rover.move(rover, maxY, maxX, line);
            		System.out.println(result);
            
			line = readF.readLine();
        	}
        	arq.close();
    	}
    	catch (IOException e) {
        	System.err.printf("Erro na abertura do arquivo: %s.\n",
        	e.getMessage());
    	}
}
