package monster.sasakisan.calendar_view_sample

import android.view.View
import com.kizitonwose.calendarview.ui.ViewContainer
import kotlinx.android.synthetic.main.view_day_item.view.*

class DayViewContainer(view: View) : ViewContainer(view) {
    val textView = view.calendar_day_text
}