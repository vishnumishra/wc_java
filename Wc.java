
public class Wc{
	public static void main(String[] args){
		String[] files,flags;
		ArgsSeprator argsSep = new ArgsSeprator(args);
		files = argsSep.files;
		flags = argsSep.flags;
		
		HandleArgs handleArgs = new HandleArgs(files);
		WcLib[] wcObj = handleArgs.wcObj;

		Printer.printWc(wcObj,files);
	}
 }