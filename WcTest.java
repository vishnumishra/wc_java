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
	@Test
	public void line_give_the_number_of_line_in_the_text(){
		WcLib wc = new WcLib();
		assertEquals(1,wc.countLines(str));
	}
	@Test
	public void line_give_the_number_of_line_in_the_text_1(){
		WcLib wc = new WcLib();
		String st = "Welcome to \r\n the \r\n world\r\n of \r\njava\r\n\r\n\r\n";
		assertEquals(7,wc.countLines(st));
	}
	@Test
	public void count_the_number_of_characters_in_the_string(){
		WcLib wc = new WcLib();
		String st = "Welcome to \r\n the \r\n world\r\n of \r\njava";
		assertEquals(38,wc.countChar(st));
	}
	@Test 
	public void count_the_number_of_characters_in_a_string_2(){
		WcLib wc = new WcLib();
		assertEquals(4,wc.countChar("\r\n\r\n"));
	}
	@Test
	public void count_the_number_of_characters_in_a_string_3(){
		WcLib wc = new WcLib();
		assertEquals(0,wc.countChar(""));
	}	
}