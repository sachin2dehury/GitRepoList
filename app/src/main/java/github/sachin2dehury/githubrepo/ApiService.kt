package github.sachin2dehury.githubrepo

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("users/sachin2dehury/repos")
    suspend fun getRepoList(
        @Query("page") page: Int,
        @Query("per_page") pageSize: Int,
    ): Response<List<RepoItemResponse?>?>

    companion object {
        const val BASE_URL = "https://api.github.com/"
    }
}
