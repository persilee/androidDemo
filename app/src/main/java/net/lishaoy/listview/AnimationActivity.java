package net.lishaoy.listview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTouch;

import static android.view.animation.Animation.INFINITE;

public class AnimationActivity extends AppCompatActivity {

    private static final String TAG = "AnimationActivity";

    @BindView(R.id.an_btn_bg)
    View anBtnBg;
    @BindView(R.id.an_btn)
    ImageView anBtn;
    @BindView(R.id.an_btn_border)
    View anBtnBorder;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
        setTitle("Animation");

        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @OnTouch(R.id.an_btn)
    public boolean onTouchClick(View view, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                animationClick();
            case MotionEvent.ACTION_MOVE:
                anBtnBg.setVisibility(View.VISIBLE);
                anBtnBorder.setVisibility(View.VISIBLE);
                break;
            case MotionEvent.ACTION_UP:
                anBtnBg.setVisibility(View.INVISIBLE);
                anBtnBorder.setVisibility(View.INVISIBLE);
                break;
        }
        return true;
    }

    private void animationClick() {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        ObjectAnimator alpha = ObjectAnimator.ofFloat(anBtnBorder, "alpha", 1.0f, 0.0f).setDuration(1200);
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(anBtnBorder, "scaleX", 1.0f, 2.6f).setDuration(1200);
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(anBtnBorder, "scaleY", 1.0f, 2.6f).setDuration(1200);
        alpha.setInterpolator(accelerateInterpolator);
        scaleX.setInterpolator(accelerateInterpolator);
        scaleY.setInterpolator(accelerateInterpolator);
        alpha.setRepeatCount(INFINITE);
        scaleX.setRepeatCount(INFINITE);
        scaleY.setRepeatCount(INFINITE);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(alpha,scaleX,scaleY);
        animatorSet.start();
    }

}
