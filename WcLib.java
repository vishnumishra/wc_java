public class WcLib{
	public int countWords(String str){
		String words[];
		words = str.split("\\s+");
		return words.length;
	}

}