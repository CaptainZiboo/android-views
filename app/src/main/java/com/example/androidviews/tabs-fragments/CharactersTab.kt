package com.example.androidviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import Character
import com.google.android.material.imageview.ShapeableImageView


class CharactersTab(val characters: List<Character>) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.characters_tab_fragment,
            container,
            false,
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<RecyclerView>(R.id.characters_list).apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ListAdapter(characters)
        }
    }
}



class ListAdapter(private val characters: List<Character>) :
    RecyclerView.Adapter<ListItemCharacter>() {
    override fun getItemCount(): Int {
        return characters.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemCharacter {
        return ListItemCharacter(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.character_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListItemCharacter, position: Int) {
        val character = characters[position]
        holder.bindItem(character)
    }
}

class ListItemCharacter(v: View) : RecyclerView.ViewHolder(v) {

    val image: ShapeableImageView = v.findViewById(R.id.character_image)
    val name: TextView = v.findViewById(R.id.character_name)

    fun bindItem(character: Character) {
        name.text = character.name

        Glide.with(itemView).load(character.picture).into(image)
    }
}