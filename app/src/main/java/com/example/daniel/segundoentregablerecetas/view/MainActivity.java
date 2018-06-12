package com.example.daniel.segundoentregablerecetas.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.daniel.segundoentregablerecetas.R;
import com.example.daniel.segundoentregablerecetas.model.POJO.Receta;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, FragmentReceta.NotificarReceta {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = findViewById(R.id.navigation_view);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragmentACargar = null;
        switch (item.getItemId()) {
            case R.id.receta_id:
                fragmentACargar = new FragmentReceta();
                break;

            case R.id.about_us_id:
                fragmentACargar = new FragmentAboutUs();
                break;
        }
        cargarFragment(fragmentACargar);
        drawerLayout.closeDrawers();
        return true;
    }

    public void cargarFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.contenedor_fragment_main_activity_id, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void notificar(Receta receta, int posicion) {
        Intent intent = new Intent(this, ActivityDetalle.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(ActivityDetalle.RECETA_KEY, receta);
        bundle.putInt(ActivityDetalle.POSICION_KEY, posicion);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
