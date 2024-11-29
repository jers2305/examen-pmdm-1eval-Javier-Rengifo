package com.examJavier.ExamenPMDM.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.examJavier.ExamenPMDM.R;
import com.examJavier.ExamenPMDM.fragment1;
import com.examJavier.ExamenPMDM.fragment3;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new fragment1();
            case 1:
                return PlaceholderFragment.newInstance(position + 1);
            case 2:
                return new fragment3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}