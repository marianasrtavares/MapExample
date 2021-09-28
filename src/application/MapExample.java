package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String, Integer> candidates= new HashMap<>();
		String path= "C:\\Users\\Mariana Tavares\\Java2.txt";
		try(BufferedReader br= new BufferedReader(new FileReader(path))){
			String line=br.readLine();
			while(line!=null) {
				String[]info=line.split(", ");
				String name=info[0];
				Integer vote= Integer.parseInt(info[1]);
				if(candidates.containsKey(name)) {
					vote= vote+candidates.get(name);
				}
				candidates.put(name,vote);
				line=br.readLine();
			}
			
			for(String key: candidates.keySet()) {
				System.out.println(key+", "+candidates.get(key));
				
			}
			
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
