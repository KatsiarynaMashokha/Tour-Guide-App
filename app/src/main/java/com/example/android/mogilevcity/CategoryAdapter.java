package com.example.android.mogilevcity;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by katsiarynamashokha on 7/7/16.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    Context context;

    public CategoryAdapter(FragmentManager fm, Context nContext) {
        super(fm);
        context = nContext;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MuseumsFragment();
            case 1:
                return new CoolThingsFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new RestaurantsFragment();
            default:
                return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.museums);
            case 1:
                return context.getString(R.string.cool_things_to_do);
            case 2:
                return context.getString(R.string.hotels);
            case 3:
                return context.getString(R.string.restaurants);
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}