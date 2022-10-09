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
        images=images+ GridViewModal(R.drawable.cat1,"Image 1")
        images=images+GridViewModal( R.drawable.cat2,"Image 2")
        images=images+ GridViewModal(R.drawable.cat3,"Image 3")
        images=images+ GridViewModal(R.drawable.cat4,"Image 4")
        images=images+GridViewModal( R.drawable.cat5,"Image 5")
        images=images+ GridViewModal(R.drawable.cat6,"Image 6")
        images=images+ GridViewModal(R.drawable.cat7,"Image 7")
        images=images+GridViewModal( R.drawable.cat8,"Image 8")
        images=images+ GridViewModal(R.drawable.cat9,"Image 9")
        images=images+ GridViewModal(R.drawable.cat10,"Image 10")
        images=images+GridViewModal( R.drawable.cat11,"Image 11")
        images=images+ GridViewModal(R.drawable.cat12,"Image 12")
        images=images+ GridViewModal(R.drawable.cat10,"Image 1")
        images=images+GridViewModal( R.drawable.cat2,"Image 1")
        images=images+ GridViewModal(R.drawable.cat8,"Image 1")
        images=images+ GridViewModal(R.drawable.cat1,"Image 1")
        images=images+GridViewModal( R.drawable.cat2,"Image 2")
        images=images+ GridViewModal(R.drawable.cat3,"Image 3")
        images=images+ GridViewModal(R.drawable.cat4,"Image 4")
        images=images+GridViewModal( R.drawable.cat5,"Image 5")
        images=images+ GridViewModal(R.drawable.cat6,"Image 6")
        images=images+ GridViewModal(R.drawable.cat7,"Image 7")
        images=images+GridViewModal( R.drawable.cat8,"Image 8")
        images=images+ GridViewModal(R.drawable.cat9,"Image 9")
        images=images+ GridViewModal(R.drawable.cat10,"Image 10")
        images=images+GridViewModal( R.drawable.cat11,"Image 11")
        images=images+ GridViewModal(R.drawable.cat12,"Image 12")
        images=images+ GridViewModal(R.drawable.cat10,"Image 1")
        images=images+GridViewModal( R.drawable.cat2,"Image 1")
        images=images+ GridViewModal(R.drawable.cat8,"Image 1")
        gridview=findViewById(R.id.gridview)

      var  imageadapter=CustomizedGalleryAdapter(this@MainActivity,images)
        println("$imageadapter + ${images.size}")
      gridview.adapter=imageadapter
    }
}