package com.breeze.custom.hencode3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.Locale;

public class Practice01DrawTextView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";

    public Practice01DrawTextView(Context context) {
        super(context);
    }

    public Practice01DrawTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01DrawTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
        //setTextLocale改变地域文字，不过貌似没看到效果，不知道哪出的问题
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText(text, 50, 100, paint);
        // 使用 drawText() 来绘制文字
        // 文字坐标： (50, 100)

        text = "你好";
        paint.setTextLocale(Locale.JAPAN);
        canvas.drawText(text, 50, 200, paint);
        paint.setTextLocale(Locale.CHINA);
        canvas.drawText(text, 50, 300, paint);
        paint.setTextLocale(Locale.TAIWAN);
        canvas.drawText(text, 50, 400, paint);
    }
}
