package com.testcase.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.testcase.configuration.HibernateConfiguration;
import com.testcase.constant.Alternative_constant;
import com.testcase.constant.Outcome_constant;
import com.testcase.constant.Prerequisite_constant;
import com.testcase.constant.TestDesc_constant;

import opennlp.tools.cmdline.postag.POSModelLoader;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTagger;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.tokenize.WhitespaceTokenizer;

public class Rules {
	static String path = HibernateConfiguration.path;
	static List<String> predefinedList;
	static Map<String, Integer> predifinedPriority;

	public Rules() {
		// predefinedMap = constant.predeifned();
	
	}

	public ArrayList<String> validate(String ruletype, String paragraph) {

		if (ruletype.equalsIgnoreCase("prerequisite")) {
			predefinedList = Prerequisite_constant.predeifnedList();
			predifinedPriority = Prerequisite_constant.predefinedPriority();
		}
		if (ruletype.equalsIgnoreCase("tc_description")) {
			predefinedList = TestDesc_constant.descList();
			predifinedPriority = TestDesc_constant.descPriority();
		}
		if (ruletype.equalsIgnoreCase("tc_alternative")) {
			predefinedList = Alternative_constant.descList();
			predifinedPriority = Alternative_constant.descPriority();
		}
		if (ruletype.equalsIgnoreCase("tc_outcome")) {
			predefinedList = Outcome_constant.descList();
			predifinedPriority = Outcome_constant.descPriority();
		}
		// String path="D:\\Test case pro\\DesignPlus v1.4\\src\\";
		String DIR_PATH = "opennlp/";
		String POS_MODEL_FILE = "en-pos-maxent.zip";

		// String paragraph = "Along with fresh veggies and fruits, eat nuts,
		// seeds and salads. Make sure you get a balanced diet, as often as
		// possible. Drinking water is good for your internal organs, it keeps
		// you fresh and healthy.";

		POSModel model = null;
		POSTagger posInstance = null;
		ArrayList<String> preList = new ArrayList<String>();
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
					SentenceModel model2 = new SentenceModel(is);
					SentenceDetectorME sdetector = new SentenceDetectorME(model2);
					String[] sentences = sdetector.sentDetect(paragraph);
					
					preList = new Rules().Rule1(sentences, tagger);

					if (preList.size() > 1) {
						ArrayList<String> ruleList2 = new Rules().Rule2(preList, tagger);
						preList.clear();
						preList.addAll(ruleList2);

						if (preList.size() > 1) {
							ArrayList<String> ruleList3 = new Rules().Rule3(preList, tagger);
							preList.clear();
							preList.addAll(ruleList3);
							if (preList.size() > 1) {
								ArrayList<String> ruleList4 = new Rules().Rule4(preList, tagger);
								preList.clear();
								preList.addAll(ruleList4);
								if (preList.size() > 1) {
									ArrayList<String> ruleList5 = new Rules().Rule5(preList, tagger);
									preList.clear();
									preList.addAll(ruleList5);
								}
							}
						}
					}

				}
				tagger = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return preList;

	}

	public ArrayList<String> Rule1(String[] sentences, POSTaggerME tagger) {
		ArrayList<String> ruleList = new ArrayList<String>();
		for (String sentence : sentences) {
			String whitespaceTokenizerLine[] = WhitespaceTokenizer.INSTANCE.tokenize(sentence);
			String[] tags = tagger.tag(whitespaceTokenizerLine);
			for (int i = 0; i < whitespaceTokenizerLine.length; i++) {
				String word = whitespaceTokenizerLine[i].trim();
				String tag = tags[i].trim();
				// System.out.println(sentence+" : "+word+"/"+tag);
				if (predefinedList.contains(word + "/" + tag)) {
					if (ruleList.size() == 0 || !ruleList.contains(sentence)) {
						ruleList.add(sentence);
					}
				} else {
					 System.out.println("ELSE:"+word + ":" + tag);
				}
			}
		}
		return ruleList;
	}

	public ArrayList<String> Rule2(ArrayList<String> sentences, POSTaggerME tagger) {// check
																						// predeifend
																						// word
																						// count
																						// (should
																						// +
																						// should=2)
		ArrayList<String> ruleList = new ArrayList<String>();
		Map<String, Integer> predRule2 = new HashMap<String, Integer>();
		for (String sentence : sentences) {
			String whitespaceTokenizerLine[] = WhitespaceTokenizer.INSTANCE.tokenize(sentence);
			String[] tags = tagger.tag(whitespaceTokenizerLine);
			Map<String, Integer> freqs = new HashMap<String, Integer>();

			for (int i = 0; i < whitespaceTokenizerLine.length; i++) {
				String word = whitespaceTokenizerLine[i].trim();
				String tag = tags[i].trim();
				//System.out.println(word + "_" + tag);
				if (predefinedList.contains(word + "/" + tag)) {
					if (freqs.containsKey(word.toLowerCase())) {
						freqs.put(word.toLowerCase(), freqs.get(word.toLowerCase()) + 1);
					} else {
						freqs.put(word.toLowerCase(), 1);
					}
				}
			}
			// System.out.println(freqs);
			// Integer max = Collections.max(freqs.values());
			Integer sum = 0;
			for (Integer i : freqs.values()) {
				sum += i;
			}
			predRule2.put(sentence, sum);
		}
		// System.out.println(predRule2.size());

		Integer maxSent = Collections.max(predRule2.values());
		ruleList.clear();
		for (Map.Entry<String, Integer> entry : predRule2.entrySet()) {
			if (entry.getValue() == maxSent) {
				ruleList.add(entry.getKey());
			}
		}
		return ruleList;

	}

	public ArrayList<String> Rule3(ArrayList<String> sentences, POSTaggerME tagger) {
		ArrayList<String> ruleList = new ArrayList<String>();
		Map<String, Integer> senMap = new HashMap<String, Integer>();
		for (String sentence : sentences) {
			String whitespaceTokenizerLine[] = WhitespaceTokenizer.INSTANCE.tokenize(sentence);
			String[] tags = tagger.tag(whitespaceTokenizerLine);
			Map<String, Integer> freqs = new HashMap<String, Integer>();
			;
			for (int i = 0; i < whitespaceTokenizerLine.length; i++) {
				String word = whitespaceTokenizerLine[i].trim();
				String tag = tags[i].trim();
				if (predifinedPriority.containsKey(word + "/" + tag)) {
					if (freqs.containsKey(word.toLowerCase())) {
						freqs.put(word.toLowerCase(),
								freqs.get(word.toLowerCase()) + predifinedPriority.get(word + "/" + tag));
					} else {
						freqs.put(word.toLowerCase(), predifinedPriority.get(word + "/" + tag));
					}
				} else {
					// freqs.put(token.toLowerCase(), 1);
				}
			}

			int sum = 0;
			for (int f : freqs.values()) {
				sum += f;
			}
			senMap.put(sentence, sum);
			Integer min = Collections.min(senMap.values());
			ruleList.clear();
			for (Map.Entry<String, Integer> entry : senMap.entrySet()) {
				if (entry.getValue() == min) {
					ruleList.add(entry.getKey());
				}
			}
		}

		return ruleList;
	}

	public ArrayList<String> Rule4(ArrayList<String> eqSent, POSTaggerME tagger) { // after
																					// predefined
																					// word(i+1)
		ArrayList<String> list = new ArrayList<String>();
		for (String sent : eqSent) {
			String whitespaceTokenizerLine[] = WhitespaceTokenizer.INSTANCE.tokenize(sent);
			String[] tags = tagger.tag(whitespaceTokenizerLine);
			Map<String, Integer> freqs = new HashMap<String, Integer>();

			for (int i = 0; i < whitespaceTokenizerLine.length - 1; i++) {
				String word = whitespaceTokenizerLine[i].trim();
				// if(tags[i].equalsIgnoreCase("MD") &&
				// tags[i+1].equalsIgnoreCase("VB")){
				if (predifinedPriority.containsKey(word + "/" + tags[i + 1])) {
					if (freqs.containsKey(sent)) {
						freqs.put(sent, freqs.get(sent) + predifinedPriority.get(word + "/" + tags[i + 1]));
					} else {
						freqs.put(sent, predifinedPriority.get(word + "/" + tags[i + 1]));
					}
				}
				if (predifinedPriority.containsKey(tags[i] + "/" + tags[i + 1])) {
					if (freqs.containsKey(sent)) {
						freqs.put(sent, freqs.get(sent) + predifinedPriority.get(tags[i] + "/" + tags[i + 1]));
					} else {
						freqs.put(sent, predifinedPriority.get(tags[i] + "/" + tags[i + 1]));
					}
				}
				// }

			}
			Integer min = Collections.min(freqs.values());
			for (Map.Entry<String, Integer> entry : freqs.entrySet()) {
				if (entry.getValue() == min) {
					list.add(entry.getKey());
				}
			}
			// System.out.println("5:" + freqs);

		}
		return list;

	}

	public ArrayList<String> Rule5(ArrayList<String> eqSent, POSTaggerME tagger) {// before
																					// predefined
																					// word(i-1)
		ArrayList<String> list = new ArrayList<String>();
		for (String sent : eqSent) {
			String whitespaceTokenizerLine[] = WhitespaceTokenizer.INSTANCE.tokenize(sent);
			String[] tags = tagger.tag(whitespaceTokenizerLine);
			Map<String, Integer> freqs = new HashMap<String, Integer>();

			//
			for (int i = 1; i < whitespaceTokenizerLine.length; i++) {
				String word = whitespaceTokenizerLine[i - 1].trim();

				if (predifinedPriority.containsKey(word + "/" + tags[i])) {
					if (freqs.containsKey(sent)) {
						freqs.put(sent, freqs.get(sent) + predifinedPriority.get(word + "/" + tags[i]));
					} else {
						freqs.put(sent, predifinedPriority.get(word + "/" + tags[i]));
					}
				}
				if (predifinedPriority.containsKey(tags[i] + "/" + tags[i])) {
					if (freqs.containsKey(sent)) {
						freqs.put(sent, freqs.get(sent) + predifinedPriority.get(tags[i] + "/" + tags[i]));
					} else {
						freqs.put(sent, predifinedPriority.get(tags[i] + "/" + tags[i]));
					}
				}

			}
			Integer min = Collections.min(freqs.values());
			for (Map.Entry<String, Integer> entry : freqs.entrySet()) {
				if (entry.getValue() == min) {
					list.add(entry.getKey());
				}
			}

		}
		return list;

	}
}
