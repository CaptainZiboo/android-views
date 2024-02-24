package com.example.androidviews

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

class ShowDetail: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.detail_view,
            container,
            false,
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val show = ShowDetailArgs.fromBundle(requireArguments()).show



        val url = "https://hdqwalls.com/download/the-avengers-marvel-comics-oc-3840x2400.jpg"

        val topSection = view.findViewById<LinearLayout>(R.id.topSection)

        Glide.with(this)
            .load(url)
            .into(object : CustomTarget<Drawable>() {
                override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
                    topSection.background = resource
                }
                override fun onLoadCleared(placeholder: Drawable?) {
                    // Handle cleanup here if necessary
                }
            })

        val coverPicture = view.findViewById<ImageView>(R.id.coverPicture)

        Glide.with(this)
            .load(url)
            .centerCrop()
            .into(coverPicture)
    }
}