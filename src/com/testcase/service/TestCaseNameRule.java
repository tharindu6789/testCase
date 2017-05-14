package com.testcase.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.testcase.configuration.HibernateConfiguration;
import com.testcase.constant.Outcome_constant;
import com.testcase.constant.Prerequisite_constant;

import opennlp.tools.cmdline.postag.POSModelLoader;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTagger;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;

public class TestCaseNameRule {
	String DIR_PATH = "opennlp/";
	String POS_MODEL_FILE = "en-pos-maxent.zip";
	static String path = HibernateConfiguration.path;

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

						"achieve/VB","must/MD","may/MD","mustn’t/NN","should/MD","shouldn't/NN","can/MD","can’t/NN","could/MD","couldn’t/NN","has/VBZ",					
						"hasn’t/NN","have/VBP","haven't/NN","will/VB","won’t/NN","would/MD","wouldn’t/NN","achieve/VB","achieves/VBZ",
						"achieving/VBG","achieved/VBD","realize/VB","realizes/VBZ","realizing/VBG","realized/VBD","accomplish/VB",
						"accomplishes/VBZ","accomplishing/VBG,accomplished/VBN","get/VB","gets/VBZ","getting/VBG","able/JJ","abled/VBD",				 
						"unable/JJ","enable/VB","enabled/VBD","disable/VB","disabled/JJ","complete/JJ","completes/VBZ","completing/VBG",
						"completed/VBD","incomplete/JJ","incompletes/NNS","success/NN","succeed/VB","succeeded/VBD",		    
						"successful/JJ","successfully/RB"			
									
						));
				List<String> predList = Outcome_constant.descList();
				
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
								String first_tag=tags[i+1];
								String first_word="_"+whitespaceTokenizerLine[i+1];
								if(first_tag.equalsIgnoreCase("TO") || first_tag.equalsIgnoreCase("IN")){
									first_word="";
								}
								if(i+4 < whitespaceTokenizerLine.length){
									
									test_suite="TC"+first_word+"_"+whitespaceTokenizerLine[i+2]+
									"_"+whitespaceTokenizerLine[i+3]+"_"+whitespaceTokenizerLine[i+4];	
								}else
								if(i+3 < whitespaceTokenizerLine.length){
									test_suite="TC"+first_word+"_"+whitespaceTokenizerLine[i+2]+
									"_"+whitespaceTokenizerLine[i+3];	
								}else
								if(i+2 < whitespaceTokenizerLine.length){
									test_suite="TC"+first_word+"_"+whitespaceTokenizerLine[i+2];	
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
