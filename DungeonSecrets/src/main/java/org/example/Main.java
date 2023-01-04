package org.example;

import org.example.characters.Character;
import org.example.characters.creater.CharacterCreate;
import org.example.characters.mobs.Skeleton;
import org.example.levels.Level;
import org.example.levels.LevelOne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharacterCreate create = new CharacterCreate();

        Character mob ;
        List<Character> mobs = new ArrayList<>();
        for (int i = 0; i< 10;i++){
            mob = new Skeleton();
            mobs.add(mob);
        }
        mobs.add(create.initCharacter());

        Level level = new LevelOne(mobs);

        //TODO : organise every steps into classes and methods to make code more readable -> Game initalizer should create all objects etc...


    }
}