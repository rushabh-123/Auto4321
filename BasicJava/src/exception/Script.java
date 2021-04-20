package exception;

public class Script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String filpath="C://photos//id";
		String imagepath="C://photos//image";
		
		Homepage page=new Homepage();
		
		page.uploadimage(filpath);
	Thread.sleep(2000);
				
		
	}

}
