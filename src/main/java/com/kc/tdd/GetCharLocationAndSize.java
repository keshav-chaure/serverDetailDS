package com.kc.tdd;

import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

public class GetCharLocationAndSize extends PDFTextStripper {

	public GetCharLocationAndSize() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	 @Override
	    protected void writeString(String string, List<TextPosition> textPositions) throws IOException {
	        for (TextPosition text : textPositions) {
	            System.out.println(text.getUnicode()+ " [(X=" + text.getXDirAdj() + ",Y=" +
	                    text.getYDirAdj() + ") height=" + text.getHeightDir() + " width=" +
	                    text.getWidthDirAdj() + "]");
	        }
	    }
}
