package document;

public class DocumentChecker {
    public static void main(String[] args) {

/*        ExcelDocument excel = new ExcelDocument();
        PdfDocument pdf = new PdfDocument();*/

        Document excel = new ExcelDocument();
        Document pdf = new PdfDocument();

        excel.getDescription();
        pdf.getDescription();
    }
}
