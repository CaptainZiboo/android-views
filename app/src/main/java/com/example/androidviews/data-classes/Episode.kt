import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.Date

@Parcelize
data class Episode(
    val picture: String,
    val name: String,
    val number: Int,
    val date: Date
) : Parcelable