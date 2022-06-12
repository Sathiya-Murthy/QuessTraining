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

