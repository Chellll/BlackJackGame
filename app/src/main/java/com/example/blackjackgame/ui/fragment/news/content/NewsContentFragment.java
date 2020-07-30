package com.example.blackjackgame.ui.fragment.news.content;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.blackjackgame.R;
import com.example.blackjackgame.databinding.FragmentNewsContentBinding;

public class NewsContentFragment extends Fragment {

    FragmentNewsContentBinding binding;

    private String[] title = {" Турниры ", " Обновления ", " Друзья "};

    public static NewsContentFragment newInstance() {

        Bundle args = new Bundle();

        NewsContentFragment fragment = new NewsContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_content,container, false);

        return binding.getRoot();
    }
}
