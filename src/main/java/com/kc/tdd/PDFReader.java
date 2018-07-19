package com.kc.tdd;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDFReader {
	
	public void readPdf(String filePath) {
		
		
		try (PDDocument document = PDDocument.load(new File(filePath))) {

	        document.getClass();

	        if (!document.isEncrypted()) {
	        	  PDDocumentInformation pdd = document.getDocumentInformation();
	        	  
	        //	printPDFDocumentInfo(pdd); 
	        	  
	       
	              
	            PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	            stripper.setSortByPosition(true);

	            PDFTextStripper tStripper = new PDFTextStripper();

	       //    String pdfFileInText = tStripper.getText(document);
	           String pdfFileInText = stripper.getText(document);
	          //  System.out.println("Text:" + pdfFileInText);

				// split by whitespace
	            String lines[] = pdfFileInText.split("\\r?\\n");
	            for (String line : lines) {
	                System.out.println(line);
	            }

	        }

	    
	} catch (InvalidPasswordException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	public void readPDFTableData(String filePath) {
		String string = null;
        try {
            PDFParser pdfParser = new PDFParser(new RandomAccessFile(new File(filePath), "r"));
            pdfParser.parse();
            PDDocument pdDocument = new PDDocument(pdfParser.getDocument());
            PDFTextStripper pdfTextStripper = new PDFLayoutTextStripper();
            string = pdfTextStripper.getText(pdDocument);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };
        System.out.println(string);
	}

	
	private void printPDFDocumentInfo(PDDocumentInformation pdd) {
		//Retrieving the info of a PDF document
		  System.out.println("Author of the document is :"+ pdd.getAuthor());
		  System.out.println("Title of the document is :"+ pdd.getTitle());
		  System.out.println("Subject of the document is :"+ pdd.getSubject());

		  System.out.println("Creator of the document is :"+ pdd.getCreator());
		  System.out.println("Creation date of the document is :"+ pdd.getCreationDate());
		  System.out.println("Modification date of the document is :"+ 
		     pdd.getModificationDate()); 
		  System.out.println("Keywords of the document are :"+ pdd.getKeywords());
	}

	public void readPDFUsingTableExtractor(String filePath) {
		String string = null;
        try {
            PDFParser pdfParser = new PDFParser(new RandomAccessFile(new File(filePath), "r"));
            pdfParser.parse();
            PDDocument pdDocument = new PDDocument(pdfParser.getDocument());
          //  PDFTextStripper pdfTextStripper = new PDFLayoutTextStripper();
          //  string = pdfTextStripper.getText(pdDocument);
            PDFTextStripper stripper = new GetCharLocationAndSize();
            stripper.setSortByPosition( true );
            stripper.setStartPage( 0 );
            stripper.setEndPage( pdDocument.getNumberOfPages() );
             
            Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
            stripper.writeText(pdDocument, dummy);
             
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };
        System.out.println(string);
	}
	
}
	