package com.example.practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videoViewPager= findViewById(R.id.videoViewPager);

        List<VideoItem> videoItems= new ArrayList<>();
          VideoItem videoItemCelebration = new VideoItem();
        videoItemCelebration.videoURL= "https://www.pexels.com/video/video-of-fireworks-during-evening-1508216/";
        videoItemCelebration.videoTitle="Celebration";
        videoItemCelebration.videoDescription= "Celebrate who you are in your deepest heart.";
        videoItems.add(videoItemCelebration);

        VideoItem videoItemParty = new VideoItem();
        videoItemParty.videoURL= "https://www.pexels.com/video/a-man-trying-to-play-a-ukelele-while-standing-with-other-people-around-the-dining-table-3189051/";
        videoItemParty.videoTitle="Party";
        videoItemParty.videoDescription= "Enjoy every moment of life.";
        videoItems.add(videoItemParty);

        VideoItem videoItemExercise = new VideoItem();
        videoItemExercise.videoURL= "https://www.pexels.com/video/a-man-lifting-weights-in-a-fitness-gym-3196220/";
        videoItemExercise.videoTitle="Exercise";
        videoItemExercise.videoDescription= "Healthy body has a healthy mind.";
        videoItems.add(videoItemExercise);

        videoViewPager.setAdapter(new VideosAdapter(videoItems));
    }
}