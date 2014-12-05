import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
		nextWord(list, list, 100);
	}

	public static void nextWord(ArrayList<String> reference, ArrayList<String> list, int words) {
		if (words == 0)
			return;
		if (list.size() == 0)
			return;
		int totalWords = list.size();
		int nextIndex = (int) (Math.random() * totalWords);
		System.out.print(list.get(nextIndex) + " ");
		ArrayList<String> newList = new ArrayList<String>();
		for (int i = 0; i < reference.size() - 1; i++){
			if (reference.get(i).equals(list.get(nextIndex))) {
				newList.add(reference.get(i + 1));
			}
		}
		nextWord(reference, newList, words - 1);
	}
}
