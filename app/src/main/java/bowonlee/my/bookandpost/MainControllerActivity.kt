package bowonlee.my.bookandpost

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import bowonlee.my.bookandpost.category.CategorySelectFragment
import bowonlee.my.bookandpost.category.CategorySetFragment
import bowonlee.my.bookandpost.databinding.ActivityMainControllerBinding
import bowonlee.my.bookandpost.previewpager.PreviewFragment


/**
 * 프레그먼트들을 종합적으로 관리하는 엑티비티 = 메인 엑티비티
 *
 * 페이지 1 : 선택한 카테고리에 해당하는 기사들을 모아준 페이지               : all
 * 페이지 2 : 카테고리를 선택하는 페이지                                   : selectCate
 * 페이지 3 : 카테고리를 설정하는 페이지                                   : setCate
 * 페이지 4 : 사용자의 설정을 하는 페이지 + 기타 설정 정보(라이센스, 약관)     : setAll
 * */
class MainControllerActivity : AppCompatActivity() {




    private lateinit var layoutBinder: ActivityMainControllerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutBinder = DataBindingUtil.setContentView(this, R.layout.activity_main_controller)
        setBtnEvents()
        setFirstFragment()

    }
    private fun setFirstFragment(){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val previewPager = PreviewFragment()
        fragmentTransaction.add(layoutBinder.containerMain.id,previewPager)
        fragmentTransaction.commit()
    }


    private fun setBtnEvents(){


        val chageFragment : (Fragment)->Unit  = {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.replace(layoutBinder.containerMain.id,it)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        layoutBinder.btnAllController.setOnClickListener { chageFragment(PreviewFragment()) }
        layoutBinder.btnSelectCategory.setOnClickListener { chageFragment(CategorySelectFragment()) }
        layoutBinder.btnSetCategory.setOnClickListener { chageFragment(CategorySetFragment()) }
//        layoutBinder.btnSetApp.setOnClickListener { chageFragment() }

    }


}