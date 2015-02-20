public class HandleArgs{
	public  String[] files;
	public  WcLib[] wcObj ;

	public HandleArgs(String[]  files) {
		this.files = files;
		this.wcObj = getResult();
	};

	public WcLib[] getResult(){
		WcLib[] results = new WcLib[files.length];
		for(int i=0;i<files.length;i++){
			String content = MyFile.readFile(files[i]);
			results[i] = new WcLib(content);
		}
		return results;
	}
}