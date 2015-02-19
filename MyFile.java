
import java.io.*;

public class MyFile{
	public static String readFile(String path) {
		FileReader fr = null;
		File myFile = new File(path);
		try{
			fr = new FileReader(myFile);
		}catch(IOException e){
			System.out.println("error is "+e);
		};

		BufferedReader br = new BufferedReader(fr);
		int len = (int)myFile.length();
		char file[] = new char[len];
		try{
			br.read(file,0,len);
		}catch(IOException e){
			System.out.println("error is "+e);
		};

		String fileData = new String(file); 
		return fileData;
	}
}



