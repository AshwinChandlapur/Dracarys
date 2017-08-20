package gameofthrones.vadeworks.com.dracarys;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageButton r1i1,r1i2,r1i3,r1i4;
    ImageButton r2i1,r2i2,r2i3,r2i4;
    ImageButton r3i1,r3i2,r3i3,r3i4;
    ImageButton r4i1,r4i2,r4i3,r4i4;
    ImageButton r5i1,r5i2,r5i3,r5i4;
    ImageButton r6i1,r6i2,r6i3,r6i4;
    ImageButton r7i1,r7i2,r7i3,r7i4;
    ImageButton r8i1,r8i2,r8i3,r8i4;
    ImageButton r9i1,r9i2,r9i3,r9i4;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;
    TextView t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36;
    int i =0;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar AB = getSupportActionBar();
        AB.hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Typeface gotfont = Typeface.createFromAsset(this.getAssets(),"fonts/game.ttf");

        TextView t1 = (TextView)findViewById(R.id.t1);
        TextView t2 = (TextView)findViewById(R.id.t2);
        TextView t3 = (TextView)findViewById(R.id.t3);
        TextView t4 = (TextView)findViewById(R.id.t4);
        TextView t5 = (TextView)findViewById(R.id.t5);
        TextView t6 = (TextView)findViewById(R.id.t6);
        TextView t7 = (TextView)findViewById(R.id.t7);
        TextView t8 = (TextView)findViewById(R.id.t8);
        TextView t9 = (TextView)findViewById(R.id.t9);
        TextView t10 = (TextView)findViewById(R.id.t10);
        TextView t11 = (TextView)findViewById(R.id.t11);
        TextView t12 = (TextView)findViewById(R.id.t12);
        TextView t13 = (TextView)findViewById(R.id.t13);
        TextView t14 = (TextView)findViewById(R.id.t14);
        TextView t15 = (TextView)findViewById(R.id.t15);
        TextView t16 = (TextView)findViewById(R.id.t16);
        TextView t17 = (TextView)findViewById(R.id.t17);
        TextView t18 = (TextView)findViewById(R.id.t18);
        TextView t19 = (TextView)findViewById(R.id.t19);
        TextView t20 = (TextView)findViewById(R.id.t20);
        TextView t21 = (TextView)findViewById(R.id.t21);
        TextView t22 = (TextView)findViewById(R.id.t22);
        TextView t23 = (TextView)findViewById(R.id.t23);
        TextView t24 = (TextView)findViewById(R.id.t24);
        TextView t25 = (TextView)findViewById(R.id.t25);
        TextView t26 = (TextView)findViewById(R.id.t26);
        TextView t27 = (TextView)findViewById(R.id.t27);
        TextView t28 = (TextView)findViewById(R.id.t28);
        TextView t29 = (TextView)findViewById(R.id.t29);
        TextView t30 = (TextView)findViewById(R.id.t30);
        TextView t31 = (TextView)findViewById(R.id.t31);
        TextView t32 = (TextView)findViewById(R.id.t32);
        TextView t33 = (TextView)findViewById(R.id.t33);
        TextView t34 = (TextView)findViewById(R.id.t34);
        TextView t35 = (TextView)findViewById(R.id.t35);
        TextView t36 = (TextView)findViewById(R.id.t36);

        t1.setTypeface(gotfont);
        t2.setTypeface(gotfont);
        t3.setTypeface(gotfont);
        t4.setTypeface(gotfont);
        t5.setTypeface(gotfont);
        t6.setTypeface(gotfont);
        t7.setTypeface(gotfont);
        t8.setTypeface(gotfont);
        t9.setTypeface(gotfont);
        t10.setTypeface(gotfont);
        t11.setTypeface(gotfont);
        t12.setTypeface(gotfont);
        t13.setTypeface(gotfont);
        t14.setTypeface(gotfont);
        t15.setTypeface(gotfont);
        t16.setTypeface(gotfont);
        t17.setTypeface(gotfont);
        t18.setTypeface(gotfont);
        t19.setTypeface(gotfont);
        t20.setTypeface(gotfont);
        t21.setTypeface(gotfont);
        t22.setTypeface(gotfont);
        t23.setTypeface(gotfont);
        t24.setTypeface(gotfont);
        t25.setTypeface(gotfont);
        t26.setTypeface(gotfont);
        t27.setTypeface(gotfont);
        t28.setTypeface(gotfont);
        t29.setTypeface(gotfont);
        t30.setTypeface(gotfont);
        t31.setTypeface(gotfont);
        t32.setTypeface(gotfont);
        t33.setTypeface(gotfont);
        t34.setTypeface(gotfont);
        t35.setTypeface(gotfont);
        t36.setTypeface(gotfont);
















        ScrollView co= (ScrollView)findViewById(R.id.scroll);
        co.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-ge`enter code here`nerated method stub
                Log.d("Touching","Touching");
                i++;
                if(i>99)
                {
                    i=0;
                    displayInterstitial();
                }
                return false;
            }
        });


        //Interstitial Ad Space
        AdRequest adRequests = new AdRequest.Builder()
                .addTestDevice("E1C583B224120C3BEF4A3DB0177A7A37")
                .build();
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.interstitial_id));
        interstitial.loadAd(adRequests);

        r1i1 = (ImageButton)findViewById(R.id.r1i1);
        r1i2 = (ImageButton)findViewById(R.id.r1i2);
        r1i3 = (ImageButton)findViewById(R.id.r1i3);
        r1i4 = (ImageButton)findViewById(R.id.r1i4);


        r1i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.arya);
                sound.start();
            }
        });

        r1i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.bastards);
                sound.start();
            }
        });

        r1i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.bearisland);
                sound.start();
            }
        });

        r1i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.beingcu);
                sound.start();
            }
        });




        r2i1 = (ImageButton)findViewById(R.id.r2i1);
        r2i2 = (ImageButton)findViewById(R.id.r2i2);
        r2i3 = (ImageButton)findViewById(R.id.r2i3);
        r2i4 = (ImageButton)findViewById(R.id.r2i4);


        r2i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLicked 1","Clicked 1");
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.bigfish);
                sound.start();
            }
        });

        r2i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.borntorule);
                sound.start();
            }
        });

        r2i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.cersies);
                sound.start();
            }
        });

        r2i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.chaos);
                sound.start();
            }
        });




        r3i1 = (ImageButton)findViewById(R.id.r3i1);
        r3i2 = (ImageButton)findViewById(R.id.r3i2);
        r3i3 = (ImageButton)findViewById(R.id.r3i3);
        r3i4 = (ImageButton)findViewById(R.id.r3i4);


        r3i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLicked 1","Clicked 1");
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.danerys);
                sound.start();
            }
        });

        r3i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.denyexist);
                sound.start();
            }
        });

        r3i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.dracarys2);
                sound.start();
            }
        });

        r3i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.dwarfadvice);
                sound.start();
            }
        });


        r4i1 = (ImageButton)findViewById(R.id.r4i1);
        r4i2 = (ImageButton)findViewById(R.id.r4i2);
        r4i3 = (ImageButton)findViewById(R.id.r4i3);
        r4i4 = (ImageButton)findViewById(R.id.r4i4);


        r4i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLicked 1","Clicked 1");
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.enemies);
                sound.start();
            }
        });

        r4i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.fighteverywhere);
                sound.start();
            }
        });

        r4i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.gameofthrones);
                sound.start();
            }
        });

        r4i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.hodor1);
                sound.start();
            }
        });



        r5i1 = (ImageButton)findViewById(R.id.r5i1);
        r5i2 = (ImageButton)findViewById(R.id.r5i2);
        r5i3 = (ImageButton)findViewById(R.id.r5i3);
        r5i4 = (ImageButton)findViewById(R.id.r5i4);


        r5i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLicked 1","Clicked 1");
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.howdie);
                sound.start();
            }
        });

        r5i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.kinginnorth);
                sound.start();
            }
        });

        r5i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.lannisters);
                sound.start();
            }
        });

        r5i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.lionsheep);
                sound.start();
            }
        });


        r6i1 = (ImageButton)findViewById(R.id.r6i1);
        r6i2 = (ImageButton)findViewById(R.id.r6i2);
        r6i3 = (ImageButton)findViewById(R.id.r6i3);
        r6i4 = (ImageButton)findViewById(R.id.r6i4);


        r6i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLicked 1","Clicked 1");
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.nightswatch);
                sound.start();
            }
        });

        r6i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.lonewolf);
                sound.start();
            }
        });

        r6i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.northremembers);
                sound.start();
            }
        });

        r6i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.notrueking);
                sound.start();
            }
        });

        r7i1 = (ImageButton)findViewById(R.id.r7i1);
        r7i2 = (ImageButton)findViewById(R.id.r7i2);
        r7i3 = (ImageButton)findViewById(R.id.r7i3);
        r7i4 = (ImageButton)findViewById(R.id.r7i4);


        r7i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLicked 1","Clicked 1");
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.nottoday);
                sound.start();
            }
        });

        r7i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.reek);
                sound.start();
            }
        });

        r7i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.sendtheirregards);
                sound.start();
            }
        });

        r7i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.swingthesword);
                sound.start();
            }
        });


        r8i1 = (ImageButton)findViewById(R.id.r8i1);
        r8i2 = (ImageButton)findViewById(R.id.r8i2);
        r8i3 = (ImageButton)findViewById(R.id.r8i3);
        r8i4 = (ImageButton)findViewById(R.id.r8i4);


        r8i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLicked 1","Clicked 1");
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.varys);
                sound.start();
            }
        });

        r8i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.wheelbreak);
                sound.start();
            }
        });

        r8i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.winteriscoming);
                sound.start();
            }
        });

        r8i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.dracarys3);
                sound.start();
            }
        });


        r9i1 = (ImageButton)findViewById(R.id.r9i1);
        r9i2 = (ImageButton)findViewById(R.id.r9i2);
        r9i3 = (ImageButton)findViewById(R.id.r9i3);
        r9i4 = (ImageButton)findViewById(R.id.r9i4);


        r9i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLicked 1","Clicked 1");
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.dracarys4);
                sound.start();
            }
        });

        r9i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.hodor3);
                sound.start();
            }
        });

        r9i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.dracarys5);
                sound.start();
            }
        });

        r9i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.hodor4);
                sound.start();
            }
        });


    }


    @Override
    public void onBackPressed() {
        Intent intent=new Intent(MainActivity.this,SplashActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }


    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }


}
