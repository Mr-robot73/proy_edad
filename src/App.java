import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int Edad [],opction,conMj,conEdad,conEdadMy[],conEdadNr[],conHm;
        String Nombre[],sexo[],conNameMy[],conNameNr[];
        float procen;

        Nombre = new String[7];
        Edad = new int[7];
        conNameMy = new String[7];
        conEdadMy = new int[7];
        conEdadNr = new int[7];
        conNameNr = new String[7];
        sexo = new String[2];

        sexo[0] = "mujer";
        sexo[1] = "hombre";

        conMj = 0;
        conHm = 0;
        conEdad = 0;

        for (int i = 0; i < Nombre.length; i++) {
            Nombre[i] = JOptionPane.showInputDialog("digite su nombre");
            Edad[i] = Integer.parseInt(JOptionPane.showInputDialog("digite su edad"));

            opction = JOptionPane.showOptionDialog(null,"elige tu sexo", "menu", 0, JOptionPane.QUESTION_MESSAGE, null, sexo,null);

            if(opction == 0){
                conMj++;
            }else{
                conHm++;
            }
            if(Edad[i] >= 18){
                conEdad++;
                conNameMy[i] = Nombre[i];
                conEdadMy[i] = Edad[i];
            }else if(Edad[i] < 18 && Edad[i] > 0){
                conEdadNr[i] = Edad[i];
                conNameNr[i] = Nombre[i];
            }
        }

        procen = (conMj * 100)/(conHm + conMj) ;

        for(int i = 0; i<conNameMy.length;i++){
            JOptionPane.showMessageDialog(null,"mayor\n"+"Nombre: " + conNameMy[i] + "edad: "+ conEdadMy[i]+"menor\n"+"Nombre: "+conNameNr[i]+" edad: "+conEdadNr[i]);
        }
        JOptionPane.showMessageDialog(null,"la cantidad de mayores de edad es: "+conEdad);
        JOptionPane.showMessageDialog(null,"el promedio de mujers es: "+procen);
    }
}
