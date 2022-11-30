package uz.ikhtidev.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import uz.ikhtidev.recyclerview.databinding.ItemLayoutBinding

class PersonAdapter(private val personList: List<Person>, val activity:MainActivity): RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = personList[position]
        holder.binding.personImage.load(item.image){
            crossfade(true)
            placeholder(R.drawable.ic_person)
            transformations(CircleCropTransformation())
        }
        holder.binding.personName.text = item.name

        holder.itemView.setOnClickListener {
            activity.itemClick(item)
        }
    }

    override fun getItemCount(): Int = personList.size
}