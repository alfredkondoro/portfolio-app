package com.zulfycoding.devportfolioapp.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zulfycoding.devportfolioapp.R;


public class WorkFragment extends Fragment {

    public WorkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View workView = inflater.inflate(R.layout.fragment_work, container, false);
        // Inflate the layout for this fragment
        return workView;
    }
}