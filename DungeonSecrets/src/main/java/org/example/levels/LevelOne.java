package org.example.levels;

import org.example.characters.Character;

import java.util.List;

public class LevelOne extends Level {

    public LevelOne(List<Character> characterList) {
        super("The Begining",characterList,true,false);
    }

    public LevelOne(String name, List<Character> characterList, boolean isVisited, boolean isFinished) {
        super(name, characterList, isVisited, isFinished);
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
