package xyz.sangcomz.sap

import android.app.Application
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.android.autoAndroidModule
import com.github.salomonbrys.kodein.lazy

/**
 * Created by sangcomz on 01/02/2017.
 */
class SAPApplication : Application(), KodeinAware {
    override val kodein by Kodein.lazy {
        import(autoAndroidModule(this@SAPApplication))
        import(navigationModule)
    }

}