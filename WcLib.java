public class WcLib{
	private  String string;
	public WcLib(String str){
		this.string = str;
	}

	public int countWords(){
		String words[];
		words = string.split("\\s+");
		return words.length;
	}
	public int countLines(){
		int count=0;
		for(char ch:string.toCharArray()){
			if(ch =='\n')
				count++;
		}
		return count;
	}
	public int countChar(){
 		return string.length();
	}
}