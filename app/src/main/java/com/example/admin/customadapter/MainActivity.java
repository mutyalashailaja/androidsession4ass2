package com.example.admin.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.admin.customadapter.Adapter.StudentAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mListview;
    ArrayList<Student> mArraylist;
    StudentAdapter mStudentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListview=(ListView)findViewById(R.id.listView);
        mArraylist=new ArrayList<>();
        mArraylist.add(new Student(" shailaja","8121928339"));
        mArraylist.add(new Student(" santosh","9121928339"));
        mArraylist.add(new Student(" sairam","6121928339"));
        mArraylist.add(new Student(" shailu","8521928339"));
        mStudentAdapter=new StudentAdapter(this,mArraylist);
        mListview.setAdapter(mStudentAdapter);

    }
}
