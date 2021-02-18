//tess4j
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

//files
import java.io.File;


public class tesseract {
    private static Tesseract getTesseract() {
        Tesseract instance = new Tesseract();
        instance.setDatapath("C:/Users/nilimapradipm/Documents/tessaract/src/main/resources/");
        instance.setLanguage("eng");
        return instance;


    }

    public static void main(String[] args) throws TesseractException {
        Tesseract tesseract = getTesseract();


       //File file = new File("C:/Users/nilimapradipm/Downloads/receipt.pdf");
        File file = new File("C:/Users/nilimapradipm/Documents/tessaract/src/main/resources/10125.pdf");

       // File file = new File("C:/Users/nilimapradipm/Documents/tessaract/src/main/resources/DS_Edge.pdf");
      //  File file = new File("C:/Users/nilimapradipm/Documents/tessaract/src/main/resources/DS_FOS.pdf");
      //File file = new File("C:/Users/nilimapradipm/Documents/tessaract/src/main/resources/VG_FOS.pdf");
      //File file = new File("C:/Users/nilimapradipm/Documents/tessaract/src/main/resources/MK_FOS.pdf");
       //File file = new File("C:/Users/nilimapradipm/Documents/tessaract/src/main/resources/Franchise Variable Commission Claim- Oct 20.pdf");


        String result = tesseract.doOCR(file);
        System.out.println(result);
    }
}