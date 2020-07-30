package com.example.blackjackgame.ui.fragment.news.content.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.blackjackgame.R;
import com.example.blackjackgame.databinding.FragmentNewsContentPagerBinding;

public class NewsCategoryContentFragment extends Fragment {

    FragmentNewsContentPagerBinding binding;

    public static NewsCategoryContentFragment newInstance() {

        Bundle args = new Bundle();

        NewsCategoryContentFragment fragment = new NewsCategoryContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_content_pager, container, false);

        return binding.getRoot();
    }
}
