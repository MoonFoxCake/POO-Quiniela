import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Partido {
    String[][]equipos;
    int[][]resultados;
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

    public static void WriteToFile() throws IOException{

            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
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



    public static  void pedirQuiniela(String[][] equipos, int[][] resultados){
        //Pedir los resultados de los partidos
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < equipos.length; i++) {
            System.out.println("Resultado del partido" + i);
            System.out.println("---------------------");
            System.out.println("Goles de: " + equipos[i][0] + ":");
            equipos[i][0] = s.nextLine();
            resultados[i][0] = s.nextInt(); s.nextLine();
            System.out.println("Goles de: " + equipos[i][1] + ":");
            equipos[i][1] = s.nextLine();

            resultados[i][1] = s.nextInt(); s.nextLine();

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
