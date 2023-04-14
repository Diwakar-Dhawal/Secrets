package com.example.secrets.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.secrets.R;
import com.example.secrets.databinding.ActivitySignupBinding;

public class SignupActivity extends AppCompatActivity {
    private ActivitySignupBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    private void setListeners()
    {
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}