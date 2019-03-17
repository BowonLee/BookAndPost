package bowonlee.my.bookandpost

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import bowonlee.my.bookandpost.databinding.ActivityMainControllerBinding
import bowonlee.my.bookandpost.fragments.category.set.FragmentCategorySet
import bowonlee.my.bookandpost.fragments.home.FragmentHomeMain


/**
 * 프레그먼트들을 종합적으로 관리하는 엑티비티 = 메인 엑티비티
 *
 * 페이지 1 : 선택한 카테고리에 해당하는 기사들을 모아준 페이지               : main
 * 페이지 2 : 카테고리를 선택하는 페이지                                   : selectCate
 * 페이지 3 : 카테고리를 설정하는 페이지                                   : setCate
 * 페이지 4 : 사용자의 설정을 하는 페이지 + 기타 설정 정보(라이센스, 약관)     : setAll
 * */
class MainControllerActivity : AppCompatActivity() {
    private lateinit var mLayoutBinder: ActivityMainControllerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mLayoutBinder = DataBindingUtil.setContentView(this, R.layout.activity_main_controller)
        setFirstFragment()
        setBottomBtns()

    }

    private fun setFirstFragment(){
        _UtilchageFragmentNotStack(supportFragmentManager,mLayoutBinder.containerMain.id,FragmentHomeMain())
    }

    private fun setBottomBtns(){
        mLayoutBinder.mainContBtnHome.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked)
          _UtilchageFragmentNotStack(supportFragmentManager,mLayoutBinder.containerMain.id,FragmentHomeMain())
        }
        mLayoutBinder.mainContBtnHomeSetCate.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked)
            _UtilchageFragmentNotStack(supportFragmentManager,mLayoutBinder.containerMain.id,FragmentCategorySet())
        }

    }



}