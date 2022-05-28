
package registroprincipallistasarrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Cristhian
 */
    public class ListaALumnos1  extends ListaAlumnos{
    
      Scanner sc= new Scanner(System.in);
      List<ListaAlumnos> listAlumnos2 = new ArrayList<ListaAlumnos>();//CREACION DE OBJETO DE LISTAS.
    
    public ListaALumnos1() {
        
    }
 
    public ListaALumnos1(int codigoC, int codigoG, String descripcionA,String nombreC) {
       
        this.nombreC = nombreC;
        this.codigoC=codigoC;
        this.codigoG=codigoG;
        this.descripcionA=descripcionA;    }
 
     public void listaAlumnos2(int codigoC, int codigoG, String descripcionA,String nombreC){
        
                        System.out.println("***Ingrese el nombre del Curso: ***");
                         nombreC= sc.next();
                         
                        System.out.println("***Ingrese el codigo del Curso: ***");
                         codigoC = sc.nextInt();
                           
                        System.out.println("***Ingrese el codigo de su Grado: ***");
                         codigoG = sc.nextInt();
                         
                        System.out.println("***Ingrese su descripcion: ***");
                         descripcionA=sc.next();
                         
                         
        
             listAlumnos2.add(new ListaALumnos1(codigoC,codigoG,descripcionA,nombreC));
       
        //return verLista;
    }
     
     public void listaB(){
                 //AQUI SE MUESTRA TODA LA LISTA DE LAS TABLAS DE LAS LISTAS.
        System.out.println("*** Lista Curso ***");
        System.out.println("");
        
        //COLOCO UN FOR PARA REGISTRAR LAS LISTAS.
        for (int i=0; i<listAlumnos2.size(); i++) {
            System.out.println("Nombre del Curso es: " + listAlumnos2.get(i).getNombreC());
            System.out.println("El codigo del Curso es: " + listAlumnos2.get(i).getCodigoC());
            System.out.println("El codigo del Grado es: " + listAlumnos2.get(i).getNombreC());
            System.out.println("La descripcion es: " + listAlumnos2.get(i).getCodigoC());
        }
}
}

