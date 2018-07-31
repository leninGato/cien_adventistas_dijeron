package cien_adventistas_dijeron;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 * @web http://www.jc-mouse.net
 * @author Mouse
 * @author OÑAS-SYSTEM
 * @version 1.0
 */
public class xFichero {

    private JFileChooser fileChooser;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Texto","txt");
    private File file = null;
    private boolean isopen =false;//bandera de control para saber si se abrio un archivo
    private ArrayList contenido = new ArrayList();//almacena los registros leidos de *.txt
    private int index = 0; //lleva control del registro actualmente visible
    //controles swing
 //   private JTextField id;
  //  private JTextField nombre;
  //  private JTextField mail;
  //  private JFrame formulario =new CONTROL();
    
//VARIABLES PRIMERA RONDA
     private JTextField PRE1;
     private JTextField PRE1R1;
      private JTextField PRE1R2;
       private JTextField PRE1R3;
        private JTextField PRE1R4;
         private JTextField PRE1R5;
          private JTextField PRE1R6;
           private JTextField PRE1R7;
            private JTextField PRE1R8;
            private JTextField PUPRE1R1;
      private JTextField PUPRE1R2;
       private JTextField PUPRE1R3;
        private JTextField PUPRE1R4;
         private JTextField PUPRE1R5;
          private JTextField PUPRE1R6;
           private JTextField PUPRE1R7;
            private JTextField PUPRE1R8;
//VARIABLES SEGUNDA RONDA
              private JTextField PRE2;
     private JTextField PRE2R1;
      private JTextField PRE2R2;
       private JTextField PRE2R3;
        private JTextField PRE2R4;
         private JTextField PRE2R5;
          private JTextField PRE2R6;
           private JTextField PRE2R7;
            private JTextField PRE2R8;
            private JTextField PUPRE2R1;
      private JTextField PUPRE2R2;
       private JTextField PUPRE2R3;
        private JTextField PUPRE2R4;
         private JTextField PUPRE2R5;
          private JTextField PUPRE2R6;
           private JTextField PUPRE2R7;
            private JTextField PUPRE2R8;
            //VARIABLES TERCERA RONDA
              private JTextField PRE3;
     private JTextField PRE3R1;
      private JTextField PRE3R2;
       private JTextField PRE3R3;
        private JTextField PRE3R4;
         private JTextField PRE3R5;
          private JTextField PRE3R6;
           private JTextField PRE3R7;
            private JTextField PRE3R8;
            private JTextField PUPRE3R1;
      private JTextField PUPRE3R2;
       private JTextField PUPRE3R3;
        private JTextField PUPRE3R4;
         private JTextField PUPRE3R5;
          private JTextField PUPRE3R6;
           private JTextField PUPRE3R7;
            private JTextField PUPRE3R8;
            //VERIABLES CUARTA RONDA
              private JTextField PRE4;
     private JTextField PRE4R1;
      private JTextField PRE4R2;
       private JTextField PRE4R3;
        private JTextField PRE4R4;
         private JTextField PRE4R5;
          private JTextField PUPRE4R1;  
      private JTextField PUPRE4R2;
       private JTextField PUPRE4R3;
        private JTextField PUPRE4R4;
         private JTextField PUPRE4R5;
      
          
            //VARIABLES QUITA RONDA
              private JTextField PRE5;
     private JTextField PRE5R1;
      private JTextField PRE5R2;
       private JTextField PRE5R3;
      private JTextField PUPRE5R1;
      private JTextField PUPRE5R2;
       private JTextField PUPRE5R3;
        
        
                       
    //Constructor de clase
    public xFichero(){}

