package com.codekul.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by aniruddha on 14/2/17.
 */

public class MyEditText extends EditText {

    private Paint paint;

    public MyEditText(Context context) {
        super(context);

        // when u create view from code
        initPen();
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        // when u create view from xml
        initPen();
    }

    private void initPen() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(50);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText("{Code}Kul;", 50,50, paint);
        canvas.drawCircle(50,100,50 ,paint);
    }
}
