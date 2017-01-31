package xyz.sangcomz.sap

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.singleton

/**
 * Created by sangcomz on 01/02/2017.
 */
val navigationModule = Kodein.Module {
    bind<Navigation>() with singleton { Navigation() }
}