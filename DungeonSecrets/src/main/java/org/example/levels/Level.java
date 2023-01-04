package org.example.levels;

import org.example.characters.Character;

import java.util.List;

public abstract class Level {

    protected String name;

    protected List<Character> characterList;

    protected boolean isVisited;

    protected boolean isFinished;

    public Level(String name, List<Character> characterList, boolean isVisited, boolean isFinished) {
        this.name = name;
        this.characterList = characterList;
        this.isVisited = isVisited;
        this.isFinished = isFinished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
