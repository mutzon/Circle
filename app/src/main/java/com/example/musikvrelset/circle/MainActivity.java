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



public class MainActivity extends AppCompatActivity {
    private static final String MUTZO = "tag";
    Bitmap bitmap;
    Drawable drawable;

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


            drawable.setBounds(0,0,x,y);
            drawable.draw(canvas);
            canvas.drawCircle(34, 200, radius, paint);

        }
    }
}