package com.ucne.clientesregistro.data

import com.ucne.clientesregistro.data.dto.ClientesDto
import retrofit2.http.*


interface ClientesApi{
    @GET("ClientesController")
    suspend fun GetList(): List<ClientesDto>

    @GET("ClientesController/{id}")
    suspend fun GetClientes(@Path("id") id: Int): ClientesDto

}
