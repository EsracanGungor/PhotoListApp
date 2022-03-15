package com.esracangungor.photolist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import coil.load
import coil.transform.RoundedCornersTransformation
import com.esracangungor.photolist.R
import com.esracangungor.photolist.databinding.FragmentPhotoDetailBinding
import com.esracangungor.photolist.util.viewBinding

class PhotoDetailFragment : Fragment(R.layout.fragment_photo_detail) {

    private val args by navArgs<PhotoDetailFragmentArgs>()
    private val binding by viewBinding { FragmentPhotoDetailBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val photo = args.photo

        binding.apply {
            ivPhotoDetailImage.load(photo.download_url) { placeholder(R.drawable.image)
                crossfade(true)
                crossfade(600)
                transformations(RoundedCornersTransformation(20f))}
            tvPhotoDetailAuthorName.text = photo.author
            tvPhotoDetailHeight.text = photo.height.toString()
            tvPhotoDetailWidth.text = photo.width.toString()
        }
    }
}