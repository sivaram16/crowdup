package com.example.crowdup

import android.content.Intent
import android.graphics.SweepGradient
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Switch
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_alumni.*
import kotlinx.android.synthetic.main.activity_profile.*

class Alumni : AppCompatActivity(), OnMapReadyCallback, NavigationView.OnNavigationItemSelectedListener {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumni)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        setOnClickListener()
        navigation.setNavigationItemSelectedListener(this)
    }


    override fun onNavigationItemSelected(it: MenuItem): Boolean {
        //Do something
        when(it.itemId) {
            R.id.profile -> startActivity(Intent(this, ProfileActivity::class.java))
            R.id.your_interests -> startActivity(Intent(this, InterestsActivity::class.java))
            R.id.yout_meetups -> startActivity(Intent(this, AddMeetupActivity::class.java))
    }
        return true
    }

    fun showDrawer(view: View) {
        drawerLayout.openDrawer(GravityCompat.START)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(11.1001807, 77.02653459999999)
        mMap.addMarker(MarkerOptions().position(sydney).title(" Marker in SNS "))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
    fun setOnClickListener() {

    }
}
