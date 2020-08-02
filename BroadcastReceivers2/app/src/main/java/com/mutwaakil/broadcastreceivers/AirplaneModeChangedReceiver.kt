package com.mutwaakil.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */
class AirplaneModeChangedReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent) {
        val  isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return
        if (isAirplaneModeEnabled){
            Toast.makeText(context, "Airplane Mode enabled", Toast.LENGTH_SHORT).show()
        }  else{
            Toast.makeText(context, "Airplane Mode disabled", Toast.LENGTH_SHORT).show()

        }

    }
}