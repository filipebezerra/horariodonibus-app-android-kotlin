package dev.filipebezerra.apps.horariodonibus.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import dev.filipebezerra.apps.horariodonibus.R
import dev.filipebezerra.apps.horariodonibus.databinding.HomeScreenBinding

class HomeScreen : Fragment() {

    private lateinit var viewBinding: HomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = HomeScreenBinding.inflate(inflater)
        .apply {
            viewBinding = this
            setupTabs()
            setupToolbar()
        }
        .root

    private fun setupToolbar() =
        (activity as AppCompatActivity).setSupportActionBar(viewBinding.toolbar)

    private fun setupTabs() {
        val tabLayout = viewBinding.tabs
        val viewPager = viewBinding.viewPager
        viewPager.adapter = TabItemAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.setIcon(getTabIcon(position))
        }.attach()
    }

    private fun getTabIcon(position: Int) = when(position) {
        DASHBOARD_PAGE_INDEX -> R.drawable.dashboard_tab_selector
        MY_FAVORITES_PAGE_INDEX -> R.drawable.my_favorites_selector
        else -> throw IndexOutOfBoundsException()
    }
}