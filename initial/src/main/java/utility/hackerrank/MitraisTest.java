package utility.hackerrank;

public class MitraisTest {

	public static String longestEvenWord(String sentence) {
		// Write your code here

		String[] strArray = sentence.split(" ");
		int evenWordIdx = 0;
		int evenWordLength = 0;
		
		for (int i = 0; i < strArray.length; i++) {
			String word = strArray[i];
			
			if(word.length() % 2 == 0){
				if(evenWordLength == 0){
					evenWordIdx = i;
					evenWordLength = word.length();
				}else{
					if(word.length() > evenWordLength){
						evenWordIdx = i;
						evenWordLength = word.length();
					}else if(word.length() == evenWordLength){
						continue;
					}
				}
				
				
			}else{
				continue;
			}
		}
		
		if(evenWordLength > 0){
			return strArray[evenWordIdx];
		}else{
			return "00";
		}

	}
	
	public static void main(String[] args) {
//		System.out.println(longestEvenWord("It is pleasant pleasantss day today"));
		
		System.out.println(longestEvenWord("It is"));
	}

}
