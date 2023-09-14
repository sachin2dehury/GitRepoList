package github.sachin2dehury.githubrepo

class RepoRepository(private val service: ApiService) {

    suspend fun getRepoList(page: Int, pageSize: Int) = service.getRepoList(page, pageSize)
}
