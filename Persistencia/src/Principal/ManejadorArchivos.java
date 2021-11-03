package Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ManejadorArchivos
{
   List<String> lineas = new ArrayList<String>();
   
   public void escibirTxt(String unaLinea, String nombreArchivo)
   {
		File f; //representa el archivo txt
		FileWriter escritor; //se usa para escribir en el archivo
		PrintWriter linea; //se usa para escribir lineas en el archivo
		f = new File(nombreArchivo);
		
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			
			escritor = new FileWriter(f, true);
			linea = new PrintWriter(escritor);
			
			linea.println(unaLinea);
			
			linea.close();
			escritor.close();
		}
		catch(Exception ex)
		{
			System.err.println("No se encontro el archivo");
		}
   }
   
   public void leerTxt(String nombreArchivo)
   {
		try
		{
			BufferedReader bReader = new BufferedReader(new FileReader(nombreArchivo));
			String linea = bReader.readLine();
			
			while(linea != null)
			{
				lineas.add(linea);
				linea = bReader.readLine();
			}
			
			bReader.close();
		}
		catch(Exception ex)
		{
			System.err.println("No se encontro el archivo");
		}
   }
   
   public String leerLinea(int posicion)
   {
	   return lineas.get(posicion);
   }
   
   public int tamañoLineas()
   {
	   return lineas.size();
   }
}
