package com.ucne.clientesregistro.data.repository

import com.ucne.clientesregistro.data.ClientesApi
import com.ucne.clientesregistro.data.dto.ClientesDto
import javax.inject.Inject

class ClientesRepository  @Inject constructor(
    private val clientes : ClientesApi
){
    suspend fun getListClientes(): List<ClientesDto> {
        try {
            return clientes.GetList()
        } catch (e: Exception) {
            throw e
        }
    }

    suspend fun getClientes(id: Int): ClientesDto {
        try {
            return clientes.GetClientes(id)
        } catch (e: Exception) {
            throw e
        }
    }
}