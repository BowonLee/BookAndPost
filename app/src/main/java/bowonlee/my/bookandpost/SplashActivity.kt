package bowonlee.my.bookandpost

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        callMainControllerActivity()
        this.finish()
    }

    fun callMainControllerActivity(){
        startActivity(Intent(this, MainControllerActivity::class.java))

    }
}
