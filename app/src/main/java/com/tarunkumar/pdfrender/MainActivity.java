package com.tarunkumar.pdfrender;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    public static final String FRAGMENT_PDF_RENDERER = "pdf_renderer_basic";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PdfRendererFragment(),
                            FRAGMENT_PDF_RENDERER)
                    .commit();
        }
    }
}