    public xFichero(JTextField pre1 , JTextField pre1r1 , JTextField pupre1r1,
            JTextField pre1r2 , JTextField pupre1r2,
            JTextField pre1r3 , JTextField pupre1r3,
            JTextField pre1r4 , JTextField pupre1r4,
            JTextField pre1r5 , JTextField pupre1r5,
            JTextField pre1r6 , JTextField pupre1r6,
            JTextField pre1r7 , JTextField pupre1r7,
            JTextField pre1r8 , JTextField pupre1r8,
            JTextField pre2 , JTextField pre2r1 , JTextField pupre2r1,
            JTextField pre2r2 , JTextField pupre2r2,
            JTextField pre2r3 , JTextField pupre2r3,
            JTextField pre2r4 , JTextField pupre2r4,
            JTextField pre2r5 , JTextField pupre2r5,
            JTextField pre2r6 , JTextField pupre2r6,
            JTextField pre2r7 , JTextField pupre2r7,
            JTextField pre2r8 , JTextField pupre2r8,
            JTextField pre3 , JTextField pre3r1 , JTextField pupre3r1,
            JTextField pre3r2 , JTextField pupre3r2,
            JTextField pre3r3 , JTextField pupre3r3,
            JTextField pre3r4 , JTextField pupre3r4,
            JTextField pre3r5 , JTextField pupre3r5,
            JTextField pre3r6 , JTextField pupre3r6,
            JTextField pre3r7 , JTextField pupre3r7,
            JTextField pre3r8 , JTextField pupre3r8,
            JTextField pre4 , JTextField pre4r1 , JTextField pupre4r1,
            JTextField pre4r2 , JTextField pupre4r2,
            JTextField pre4r3 , JTextField pupre4r3,
            JTextField pre4r4 , JTextField pupre4r4,
            JTextField pre4r5 , JTextField pupre4r5,
            JTextField pre5 , JTextField pre5r1 , JTextField pupre5r1,
            JTextField pre5r2 , JTextField pupre5r2,
            JTextField pre5r3 , JTextField pupre5r3)
    {
        //R1
        this.PRE1=pre1;
this.PRE1R1=pre1r1;
this.PRE1R2=pre1r2; 
this.PRE1R3=pre1r3; 
this.PRE1R4=pre1r4; 
this.PRE1R5=pre1r5; 
this.PRE1R6=pre1r6; 
this.PRE1R7=pre1r7; 
this.PRE1R8=pre1r8; 
this.PUPRE1R1=pupre1r1;
this.PUPRE1R2=pupre1r2; 
this.PUPRE1R3=pupre1r3; 
this.PUPRE1R4=pupre1r4; 
this.PUPRE1R5=pupre1r5; 
this.PUPRE1R6=pupre1r6; 
this.PUPRE1R7=pupre1r7; 
this.PUPRE1R8=pupre1r8;
  //R2
        this.PRE2=pre2;
this.PRE2R1=pre2r1;
this.PRE2R2=pre2r2; 
this.PRE2R3=pre2r3; 
this.PRE2R4=pre2r4; 
this.PRE2R5=pre2r5; 
this.PRE2R6=pre2r6; 
this.PRE2R7=pre2r7; 
this.PRE2R8=pre2r8; 
this.PUPRE2R1=pupre2r1;
this.PUPRE2R2=pupre2r2; 
this.PUPRE2R3=pupre2r3; 
this.PUPRE2R4=pupre2r4; 
this.PUPRE2R5=pupre2r5; 
this.PUPRE2R6=pupre2r6; 
this.PUPRE2R7=pupre2r7; 
this.PUPRE2R8=pupre2r8;
  //R3
        this.PRE3=pre3;
this.PRE3R1=pre3r1;
this.PRE3R2=pre3r2; 
this.PRE3R3=pre3r3; 
this.PRE3R4=pre3r4; 
this.PRE3R5=pre3r5; 
this.PRE3R6=pre3r6; 
this.PRE3R7=pre3r7; 
this.PRE3R8=pre3r8; 
this.PUPRE3R1=pupre3r1;
this.PUPRE3R2=pupre3r2; 
this.PUPRE3R3=pupre3r3; 
this.PUPRE3R4=pupre3r4; 
this.PUPRE3R5=pupre3r5; 
this.PUPRE3R6=pupre3r6; 
this.PUPRE3R7=pupre3r7; 
this.PUPRE3R8=pupre3r8;
  //R4
        this.PRE4=pre4;
this.PRE4R1=pre4r1;
this.PRE4R2=pre4r2; 
this.PRE4R3=pre4r3; 
this.PRE4R4=pre4r4; 
this.PRE4R5=pre4r5; 
this.PUPRE4R1=pupre4r1;
this.PUPRE4R2=pupre4r2; 
this.PUPRE4R3=pupre4r3; 
this.PUPRE4R4=pupre4r4; 
this.PUPRE4R5=pupre4r5; 
  //R5
        this.PRE5=pre5;
this.PRE5R1=pre5r1;
this.PRE5R2=pre5r2; 
this.PRE5R3=pre5r3; 
this.PUPRE5R1=pupre5r1;
this.PUPRE5R2=pupre5r2; 
this.PUPRE5R3=pupre5r3; 

//----------------------------
    //    this.id = id;
    //    this.nombre = nombre;
     //   this.mail = mail;
        System.out.println("Creado por jc-Mouse & OÑAS-SYSTEM");
    }

