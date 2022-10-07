package com.openclassrooms.mygalery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import java.util.ArrayList

private lateinit var  images :List<GridViewModal>

lateinit var  gridview:GridView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        images=ArrayList<GridViewModal>()
        images=images+ GridViewModal(R.drawable.ic_launcher_foreground)
        images=images+GridViewModal( R.drawable.ic_launcher_background)
        images=images+ GridViewModal(R.drawable.ic_launcher_background)
        gridview=findViewById<GridView>(R.id.gridview)

      var  imageadapter=CustomizedGalleryAdapter(this@MainActivity,images)
        println("$imageadapter + ${images.size}")
      gridview.adapter=imageadapter
    }
}