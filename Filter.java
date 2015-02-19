import java.io.File;

public class Filter {
	public  String[] files;
	public  String[] flags;
	private String[] argvs;
	private int i = 0;

	public Filter(String[] argv){
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
		for(String argv:argvs ){
			// File f = new File(argv);
			
			// System.out.println("fileis:"+argv+"\n");
			// System.out.println("isFile:"+ f.isFile());
			if(new File(argv).isFile()){
				files[i] = argv;
				i++;
			}
		}
		return files;
	}

}