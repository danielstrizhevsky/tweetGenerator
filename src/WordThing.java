import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;


public class WordThing {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("input.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while (scan.hasNext()){
			list.add(scan.next());
		}
		scan.close();
		for (int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		
	}
	public static TreeMap<String, Integer> getProbabilities(ArrayList<String> list){
		TreeMap<String, Integer> probabilities = new TreeMap<String, Integer>();
		for (int i = 0; i < list.size(); i++){
			if (! probabilities.containsKey(list.get(i))) {
				probabilities.put(list.get(i), 1);
			} else {
				probabilities.put(list.get(i), (int)probabilities.get(list.get(i)) + 1);
			}
		}
		return probabilities;
	}
	
	public static String nextWord(ArrayList<String> list) {
		int totalWords = list.size();
		return "";
	}
}
