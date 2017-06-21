package com.example.robin.debtfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import java.io.File;
import javax.xml.parsers.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public MainActivity() {
        File file = new File("employees.xml");
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
        }
        catch (Exception e){
            System.out.println("Error reading configuration file:");
            System.out.println(e.getMessage());
        }
    }
}
