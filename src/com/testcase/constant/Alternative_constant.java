package com.testcase.constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alternative_constant {

	public static List<String> descList(){
		
		List<String> x = new ArrayList<String>(Arrays.asList(
   
"alternative/JJ","alternatives/NNS","alternatively/RB","alternate/JJ","alternates/VBZ","alternating/VBG","alternately/RB",
"should/MD","if/IN","addition/NN","additions/NNS","add/VB","adds/VBZ","adding/VBG","added/VBD","extra/JJ","extras/NNS",
"extend/VB","extends/VBZ","extending/VBG","extended/JJ","beside/IN","besides/IN","further/RB","furthermore/RB",					
"instead/RB","incase/NN","rather/RB"						

			
				));
		return x;
	}

	
	
	public static Map<String,Integer> alternativeWordsPriority(){// Alternative words predefined words priority rule
	final Map<String,Integer> alternaiveWordsMap = new HashMap<String, Integer>();
	


	alternaiveWordsMap.put("alternative", 1);
	alternaiveWordsMap.put("alternatives", 1);  
	alternaiveWordsMap.put("alternatively", 1);  
	alternaiveWordsMap.put("alternate", 2);  
	alternaiveWordsMap.put("alternates", 2);  
	alternaiveWordsMap.put("alternating", 2);  
	alternaiveWordsMap.put("alternately", 2);  
	alternaiveWordsMap.put("should", 3);  
	alternaiveWordsMap.put("if", 4);  
	alternaiveWordsMap.put("addition", 5);  
	alternaiveWordsMap.put("additions", 5);  
	alternaiveWordsMap.put("add", 6);
	alternaiveWordsMap.put("adds", 6);
	alternaiveWordsMap.put("adding", 6);  
	alternaiveWordsMap.put("added", 6);  
	alternaiveWordsMap.put("extra", 7);  
	alternaiveWordsMap.put("extras", 7);  
	alternaiveWordsMap.put("extend", 8);  
	alternaiveWordsMap.put("extends", 8);  
	alternaiveWordsMap.put("extending", 8);  
	alternaiveWordsMap.put("extended", 8);  
	alternaiveWordsMap.put("beside", 9);  
	alternaiveWordsMap.put("besides", 9);  
	alternaiveWordsMap.put("further", 10); 
	alternaiveWordsMap.put("furthermore", 11);
	alternaiveWordsMap.put("instead", 12);  
	alternaiveWordsMap.put("incase", 13);  
	alternaiveWordsMap.put("rather", 14);  
	
	

return alternaiveWordsMap;

	}
	
	
	
	public static Map<String,Integer> descPriority(){// rule4 & 5 (before & after)
	final Map<String,Integer> descMap = new HashMap<String, Integer>();
	
	
	//descMap.put("scenario/NN", 1);
	//descMap.put("scenarios/NNS", 1);
	//descMap.put("target/NN", 2);
	
	
///////////////////////////////////////////////////


descMap.put("alternative/MD", 26);  
descMap.put("alternatives/MD", 6);
descMap.put("alternatively/MD", 10);  



descMap.put("alternative/VB", 27);  // prerequisite is predefined verb(VB)
descMap.put("alternative/VBD", 27);  
descMap.put("alternative/VBN", 27);
descMap.put("alternative/VBP", 27);
descMap.put("alternative/VBG", 27);

descMap.put("alternatives/VB", 7);  // prerequisite is predefined verb(VB)
descMap.put("alternatives/VBD", 7);  
descMap.put("alternatives/VBN", 7);
descMap.put("alternatives/VBP", 7);
descMap.put("alternatives/VBG", 7);

descMap.put("alternatively/VB", 11);  // prerequisite is predefined verb(VB)
descMap.put("alternatively/VBD", 11);  
descMap.put("alternatively/VBN", 11);
descMap.put("alternatively/VBP", 11);
descMap.put("alternatively/VBG", 11);



descMap.put("alternative/NN", 29);  // prerequisite is predefined verb(VB)
descMap.put("alternative/NNP", 29);  
descMap.put("alternative/DT", 29);
descMap.put("alternative/WP", 29);

descMap.put("alternatives/NN", 8);  // prerequisite is predefined verb(VB)
descMap.put("alternatives/NNP", 8);  
descMap.put("alternatives/DT", 8);
descMap.put("alternatives/WP", 8);

descMap.put("alternatively/NN", 13);  // prerequisite is predefined verb(VB)
descMap.put("alternatively/NNP", 13);  
descMap.put("alternatively/DT", 13);
descMap.put("alternatively/WP", 13);


descMap.put("alternative/RB", 31);
descMap.put("alternatives/RB", 14);



descMap.put("alternative/IN", 32);
descMap.put("alternatives/IN", 22);
descMap.put("alternatively/IN", 15);


descMap.put("alternatives/JJ", 30);
descMap.put("alternatively/JJ", 16);





///////////////////////////////////////////////////


descMap.put("alternate/MD", 26);  
descMap.put("alternates/MD", 2);  
descMap.put("alternating/MD", 2);
descMap.put("alternately/MD", 10);  



descMap.put("alternate/VB", 27);  // prerequisite is predefined verb(VB)
descMap.put("alternate/VBD", 27);  
descMap.put("alternate/VBN", 27);
descMap.put("alternate/VBP", 27);
descMap.put("alternate/VBG", 27);

descMap.put("alternates/VB", 3);  // prerequisite is predefined verb(VB)
descMap.put("alternates/VBD", 3);  
descMap.put("alternates/VBN", 3);
descMap.put("alternates/VBP", 3);
descMap.put("alternates/VBG", 3);

descMap.put("alternating/VB", 3);  // prerequisite is predefined verb(VB)
descMap.put("alternating/VBD", 3);  
descMap.put("alternating/VBN", 3);
descMap.put("alternating/VBP", 3);
descMap.put("alternating/VBG", 3);

descMap.put("alternately/VB", 11);  // prerequisite is predefined verb(VB)
descMap.put("alternately/VBD", 11);  
descMap.put("alternately/VBN", 11);
descMap.put("alternately/VBP", 11);
descMap.put("alternately/VBG", 11);



descMap.put("alternate/NN", 29);  // prerequisite is predefined verb(VB)
descMap.put("alternate/NNP", 29);  
descMap.put("alternate/DT", 29);
descMap.put("alternate/WP", 29);

descMap.put("alternates/NN", 4);  // prerequisite is predefined verb(VB)
descMap.put("alternates/NNP", 4);  
descMap.put("alternates/DT", 4);
descMap.put("alternates/WP", 4);

descMap.put("alternating/NN", 4);  // prerequisite is predefined verb(VB)
descMap.put("alternating/NNP", 4);  
descMap.put("alternating/DT", 4);
descMap.put("alternating/WP", 4);

descMap.put("alternately/NN", 13);  // prerequisite is predefined verb(VB)
descMap.put("alternately/NNP", 13);  
descMap.put("alternately/DT", 13);
descMap.put("alternately/WP", 13);


descMap.put("alternate/RB", 31);
descMap.put("alternates/RB", 12);
descMap.put("alternating/RB", 12);



descMap.put("alternate/IN", 32);
descMap.put("alternates/IN", 20);
descMap.put("alternating/IN", 20);
descMap.put("alternately/IN", 15);


descMap.put("alternates/JJ", 28);
descMap.put("alternating/JJ", 28);
descMap.put("alternately/JJ", 16);

//////////////////////////////////////////////////////////////////////////////////

descMap.put("Should/VB", 1);  // prerequisite is predefined verb(VB)
descMap.put("Should/VBD", 1);  
descMap.put("Should/VBN", 1);
descMap.put("Should/VBP", 1);
descMap.put("Should/VBG", 1);

descMap.put("should/VB", 1);  // prerequisite is predefined verb(VB)
descMap.put("should/VBD", 1);  
descMap.put("should/VBN", 1);
descMap.put("should/VBP", 1);
descMap.put("should/VBG", 1);

descMap.put("Shall/VB", 1);  // prerequisite is predefined verb(VB)
descMap.put("Shall/VBD", 1);  
descMap.put("Shall/VBN", 1);
descMap.put("Shall/VBP", 1);
descMap.put("Shall/VBG", 1);

descMap.put("shall/VB", 1);  // prerequisite is predefined verb(VB)
descMap.put("shall/VBD", 1);  
descMap.put("shall/VBN", 1);
descMap.put("shall/VBP", 1);
descMap.put("shall/VBG", 1);


descMap.put("Should/RB", 9);

descMap.put("should/RB", 9);

descMap.put("Shall/RB", 9);

descMap.put("shall/RB", 9);


descMap.put("Should/IN", 17);

descMap.put("should/IN", 17);

descMap.put("Shall/IN", 17);

descMap.put("shall/IN", 17);


descMap.put("Should/JJ", 25);





descMap.put("should/JJ", 25);

descMap.put("Shall/JJ", 25);

descMap.put("shall/JJ", 25);




/////////////////////////////////////////

descMap.put("if/MD", 18);  


descMap.put("if/VB", 19);  // prerequisite is predefined verb(VB)
descMap.put("if/VBD", 19);  
descMap.put("if/VBN", 19);
descMap.put("if/VBP", 19);
descMap.put("if/VBG", 19);


descMap.put("if/NN", 21);  // prerequisite is predefined verb(VB)
descMap.put("if/NNP", 21);  
descMap.put("if/DT", 21);
descMap.put("if/WP", 21);


descMap.put("if/RB", 23);



descMap.put("if/JJ", 24);




///////////////////////////////////////////////////


descMap.put("addition/MD", 6); 
descMap.put("additions /MD", 6);



descMap.put("addition/VB", 7);  // prerequisite is predefined verb(VB)
descMap.put("addition/VBD", 7);  
descMap.put("addition/VBN", 7);
descMap.put("addition/VBP", 7);
descMap.put("addition/VBG", 7);


descMap.put("additions/VB", 7);  // prerequisite is predefined verb(VB)
descMap.put("additions/VBD", 7);  
descMap.put("additions/VBN", 7);
descMap.put("additions/VBP", 7);
descMap.put("additions/VBG", 7);



descMap.put("addition/NN", 8);  // prerequisite is predefined verb(VB)
descMap.put("addition/NNP", 8);  
descMap.put("addition/DT", 8);
descMap.put("addition/WP", 8);



descMap.put("additions/NN", 8);  // prerequisite is predefined verb(VB)
descMap.put("additions/NNP", 8);  
descMap.put("additions/DT", 8);
descMap.put("additions/WP", 8);



descMap.put("addition/RB", 14);
descMap.put("additions/RB", 14);



descMap.put("addition/IN", 22);
descMap.put("additions/IN", 22);



descMap.put("addition/JJ", 30);
descMap.put("additions/JJ", 30);




///////////////////////////////////////////////////


descMap.put("add/MD", 2);  
descMap.put("adds/MD", 2);  
descMap.put("adding/MD", 2);
descMap.put("added/MD", 2);  



descMap.put("add/VB", 3);  // prerequisite is predefined verb(VB)
descMap.put("add/VBD", 3);  
descMap.put("add/VBN", 3);
descMap.put("add/VBP", 3);
descMap.put("add/VBG", 3);

descMap.put("adds/VB", 3);  // prerequisite is predefined verb(VB)
descMap.put("adds/VBD", 3);  
descMap.put("adds/VBN", 3);
descMap.put("adds/VBP", 3);
descMap.put("adds/VBG", 3);

descMap.put("adding/VB", 3);  // prerequisite is predefined verb(VB)
descMap.put("adding/VBD", 3);  
descMap.put("adding/VBN", 3);
descMap.put("adding/VBP", 3);
descMap.put("adding/VBG", 3);

descMap.put("added/VB", 3);  // prerequisite is predefined verb(VB)
descMap.put("added/VBD", 3);  
descMap.put("added/VBN", 3);
descMap.put("added/VBP", 3);
descMap.put("added/VBG", 3);



descMap.put("add/NN", 4);  // prerequisite is predefined verb(VB)
descMap.put("add/NNP", 4);  
descMap.put("add/DT", 4);
descMap.put("add/WP", 4);

descMap.put("adds/NN", 4);  // prerequisite is predefined verb(VB)
descMap.put("adds/NNP", 4);  
descMap.put("adds/DT", 4);
descMap.put("adds/WP", 4);

descMap.put("adding/NN", 4);  // prerequisite is predefined verb(VB)
descMap.put("adding/NNP", 4);  
descMap.put("adding/DT", 4);
descMap.put("adding/WP", 4);

descMap.put("added/NN", 4);  // prerequisite is predefined verb(VB)
descMap.put("added/NNP", 4);  
descMap.put("added/DT", 4);
descMap.put("added/WP", 4);


descMap.put("add/RB", 12);
descMap.put("adds/RB", 12);
descMap.put("adding/RB", 12);
descMap.put("added/RB", 12);



descMap.put("add/IN", 20);
descMap.put("adds/IN", 20);
descMap.put("adding/IN", 20);
descMap.put("added/IN", 20);


descMap.put("add/JJ", 28);
descMap.put("adds/JJ", 28);
descMap.put("adding/JJ", 28);
descMap.put("added/JJ", 28);



///////////////////////////////////////////////////


descMap.put("extra/MD", 26);  
descMap.put("extras/MD", 6);




descMap.put("extra/VB", 27);  // prerequisite is predefined verb(VB)
descMap.put("extra/VBD", 27);  
descMap.put("extra/VBN", 27);
descMap.put("extra/VBP", 27);
descMap.put("extra/VBG", 27);

descMap.put("extras/VB", 7);  // prerequisite is predefined verb(VB)
descMap.put("extras/VBD", 7);  
descMap.put("extras/VBN", 7);
descMap.put("extras/VBP", 7);
descMap.put("extras/VBG", 7);





descMap.put("extra/NN", 29);  // prerequisite is predefined verb(VB)
descMap.put("extra/NNP", 29);  
descMap.put("extra/DT", 29);
descMap.put("extra/WP", 29);

descMap.put("extras/NN", 8);  // prerequisite is predefined verb(VB)
descMap.put("extras/NNP", 8);  
descMap.put("extras/DT", 8);
descMap.put("extras/WP", 8);


descMap.put("extra/RB", 31);
descMap.put("extras/RB", 14);


descMap.put("extra/IN", 32);
descMap.put("extras/IN", 22);


descMap.put("extras/JJ", 30);




///////////////////////////////////////////////////



descMap.put("extend/MD", 2);  
descMap.put("extends/MD", 2);
descMap.put("extending/MD", 2); 
descMap.put("extended/MD", 26);




descMap.put("extend/VB", 3);  // prerequisite is predefined verb(VB)
descMap.put("extend/VBD", 3);  
descMap.put("extend/VBN", 3);
descMap.put("extend/VBP", 3);
descMap.put("extend/VBG", 3);

descMap.put("extends/VB", 3);  // prerequisite is predefined verb(VB)
descMap.put("extends/VBD", 3);  
descMap.put("extends/VBN", 3);
descMap.put("extends/VBP", 3);
descMap.put("extends/VBG", 3);

descMap.put("extending/VB", 3);  // prerequisite is predefined verb(VB)
descMap.put("extending/VBD", 3);  
descMap.put("extending/VBN", 3);
descMap.put("extending/VBP", 3);
descMap.put("extending/VBG", 3);

descMap.put("extended/VB", 27);  // prerequisite is predefined verb(VB)
descMap.put("extended/VBD", 27);  
descMap.put("extended/VBN", 27);
descMap.put("extended/VBP", 27);
descMap.put("extended/VBG", 27);


descMap.put("extend/NN", 4);  // prerequisite is predefined verb(VB)
descMap.put("extend/NNP", 4);  
descMap.put("extend/DT", 4);
descMap.put("extend/WP", 4);

descMap.put("extends/NN", 4);  // prerequisite is predefined verb(VB)
descMap.put("extends/NNP", 4);  
descMap.put("extends/DT", 4);
descMap.put("extends/WP", 4);


descMap.put("extending/NN", 4);  // prerequisite is predefined verb(VB)
descMap.put("extending/NNP", 4);  
descMap.put("extending/DT", 4);
descMap.put("extending/WP", 4);

descMap.put("extended/NN", 29);  // prerequisite is predefined verb(VB)
descMap.put("extended/NNP", 29);  
descMap.put("extended/DT", 29);
descMap.put("extended/WP", 29);



descMap.put("extend/RB", 12);
descMap.put("extends/RB", 12);
descMap.put("extending/RB", 12);
descMap.put("extended/RB", 31);




descMap.put("extend/IN", 20);
descMap.put("extends/IN", 20);
descMap.put("extending/IN", 20);
descMap.put("extended/IN", 32);


descMap.put("extend/JJ", 28);
descMap.put("extends/JJ", 28);
descMap.put("extending/JJ", 28);




/////////////////////////////////////////

descMap.put("beside/MD", 18);  
descMap.put("besides/MD", 18);  


descMap.put("beside/VB", 19);  // prerequisite is predefined verb(VB)
descMap.put("beside/VBD", 19);  
descMap.put("beside/VBN", 19);
descMap.put("beside/VBP", 19);
descMap.put("beside/VBG", 19);

descMap.put("besides/VB", 19);  // prerequisite is predefined verb(VB)
descMap.put("besides/VBD", 19);  
descMap.put("besides/VBN", 19);
descMap.put("besides/VBP", 19);
descMap.put("besides/VBG", 19);



descMap.put("beside/NN", 21);  // prerequisite is predefined verb(VB)
descMap.put("beside/NNP", 21);  
descMap.put("beside/DT", 21);
descMap.put("beside/WP", 21);

descMap.put("besides/NN", 21);  // prerequisite is predefined verb(VB)
descMap.put("besides/NNP", 21);  
descMap.put("besides/DT", 21);
descMap.put("besides/WP", 21);



descMap.put("beside/RB", 23);
descMap.put("besides/RB", 23);



descMap.put("beside/JJ", 24);
descMap.put("besides/JJ", 24);



///////////////////////////////////////////////////


descMap.put("further/MD", 10);  


descMap.put("further/VB", 11);  // prerequisite is predefined verb(VB)
descMap.put("further/VBD", 11);  
descMap.put("further/VBN", 11);
descMap.put("further/VBP", 11);
descMap.put("further/VBG", 11);




descMap.put("further/NN", 13);  // prerequisite is predefined verb(VB)
descMap.put("further/NNP", 13);  
descMap.put("further/DT", 13);
descMap.put("further/WP", 13);


descMap.put("further/IN", 15);


descMap.put("further/JJ", 16);





///////////////////////////////////////////////////


descMap.put("furthermore/MD", 10);  


descMap.put("furthermore/VB", 11);  // prerequisite is predefined verb(VB)
descMap.put("furthermore/VBD", 11);  
descMap.put("furthermore/VBN", 11);
descMap.put("furthermore/VBP", 11);
descMap.put("furthermore/VBG", 11);




descMap.put("furthermore/NN", 13);  // prerequisite is predefined verb(VB)
descMap.put("furthermore/NNP", 13);  
descMap.put("furthermore/DT", 13);
descMap.put("furthermore/WP", 13);


descMap.put("furthermore/IN", 15);


descMap.put("furthermore/JJ", 16);





///////////////////////////////////////////////////


descMap.put("instead/MD", 10);  


descMap.put("instead/VB", 11);  // prerequisite is predefined verb(VB)
descMap.put("instead/VBD", 11);  
descMap.put("instead/VBN", 11);
descMap.put("instead/VBP", 11);
descMap.put("instead/VBG", 11);




descMap.put("instead/NN", 13);  // prerequisite is predefined verb(VB)
descMap.put("instead/NNP", 13);  
descMap.put("instead/DT", 13);
descMap.put("instead/WP", 13);


descMap.put("instead/IN", 15);


descMap.put("instead/JJ", 16);




///////////////////////////////////////////////////



descMap.put("instead/MD", 6);




descMap.put("instead/VB", 7);  // prerequisite is predefined verb(VB)
descMap.put("instead/VBD", 7);  
descMap.put("instead/VBN", 7);
descMap.put("instead/VBP", 7);
descMap.put("instead/VBG", 7);




descMap.put("instead/NN", 8);  // prerequisite is predefined verb(VB)
descMap.put("instead/NNP", 8);  
descMap.put("instead/DT", 8);
descMap.put("instead/WP", 8);


descMap.put("instead/RB", 14);


descMap.put("instead/IN", 22);


descMap.put("additions/JJ", 30);





///////////////////////////////////////////////////


descMap.put("rather/MD", 10);  


descMap.put("rather/VB", 11);  // prerequisite is predefined verb(VB)
descMap.put("rather/VBD", 11);  
descMap.put("rather/VBN", 11);
descMap.put("rather/VBP", 11);
descMap.put("rather/VBG", 11);




descMap.put("rather/NN", 13);  // prerequisite is predefined verb(VB)
descMap.put("rather/NNP", 13);  
descMap.put("rather/DT", 13);
descMap.put("rather/WP", 13);


descMap.put("rather/IN", 15);


descMap.put("rather/JJ", 16);

	
	return descMap;
	}
}
