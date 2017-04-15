package com.example.apple.medizone;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.apple.medizone.Fragments.HomeFragment;

public class Home extends AppCompatActivity  {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    Toolbar toolbar;
    public static FloatingActionButton fab;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    public static   Bitmap userimagebitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        /**
         *Setup the DrawerLayout and NavigationView
         */
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Feeds");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff);
     //   mNavigationView.setBackgroundColor(Color.parseColor("#252c34"));
        mNavigationView.setItemTextColor(ColorStateList.valueOf(Color.BLACK));
       /* View header = mNavigationView.getHeaderView(0);
        ImageView logout=(ImageView)header.findViewById(R.id.power);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        });
        TextView text = (TextView) header.findViewById(R.id.username);
        TextView useremail = (TextView) header.findViewById(R.id.email);
        imageview=(CircleImageView)header.findViewById(R.id.profile_image);
        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), 1);
            }
        });
        */
        /**
         * Setup click events on the Navigation View Items.
         */
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();
                if (menuItem.getItemId() == R.id.feeds) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                //    fragmentTransaction.replace(R.id.containerView,new Meet_Trainer()).commit();
                    toolbar.setTitle("Meet Trainer");
                }
                return false;
            }
        });
        /**
         * Setup Drawer Toggle of the Toolbar
         */
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        // mDrawerToggle.setHomeAsUpIndicator(getDrawable(R.drawable.bell));
        mDrawerToggle.syncState();
        //setting up floating action button
       /* fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fab.setVisibility(View.INVISIBLE);
                FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerView,new AddNewPost()).commit();
            }
        });

       fab.setVisibility(View.INVISIBLE);
       */
        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the FeedsTabs as the first Fragment
         */
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new HomeFragment()).commit();
    }
    public void click(View view)
    {
        // Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }
}
