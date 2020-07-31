package com.example.blackjackgame.ui.fragment.rating.content;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.example.blackjackgame.R;

import com.example.blackjackgame.databinding.FragmentRatingContentBinding;

public class RatingContentFragment extends Fragment {

    FragmentRatingContentBinding binding;

    public static RatingContentFragment newInstance() {

        Bundle args = new Bundle();

        RatingContentFragment fragment = new RatingContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_rating_content,container,false);

        return binding.getRoot();
    }
}
