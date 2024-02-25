package com.example.androidviews

import Episode
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class EpisodesTab(val episodes: List<Episode>) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.episodes_tab_fragment,
            container,
            false,
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<RecyclerView>(R.id.episodes_list).apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ListAdapterEpisodes(episodes)
        }
    }
}



class ListAdapterEpisodes(private val episodes: List<Episode>) :
    RecyclerView.Adapter<ListItemEpisode>() {
    override fun getItemCount(): Int {
        return episodes.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemEpisode {
        return ListItemEpisode(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.episode_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListItemEpisode, position: Int) {
        val episode = episodes[position]
        holder.bindItem(episode)
    }
}

class ListItemEpisode(v: View) : RecyclerView.ViewHolder(v) {

    val image: ImageView = v.findViewById(R.id.episode_image)
    val name: TextView = v.findViewById(R.id.episode_title)
    val number: TextView = v.findViewById(R.id.episode_number)
    val date: TextView = v.findViewById(R.id.episode_date)

    fun bindItem(episode: Episode) {
        name.text = episode.name
        number.text = "Episode #${episode.number}"
        date.text = formatDateToLocale(episode.date)


        Glide.with(itemView).load(episode.picture).into(image)
    }

    fun formatDateToLocale(date: Date): String {
        val dateFormat = SimpleDateFormat("dd MMMM yyyy", Locale("fr"))
        return dateFormat.format(date)
    }
}