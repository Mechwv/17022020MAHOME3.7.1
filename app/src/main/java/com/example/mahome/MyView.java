package com.example.mahome;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);

        paint.setColor(Color.parseColor("#008000"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(2,1500,2750,3530,paint);

        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(120,120,150,paint);
        boolean loong = true;
        float grow = 1;
        Path path = new Path();
        paint.setStyle(Paint.Style.STROKE);
        for (int i = 0; i < 15;i++){

            grow+=0.2;
            path.moveTo(120,120);
            if (loong) {
                path.lineTo(500-i*20/grow,200+i*15*grow);
                loong = false;
            }
            else{
                path.lineTo(200-i*20/grow,200+i*20*grow);
                loong = true;
            }

            canvas.drawPath(path,paint);
        }
    }
}
