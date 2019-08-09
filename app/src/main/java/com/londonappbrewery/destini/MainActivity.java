package com.londonappbrewery.destini;

import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop, buttonBottom;
    int mStoryIndex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);
        buttonTop = (Button) findViewById(R.id.buttonTop);

        mStoryIndex = 1;










        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (buttonTop.getText().toString().equals(getResources().getString(R.string.T1_Ans1))){
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText((R.string.T3_Ans2));

                }else if(buttonTop.getText().toString().equals(getResources().getString(R.string.T3_Ans1))){
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }else if(buttonTop.getText().toString().equals(getResources().getString(R.string.T2_Ans1))){
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText((R.string.T3_Ans2));
                }




            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (buttonBottom.getText().toString().equals(getResources().getString(R.string.T1_Ans2))){
                    storyTextView.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText((R.string.T2_Ans2));

                }else if(buttonBottom.getText().toString().equals(getResources().getString(R.string.T2_Ans2))){
                    storyTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }else if(buttonBottom.getText().toString().equals(getResources().getString(R.string.T3_Ans2))){
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }

            }
        });


    }
}