    //Retorna el nombre del archivo abierto
    public String getFileName()
    {
        if( file != null)
            return file.getName();
        else
            return "Sin_Titulo";
    }

    /* Abre la cja de dialogo Guardar como
        Input: String de la forma "campo1,campo2,campo3"
     */
    public void GuardarComo(String texto)
    {       
       fileChooser = new JFileChooser();
       fileChooser.setFileFilter(filter);
     // fileChooser.setLocation(CONTROL.jRadioButton1.getLocation());
       //si sale erro poner null
       int result = fileChooser.showSaveDialog(null);
      // fileChooser.show
       if ( result == JFileChooser.APPROVE_OPTION ){
                this.isopen = false;
                this.contenido.clear();
                this.index=1;
                if ( escribir( fileChooser.getSelectedFile(),  texto) )
                {
                    JOptionPane.showMessageDialog(null, "Archivo '" + fileChooser.getSelectedFile().getName() + "' Guardado Corectamente ");
                    this.isopen=true;
                }
        }
    }

    /* Actualiza nuevo registro al final de la lista
     * input: String de la forma "campo1,campo2,campo3"
     */
    public void Actualizar(String texto)
    {
        //Si existe archivo abierto
        if( this.file != null)
        {
            if ( escribir( this.file ,  texto) )
            {
                JOptionPane.showMessageDialog(null, "Archivo '" + this.file.getName() + "' Actualizado Satisfactoriamente");
            }                        
        }
        else //sino crear nuevo archivo
        {            
            GuardarComo( texto );
        }
    }

