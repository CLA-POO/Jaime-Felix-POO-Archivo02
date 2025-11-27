package miTest;

import miPrincipal.*;

import java.io.File;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Persona p;

    @BeforeAll public static void setUp() {
        try
        {
            File archivoEntrada = new File("personas.csv");
            Scanner flujoArchivoEntrada = new Scanner(archivoEntrada);
            flujoArchivoEntrada.useDelimiter(",|" + System.getProperty("line.separator"));

            p = new Persona(flujoArchivoEntrada.nextInt(),flujoArchivoEntrada.next(),flujoArchivoEntrada.nextInt(),flujoArchivoEntrada.next().charAt(0));
        }
        finally
        {
            flujoArchivoEntrada.close();
        }
    }

    @Test public void testClave() {
        assertTrue(p.getClave()==1);
    }

    @Test public void testNombre() {
        assertTrue(p.getNombre().equals("Adriana"));
    }

    @Test public void testEdad() {
        assertTrue(p.getEdad()==38);
    }

    @Test public void testGenero() {
        assertTrue(p.getGenero()=='F');
    }
}
