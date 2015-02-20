import org.junit.Test;
import static org.junit.Assert.*;

public class HandleArgsTest{
	String[] files = {"test_file.txt","Wc.java"};
	@Test
	public void HandleArgs_give_the_array_of_wclib_of_all_the_Files_01(){
		HandleArgs hArgs = new HandleArgs(files);
		String[] files =  hArgs.files;
		WcLib[] wcObj = hArgs.wcObj;
		assertEquals("test_file.txt",files[0]);
		assertEquals("Wc.java",files[1]);
	}

	@Test
	public void HandleArgs_give_the_array_of_wclib_of_all_the_Files_02(){
		HandleArgs hArgs = new HandleArgs(files);
		String[] files =  hArgs.files;
		WcLib[] wcObj = hArgs.wcObj;
		assertEquals(5,wcObj[0].countWords());
	}
}


