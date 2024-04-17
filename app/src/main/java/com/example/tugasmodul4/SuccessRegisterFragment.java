package com.example.tugasmodul4;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SuccessRegisterFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_success_register, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String username = bundle.getString("username");
            String email = bundle.getString("email");
            String password = bundle.getString("password");

            TextView usernameTextView = view.findViewById(R.id.usernameTextView);
            TextView emailTextView = view.findViewById(R.id.emailTextView);
            TextView passwordTextView = view.findViewById(R.id.passwordTextView);

            usernameTextView.setText("Username: " + username);
            emailTextView.setText("Email: " + email);
            passwordTextView.setText("Password: " + password);
        }

        return view;
    }
}
