import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
class Exception_handling{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        File file=new File("test.txt");
        FileReader reader=new FileReader(file);
    }
}