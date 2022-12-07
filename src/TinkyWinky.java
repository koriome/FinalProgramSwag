import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


/**
 * ad-libs but cooler
 * @author David Miller, Andrew Brodowski, Joey Graves
 */
public class TinkyWinky {

    public static void main(String[] args) {
        TinkyWinky swag = new TinkyWinky();
        Scanner shoot = new Scanner(System.in);
        System.out.println("Enter the name of your file:");
        String peanutButter = shoot.next();
        shoot.close();
        swag.playTextPredictor(peanutButter);
    }

    /**
     * Reads a file and puts all the words into an arraylist.
     * @param thinkStation, String the name of a a file
     * @return An arraylist of every word in the text file
     */
    public ArrayList loadFillableMessage(String thinkStation){
        thinkStation = thinkStation + ".dat";
        File bowserJr = new File(thinkStation);
        Scanner scanly = null;
        ArrayList<String> wow = new ArrayList<>();
        try{
            scanly = new Scanner(bowserJr);
            while(scanly.hasNext()){
                wow.add(scanly.next());
            }
        }catch(FileNotFoundException owenWilson){
            System.out.println("file not found, couldn't be me honestly.");
            owenWilson.printStackTrace();
        }finally{
            scanly.close();
        }
        return wow;
    }

    /**
     * Takes every prediction and has the user input a word for them
     * replaces prediction with word
     * @param deez , our arraylist of all the words in the file
     * @return Arraylist, the file with all predictions filled in
     */
    public ArrayList predictionInputFill(ArrayList deez){
        Scanner babyMario = new Scanner(System.in);
        for(int i = 0; i < deez.size(); i++){
            String doctorMan = (String) deez.get(i);
            if (doctorMan.charAt(0) == '[' && doctorMan.charAt(doctorMan.length() - 1) == ']'){
                System.out.printf("Please enter a/an %s:", doctorMan.substring(1, doctorMan.length()-1));
                String sillyMode = babyMario.nextLine();
                deez.set(i, sillyMode);
            }
        }
        babyMario.close();
        return deez;
    }

    public void shareFinalResult(ArrayList jelly){

    }

    public void playTextPredictor(String yuh /*filename*/){
        ArrayList<String> johnin = loadFillableMessage(yuh);
        johnin = predictionInputFill(johnin);
        System.out.println(johnin);
    }

}
