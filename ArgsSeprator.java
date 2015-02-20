import java.io.File;

public class ArgsSeprator {
	public  String[] files;
	public  String[] flags;
	private String[] argvs;

	public ArgsSeprator(String[] argv){
		this.argvs = argv;
		this.files = getFiles();
		this.flags = getFlags();
	};

	private boolean isValidFlag(String str){
		String validFlags[] = {"-l","-L","-w","-c"};
		for(String flag:validFlags){
			if(flag == str) return true;
		}
		return false;
	}

	public String[] getFlags(){
	String[] flags = new String[argvs.length];
		int i=0;
		for(String argv:argvs ){
			if(isValidFlag(argv)){
				flags[i] = argv;
				i++;
			}
		}
		return flags;
	}

	public String[] getFiles(){
	String[] files = new String[argvs.length];
		int i=0;
		for(String argv:argvs ){
			if(new File(argv).isFile()){
				files[i] = argv;
				i++;
			}
		}
		return files;
	}

}