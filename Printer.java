
public class Printer{
	public static  void printWc(WcLib[] wcs,String[] files){

		int words,lines,characters,i=0;
		for(WcLib wc:wcs){
			words = wc.countWords();
			lines = wc.countLines();
			characters = wc.countChar();
			System.out.println("  "+lines +"	"+ words+"	" +characters +" "+files[i++] );
		}
	}
}



