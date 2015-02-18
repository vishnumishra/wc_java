import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{
	String str = "this is a good day.\r\n What you think ?";
	@Test
	public void count_the_number_of_words_in_the_string(){
		WcLib wc = new WcLib();
		int words = wc.countWords(str);
		assertEquals(9,words);
	}
	@Test
	public void count_the_number_of_words_in_the_string_1(){
		String st = "Welcome to the world of java";
		WcLib wc = new WcLib();
		assertEquals(6,wc.countWords(st));
	}
	
}