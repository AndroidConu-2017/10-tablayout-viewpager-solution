/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.viewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    protected String[] titles = new String[]{"Mon", "Tues", "Weds", "Thurs", "Fri"};
    final int PAGE_COUNT = titles.length;
    private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return  MondayFragment.newInstance(position);
        } else if (position == 1){
            return TuesdayFragment.newInstance(position);
        } else if (position == 2) {
            return WednesdayFragment.newInstance(position);
        } else if (position == 3) {
            return ThursdayFragment.newInstance(position);
        } else {
            return FridayFragment.newInstance(position);
        }
    }
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
