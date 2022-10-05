import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String[][] equipos = {{"Costa Rica", "Argentina"},{"Alemania", "Brasil"},{"Francia", "España"},{"Italia", "Inglaterra"}};
        int [][] resultados = {{9, 0},{1, 2},{1, 1},{0, 2}};

        //Pedir los resultados de los partidos

        //Impresion de la quiniela
        pedirQuiniela(equipos, resultados);
        imprimeQuiniela(equipos, resultados);

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
