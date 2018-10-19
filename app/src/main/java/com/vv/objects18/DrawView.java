package com.vv.objects18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class DrawView extends View {
    Hero hero;
    public DrawView(Context context) {
        super(context);
        setBackgroundColor(Color.GRAY);
        Bitmap pic = BitmapFactory
                .decodeResource(getResources(),
                        R.drawable.team_lead);
        hero = new Hero();
        hero.x = 10;
        hero.y = 25;
        hero.pic = pic;
        hero.name = "Jonny";
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hero.draw(canvas);
    }
}
