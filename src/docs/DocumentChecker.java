package docs;

import document.Document;
import document.ExcelDocument;
import document.PdfDocument;

public class DocumentChecker {
    public static void main(String[] args) {
/*        ExcelDocument excelDocument = new ExcelDocument();
        PdfDocument pdfDocument =new PdfDocument();*/

        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
