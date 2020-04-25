import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static <K, V> void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		BufferedReader br = null;
		Scanner read = new Scanner(System.in);
		Factory<String,String> mapFactory = new Factory<String,String>();
		String line, traducir = "",translation = "", menu, key = "", value = "";
		String[] words = null, translate;
		boolean tmenu;		

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
		
//---------------------Menu
		System.out.println("------- HT9 RBT/Hash_Map---------");
		System.out.println("1. Implementacion por medio de un RBT");
		System.out.println("2. Implementacion por medio de un Hash_Map");
		System.out.print("Ingrese el numero de la opcion que desee probar: ");
		menu = read.nextLine();
		tmenu = MenuInvalido(menu);
		while (tmenu != false) {
			System.out.print("Ingrese nuevamente el numero de la opcion que desee: ");	
			menu = read.nextLine();
			tmenu = MenuInvalido(menu);
		}
		
		iMap<String,String> dictionary = mapFactory.getMap(menu);
		//RedBlackTree<String, String> dictionary = new RedBlackTree<String,String>();
		//Hash_Map<String,String> dictionary = new Hash_Map<String,String>();
		
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
		
		
//---------------------Show the translation
		System.out.println("El texto a traducir es: "+ traducir);
		translate = traducir.split(" ");
		for(int a = 0; a < translate.length; a++) {
			if(dictionary.getValue(translate[a]) != null) {
				
				translation += " " + dictionary.getValue(translate[a]) + " ";
			}else{
			translation += " "+"*"+translate[a]+"*"+" ";
			}
		}
		System.out.println("Test: " + key + " " + value);
		System.out.println("Test1: " + dictionary.getValue("a"));//Prueba de almacenamiento con Hash_Map	
		//System.out.println("Test1: " + dictionary.searchTree("a"));//Prueba de almacenamiento con RBT
		System.out.println("Traduccion:");
		System.out.println(translation);
		System.out.println("Recuerde que las palabras que no se encuentran dentro del diccionario se muestran con un asteristo");
	
	
	}
	
	 public static boolean MenuInvalido(String me) {
		 boolean incorrecto = false;
		 if (!me.equals("1") && !me.equals("2")) 
			 incorrecto = true;
		else 
			incorrecto = false;
		 
		 return incorrecto;
	 }
	
}
