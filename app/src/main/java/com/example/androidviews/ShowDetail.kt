package com.example.androidviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide

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

        var backgroundImage :ImageView = view.findViewById<ImageView>(R.id.background_image)
        var image :ImageView = view.findViewById<ImageView>(R.id.coverPicture)

        var backButtonText = view.findViewById<TextView>(R.id.header)
        backButtonText.text = show.title

        var studioNameText = view.findViewById<TextView>(R.id.publisher_name)
        studioNameText.text = show.producer

        var episodeCount = view.findViewById<TextView>(R.id.episode_count)
        episodeCount.text = "${show.episodes.size} épisodes"

        var date = view.findViewById<TextView>(R.id.date_text)
        date.text = show.year.toString()

        var storyTabButton = view.findViewById<TextView>(R.id.tab_history)
        var storyTabIndicator = view.findViewById<View>(R.id.history_tab_indicator)
        var characterTabButton = view.findViewById<TextView>(R.id.tab_characters)
        var characterTabIndicator = view.findViewById<View>(R.id.characters_tab_indicator)
        var episodeTabButton = view.findViewById<TextView>(R.id.tab_episodes)
        var episodesTabIndicator = view.findViewById<View>(R.id.episodes_tab_indicator)

        Glide.with(this).load(show.pictureUrl).into(backgroundImage)
        Glide.with(this).load(show.pictureUrl).into(image)

        childFragmentManager.beginTransaction()
            .replace(R.id.detail_frame_container, StoryTab(show))
            .commitAllowingStateLoss()
        characterTabIndicator.visibility = View.INVISIBLE
        episodesTabIndicator.visibility = View.INVISIBLE
        storyTabIndicator.visibility = View.VISIBLE
        characterTabButton.alpha = 0.6F
        storyTabButton.alpha = 1.0F
        episodeTabButton.alpha = 0.6F

        characterTabButton.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.detail_frame_container, CharactersTab(show.characters))
                .commitAllowingStateLoss()
            characterTabIndicator.visibility = View.VISIBLE
            episodesTabIndicator.visibility = View.INVISIBLE
            storyTabIndicator.visibility = View.INVISIBLE
            characterTabButton.alpha = 1.0F
            storyTabButton.alpha = 0.6F
            episodeTabButton.alpha = 0.6F
        }

        storyTabButton.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.detail_frame_container, StoryTab(show))
                .commitAllowingStateLoss()
            characterTabIndicator.visibility = View.INVISIBLE
            episodesTabIndicator.visibility = View.INVISIBLE
            storyTabIndicator.visibility = View.VISIBLE
            characterTabButton.alpha = 0.6F
            storyTabButton.alpha = 1.0F
            episodeTabButton.alpha = 0.6F
        }

        episodeTabButton.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.detail_frame_container, EpisodesTab(show.episodes))
                .commitAllowingStateLoss()
            characterTabIndicator.visibility = View.INVISIBLE
            episodesTabIndicator.visibility = View.VISIBLE
            storyTabIndicator.visibility = View.INVISIBLE
            characterTabButton.alpha = 0.6F
            storyTabButton.alpha = 0.6F
            episodeTabButton.alpha = 1.0F
        }

        var backButton = view.findViewById<View>(R.id.back_button)

        backButton.setOnClickListener {
            findNavController().navigateUp()
        }


    }
}