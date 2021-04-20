package exceptions;

public class Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="C://photos//id";
        
		String imagePath="C://images//image";
		
		HomePage page=new HomePage();
		
		page.uploadImage(imagePath);
		
		page.uploadProof(filePath);
	}

}
