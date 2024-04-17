package com.example.tugasmodul4;

import android.os.Bundle;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.FragmentManager;
        import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentLogin fragmentLogin = new FragmentLogin();
        fragmentTransaction.replace(R.id.fragment_container, fragmentLogin);
        fragmentTransaction.commit();
    }
}
