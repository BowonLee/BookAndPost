package bowonlee.my.bookandpost.category

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import bowonlee.my.bookandpost.R
import bowonlee.my.bookandpost.databinding.FragmentCategorySetBinding

class CategorySetFragment : Fragment(){

    private lateinit var layoutBinder : FragmentCategorySetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context,"Set", Toast.LENGTH_SHORT).show()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        layoutBinder = DataBindingUtil.inflate(inflater, R.layout.fragment_category_set,container,false)
        return inflater.inflate(R.layout.fragment_category_set,container,false)
    }
}