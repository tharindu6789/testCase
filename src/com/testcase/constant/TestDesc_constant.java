package com.testcase.constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDesc_constant {

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
	
	
	/////////////////////////////////////////
	
	descMap.put("scenario/MD", 4);  
	descMap.put("scenarios/MD", 4);
	
	descMap.put("scenario/VB", 6);  // prerequisite is predefined verb(VB)
	descMap.put("scenario/VBD", 6);  
	descMap.put("scenario/VBN", 6);
	descMap.put("scenario/VBP", 6);
	descMap.put("scenario/VBG", 6);
	
	
	descMap.put("scenarios/VB", 6);  // prerequisite is predefined verb(VB)
	descMap.put("scenarios/VBD", 6);  
	descMap.put("scenarios/VBN", 6);
	descMap.put("scenarios/VBP", 6);
	descMap.put("scenarios/VBG", 6);
	
	
	descMap.put("scenario/NN", 7);  // prerequisite is predefined verb(VB)
	descMap.put("scenario/NNP", 7);  
	descMap.put("scenario/DT", 7);
	descMap.put("scenario/WP", 7);
	
	descMap.put("scenarios/NN", 7);  // prerequisite is predefined verb(VB)
	descMap.put("scenarios/NNP", 7);  
	descMap.put("scenarios/DT", 7);
	descMap.put("scenarios/WP", 7);
	
	
	descMap.put("scenario/RB", 12);
	
	descMap.put("scenarios/RB", 12);
	
	
	descMap.put("scenario/IN", 17);
	
	descMap.put("scenarios/IN", 17);
	
	
	descMap.put("scenario/JJ", 22);

	descMap.put("scenarios/JJ", 22);
	
/////////////////////////////////////////
	
descMap.put("target/MD", 4);  
descMap.put("targets/MD", 4);

descMap.put("target/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("target/VBD", 6);  
descMap.put("target/VBN", 6);
descMap.put("target/VBP", 6);
descMap.put("target/VBG", 6);


descMap.put("targets/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("targets/VBD", 6);  
descMap.put("targets/VBN", 6);
descMap.put("targets/VBP", 6);
descMap.put("targets/VBG", 6);


descMap.put("target/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("target/NNP", 7);  
descMap.put("target/DT", 7);
descMap.put("target/WP", 7);

descMap.put("targets/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("targets/NNP", 7);  
descMap.put("targets/DT", 7);
descMap.put("targets/WP", 7);


descMap.put("target/RB", 12);

descMap.put("targets/RB", 12);


descMap.put("target/IN", 17);

descMap.put("targets/IN", 17);


descMap.put("target/JJ", 22);

descMap.put("targets/JJ", 22);


/////////////////////////////////////////

descMap.put("focus/MD", 4);  
descMap.put("focused/MD", 4);

descMap.put("focus/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("focus/VBD", 6);  
descMap.put("focus/VBN", 6);
descMap.put("focus/VBP", 6);
descMap.put("focus/VBG", 6);


descMap.put("focused/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("focused/VBD", 2);  
descMap.put("focused/VBN", 2);
descMap.put("focused/VBP", 2);
descMap.put("focused/VBG", 2);


descMap.put("focus/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("focus/NNP", 7);  
descMap.put("focus/DT", 7);
descMap.put("focus/WP", 7);

descMap.put("focused/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("focused/NNP", 3);  
descMap.put("focused/DT", 3);
descMap.put("focused/WP", 3);


descMap.put("focus/RB", 12);

descMap.put("focused/RB", 10);


descMap.put("focus/IN", 17);

descMap.put("focused/IN", 15);


descMap.put("focus/JJ", 22);

descMap.put("focused/JJ", 20);


/////////////////////////////////////////

descMap.put("requirement/MD", 4);  
descMap.put("requirements/MD", 4);

descMap.put("requirement/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("requirement/VBD", 6);  
descMap.put("requirement/VBN", 6);
descMap.put("requirement/VBP", 6);
descMap.put("requirement/VBG", 6);


descMap.put("requirements/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("requirements/VBD", 6);  
descMap.put("requirements/VBN", 6);
descMap.put("requirements/VBP", 6);
descMap.put("requirements/VBG", 6);


descMap.put("requirement/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("requirement/NNP", 7);  
descMap.put("requirement/DT", 7);
descMap.put("requirement/WP", 7);

descMap.put("requirements/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("requirements/NNP", 7);  
descMap.put("requirements/DT", 7);
descMap.put("requirements/WP", 7);


descMap.put("requirement/RB", 12);

descMap.put("requirements/RB", 12);


descMap.put("requirement/IN", 17);

descMap.put("requirements/IN", 17);


descMap.put("requirement/JJ", 22);

descMap.put("requirements/JJ", 22);



/////////////////////////////////////////

descMap.put("category/MD", 4);  
descMap.put("categories/MD", 4);

descMap.put("category/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("category/VBD", 6);  
descMap.put("category/VBN", 6);
descMap.put("category/VBP", 6);
descMap.put("category/VBG", 6);


descMap.put("categories/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("categories/VBD", 6);  
descMap.put("categories/VBN", 6);
descMap.put("categories/VBP", 6);
descMap.put("categories/VBG", 6);


descMap.put("category/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("category/NNP", 7);  
descMap.put("category/DT", 7);
descMap.put("category/WP", 7);

descMap.put("categories/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("categories/NNP", 7);  
descMap.put("categories/DT", 7);
descMap.put("categories/WP", 7);


descMap.put("category/RB", 12);

descMap.put("categories/RB", 12);


descMap.put("category/IN", 17);

descMap.put("categories/IN", 17);


descMap.put("category/JJ", 22);

descMap.put("categories/JJ", 22);


/////////////////////////////////////////

descMap.put("phase/MD", 4);  
descMap.put("phases/MD", 4);

descMap.put("phase/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("phase/VBD", 6);  
descMap.put("phase/VBN", 6);
descMap.put("phase/VBP", 6);
descMap.put("phase/VBG", 6);


descMap.put("phases/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("phases/VBD", 6);  
descMap.put("phases/VBN", 6);
descMap.put("phases/VBP", 6);
descMap.put("phases/VBG", 6);


descMap.put("phase/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("phase/NNP", 7);  
descMap.put("phase/DT", 7);
descMap.put("phase/WP", 7);

descMap.put("phases/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("phases/NNP", 7);  
descMap.put("phases/DT", 7);
descMap.put("phases/WP", 7);


descMap.put("phase/RB", 12);

descMap.put("phases/RB", 12);


descMap.put("phase/IN", 17);

descMap.put("phases/IN", 17);


descMap.put("phase/JJ", 22);

descMap.put("phases/JJ", 22);


/////////////////////////////////////////

descMap.put("function/MD", 4);  
descMap.put("functions/MD", 4);

descMap.put("function/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("function/VBD", 6);  
descMap.put("function/VBN", 6);
descMap.put("function/VBP", 6);
descMap.put("function/VBG", 6);


descMap.put("functions/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("functions/VBD", 6);  
descMap.put("functions/VBN", 6);
descMap.put("functions/VBP", 6);
descMap.put("functions/VBG", 6);


descMap.put("function/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("function/NNP", 7);  
descMap.put("function/DT", 7);
descMap.put("function/WP", 7);

descMap.put("functions/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("functions/NNP", 7);  
descMap.put("functions/DT", 7);
descMap.put("functions/WP", 7);


descMap.put("function/RB", 12);

descMap.put("functions/RB", 12);


descMap.put("function/IN", 17);

descMap.put("functions/IN", 17);


descMap.put("function/JJ", 22);

descMap.put("functions/JJ", 22);


/////////////////////////////////////////

descMap.put("activity/MD", 4);  
descMap.put("activities/MD", 4);

descMap.put("activity/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("activity/VBD", 6);  
descMap.put("activity/VBN", 6);
descMap.put("activity/VBP", 6);
descMap.put("activity/VBG", 6);


descMap.put("activities/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("activities/VBD", 6);  
descMap.put("activities/VBN", 6);
descMap.put("activities/VBP", 6);
descMap.put("activities/VBG", 6);


descMap.put("activity/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("activity/NNP", 7);  
descMap.put("activity/DT", 7);
descMap.put("activity/WP", 7);

descMap.put("activities/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("activities/NNP", 7);  
descMap.put("activities/DT", 7);
descMap.put("activities/WP", 7);


descMap.put("activity/RB", 12);

descMap.put("activities/RB", 12);


descMap.put("activity/IN", 17);

descMap.put("activities/IN", 17);


descMap.put("activity/JJ", 22);

descMap.put("activities/JJ", 22);


/////////////////////////////////////////

descMap.put("section/MD", 4);  
descMap.put("sections/MD", 4);

descMap.put("section/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("section/VBD", 6);  
descMap.put("section/VBN", 6);
descMap.put("section/VBP", 6);
descMap.put("section/VBG", 6);


descMap.put("sections/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("sections/VBD", 6);  
descMap.put("sections/VBN", 6);
descMap.put("sections/VBP", 6);
descMap.put("sections/VBG", 6);


descMap.put("section/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("section/NNP", 7);  
descMap.put("section/DT", 7);
descMap.put("section/WP", 7);

descMap.put("sections/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("sections/NNP", 7);  
descMap.put("sections/DT", 7);
descMap.put("sections/WP", 7);


descMap.put("section/RB", 12);

descMap.put("sections/RB", 12);


descMap.put("section/IN", 17);

descMap.put("sections/IN", 17);


descMap.put("section/JJ", 22);

descMap.put("sections/JJ", 22);


/////////////////////////////////////////

descMap.put("segment/MD", 4);  
descMap.put("segments/MD", 4);
descMap.put("segmenting/MD", 1);

descMap.put("segment/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("segment/VBD", 6);  
descMap.put("segment/VBN", 6);
descMap.put("segment/VBP", 6);
descMap.put("segment/VBG", 6);

descMap.put("segments/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("segments/VBD", 6);  
descMap.put("segments/VBN", 6);
descMap.put("segments/VBP", 6);
descMap.put("segments/VBG", 6);


descMap.put("segmenting/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("segmenting/VBD", 2);  
descMap.put("segmenting/VBN", 2);
descMap.put("segmenting/VBP", 2);
descMap.put("segmenting/VBG", 2);


descMap.put("segment/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("segment/NNP", 7);  
descMap.put("segment/DT", 7);
descMap.put("segment/WP", 7);

descMap.put("segments/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("segments/NNP", 7);  
descMap.put("segments/DT", 7);
descMap.put("segments/WP", 7);

descMap.put("segmenting/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("segmenting/NNP", 3);  
descMap.put("segmenting/DT", 3);
descMap.put("segmenting/WP", 3);


descMap.put("segment/RB", 12);

descMap.put("segments/RB", 12);

descMap.put("segmenting/RB", 10);


descMap.put("segment/IN", 17);

descMap.put("segments/IN", 17);

descMap.put("segmenting/IN", 15);


descMap.put("segment/JJ", 22);

descMap.put("segments/JJ", 22);

descMap.put("segmenting/JJ", 20);


/////////////////////////////////////////

descMap.put("sector/MD", 4);  
descMap.put("sectors/MD", 4);

descMap.put("sector/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("sector/VBD", 6);  
descMap.put("sector/VBN", 6);
descMap.put("sector/VBP", 6);
descMap.put("sector/VBG", 6);


descMap.put("sectors/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("sectors/VBD", 6);  
descMap.put("sectors/VBN", 6);
descMap.put("sectors/VBP", 6);
descMap.put("sectors/VBG", 6);


descMap.put("sector/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("sector/NNP", 7);  
descMap.put("sector/DT", 7);
descMap.put("sector/WP", 7);

descMap.put("sectors/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("sectors/NNP", 7);  
descMap.put("sectors/DT", 7);
descMap.put("sectors/WP", 7);


descMap.put("sector/RB", 12);

descMap.put("sectors/RB", 12);


descMap.put("sector/IN", 17);

descMap.put("sectors/IN", 17);


descMap.put("sector/JJ", 22);

descMap.put("sectors/JJ", 22);


/////////////////////////////////////////

descMap.put("partition/MD", 4);  
descMap.put("partitions/MD", 4);
descMap.put("partitioning/MD", 1);

descMap.put("partition/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("partition/VBD", 6);  
descMap.put("partition/VBN", 6);
descMap.put("partition/VBP", 6);
descMap.put("partition/VBG", 6);

descMap.put("partitions/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("partitions/VBD", 6);  
descMap.put("partitions/VBN", 6);
descMap.put("partitions/VBP", 6);
descMap.put("partitions/VBG", 6);


descMap.put("partitioning/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("partitioning/VBD", 2);  
descMap.put("partitioning/VBN", 2);
descMap.put("partitioning/VBP", 2);
descMap.put("partitioning/VBG", 2);


descMap.put("partition/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("partition/NNP", 7);  
descMap.put("partition/DT", 7);
descMap.put("partition/WP", 7);

descMap.put("partitions/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("partitions/NNP", 7);  
descMap.put("partitions/DT", 7);
descMap.put("partitions/WP", 7);

descMap.put("partitioning/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("partitioning/NNP", 3);  
descMap.put("partitioning/DT", 3);
descMap.put("partitioning/WP", 3);


descMap.put("partition/RB", 12);

descMap.put("partitions/RB", 12);

descMap.put("partitioning/RB", 10);


descMap.put("partition/IN", 17);

descMap.put("partitions/IN", 17);

descMap.put("partitioning/IN", 15);


descMap.put("partition/JJ", 22);

descMap.put("partitions/JJ", 22);

descMap.put("partitioning/JJ", 20);


/////////////////////////////////////////

descMap.put("purpose/MD", 4);  
descMap.put("purposes/MD", 4);

descMap.put("purpose/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("purpose/VBD", 6);  
descMap.put("purpose/VBN", 6);
descMap.put("purpose/VBP", 6);
descMap.put("purpose/VBG", 6);


descMap.put("purposes/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("purposes/VBD", 6);  
descMap.put("purposes/VBN", 6);
descMap.put("purposes/VBP", 6);
descMap.put("purposes/VBG", 6);


descMap.put("purpose/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("purpose/NNP", 7);  
descMap.put("purpose/DT", 7);
descMap.put("purpose/WP", 7);

descMap.put("purposes/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("purposes/NNP", 7);  
descMap.put("purposes/DT", 7);
descMap.put("purposes/WP", 7);


descMap.put("purpose/RB", 12);

descMap.put("purposes/RB", 12);


descMap.put("purpose/IN", 17);

descMap.put("purposes/IN", 17);


descMap.put("purpose/JJ", 22);

descMap.put("purposes/JJ", 22);


/////////////////////////////////////////

descMap.put("unit/MD", 4);  
descMap.put("units/MD", 4);

descMap.put("unit/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("unit/VBD", 6);  
descMap.put("unit/VBN", 6);
descMap.put("unit/VBP", 6);
descMap.put("unit/VBG", 6);


descMap.put("units/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("units/VBD", 6);  
descMap.put("units/VBN", 6);
descMap.put("units/VBP", 6);
descMap.put("units/VBG", 6);


descMap.put("unit/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("unit/NNP", 7);  
descMap.put("unit/DT", 7);
descMap.put("unit/WP", 7);

descMap.put("units/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("units/NNP", 7);  
descMap.put("units/DT", 7);
descMap.put("units/WP", 7);


descMap.put("unit/RB", 12);

descMap.put("units/RB", 12);


descMap.put("unit/IN", 17);

descMap.put("units/IN", 17);


descMap.put("unit/JJ", 22);

descMap.put("units/JJ", 22);



/////////////////////////////////////////

descMap.put("objective/MD", 4);  
descMap.put("objectives/MD", 4);

descMap.put("objective/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("objective/VBD", 6);  
descMap.put("objective/VBN", 6);
descMap.put("objective/VBP", 6);
descMap.put("objective/VBG", 6);


descMap.put("objectives/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("objectives/VBD", 6);  
descMap.put("objectives/VBN", 6);
descMap.put("objectives/VBP", 6);
descMap.put("objectives/VBG", 6);


descMap.put("objective/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("objective/NNP", 7);  
descMap.put("objective/DT", 7);
descMap.put("objective/WP", 7);

descMap.put("objectives/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("objectives/NNP", 7);  
descMap.put("objectives/DT", 7);
descMap.put("objectives/WP", 7);


descMap.put("objective/RB", 12);

descMap.put("objectives/RB", 12);


descMap.put("objective/IN", 17);

descMap.put("objectives/IN", 17);


descMap.put("objective/JJ", 22);

descMap.put("objectives/JJ", 22);


/////////////////////////////////////////

descMap.put("perspective/MD", 4);  
descMap.put("perspectives/MD", 4);

descMap.put("perspective/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("perspective/VBD", 6);  
descMap.put("perspective/VBN", 6);
descMap.put("perspective/VBP", 6);
descMap.put("perspective/VBG", 6);


descMap.put("perspectives/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("perspectives/VBD", 6);  
descMap.put("perspectives/VBN", 6);
descMap.put("perspectives/VBP", 6);
descMap.put("perspectives/VBG", 6);


descMap.put("perspective/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("perspective/NNP", 7);  
descMap.put("perspective/DT", 7);
descMap.put("perspective/WP", 7);

descMap.put("perspectives/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("perspectives/NNP", 7);  
descMap.put("perspectives/DT", 7);
descMap.put("perspectives/WP", 7);


descMap.put("perspective/RB", 12);

descMap.put("perspectives/RB", 12);


descMap.put("perspective/IN", 17);

descMap.put("perspectives/IN", 17);


descMap.put("perspective/JJ", 22);

descMap.put("perspectives/JJ", 22);


/////////////////////////////////////////

descMap.put("aspect/MD", 4);  
descMap.put("aspects/MD", 4);

descMap.put("aspect/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("aspect/VBD", 6);  
descMap.put("aspect/VBN", 6);
descMap.put("aspect/VBP", 6);
descMap.put("aspect/VBG", 6);


descMap.put("aspects/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("aspects/VBD", 6);  
descMap.put("aspects/VBN", 6);
descMap.put("aspects/VBP", 6);
descMap.put("aspects/VBG", 6);


descMap.put("aspect/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("aspect/NNP", 7);  
descMap.put("aspect/DT", 7);
descMap.put("aspect/WP", 7);

descMap.put("aspects/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("aspects/NNP", 7);  
descMap.put("aspects/DT", 7);
descMap.put("aspects/WP", 7);


descMap.put("aspect/RB", 12);

descMap.put("aspects/RB", 12);


descMap.put("aspect/IN", 17);

descMap.put("aspects/IN", 17);


descMap.put("aspect/JJ", 22);

descMap.put("aspects/JJ", 22);



/////////////////////////////////////////

descMap.put("describe/MD", 1);  
descMap.put("describes/MD", 1);
descMap.put("describing/MD", 1);
descMap.put("described/MD", 1);


descMap.put("describe/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("describe/VBD", 2);  
descMap.put("describe/VBN", 2);
descMap.put("describe/VBP", 2);
descMap.put("describe/VBG", 2);

descMap.put("describes/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("describes/VBD", 2);  
descMap.put("describes/VBN", 2);
descMap.put("describes/VBP", 2);
descMap.put("describes/VBG", 2);

descMap.put("describing/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("describing/VBD", 2);  
descMap.put("describing/VBN", 2);
descMap.put("describing/VBP", 2);
descMap.put("describing/VBG", 2);

descMap.put("described/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("described/VBD", 2);  
descMap.put("described/VBN", 2);
descMap.put("described/VBP", 2);
descMap.put("described/VBG", 2);


descMap.put("describe/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("describe/NNP", 3);  
descMap.put("describe/DT", 3);
descMap.put("describe/WP", 3);

descMap.put("describes/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("describes/NNP", 3);  
descMap.put("describes/DT", 3);
descMap.put("describes/WP", 3);

descMap.put("describing/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("describing/NNP", 3);  
descMap.put("describing/DT", 3);
descMap.put("describing/WP", 3);

descMap.put("described/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("described/NNP", 3);  
descMap.put("described/DT", 3);
descMap.put("described/WP", 3);


descMap.put("describe/RB", 10);
descMap.put("describes/RB", 10);
descMap.put("describing/RB", 10);
descMap.put("described/RB", 10);


descMap.put("describe/IN", 15);
descMap.put("describes/IN", 15);
descMap.put("describing/IN", 15);
descMap.put("described/IN", 15);


descMap.put("describe/JJ", 20);
descMap.put("describes/JJ", 20);
descMap.put("describing/JJ", 20);
descMap.put("described/JJ", 20);



/////////////////////////////////////////

descMap.put("about/MD", 13);  


descMap.put("about/VB", 14);  // prerequisite is predefined verb(VB)
descMap.put("about/VBD", 14);  
descMap.put("about/VBN", 14);
descMap.put("about/VBP", 14);
descMap.put("about/VBG", 14);


descMap.put("about/NN", 16);  // prerequisite is predefined verb(VB)
descMap.put("about/NNP", 16);  
descMap.put("about/DT", 16);
descMap.put("about/WP", 16);


/////////////////////////////////////////

descMap.put("base/MD", 4);
descMap.put("based/MD", 1);


descMap.put("base/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("base/VBD", 6);  
descMap.put("base/VBN", 6);
descMap.put("base/VBP", 6);
descMap.put("base/VBG", 6);


descMap.put("based/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("based/VBD", 2);  
descMap.put("based/VBN", 2);
descMap.put("based/VBP", 2);
descMap.put("based/VBG", 2);


descMap.put("base/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("base/NNP", 7);  
descMap.put("base/DT", 7);
descMap.put("base/WP", 7);

descMap.put("based/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("based/NNP", 3);  
descMap.put("based/DT", 3);
descMap.put("based/WP", 3);



descMap.put("base/RB", 12);

descMap.put("based/RB", 10);


descMap.put("base/IN", 17);

descMap.put("based/IN", 15);


descMap.put("base/JJ", 22);

descMap.put("based/JJ", 20);


/////////////////////////////////////////

descMap.put("aim/MD", 4);
descMap.put("aims/MD", 1);
descMap.put("aiming/MD", 1);
descMap.put("aimed/MD", 1);


descMap.put("aim/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("aim/VBD", 6);  
descMap.put("aim/VBN", 6);
descMap.put("aim/VBP", 6);
descMap.put("aim/VBG", 6);


descMap.put("aims/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("aims/VBD", 2);  
descMap.put("aims/VBN", 2);
descMap.put("aims/VBP", 2);
descMap.put("aims/VBG", 2);

descMap.put("aiming/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("aiming/VBD", 2);  
descMap.put("aiming/VBN", 2);
descMap.put("aiming/VBP", 2);
descMap.put("aiming/VBG", 2);

descMap.put("aimed/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("aimed/VBD", 2);  
descMap.put("aimed/VBN", 2);
descMap.put("aimed/VBP", 2);
descMap.put("aimed/VBG", 2);


descMap.put("aim/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("aim/NNP", 7);  
descMap.put("aim/DT", 7);
descMap.put("aim/WP", 7);

descMap.put("aims/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("aims/NNP", 3);  
descMap.put("aims/DT", 3);
descMap.put("aims/WP", 3);

descMap.put("aiming/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("aiming/NNP", 3);  
descMap.put("aiming/DT", 3);
descMap.put("aiming/WP", 3);

descMap.put("aimed/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("aimed/NNP", 3);  
descMap.put("aimed/DT", 3);
descMap.put("aimed/WP", 3);


descMap.put("aim/RB", 12);

descMap.put("aims/RB", 10);
descMap.put("aiming/RB", 10);
descMap.put("aimed/RB", 10);


descMap.put("aim/IN", 17);

descMap.put("aims/IN", 15);
descMap.put("aiming/IN", 15);
descMap.put("aimed/IN", 15);


descMap.put("aim/JJ", 22);

descMap.put("aims/JJ", 20);
descMap.put("aiming/JJ", 20);
descMap.put("aimed/JJ", 20);



/////////////////////////////////////////

descMap.put("point/MD", 4);
descMap.put("points/MD", 4);
descMap.put("pointing/MD", 1);
descMap.put("pointed/MD", 1);


descMap.put("point/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("point/VBD", 6);  
descMap.put("point/VBN", 6);
descMap.put("point/VBP", 6);
descMap.put("point/VBG", 6);


descMap.put("points/VB", 6);  // prerequisite is predefined verb(VB)
descMap.put("points/VBD", 6);  
descMap.put("points/VBN", 6);
descMap.put("points/VBP", 6);
descMap.put("points/VBG", 6);

descMap.put("pointing/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("pointing/VBD", 2);  
descMap.put("pointing/VBN", 2);
descMap.put("pointing/VBP", 2);
descMap.put("pointing/VBG", 2);

descMap.put("pointed/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("pointed/VBD", 2);  
descMap.put("pointed/VBN", 2);
descMap.put("pointed/VBP", 2);
descMap.put("pointed/VBG", 2);


descMap.put("point/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("point/NNP", 7);  
descMap.put("point/DT", 7);
descMap.put("point/WP", 7);

descMap.put("points/NN", 7);  // prerequisite is predefined verb(VB)
descMap.put("points/NNP", 7);  
descMap.put("points/DT", 7);
descMap.put("points/WP", 7);

descMap.put("pointing/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("pointing/NNP", 3);  
descMap.put("pointing/DT", 3);
descMap.put("pointing/WP", 3);

descMap.put("pointed/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("pointed/NNP", 3);  
descMap.put("pointed/DT", 3);
descMap.put("pointed/WP", 3);


descMap.put("point/RB", 12);
descMap.put("points/RB", 12);
descMap.put("pointing/RB", 10);
descMap.put("pointed/RB", 10);


descMap.put("point/IN", 17);
descMap.put("points/IN", 17);
descMap.put("pointing/IN", 15);
descMap.put("pointed/IN", 15);


descMap.put("point/JJ", 22);
descMap.put("points/JJ", 22);
descMap.put("pointing/JJ", 20);
descMap.put("pointed/JJ", 20);



/////////////////////////////////////////

descMap.put("provide/MD", 1);  
descMap.put("provides/MD", 1);
descMap.put("providing/MD", 1);
descMap.put("provided/MD", 1);


descMap.put("provide/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("provide/VBD", 2);  
descMap.put("provide/VBN", 2);
descMap.put("provide/VBP", 2);
descMap.put("provide/VBG", 2);

descMap.put("provides/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("provides/VBD", 2);  
descMap.put("provides/VBN", 2);
descMap.put("provides/VBP", 2);
descMap.put("provides/VBG", 2);

descMap.put("providing/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("providing/VBD", 2);  
descMap.put("providing/VBN", 2);
descMap.put("providing/VBP", 2);
descMap.put("providing/VBG", 2);

descMap.put("provided/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("provided/VBD", 2);  
descMap.put("provided/VBN", 2);
descMap.put("provided/VBP", 2);
descMap.put("provided/VBG", 2);


descMap.put("provide/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("provide/NNP", 3);  
descMap.put("provide/DT", 3);
descMap.put("provide/WP", 3);

descMap.put("provides/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("provides/NNP", 3);  
descMap.put("provides/DT", 3);
descMap.put("provides/WP", 3);

descMap.put("providing/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("providing/NNP", 3);  
descMap.put("providing/DT", 3);
descMap.put("providing/WP", 3);

descMap.put("provided/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("provided/NNP", 3);  
descMap.put("provided/DT", 3);
descMap.put("provided/WP", 3);


descMap.put("provide/RB", 10);
descMap.put("provides/RB", 10);
descMap.put("providing/RB", 10);
descMap.put("provided/RB", 10);


descMap.put("provide/IN", 15);
descMap.put("provides/IN", 15);
descMap.put("providing/IN", 15);
descMap.put("provided/IN", 15);


descMap.put("provide/JJ", 20);
descMap.put("provides/JJ", 20);
descMap.put("providing/JJ", 20);
descMap.put("provided/JJ", 20);



/////////////////////////////////////////

descMap.put("appoint/MD", 1);  
descMap.put("appoints/MD", 1);
descMap.put("appointing/MD", 1);
descMap.put("appointed/MD", 1);


descMap.put("appoint/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("appoint/VBD", 2);  
descMap.put("appoint/VBN", 2);
descMap.put("appoint/VBP", 2);
descMap.put("appoint/VBG", 2);

descMap.put("appoints/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("appoints/VBD", 2);  
descMap.put("appoints/VBN", 2);
descMap.put("appoints/VBP", 2);
descMap.put("appoints/VBG", 2);

descMap.put("appointing/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("appointing/VBD", 2);  
descMap.put("appointing/VBN", 2);
descMap.put("appointing/VBP", 2);
descMap.put("appointing/VBG", 2);

descMap.put("appointed/VB", 2);  // prerequisite is predefined verb(VB)
descMap.put("appointed/VBD", 2);  
descMap.put("appointed/VBN", 2);
descMap.put("appointed/VBP", 2);
descMap.put("appointed/VBG", 2);


descMap.put("appoint/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("appoint/NNP", 3);  
descMap.put("appoint/DT", 3);
descMap.put("appoint/WP", 3);

descMap.put("appoints/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("appoints/NNP", 3);  
descMap.put("appoints/DT", 3);
descMap.put("appoints/WP", 3);

descMap.put("appointing/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("appointing/NNP", 3);  
descMap.put("appointing/DT", 3);
descMap.put("appointing/WP", 3);

descMap.put("appointed/NN", 3);  // prerequisite is predefined verb(VB)
descMap.put("appointed/NNP", 3);  
descMap.put("appointed/DT", 3);
descMap.put("appointed/WP", 3);


descMap.put("appoint/RB", 10);
descMap.put("appoints/RB", 10);
descMap.put("appointing/RB", 10);
descMap.put("appointed/RB", 10);


descMap.put("appoint/IN", 15);
descMap.put("appoints/IN", 15);
descMap.put("appointing/IN", 15);
descMap.put("appointed/IN", 15);


descMap.put("appoint/JJ", 20);
descMap.put("appoints/JJ", 20);
descMap.put("appointing/JJ", 20);
descMap.put("appointed/JJ", 20);


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
