package FileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Writingarraytotext {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
OutputStream os=new FileOutputStream("G:\\test.txt");
		int[] Array={4,9,8,7,6};
		for(int i:Array){
			os.write(i);

	}
os.close();
InputStream is=new FileInputStream("G:\\test.txt");
int size=is.available();
for(int j=0;j<size;j++){
	
	System.out.println(is.read());
	
}
	}

}
