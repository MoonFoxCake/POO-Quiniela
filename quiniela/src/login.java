import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class login {
    private String user;
    private String password;

    public login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void Login(){
        //Ask the user for a username and password

        Scanner s = new Scanner(System.in);
        System.out.println("Username:");
        user = s.nextLine();
        System.out.println("Password:");
        password = s.nextLine();

        //Check if the user exists
        try {
            File myObj = new File("users.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(user + "|" + password)){
                    System.out.println("Welcome " + user);
                    break;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

    }
    }

    public void Register() throws IOException {
        //Ask the user for a username and password

        Scanner s = new Scanner(System.in);
        System.out.println("Username:");
        user = s.nextLine();
        System.out.println("Password:");
        password = s.nextLine();

        //Check if the user exists
        try {
            File myObj = new File("users.txt");
            FileWriter myWriter = new FileWriter("users.txt", true);
            myWriter.write(user + "|" + password);
            myWriter.close();} catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void CreateFile() throws IOException {
        {
            try {
                File myObj = new File("Users.txt");
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

    public static void WriteToFile(String User, String Password) throws IOException{

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(User + "|" + Password);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void ReadFile() throws IOException{

            try {
                File myObj = new File("filename.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

