
import java.util.Random;
/**
 * Write a description of class TestAlumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAlumno
{
    // instance variables - replace the example below with your own
    private String[] nombres;
    
    /**
     * Constructor for objects of class TestAlumno
     */
    public TestAlumno()
    {
         nombres = new String[5];
        nombres[0] = "Paco";
        nombres[1] = "David";
        nombres[2] = "Victor";
        nombres[3] = "Adan";
        nombres[4] = "Jesus";
        Alumno alumno1 = creaAlumno();
        Alumno alumno2 = creaAlumno();
        Alumno alumno3 = creaAlumno();
        Alumno alumno4 = creaAlumno();
        Alumno alumno5 = creaAlumno();
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        System.out.println(alumno4.toString());
        System.out.println(alumno5.toString());
        
    }
     public Alumno creaAlumno()
    {
        Random aleatorio = new Random();
        String nombre = nombres[aleatorio.nextInt(5)];
        int edad = aleatorio.nextInt(10) + 15;
        Alumno alumno = new Alumno(nombre, edad);
        int numNotas = aleatorio.nextInt(5) + 2;
        for(int i = 0; i < numNotas; i++)
        {
            alumno.addNota(aleatorio.nextInt(11));
        }
        return alumno;
    }
    
}