    /* Muestra la ventana de dialogo Abrir archivo
     */
    public void Abrir()
    {
     fileChooser = new JFileChooser();
       fileChooser.setFileFilter(filter);
     // fileChooser.setLocation(CONTROL.jRadioButton1.getLocation());
       //fileChooser.setCurrentDirectory(new java.io.File("e:/")); 
       //si no ficiona poner null
       int result = fileChooser.showOpenDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){
                this.file = fileChooser.getSelectedFile();                
                leer( this.file );
                this.isopen=true;
        }
    }

    /* Función que escribe un registro en el archivo de texto
     * Si el archivo ya contaba con registros re-escribe estos y al final
     * escribe el nuevo registro
     */
    private boolean escribir(File fichero, String texto)
    {
        boolean res=false;        
        PrintWriter writer = null;
        try {
            String f = fichero.toString();
            //verifica que extension exista sino lo agrega
            if(!f.substring( f.length()-4, f.length()).equals(".txt") )
            {
                f = f + ".txt";
                fichero = new File(f);
            }            
            writer = new PrintWriter( fichero );
            //si hay un archivo abierto
            if( this.isopen )
            {   //añade primero linea por linea conenido anterior
                //-----------------------------------------------
                //----------------------------------------------------------
                //acumular lineas
                
               /* Iterator It = contenido.iterator();
                while (It.hasNext())
                {
                    writer.println( It.next() );
                }*/
                //se añade fila de texto al archivo
                writer.println( texto );
                this.contenido.add(texto);
            }
            else //esta guardando por primera vez
            {
                this.contenido.add(texto);
                writer.println( texto );    
            }            
            this.file = fichero;
            writer.close();            
            res = true;
        } catch (FileNotFoundException ex) {
            System.out.println("Error:" + ex);
        } finally {
            writer.close();
        }
        return res;
    }

    /* Lee linea por linea un archivo de texto y almacena los registros
     * en un ArrayList segun orden de lectura
     * input: File
     */
    public boolean leer( File fichero )
    {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fichero));
            this.contenido.clear();
            String linea;
            while ( (linea = reader.readLine() ) != null) {                
                this.contenido.add( linea );
            }
            //muestra el primer registro en la interfaz
            Siguiente();
            return true;
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }  finally {
            try {
                reader.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }
        }
        return false;
    }

    /* funcion qye avanza al siguiente registro del ArrayList y lo muestra en pantalla
     */
    public void Siguiente()
    {
        if( this.file != null )
        {
        //incrementa en 1 la variable "index", si se supera el tamaño de lineas, vuelve a valor 1
        this.index = (index>=contenido.size())? 1 : index + 1;
        int count =1;
        Iterator It = contenido.iterator();
        //comienza busqueda
        while (It.hasNext())
        {
            String tmp = It.next().toString();
            if( count == index)//si lo encuentra asiga valores
            {   //separa el registro por campos. Separador = ","
                String[] datos = tmp.split(",");  
                //R1
                   this.PRE1.setText(datos[0]);
                   this.PRE1R1.setText(datos[1]);
                 this.PUPRE1R1.setText(datos[2]);
                   this.PRE1R2.setText(datos[3]);
                 this.PUPRE1R2.setText(datos[4]);
                   this.PRE1R3.setText(datos[5]);
                 this.PUPRE1R3.setText(datos[6]);
                   this.PRE1R4.setText(datos[7]);
                 this.PUPRE1R4.setText(datos[8]);
                   this.PRE1R5.setText(datos[9]);
                 this.PUPRE1R5.setText(datos[10]);
                   this.PRE1R6.setText(datos[11]);
                 this.PUPRE1R6.setText(datos[12]);
                   this.PRE1R7.setText(datos[13]);
                 this.PUPRE1R7.setText(datos[14]);
                   this.PRE1R8.setText(datos[15]);
                 this.PUPRE1R8.setText(datos[16]);
                 //R2
                   this.PRE2.setText(datos[17]);
                   this.PRE2R1.setText(datos[18]);
                 this.PUPRE2R1.setText(datos[19]);
                   this.PRE2R2.setText(datos[20]);
                 this.PUPRE2R2.setText(datos[21]);
                   this.PRE2R3.setText(datos[22]);
                 this.PUPRE2R3.setText(datos[23]);
                   this.PRE2R4.setText(datos[24]);
                 this.PUPRE2R4.setText(datos[25]);
                   this.PRE2R5.setText(datos[26]);
                 this.PUPRE2R5.setText(datos[27]);
                   this.PRE2R6.setText(datos[28]);
                 this.PUPRE2R6.setText(datos[29]);
                   this.PRE2R7.setText(datos[30]);
                 this.PUPRE2R7.setText(datos[31]);
                   this.PRE2R8.setText(datos[32]);
                 this.PUPRE2R8.setText(datos[33]);
                  //R3
                   this.PRE3.setText(datos[34]);
                   this.PRE3R1.setText(datos[35]);
                 this.PUPRE3R1.setText(datos[36]);
                   this.PRE3R2.setText(datos[37]);
                 this.PUPRE3R2.setText(datos[38]);
                   this.PRE3R3.setText(datos[39]);
                 this.PUPRE3R3.setText(datos[40]);
                   this.PRE3R4.setText(datos[41]);
                 this.PUPRE3R4.setText(datos[42]);
                   this.PRE3R5.setText(datos[43]);
                 this.PUPRE3R5.setText(datos[44]);
                   this.PRE3R6.setText(datos[45]);
                 this.PUPRE3R6.setText(datos[46]);
                   this.PRE3R7.setText(datos[47]);
                 this.PUPRE3R7.setText(datos[48]);
                   this.PRE3R8.setText(datos[49]);
                 this.PUPRE3R8.setText(datos[50]);
                  //R4
                   this.PRE4.setText(datos[51]);
                   this.PRE4R1.setText(datos[52]);
                 this.PUPRE4R1.setText(datos[53]);
                   this.PRE4R2.setText(datos[54]);
                 this.PUPRE4R2.setText(datos[55]);
                   this.PRE4R3.setText(datos[56]);
                 this.PUPRE4R3.setText(datos[57]);
                   this.PRE4R4.setText(datos[58]);
                 this.PUPRE4R4.setText(datos[59]);
                   this.PRE4R5.setText(datos[60]);
                 this.PUPRE4R5.setText(datos[61]);
                  //R5
                   this.PRE5.setText(datos[62]);
                   this.PRE5R1.setText(datos[63]);
                 this.PUPRE5R1.setText(datos[64]);
                   this.PRE5R2.setText(datos[65]);
                 this.PUPRE5R2.setText(datos[66]);
                   this.PRE5R3.setText(datos[67]);
                 this.PUPRE5R3.setText(datos[68]);
                
                  
                /*
                this.id.setText(datos[0]);
                this.nombre.setText(datos[1]);
                this.mail.setText(datos[2]);*/
                break;
            }
            count ++;
        }
        }
    }

}
