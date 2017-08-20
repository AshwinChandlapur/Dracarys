package gameofthrones.vadeworks.com.dracarys;


import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;

import android.content.Intent;

import android.media.MediaPlayer;

import android.os.Bundle;
import android.os.Handler;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.ImageButton;
import android.widget.Toast;

import com.github.florent37.viewtooltip.ViewTooltip;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.whygraphics.gifview.gif.GIFView;

public class SplashActivity extends Activity {

    String once ="once";

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000000000;
    private KenBurnsView mKenBurns;
    private MediaPlayer sound;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  android.support.v7.app.ActionBar AB = getSupportActionBar();
        //AB.hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        setAnimation();

        sound= MediaPlayer.create(this,R.raw.got);
        sound.start();
//        GIFView mGifView = (GIFView) findViewById(R.id.gifView);
//        mGifView.setGifResource("asset:entrance");
//        mGifView.setOnSettingGifListener(new GIFView.OnSettingGifListener() {
//            @Override
//            public void onSuccess(GIFView view, Exception e) {
//                Toast.makeText(SplashActivity.this, "onSuccess()", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(GIFView view, Exception e) {
//
//            }
//        });

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //interstial ad space
                AdRequest adRequests = new AdRequest.Builder().build();
                // Prepare the Interstitial Ad
                interstitial = new InterstitialAd(SplashActivity.this);
// Insert the Ad Unit ID
                interstitial.setAdUnitId(getString(R.string.interstitial_id));
                interstitial.loadAd(adRequests);
// Prepare an Interstitial Ad Listener
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
// Call displayInterstitial() function
                        displayInterstitial();
                    }
                });
//interstital finished
                //Do something after 100ms
            }
        }, 99990);

        ImageButton badge = (ImageButton)findViewById(R.id.badge);

        badge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.pause();
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        // create tooltip & point to history button
        ViewTooltip.on(badge).autoHide(true, 2000 ).corner(10).position(ViewTooltip.Position.TOP).text("Click Here").show();


//        ImageButton hodor = (ImageButton)findViewById(R.id.hodor);
//
//        hodor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                sound.pause();
//                Intent i = new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(i);
//                finish();
//
//            }
//        });
//
//        ImageButton snow = (ImageButton)findViewById(R.id.snow);
//        // create tooltip & point to history button
//        ViewTooltip.on(snow).autoHide(true, 2000 ).corner(10).position(ViewTooltip.Position.TOP).text("Click Here").show();
//        snow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                sound.stop();
//                Intent i = new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(i);
//                finish();
//
//            }
//        });
//
//        ImageButton dany = (ImageButton)findViewById(R.id.dany);
//        dany.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                sound.stop();
//                Intent i = new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(i);
//                finish();
//
//            }
//        });
//



        mKenBurns = (KenBurnsView) findViewById(R.id.ken_burns_images);
        mKenBurns.setImageResource(R.drawable.splash_background1);
//        int[] ids = new int[]{R.drawable.splash_background1,R.drawable.splash_background2};
//        Random randomGenerator = new Random();
//        int r= randomGenerator.nextInt(ids.length);
//        this.mKenBurns.setImageDrawable(getResources().getDrawable(ids[r]));

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);

    }

    private void setAnimation() {
        ObjectAnimator scaleXAnimation = ObjectAnimator.ofFloat(findViewById(R.id.welcome_text), "scaleX", 5.0F, 1.0F);
        scaleXAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleXAnimation.setDuration(1200);
        ObjectAnimator scaleYAnimation = ObjectAnimator.ofFloat(findViewById(R.id.welcome_text), "scaleY", 5.0F, 1.0F);
        scaleYAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleYAnimation.setDuration(1200);
        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(findViewById(R.id.welcome_text), "alpha", 0.0F, 1.0F);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setDuration(1200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(scaleXAnimation).with(scaleYAnimation).with(alphaAnimation);
        animatorSet.setStartDelay(500);
        animatorSet.start();
//        findViewById(R.id.snow).setAlpha(1.0F);
//        findViewById(R.id.hodor).setAlpha(1.0F);
//        findViewById(R.id.dany).setAlpha(1.0F);
//        findViewById(R.id.snowt).setAlpha(1.0F);
//        findViewById(R.id.hodort).setAlpha(1.0F);
//        findViewById(R.id.danyt).setAlpha(1.0F);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.translate_top_to_center);
//        findViewById(R.id.snow).startAnimation(anim);
//        findViewById(R.id.hodor).startAnimation(anim);
//        findViewById(R.id.dany).startAnimation(anim);
//        findViewById(R.id.snowt).startAnimation(anim);
//        findViewById(R.id.hodort).startAnimation(anim);
//        findViewById(R.id.danyt).startAnimation(anim);
    }

//    public void onBackPressed() {
//        Intent startMain = new Intent(Intent.ACTION_MAIN);
//        sound.pause();
//        startMain.addCategory(Intent.CATEGORY_HOME);
//        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(startMain);
//
//    }

      public boolean onKeyDown(int keyCode, KeyEvent event)
      {

          if ((keyCode == KeyEvent.KEYCODE_BACK))
          {
              Toast.makeText(this, "You pressed the back button!", Toast.LENGTH_LONG).show();
              sound.pause();

          }

          if ((keyCode == KeyEvent.KEYCODE_HOME))
          {
              Toast.makeText(this, "You pressed the home button!", Toast.LENGTH_LONG).show();
              sound.pause();

          }
          return super.onKeyDown(keyCode, event);
      }


    void displayInterstitial(){
        if (interstitial.isLoaded()  ) {
            interstitial.show();
        }
    }


}