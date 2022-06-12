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

