# Dungeon-Secret
 
This is a classic stlye RPG game developed in Java. The player meets various types of events and mobs in different levels. Also has the ability to use inventory, magic and so on ...

0.10 -> 

*****************************************************************
Characters.creater.ChracterCreate.class

Character init() added wich helps to create our character. 
There are 50 point to distribute for stats like dexterity, mana , etc...
@returns-> Character.class


*****************************************************************
Behaviour.CharacterActions.class


String makeWarCry();
String dialog();
void heal ();

*****************************************************************

Characters.Character.class 

It is an abstract class and mobs and player are extending it . the type of characters are : Archer, Mage , Warrior, Necromancer,Skeleteon , Orc implementing "same" attributes :

@Fields

String name 
Integer healthPoint 
Integer dexterity 
Integer mannaPoints
Integer Luck 
List<Item> inventory 
Boolean isHostile 
Integer strength

*****************************************************************

Levels.level.class

This is an abstract class. It's subclasses are the exact levels, implementing it's own chapters inside methods where events gona occure.

the fields are :

  String name;

  List<Character> characterList;

  Character player;

  boolean isVisited;

  boolean isFinished;
  
  and methods doing the job like @ChapterOne() -> returns character;


