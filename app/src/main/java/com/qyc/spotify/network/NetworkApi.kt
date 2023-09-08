package com.qyc.spotify.network

import com.qyc.spotify.datamodel.Playlist
import com.qyc.spotify.datamodel.Section
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkApi {
    @GET("feed")
    fun getHomeFeed(): Call<List<Section>>

    @GET("playlist/{id}")
    fun getPlaylist(@Path("id") id: Int): Call<Playlist>
}