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
            System.out.print("Choose your word rock paper scissors and quit: ");
            yourChoice =scanner.next();
            randomNumber=(int) (Math.random()*8+0);
            if(yourChoice.contains("rock") || yourChoice.contains("paper") || yourChoice.contains("scissors")){
                if(yourChoice.equals("rock")){
                    switch (opponentChoice[randomNumber]) {
                        case "scissors" -> {
                            System.out.println("you win..");
                            score++;
                            tempHighScore=score;
                        }
                        case "paper" -> {
                            System.out.println("you loss :(");
                            if (tempHighScore <= score) {
                                tempHighScore = score;
                                setHighScore(tempHighScore);
                            }
                            System.out.println("Your Score :" + score);
                            score = 0;
                        }
                        case "rock" -> System.out.println("game draw");
                    }
                }
                if(yourChoice.equals("paper")){
                    switch (opponentChoice[randomNumber]) {
                        case "rock" -> {
                            System.out.println("you win..");
                            score++;
                            tempHighScore=score;
                        }
                        case "scissors" -> {
                            System.out.println("you loss :(");
                            if (tempHighScore <= score) {
                                tempHighScore = score;
                                setHighScore(tempHighScore);
                            }
                            System.out.println("Your Score :" + score);
                            score = 0;
                        }
                        case "paper" -> System.out.println("game draw");
                    }
                }
                if(yourChoice.equals("scissors")){
                    switch (opponentChoice[randomNumber]) {
                        case "paper" -> {
                            System.out.println("you win..");
                            score++;
                            tempHighScore=score;
                        }
                        case "rock" -> {
                            System.out.println("you loss:(");
                            if (tempHighScore <= score) {
                                tempHighScore = score;
                                setHighScore(tempHighScore);
                            }
                            System.out.println("Your Score :" + score);
                            score = 0;
                        }
                        case "scissors" -> System.out.println("game draw");
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
            System.out.println("Your new high score :)");
            personDetails.setPersonScore(tempHighScore);
            if(personDetails.getPersonScore()>highScore.getHighScore()){
                System.out.println("Your Score is the highest score");
                highScore.setHighScore(personDetails.getPersonScore());
            }
        }
    }
}

