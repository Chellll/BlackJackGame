package com.example.blackjackgame.ui.fragment.rating.content.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.example.blackjackgame.R;

import com.example.blackjackgame.databinding.FragmentRatingBinding;
import com.example.blackjackgame.databinding.FragmentRatingContentBinding;

public class RatingCategoryContentFragment extends Fragment {
    FragmentRatingBinding binding;

    public static RatingCategoryContentFragment newInstance() {

        Bundle args = new Bundle();

        RatingCategoryContentFragment fragment = new RatingCategoryContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_rating, container,false);

        return binding.getRoot();
    }
}
