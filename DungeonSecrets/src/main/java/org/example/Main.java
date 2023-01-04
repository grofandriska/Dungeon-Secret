package org.example;


import org.example.characters.creater.CharacterCreate;

import org.example.levels.LevelOne;


public class Main {
    public static void main(String[] args) {
        CharacterCreate create = new CharacterCreate();

        LevelOne level = new LevelOne();
        level.setPlayer(create.initCharacter());
        level.ChapterOne();
        System.out.println(level.getCharacterList());

        //TODO : organise every steps into classes and methods to make code more readable -> Game initalizer should create all objects etc...

        //TODO : mobs unique ID and ? name ?


    }
}