package com.example.blackjackgame.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.blackjackgame.R;
import com.example.blackjackgame.databinding.FragmentIntroBinding;
import com.example.blackjackgame.ui.activity.NavigationActivity;
import com.example.blackjackgame.viewmodel.sign.SignFactory;
import com.example.blackjackgame.viewmodel.sign.SignViewModel;

import java.util.Objects;

public class IntroFragment extends Fragment {

    private FragmentIntroBinding binding;
    private SignViewModel viewModel;

    public static IntroFragment newInstance() {

        Bundle args = new Bundle();

        IntroFragment fragment = new IntroFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_intro, container, false);

        viewModel = new ViewModelProvider(this, new SignFactory(requireActivity().getApplication())).get(SignViewModel.class);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.guest.setOnClickListener(v -> {
            viewModel.signGuest().observe(getViewLifecycleOwner(), o -> {
                if(o.getStatus().equals("success")){
                    Intent intent = new Intent(getActivity(), NavigationActivity.class);
                    startActivity(intent);
                    getActivity().finish();
                }
            });
        });
    }
}
