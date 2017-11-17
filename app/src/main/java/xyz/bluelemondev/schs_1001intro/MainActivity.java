package xyz.bluelemondev.schs_1001intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton(View v) {
        //인텐트 선언
        final Intent sendPref = new Intent(this, SentenceViewer.class);
        EditText sentence_num_et = (EditText) findViewById(R.id.sentencenum);
        String sentence_num_string = sentence_num_et.getText().toString();
        int sentence_num = Integer.parseInt(sentence_num_string);
        if (sentence_num_string.isEmpty()) {
            Toast.makeText(this, "입력칸이 비어있습니다!", Toast.LENGTH_SHORT).show();
        } else {
            if (1 <= sentence_num && sentence_num <= 9) {
                sendPref.putExtra("sentence_num", sentence_num);
                startActivity(sendPref);
            } else {
                Toast.makeText(this, "존재하지 않는 문장번호입니다!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
