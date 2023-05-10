package io.termplux.services

import android.content.Intent
import android.service.quicksettings.TileService
import io.termplux.activity.TermPluxActivity

class TermPluxTile : TileService() {

    override fun onClick() {
        super.onClick()
        val intent = Intent(applicationContext, TermPluxActivity().javaClass)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        if (!isLocked) {
            startActivityAndCollapse(intent)
        } else unlockAndRun {
            startActivityAndCollapse(intent)
        }
    }
}