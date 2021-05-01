package com.kyc.ondato.sample.custom

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.kyc.ondato.sample.R
import com.kyc.ondato.screen.StartScreenCallback

class CustomStartFragment : Fragment(R.layout.fragment_start) {
    private var callback: StartScreenCallback? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.start_button)?.setOnClickListener { callback?.start() }
    }

    companion object {
        fun newInstance(callback: StartScreenCallback): CustomStartFragment {
            return CustomStartFragment().apply {
                this.callback = callback
            }
        }
    }
}