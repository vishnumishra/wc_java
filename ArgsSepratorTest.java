import org.junit.Test;
import static org.junit.Assert.*;

public class ArgsSepratorTest{
	String[] argv = {"test_file.txt","Wc.java","-l","-L"};
	@Test
	public void ArgsSeprator_seprate_the_files_from_user_input(){
		ArgsSeprator args = new ArgsSeprator(argv);
		String[] files = args.files;
		assertEquals("test_file.txt",files[0]);
	}

	@Test
	public void ArgsSeprator_seprate_the_files_from_user_input_1(){
		ArgsSeprator args = new ArgsSeprator(argv);
		String[] files = args.files;
		assertEquals("Wc.java",files[1]);
	}

	@Test
	public void ArgsSeprator_seprate_the_flag_from_user_input_0(){
		ArgsSeprator args = new ArgsSeprator(argv);
		String[] flags = args.flags;
		assertEquals("-l",flags[0]);
		assertEquals(null,flags[2]);
	}
}






