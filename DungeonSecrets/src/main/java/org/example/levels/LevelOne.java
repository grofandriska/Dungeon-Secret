package org.example.levels;

import org.example.characters.Character;
import org.example.characters.mobs.Skeleton;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println(player.toString());
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
