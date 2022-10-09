import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Partido {
    static String [][] equipos= {{"Senegal", "Paises bajos"}, {"Qatar","Senegal"}, {"Qatar","Paises bajos"}, {"Qatar","Ecuador"}, {"Ecuador","Paises Bajos"},  {"Ecuador","Senegal"}, {"Inglaterra","Iran"},  {"Iran","Gales"},  {"Inglaterra","Gales"}, {"USA","Gales"}, {"Inglaterra","USA"}, {"Iran","USA"}, {"argentina","A.Saudita"}, {"A.Saudita","Polonia"}, {"Argentina","Polonia"}, {"Mexico","Polonia"}, {"Argentina","Mexico"}, {"A.Saudita","Mexico"}, {"Dinamarca","Túnez"}, {"Australia","Túnez"}, {"Australia","Dinamarca"}, {"Francia","Australia"}, {"Francia","Dinamarca"}, {"Francia","Túnez"}, {"Alemania","Japon"}, {"Costa Rica","Japon"}, {"España","Japon"}, {"España","Costa Rica"}, {"España","Alemania"}, {"Costa Rica","Alemania"}, {"Marruecos","Croacia"}, {"Belgica","Marruecos"}, {"Belgica","Croacia"}, {"Belgica","Canada"}, {"Canada","Croacia"}, {"Canada","Marruecos"}, {"Suiza","Camerun"}, {"Serbia","Camerun"}, {"Brasil","Camerun"}, {"Brasil","Camerun"}, {"Brasil","Serbia"}, {"Brazil","Suiza"}, {"Serbia","Suiza"}, {"Uruaguay","C. Del Sur"}, {"Ghana","C. Del Sur"}, {"Portugal","C. Del Sur"}, {"Portugal","Ghana"}, {"Portugal","Uruguay"}, {"Portugal","Uruguay"}, {"Ghana","Uruguay"}}; // this is the array that will hold the data;
    public static int[][] resultados = new int[64][3]; // this is the array that will hold the data;

    public static void CreateFile() throws IOException{
         {
            try {
                File myObj = new File("filename.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    public static void WriteToFile(String Result) throws IOException{

            try {
                FileWriter myWriter = new FileWriter("match.txt");
                myWriter.write(Result);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

    public Partido(String[][] equipos, int[][] resultados) {
        this.equipos = equipos;
        this.resultados = resultados;
    }



    public static  void pedirQuiniela(String[][] equipos, int[][] resultados) throws IOException {
        //Pedir los resultados de los partidos
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < equipos.length; i++) {
            System.out.println("Resultado del partido" + i);
            System.out.println("---------------------");
            System.out.println("Goles de: " + equipos[i][0] + ":");
            resultados[i][0] = s.nextInt(); s.nextLine();
            System.out.println("Goles de: " + equipos[i][1] + ":");
            resultados[i][1] = s.nextInt(); s.nextLine();

            String TeamMatch = equipos[i][0] + " - " + equipos[i][1];
            String ResultMatch = resultados[i][0] + " - " + resultados[i][1];
            WriteToFile(TeamMatch + "\n" + ResultMatch);


            //save the results in a file


        }
    }
    public static void imprimeQuiniela(String[][] equipos, int[][] resultados) {
        System.out.println("Impresion de la quiniela");
        System.out.println("------------------------");
        for (int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i][0] + " - " + equipos[i][1] + " ");
            System.out.println("Resultado: ");
            if(resultados[i][0] > resultados[i][1]){
                System.out.println("Gana " + equipos[i][0]);
            }else if(resultados[i][0] < resultados[i][1]){
                System.out.println("Gana " + equipos[i][1]);
            }
            else{
                System.out.println("Empate");
            }
            System.out.println("------------------------");
        }




    }
}
