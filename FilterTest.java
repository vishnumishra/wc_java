import org.junit.Test;
import static org.junit.Assert.*;

public class FilterTest{
	String[] argv = {"test_file.txt","Wc.java","-l","-L"};
	@Test
	public void count_the_number_of_words_in_the_string(){
		Filter filter = new Filter(argv);
		String[] files = filter.files;
		assertEquals("test_file.txt",files[0]);
	}
}








