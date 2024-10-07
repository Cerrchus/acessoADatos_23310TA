package pt2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Creamos el clase
public class Main {
//initializamos nuestro funcion main
	public static void main(String[] args) {
//abrimos un trycatch para aclarar errores que surge al momento de acceder el fichero		
		try(BufferedReader rdr = new BufferedReader(new FileReader("/Users/cerrchus/Computer Science/MEDAC/Year2/tema2_practica.txt"));){
// initializamos linea vacia			
			String line;
// mientras que la linea no esta vacia tira el bucle a lo largo del fichero			
			while((line = rdr.readLine()) != null) {
				
// el ficher tiene lineas que no contiene numeros ni , caracteres y si los encotramos salta a la siguente linea en el fichero
				if (line.contains("</body>") || line.contains("</html>")) {
                    continue; 
                }
// rellenamos un array inicializado para seperar los strings en dos trozos				
				String[] spl = line.split(", ");
				
//cogemos el segundo position [1] y filtramos el cierra de parrafo con un vacio, luego imprimimos el String	
				String numT = spl[1].replace("</p>","").trim();
				String nom = spl[0].replace("<p class=\"p1\">","").trim();
				System.out.println(nom + ": " + numT);
			}
		}
//catches para si no encuentra el fichero y si hubo ioe
		catch(FileNotFoundException e) {
			System.err.println("file not found");
			e.printStackTrace();
		}
		catch(IOException e) {
			System.err.println("IO exception error");
			e.printStackTrace();
		}
		
	
	}
}
