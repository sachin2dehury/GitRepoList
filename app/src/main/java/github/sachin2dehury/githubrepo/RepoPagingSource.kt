package github.sachin2dehury.githubrepo

import androidx.paging.PagingSource
import androidx.paging.PagingState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RepoPagingSource(private val repository: RepoRepository) :
    PagingSource<Int, RepoItemResponse>() {
    override fun getRefreshKey(state: PagingState<Int, RepoItemResponse>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, RepoItemResponse> =
        withContext(Dispatchers.IO) {
            val page = params.key ?: 1
            val pageSize = params.loadSize

            val response = repository.getRepoList(page, pageSize)

            if (response.code() == 200) {
                val body = response.body()
                val next = if (body.isNullOrEmpty()) null else page + 1
                LoadResult.Page(body?.filterNotNull().orEmpty(), null, next)
            } else {
                val error = response.errorBody()?.string()
                LoadResult.Error(Exception(error))
            }
        }
}
