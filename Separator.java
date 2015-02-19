import java.io.File;

public class Separator {
	private String[] files;
	private String[] flags;
	private String[] argvs;
	private int i = 0;

	public Separator(String[] argv){
		this.argvs = argv;
		this.files = getFlags(); 		
		this.flags = getFiles(); 		
	};

	private boolean isValidFlag(String str){
		String validFlags[] = {"-l","-L","-w","-c"};
		for(String flag:validFlags){
			if(flag == str) return true;
		}
		return false;
	}

	public String[] getFlags(){
	String[] resultFile = new String[argvs.length];
		for(String argv:argvs ){
			if(isValidFlag(argv)){
				resultFile[i] = argv;
				i++;
			}
		}
		return resultFile;
	}

	public String[] getFiles(){
	String[] resultFile = new String[argvs.length];
		for(String argv:argvs ){
			if(new File(argv).isFile()){
				resultFile[i] = argv;
				i++;
			}
		}
		return resultFile;
	}

}