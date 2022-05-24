package com.geektech.month3_hw1;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.month3_hw1.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {

    FragmentFirstBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater);
        initListener();
        return binding.getRoot();
    }

    private void initListener() {
        binding.btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(requireActivity(),SecondActivity.class);
            startActivity(intent);
        });
    }


}
