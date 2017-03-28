package com.jude.libraryprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Jude on 3/28/2017.
 */

public class LineProgress extends View
{
    Paint paint1;
    int startLine = 0;

    public LineProgress(Context context)
    {
        super(context);
        init();
    }

    public LineProgress(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public LineProgress(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {
        paint1 = new Paint();
        paint1.setColor(Color.RED);
        paint1.setStrokeWidth(5f);
        paint1.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        // canvas.drawLine(0, 0, startLine, 0, paint1);
        Rect rect = new Rect(0, 0, startLine, height);
        canvas.drawRect(rect, paint1);
        startLine+=5;
        if (startLine < width)
        {
            invalidate();
        }
    }

    public void drawAgain()
    {
        startLine = 0;
        invalidate();
    }
}
