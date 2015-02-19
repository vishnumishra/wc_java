// import java.io.IOException;

public class Wc{
	public static void main(String[] args){
		String content = MyFile.readFile(args[0]);
		WcLib wc = new WcLib(content);
		
		Printer.printWc(wc,args[0]);

	}
 }