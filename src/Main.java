import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		BufferedReader br = null;
		String line, key = null, value=null;
		String[] words = null;
		
	
		try {
			fr = new FileReader ("Spanish.txt");
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null) {
				if(line.startsWith("#")) {
					
				}else {
					words = line.split("\t");
					for (int i = 0; i < words.length; i++) {
						if (i%2 == 0)
							key = words[i].trim();
						else if (i%2 == 1)
							value = words[i].replaceAll("[\\[\\]].*", "").replaceAll(",.*", "").trim();
					}
					
					//add
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if( null != fr ){
					fr.close();
				}
			}catch (Exception e){
				e.printStackTrace();
			}

		}
	
	
	}
	

	
	

}
