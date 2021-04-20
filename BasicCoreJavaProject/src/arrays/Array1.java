package arrays;

public class Array1 {

	public static void main(String[] args) {
		// name
		@SuppressWarnings("unused")
		String name="Anand";
		
		String[] std= new String[4];
		std[0]="Snehal";
		std[1]="Madhu";
		std[2]="Komal";
		std[3]="Rushabh";
		
		System.out.println(std[2]);
		System.out.println(std.length);
		
		for(int i=0; i<std.length; i++){
			System.out.println(std[i]);
		}

	}

}
