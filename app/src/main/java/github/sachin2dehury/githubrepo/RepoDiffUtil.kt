package github.sachin2dehury.githubrepo

import androidx.recyclerview.widget.DiffUtil

class RepoDiffUtil : DiffUtil.ItemCallback<RepoItemResponse>() {
    override fun areItemsTheSame(oldItem: RepoItemResponse, newItem: RepoItemResponse): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: RepoItemResponse, newItem: RepoItemResponse): Boolean {
        return oldItem == newItem
    }
}
