package com.example.musikvrelset.circle;
/**
 * Created by martinutzon on 11/09/15.
 */
public class Circle {
    float x;
    float y;
    float sound_level;
    final static int RADIUS = 25;


    public Circle(float x, float y, float sound_level) {
        this.x = x;
        this.y = y;
        this.sound_level = sound_level;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getSound_level() {
        return sound_level;
    }

    public void setSound_level(float sound_level) {
        this.sound_level = sound_level;
    }
}
