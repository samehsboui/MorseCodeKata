package fr.runadium.MorseCode;


public class MorseCode  {

	public static String decodeMorse(String input) {
		String result="";
		String[] words= input.trim().split("   ");
		for (int i=0;i<words.length;i++) {
		
		switch (words[i]) {
		case " ":
			i++;
 			break;
			
		case ".-":
			result= result+"A";
			break;
	   case "-...":
		   result= result+"B";
		   break;
	   case "-.-.":
		   result= result+"C";
		   break;
	   case "-..":
		   result= result+"D";
		   break;
	   case ".":
		   result= result+"E";
		   break;
	   case "..-.":
		   result= result+"F";
		   break;
	   case "--.":
		   result= result+"G";
		   break;
	   case "....":
		   result= result+"H";
		   break;
	   case "..":
		   result= result+"I";
		   break;
	   case ".---":
		   result= result+"j";
		   break;
	   case "-.-":
		   result= result+"K";
		   break;
	   case ".-..":
		   result= result+"L";
		   break;
	   case "--":
		   result= result+"M";
		   break;
	   case "-.":
		   result= result+"N";
		   break;
	   case "---":
		   result= result+"O";
		   break;
	   case ".--.":
		   result= result+"P";
		   break;
	   case "--.-":
		   result= result+"Q";
		   break;
	   case ".-.":
		   result= result+"R";
		   break;
	   case "...":
		   result= result+"S";
		   break;
	   case "-":
		   result= result+"T";
		   break;
	   case "..-":
		   result= result+"U";
		   break;
	   case "...-":
		   result= result+"V";
		   break;
	   case ".--":
		   result= result+"W";
		   break;
	   case "-..-":
		   result= result+"X";
		   break;
	   case "-.--":
		   result= result+"Y";
		   break;
	   case "--..":
		   result= result+"Z";
		   break;
	   case ".----":
		   result= result+"1";
		   break;
	   case "..---":
		   result= result+"2";
		   break;
	   case "...--":
		   result= result+"3";
		   break;
	   case "....-":
		   result= result+"4";
		   break;
	   case ".....":
		   result= result+"5";
		   break;
	   case "-....":
		   result= result+"6";
		   break;
	   case "--...":
		   result= result+"7";
		   break;
	   case "---..":
		   result= result+"8";
		   break;
	   case "----.":
		   result= result+"9";
		   break;
	   case "-----":
		   result= result+"0";
		  break; 
		  }
		}
		
		return result;
	}
}
