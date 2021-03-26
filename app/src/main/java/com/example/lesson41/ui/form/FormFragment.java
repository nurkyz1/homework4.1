package com.example.lesson41.ui.form;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.lesson41.R;
import com.example.lesson41.databinding.FragmentFormBinding;



public class FormFragment extends Fragment {
    private FragmentFormBinding binding;
    private String title,description;
    public FormFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFormBinding.inflate(inflater,container,false);
         return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       initListeners();
    }
    private  void initListeners(){
        binding.buttonSave.setOnClickListener(v -> {
            title = binding.editTitle.getText().toString();
            description = binding.editDescription.getText().toString();
            Toast.makeText(requireContext(), "title: "+title +" description: "+
                    description, Toast.LENGTH_SHORT).show();
        });

    }

}