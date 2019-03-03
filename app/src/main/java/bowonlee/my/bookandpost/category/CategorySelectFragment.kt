package bowonlee.my.bookandpost.category

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import bowonlee.my.bookandpost.R
import bowonlee.my.bookandpost.databinding.FragmentCategorySelectBinding

/**
 * 카테고리들을 그리드 형태로 뿌려주는 페이지 프레그먼트
 * in  :  아무 것도 없이
 * out : 카테고리 리스트
 * */
class CategorySelectFragment:Fragment(){
    private lateinit var layoutBinder : FragmentCategorySelectBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context,"Select",Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        layoutBinder = DataBindingUtil.inflate(inflater,R.layout.fragment_category_select,container,false)
        return inflater.inflate(R.layout.fragment_category_select,container,false)
    }

}