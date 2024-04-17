package com.example.tugasmodul4;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentLogin extends Fragment {

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        usernameEditText = view.findViewById(R.id.ET_username);
        passwordEditText = view.findViewById(R.id.ET_password);

        Button loginButton = view.findViewById(R.id.BTN_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSuccessLogin();
            }
        });

        Button registerButton = view.findViewById(R.id.register);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToRegister();
            }
        });
        return view;
    }

    private void navigateToSuccessLogin() {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("username", username);
        bundle.putString("password", password);

        SuccessLoginFragment successLoginFragment = new SuccessLoginFragment();
        successLoginFragment.setArguments(bundle);

        getParentFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, successLoginFragment)
                .addToBackStack(null)
                .commit();
    }

    private void navigateToRegister(){
        FragmentRegister fragmentRegister = new FragmentRegister();

        getParentFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragmentRegister)
                .addToBackStack(null)
                .commit();
    }
}