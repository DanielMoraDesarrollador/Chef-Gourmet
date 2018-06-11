package com.example.daniel.segundoentregablerecetas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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


