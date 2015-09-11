package com.example.musikvrelset.circle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Bitmap bitmap;
    Drawable drawable;

    Circles c1 = new Circles(50f,425.2f, 0.80f);
    Circles c2 = new Circles(1200f,535f, 0.10f);
    Circles c3 = new Circles(320f,50.2f, 0.50f);
    List<Circles> circle = new ArrayList<>();


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(new MyView(this));

    }

    public class MyView extends View {


        int radius = 30;
        public MyView(Context context) {
            super(context);
            // TODO Auto-generated constructor stub
            circle.add(c1);
            circle.add(c2);
            circle.add(c3);
        }

        @Override
        protected void onDraw(Canvas canvas) {

            // TODO Auto-generated method stub
            super.onDraw(canvas);

            drawable = this.getResources().getDrawable(R.drawable.third_floor);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            int x = getWidth();
            int y = getHeight();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            drawable.setBounds(0, 0, x, y);
            drawable.draw(canvas);

            for (Circles c : circle) {
                paint.setColor(Colours.getColor(c.getSound_Level()));
                paint.setAlpha(100);
                canvas.drawCircle(c.getX(), c.getY(), radius, paint);
            }


        }
    }
}