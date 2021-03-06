package com.breeze.custom.hencode3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice08SetTextSkewXView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";

    public Practice08SetTextSkewXView(Context context) {
        super(context);
    }

    public Practice08SetTextSkewXView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice08SetTextSkewXView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);

        // 使用 Paint.setTextSkewX() 来让文字倾斜
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText(text, 50, 100, paint);

        paint.setTextSkewX(1);
        canvas.drawText(text,50,200,paint);
        paint.setTextSkewX(0.8F);
        canvas.drawText(text,50,300,paint);
        paint.setTextSkewX(1.5f);
        canvas.drawText(text,50,400,paint);
    }
}
