package com.reader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.IOException;
public class Reader
{
	public static void main(String args[]) throws IOException 
	{
		try
		{
			File pdffile=new File("C:/Acc.pdf");
			PDDocument pd=PDDocument.load(pdffile);
			PDFTextStripper pdfstrip=new PDFTextStripper();
			String text=pdfstrip.getText(pd);
			System.out.println(text);
		}
		catch (Exception e) 
		{
			System.out.println(e);
			//e.printStackTrace();
		}
			
	}
}
