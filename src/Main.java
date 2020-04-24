import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		BufferedReader br = null;
		String line, traducir = "", key = "", value = "",translation = "";
		String[] words = null, translate;
		Hash_Map dictionary = new Hash_Map();
		
//---------------------Read the dictionary	
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
					
					//add the association
					dictionary.add(key, value);
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
//-------------------------Read the file to translate
		try {
			fr = new FileReader ("texto.txt");
	        br = new BufferedReader(fr);

	        while((line = br.readLine())!=null)
	        	traducir += line.toLowerCase();
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
		
		
		System.out.println("El texto a traducir es: "+ traducir);
		translate = traducir.split(" ");
		for(int a = 0; a < translate.length; a++) {
			if(dictionary.getValue(translate[a]) != null) {
				
				translation += " " + dictionary.getValue(translate[a]) + " ";
			}else{
			translation += " "+"*"+translate[a]+"*"+" ";
			}
		}
		System.out.println("Traduccion:");
		System.out.println(translation);
		System.out.println("Recuerde que las palabras que no se encuentran dentro del diccionario se muestran con un asteristo");
	
	
	}
	

	
	

}
