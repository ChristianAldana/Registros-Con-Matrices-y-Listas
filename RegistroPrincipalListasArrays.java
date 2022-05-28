/*
christian Aldana 
 */
package registroprincipallistasarrays;
import java.util.ArrayList;
import java.util.Scanner;

/**
  @author Cristhian
 */
public class RegistroPrincipalListasArrays {

    public static void main(String[] args) {
        
        //OBJETOS
        Scanner sc= new Scanner(System.in);
         RegistroVectores registroV= new RegistroVectores();//Los registros de los vectores.
         RegistroPrincipalListasArrays alumnosNuevos=new RegistroPrincipalListasArrays();//Registros de las listas.
         ListaAlumnos listAlumnosB =new ListaAlumnos(); //LISTAS DE LOS ALUMNOS
         ListaALumnos1 listAlumnosB2 =new ListaALumnos1(); //2DA LISTA DE LOS ALUMNOS.
         
          int opcion =0;
          
         do{
              System.out.println("***Bienvenido al programa de registro de AlumnosBA***");
              System.out.println("Seleccione la opcion de registro que desee utilizar: ");
              System.out.println("1. Registro de datos con arrays"); 
              System.out.println("2. Registro de datos con listas"); 
              System.out.println("3. MostrarHistorial Arrays");
              System.out.println("4. MostrarHistorial Listas ");
              System.out.println("0. Salir");
              
              
              System.out.println("Ingrese la opcion que desea usar: ");
                  opcion =sc.nextInt();
                  
              switch(opcion){
                 
                 case 1:
                     
                     int opcionA = 0;
                     
                     do{
                         
                       System.out.println("***Bienvenido usuario seleccione la opcion a registrar: ***");
                       System.out.println("1 Datos alumnnos");
                       System.out.println("2. Datos del cursos"); 
                       System.out.println("0. Volver al inicio");
                       
                     System.out.println("Ingrese la opcion que desea usar: ");
                     opcionA =sc.nextInt();
                     
 
              switch(opcionA){

                case 1:
                    //REGISTRO DE ARRAYS.
                     String nombreA="";
                     String nombreB="";
                     String correoA="";
                     int numeroB=0;
                     int codigoA=0;
                     
                     registroV.datosAlumnos2(nombreA, nombreB, numeroB, codigoA,correoA);
                     
	          break;
                  
                  case 2:
                   //REGISTRO DE ARRAYS
                      String nombreC="";
                      String descripcionA="";
                      int codigoC=0;
                      int CodigoG=0;
                      
                     registroV.datosCursos2(nombreC, descripcionA, codigoC, CodigoG);
 
	          break;
                  
  
                case 0:
                     
	          break;
                }
              
             }while(opcionA!=0);
   
             break;
             
                case 2:
    
                     int opcionAB = 0;
                     
                     do{
                         //SI ELIGE LA OPCION DE LISTA.
                       System.out.println("***Bienvenido usuario seleccione la opcion a registrar: ***");
                       System.out.println("1. Lista alumnno");
                       System.out.println("2. Listar cursos"); 
                       System.out.println("0. Volver al inicio");
                       
                     System.out.println("Ingrese la opcion que desea usar: ");
                     opcionAB =sc.nextInt();
                     
 
              switch(opcionAB){

                case 1:
                    //LLAMAR LISTAS.
                      String nombreA ="";
                      String aleasA="";
                      String correoA="";
                      int telefonoA=0;
                      int codigoA=0;
                      
                     listAlumnosB.listaAlumnos(nombreA, aleasA, correoA,telefonoA,codigoA);
                    
                          

	          break;
                  
                  case 2:
                   //LLAMAR LISTAS
                      String nombreC="";
                      String descripcionA="";
                      int codigoC=0;
                      int CodigoG=0;
                      

                       listAlumnosB2.listaAlumnos2(codigoC, CodigoG,descripcionA,nombreC);
                           
	          break;
                  
   
                case 0:
                     
	          break;
                }
              
             }while(opcionAB!=0);
   
             break;
                     
                 
                case 3:
                  //NOS MUESTRA EL REGISTRO DE DATOS DE LOS ARRAYS
                           registroV.mostrarDatos();

                 break;
                 
                case 4:
                    //NOS MUESTRA EL REGISTRO DE DATOS EN LISTAS.
                          listAlumnosB.lista();
                          listAlumnosB2.listaB();
                     
                 break;
                
                 
                case 0:
                              
                 break;
                 
              }
         
         }while(opcion!=0);        
    
         System.out.println("El programa a finalizado");
    }
}


