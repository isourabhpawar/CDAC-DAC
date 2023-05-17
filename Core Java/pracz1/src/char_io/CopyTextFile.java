package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyTextFile {

	public static void main(String[] args) {
		System.out.println("Enter src file name n dest file name on separate lines");
		try(Scanner sc=new Scanner(System.in);
			//Java App <--- BR <---- FR <--- src file
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				//Java App ---> PW --> FW --> dest test file
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine(),true))
				)
		{
			//read from BR till EOF / EOS(end of stream) --write it to the buffer of PW
			//using FP
			br.lines() //String<String> : lines in the buf
			.forEach(pw::println);//line -> pw.println(line)
			System.out.println("file copy done!");
		} //pw.close --> pw.flush , pw.close , dest file close , br.close , sc.close
		
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
		

	}

}
