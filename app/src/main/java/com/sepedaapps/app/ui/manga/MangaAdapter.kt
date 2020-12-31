package com.sepedaapps.app.ui.manga

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.bumptech.glide.Glide
import com.sepedaapps.app.R
import com.sepedaapps.app.data.model.Manga
import com.sepedaapps.app.databinding.ItemMangaBinding
import com.sepedaapps.app.ui.base.BaseAdapter

class MangaAdapter (val context: Context) : BaseAdapter<Manga>(R.layout.item_manga) {
    override fun onBind(binding: ViewDataBinding?, data: Manga) {
        val mBinding = binding as ItemMangaBinding
        Glide.with(context).load(data.thumb).into(mBinding.itemThumb)
    }

    override fun onClick(binding: ViewDataBinding?, data: Manga) {
        val intent = Intent(context, MangaActivity::class.java)
        intent.putExtra(MangaActivity.OPEN_MANGA, data)
        context.startActivity(intent)
    }
}