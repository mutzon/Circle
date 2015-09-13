package com.example.musikvrelset.circle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private static final String MUTZO = "tag";
    Bitmap bitmap;
    Drawable drawable;
    Circle c1 = new Circle(50f,425.5f,0.80f);
    Circle c2 = new Circle(1200f,535.5f,0.10f);
    Circle c3 = new Circle(320f,50f,0.50f);
    List<Circle> circle = new ArrayList<>();

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(new MyView(this));


    }

    public class MyView extends View {
        int radius = 50;
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
            int color = Colours.getColor(0.8f);
            Log.d(MUTZO, "Color: " + color);

            paint.setColor(color);
            paint.setAlpha(100);


            drawable.setBounds(0, 0, x, y);
            drawable.draw(canvas);

            for (Circle c : circle)  {
                paint.setColor(Colours.getColor(c.getSound_level()));
                paint.setAlpha(100);
                canvas.drawCircle(c.getX(),c.getY(),radius,paint);

            }

            canvas.drawCircle(34, 200, radius, paint);

        }
    }
}