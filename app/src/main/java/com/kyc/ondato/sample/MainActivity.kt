package com.kyc.ondato.sample

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kyc.ondato.Ondato
import com.kyc.ondato.OndatoConfig
import com.kyc.ondato.OndatoError
import com.kyc.ondato.enums.Language
import com.kyc.ondato.sample.custom.LoadingFragmentProvider
import com.kyc.ondato.sample.custom.StartFragmentProvider
import com.kyc.ondato.sample.custom.SuccessFragmentProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initSdk()
        findViewById<View>(R.id.start_button)?.setOnClickListener { startIdentification() }
    }

    private fun initSdk() {
        val config = OndatoConfig.Builder()
            .setToken("ADD YOUR TOKEN HERE")
            .setIdentificationId("ADD IDENTIFICATION ID HERE")
            .showSplashScreen(true)
            .showStartScreen(true)
            .showConsentScreen(true)
            .showSelfieWithDocumentScreen(true)
            .showSuccessScreen(true)
            .ignoreLivenessError(false)
            .ignoreVerificationErrors(false)
            .recordProcess(true)
            .setMode(OndatoConfig.Mode.TEST)
            .setLanguage(Language.English)
//          Overridable screens
//            .setLoadingScreenProvider(LoadingFragmentProvider)
//            .setStartScreenProvider(StartFragmentProvider)
//            .setSuccessScreenProvider(SuccessFragmentProvider)
            .build()

        Ondato.init(config)
    }

    private fun startIdentification() {
        Ondato.starIdentification(this, object : Ondato.ResultListener {
            override fun onSuccess(identificationId: String?) {
                findViewById<TextView>(R.id.result_text_view)?.text = "Success"
            }

            override fun onFailure(identificationId: String?, error: OndatoError) {
                findViewById<TextView>(R.id.result_text_view)?.text = "Failed"
            }
        })
    }
}