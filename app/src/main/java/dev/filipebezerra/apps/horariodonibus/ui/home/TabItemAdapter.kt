package dev.filipebezerra.apps.horariodonibus.ui.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import dev.filipebezerra.apps.horariodonibus.ui.home.dashboard.DashboardScreen
import dev.filipebezerra.apps.horariodonibus.ui.home.favorites.FavoritesScreen

const val DASHBOARD_PAGE_INDEX = 0
const val MY_FAVORITES_PAGE_INDEX = 1

class TabItemAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    /**
     * Mapping of the ViewPager page indexes to their respective Fragments
     */
    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        DASHBOARD_PAGE_INDEX to { DashboardScreen() },
        MY_FAVORITES_PAGE_INDEX to { FavoritesScreen() }
    )

    override fun getItemCount() = tabFragmentsCreators.size

    override fun createFragment(position: Int) =
        tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
}