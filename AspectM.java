package stanford_1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AspectM {

	public static void main(String[] args) throws IOException, InterruptedException {

		/*
		 * 1. FIRST STEP INVOLVES PREPROCESSING, i.e, REMOVAL OF ERRANT SYMBOLS,
		 * STOP WORD REMOVAL, SENTENCE SEGMENTATION, REMOVAL OF UNNECESSARY
		 * SPACES
		 */
	/*	String a = "/home/emily/workspace/Extraction_2/trial.txt" ;
		Preprocess preprocess = new Preprocess("trial.txt", "preprocessedFile");

		
		 * 2. THE SECOND STEP INVOLVES GENERATION OF NOUNS, i.e, GENERATE ALL
		 * POSSIBLE NOUN FORMS, PARSE THE PROCESSED REVIEWS, TO GENERATE NOUNS
		 * THE NOUNS ARE RECORDED AS "nounsFile" AND "parsedFile" CAN BE USED
		 * FOR DEBUGGING ONE MAJOR IMPROVEMENT-->IF THE "parsedFile" IS ALREADY
		 * PRESENT THEN PARSING WILL NOT TAKE PLACE AGAIN..THE PREVIOUS NOUN
		 * FILE WILL BE USED TO RETURN THE NOUNS
		 
		NounsGenerator ng = new NounsGenerator("preprocessedFile");
		ng.generateAspects();
		System.out.println(ng.getNounsListString()+"\n");

		
		 * 3. THE THIRD STEP INVOLVES GENERATION OF ASPECTS FROM THE NOUNS BASED
		 * ON THE FREQUENCY PARAMETER SPECIAL "Aspect" OBJECT IS CREATED TO
		 * HANDLE EACH ASPECT.......ASPECTS NEED TO BE FINALISED AND COMITTED TO
		 * A FILE "finalizedAspects"
		 
		
		AspectsGenerator ag = new AspectsGenerator(ng.getNounsListString(), 15);
		System.out.println(ag.getSuggestedAspects());
		System.out.println("\n **");

		ArrayList<String> finalAspects = new ArrayList<>();
		finalAspects.add("camera");
		finalAspects.add("colour");
		//finalAspects.add("color");
		finalAspects.add("battery");
		finalAspects.add("screen");
		finalAspects.add("processor");
		finalAspects.add("price");
		finalAspects.add("apps");
		finalAspects.add("sound");
		finalAspects.add("radio");
		finalAspects.add("food");
		finalAspects.add("camera");
		finalAspects.add("color");
		finalAspects.add("ndf");
		
		ag.finalizeAspects(finalAspects);

		// checking and debugging
		ArrayList<Aspect> ans;
		ans = ag.getAspects();

		for (Aspect aspect : ans) {
			System.out.println(aspect.getAspectName());
		}

		
		 * 4. THE FOUTRH STEP INVOLVES FINAL PROCESSING OF THE
		 * "preprocessedFile" HERE ONLY THE LINES WHICH WILL HAVE THE ASPECTS
		 * MENTIONED IN THEM WILL BE INCLUDED FOR FURTHER EXTRACTION PROCEDURE.
		 * NEW FILE WILL BE CREATED FOR SUCH REVIEWS , "opinionatedReviews"
		 
		
		preprocess.finalPreprocess("preprocessedFile", "opinionatedReviews", ans);
		
		
		 * 5. "THE" STEP FIVE
		 
		//IMPORTANT IMPORTANT
		Aspect.setReviewFile("opinionatedReviews");
		//TRIAL
		Thread t1 = new Thread(ans.get(0));
		Thread t2 = new Thread(ans.get(1));
		t1.start();
		t2.start();
		
		
		//EXE POOL
		ExecutorService pool = Executors.newFixedThreadPool(ans.size());
		
		for (int i = 0; i < ans.size(); i++) {
			pool.submit(ans.get(i));
		}
		
		pool.submit(ans.get(0));
		pool.shutdown();
		pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		
		
		//Basic Thread Method - 6:10
		ArrayList<Thread> execute = new ArrayList<>();
		for (Aspect aspect: ans) {
			execute.add(new Thread(aspect));
		}
		
		for (Thread t: execute) {
			t.start();
		}
		
		for (Thread t: execute) {
			t.join();
		}
		
	
		
		for (Aspect aspect: ans) {
			System.out.println(aspect.getAspectName());
			System.out.println("----------------------------------");
			aspect.generateAspects();
		}
		
		DBpediaConnector connector1 = new DBpediaConnector(new URL("http://dbpedia.org/data/Smartphone.rdf"));
        String b=connector1.toString();
        System.out.println(b); 
		  // DBpediaConnector connector = new DBpediaConnector(new URL("http://dbpedia.org/page/Smartphone"));
		    //System.out.println("ok");
		for (Aspect aspect: ans) {
			System.out.println(aspect.getAspectName());
			System.out.println("----------------------------------\n");
			System.out.println(aspect.getOpinionWords());
			System.out.println(aspect.getScore());
			
			//Connection connector = new Connection ();
			// connector.getText(texte)
			 
		
       try {
            //HtmlParser parser = new HtmlParser(new URL("http://dbpedia.org/resource/Ans"));
          DBpediaConnector connector1 = new DBpediaConnector(new URL("http://dbpedia.org/data/Smartphone.rdf"));
              String b=connector1.getResponseMessage();
            //HtmlParser parser = new HtmlParser(new URL(connector1.getCurrentUrl()));

           // parser.getElementContents("trial.txt");
         // if(parser.getElementContents("camera").equals(finalAspects)== true)
            //if(connector.isNoEntry().equals(aspect.getAspectName()) == true)
            
              System.out.println(b);
            
          // else
            	
            //  System.out.println("not ok");
            
       } catch (MalformedURLException ex) {
            Logger.getLogger(HtmlParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HtmlParser.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }*/
		}}

