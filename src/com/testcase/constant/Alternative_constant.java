package com.testcase.constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alternative_constant {

	public static List<String> descList(){
		
		List<String> x = new ArrayList<String>(Arrays.asList(

				
"scenario/NN","scenarios/NNS","target/NN","targets/NNS","focus/NN","focused/VBD","requirement/NN","requirements/NNS",
"category/NN","categories/NNS","phase/NN","phases/NNS","function/NN","functions/NNS","vactivity/NN","activities/NNS", 			
"section/NN","sections/NNS","segment/NN","segment/NNS","segmenting/NNS","sector/NN","sectors/NNP",			
"partition/NN","partitions/NNS","partitioning/VBG","unit/NN","units/NNS","objective/NN","objectives/NNS",		
"perspective/NN","perspectives/NNS","aspect/NN","aspects/NNS","describe/VB","describes/VBZ","describing/VBG","described/VBD",   	
"about/IN","base/NN","based/VBN","aim/NN","aims/VBZ","aiming/VBG","aimed/VBD","point/NN","points/NNS","pointing/VBG","pointed/VBD",	     		
"provide/VB","provides/VBZ","providing/VBG","provided/VBD","appoint/VB","appoints/VBZ","appointing/VBG","appointed/VBD",
"concentrate/VB","concentrates/VBZ","concentrating/VBG","concentrated/JJ","concern/NN","concerns/NNS","concerning/VBG","concerned/JJ"	   



			
				));
		return x;
	}

	
	public static Map<String,Integer> descPriority(){// rule4 & 5 (before & after)
	final Map<String,Integer> descMap = new HashMap<String, Integer>();
	
	
	descMap.put("scenario/NN", 1);
	descMap.put("scenarios/NNS", 1);
	descMap.put("target/NN", 2);
	
	return descMap;
	}
}
