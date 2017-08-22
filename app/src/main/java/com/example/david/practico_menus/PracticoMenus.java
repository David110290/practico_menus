package com.example.david.practico_menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PracticoMenus extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnu_Buscar:
                Toast.makeText(PracticoMenus.this,"Seleccione Buscar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnu_Tools:
                Toast.makeText(PracticoMenus.this,"Seleccione Tools",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnu_Cerrar:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practico_menus);
        ImageView imgAvatar = (ImageView) findViewById(R.id.imgAvatar);//habilitamos soporte para menu contextual
        registerForContextMenu(imgAvatar);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnu_Eliminar:
                Toast.makeText(PracticoMenus.this,"Seleccione Eliminar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnu_Compartir:
                Toast.makeText(PracticoMenus.this,"Seleccione Compartir",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnu_Descargar:
                Toast.makeText(PracticoMenus.this,"Seleccione Descargar",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void MenuEmer(View v){
        ImageView imgAvatar = (ImageView) findViewById(R.id.imgAvatar);
        android.widget.PopupMenu popupMenu = new android.widget.PopupMenu(this, imgAvatar);
        popupMenu.getMenuInflater().inflate(R.menu.emerg_menu,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){
                    case R.id.mnu_Ver:
                        Toast.makeText(PracticoMenus.this,"Seleccione ver Imagen",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mnu_Detalles:
                        Toast.makeText(PracticoMenus.this,"Seleccione ver Detalles",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        popupMenu.show();
    }
}
