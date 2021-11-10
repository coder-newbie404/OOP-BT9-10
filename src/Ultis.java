import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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

    public static void writeFile(List<PhanTu<Integer>> lst) {
        try {
            File myObj = new File("out.txt");
            if (myObj.createNewFile()) {
                FileWriter myWriter = new FileWriter("out.txt");
                for (PhanTu<Integer> i : lst) {
                    myWriter.write(i.getT());
                }
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortPhanTu(List<PhanTu<Integer>> lst) {
    }

    public static void main(String[] args) throws IOException {
        List<Integer> exm = Ultis.readFile(args[0]);
        Collections.sort(exm);

        List<PhanTu<Integer>> test2 = new ArrayList<>();
        while (exm.size() != 0) {
            PhanTu<Integer> test = new PhanTu<>();
            test.setT(exm.remove(0));
            test2.add(test);
        }

        Ultis.writeFile(test2);
    }
}
