package com.leechunhoe.superpowerfromscratch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    static {
//        System.loadLibrary("superpower-from-scratch");
//    }

//    private native void FrequencyDomain(int sampleRate, int bufferSize);
    private native String getSuperpower();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.loadLibrary("superpower-from-scratch");

        ((TextView) findViewById(R.id.yeah)).setText(getSuperpower());

//        // Get the device's sample rate and buffer size to enable low-latency Android audio output, if available.
//        String samplerateString = null, buffersizeString = null;
//        if (Build.VERSION.SDK_INT >= 17) {
//            AudioManager audioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
//            samplerateString = audioManager.getProperty(AudioManager.PROPERTY_OUTPUT_SAMPLE_RATE);
//            buffersizeString = audioManager.getProperty(AudioManager.PROPERTY_OUTPUT_FRAMES_PER_BUFFER);
//        }
//        if (samplerateString == null) samplerateString = "44100";
//        if (buffersizeString == null) buffersizeString = "512";
//
//        System.loadLibrary("superpower-from-scratch");
//
//        FrequencyDomain(Integer.parseInt(samplerateString), Integer.parseInt(buffersizeString));
    }


}
