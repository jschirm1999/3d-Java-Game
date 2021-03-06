package com.barbarian.game.models;

import com.badlogic.gdx.math.Quaternion;

import java.io.Serializable;
import java.util.Random;

public class Player implements Serializable {

  /*  @Column
    public Location location;
*/

/*    //DO add params for health and stuff. Allow getting of said variables.
    public Player(@JsonProperty("id") Integer id,
                  @JsonProperty("name") String name,
                  @JsonProperty("health") double health){
                  //@JsonProperty("location") Location location) {
        this.id = id;
        this.name = name;
        this.health = health;
       // this.location = location;
    }*/

    private Integer id;

    private double health;

    private int color;

    private Location location;

    private int characterState;

    private double attackDamage;

    private double attackRange;

    private double  manaPool;

    private Quaternion rotation;

    public Player() {
        this.characterState = 0;
        this.location = new Location();
        this.health = 100;
        this.attackDamage = 5;
        this.attackRange = 6;
        this.manaPool = 0;
        Random random = new Random();
        this.id = random.nextInt(3000);
        this.color = 0;
        this.rotation = (new Quaternion()).setEulerAnglesRad(0,0,0);
    }

    public Player(int id, float x, float y, float z, float w)
    {
        this.characterState = 0;
        this.location = new Location(x, y, z, w);
        this.health = 100;
        this.attackDamage = 5;
        this.attackRange = 6;
        this.manaPool = 0;
        this.id = id;
        this.color = 0;
        this.rotation = (new Quaternion()).setEulerAnglesRad(w,0,0);
    }

    public Player(Integer id, double health, int color, Location location, int characterState, double attackDamage, double attackRange, double manaPool, Quaternion rotation) {
        this.id = id;
        this.health = health;
        this.color = color;
        this.location = location;
        this.characterState = characterState;
        this.attackDamage = attackDamage;
        this.attackRange = attackRange;
        this.manaPool = manaPool;
        this.rotation = rotation;
    }

    public Player(int id, Location location)
    {
        this.characterState = 0;
        this.location = location;
        this.health = 100;
        this.attackDamage = 5;
        this.attackRange = 6;
        this.manaPool = 0;
        this.id = id;
        this.color = 0;
        this.rotation = (new Quaternion()).setEulerAnglesRad(location.getW(),0,0);
    }


    public Integer getId() {
        return id;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) { this.health = health; }

    public int getColor() { return this.color; }

    public void setColor(int color) {
        this.color = color;
    }

    public void setLocation(Location location) { this.location = location; }

    public Location getLocation() { return this.location != null ? this.location : new Location(); }


    public int getCharacterState() {
        return characterState;
    }

    public void setCharacterState(int characterState) {
        this.characterState = characterState;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(double attackRange) {
        this.attackRange = attackRange;
    }

    public double getManaPool() {
        return manaPool;
    }

    public void setManaPool(double manaPool) {
        this.manaPool = manaPool;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Quaternion getRotation() {
        return this.rotation;
    }

    public void setRotation(Quaternion rotation) {
        this.rotation = rotation;
    }
}
