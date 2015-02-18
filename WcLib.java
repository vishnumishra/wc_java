public class WcLib{
	public int countWords(String str){
		String words[];
		words = str.split("\\s+");
		return words.length;
	}
	public int countLines(String str){
		int count=0;
		for(char ch:str.toCharArray()){
			if(ch =='\n')
				count++;
		}
		return count;
	}
	public int countChar(String str){
 	return str.length();
	}
}