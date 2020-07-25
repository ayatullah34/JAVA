import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        int total=0;
        BufferedReader reader=null;

        try {

            reader = new BufferedReader(new FileReader("C:\\Users\\ayatu\\Desktop\\UDEMY\\JAVA\\Javademos\\ReadingFileDemo\\src\\sayilar.txt"));
            String line=null;

            while ((line=reader.readLine())!=null){
                total+=Integer.valueOf(line);
            }

            System.out.println("toplam: "+total);

        }

        catch (Exception e) {
                e.printStackTrace();
        }

        finally {
            try {
                reader.close();
            }
            catch (Exception exception){

            }
        }
    }

    }

