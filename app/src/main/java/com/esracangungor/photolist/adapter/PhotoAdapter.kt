package com.esracangungor.photolist.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.esracangungor.photolist.R
import com.esracangungor.photolist.databinding.RecyclerListRowBinding
import com.esracangungor.photolist.model.PhotoItem
import com.esracangungor.photolist.view.PhotoFragmentDirections

class PhotoAdapter(private val photoList: ArrayList<PhotoItem>) :
    RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder>() {

    inner class PhotoViewHolder(val binding: RecyclerListRowBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<RecyclerListRowBinding>(
            inflater,
            R.layout.recycler_list_row,
            parent,
            false
        )
        return PhotoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        with(holder) {
            with(photoList[position]) {
                binding.tvRecylerListRowAuthorName.text = author
                binding.ivRecylerListRowImage.load(photoList[position].download_url) {
                    placeholder(R.drawable.image)
                    crossfade(true)
                    crossfade(600)
                    transformations(RoundedCornersTransformation(20f))
                }
                binding.root.setOnClickListener {
                    val action =
                        PhotoFragmentDirections.actionPhotoFragmentToPhotoDetailFragment(photoList[position])
                    Navigation.findNavController(it).navigate(action)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return photoList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setUpdatePhotoList(newPhotoList: List<PhotoItem>) {
        photoList.clear()
        photoList.addAll(newPhotoList)
        notifyDataSetChanged()
    }

}