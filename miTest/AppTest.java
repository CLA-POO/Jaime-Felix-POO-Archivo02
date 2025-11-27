package miTest;

import miPrincipal.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Vector<Persona> p = new Vector<Persona>();

    @BeforeAll public static void setUp() {
        try
        {
            File archivoEntrada = new File("personas.dat");
            FileInputStream flujoArchivoEntrada = new FileInputStream(archivoEntrada);
            ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoArchivoEntrada);

            p = (Vector<Persona>) flujoObjetoEntrada.readObject();
        }
        catch (ClassNotFoundException cnf )
        {
        }
        catch (IOException ioe)
        {            
        }
    }

    @Test public void testClave() {
        assertTrue(p.get(0).getClave()==1);
    }

    @Test public void testNombre() {
        assertTrue(p.get(1).getNombre().equals("Jaime"));
    }

    @Test public void testEdad() {
        assertTrue(p.get(2).getEdad()==34);
    }

    @Test public void testGenero() {
        assertTrue(p.get(0).getGenero()=='F');
    }
}