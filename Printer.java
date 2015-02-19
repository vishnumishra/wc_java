
public class Printer{
	public static  void printWc(WcLib wc,String path){
		int words,lines,characters;
		words = wc.countWords();
		lines = wc.countLines();
		characters = wc.countChar();
		System.out.println("  "+lines +"	"+ words+"	" +characters +" "+path );
	}
}