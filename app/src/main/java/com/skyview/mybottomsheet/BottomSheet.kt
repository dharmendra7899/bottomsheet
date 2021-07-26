package com.skyview.mybottomsheet

import android.content.Context
import com.google.android.material.bottomsheet.BottomSheetDialog

class BottomSheet(private var context: Context) {
    private lateinit var bottomSheetDialog: BottomSheetDialog
    fun showBottomSheet() {
        bottomSheetDialog = BottomSheetDialog(context, R.style.MyBottomSheetDialogTheme)
        bottomSheetDialog.setContentView(R.layout.sheet)
        bottomSheetDialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        bottomSheetDialog.show()
        bottomSheetDialog.setCancelable(false)
    }
}