package com.kyc.ondato.sample.custom

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.kyc.ondato.sample.R
import com.kyc.ondato.screen.SuccessScreenCallback

class CustomSuccessFragment : Fragment(R.layout.fragment_success) {
    private var callback: SuccessScreenCallback? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.complete_button)
            ?.setOnClickListener { callback?.onCompleted() }
    }

    companion object {
        fun newInstance(callback: SuccessScreenCallback): CustomSuccessFragment {
            return CustomSuccessFragment().apply {
                this.callback = callback
            }
        }
    }
}