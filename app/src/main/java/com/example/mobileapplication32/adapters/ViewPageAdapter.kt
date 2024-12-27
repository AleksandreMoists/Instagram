import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView


class ViewPageAdapter(
    private val layouts: List<Int>,
    private val activity: FragmentActivity
) : RecyclerView.Adapter<ViewPageAdapter.ViewHolder>() {  // Corrected class name

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(activity).inflate(layouts[viewType], parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Handle binding if needed
    }

    override fun getItemCount(): Int = layouts.size

    override fun getItemViewType(position: Int): Int = position
}
