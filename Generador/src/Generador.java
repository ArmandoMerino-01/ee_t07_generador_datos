
/**
 *
 * @author Armando1
 *///Nombre|Direccion|Telefono|correo
import java.io.*;
	 
public class Generador {

    private final String nombre[];
    private final String app[];
    private final String apm[];
    private final String direccion[];
    private final String tel[];
    private final String correo[];
    
    private final String datoCompleto[];
    private final int max;
    
    public Generador(int max){
    this.max=max;
     apm=new String[100]; //150
      app=new String[100];//150
      nombre=new String[100]; //200
      
      direccion=new String[100]; 
      tel=new String[100];
      correo=new String[100]; 
      
      datoCompleto=new String[max];//cadena completa
    }
     
     public void LeerArchivos(){
     File archivo1=null; // nombres inicializamos un nuevo archivo
     File archivo2=null;//apellidos
     File archivo3=null;//apellidos
    
     File archivo4=null;//direccion 
     File archivo5=null;//tel 
     File archivo6=null;//correo
     
     FileReader fr1 = null; //nombre Leemos 
     FileReader fr2 = null;//apellido
     FileReader fr3 = null;//apellido
     
     FileReader fr4 = null; //direccion
     FileReader fr5 = null;//tel
     FileReader fr6 = null;//correo
     
     
     BufferedReader br1 = null; // nombres asignamos 
     BufferedReader br2 = null;//apellido
     BufferedReader br3 = null;//apellido
     
     BufferedReader br4 = null; //direccion
     BufferedReader br5 = null;//tel
     BufferedReader br6 = null;//correo
     //BufferedWriter bw = null;
     try{
         archivo3 = new File ("apellidos.txt");
         archivo2 = new File ("apellidos.txt");
         archivo1 = new File ("nombres.txt");
         archivo4 = new File ("direccion.txt");
         archivo5 = new File ("telefonos.txt");
         archivo6 = new File ("correos.txt");
         
         fr3 = new FileReader (archivo3);
         fr2 = new FileReader (archivo2);
         fr1 = new FileReader (archivo1);
         fr4 = new FileReader (archivo4);//direccion
         fr5 = new FileReader (archivo5);//tel
         fr6 = new FileReader (archivo6);//correo
         
         
         br3 = new BufferedReader(fr3);
         br2 = new BufferedReader(fr2);
         br1 = new BufferedReader(fr1);
         br4 = new BufferedReader(fr4);//dir
         br5 = new BufferedReader(fr5);//tel
         br6 = new BufferedReader(fr6);//correo
         
         String linea1;
         String linea2;
         String linea3;
         String linea4;
         String linea5;
         String linea6;
           int i=0;
         while(i<100){//apellido paterno
           linea3=br3.readLine();
           app[i]=linea3;
           i++;
            }
         
         i=0;
         while(i<100){//apellido materno
           linea2=br2.readLine();
           apm[i]=linea2;
           i++;
            } 
         
            i=0;
         while(i<100){//nombre
            linea1=br1.readLine();
            nombre[i]=linea1;
           i++;
            }  
         
           i=0;
         while(i<100){//direccion
            linea4=br4.readLine();
            direccion[i]=linea4;
           i++;
            }
         
            i=0;
         while(i<100){//tel
            linea5=br5.readLine();
            tel[i]=linea5;
            i++;
            }
         
           i=0;
         while(i<100){//correo
            linea6=br6.readLine();
            correo[i]=linea6;
            i++;
            }
               
     }catch(Exception e){
         System.out.println("epale!");
      }
    }
    
     
       public void combinar(){
     int a;  
     int b;
     int c;
     int d;  
     int e;
     int f;
     for(int i=0;i<max;i++){
         String g=null;
         a=(int)(Math.random()*100);
         b=(int)(Math.random()*100);
         c=(int)(Math.random()*100);
         d=(int)(Math.random()*100);
         e=(int)(Math.random()*100);
         f=(int)(Math.random()*100);//dir,tel,correo
         g=app[a]+","+apm[b]+","+nombre[c]+","+direccion[d]+","+tel[e]+","+correo[f];
         datoCompleto[i]=g;
        } 
    }

    
   public void escribirtxt(){
      FileWriter fichero=null; //escribir en el archivo
      PrintWriter pw=null;
     try{
      fichero=new FileWriter("CONBINACIONES.txt");//nombramos el archivo
       pw=new PrintWriter(fichero);
      for(int i=0;i<max;i++){
         pw.println(datoCompleto[i]);
        }
      fichero.close();
    }catch (Exception e) {
         System.out.println("epale!");
        } 
   }
      
   public void leercombina(){     
     File arch = null;
      FileReader f = null;
      BufferedReader br = null;
      try {
         arch = new File ("CONBINACIONES.txt");
         f = new FileReader (arch);
         br = new BufferedReader(f);
         String linea;
         int conta=0;
         while((linea=br.readLine())!=null){
           System.out.println(linea);
           conta++;    
        }
        System.out.println(conta);
        f.close(); 
        }
      catch(Exception e){
          System.out.println("epale!");
      }
     }  
   //public String[] getArreglo(){
     //return datoCompleto;
    //}  
   }

