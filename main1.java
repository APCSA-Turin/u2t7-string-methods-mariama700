import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        
        System.out.print("Enter your first word here: ");
        String firstWord = scan.nextLine();
        counter++;

        System.out.print("Enter a new word here: ");
        String newWord = scan.nextLine();
        counter++;

        int points = 0;

        while (points <= 50) {
            if (newWord.compareTo(firstWord) > 0) {
                points += 2;
                System.out.println("+2 points, word is alphabetically after. ");
                System.out.println("Score: " + points);
            } 
            if (newWord.compareTo(firstWord) < 0) {
                points -= 5;
                System.out.println("-5 points, word is alphabetically before. ");
                System.out.println("Score: " + points);
            }
            if (newWord.equals(firstWord)) {
                points -=10;
                System.out.println("-10 points, words are the same. ");
                System.out.println("Score: " + points);
            }

            if (firstWord.substring(firstWord.length()-2).equals(newWord.substring(0,2))) {
                points += 5;
                System.out.println("+5 points, last two letters of previous word are first two in new word.");
                System.out.println("Score: " + points);
            }


            if (newWord.indexOf(firstWord.substring(0,1)) != -1){
                points += 3;
                System.out.println("+3 points, first letter of first word is in new word.");
                System.out.println("Score: " + points);
            }

            if (newWord.length() == firstWord.length()){
                points += 10;
                System.out.println("+10 points, both words are the same length");
                System.out.println("Score: " + points);
            }
            
            if (points >= 50){
                break;
            }
            firstWord = newWord;
            System.out.print("Enter a new word: ");
            newWord = scan.nextLine();
            counter += 1;
        }

    

System.out.println("Thank you for playing!");
System.out.println("It took you " + counter + " words!");
System.out.println("Your final score was: " + points);

scan.close();

   }
}
