package com.kyc.ondato.sample.custom

import androidx.fragment.app.Fragment
import com.kyc.ondato.sample.custom.CustomStartFragment
import com.kyc.ondato.screen.StartScreenCallback
import com.kyc.ondato.screen.StartScreenProvider

object StartFragmentProvider : StartScreenProvider {
    override fun get(callback: StartScreenCallback): Fragment {
        return CustomStartFragment.newInstance(callback)
    }
}