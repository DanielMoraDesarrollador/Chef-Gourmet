package com.example.daniel.segundoentregablerecetas.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class AdapterViewPager extends FragmentStatePagerAdapter{

    private List<FragmentRecetaDetalle>fragmentRecetaDetalles;

    public AdapterViewPager(FragmentManager fm,List<FragmentRecetaDetalle>fragmentRecetaDetalles) {
        super(fm);
        this.fragmentRecetaDetalles=fragmentRecetaDetalles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentRecetaDetalles.get(position);
    }

    @Override
    public int getCount() {
        return fragmentRecetaDetalles.size();
    }
}
