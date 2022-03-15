package com.esracangungor.photolist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.esracangungor.photolist.R
import com.esracangungor.photolist.adapter.PhotoAdapter
import com.esracangungor.photolist.databinding.FragmentPhotoBinding
import com.esracangungor.photolist.util.viewBinding
import com.esracangungor.photolist.viewmodel.PhotoViewModel

class PhotoFragment : Fragment(R.layout.fragment_photo) {

    private val viewModel by viewModels<PhotoViewModel>()
    private val binding by viewBinding { FragmentPhotoBinding.bind(it) }
    private val photoAdapter = PhotoAdapter(arrayListOf())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getPhotoListObserver()
        viewModel.refreshData()

        binding.apply {
            rvPhotoList.layoutManager = LinearLayoutManager(context)
            rvPhotoList.adapter = photoAdapter

            swipeRefreshLayout.setOnRefreshListener {
                rvPhotoList.visibility = View.GONE
                viewModel.refreshData()
                swipeRefreshLayout.isRefreshing = false
            }
        }

        observeLiveData()
    }

    private fun observeLiveData() {
        viewModel.photo.observe(viewLifecycleOwner) { photos ->

            photos?.let {
                binding.rvPhotoList.visibility = View.VISIBLE
                photoAdapter.setUpdatePhotoList(photos)
            }
        }
    }
}