import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Episode(
    val picture: String,
    val name: String,
    val number: Int,
    val date: String
) : Parcelable