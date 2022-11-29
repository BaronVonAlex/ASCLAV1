package com.example.aslcav1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.aslcav1.databinding.ActivityChatBinding;
import com.example.aslcav1.models.User;
import com.example.aslcav1.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();
    }

    private void loadReceiverDetails() {
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }
    private void setListeners() {
        binding.imageBackButton.setOnClickListener(v -> onBackPressed());
    }
}