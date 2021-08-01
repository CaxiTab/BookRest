package com.slobodyanyuk_mykhailo99.bookrest.ui.home.menuview.restaurants

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.slobodyanyuk_mykhailo99.bookrest.databinding.FragmentRestaurantsNearbyBinding

class NearbyRestaurantsFragment : Fragment() {
    private var _binding: FragmentRestaurantsNearbyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentRestaurantsNearbyBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    companion object {
        fun newInstance() : NearbyRestaurantsFragment {
            val args: Bundle = Bundle()
            val fragment = NearbyRestaurantsFragment()
            fragment.arguments = args
            return fragment
        }
    }
}