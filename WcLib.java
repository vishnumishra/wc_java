public class WcLib{
	private  String string;
	
	public WcLib(String str){
		this.string = str;
	}

	public int countWords(){
		return string.split("\\s+").length;
	}
	public int countLines() {
		return string.split("\n|\r\n").length-1;
	}
	public int countChar(){
 		return string.length();
	}
}