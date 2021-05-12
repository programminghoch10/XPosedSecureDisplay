package com.JJ.SecureDisplay

import android.view.SurfaceView
import android.view.Window
import android.view.Display
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager.LayoutParams
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XC_MethodHook
import de.robv.android.xposed.XC_MethodReplacement
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.XposedHelpers
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam

class SecureDisplay : IXposedHookLoadPackage {

    private val debug: Boolean = false

    override fun handleLoadPackage(loadPackageParam: LoadPackageParam?) {
        // Log Package Name
        XposedBridge.log("Enabled FLAG_SECURE for: " + (loadPackageParam?.packageName ?: "null"))

        try {
            val windowsState =
                XposedHelpers.findClass("com.android.server.wm.WindowState", loadPackageParam?.classLoader)
            XposedHelpers.findAndHookMethod(windowsState, "isSecureLocked", XC_MethodReplacement.returnConstant(true))
        } catch (error: Throwable) {
            if (debug) XposedBridge.log("SecureDisplay: $error")
        }

        try {
            val windowsState =
                XposedHelpers.findClass("com.android.server.wm.WindowState", loadPackageParam?.classLoader)
            XposedHelpers.findAndHookMethod(
                "com.android.server.wm.WindowManagerService",
                loadPackageParam?.classLoader,
                "isSecureLocked",
                windowsState,
                XC_MethodReplacement.returnConstant(true)
            )
        } catch (error: Throwable) {
            if (debug) XposedBridge.log("SecureDisplay: $error")
        }
    }
}
