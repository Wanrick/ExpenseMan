package com.wanrick.expenseman.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.marginTop
import androidx.core.widget.ImageViewCompat
import com.wanrick.expenseman.R
import kotlinx.android.synthetic.main.fragment_dashboard.*

class Dashboard : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val icon = getNextCategoryIcon()
        category_icon_container.addView(icon)
    }

    private fun getNextCategoryIcon(): ImageView {
        val icon = ImageView(context)
        val iconDimensionValue = resources.getDimension(R.dimen.icon_dimens).toInt()
        val iconMarginValue = resources.getDimension(R.dimen.half_margin_dimens).toInt()
        icon.setImageDrawable(
            ContextCompat.getDrawable(requireContext(), R.drawable.ic_category_exercise)
        )
        icon.layoutParams = LinearLayout.LayoutParams(iconDimensionValue, iconDimensionValue)
            .apply {
                setMargins(iconMarginValue, iconMarginValue, iconMarginValue, iconMarginValue)
            }
        return icon
    }
}