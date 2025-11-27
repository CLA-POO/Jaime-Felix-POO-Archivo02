package miPrincipal;

import java.io.Serializable;

public class Persona{
    // Valor de serializacion de la clase. No quitar ni modificar
    private static final long serialVersionUID = 1L;

    // Atributos de la persona
    private int     clave;
    private String  nombre;
    private int     edad;
    private char    genero;
    
    // Constructor
    public Persona( int clave, String nombre, int edad, char genero )
    {
    }

    // Metodos set/get
    public void setClave( int clave )
    {
        // No se valida nada
    }

    public void setNombre( String nombre )
    {
        // No se valida nada
    }

    public void setEdad( int edad )
    {
        // No se valida nada
    }

    public void setGenero( char genero )
    {
    }

    public int getClave()
    {
        return 0;
    }

    public String getNombre()
    {
        return "";
    }

    public int getEdad()
    {
        return 0;
    }

    public char getGenero()
    {
        return 0;
    }

    // Metodo toString()
    public String toString()
    {
        // Anchos de columna:
        // Clave: 5
        // Nombre: 15
        // Edad: 3
        // Genero: 1
        String resultado = String.format("");
        return resultado;
    }
}
