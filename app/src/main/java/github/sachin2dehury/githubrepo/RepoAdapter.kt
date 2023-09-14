package github.sachin2dehury.githubrepo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import github.sachin2dehury.githubrepo.databinding.RepoListItemBinding

class RepoAdapter : PagingDataAdapter<RepoItemResponse, RepoItemViewHolder>(RepoDiffUtil()) {

    override fun onBindViewHolder(holder: RepoItemViewHolder, position: Int) {
        val item = getItem(position)
        with(holder.binding) {
            tvRepoName.text = item?.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoItemViewHolder {
        val binding = RepoListItemBinding.inflate(LayoutInflater.from(parent.context))
        return RepoItemViewHolder(binding)
    }
}
