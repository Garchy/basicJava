package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Map<String, Integer> mapVotes = new TreeMap<>();
		
		System.out.print("Enter file full path: ");
		String strPath = ler.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			String strVotes = br.readLine();
			while (strVotes != null) {
				String[] vect = strVotes.split(",");
				String name = vect[0];
				int votes = Integer.parseInt(vect[1]);
				
				if(mapVotes.containsKey(name)) {
					int sumVotes = mapVotes.get(name);
					mapVotes.put(name, votes + sumVotes);
				}
				else {
					mapVotes.put(name, votes);	
				}								
				strVotes = br.readLine();
			}
			
			for (String cand : mapVotes.keySet()) {
				System.out.println(cand + ", " + mapVotes.get(cand) + " votes");
			}
			
		}
		catch (IOException e) {
			e.getStackTrace();
		}
		
		ler.close();
	}

}
