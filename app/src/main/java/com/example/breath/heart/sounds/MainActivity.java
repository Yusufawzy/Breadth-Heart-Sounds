package com.example.breath.heart.sounds;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
     MediaPlayer mp = new  MediaPlayer();

    private void stopPlaying(){
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(true);
    }


    public void vesicular(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.vesicular);
        mp.start();mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);mp.setLooping(true);
    }

    public void Bronchial(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.bronchial);
        mp.start();mp.setLooping(true);
    }

    public void BronchoVes(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.bronchovesicular);
        mp.start();mp.setLooping(true);
    }

    public void tracheal(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.tracheal);
        mp.start();mp.setLooping(true);
    }

    public void Wheezes(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.wheezes);
        mp.start();mp.setLooping(true);
    }

    public void monophonicWz(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.monophonic_wheeze);
        mp.start();mp.setLooping(true);
    }

    public void PleuralFrictionRub(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.pleural_friction_rub);
        mp.start();mp.setLooping(true);
    }

    public void Stridor(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.stridor);
        mp.start();mp.setLooping(true);
    }

    public void Cavernous(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.cavernous);
        mp.start();mp.setLooping(true);
    }

    public void CracklesMedTofine(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.cracklesmedtofine);
        mp.start();mp.setLooping(true);
    }

    public void CracklesRhonchi(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.crackles_ronchi);
        mp.start();mp.setLooping(true);
    }

    public void CracklesCoarse(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.cracklescoarse);
        mp.start();mp.setLooping(true);
    }

    public void PulmonaryEdema(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.pulmonaryedema);
        mp.start();mp.setLooping(true);
    }

    public void Puppy(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.puppy);
        mp.start();mp.setLooping(true);
    }

    public void AtrialFib(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.atrial_fib);
        mp.start();mp.setLooping(true);
    }

    public void MitralRegurgitation(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.mitral_regurgitation);
        mp.start();mp.setLooping(true);

    }

    public void MitralValveClick(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.mitral_valve_click);
        mp.start();mp.setLooping(true);

    }

    public void Normal(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.normal);
        mp.start();mp.setLooping(true);

    }

    public void PDAPatentDuctusArteriosus(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.pda);
        mp.start();mp.setLooping(true);

    }

    public void PulmonicStenosis(View view) {

        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.pulmonicstenosis);
        mp.start();mp.setLooping(true);
    }

    public void RespiratoryCrackle(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.respiratory_crackle);
        mp.start();mp.setLooping(true);

    }

    public void SAS(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.sas);
        mp.start();mp.setLooping(true);

    }

    public void VSD(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.vsd);
        mp.start();mp.setLooping(true);

    }

    public void MitralRegurgitationVPC(View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.mitralregurgitationvpc);
        mp.start();mp.setLooping(true);

    }
}
