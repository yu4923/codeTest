import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] inp = br.readLine().split(" ");
		
		bw.write(Long.toString(Long.parseLong(inp[0] + inp[1]) + Long.parseLong(inp[2] + inp[3])));
		
		bw.flush();
		bw.close();
	}

}