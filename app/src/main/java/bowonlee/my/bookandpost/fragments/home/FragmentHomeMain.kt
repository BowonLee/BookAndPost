package bowonlee.my.bookandpost.fragments.home

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bowonlee.my.bookandpost.R
import bowonlee.my.bookandpost.databinding.FragmentHomeMainBinding

class FragmentHomeMain : Fragment(){


    private lateinit var mLayoutBinder : FragmentHomeMainBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mLayoutBinder = DataBindingUtil.inflate(inflater, R.layout.fragment_home_main,container,false)

        return mLayoutBinder.root
    }
}