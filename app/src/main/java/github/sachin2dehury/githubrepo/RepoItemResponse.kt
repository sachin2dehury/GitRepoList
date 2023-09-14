package github.sachin2dehury.githubrepo


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RepoItemResponse(
    val description: String? = null,
    @Json(name = "full_name")
    val fullName: String? = null,
    @Json(name = "html_url")
    val htmlUrl: String? = null,
    val id: Int? = null,
    val name: String? = null,
    @Json(name = "node_id")
    val nodeId: String? = null,
    val `private`: Boolean? = null
)