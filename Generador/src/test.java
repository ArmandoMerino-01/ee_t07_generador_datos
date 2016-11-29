
import javax.swing.JOptionPane;

/**
 *
 * @author Armando1
 */
public class test {

    public static void main(String[] args) {
         int menu = 0;
        do {
        try {
           
            
            menu = Integer.parseInt(JOptionPane.showInputDialog("----------BIENVENIDO A GENERADOR DE DATOS----------\n\n1.Generar \n2.salir"));

            
             switch (menu) {
             case 1: 
            int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cantidad a generar.?"));
           
            System.out.println("------------------------------------------------------------------------------------------------------------------------"
                    + "-----------------------------------------\nAPELLIDO_P|APELLIDO_M|NOMBRE|DIRECCION|TELEFONO|CORREO_ELECTRONICO\n---------------------------------------------------------------------------------------------------------"
                    +"------------------------------------------------------------");
            Generador ge=new Generador(cantidad);
             ge.LeerArchivos();
             ge.combinar();
             ge.escribirtxt();
             ge.leercombina();
            //ge.getArreglo();
                 break;
                         case 2: 
                            
                        break;
                               
                }
               } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
        }
            } while (menu != 2);
    }
}
