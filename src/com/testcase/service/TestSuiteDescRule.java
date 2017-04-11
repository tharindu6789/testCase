package com.testcase.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import opennlp.tools.cmdline.postag.POSModelLoader;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTagger;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;

public class TestSuiteDescRule {
	String DIR_PATH = "opennlp/";
	String POS_MODEL_FILE = "en-pos-maxent.zip";
	static String path = "D:\\Test case pro\\DesignPlus v1.4\\src\\";

	public String validateSentence( String sentence) {
		String test_suite="";
	POSModel model = null;
	POSTagger posInstance = null;
	ArrayList<String> preList=new ArrayList<String>();
	// Load POS Model
	try {
		File inputFile = null;
		String fileLocation = path + POS_MODEL_FILE;
		if (new File(fileLocation).exists()) {
			inputFile = new File(fileLocation);
		} else {
			System.out.println("File : " + fileLocation + " does not exists.");
		}
		if (inputFile != null) {
			model = new POSModelLoader().load(inputFile);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}

	// POS Tagging
	try {
		if (model != null) {
			POSTaggerME tagger = new POSTaggerME(model);
			if (tagger != null) {
				// Call Sentence Detector
				String sentenceModel = "en-sent.zip";
				InputStream is = new FileInputStream(new File(path + sentenceModel));
				

				List<String> ruleList = new ArrayList<String>(Arrays.asList(

						"validate/JJ","Validate/NNP","validates/NNS","validate/NN","validate/VB","validating/VBG","validated/VBN","verify/VB","verifies/NNS","verifying/VBG","verified/VBD",	 
"check/VB","checks/NNS","checking/NN","checked/VBD","test/NN","tests/NNS","testing/NN","tested/VBD",
"analyze/VB","analyzes/VBZ","analyzing/VBG","analyzed,VBD","justify/VB","justifies/VBZ","justifying/VBG","justified/JJ",  
"evaluate/VB","evaluates/VBZ","evaluating/VBG","evaluated/VBN","review/NN","reviews/NNS","reviewing/VBG","reviewed/VBD",	  
"figure/NN","figures/NNS","figuring/VBG","figured/VBD","find/VB","finds/VBZ","finding/VBG","found/VBD",
"look/VB","looks/VBZ","looking/VBG","looked/VBD","overlook/VB","overlooks/VBZ","verlooking/VBG","overlooked/VBD",	     
"investigate/VB","investigates/VBZ","investigating/VBG","investigated/VBD","prove/VB","proves/VBZ","proving/VBG","proved/VBD",		      
"audit/NN","audits/NN","auditing/NN","audited/JJ","try/VB","tries/VBZ","trying/VBG","tried/VBD","measure/NN","measures,NNS",	  
"measuring/VBG","measured/VBN","review/NN","reviews/NNS","reviewing/VBG","reviewed/VBD","monitor/VB","monitors/NNS","monitoring/NN","monitored/VBD",  	
"verification/NN","verifications/NNS","tryout/JJ","tryouts/NNS","proof/NN","proofs/NNS","proofing/VBG","proofed/VBD",
"analysis/NN","analyses/NNS","analyzing/VBG","research/NN","researches/VBZ","researching/VBG","researched/VBN"			
									
						));
				List<String> predList = new ArrayList<String>(Arrays.asList(
						"require/VB","function/NN",
						"scenario/NN","scenarios/NNS","target/NN","targets/NNS","focus/NN","focused/VBD","requirement/NN","requirements/NNS",
						"category/NN","categories/NNS","phase/NN","phases/NNS","function/NN","functions/NNS","vactivity/NN","activities/NNS", 			
						"section/NN","sections/NNS","segment/NN","segment/NNS","segmenting/NNS","sector/NN","sectors/NNP",			
						"partition/NN","partitions/NNS","partitioning/VBG","unit/NN","units/NNS","objective/NN","objectives/NNS",		
						"perspective/NN","perspectives/NNS","aspect/NN","aspects/NNS","describe/VB","describes/VBZ","describing/VBG","described/VBD",   	
						"about/IN","base/NN","based/VBN","aim/NN","aims/VBZ","aiming/VBG","aimed/VBD","point/NN","points/NNS","pointing/VBG","pointed/VBD",	     		
						"provide/VB","provides/VBZ","providing/VBG","provided/VBD","appoint/VB","appoints/VBZ","appointing/VBG","appointed/VBD",
						"concentrate/VB","concentrates/VBZ","concentrating/VBG","concentrated/JJ","concern/NN","concerns/NNS","concerning/VBG","concerned/JJ"	   



					
						));
				
					String whitespaceTokenizerLine[] = WhitespaceTokenizer.INSTANCE.tokenize(sentence);
					String[] tags = tagger.tag(whitespaceTokenizerLine);
					//int j=0;
					int desc=0;
					int pred = 0;
					boolean A=false;
					List<String> list=new ArrayList<String>();  
					
					for (int i = 0; i < whitespaceTokenizerLine.length; i++) {
						String word = whitespaceTokenizerLine[i].trim();
						String tag = tags[i].trim();
						String sent="";
						System.out.println(word+"/"+ tag);

						if(ruleList.contains(word+"/"+tag)|| predList.contains(word+"/"+tag)){
							sent+=word;
							for(int j=i+1; j< whitespaceTokenizerLine.length-i;j++){
								String word2 = whitespaceTokenizerLine[j].trim();
								String tag2 = tags[j].trim();
								sent +=" " +word2+tag2;
								if(predList.contains(word2+"/"+tag2) || ruleList.contains(word2+"/"+tag2)){
										break;										
								}
							}
						}
						if(!sent.equals("")){
						list.add(sent);
						}
					}
					System.out.println(desc+" "+list);
					if(pred > desc){
						//System.out.println("asd"+(pred-desc));
					}else{
						//System.out.println("asd"+(desc-pred));
					}
					
					for (int i = 0; i < whitespaceTokenizerLine.length; i++) {
						String word = whitespaceTokenizerLine[i].trim();
						String tag = tags[i].trim();
						
						if(ruleList.contains(word+"/"+tag)){
							int j=0;
							j++;
							if(j> 1){
								test_suite="";
								
							}else{
								if(i+4 < whitespaceTokenizerLine.length){
									test_suite="TS_"+whitespaceTokenizerLine[i+1]+"_"+whitespaceTokenizerLine[i+2]+
									"_"+whitespaceTokenizerLine[i+3]+"_"+whitespaceTokenizerLine[i+4];	
								}else
								if(i+3 < whitespaceTokenizerLine.length){
									test_suite="TS_"+whitespaceTokenizerLine[i+1]+"_"+whitespaceTokenizerLine[i+2]+
									"_"+whitespaceTokenizerLine[i+3];	
								}else
								if(i+2 < whitespaceTokenizerLine.length){
									test_suite="TS_"+whitespaceTokenizerLine[i+1]+"_"+whitespaceTokenizerLine[i+2];	
								}
							}
						
						}
					}

			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return test_suite;


}
}
