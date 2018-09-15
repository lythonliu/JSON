package com.example.administrator.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {
    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }

    private static final String TAG = "dongnao";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void click(View view)
    {
        News news = new News();
        news.setId(1);
        news.setTitle("新年放假通知");
        news.setContent("从今天开始放假啦。");
        news.setAuthor(createAuthor());
        news.setReader(createReaders());
        Log.d(TAG, FastJson.toJson(news));
    }


    private static List<User> createReaders() {
        List<User> readers = new ArrayList<User>();
        User readerA = new User();
        readerA.setId(2);
        readerA.setName("Jack");
        readers.add(readerA);

        User readerB = new User();
        readerB.setId(1);
        readerB.setName("Lucy");
        readers.add(readerB);

        return readers;
    }

    private static User createAuthor() {
        User author = new User();
        author.setId(1);
        author.setName("Fancyy");
        author.setPwd("123456");
        return author;
    }
}
