package com.example.tugasmodul4;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SuccessLoginFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_success_login, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String username = bundle.getString("username");
            String password = bundle.getString("password");

            TextView usernameTextView = view.findViewById(R.id.usernameTextView);
            usernameTextView.setText("Username: " + username);

            TextView passwordTextView = view.findViewById(R.id.passwordTextView);
            passwordTextView.setText("Password: " + password);
        }

        return view;
    }
}
