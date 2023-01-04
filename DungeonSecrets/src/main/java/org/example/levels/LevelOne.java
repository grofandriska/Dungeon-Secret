package org.example.levels;

import org.example.characters.Character;
import org.example.characters.mobs.Skeleton;
import org.example.items.Item;
import org.example.items.Letter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LevelOne extends Level {


    {
        this.characterList = new ArrayList<>();

        Character mob ;
        List<Character> mobs = new ArrayList<>();
        for (int i = 0; i< 10;i++){
            mob = new Skeleton();
            mobs.add(mob);
        }
    }
    public LevelOne() {
    }
    public LevelOne(List<Character> characterList) {
        super("The Begining",characterList,true,false);
    }
    public LevelOne(String name, List<Character> characterList, boolean isVisited, boolean isFinished) {
        super(name, characterList, isVisited, isFinished);
    }

    public Character ChapterOne(){
        boolean isFinished = false;
        boolean hasLetter = false;
        System.out.println("You are walking in the villages cemetery to your dead parents grave. Every year you are making this route to pay respect for your elders." +
                "You reached your destination and put some flowers and meal next to their grave. - I miss you so much - you think and broke down into tears. Meanwhile the sun is " +
                "downing so you prepare to leave this place. When you reach the gates, they are seem to be closed : What would you do?");
        this.setPlayerLocation("Gates");
        System.out.println("1 --> Shout loud : HELP !\n2 --> Return to your parents grave\n3 --> Wait \n4--> Look around");


        while (!isFinished) {
            Scanner scanner = new Scanner(System.in);
            if (this.getPlayerLocation().equals("Gates")){
                int choice = scanner.nextInt();
                System.out.println("1 --> Shout loud : HELP !\n2 --> Return to your parents grave\n3 --> Wait \n4--> Look around");
                if (choice == 1) {
                    System.out.println("You are yelling : Help ! HEELP ! But none is around so only the echo is replies to you ");
                } else if (choice == 2) {
                    System.out.println(" You are walking back to your parents grave. You realised that their grave is empty. Someone must been here ..." +
                            "Meanwhile it's got dark");
                    this.setPlayerLocation("Grave");

                } else if (choice == 3) {
                    System.out.println("Nothing Happens. Just getting more Dark outside");

                } else if (choice == 4) {
                    System.out.println("You found a letter :");
                    Letter letter = new Letter("GraveNote",1);
                    letter.setDetails("If you want to escape go back to your parents grave and say : I am grown, i don't miss you anymore");
                    player.setInventory(List.of(letter));
                    hasLetter = true;
                }
            }

            if (this.getPlayerLocation().equals("Grave")){
                int choice = scanner.nextInt();
                if (hasLetter){
                    System.out.println("1 --> Do what letters sad\n2--> return to the gate\n3--> wait");
                    if (choice == 1){
                        isFinished= true;
                    }
                    if (choice == 2){
                        this.setPlayerLocation("Gates");
                    }
                    if (choice == 3){
                        System.out.println("nothing happened");
                    }
                }
                System.out.println("1 --> return to the gate\n2--> wait");
                if (choice == 1){
                    this.setPlayerLocation("Gates");
                }
                if (choice == 2){
                    System.out.println("nothing happened");
                }
            }
        }

        return this.player;
    }

    @Override
    public String toString() {
        return "LevelOne{" +
                "name='" + name + '\'' +
                ", characterList=" + characterList +
                ", isVisited=" + isVisited +
                ", isFinished=" + isFinished +
                '}';
    }
}
