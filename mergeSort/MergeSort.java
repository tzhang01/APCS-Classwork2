public class MergeSort{
	private char[]deck = new char[52];
	public void sort(char[] deck){
		char[] pile1 = new char [deck.length /2];
		char[] pile2 = new char [deck.length /2];
		for(int i=0;i<pile1.length;i++){
			pile1[i] = deck[i];
		}
		for(int i=0;i<pile2.length;i++){
			pile2[i] = deck[deck.length /2 + i];
		}
		merge(pile1, pile2);
	}
	public void merge(char[] pile1, char[] pile2){
	}
}
