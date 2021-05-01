package com.kyc.ondato.sample.custom

import androidx.fragment.app.Fragment
import com.kyc.ondato.sample.custom.CustomLoadingFragment
import com.kyc.ondato.screen.LoadingScreenProvider

object LoadingFragmentProvider : LoadingScreenProvider {
    override fun get(): Fragment {
        return CustomLoadingFragment()
    }
}