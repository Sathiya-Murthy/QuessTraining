//package Hackathon;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//class Game {
//    private int randomNumber,score;
//    private String inputWord;
//    private final Scanner scanner = new Scanner(System.in);
//
//    private int tempHighScore=0;
//    public Game(){
//        score=0;
//    }
//
//    void game() throws IOException {
//        String[] gameWords={"rock","paper","scissors","paper","scissors","rock","scissors","rock","paper",};
//        do {
//            System.out.print("Enter you input from rock paper scissors and quit: ");
//            inputWord=scanner.next();
//            randomNumber=(int) (Math.random()*8+0);
//            if(inputWord.contains("rock") || inputWord.contains("paper") || inputWord.contains("scissors")){
//                if(inputWord.equals("rock")){
//                    if(gameWords[randomNumber].equals("scissors")){
//                        System.out.println("you win.");
//                        score++;
//                    }else if (gameWords[randomNumber].equals("paper")) {
//                        System.out.println("you loss");
//                        if(tempHighScore<=score){
//                            tempHighScore=score;
//                        }
//                        System.out.println("Your Score :"+score);
//                        score=0;
//                    }else if (gameWords[randomNumber].equals("rock")) {
//                        System.out.println("game draw");
//                    }
//                }
//                if(inputWord.equals("paper")){
//                    if(gameWords[randomNumber].equals("rock")){
//                        System.out.println("you win.");
//                        score++;
//                    }else if (gameWords[randomNumber].equals("scissors")) {
//                        System.out.println("you loss");
//                        if(tempHighScore<=score){
//                            tempHighScore=score;
//                        }
//                        System.out.println("Your Score :"+score);
//                        score=0;
//                    }else if (gameWords[randomNumber].equals("paper")) {
//                        System.out.println("game draw");
//                    }
//                }
//                if(inputWord.equals("scissors")){
//                    if(gameWords[randomNumber].equals("paper")){
//                        System.out.println("you win.");
//                        score++;
//                    }else if (gameWords[randomNumber].equals("rock")) {
//                        System.out.println("you loss");
//                        if(tempHighScore<=score){
//                            tempHighScore=score;
//                        }
//                        System.out.println("Your Score :"+score);
//                        score=0;
//                    }else if (gameWords[randomNumber].equals("scissors")) {
//                        System.out.println("game draw");
//                    }
//                }
//            }else if (inputWord.equals("quit")) {
//                System.out.println("Your Score: "+tempHighScore);
//                break;
//            }else {
//                System.out.println("Wrong input.");
//            }
//        }while (true);
//        setHighscore(tempHighScore);
//    }
//    void setHighscore(int tempHighScore) throws IOException {
//        HighScore hScore=new HighScore();
//
//        if(tempHighScore>hScore.getHighScore()){
//            hScore.setHighScore(tempHighScore);
//        }
//    }
//}
