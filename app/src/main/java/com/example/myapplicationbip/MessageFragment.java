package com.example.myapplicationbip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class MessageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);

        //Hangi title'lar arası geçiş yapılacak
        ArrayList<String> titleList = new ArrayList<>();
        titleList.add("Chat");
        titleList.add("Service");

        //Hangi fragmentler arası geçiş olacak
        ArrayList<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new ChatFragment());
        fragmentList.add(new ServiceFragment());

        ViewPager viewPager = view.findViewById(R.id.viewpager_message);
        //Adapter'a değişkeblerini veriyoruz
        PagerAdapter adapter = new PagerAdapter(titleList, fragmentList, getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        //Tablayoutu fragment içine tanımlattık
        TabLayout tabLayout = view.findViewById(R.id.tablayout);
        //tablayout'ları swipe yap
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}