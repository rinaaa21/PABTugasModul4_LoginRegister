package com.example.tugasmodul4;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FragmentRegister extends Fragment {

    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        usernameEditText = view.findViewById(R.id.ET_username);
        emailEditText = view.findViewById(R.id.ET_email);
        passwordEditText = view.findViewById(R.id.ET_password);

        Button registerButton = view.findViewById(R.id.BTN_register);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSuccessRegister();
            }
        });

        Button loginButton = view.findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToLogin();
            }
        });

        return view;
    }

    private void navigateToSuccessRegister() {
        String username = usernameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("username", username);
        bundle.putString("email", email);
        bundle.putString("password", password);

        SuccessRegisterFragment successRegisterFragment = new SuccessRegisterFragment();
        successRegisterFragment.setArguments(bundle);

        getParentFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, successRegisterFragment)
                .addToBackStack(null)
                .commit();
    }

    private void navigateToLogin() {
        FragmentLogin fragmentLogin = new FragmentLogin();

        getParentFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragmentLogin)
                .addToBackStack(null)
                .commit();
    }
}
