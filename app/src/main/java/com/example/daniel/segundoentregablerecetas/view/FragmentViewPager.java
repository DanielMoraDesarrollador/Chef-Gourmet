package com.example.daniel.segundoentregablerecetas.view;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;


public class FragmentViewPager extends FragmentStatePagerAdapter {

    private List<FragmentRecetaDetalle> fragmentDetalleLista;

    public FragmentViewPager(FragmentManager fm, List<FragmentRecetaDetalle> fragmentDetalleLista) {
        super(fm);
        this.fragmentDetalleLista = fragmentDetalleLista;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentDetalleLista.get(position);
    }

    @Override
    public int getCount() {
        return fragmentDetalleLista.size();
    }
}


