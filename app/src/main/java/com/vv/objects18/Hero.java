package com.vv.objects18;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

import java.util.Random;

public class Hero {
    float x, y;
    float vx, vy;
    String name;
    Bitmap pic;

    void go(){
        x += vx;
        y += vy;
        if (x < 0) x = 1080;
        if (x > 1080) x = 0;
        if (y > 1920) y = 0;
        if (y < 0) y = 1920;
    }

    Hero(float x, float y,  String name, Bitmap pic, float vx, float vy){
        this.x = x;
        this.y = y;
        this.name = name;
        this.pic = pic;
        this.vx = vx;
        this.vy = vy;
    }
    Hero(String name, Bitmap pic){
        this.name = name;
        this.pic = pic;
        Random r = new Random();
        this.x = r.nextInt(800);
        this.y = r.nextInt(1000);
        this.vx = r.nextFloat() * 4 - 2;
        this.vy = r.nextFloat() * 4 - 2;
    }

    void draw(Canvas canvas){
         RectF to = new RectF(x, y, x + 100, y + 200);
         canvas.drawBitmap(pic, null, to, null);

    }
}
