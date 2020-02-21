package com.example.mahome;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.view.View;

import androidx.annotation.RequiresApi;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }
    Paint paint = new Paint();
    Paint s = new Paint();
    Path path = new Path();
    Path path1 = new Path();
    Path path2 = new Path();
    Path path3 = new Path();
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);


        s.setAntiAlias(true);
        s.setStrokeWidth(5);
        s.setStyle(Paint.Style.STROKE);
        s.setColor(Color.BLACK);

        paint.setColor(Color.parseColor("#008000"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(2,1300,1950,3530,paint);

        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(60,60,75,paint);

        paint.setStyle(Paint.Style.STROKE);
        int y = 10,x=350,x1=250,y1=100,lines = 20;
        for (int i = 0; i < lines; i++) {
            path.moveTo(60, 60);
            if (i % 2 == 0) {
                path.lineTo(x, y);
            } else {
                path.lineTo(x1, y1);
            }
            if (i < lines / 2) {
                y+=20;
                y1+=20;
                x-=10;
                x1-=10;
            }
            else {
                y+=10;
                y1+=10;
                x-=30;
                x1-=30;
            }
            canvas.drawPath(path,paint);
        }

        paint.setColor(Color.parseColor("#804000"));
        paint.setStyle(Paint.Style.FILL);
        path1.moveTo(150, 1000);
        path1.lineTo(450, 1000);
        path1.lineTo(300, 800);
        path1.lineTo(150, 1000);
        canvas.drawPath(path1,paint);

        path1.moveTo(150, 1000);
        path1.lineTo(150, 1400);
        path1.lineTo(450, 1400);
        path1.lineTo(450, 1000);
        path1.lineTo(150, 1000);
        canvas.drawPath(path1,paint);

        canvas.drawRect(700,1250,750,1350,paint);

        paint.setColor(Color.GREEN);
        canvas.drawOval(600,800,850,1250,paint);
        canvas.drawOval(600,800,850,1250,s);

        paint.setColor(Color.GRAY);
        path2.moveTo(600, 1405);
        path2.lineTo(950, 1405);
        path2.lineTo(950, 1450);
        path2.lineTo(600, 1450);
        path2.lineTo(600, 1405);


        path2.moveTo(625, 1450);
        path2.lineTo(675, 1450);
        path2.lineTo(675, 1550);
        path2.lineTo(625, 1550);
        path2.lineTo(625, 1450);

        path2.moveTo(875, 1450);
        path2.lineTo(925, 1450);
        path2.lineTo(925, 1550);
        path2.lineTo(875, 1550);
        path2.lineTo(875, 1450);
        canvas.drawPath(path2,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1);
        paint.setColor(Color.BLUE);
        int stx=300,sty=920,len=25;// 335 885
        for (double a=-30; a<120; a+=5) {
            canvas.drawLine(
                    (float)(stx + 50*Math.cos(Math.toRadians(a+90))),
                    (float)(sty - 50*Math.sin (Math.toRadians(a+90))),
                    (float)(stx + 50*Math.cos (Math.toRadians(-a))),
                    (float)(sty - 50*Math.sin (Math.toRadians(-a))), paint);
        }


        stx = 425; sty = 1150;
        paint.setColor(Color.WHITE);
        int count = 10,dist = 12,sty1=1145;
        while (stx > 310) {
            stx -= 12;
            sty += 12;
            canvas.drawLine(stx, 1150, 425, sty, paint);
        }
        while (sty < 1400) {
            sty+= 12;
            sty1+=12;
            canvas.drawLine(300,sty1,425,sty,paint);
        }
        stx = 425;
        while (stx > 310) {
            stx -= 12;
            sty1 += 12;
            canvas.drawLine(stx, 1400, 300, sty1, paint);
        }
        path3.moveTo(425, 1400);
        path3.lineTo(425, 1150); //prav verh
        path3.lineTo(300, 1150);
        path3.lineTo(300, 1400);
        canvas.drawPath(path3,s);


        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(3);
        stx = 275; sty = 1100;
        while (stx > 185){
            stx-=12;
            canvas.drawLine(stx, 1100, stx, 1250, paint);
        }

        while (sty < 1240){
            sty+=12;
            canvas.drawLine(175, sty, 275, sty, paint);
        }

        path3.moveTo(275, 1100);
        path3.lineTo(275, 1250);
        path3.lineTo(175, 1250);
        path3.lineTo(175, 1100);
        path3.lineTo(275, 1100);
        canvas.drawPath(path3,s);


        paint.setColor(Color.BLACK);
        canvas.drawCircle(300,920,50,paint);


        canvas.drawPath(path1,s);
        canvas.drawPath(path2,s);
    }
}
