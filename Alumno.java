
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    
    private static final int NOTA_APROBADO = 5;
    
    private static int numAlumnosClase = 1;

   
    private String nombre;
  
    private int edad;
   
    private int numeroClase;
   
    private ArrayListInt notas;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        // Inicializamos los atributos
        this.nombre = nombre;
        this.edad = edad;
        numeroClase = numAlumnosClase;
        // Aumentamos el numero de alumnos en clase
        numAlumnosClase += 1;
        notas = new ArrayListInt();
    }

    public void addNota(int nota)
    {
        notas.add(nota);
    }

    
    public int notaMedia()
    {
        int sumatorio = 0;
        // Sumamos todos los elementos del array
        for(int i = 0; i < notas.size(); i++){
            sumatorio += notas.get(i);
        }
        // Devolvemos la media
        return (sumatorio/notas.size());
    }
    
   
    public boolean aprobado()
    {
        return (notaMedia() >= NOTA_APROBADO);
    }
    
    
    public String toString()
    {
        String info = "Nombre: " + nombre + "\nEdad: " + edad + "\nNumero de clase: " + numeroClase +  "\nNota media: " + notaMedia() + " Aprobado: " + aprobado();
        return info;
    }

}

