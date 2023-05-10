package au.com.shiftyjelly.pocketcasts

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.toLiveData
import au.com.shiftyjelly.pocketcasts.account.AccountActivity
import au.com.shiftyjelly.pocketcasts.databinding.FragmentAutomotiveSettingsBinding
import au.com.shiftyjelly.pocketcasts.profile.AccountDetailsFragment
import au.com.shiftyjelly.pocketcasts.repositories.user.UserManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AutomotiveSettingsFragment : Fragment() {
    @Inject lateinit var userManager: UserManager

    private lateinit var binding: FragmentAutomotiveSettingsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAutomotiveSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userView = binding.userView

        userManager.getSignInState()
            .toLiveData()
            .observe(viewLifecycleOwner) { signInState ->
                val loggedIn = signInState.isSignedIn

                if ((userView.signedInState != null && userView.signedInState?.isSignedIn == false) && loggedIn) {
                    // We have to close after signing in to meet Google UX requirements
                    activity?.finish()
                }

                userView.signedInState = signInState
                userView.lblUserEmail.setOnClickListener { onProfileAccountButtonClicked(loggedIn) }
                userView.imgProfilePicture.setOnClickListener { onProfileAccountButtonClicked(loggedIn) }
                userView.btnAccount?.setOnClickListener { onProfileAccountButtonClicked(loggedIn) }
            }
    }

    private fun onProfileAccountButtonClicked(loggedIn: Boolean) {
        if (loggedIn) {
            val fragment = AccountDetailsFragment.newInstance()
            (activity as? AutomotiveSettingsActivity)?.addFragment(fragment)
        } else {
            signIn()
        }
    }

    fun signIn() {
        val loginIntent = Intent(activity, AccountActivity::class.java)
        startActivity(loginIntent)
    }
}
