package com.testcase.constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prerequisite_constant {

	public static List<String> predeifnedList(){
		
		List<String> x = new ArrayList<String>(Arrays.asList(
				"Prerequisite/VB", "prerequisite/NNP","pre-requisite/NN"				
				,"prerequisites/NN","prerequisiting/NN","prerequisiting/VBG",
				"pre-requisiting/NN","precondition/NN","preconditions/NNS","preconditioning/NN","preconditioning/VBG",
				"pre-condition/NN","pre-conditions/NNS","pre-conditioning/NN","prerequire/NN","prerequires/NN","prerequiring/NN",
				"prerequired/NN","pre-require/NN","pre-requires/NN","pre-requiring/NN","pre-required/NN","predefine/NN",
				"predefines/NN","predefining/NN","predefined/NN","pre-define/NN","pre-defines/NN","pre-defining/NN",
				"pre-defined/NN","predescribe/NN","predescribes/NN","predescribing/NN","predescribed/NN","pre-describe/NN",
				"pre-describes/NN","pre-describing/NN","pre-described/NN","Must/MD","must/MD","Might/MD","might/MD",
				"may/MD","Should/MD","should/MD","Shall/MD","shall/MD","Already/RB","already/RB","Before/IN","before/IN",
				"requisite/JJ","requisites/NNS","Requisiting/NN","requisiting/VBG","requisited/VBD","require/VB","require/VBP",
				"requires/VBZ","requiring/VBG","Mandatory/JJ","mandatory/JJ","Need/NN","need/VBP",
				"Needs/NNS","needs/VBZ","Needed/VBN","needed/VBP","Essential/JJ","essential/JJ","Essentials/NNS","essentials/NNS"
				
				));
		return x;
	}

	
	public static Map<String,Integer> predefinedWordPriority(){// rule4 & 5 (before & after) (Grammar rule priority)
		final Map<String,Integer> predefinedWordsMap = new HashMap<String, Integer>();
	
		
		predefinedWordsMap.put("Prerequisite", 1);
		predefinedWordsMap.put("prerequisite", 1);
		predefinedWordsMap.put("pre-requisite", 1);
		predefinedWordsMap.put("prerequisites", 1);
		predefinedWordsMap.put("prerequisiting", 1);
		predefinedWordsMap.put("pre-requisiting", 1);
		predefinedWordsMap.put("precondition", 2);
		predefinedWordsMap.put("preconditions", 2);
		predefinedWordsMap.put("preconditioning", 2);
		predefinedWordsMap.put("pre-condition", 2);
		predefinedWordsMap.put("pre-conditions", 2);
		predefinedWordsMap.put("pre-conditioning", 2);
		predefinedWordsMap.put("prerequire", 3);
		predefinedWordsMap.put("prerequires", 3);
		predefinedWordsMap.put("prerequiring", 3);
		predefinedWordsMap.put("prerequired", 3);
		predefinedWordsMap.put("pre-require", 3);
		predefinedWordsMap.put("pre-requires", 3);
		predefinedWordsMap.put("pre-requiring", 3);
		predefinedWordsMap.put("pre-required", 3);
		predefinedWordsMap.put("predefine", 4);
		predefinedWordsMap.put("predefines", 4);
		predefinedWordsMap.put("predefining", 4);
		predefinedWordsMap.put("predefined", 4);
		predefinedWordsMap.put("pre-define", 4);
		predefinedWordsMap.put("pre-defines", 4);
		predefinedWordsMap.put("pre-defining", 4);
		predefinedWordsMap.put("pre-defined", 4);
		predefinedWordsMap.put("predescribe", 5);
		predefinedWordsMap.put("predescribes", 5);
		predefinedWordsMap.put("predescribing", 5);
		predefinedWordsMap.put("predescribed", 5);
		predefinedWordsMap.put("pre-describe", 5);
		predefinedWordsMap.put("pre-describes", 5);
		predefinedWordsMap.put("pre-describing", 5);
		predefinedWordsMap.put("pre-described", 5);
		predefinedWordsMap.put("Must", 6);
		predefinedWordsMap.put("must", 6);
		predefinedWordsMap.put("Might", 6);
		predefinedWordsMap.put("might", 6);
		predefinedWordsMap.put("may", 6);
		predefinedWordsMap.put("Should", 7);
		predefinedWordsMap.put("should", 7);
		predefinedWordsMap.put("Shall", 7);
		predefinedWordsMap.put("shall", 7);
		predefinedWordsMap.put("Already", 8);
		predefinedWordsMap.put("already", 8);
		predefinedWordsMap.put("Before", 9);		
		predefinedWordsMap.put("before", 9);
		predefinedWordsMap.put("requisite", 10);
		predefinedWordsMap.put("requisites", 10);		
		predefinedWordsMap.put("Requisiting", 10);
		predefinedWordsMap.put("requisiting", 10);
		predefinedWordsMap.put("requisited", 10);		
		predefinedWordsMap.put("require", 11);		
		predefinedWordsMap.put("requires", 11);		
		predefinedWordsMap.put("requiring", 11);
		predefinedWordsMap.put("Mandatory", 12);
		predefinedWordsMap.put("mandatory", 12);
		predefinedWordsMap.put("Need", 13);
		predefinedWordsMap.put("need", 13);
		predefinedWordsMap.put("Needs", 13);
		predefinedWordsMap.put("needs", 13);
		predefinedWordsMap.put("Needed", 13);
		predefinedWordsMap.put("needed", 13);
		predefinedWordsMap.put("Essential", 14);
		predefinedWordsMap.put("essential", 14);
		predefinedWordsMap.put("Essentials", 14);
		predefinedWordsMap.put("essentials", 14);	

		
		
		
		
		return predefinedWordsMap;
		
	}
		
	
	
	
	
	public static Map<String,Integer> predefinedPriority(){// rule4 & 5 (before & after) (Grammar rule priority)
	final Map<String,Integer> predefinedMap = new HashMap<String, Integer>();
	
	
	
	predefinedMap.put("Must/VB", 1);  // prerequisite is predefined verb(VB)
	predefinedMap.put("Must/VBD", 1);  
	predefinedMap.put("Must/VBN", 1);
	predefinedMap.put("Must/VBP", 1);
	predefinedMap.put("Must/VBG", 1);
	
	
	predefinedMap.put("must/VB", 1);  // prerequisite is predefined verb(VB)
	predefinedMap.put("must/VBD", 1);  
	predefinedMap.put("must/VBN", 1);
	predefinedMap.put("must/VBP", 1);
	predefinedMap.put("must/VBG", 1);
	
	predefinedMap.put("Might/VB", 1);  // prerequisite is predefined verb(VB)
	predefinedMap.put("Might/VBD", 1);  
	predefinedMap.put("Might/VBN", 1);
	predefinedMap.put("Might/VBP", 1);
	predefinedMap.put("Might/VBG", 1);
	
	predefinedMap.put("might/VB", 1);  // prerequisite is predefined verb(VB)
	predefinedMap.put("might/VBD", 1);  
	predefinedMap.put("might/VBN", 1);
	predefinedMap.put("might/VBP", 1);
	predefinedMap.put("might/VBG", 1);
	
	predefinedMap.put("may/VB", 1);  // prerequisite is predefined verb(VB)
	predefinedMap.put("may/VBD", 1);  
	predefinedMap.put("may/VBN", 1);
	predefinedMap.put("may/VBP", 1);
	predefinedMap.put("may/VBG", 1);
	
	predefinedMap.put("Should/VB", 1);  // prerequisite is predefined verb(VB)
	predefinedMap.put("Should/VBD", 1);  
	predefinedMap.put("Should/VBN", 1);
	predefinedMap.put("Should/VBP", 1);
	predefinedMap.put("Should/VBG", 1);
	
	predefinedMap.put("should/VB", 1);  // prerequisite is predefined verb(VB)
	predefinedMap.put("should/VBD", 1);  
	predefinedMap.put("should/VBN", 1);
	predefinedMap.put("should/VBP", 1);
	predefinedMap.put("should/VBG", 1);
	
	predefinedMap.put("Shall/VB", 1);  // prerequisite is predefined verb(VB)
	predefinedMap.put("Shall/VBD", 1);  
	predefinedMap.put("Shall/VBN", 1);
	predefinedMap.put("Shall/VBP", 1);
	predefinedMap.put("Shall/VBG", 1);
	
	predefinedMap.put("shall/VB", 1);  // prerequisite is predefined verb(VB)
	predefinedMap.put("shall/VBD", 1);  
	predefinedMap.put("shall/VBN", 1);
	predefinedMap.put("shall/VBP", 1);
	predefinedMap.put("shall/VBG", 1);
	
	
	
	predefinedMap.put("Must/NN", 5);  // prerequisite is predefined verb(VB)
	predefinedMap.put("Must/NNP", 5);  
	predefinedMap.put("Must/DT", 5);
	predefinedMap.put("Must/WP", 5);
	
	predefinedMap.put("must/NN", 5);  // prerequisite is predefined verb(VB)
	predefinedMap.put("must/NNP", 5);  
	predefinedMap.put("must/DT", 5);
	predefinedMap.put("must/WP", 5);
	
	predefinedMap.put("Might/NN", 5);  // prerequisite is predefined verb(VB)
	predefinedMap.put("Might/NNP", 5);  
	predefinedMap.put("Might/DT", 5);
	predefinedMap.put("Might/WP", 5);


	predefinedMap.put("might/NN", 5);  // prerequisite is predefined verb(VB)
	predefinedMap.put("might/NNP", 5);  
	predefinedMap.put("might/DT", 5);
	predefinedMap.put("might/WP", 5);
	
	predefinedMap.put("may/NN", 5);  // prerequisite is predefined verb(VB)
	predefinedMap.put("may/NNP", 5);  
	predefinedMap.put("may/DT", 5);
	predefinedMap.put("may/WP", 5);
	
	predefinedMap.put("Must/RB", 9);
	
	predefinedMap.put("must/RB", 9);
	
	predefinedMap.put("Might/RB", 9);
	
	predefinedMap.put("might/RB", 9);
	
	predefinedMap.put("may/RB", 9);
	
	predefinedMap.put("Should/RB", 9);
	
	predefinedMap.put("should/RB", 9);
	
	predefinedMap.put("Shall/RB", 9);
	
	predefinedMap.put("shall/RB", 9);
	
	
	predefinedMap.put("Must/IN", 18);
	
	predefinedMap.put("must/IN", 18);
	
	predefinedMap.put("Might/IN", 18);
	
	predefinedMap.put("might/IN", 18);
	
	predefinedMap.put("may/IN", 18);
	
	predefinedMap.put("Should/IN", 18);
	
	predefinedMap.put("should/IN", 18);
	
	predefinedMap.put("Shall/IN", 18);
	
	predefinedMap.put("shall/IN", 18);
	
	
	predefinedMap.put("Must/JJ", 27);
	
	predefinedMap.put("must/JJ", 27);
	
	predefinedMap.put("may/JJ", 27);
	
	predefinedMap.put("Should/JJ", 27);
	
	predefinedMap.put("should/JJ", 27);
	
	predefinedMap.put("Shall/JJ", 27);
	
	predefinedMap.put("shall/JJ", 27);
	
//**************** Starting Predefined word called "prerequisite" POS tag occurences ************************
	
/////////// Starting prerequisite(VB) + next word rule //////////////////////////////////////
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
		//Noun (NN)      +	Model Verb (MD)  = Priority 7      
		
		//predefinedMap.put("Prerequisite/MD", 7);
		predefinedMap.put("prerequisite/MD", 6);  
		predefinedMap.put("prerequisites/MD", 6);
		predefinedMap.put("prerequisiting/MD", 6); 
		predefinedMap.put("pre-requisite/MD", 6); 
		predefinedMap.put("pre-requisites/MD", 6); 
		predefinedMap.put("pre-requisiting/MD", 6); 
	

	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     //Verb (VB)  + 	Verb (VB/VBD/VBN/VBP/VBG)    =  Priority 3
	
	predefinedMap.put("prerequisite/VB", 7);  // prerequisite is predefined verb(VB)
	predefinedMap.put("prerequisite/VBD", 7);  
	predefinedMap.put("prerequisite/VBN", 7);
	predefinedMap.put("prerequisite/VBP", 7);
	predefinedMap.put("prerequisite/VBG", 7);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Verb (VB)    + 	 Noun (NN/NNP/DT/WP)    = Priority 3
	
	predefinedMap.put("prerequisite/NN", 8);  // prerequisite is predefined verb(VB)
	predefinedMap.put("prerequisite/NNP", 8);  
	predefinedMap.put("prerequisite/DT", 8);
	predefinedMap.put("prerequisite/WP", 8);
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Verb (VB)   +    Adverb (RB) = priority 12
	
	predefinedMap.put("prerequisite/RB", 14);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Verb (VB)  +    Preposition (IN)  = Priority	18
	
	predefinedMap.put("prerequisite/IN", 23);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Verb (VB)  +   Adjective (JJ)	= Priority 24
	
	predefinedMap.put("prerequisite/JJ", 32);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	/////////// Starting prerequisiting(VBG) + next word rule //////////////////////////////////////
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//Verb (VB)  + 	Verb (VB/VBD/VBN/VBP/VBG)    =  Priority 3
	
	predefinedMap.put("prerequisiting/VB", 3);  // prerequisiting is predefined verb(VBG)
	predefinedMap.put("prerequisiting/VBD", 3);  
	predefinedMap.put("prerequisiting/VBN", 3);
	predefinedMap.put("prerequisiting/VBP", 3);
	predefinedMap.put("prerequisiting/VBG", 3);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Verb (VB)    + 	 Noun (NN/NNP/DT/WP)    = Priority 4
	
	predefinedMap.put("prerequisiting/NN", 4);  // prerequisite is predefined verb(VB)
	predefinedMap.put("prerequisiting/NNP", 4);  
	predefinedMap.put("prerequisiting/DT", 4);
	predefinedMap.put("prerequisiting/WP", 4);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Verb (VB)   +    Adverb (RB) = priority 12
	
	predefinedMap.put("prerequisiting/RB", 12);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Verb (VB)  +    Preposition (IN)  = Priority	18
	
	predefinedMap.put("prerequisiting/IN", 21);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Verb (VB)  +   Adjective (JJ)	= Priority 24
	
	predefinedMap.put("prerequisiting/JJ", 30);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
/////////// Starting prerequisites(NN) + next word rule //////////////////////////////////////
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Noun (NN)      +    	 Verb (VB)  =  priority 6
	
	predefinedMap.put("prerequisites/VB", 7);     // prerequisites is predefined noun(NN)
	predefinedMap.put("prerequisites/VBD", 7);
	predefinedMap.put("prerequisites/VBN", 7);
	predefinedMap.put("prerequisites/VBP", 7);
	predefinedMap.put("prerequisites/VBG", 7);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Noun (NN)    +    Noun (NN) = Priority 8
	
	predefinedMap.put("prerequisites/NN", 8);
	predefinedMap.put("prerequisites/NNP", 8);  
	predefinedMap.put("prerequisites/DT", 8);
	predefinedMap.put("prerequisites/WP", 8);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Noun (NN)    +    Adverb (RB) = Priority 14
	
	predefinedMap.put("prerequisites/RB", 14);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Noun (NN)    +   Preposition (IN)   = Priority 13
	
	predefinedMap.put("prerequisites/IN", 23);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Noun (VB)  +     Adjective (JJ)	= Priority 26
	
	predefinedMap.put("prerequisites/JJ", 32);
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
/////////// Starting prerequisiting(NN) + next word rule //////////////////////////////////////
	
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("prerequisiting/VB", 7);     // prerequisiting is predefined noun(NN)
predefinedMap.put("prerequisiting/VBD", 7);
predefinedMap.put("prerequisiting/VBN", 7);
predefinedMap.put("prerequisiting/VBP", 7);
predefinedMap.put("prerequisiting/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("prerequisiting/NN", 8);
predefinedMap.put("prerequisiting/NNP", 8);  
predefinedMap.put("prerequisiting/DT", 8);
predefinedMap.put("prerequisiting/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("prerequisiting/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Noun (NN)    +   Preposition (IN)   = Priority 20

predefinedMap.put("prerequisiting/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Noun (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("prerequisiting/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

/////////// Starting pre-requisite(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 4

predefinedMap.put("pre-requisite/VB", 7);     // pre-requisite is predefined noun(NN)
predefinedMap.put("pre-requisite/VBD", 7);
predefinedMap.put("pre-requisite/VBN", 7);
predefinedMap.put("pre-requisite/VBP", 7);
predefinedMap.put("pre-requisite/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 5

predefinedMap.put("pre-requisite/NN", 8); 
predefinedMap.put("pre-requisite/NNP", 8);  
predefinedMap.put("pre-requisite/DT", 8);
predefinedMap.put("pre-requisite/WP", 8);
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 9

predefinedMap.put("pre-requisite/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 13

predefinedMap.put("pre-requisite/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-requisite/JJ", 30);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

/////////// Starting pre-requisites(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 4

predefinedMap.put("pre-requisites/VB", 7);     // pre-requisites is predefined noun(NN)
predefinedMap.put("pre-requisites/VBD", 7);
predefinedMap.put("pre-requisites/VBN", 7);
predefinedMap.put("pre-requisites/VBP", 7);
predefinedMap.put("pre-requisites/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 5

predefinedMap.put("pre-requisite/NN", 8); 
predefinedMap.put("pre-requisite/NNP", 8);  
predefinedMap.put("pre-requisite/DT", 8);
predefinedMap.put("pre-requisite/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 9

predefinedMap.put("pre-requisite/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 13

predefinedMap.put("pre-requisite/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-requisite/JJ", 30);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

/////////// Starting pre-requisiting(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 4

predefinedMap.put("pre-requisiting/VB", 7);     // pre-requisiting is predefined noun(NN)
predefinedMap.put("pre-requisiting/VBD", 7);
predefinedMap.put("pre-requisiting/VBN", 7);
predefinedMap.put("pre-requisiting/VBP", 7);
predefinedMap.put("pre-requisiting/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-requisiting/NN", 8); 
predefinedMap.put("pre-requisiting/NNP", 8);  
predefinedMap.put("pre-requisite/DT", 8);
predefinedMap.put("pre-requisiting/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-requisiting/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-requisiting/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-requisiting/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//**************** Ending Predefined word called "prerequisite" POS tag occurences ************************

//-------------------------------------------------------------------------------------------------------------------



//**************** Starting Predefined word called "precondition" POS tag occurences ************************

/////////// Starting preconditioning(VBG) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +	Model Verb (MD)  = Priority 7      

predefinedMap.put("precondition/MD", 6);  
predefinedMap.put("preconditions/MD", 6);
predefinedMap.put("preconditioning/MD", 2); 
predefinedMap.put("pre-condition/MD", 6); 
predefinedMap.put("pre-conditions/MD", 6); 
predefinedMap.put("pre-conditioning/MD", 6); 
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Verb (VB)  + 	Verb (VB/VBD/VBN/VBP/VBG)    =  Priority 1

predefinedMap.put("preconditioning/VB", 3);  // preconditioning is predefined verb(VB)
predefinedMap.put("preconditioning/VBD", 3);  
predefinedMap.put("preconditioning/VBN", 3);
predefinedMap.put("preconditioning/VBP", 3);
predefinedMap.put("preconditioning/VBG", 3);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Verb (VB)    + 	 Noun (NN/NNP/DT/WP)    = Priority 3

predefinedMap.put("preconditioning/NN", 4);  // preconditioning is predefined verb(VB)
predefinedMap.put("preconditioning/NNP", 4);  
predefinedMap.put("preconditioning/DT", 4);
predefinedMap.put("preconditioning/WP", 4);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Verb (VB)   +    Adverb (RB) = priority 7

predefinedMap.put("preconditioning/RB", 12);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


// Verb (VB)  +    Preposition (IN)  = Priority	11

predefinedMap.put("preconditioning/IN", 21);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Verb (VB)  +   Adjective (JJ)	= Priority 15

predefinedMap.put("preconditioning/JJ", 30);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

/////////// Starting precondition(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("precondition/VB", 7);     // Pprecondition is predefined noun(NN)
predefinedMap.put("precondition/VBD", 7);
predefinedMap.put("precondition/VBN", 7);
predefinedMap.put("precondition/VBP", 7);
predefinedMap.put("precondition/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("precondition/NN", 8); 
predefinedMap.put("precondition/NNP", 8);  
predefinedMap.put("precondition/DT", 8);
predefinedMap.put("precondition/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("precondition/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("precondition/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("precondition/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


/////////// Starting preconditions(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("preconditions/VB", 7);     // precondition is predefined noun(NN)
predefinedMap.put("preconditions/VBD", 7);
predefinedMap.put("preconditions/VBN", 7);
predefinedMap.put("preconditions/VBP", 7);
predefinedMap.put("preconditions/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("preconditions/NN", 8); 
predefinedMap.put("preconditions/NNP", 8);  
predefinedMap.put("preconditions/DT", 8);
predefinedMap.put("preconditions/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("preconditions/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("preconditions/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("preconditions/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-condition(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-condition/VB", 7);     // pre-condition is predefined noun(NN)
predefinedMap.put("pre-condition/VBD", 7);
predefinedMap.put("pre-condition/VBN", 7);
predefinedMap.put("pre-condition/VBP", 7);
predefinedMap.put("pre-condition/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-condition/NN", 8); 
predefinedMap.put("pre-condition/NNP", 8);  
predefinedMap.put("pre-condition/DT", 8);
predefinedMap.put("pre-condition/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-condition/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-condition/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-condition/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


/////////// Starting pre-conditions(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-conditions/VB", 7);     // pre-conditions is predefined noun(NN)
predefinedMap.put("pre-conditions/VBD", 7);
predefinedMap.put("pre-conditions/VBN", 7);
predefinedMap.put("pre-conditions/VBP", 7);
predefinedMap.put("pre-conditions/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-conditions/NN", 8); 
predefinedMap.put("pre-conditions/NNP", 8);  
predefinedMap.put("pre-conditions/DT", 8);
predefinedMap.put("pre-conditions/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-conditions/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-conditions/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-conditions/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

/////////// Starting pre-conditioning(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-conditioning/VB", 7);     // pre-conditioning is predefined noun(NN)
predefinedMap.put("pre-conditioning/VBD", 7);
predefinedMap.put("pre-conditioning/VBN", 7);
predefinedMap.put("pre-conditioning/VBP", 7);
predefinedMap.put("pre-conditioning/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-conditioning/NN", 8); 
predefinedMap.put("pre-conditioning/NNP", 8);  
predefinedMap.put("pre-conditioning/DT", 8);
predefinedMap.put("pre-conditioning/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-conditioning/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-conditioning/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-conditioning/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



//**************** Starting Predefined word called "prerequire" POS tag occurences ************************

/////////// Starting prerequire(VBG) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


//Noun (NN)      +	Model Verb (MD)  = Priority 7      

predefinedMap.put("prerequire/MD", 6);  
predefinedMap.put("prerequires/MD", 6);
predefinedMap.put("prerequiring/MD", 6); 
predefinedMap.put("prerequired/MD", 6); 
predefinedMap.put("pre-require/MD", 6); 
predefinedMap.put("pre-requires/MD", 6); 
predefinedMap.put("pre-requiring/MD", 6); 
predefinedMap.put("pre-required/MD", 6); 



/////////// Starting prerequire(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("prerequire/VB", 7);     // prerequire is predefined noun(NN)
predefinedMap.put("prerequire/VBD", 7);
predefinedMap.put("prerequire/VBN", 7);
predefinedMap.put("prerequire/VBP", 7);
predefinedMap.put("prerequire/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("prerequire/NN", 8); 
predefinedMap.put("prerequire/NNP", 8);  
predefinedMap.put("prerequire/DT", 8);
predefinedMap.put("prerequire/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("prerequire/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("prerequire/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("prerequire/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





/////////// Starting prerequires(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("prerequires/VB", 7);     // prerequires is predefined noun(NN)
predefinedMap.put("prerequires/VBD", 7);
predefinedMap.put("prerequires/VBN", 7);
predefinedMap.put("prerequires/VBP", 7);
predefinedMap.put("prerequires/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("prerequires/NN", 8); 
predefinedMap.put("prerequires/NNP", 8);  
predefinedMap.put("prerequires/DT", 8);
predefinedMap.put("prerequires/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("prerequires/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("prerequires/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("prerequires/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++






/////////// Starting prerequiring(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("prerequiring/VB", 7);     // prerequiring is predefined noun(NN)
predefinedMap.put("prerequiring/VBD", 7);
predefinedMap.put("prerequiring/VBN", 7);
predefinedMap.put("prerequiring/VBP", 7);
predefinedMap.put("prerequiring/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("prerequiring/NN", 8); 
predefinedMap.put("prerequiring/NNP", 8);  
predefinedMap.put("prerequiring/DT", 8);
predefinedMap.put("prerequiring/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("prerequiring/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("prerequiring/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("prerequiring/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





/////////// Starting prerequired(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("prerequired/VB", 7);     // prerequired is predefined noun(NN)
predefinedMap.put("prerequired/VBD", 7);
predefinedMap.put("prerequired/VBN", 7);
predefinedMap.put("prerequired/VBP", 7);
predefinedMap.put("prerequired/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("prerequired/NN", 8); 
predefinedMap.put("prerequired/NNP", 8);  
predefinedMap.put("prerequired/DT", 8);
predefinedMap.put("prerequired/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("prerequired/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("prerequired/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("prerequired/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-require(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-require/VB", 7);     // pre-require is predefined noun(NN)
predefinedMap.put("pre-require/VBD", 7);
predefinedMap.put("pre-require/VBN", 7);
predefinedMap.put("pre-require/VBP", 7);
predefinedMap.put("pre-require/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-require/NN", 8); 
predefinedMap.put("pre-require/NNP", 8);  
predefinedMap.put("pre-require/DT", 8);
predefinedMap.put("pre-require/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-require/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-require/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-require/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-requires(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-requires/VB", 7);     // pre-requires is predefined noun(NN)
predefinedMap.put("pre-requires/VBD", 7);
predefinedMap.put("pre-requires/VBN", 7);
predefinedMap.put("pre-requires/VBP", 7);
predefinedMap.put("pre-requires/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-requires/NN", 8); 
predefinedMap.put("pre-requires/NNP", 8);  
predefinedMap.put("pre-requires/DT", 8);
predefinedMap.put("pre-requires/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-requires/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-requires/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-requires/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



/////////// Starting pre-requiring(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-requiring/VB", 7);     // pre-requiring is predefined noun(NN)
predefinedMap.put("pre-requiring/VBD", 7);
predefinedMap.put("pre-requiring/VBN", 7);
predefinedMap.put("pre-requiring/VBP", 7);
predefinedMap.put("pre-requiring/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-requiring/NN", 8); 
predefinedMap.put("pre-requiring/NNP", 8);  
predefinedMap.put("pre-requiring/DT", 8);
predefinedMap.put("pre-requiring/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-requiring/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-requiring/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-requiring/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-required(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-required/VB", 7);     // pre-required is predefined noun(NN)
predefinedMap.put("pre-required/VBD", 7);
predefinedMap.put("pre-required/VBN", 7);
predefinedMap.put("pre-required/VBP", 7);
predefinedMap.put("pre-required/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-required/NN", 8); 
predefinedMap.put("pre-required/NNP", 8);  
predefinedMap.put("pre-requiredDT", 8);
predefinedMap.put("pre-required/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-required/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-required/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-required/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





//**************** Starting Predefined word called "predefine" POS tag occurences ************************

/////////// Starting predefine(VBG) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


//Noun (NN)      +	Model Verb (MD)  = Priority 7      

predefinedMap.put("predefine/MD", 6);  
predefinedMap.put("predefines/MD", 6);
predefinedMap.put("predefining/MD", 6); 
predefinedMap.put("predefined/MD", 6); 
predefinedMap.put("pre-define/MD", 6); 
predefinedMap.put("pre-defines/MD", 6); 
predefinedMap.put("pre-defining/MD", 6); 
predefinedMap.put("pre-defined/MD", 6); 



/////////// Starting predefine(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("predefine/VB", 7);     // predefine is predefined noun(NN)
predefinedMap.put("predefine/VBD", 7);
predefinedMap.put("predefine/VBN", 7);
predefinedMap.put("predefine/VBP", 7);
predefinedMap.put("predefine/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("predefine/NN", 8); 
predefinedMap.put("predefine/NNP", 8);  
predefinedMap.put("predefine/DT", 8);
predefinedMap.put("predefine/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("predefine/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("predefine/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("predefine/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





/////////// Starting predefines(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("predefines/VB", 7);     // predefines is predefined noun(NN)
predefinedMap.put("predefines/VBD", 7);
predefinedMap.put("predefines/VBN", 7);
predefinedMap.put("predefines/VBP", 7);
predefinedMap.put("predefines/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("predefines/NN", 8); 
predefinedMap.put("predefines/NNP", 8);  
predefinedMap.put("predefines/DT", 8);
predefinedMap.put("predefines/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("predefines/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("predefines/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("predefines/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++






/////////// Starting predefining(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("predefining/VB", 7);     // predefining is predefined noun(NN)
predefinedMap.put("predefining/VBD", 7);
predefinedMap.put("predefining/VBN", 7);
predefinedMap.put("predefining/VBP", 7);
predefinedMap.put("predefining/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("predefining/NN", 8); 
predefinedMap.put("predefining/NNP", 8);  
predefinedMap.put("predefining/DT", 8);
predefinedMap.put("predefining/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("predefining/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("predefining/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("predefining/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





/////////// Starting predefined(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("predefined/VB", 7);     // predefined is predefined noun(NN)
predefinedMap.put("predefined/VBD", 7);
predefinedMap.put("predefined/VBN", 7);
predefinedMap.put("predefined/VBP", 7);
predefinedMap.put("predefined/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("predefined/NN", 8); 
predefinedMap.put("predefined/NNP", 8);  
predefinedMap.put("predefined/DT", 8);
predefinedMap.put("predefined/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("predefined/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("predefined/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("predefined/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-define(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-define/VB", 7);     // pre-define is predefined noun(NN)
predefinedMap.put("pre-define/VBD", 7);
predefinedMap.put("pre-define/VBN", 7);
predefinedMap.put("pre-define/VBP", 7);
predefinedMap.put("pre-define/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-define/NN", 8); 
predefinedMap.put("pre-define/NNP", 8);  
predefinedMap.put("pre-define/DT", 8);
predefinedMap.put("pre-define/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-define/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-define/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-define/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-defines(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-defines/VB", 7);     // pre-defines is predefined noun(NN)
predefinedMap.put("pre-defines/VBD", 7);
predefinedMap.put("pre-defines/VBN", 7);
predefinedMap.put("pre-defines/VBP", 7);
predefinedMap.put("pre-defines/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-defines/NN", 8); 
predefinedMap.put("pre-defines/NNP", 8);  
predefinedMap.put("pre-defines/DT", 8);
predefinedMap.put("pre-defines/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-defines/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-defines/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-defines/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



/////////// Starting pre-defining(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-defining/VB", 7);     // pre-defining is predefined noun(NN)
predefinedMap.put("pre-defining/VBD", 7);
predefinedMap.put("pre-defining/VBN", 7);
predefinedMap.put("pre-defining/VBP", 7);
predefinedMap.put("pre-defining/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-defining/NN", 8); 
predefinedMap.put("pre-defining/NNP", 8);  
predefinedMap.put("pre-defining/DT", 8);
predefinedMap.put("pre-defining/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-defining/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-defining/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-defining/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-defined(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-defined/VB", 7);     // pre-defined is predefined noun(NN)
predefinedMap.put("pre-defined/VBD", 7);
predefinedMap.put("pre-defined/VBN", 7);
predefinedMap.put("pre-defined/VBP", 7);
predefinedMap.put("pre-defined/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-defined/NN", 8); 
predefinedMap.put("pre-defined/NNP", 8);  
predefinedMap.put("pre-defined/DT", 8);
predefinedMap.put("pre-defined/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-defined/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-defined/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-defined/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




//**************** Starting Predefined word called "predescribe" POS tag occurences ************************

/////////// Starting predescribe(VBG) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


//Noun (NN)      +	Model Verb (MD)  = Priority 7      

predefinedMap.put("predescribe/MD", 6);  
predefinedMap.put("predescribes/MD", 6);
predefinedMap.put("predescribing/MD", 6); 
predefinedMap.put("predescribed/MD", 6); 
predefinedMap.put("pre-describe/MD", 6); 
predefinedMap.put("pre-describes/MD", 6); 
predefinedMap.put("pre-describing/MD", 6); 
predefinedMap.put("pre-described/MD", 6); 



/////////// Starting predescribe(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("predescribe/VB", 7);     // predescribe is predefined noun(NN)
predefinedMap.put("predescribe/VBD", 7);
predefinedMap.put("predescribe/VBN", 7);
predefinedMap.put("predescribe/VBP", 7);
predefinedMap.put("predescribe/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("predescribe/NN", 8); 
predefinedMap.put("predescribe/NNP", 8);  
predefinedMap.put("predescribe/DT", 8);
predefinedMap.put("predescribe/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("predescribe/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("predescribe/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("predescribe/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





/////////// Starting predescribes(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("predescribes/VB", 7);     // predescribes is predefined noun(NN)
predefinedMap.put("predescribes/VBD", 7);
predefinedMap.put("predescribes/VBN", 7);
predefinedMap.put("predescribes/VBP", 7);
predefinedMap.put("predescribes/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("predescribes/NN", 8); 
predefinedMap.put("predescribes/NNP", 8);  
predefinedMap.put("predescribes/DT", 8);
predefinedMap.put("predescribes/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("predescribes/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("predescribes/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("predescribes/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++






/////////// Starting predescribing(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("predescribing/VB", 7);     // predescribing is predefined noun(NN)
predefinedMap.put("predescribing/VBD", 7);
predefinedMap.put("predescribing/VBN", 7);
predefinedMap.put("predescribing/VBP", 7);
predefinedMap.put("predescribing/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("predescribing/NN", 8); 
predefinedMap.put("predescribing/NNP", 8);  
predefinedMap.put("predescribing/DT", 8);
predefinedMap.put("predescribing/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("predescribing/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("predescribing/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("predescribing/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





/////////// Starting predescribed(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("predescribed/VB", 7);     // predescribed is predefined noun(NN)
predefinedMap.put("predescribed/VBD", 7);
predefinedMap.put("predescribed/VBN", 7);
predefinedMap.put("predescribed/VBP", 7);
predefinedMap.put("predescribed/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("predescribed/NN", 8); 
predefinedMap.put("predescribed/NNP", 8);  
predefinedMap.put("predescribed/DT", 8);
predefinedMap.put("predescribed/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("predescribed/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("predescribed/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("predescribed/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-describe(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-describe/VB", 7);     // pre-describe is predefined noun(NN)
predefinedMap.put("pre-describe/VBD", 7);
predefinedMap.put("pre-describe/VBN", 7);
predefinedMap.put("pre-describe/VBP", 7);
predefinedMap.put("pre-describe/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-describe/NN", 8); 
predefinedMap.put("pre-describe/NNP", 8);  
predefinedMap.put("pre-describe/DT", 8);
predefinedMap.put("pre-describe/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-describe/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-describe/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-describe/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-describes(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-describes/VB", 7);     // pre-describes is predefined noun(NN)
predefinedMap.put("pre-describes/VBD", 7);
predefinedMap.put("pre-describes/VBN", 7);
predefinedMap.put("pre-describes/VBP", 7);
predefinedMap.put("pre-describes/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-describes/NN", 8); 
predefinedMap.put("pre-describes/NNP", 8);  
predefinedMap.put("pre-describes/DT", 8);
predefinedMap.put("pre-describes/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-describes/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-describes/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-describes/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



/////////// Starting pre-describing(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-describing/VB", 7);     // pre-describing is predefined noun(NN)
predefinedMap.put("pre-describing/VBD", 7);
predefinedMap.put("pre-describing/VBN", 7);
predefinedMap.put("pre-describing/VBP", 7);
predefinedMap.put("pre-describing/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-describing/NN", 8); 
predefinedMap.put("pre-describing/NNP", 8);  
predefinedMap.put("pre-describing/DT", 8);
predefinedMap.put("pre-describing/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-describing/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-describing/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-describing/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




/////////// Starting pre-described(NN) + next word rule //////////////////////////////////////

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)      +    	 Verb (VB)  =  priority 6

predefinedMap.put("pre-described/VB", 7);     // pre-described is predefined noun(NN)
predefinedMap.put("pre-described/VBD", 7);
predefinedMap.put("pre-described/VBN", 7);
predefinedMap.put("pre-described/VBP", 7);
predefinedMap.put("pre-described/VBG", 7);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Noun (NN) = Priority 8

predefinedMap.put("pre-described/NN", 8); 
predefinedMap.put("pre-described/NNP", 8);  
predefinedMap.put("pre-described/DT", 8);
predefinedMap.put("pre-described/WP", 8);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +    Adverb (RB) = Priority 14

predefinedMap.put("pre-described/RB", 14);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Noun (NN)    +   Preposition (IN)   = Priority 18

predefinedMap.put("pre-described/IN", 23);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Verb (VB)  +     Adjective (JJ)	= Priority 26

predefinedMap.put("pre-described/JJ", 32);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





//Noun (NN)      +    	 Verb (VB)  =  priority 10

predefinedMap.put("Already/MD", 10);
predefinedMap.put("already/MD", 10);

predefinedMap.put("Already/VB", 11);  // prerequisite is predefined verb(VB)
predefinedMap.put("Already/VBD", 11);  
predefinedMap.put("Already/VBN", 11);
predefinedMap.put("Already/VBP", 11);
predefinedMap.put("Already/VBG", 11);


predefinedMap.put("already/VB", 11);  // prerequisite is predefined verb(VB)
predefinedMap.put("already/VBD", 11);  
predefinedMap.put("already/VBN", 11);
predefinedMap.put("already/VBP", 11);
predefinedMap.put("already/VBG", 11);



predefinedMap.put("Already/NN", 13);  // prerequisite is predefined verb(VB)
predefinedMap.put("Already/NNP", 13);  
predefinedMap.put("Already/DT", 13);
predefinedMap.put("Already/WP", 13);

predefinedMap.put("already/NN", 13);  // prerequisite is predefined verb(VB)
predefinedMap.put("already/NNP", 13);  
predefinedMap.put("already/DT", 13);
predefinedMap.put("already/WP", 13);


predefinedMap.put("Already/IN", 15);

predefinedMap.put("already/IN", 15);



predefinedMap.put("Already/JJ", 16);

predefinedMap.put("already/JJ", 16);


/////////////////////////////////////////////////////////////////////////////////////


//Noun (NN)      +    	 Verb (VB)  =  priority 10

predefinedMap.put("Before/MD", 19);
predefinedMap.put("before/MD", 19);

predefinedMap.put("Before/VB", 20);  // prerequisite is predefined verb(VB)
predefinedMap.put("Before/VBD", 20);  
predefinedMap.put("Before/VBN", 20);
predefinedMap.put("Before/VBP", 20);
predefinedMap.put("Before/VBG", 20);


predefinedMap.put("before/VB", 20);  // prerequisite is predefined verb(VB)
predefinedMap.put("before/VBD", 20);  
predefinedMap.put("before/VBN", 20);
predefinedMap.put("before/VBP", 20);
predefinedMap.put("before/VBG", 20);



predefinedMap.put("Before/NN", 22);  // prerequisite is predefined verb(VB)
predefinedMap.put("Before/NNP", 22);  
predefinedMap.put("Before/DT", 22);
predefinedMap.put("Before/WP", 22);

predefinedMap.put("before/NN", 22);  // prerequisite is predefined verb(VB)
predefinedMap.put("before/NNP", 22);  
predefinedMap.put("before/DT", 22);
predefinedMap.put("before/WP", 22);


predefinedMap.put("Before/IN", 26);

predefinedMap.put("before/IN", 26);



predefinedMap.put("Before/JJ", 25);

predefinedMap.put("before/JJ", 25);



////////////////////////// Need to check this part///////////////////////////////////////////////////////////////



predefinedMap.put("requisite/MD", 28);
predefinedMap.put("requisites/MD", 6);
predefinedMap.put("Requisiting/MD", 6);
predefinedMap.put("requisiting/MD", 2);
predefinedMap.put("requisited/MD", 2);


predefinedMap.put("requisite/VB", 29);  // prerequisite is predefined verb(VB)
predefinedMap.put("requisite/VBD", 29);  
predefinedMap.put("requisite/VBN", 29);
predefinedMap.put("requisite/VBP", 29);
predefinedMap.put("requisite/VBG", 29);	

predefinedMap.put("requisites/VB", 7);  // prerequisite is predefined verb(VB)
predefinedMap.put("requisites/VBD", 7);  
predefinedMap.put("requisites/VBN", 7);
predefinedMap.put("requisites/VBP", 7);
predefinedMap.put("requisites/VBG", 7);

predefinedMap.put("Requisiting/VB", 7);  // prerequisite is predefined verb(VB)
predefinedMap.put("Requisiting/VBD", 7);  
predefinedMap.put("Requisiting/VBN", 7);
predefinedMap.put("Requisiting/VBP", 7);
predefinedMap.put("Requisiting/VBG", 7);

predefinedMap.put("requisiting/VB", 3);  // prerequisite is predefined verb(VB)
predefinedMap.put("requisiting/VBD", 3);  
predefinedMap.put("requisiting/VBN", 3);
predefinedMap.put("requisiting/VBP", 3);
predefinedMap.put("requisiting/VBG", 3);


predefinedMap.put("requisited/VB", 3);  // prerequisite is predefined verb(VB)
predefinedMap.put("requisited/VBD", 3);  
predefinedMap.put("requisited/VBN", 3);
predefinedMap.put("requisited/VBP", 3);
predefinedMap.put("requisited/VBG", 3);



predefinedMap.put("requisite/NN", 31);  // prerequisite is predefined verb(VB)
predefinedMap.put("requisite/NNP", 31);  
predefinedMap.put("requisite/DT", 31);
predefinedMap.put("requisite/WP", 31);

predefinedMap.put("requisites/NN", 8);  // prerequisite is predefined verb(VB)
predefinedMap.put("requisites/NNP", 8);  
predefinedMap.put("requisites/DT", 8);
predefinedMap.put("requisites/WP", 8);

predefinedMap.put("Requisiting/NN", 8);  // prerequisite is predefined verb(VB)
predefinedMap.put("Requisiting/NNP", 8);  
predefinedMap.put("Requisiting/DT", 8);
predefinedMap.put("Requisiting/WP", 8);


predefinedMap.put("requisiting/NN", 4);  // prerequisite is predefined verb(VB)
predefinedMap.put("requisiting/NNP", 4);  
predefinedMap.put("requisiting/DT", 4);
predefinedMap.put("requisiting/WP", 4);


predefinedMap.put("requisited/NN", 4);  // prerequisite is predefined verb(VB)
predefinedMap.put("requisited/NNP", 4);  
predefinedMap.put("requisited/DT", 4);
predefinedMap.put("requisited/WP", 4);

////////////////////////////////////////////////////////////////////////////



predefinedMap.put("require/MD", 2);
predefinedMap.put("requires/MD", 2);
predefinedMap.put("requiring/MD", 2);
predefinedMap.put("required/MD", 2);



predefinedMap.put("requires/VB", 3);  // prerequisite is predefined verb(VB)
predefinedMap.put("requires/VBD", 3);  
predefinedMap.put("requires/VBN", 3);
predefinedMap.put("requires/VBP", 3);
predefinedMap.put("requires/VBG", 3);	

predefinedMap.put("requisites/VB", 3);  // prerequisite is predefined verb(VB)
predefinedMap.put("requisites/VBD", 3);  
predefinedMap.put("requisites/VBN", 3);
predefinedMap.put("requisites/VBP", 3);
predefinedMap.put("requisites/VBG", 3);

predefinedMap.put("requiring/VB", 3);  // prerequisite is predefined verb(VB)
predefinedMap.put("requiring/VBD", 3);  
predefinedMap.put("requiring/VBN", 3);
predefinedMap.put("requiring/VBP", 3);
predefinedMap.put("requiring/VBG", 3);

predefinedMap.put("required/VB", 3);  // prerequisite is predefined verb(VB)
predefinedMap.put("required/VBD", 3);  
predefinedMap.put("required/VBN", 3);
predefinedMap.put("required/VBP", 3);
predefinedMap.put("required/VBG", 3);



predefinedMap.put("require/NN", 4);     // prerequisite is predefined verb(VB)
predefinedMap.put("require/NNP", 4);  
predefinedMap.put("require/DT", 4);
predefinedMap.put("require/WP", 4);

predefinedMap.put("requires/NN", 4);  // prerequisite is predefined verb(VB)
predefinedMap.put("requires/NNP", 4);  
predefinedMap.put("requires/DT", 4);
predefinedMap.put("requires/WP", 4);

predefinedMap.put("requiring/NN", 4);  // prerequisite is predefined verb(VB)
predefinedMap.put("requiring/NNP", 4);  
predefinedMap.put("requiring/DT", 4);
predefinedMap.put("requiring/WP", 4);


predefinedMap.put("required/NN", 4);  // prerequisite is predefined verb(VB)
predefinedMap.put("required/NNP", 4);  
predefinedMap.put("required/DT", 4);
predefinedMap.put("required/WP", 4);


predefinedMap.put("require/RB", 12);    // Added
predefinedMap.put("requires/RB", 12);
predefinedMap.put("requiring/RB", 12);
predefinedMap.put("required/RB", 12);


predefinedMap.put("require/IN", 21);
predefinedMap.put("requires/IN", 21);
predefinedMap.put("requiring/IN", 21);
predefinedMap.put("required/IN", 21);


predefinedMap.put("require/JJ", 30);
predefinedMap.put("requirse/JJ", 30);
predefinedMap.put("requiring/JJ", 30);
predefinedMap.put("required/JJ", 30);



///////////////////////////////////////////////////////////////////////////////////////


predefinedMap.put("Mandatory/MD", 28);
predefinedMap.put("mandatory/MD", 28);



predefinedMap.put("Mandatory/VB", 29);  // prerequisite is predefined verb(VB)
predefinedMap.put("Mandatory/VBD", 29);  
predefinedMap.put("Mandatory/VBN", 29);
predefinedMap.put("Mandatory/VBP", 29);
predefinedMap.put("Mandatory/VBG", 29);	




predefinedMap.put("mandatory/VB", 29);  // prerequisite is predefined verb(VB)
predefinedMap.put("mandatory/VBD", 29);  
predefinedMap.put("mandatory/VBN", 29);
predefinedMap.put("mandatory/VBP", 29);
predefinedMap.put("mandatory/VBG", 29);	



predefinedMap.put("Mandatory/NN", 31);  // prerequisite is predefined verb(VB)
predefinedMap.put("Mandatory/NNP", 31);  
predefinedMap.put("Mandatory/DT", 31);
predefinedMap.put("Mandatory/WP", 31);


predefinedMap.put("mandatory/NN", 31);  // prerequisite is predefined verb(VB)
predefinedMap.put("mandatory/NNP", 31);  
predefinedMap.put("mandatory/DT", 31);
predefinedMap.put("mandatory/WP", 31);


predefinedMap.put("Mandatory/RB", 17);    // Added
predefinedMap.put("mandatory/RB", 17);


predefinedMap.put("Mandatory/IN", 15);   // Added
predefinedMap.put("mandatory/IN", 15);


predefinedMap.put("Mandatory/JJ", 16);  // Added
predefinedMap.put("mandatory/JJ", 16);


//////////////////////////////////////////////////////////////////////////////////////////



predefinedMap.put("Need/MD", 6);
predefinedMap.put("need/MD", 2);
predefinedMap.put("Needs/MD", 6);
predefinedMap.put("needs/MD", 2);
predefinedMap.put("Needed/MD", 2);





predefinedMap.put("Need/VB", 7);  // prerequisite is predefined verb(VB)
predefinedMap.put("Need/VBD", 7);  
predefinedMap.put("Need/VBN", 7);
predefinedMap.put("Need/VBP", 7);
predefinedMap.put("Need/VBG", 7);


predefinedMap.put("need/VB", 3);  // prerequisite is predefined verb(VB)
predefinedMap.put("need/VBD", 3);  
predefinedMap.put("need/VBN", 3);
predefinedMap.put("need/VBP", 3);
predefinedMap.put("need/VBG", 3);



predefinedMap.put("Needs/VB", 7);  // prerequisite is predefined verb(VB)
predefinedMap.put("Needs/VBD", 7);  
predefinedMap.put("Needs/VBN", 7);
predefinedMap.put("Needs/VBP", 7);
predefinedMap.put("Needs/VBG", 7);


predefinedMap.put("needs/VB", 3);  // prerequisite is predefined verb(VB)
predefinedMap.put("needs/VBD", 3);  
predefinedMap.put("needs/VBN", 3);
predefinedMap.put("needs/VBP", 3);
predefinedMap.put("needs/VBG", 3);


predefinedMap.put("Needed/VB", 3);  // prerequisite is predefined verb(VB)
predefinedMap.put("Needed/VBD", 3);  
predefinedMap.put("Needed/VBN", 3);
predefinedMap.put("Needed/VBP", 3);
predefinedMap.put("Needed/VBG", 3);





predefinedMap.put("Need/NN", 8);  // prerequisite is predefined verb(VB)
predefinedMap.put("Need/NNP", 8);  
predefinedMap.put("Need/DT", 8);
predefinedMap.put("Need/WP", 8);


predefinedMap.put("need/NN", 4);  // prerequisite is predefined verb(VB)
predefinedMap.put("need/NNP", 4);  
predefinedMap.put("need/DT", 4);
predefinedMap.put("need/WP", 4);



predefinedMap.put("Needs/NN", 8);  // prerequisite is predefined verb(VB)
predefinedMap.put("Needs/NNP", 8);  
predefinedMap.put("Needs/DT", 8);
predefinedMap.put("Needs/WP", 8);



predefinedMap.put("needs/NN", 4);  // prerequisite is predefined verb(VB)
predefinedMap.put("needs/NNP", 4);  
predefinedMap.put("needs/DT", 4);
predefinedMap.put("needs/WP", 4);



predefinedMap.put("Needed/NN", 4);  // prerequisite is predefined verb(VB)
predefinedMap.put("Needed/NNP", 4);  
predefinedMap.put("Needed/DT", 4);
predefinedMap.put("Needed/WP", 4);


predefinedMap.put("Need/RB", 14);    // Added
predefinedMap.put("need/RB", 12);
predefinedMap.put("Needs/RB", 14);    
predefinedMap.put("needs/RB", 12);
predefinedMap.put("Needed/RB", 12);



predefinedMap.put("Need/IN", 23);	// Added
predefinedMap.put("need/IN", 21);
predefinedMap.put("Needs/IN", 23);
predefinedMap.put("needs/IN", 21);
predefinedMap.put("Needed/IN", 21);



predefinedMap.put("Need/JJ", 32);	// Added
predefinedMap.put("need/JJ", 30);
predefinedMap.put("Needs/JJ", 32);
predefinedMap.put("needs/JJ", 30);
predefinedMap.put("Needed/JJ", 30);


//////////////////////////////////////////////////////////////////////////////////////////


predefinedMap.put("Essential/MD", 28);
predefinedMap.put("essential/MD", 28);
predefinedMap.put("Essentials/MD", 6);
predefinedMap.put("essentials/MD", 6);



predefinedMap.put("Essential/VB", 29);  // prerequisite is predefined verb(VB)
predefinedMap.put("Essential/VBD", 29);  
predefinedMap.put("Essential/VBN", 29);
predefinedMap.put("Essential/VBP", 29);
predefinedMap.put("Essential/VBG", 29);


predefinedMap.put("essential/VB", 29);  // prerequisite is predefined verb(VB)
predefinedMap.put("essential/VBD", 29);  
predefinedMap.put("essential/VBN", 29);
predefinedMap.put("essential/VBP", 29);
predefinedMap.put("essential/VBG", 29);



predefinedMap.put("Essentials/VB", 7);  // prerequisite is predefined verb(VB)
predefinedMap.put("Essentials/VBD", 7);  
predefinedMap.put("Essentials/VBN", 7);
predefinedMap.put("Essentials/VBP", 7);
predefinedMap.put("Essentials/VBG", 7);


predefinedMap.put("essentials/VB", 7);  // prerequisite is predefined verb(VB)
predefinedMap.put("essentials/VBD", 7);  
predefinedMap.put("essentials/VBN", 7);
predefinedMap.put("essentials/VBP", 7);
predefinedMap.put("essentials/VBG", 7);




predefinedMap.put("Essential/NN", 31);  // prerequisite is predefined verb(VB)
predefinedMap.put("Essential/NNP",31);  
predefinedMap.put("Essential/DT", 31);
predefinedMap.put("Essential/WP", 31);


predefinedMap.put("essential/NN", 31);  // prerequisite is predefined verb(VB)
predefinedMap.put("essential/NNP", 31);  
predefinedMap.put("essential/DT", 31);
predefinedMap.put("essential/WP", 31);



predefinedMap.put("Essentials/NN", 8);  // prerequisite is predefined verb(VB)
predefinedMap.put("Essentials/NNP", 8);  
predefinedMap.put("Essentials/DT", 8);
predefinedMap.put("Essentials/WP", 8);



predefinedMap.put("essentials/NN", 8);  // prerequisite is predefined verb(VB)
predefinedMap.put("essentials/NNP", 8);  
predefinedMap.put("essentials/DT", 8);
predefinedMap.put("essentials/WP", 8);


predefinedMap.put("Essential/RB", 33);    // Added
predefinedMap.put("essential/RB", 33);
predefinedMap.put("Essentials/RB", 14);    
predefinedMap.put("essentials/RB", 14);




predefinedMap.put("Essential/IN", 34);	// Added
predefinedMap.put("essential/IN", 34);
predefinedMap.put("Essentials/IN", 23);
predefinedMap.put("essentials/IN", 23);




predefinedMap.put("Essential/JJ", 35);	// Added
predefinedMap.put("essential/JJ", 35);
predefinedMap.put("Essentials/JJ", 32);
predefinedMap.put("essentials/JJ", 32);

return predefinedMap;


//////////////////////////////////////////////////////////////////////////////////////////



//predefinedMap.put("Before/IN", 15);

//predefinedMap.put("before/IN", 15);



//predefinedMap.put("Before/JJ", 21);

//predefinedMap.put("before/JJ", 21);



























	
	/*predefinedMap.put("prerequisite/VB", 1);  // 1
	predefinedMap.put("prerequisites/NN", 1); // 3
	predefinedMap.put("prerequisiting/NN", 1); // 4
	predefinedMap.put("prerequisiting/VBG", 1); // 2
	predefinedMap.put("pre-requisite/NN", 1); // 5
	predefinedMap.put("pre-requisites/NN", 1); // 6
	predefinedMap.put("pre-requisiting/NN", 1); // 7

	predefinedMap.put("precondition/NN", 2); // 2
	predefinedMap.put("preconditions/NNS", 2); // 3
	predefinedMap.put("preconditioning/NN", 2); // 4
	predefinedMap.put("preconditioning/VBG", 2); // 1
	predefinedMap.put("pre-condition/NN", 2); // 5
	predefinedMap.put("pre-conditions/NNS", 2); // 6
	predefinedMap.put("pre-conditioning/NN", 2); 


	predefinedMap.put("Prerequire/NN", 3);
	predefinedMap.put("Prerequires/NN", 3);
	predefinedMap.put("Prerequiring/NN", 3);
	predefinedMap.put("Prerequired/NN", 3);
	predefinedMap.put("Pre-require/NN", 3);
	predefinedMap.put("Pre-requires/NN", 3);
	predefinedMap.put("Pre-requiring/NN", 3);
	predefinedMap.put("Pre-required/NN", 3);

	predefinedMap.put("Predefine/NN", 4);
	predefinedMap.put("Predefines/NN", 4);
	predefinedMap.put("Predefining/NN", 4);
	predefinedMap.put("Predefined/NN", 4);
	predefinedMap.put("Pre-define/NN", 4);
	predefinedMap.put("Pre-defines/NN", 4);
	predefinedMap.put("Pre-defining/NN", 4);
	predefinedMap.put("Pre-defined/NN", 4);

	predefinedMap.put("Predescribe/NN", 5);
	predefinedMap.put("Predescribes/NN", 5);
	predefinedMap.put("Predescribing/NN", 5);
	predefinedMap.put("Predescribed/NN", 5);
	predefinedMap.put("Pre-describe/NN", 5);
	predefinedMap.put("Pre-describes/NN", 5);
	predefinedMap.put("Pre-describing/NN", 5);
	predefinedMap.put("Pre-described/NN", 5);

	predefinedMap.put("Must/MD", 6);
	predefinedMap.put("must/MD", 6);
	predefinedMap.put("Might/MD", 6);
	predefinedMap.put("might/MD", 6);
	predefinedMap.put("may/MD", 6);

	predefinedMap.put("Should/MD", 7);
	predefinedMap.put("should/MD", 7);
	predefinedMap.put("Shall/MD", 7);
	predefinedMap.put("shall/MD", 7);

	predefinedMap.put("Already/RB", 8);
	predefinedMap.put("already/RB", 8);

	predefinedMap.put("Before/IN", 9);
	predefinedMap.put("before/IN", 9);

	predefinedMap.put("requisite/JJ", 10);
	predefinedMap.put("requisites/NNS", 10);
	predefinedMap.put("Requisiting/NN", 10);
	predefinedMap.put("requisiting/VBG", 10);
	predefinedMap.put("requisited/VBD", 10);

	predefinedMap.put("require/VB", 11);
	predefinedMap.put("requires/VBZ", 11);
	predefinedMap.put("requiring/VBG", 11);
	predefinedMap.put("required/VBD", 11);

	predefinedMap.put("Mandatory/JJ", 12);
	predefinedMap.put("mandatory/JJ", 12);

	predefinedMap.put("Need/NN", 1);
	predefinedMap.put("need/VBP", 1);
	predefinedMap.put("Needs/NNS", 1);
	predefinedMap.put("needs/VBZ", 1);
	predefinedMap.put("Needed/VBN", 1);
	predefinedMap.put("need/VBP", 1);

	predefinedMap.put("Essential/JJ", 1);
	predefinedMap.put("essential/JJ", 1);
	predefinedMap.put("Essentials/NNS", 1);
	predefinedMap.put("essentials/NNS", 1);
	return predefinedMap;*/
	}
}
