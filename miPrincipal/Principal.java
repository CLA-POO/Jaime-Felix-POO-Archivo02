package miPrincipal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class Principal {
    public static void main(String[] args) {
        System.out.println( "Listado de Personas" );
        System.out.println( "===================" );
        System.out.println();

        // Leer archivo persona.dat
        try
        {
            File archivoEntrada = ;
            FileInputStream flujoArchivoEntrada = ;
            ObjectInputStream flujoObjetoEntrada = ;

            // Crear Vector de tipo Persona

            // Leer el vector del archivo y asignarlo al objeto Vector<Persona>

            // Mostrar los datos de todas las personas

            // Cerrar flujo
        }
        catch (ClassNotFoundException cnfe)
        {
            System.out.println( "Error de clase no encontrada" );
        }
        catch (IOException ioe)
        {
            System.out.println("Error de E/S de archivo");
        }
    }
}