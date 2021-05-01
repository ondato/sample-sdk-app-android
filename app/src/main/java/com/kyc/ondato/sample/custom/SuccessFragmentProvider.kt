package com.kyc.ondato.sample.custom

import androidx.fragment.app.Fragment
import com.kyc.ondato.sample.custom.CustomSuccessFragment
import com.kyc.ondato.screen.SuccessScreenCallback
import com.kyc.ondato.screen.SuccessScreenProvider

object SuccessFragmentProvider : SuccessScreenProvider {
    override fun get(callback: SuccessScreenCallback): Fragment {
        return CustomSuccessFragment.newInstance(callback)
    }
}