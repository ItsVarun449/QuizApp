    package com.example.quizapp;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.TextView;
    import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        private String[] questions = {
                "1. Andy Rubin was the Founder of android?",
                "2. Google acquired android in 2005.",
                "3. Android is not an Open Source.",
                "4. Are Android Version sequenced in Alphabetical Order?",
                "5. Is there any Android version named after Indian Sweet?",
                "6. Android OS is an Open Source.",
                "7. Android was Later Owned by Steve Jobs",
                "8. Does android Support C/C++ other than Java?",
                "9. Does activity represent one screen of android?",
                "10. Is Intent used to perform communicaton between activities or services?",
                "11. Does Content Providers share data between the application",
                "12. View elements can be identified using the keyword findViewById",
                "13. Can a Bytecode be written in java be run on android?",
                "14. An implicit intent is used to invoke the activity class.",
                "15. Right outer join and full outer joins are supported by SQLite."};
        private boolean[] answers = {
                true,
                true,
                false,
                true,
                false,
                true,
                false,
                true,
                true,
                true,
                true,
                true,
                false,
                false,
                false};
        private int score = 0;
        Button yes;
        Button no;
        TextView question;
        private int index = 0;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            yes = findViewById(R.id.yes);
            no = findViewById(R.id.no);
            question = findViewById(R.id.question);
            question.setText(questions[index]);

            yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //if array is not going out of the bound
                    if (index<=questions.length - 1){
                        //if given answer is correct
                        if(answers[index] == true){
                            score++;

                        }
                        //brother move to the next question
                        index++;
                        if(index<=questions.length - 1){
                            question.setText(questions[index]);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "Your score is " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Restart to play again", Toast.LENGTH_SHORT).show();
                    }

                }
            });
            no.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   //if array is not going out of the bound
                if (index<=questions.length - 1){
                    //if given answer is correct
                        if(answers[index] == false){
                            score++;
                        }
                        //Brother move to the next question
                        index++;
                        if(index<=questions.length - 1){
                            question.setText(questions[index]);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "Your score is " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                        }
                    }
                else{
                    Toast.makeText(MainActivity.this, "Restart to play again", Toast.LENGTH_SHORT).show();
                }
               }
            });
        }
    }