package com.example.myapplication.input_fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class InputViewPagerAdapter extends FragmentStateAdapter {
    public InputViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Danhba_Fragment();
            case 1:
                return new Ganday_Fragment();
            default:
                return new Danhba_Fragment();
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }

}
