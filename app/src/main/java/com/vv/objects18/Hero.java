package com.vv.objects18;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class Hero {
    int x, y;
    String name;
    Bitmap pic;

    void draw(Canvas canvas){
         Rect from = new Rect(0, 0,
                 pic.getWidth(), pic.getHeight());
         Rect to = new Rect(x, y, x + 100, y + 200);
         canvas.drawBitmap(pic, from, to, null);

    }
}
