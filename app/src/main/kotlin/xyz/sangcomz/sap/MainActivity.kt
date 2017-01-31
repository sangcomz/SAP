package xyz.sangcomz.sap

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.salomonbrys.kodein.KodeinInjected
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.android.appKodein
import com.github.salomonbrys.kodein.instance

class MainActivity : AppCompatActivity(), KodeinInjected {


    override val injector = KodeinInjector()

    val navi: Navigation by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        inject(appKodein())
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
