package com.ucne.clientesregistro.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.ucne.clientesregistro.data.ClientesApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object  AppModule{
    @Singleton
    @Provides
    fun provideMoshi(): Moshi{
        return Moshi
            .Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    @Singleton
    @Provides
    fun provideVerboApi(moshi: Moshi): ClientesApi {
        val Base_Url = "https://clientesapiap2.azurewebsites.net/api/Clientes"
        return Retrofit.Builder()
            .baseUrl(Base_Url)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(ClientesApi::class.java)
    }
}