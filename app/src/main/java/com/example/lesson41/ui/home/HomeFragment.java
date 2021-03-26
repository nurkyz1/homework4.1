package com.example.lesson41.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.lesson41.R;
import com.example.lesson41.databinding.FragmentHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends Fragment {
    private FloatingActionButton fab;
    private NavController navController;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
navController = Navigation.findNavController(requireActivity(),R.id.nav_host_fragment);
binding= FragmentHomeBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        setUpListeners();
    }
    private  void  initViews(View view){
        fab = view.findViewById(R.id.action_b);

    }
    private  void  setUpListeners() {
      binding.actionB.setOnClickListener(v -> {
            navController.navigate(R.id.action_navigation_home_to_formFragment);
        });
    }
}