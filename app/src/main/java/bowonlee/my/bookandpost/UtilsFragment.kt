package bowonlee.my.bookandpost

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

fun _UtilchageFragmentNotStack(manager : FragmentManager ,containerId:Int,targetFragment: Fragment) {

    val fragmentTransaction = manager.beginTransaction()

    fragmentTransaction.replace(containerId, targetFragment)
    fragmentTransaction.commit()
}

fun _UtilchageFragmentStack(manager : FragmentManager ,containerId:Int,targetFragment: Fragment) {

    val fragmentTransaction = manager.beginTransaction()

    fragmentTransaction.replace(containerId, targetFragment)
    fragmentTransaction.commit()
}