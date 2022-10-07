package com.openclassrooms.mygalery
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.*



internal class CustomizedGalleryAdapter(private var context: Context, private var images:List<GridViewModal>) : BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    // returns the number of images, in our example it is 10
    override fun getCount(): Int {
        return images.size
    }

    // returns the Item  of an item, i.e. for our example we can get the image
    override fun getItem(position: Int): Any?{
        return null
    }

    // returns the ID of an item
    override fun getItemId(position: Int): Long {
        return 0
    }

    // returns an ImageView view

    override fun getView(position: Int, view: View, viewGroup: ViewGroup): View {
        // position argument will indicate the location of image
        // create a ImageView programmatically

        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        var view=view
        if(view == null){
            view=layoutInflater!!.inflate(R.layout.itempic,null)
           // convertView = layoutInflater!!.inflate(R.layout.gridview_item, null)
        }
        var imageView=view.findViewById<ImageView>(R.id.img)
       // var des=view.findViewById<TextView>(R.id.desc)
        imageView.setImageResource(images.get(position).courseImg)
      //  des.setText("test")
            return view
    }
}