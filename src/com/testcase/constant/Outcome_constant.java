package com.testcase.constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Outcome_constant {

	public static List<String> descList(){
		
		List<String> x = new ArrayList<String>(Arrays.asList(

				"must/MD","may/MD","might/MD","should/MD","shall/MD","expect/VB","expects/VBZ","expecting/VBG",
				"expected/VBD","wish/VB","wishes/VBZ","wishing/VBG","whished/VBD","result/NN","results/NNS",
				"resulting/VBG","outcome/NN","outcomes/NNS","goal/NN","goals/NNS","goaled/VBD","final/JJ","finals/NNS",			               
				"finally/RB","finalize/NN","finalizes/NN","finalizing/VBG","finalized/VBD","end/NN","ends/VBZ",
				"ending/VBG","ended/VBD","figure/NN","figures/NNS","figuring/VBG","figured/VBD","achieve/VB",
				"archives/VBZ","achieving/VBG","achieved/VBD","fulfill/VB","fulfills/VBZ","fulfilling/JJ",
				"fulfilled/JJ","satisfy/VB","satisfies/VBZ","satisfying/JJ","satisfied/JJ","meet/VB","meets/VBZ",
				"meeting/NN","met/VBD","predict/VB","predicts/VBZ","predicting/VBG","predicted/VBD","anticipate/VB",
				"anticipates/VBZ","anticipating/VBG","anticipated/JJ","suppose/VB","supposes/VBZ","supposing/VBG",
				"supposed/VBN","product/NN","products/NNS","production/NN","productions/NNS","produce/VB","produces/VBZ",
				"producing/VBG","produced/VBD","solution/NN","solutions/NNS","answer/NN","answers/NNS","answering/VBG","answered/VBD"		  
			
			
				));
		return x;
	}
	
	
	
	public static Map<String,Integer> OutcomewordsPriority(){// Outcome predefined words priority rule
		final Map<String,Integer> outcomeWordsMap = new HashMap<String, Integer>();
		
		
		
		outcomeWordsMap.put("must", 1); 
		outcomeWordsMap.put("may", 1);
		outcomeWordsMap.put("might", 1);
		outcomeWordsMap.put("should", 2);
		outcomeWordsMap.put("shall", 2);
		outcomeWordsMap.put("expect", 3);
		outcomeWordsMap.put("expects", 3);
		outcomeWordsMap.put("expecting", 3);
		outcomeWordsMap.put("expected", 3);
		outcomeWordsMap.put("wish", 4);
		outcomeWordsMap.put("wishes", 4); 
		outcomeWordsMap.put("wishing", 4);
		outcomeWordsMap.put("whished", 4);
		outcomeWordsMap.put("result", 5);
		outcomeWordsMap.put("results", 5);
		outcomeWordsMap.put("resulting", 5);
		outcomeWordsMap.put("outcome", 6);
		outcomeWordsMap.put("outcomes", 6);
		outcomeWordsMap.put("goal", 7);
		outcomeWordsMap.put("goals", 7);
		outcomeWordsMap.put("goaled", 7);
		outcomeWordsMap.put("finally", 8);
		outcomeWordsMap.put("final", 9);
		outcomeWordsMap.put("finals", 9);
		outcomeWordsMap.put("finalize", 10);
		outcomeWordsMap.put("finalizes", 10);
		outcomeWordsMap.put("finalizing", 10);
		outcomeWordsMap.put("finalized", 10);
		outcomeWordsMap.put("end", 11);
		outcomeWordsMap.put("ends", 11);
		outcomeWordsMap.put("ending", 11); 
		outcomeWordsMap.put("ended", 11);
		outcomeWordsMap.put("figure", 12);
		outcomeWordsMap.put("figures", 12);
		outcomeWordsMap.put("figuring", 12);
		outcomeWordsMap.put("figured", 12);
		outcomeWordsMap.put("achieve", 13);
		outcomeWordsMap.put("achieves", 13);
		outcomeWordsMap.put("achieving", 13);
		outcomeWordsMap.put("achieved", 13);
		outcomeWordsMap.put("fulfill", 14); 
		outcomeWordsMap.put("fulfills", 14);
		outcomeWordsMap.put("fulfilling", 14);
		outcomeWordsMap.put("fulfilled", 14);
		outcomeWordsMap.put("satisfy", 15);
		outcomeWordsMap.put("satisfies", 15);
		outcomeWordsMap.put("satisfying", 15);
		outcomeWordsMap.put("satisfied", 15);
		outcomeWordsMap.put("meet", 16);
		outcomeWordsMap.put("meets", 16);
		outcomeWordsMap.put("meeting", 16); 
		outcomeWordsMap.put("met", 16);
		outcomeWordsMap.put("predict", 17);
		outcomeWordsMap.put("predicts", 17);
		outcomeWordsMap.put("predicting", 17);
		outcomeWordsMap.put("predicted", 17);
		outcomeWordsMap.put("anticipate", 18);
		outcomeWordsMap.put("anticipates", 18);
		outcomeWordsMap.put("anticipating", 18);
		outcomeWordsMap.put("anticipated", 18);
		outcomeWordsMap.put("suppose", 19);
		outcomeWordsMap.put("supposes", 19);
		outcomeWordsMap.put("supposing", 19);
		outcomeWordsMap.put("supposed", 19);
		outcomeWordsMap.put("product", 20);
		outcomeWordsMap.put("products", 20);
		outcomeWordsMap.put("production", 20);
		outcomeWordsMap.put("productions", 20);
		outcomeWordsMap.put("produce", 21);
		outcomeWordsMap.put("produces", 21);
		outcomeWordsMap.put("producing", 21);
		outcomeWordsMap.put("produced", 21);
		outcomeWordsMap.put("solution", 22);
		outcomeWordsMap.put("solutions", 22);
		outcomeWordsMap.put("answer", 23);
		outcomeWordsMap.put("answers", 23);
		outcomeWordsMap.put("answering", 23);

	
		return outcomeWordsMap;
	}
	
	
	public static Map<String,Integer> descPriority(){// rule4 & 5 (before & after)
	final Map<String,Integer> descMap = new HashMap<String, Integer>();
	
	
//	descMap.put("scenario/NN", 1);
//	descMap.put("scenarios/NNS", 1);
//	descMap.put("target/NN", 2);
	
	descMap.put("Must/VB", 1);  // prerequisite is predefined verb(VB)
	descMap.put("Must/VBD", 1);  
	descMap.put("Must/VBN", 1);
	descMap.put("Must/VBP", 1);
	descMap.put("Must/VBG", 1);
	
	
	descMap.put("must/VB", 1);  // prerequisite is predefined verb(VB)
	descMap.put("must/VBD", 1);  
	descMap.put("must/VBN", 1);
	descMap.put("must/VBP", 1);
	descMap.put("must/VBG", 1);
	
	descMap.put("Might/VB", 1);  // prerequisite is predefined verb(VB)
	descMap.put("Might/VBD", 1);  
	descMap.put("Might/VBN", 1);
	descMap.put("Might/VBP", 1);
	descMap.put("Might/VBG", 1);
	
	descMap.put("might/VB", 1);  // prerequisite is predefined verb(VB)
	descMap.put("might/VBD", 1);  
	descMap.put("might/VBN", 1);
	descMap.put("might/VBP", 1);
	descMap.put("might/VBG", 1);
	
	descMap.put("may/VB", 1);  // prerequisite is predefined verb(VB)
	descMap.put("may/VBD", 1);  
	descMap.put("may/VBN", 1);
	descMap.put("may/VBP", 1);
	descMap.put("may/VBG", 1);
	
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
	
	
	
	descMap.put("Must/NN", 5);  // prerequisite is predefined verb(VB)
	descMap.put("Must/NNP", 5);  
	descMap.put("Must/DT", 5);
	descMap.put("Must/WP", 5);
	
	descMap.put("must/NN", 5);  // prerequisite is predefined verb(VB)
	descMap.put("must/NNP", 5);  
	descMap.put("must/DT", 5);
	descMap.put("must/WP", 5);
	
	descMap.put("Might/NN", 5);  // prerequisite is predefined verb(VB)
	descMap.put("Might/NNP", 5);  
	descMap.put("Might/DT", 5);
	descMap.put("Might/WP", 5);


	descMap.put("might/NN", 5);  // prerequisite is predefined verb(VB)
	descMap.put("might/NNP", 5);  
	descMap.put("might/DT", 5);
	descMap.put("might/WP", 5);
	
	descMap.put("may/NN", 5);  // prerequisite is predefined verb(VB)
	descMap.put("may/NNP", 5);  
	descMap.put("may/DT", 5);
	descMap.put("may/WP", 5);
	
	descMap.put("Must/RB", 9);
	
	descMap.put("must/RB", 9);
	
	descMap.put("Might/RB", 9);
	
	descMap.put("might/RB", 9);
	
	descMap.put("may/RB", 9);
	
	descMap.put("Should/RB", 9);
	
	descMap.put("should/RB", 9);
	
	descMap.put("Shall/RB", 9);
	
	descMap.put("shall/RB", 9);
	
	
	descMap.put("Must/IN", 17);
	
	descMap.put("must/IN", 17);
	
	descMap.put("Might/IN", 17);
	
	descMap.put("might/IN", 17);
	
	descMap.put("may/IN", 17);
	
	descMap.put("Should/IN", 17);
	
	descMap.put("should/IN", 17);
	
	descMap.put("Shall/IN", 17);
	
	descMap.put("shall/IN", 17);
	
	
	descMap.put("Must/JJ", 25);
	
	descMap.put("must/JJ", 25);
	
	descMap.put("may/JJ", 25);
	
	descMap.put("Should/JJ", 25);
	
	descMap.put("should/JJ", 25);
	
	descMap.put("Shall/JJ", 25);
	
	descMap.put("shall/JJ", 25);
	
	
/////////////////////////////////////////

descMap.put("concentrate/MD", 1);  
descMap.put("concentrates/MD", 1);
descMap.put("concentrating/MD", 1);
descMap.put("concentrated/MD", 18);


descMap.put("concentrate/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("concentrate/VBD", 2);  
descMap.put("concentrate/VBN", 2);
descMap.put("concentrate/VBP", 2);
descMap.put("concentrate/VBG", 2);

descMap.put("concentrates/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("concentrates/VBD", 2);  
descMap.put("concentrates/VBN", 2);
descMap.put("concentrates/VBP", 2);
descMap.put("concentrates/VBG", 2);

descMap.put("concentrating/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("concentrating/VBD", 2);  
descMap.put("concentrating/VBN", 2);
descMap.put("concentrating/VBP", 2);
descMap.put("concentrating/VBG", 2);

descMap.put("concentrated/VB", 19);  // prerequisite is predefined verb(VB)
descMap.put("concentrated/VBD", 19);  
descMap.put("concentrated/VBN", 19);
descMap.put("concentrated/VBP", 19);
descMap.put("appointed/VBG", 2);


descMap.put("concentrate/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("concentrate/NNP", 3);  
descMap.put("concentrate/DT", 3);
descMap.put("concentrate/WP", 3);

descMap.put("concentrates/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("concentrates/NNP", 3);  
descMap.put("concentrates/DT", 3);
descMap.put("concentrates/WP", 3);

descMap.put("concentrating/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("concentrating/NNP", 3);  
descMap.put("concentrating/DT", 3);
descMap.put("concentrating/WP", 3);

descMap.put("concentrated/NN", 21);  // prerequisite is predefined verb(VB)
descMap.put("concentrated/NNP", 21);  
descMap.put("concentrated/DT", 21);
descMap.put("concentrated/WP", 21);


descMap.put("concentrate/RB", 10);
descMap.put("concentrates/RB", 10);
descMap.put("concentrating/RB", 10);



descMap.put("concentrate/IN", 15);
descMap.put("concentrates/IN", 15);
descMap.put("concentrating/IN", 15);



descMap.put("concentrate/JJ", 20);
descMap.put("concentrates/JJ", 20);
descMap.put("concentrating/JJ", 20);



/////////////////////////////////////////

descMap.put("concern/MD", 4);
descMap.put("concerns/MD", 4);
descMap.put("concerning/MD", 1);
descMap.put("concerned/MD", 18);


descMap.put("concern/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("concern/VBD", 6);  
descMap.put("concern/VBN", 6);
descMap.put("concern/VBP", 6);
descMap.put("concern/VBG", 6);


descMap.put("concerns/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("concerns/VBD", 6);  
descMap.put("concerns/VBN", 6);
descMap.put("concerns/VBP", 6);
descMap.put("concerns/VBG", 6);

descMap.put("concerning/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("concerning/VBD", 2);  
descMap.put("concerning/VBN", 2);
descMap.put("concerning/VBP", 2);
descMap.put("concerning/VBG", 2);

descMap.put("concerned/VB", 19);  // prerequisite is predefined verb(VB)
descMap.put("concerned/VBD", 19);  
descMap.put("concerned/VBN", 19);
descMap.put("concerned/VBP", 19);
descMap.put("concerned/VBG", 19);


descMap.put("concern/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("concern/NNP", 7);  
descMap.put("concern/DT", 7);
descMap.put("concern/WP", 7);

descMap.put("concerns/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("concerns/NNP", 7);  
descMap.put("concerns/DT", 7);
descMap.put("concerns/WP", 7);

descMap.put("concerning/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("concerning/NNP", 3);  
descMap.put("concerning/DT", 3);
descMap.put("concerning/WP", 3);

descMap.put("concerned/NN", 21);  // prerequisite is predefined verb(VB)
descMap.put("concerned/NNP", 21);  
descMap.put("concerned/DT", 21);
descMap.put("concerned/WP", 21);


descMap.put("concern/RB", 12);
descMap.put("concerns/RB", 12);
descMap.put("concerning/RB", 10);


descMap.put("concern/IN", 17);
descMap.put("concerns/IN", 17);
descMap.put("concerning/IN", 15);


descMap.put("concern/JJ", 22);
descMap.put("concerns/JJ", 22);
descMap.put("concerning/JJ", 20);


/////////////////////////////////////////

descMap.put("outline/MD", 4);
descMap.put("outlines/MD", 4);
descMap.put("outlining/MD", 1);
descMap.put("outlined/MD", 1);


descMap.put("outline/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("outline/VBD", 6);  
descMap.put("outline/VBN", 6);
descMap.put("outline/VBP", 6);
descMap.put("outline/VBG", 6);


descMap.put("outlines/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("outlines/VBD", 6);  
descMap.put("outlines/VBN", 6);
descMap.put("outlines/VBP", 6);
descMap.put("outlines/VBG", 6);

descMap.put("outlining/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("outlining/VBD", 2);  
descMap.put("outlining/VBN", 2);
descMap.put("outlining/VBP", 2);
descMap.put("outlining/VBG", 2);

descMap.put("outlined/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("outlined/VBD", 2);  
descMap.put("outlined/VBN", 2);
descMap.put("outlined/VBP", 2);
descMap.put("outlined/VBG", 2);


descMap.put("outline/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("outline/NNP", 7);  
descMap.put("outline/DT", 7);
descMap.put("outline/WP", 7);

descMap.put("outlines/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("outlines/NNP", 7);  
descMap.put("outlines/DT", 7);
descMap.put("outlines/WP", 7);

descMap.put("outlining/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("outlining/NNP", 3);  
descMap.put("outlining/DT", 3);
descMap.put("outlining/WP", 3);

descMap.put("outlined/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("outlined/NNP", 3);  
descMap.put("outlined/DT", 3);
descMap.put("outlined/WP", 3);


descMap.put("outline/RB", 12);
descMap.put("outlines/RB", 12);
descMap.put("outlining/RB", 10);
descMap.put("outlined/RB", 10);


descMap.put("outline/IN", 17);
descMap.put("outlines/IN", 17);
descMap.put("outlining/IN", 15);
descMap.put("outlined/IN", 15);


descMap.put("outline/JJ", 22);
descMap.put("outlines/JJ", 22);
descMap.put("outlining/JJ", 20);
descMap.put("outlined/JJ", 20);


	
	return descMap;
	}
}
