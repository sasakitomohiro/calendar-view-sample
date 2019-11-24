package monster.sasakisan.calendar_view_sample

import android.view.View
import android.widget.TextView
import com.kizitonwose.calendarview.ui.ViewContainer
import monster.sasakisan.calendar_view_sample.databinding.ViewDayItemBinding

class DayViewContainer(view: View) : ViewContainer(view) {
    private val binding = ViewDayItemBinding.bind(view)
    val calendarDayText: TextView = binding.calendarDayText
}