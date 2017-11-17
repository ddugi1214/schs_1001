package xyz.bluelemondev.schs_1001intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SentenceViewer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sentence_viewer);

        Intent sendPref = getIntent();
        int sentence_num = sendPref.getIntExtra("sentence_num", 0);
        TextView answers = (TextView)findViewById(R.id.sen_answers);

        if (sentence_num  == 1){
            String se = getResources().getString(R.string.s1);
            scramble(se);
            answers.setText(getString(R.string.a1));
        } else if (sentence_num == 2){
            String se = getResources().getString(R.string.s2);
            scramble(se);
            answers.setText(getString(R.string.a2));
        } else if (sentence_num == 3){
            String se = getResources().getString(R.string.s3);
            scramble(se);
            answers.setText(getString(R.string.a3));
        } else if (sentence_num == 4){
            String se = getResources().getString(R.string.s4);
            scramble(se);
            answers.setText(getString(R.string.a4));
        } else if (sentence_num == 5){
            String se = getResources().getString(R.string.s5);
            scramble(se);
            answers.setText(getString(R.string.a5));
        } else if (sentence_num == 6){
            String se = getResources().getString(R.string.s6);
            scramble(se);
            answers.setText(getString(R.string.a6));
        } else if (sentence_num == 7){
            String se = getResources().getString(R.string.s7);
            scramble(se);
            answers.setText(getString(R.string.a7));
        } else if (sentence_num == 8){
            String se = getResources().getString(R.string.s8);
            scramble(se);
            answers.setText(getString(R.string.a8));
        } else if (sentence_num == 9){
            String se = getResources().getString(R.string.s9);
            scramble(se);
            answers.setText(getString(R.string.a9));
        }

        /*try {
            Class cls = Class.forName("SentenceViewer");
            Field fld = cls.getField("sentence_num");
            SentenceViewer sennum = new SentenceViewer();
            fld.setInt(sennum, sentence_num);
            String se = getResources().getString(R.string. + sentence_num);
        }
        catch (Throwable e){
            System.err.println(e);
        }*/
    }

    public String scramble(String s){
        TextView scrambled_sen = (TextView)findViewById(R.id.scrambled_sentence);
        String[] array = s.split(" ");
        List<String> vocas = Arrays.asList(array);
        Collections.shuffle(vocas);
        StringBuilder sb = new StringBuilder(s.length());
        for (String c : vocas){
            sb.append(c + "\n");
            //System.out.println(sb);
            scrambled_sen.setText(sb);
        }
        return sb.toString();
    }
}
