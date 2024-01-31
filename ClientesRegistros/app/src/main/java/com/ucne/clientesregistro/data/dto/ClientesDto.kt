package com.ucne.clientesregistro.data.dto

data class ClientesDto(
    val clienteId: Int,
    val nombreCompleto: String,
    val genero: String,
    val fechaNacimiento: String,
    val nacionalidad: String,
    val email: String,
    val numeroTelefono: String,
    val cedula: String,
)