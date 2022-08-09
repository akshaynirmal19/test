import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class test_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 BufferedReader br = new BufferedReader(new FileReader("ak_1.txt"));

		 String str = br.readLine();
		 
		 while((str = br.readLine())!= null) {
			 
			 StringTokenizer stn = new StringTokenizer(str);
			 String Roll_No = stn.nextToken();
			 
			 String Email = stn.nextToken();
			 
			 String Aadhar_No = stn.nextToken();
			 
		 String  Mobile_No = stn.nextToken();
			 
			 
			 System.out.println("Roll_No : " + Roll_No);
			 System.out.println("Email : " + Email);
			 System.out.println("Aadhar_No : " + Aadhar_No);
			 System.out.println("Mobile_No : " + Mobile_No);
			 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------" );
		 }

	}

}
