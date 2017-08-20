package gameofthrones.vadeworks.com.dracarys;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton r1i1,r1i2,r1i3,r1i4;
    ImageButton r2i1,r2i2,r2i3,r2i4;
    ImageButton r3i1,r3i2,r3i3,r3i4;
    ImageButton r4i1,r4i2,r4i3,r4i4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar AB = getSupportActionBar();
        AB.hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        r1i1 = (ImageButton)findViewById(R.id.r1i1);
        r1i2 = (ImageButton)findViewById(R.id.r1i2);
        r1i3 = (ImageButton)findViewById(R.id.r1i3);
        r1i4 = (ImageButton)findViewById(R.id.r1i4);


        r1i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.a);
                sound.start();
            }
        });

        r1i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.b);
                sound.start();
            }
        });

        r1i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.c);
                sound.start();
            }
        });

        r1i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.d);
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
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.e);
                sound.start();
            }
        });

        r2i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.f);
                sound.start();
            }
        });

        r2i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.g);
                sound.start();
            }
        });

        r2i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.h);
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
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.i);
                sound.start();
            }
        });

        r3i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.j);
                sound.start();
            }
        });

        r3i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.k);
                sound.start();
            }
        });

        r3i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.l);
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
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.m);
                sound.start();
            }
        });

        r4i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.n);
                sound.start();
            }
        });

        r4i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.o);
                sound.start();
            }
        });

        r4i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.p);
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
}
