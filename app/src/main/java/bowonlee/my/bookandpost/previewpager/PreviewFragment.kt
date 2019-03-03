package bowonlee.my.bookandpost.previewpager

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import bowonlee.my.bookandpost.R
import bowonlee.my.bookandpost.databinding.FragmentPreviewPagerBinding

/**
 * 선택한 카테고리에 있는 RSS들을 이용하여 미리보기 페이지를 구성한다.
 * */
class PreviewFragment : Fragment(){
    lateinit var layoutBinder : FragmentPreviewPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context,"Preview", Toast.LENGTH_SHORT).show()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        layoutBinder = DataBindingUtil.inflate(inflater,R.layout.fragment_preview_pager,container,false)
        return inflater.inflate(R.layout.fragment_preview_pager,container,false)
    }
}