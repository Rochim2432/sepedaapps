package com.sepedaapps.app.data.remote

import com.sepedaapps.app.data.model.MangaList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MangaService {
    @GET("manga/page/1")
    fun listManga() : Call<MangaList>

    @GET("manga/detail/")
    fun detailManga(@Query("endpoint")detail: String) : Call<MangaList>

    @GET("search/?q=parameter")
    fun searchManga(@Query("q")query: String) : Call<MangaList>
}