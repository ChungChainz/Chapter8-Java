package game_zone;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args)
    {
        int wrong = 0;
        int correct = 0;
        String userEntry;

        Scanner input = new Scanner(System.in);
        String[] questionArray = new String[]{
                "1. What NFL team won the Super Bowl in 2017?" +
                        "\nA. Patriots\nB. Falcons\nC. Colts",
                "2. Who is the NFL all time leader in passing TD's?" +
                        "\nA. Brett Farve\nB. Peyton Manning\nC. Dan Marino",
                "3. Who had the most amount of fantasy points in PPR leagues in 2018?" +
                        "\nA. Patrick Mahomes\nB. Todd Gurley \nC. Christian McCaffery",
                "4. Where did Aaron Rodgers go to college?" +
                        "\nA. UCLA\nB. Nevada\nC. California-Berkeley",
                "5. Where are the Oakland Raiders planning on relocating during the 2020 season?" +
                        "\nA. London\nB. Toronto\nC. Las Vegas",
                "6. Which college had the most players drafted in the 2019 Draft?" +
                        "\nA. Ohio State\nB. Oklahoma\nC. Alabama",
                "7. What players was known for 'salsa' dancing as their TD celebration?" +
                        "\nA. Santana Moss\nB. Victor Cruz\nC. Mark Sanchez",
                "8. What famous phrase did Matt Hasselbeck say in OT during the '04 Wild card game vs the GB Packers? " +
                        "\nA. We'll take the ball, and we're gonna score" +
                        "\nB. They can't score! Give'em the ball." +
                        "\nC. I'm on fire. Give us the ball ref.",
                "9. What teams were playing in the game known as the 'Tuck Rule' Game " +
                        "\nA. Patriots/Chiefs \nB. Raiders/Bills \nC. Patriots/Raiders",
                "10. Which of the following teams have never won a Super Bowl?" +
                        "\nA. Saints \nB. Lions \nC. Buccaneers"};
        String[] correctAnswer = new String[]{"A","B","A","C","C","C","B","A","C","B"};
        for(int i = 0; i < 10; ++i)
        {
            System.out.println(questionArray[i]);
            userEntry = input.next();
            if(userEntry.equalsIgnoreCase(correctAnswer[i]))
            {
                System.out.println("Correct!");
                ++correct;
            }
            else
            {
                System.out.println("Wrong, The correct answer is " + correctAnswer[i]);
                ++wrong;
            }
        }
        System.out.println("You got " + correct + " correct answers.\n" +
                "You got " + wrong + " incorrect answers.");
    }
}
