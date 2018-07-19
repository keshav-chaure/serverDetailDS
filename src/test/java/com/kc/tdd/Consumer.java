package com.kc.tdd;

public class Consumer {

	public static void main(String[] args) {
		PDFReader reader=new PDFReader();
		//reader.readPdf("RRF.pdf");
		reader.readPDFTableData("RRF.pdf");
		reader.readPDFUsingTableExtractor("RRF.pdf");
	}
}
