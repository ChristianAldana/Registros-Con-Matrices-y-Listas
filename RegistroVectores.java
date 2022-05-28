
package registroprincipallistasarrays;
import java.util.Scanner;

/**
 * @author Cristhian
 */
   public class RegistroVectores extends ListaAlumnos{
    
       //Variables de los primeros vectores.
     String nombreCA = "";
     float codigoG;
     float codigoAA;
     float numeroBA;
     String nombreB = "";
     String nombreA = "";
     float codigoCA;
     String descripcionAA ="";
     int datosAlumnosB, datoCursoB;
     String datosAlumnosBA;
     String datoCursoBA;
     int codigoA, numeroB;
     int codigoC, CodigoG;
     String correoA;
    
     //VARIABLES DE LOS VECTORES.
     String[] vectorDatos;
     private int indiceVector;
     String[] vector;
     private String[] registrarDatos;
     String i="";
     
      Scanner sc= new Scanner(System.in);
     
     
     //constructor
     public RegistroVectores(){
        this.nombreA="";
        this.nombreB="";
        this.codigoA=0;
        this.numeroB=0;
        this.codigoC=0;
        this.CodigoG=0;
        this.correoA="";
        
        vectorDatos = new String [100];
         this.indiceVector= 0;  
         
         //SE INICIALIZA EL VECTOR.
         this.registrarDatos(i, i, i, i, numeroB, i, i, i, numeroB);
         this.registrarDatos2(i, i, i, i, nombreA, i, i, i, nombreA);
         this.registrarDatos3(i, i, i, i, nombreA, i, i, i, nombreA);
         this.registrarDatos4(i, i, i, i, numeroB, i, i, i, numeroB);
         this.registrarDatos5(i, listaA, i, listaA, listaA);
     }
     
   
     
     public void datosAlumnos2 (String nombreA, String nombreB, int numeroB, int codigoA, String correoA){
         
                        System.out.println("***Ingrese el nombre del alumno: ***");
                          nombreA=sc.next();
 
                        System.out.println("***Ingrese el aleas del alumno: ***");
                         nombreB=sc.next();
                         
                        System.out.println("***Ingrese su numero del telefono: ***");
                         numeroB= sc.nextInt();
                         
                        System.out.println("***Ingrese el codigo del alumno: ***");
                         codigoA = sc.nextInt();
                         
                         
                        System.out.println("***Ingrese el correo del alumno: ***");
                         correoA = sc.next();
                         
              //REGRISTRAR LOS DATOS DE LOS DATOS INGRESADOS EN LOS VECTORES EN ORDEN.           
            this.registrarDatos2("Datos: ","","nombreDeAlumno: ","",nombreA ,""," aleasDeAlumno: ","",nombreB);
            this.registrarDatos("Datos: ","","numeroDeTelefono: ","",numeroB ,""," codigoDeAlumno: ","",codigoA);
            this.registrarDatos5("Datos: ","","correoDelAlumno: ","",correoA);
    
     }
     
       
       
        public void datosCursos2(String nombreC, String descripcionA, int codigoC, int codigoG  ){
            
               
                        System.out.println("***Ingrese el nombre de su curso: ***");
                         nombreC=sc.next();
 
                      
                        System.out.println("***Ingrese su descripcion: ***");
                         descripcionA=sc.next();
                         
                        System.out.println("***Ingrese el codigo de su curso: ***");
                         codigoC = sc.nextInt();
                         
                        System.out.println("***Ingrese el codigo de su grado: ***");
                         codigoG = sc.nextInt();
           
               
                //REGRISTRAR LOS DATOS DE LOS DATOS INGRESADOS EN LOS VECTORES EN ORDEN.           
       
               this.registrarDatos3("Datos: ","","nombreDelCurso: ","",nombreC ,"......"," descripcionDelCurso: ","", descripcionA);
               this.registrarDatos4("Datos: ","","codigoDelCurso: ","",codigoC ,"......"," codigoDeGrado: ","", codigoG);
      
       }
     
   //CONSTRUCTORES.
   public void registrarDatos(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro, String espacio3, String tipo3, String espacio4, int segundoParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro+""+espacio3+""+tipo3+espacio4+""+segundoParametro;
   
    }
   
   public void registrarDatos2(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro, String espacio3, String tipo3, String espacio4, String segundoParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro+""+espacio3+""+tipo3+espacio4+""+segundoParametro;
   
    }
   
    public void registrarDatos3(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro, String espacio3, String tipo3, String espacio4, String segundoParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro+""+espacio3+""+tipo3+espacio4+""+segundoParametro;
   
    }
    
     public void registrarDatos4(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro, String espacio3, String tipo3, String espacio4, int segundoParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro+""+espacio3+""+tipo3+espacio4+""+segundoParametro;
   
    }
     
     public void registrarDatos5(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
     
      public void mostrarDatos(){
          try{   
              System.out.println(vectorDatos.length);
            for (int i=1; i<vectorDatos.length;i++){
                if(vectorDatos[i]!=null){
                    System.out.println(vectorDatos[i]);
                }
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
     }

       public void almacenarDatos(String numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }
 
       }      

