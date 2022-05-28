
package registroprincipallistasarrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Cristhian
 */
public class ListaAlumnos {

    List<ListaAlumnos> listAlumnos = new ArrayList<ListaAlumnos>();//DECLARACION DEL OBJETO DE LA LISTA.
     Scanner sc= new Scanner(System.in);

    int[] vector;
    private double[] matriz;
    private int indiceVector;
    String listaA;
    String verLista;
    int verLista2;
        
     //VARAIBLES DE LOS CONSTRUCTORES.
     String verNombreA;
     String verNombreB;
     String addAlumnosB;
        int numeroAB;
        String nombreA;
        String aleasA;
        String correoA;
        int telefonoA;
        int codigoA;
        int codigoC;
        String nombreC;
        int codigoG;
        String descripcionA;


    
    public ListaAlumnos() {
        
    }

    public ListaAlumnos(String nombreA, String aleasA, String correoA, int telefonoA, int codigoA) {
       
        this.nombreA = nombreA;
        this.aleasA = aleasA;
        this.correoA=correoA;
        this.telefonoA=telefonoA;
        this.codigoA=codigoA;
    }

    public int getCodigoG() {
        return codigoG;
    }

    public void setCodigoG(int codigoG) {
        this.codigoG = codigoG;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }

    public int getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(int codigoC) {
        this.codigoC = codigoC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }
    
    public int getTelefonoA() {
        return telefonoA;
    }

    public void setTelefonoA(int telefonoA) {
        this.telefonoA = telefonoA;
    }

    public String getCorreoA() {
        return correoA;
    }

    public void setCorreoA(String correoA) {
        this.correoA = correoA;
    }
    
    public String getAleasA() {
        return aleasA;
    }

    public void setAleasA(String aleasA) {
        this.aleasA = aleasA;
    }
    
    
       public int getNumeroAB() {
        return numeroAB;
    }

    public void setNumeroAB(int numeroAB) {
        this.numeroAB = numeroAB;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getCodigoA() {
        return codigoA;
    }

    public void setCodigoA(int codigoA) {
        this.codigoA = codigoA;
    }

    
    public void listaAlumnos(String nombreA, String aleasA, String correoA, int telefonoA, int codigoA){
        
                        System.out.println("***Ingrese el nombre del alumno: ***");
                         nombreA= sc.next();
                         
                        System.out.println("***Ingrese el aleas del alumno: ***");
                         aleasA = sc.next();
                         
                        System.out.println("***Ingrese el correo del alumno: ***");
                         correoA = sc.next();
                         
                        System.out.println("***Ingrese el telefono del alumno: ***");
                         telefonoA = sc.nextInt();
                         
                        System.out.println("***Ingrese el codigo del alumno: ***");
                         codigoA = sc.nextInt();
                         
                         
        
        listAlumnos.add(new ListaAlumnos(nombreA,aleasA,correoA, telefonoA, codigoA));
       
    }
    
    public void lista(){

        //AQUI SE MUESTRA TODA LA LISTA DE LAS TABLAS DE LAS LISTAS.
        System.out.println("***Lista Alumnos***");
        System.out.println("");
        
        //COLOCO UN FOR PARA REGISTRAR LAS LISTAS.
        for (int i=0; i<listAlumnos.size(); i++) {
            System.out.println("Nombre del Alumno es: " + listAlumnos.get(i).getNombreA());
            System.out.println("Aleas del Alumno es: " +  listAlumnos.get(i).getAleasA());
            System.out.println("El correo del Alumno es: " + listAlumnos.get(i).getCorreoA());
            System.out.println("El telefono del Alumno es: " + listAlumnos.get(i).getTelefonoA());
            System.out.println("El codigo del Alumno es: " + listAlumnos.get(i).getCodigoA());
        }
    }
        
}
 

