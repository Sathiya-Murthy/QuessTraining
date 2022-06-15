package Hackathon;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class HighScore {
    public void setHighScore(int score) throws IOException {
        String path="D://Hackathon//HighScore.txt";
        File object =new File(path);
        FileWriter fileWriter = new FileWriter(object);
        String passValue=Integer.toString(score);
        fileWriter.write(passValue);
        fileWriter.close();
    }
    public int getHighScore() throws IOException {
        ArrayList<Character> characterArrayList=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();
        String path="D://Hackathon//HighScore.txt";
        File fileObject =new File(path);
        FileReader fileReader=new FileReader(fileObject);
        int i= fileReader.read();
        while (i!=-1){
            characterArrayList.add((char)i);
            i=fileReader.read();
        }
        fileReader.close();
        for(char character:characterArrayList){
            stringBuilder.append(character);
        }
        String stringValue=stringBuilder.toString();
        return Integer.parseInt(stringValue);
    }
}

class PersonDetails{
    public void setPersonName(String name) throws IOException {
        String path="D://Hackathon//PersonName.txt";
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(name);
        fileWriter.close();
    }
    public String getPersonName() throws IOException {
        ArrayList<Character> characterArrayList=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();
        String path="D://Hackathon//PersonName.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        int i= fileReader.read();
        while (i!=-1){
            characterArrayList.add((char)i);
            i=fileReader.read();
        }
        fileReader.close();
        for(char character:characterArrayList){
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
    public void setPersonScore(int personScore) throws IOException {
        String path="D://Hackathon//PersonScore.txt";
        File object =new File(path);
        FileWriter fileWriter = new FileWriter(object);
        String passValue=Integer.toString(personScore);
        fileWriter.write(passValue);
        fileWriter.close();
    }
    public int getPersonScore() throws IOException {
        ArrayList<Character> characterArrayList=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();
        String path="D://Hackathon//PersonScore.txt";
        File fileObject =new File(path);
        FileReader fileReader=new FileReader(fileObject);
        int i= fileReader.read();
        while (i!=-1){
            characterArrayList.add((char)i);
            i=fileReader.read();
        }
        fileReader.close();
        for(char character:characterArrayList){
            stringBuilder.append(character);
        }
        String stringValue=stringBuilder.toString();
        return Integer.parseInt(stringValue);
    }
}

class Game {
    private int score;
    private final Scanner scanner = new Scanner(System.in);
    private int tempHighScore=0;
    public Game(){
        score=0;
    }
    void game() throws IOException {
        int randomNumber;
        String yourChoice;
        String[] opponentChoice={"rock","paper","scissors","paper","scissors","rock","scissors","rock","paper",};
        do {
            System.out.print("Choose type your word rock paper scissors and quit: ");
            yourChoice =scanner.next();
            yourChoice=yourChoice.toLowerCase();
            randomNumber=(int) (Math.random()*8+0);
            if(yourChoice.contains("rock") || yourChoice.contains("paper") || yourChoice.contains("scissors")){
                if(yourChoice.equals("rock")){
                    switch (opponentChoice[randomNumber]) {
                        case "scissors" -> {
                            System.out.println("player win..");
                            System.out.println("Computer choose scissors");
                            score++;
                            tempHighScore=score;
                        }
                        case "paper" -> {
                            System.out.println("player loss :(");
                            System.out.println("Computer choose paper");
                            System.out.println("Your Score :" + score);
                            System.out.println("Your score will be reset");
                            if (tempHighScore <= score) {
                                tempHighScore = score;
                                setHighScore(tempHighScore);
                            }
                            score = 0;
                        }
                        case "rock" ->{
                            System.out.println("game draw");
                            System.out.println("Computer also choose rock");
                        }
                    }
                }
                if(yourChoice.equals("paper")){
                    switch (opponentChoice[randomNumber]) {
                        case "rock" -> {
                            System.out.println("player win..");
                            System.out.println("Computer choose rock");
                            score++;
                            tempHighScore=score;
                        }
                        case "scissors" -> {
                            System.out.println("player loss :(");
                            System.out.println("Computer choose scissors");
                            System.out.println("Your Score :" + score);
                            System.out.println("Your score will be reset");
                            if (tempHighScore <= score) {
                                tempHighScore = score;
                                setHighScore(tempHighScore);
                            }
                            score = 0;
                        }
                        case "paper" ->{
                            System.out.println("game draw");
                            System.out.println("Computer also choose paper");
                        }
                    }
                }
                if(yourChoice.equals("scissors")){
                    switch (opponentChoice[randomNumber]) {
                        case "paper" -> {
                            System.out.println("player win..");
                            System.out.println("Computer choose paper");
                            score++;
                            tempHighScore=score;
                        }
                        case "rock" -> {
                            System.out.println("player loss:(");
                            System.out.println("Computer choose rock");
                            System.out.println("Your Score :" + score);
                            System.out.println("Your score will be reset");
                            if (tempHighScore <= score) {
                                tempHighScore = score;
                                setHighScore(tempHighScore);
                            }
                            score = 0;
                        }
                        case "scissors" -> {
                            System.out.println("game draw");
                            System.out.println("Computer also choose scissors");
                        }
                    }
                }
            }else if (yourChoice.equals("quit")) {
                System.out.println("Your Score: "+tempHighScore);
                setHighScore(tempHighScore);
                break;
            }else {
                System.out.println("Wrong input.");
            }
        }while (true);
    }
    void setHighScore(int tempHighScore) throws IOException {
        HighScore highScore=new HighScore();
        PersonDetails personDetails= new PersonDetails();
        if(tempHighScore>personDetails.getPersonScore()){
            personDetails.setPersonScore(tempHighScore);
            System.out.println("Your new high score :"+personDetails.getPersonScore());
            if(personDetails.getPersonScore()>highScore.getHighScore()){
                highScore.setHighScore(personDetails.getPersonScore());
                System.out.println("Your Score is the highest score");
            }
        }
    }
}

public class HackathonProgram {
    public static void main(String[] args) throws IOException {
        byte input;
        HighScore highScore = new HighScore();
        PersonDetails personDetails =new PersonDetails();
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.New Game\n2.Continue\n3.HighScore\nEnter your choice: ");
        input = scanner.nextByte();
        switch (input) {
            case 1: {
                System.out.print("Enter the player name: ");
                String playerName=scanner.next();
                personDetails.setPersonName(playerName);
                personDetails.setPersonScore(0);
            }
            case 2: {
                System.out.println("HighScore : "+highScore.getHighScore());
                game.game();
                break;
            }
            case 3: {
                System.out.println("HighScore : " + highScore.getHighScore());
                System.out.println(personDetails.getPersonName() +"'s high score :" + personDetails.getPersonScore());
                break;
            }
            default: {
                System.out.println("Wrong input");
            }
        }
    }
}