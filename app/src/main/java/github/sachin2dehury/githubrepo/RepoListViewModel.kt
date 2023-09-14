package github.sachin2dehury.githubrepo

import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingConfig
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RepoListViewModel @Inject constructor(private val repository: RepoRepository) : ViewModel() {

    private val pagingConfig = PagingConfig(10, 10, false, 10)

    fun getPager() = Pager(pagingConfig, 1) {
        RepoPagingSource(repository)
    }.flow
}
