import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        String setBoldText = "\033[0;1m";
        String setPlainText = "\033[0;0m";
//         Project number 1
        System.out.println("You are in a land full of dragons. In front of you, you see two caves. In One cave, the dragon is friendly and will share his treasure with you. \n" +
                " The other dragon is greedy and hungry and will eat you on sight. Which cave will you go into? ( 1 or 2)");
        boolean flag = true;

        while (flag) {
            try {
                Scanner input = new Scanner(System.in);
                String userInput = input.next();
                System.out.println("Your choice:"+ setBoldText +userInput);

                if (userInput.equals("1")) {
                    System.out.println(setPlainText+ "You approach the cave..It is dark and spooky...A large dragon jumps out in front of you! He opens his jaw and...Gobbles you down in one bite");
                    flag = false;
                } else if(userInput.equals("2")){
                    System.out.println(setPlainText+"You approach the cave..It is full of shimmering light with treasures at every sight...A friendly dragon looks into your eyes and you become friends.." +
                            "He shares his \n" + "treasures with you...You are rich for life with friendship and treasures!");
                    flag = false;
                }
                else {
                    System.out.println(setPlainText+"You have entered wrong input please enter 1 or 2.");
                }
            } catch (Exception e) {
                System.out.println(setPlainText+"Wrong input...Your only choices are 1 and 2..");
            }
        }
    }
}
