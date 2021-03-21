import java.util.Scanner;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		File f = new File("test.txt");

		if(!f.exists()){
			f.createNewFile();
		}else{
			System.out.print("Inserire larghezza rettangolo: ");
			int n = s.nextInt();
      int nbc = n;
      System.out.print("Inserire lunghezza rettangolo: ");
			int m = s.nextInt();
      int mbc = m;
			PrintWriter fw = new PrintWriter(f);
			s.nextLine();
			for(int i = 0; i < n; i++){		
        for(int o = 0; o < m; o++){
          fw.write( "*" );
          System.out.print("*"); /// Per avere un print a visuale del rettangolo
        }
        System.out.print("\n"); /// Per avere un print a visuale del rettangolo
				fw.write("\n" );
        m = mbc;
				}
			fw.close();
		}
	}
}   