package com.kc.tdd;

public class Consumer {

	public static void main(String[] args) {
		String filePath = "RRF.pdf";
		PDFReader reader=new PDFReader();
		//reader.readPdf(filePath);
		reader.readPDFTableData(filePath);
		reader.readPDFByCharLocationAndSize(filePath);
	}
}
