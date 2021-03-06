package com.serg.ovchinnikov;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.HashMap;

public class StateAdapter extends FragmentStateAdapter {

    //чтобы потом вызывать метод у конкретного фрагмента на обновление gif
    private HashMap<Integer,Fragment> fragments;

    public StateAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        fragments = new HashMap<>();
        for (int i = 0; i <3; i++) {
            Fragment fragment = new CategoryGifFragment();
            fragments.put(i,fragment);
        }
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public Fragment getFragment(int pos){
        return fragments.get(pos);
    }


}
