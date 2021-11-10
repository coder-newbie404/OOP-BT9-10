import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ultis {
    public static List<Integer> readFile(String s) throws FileNotFoundException {
        File file = new File(s);
        Scanner myReader = new Scanner(file);
        List<Integer> lst = new ArrayList<>();
        while (myReader.hasNextLine()) {
            lst.add(Integer.parseInt(myReader.nextLine()));
        }
        return lst;
    }



    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> numArr = Ultis.readFile(args[0]);

        PhanTu<Integer> test = new PhanTu<>();
    }
}
