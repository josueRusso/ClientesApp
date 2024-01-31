using System.ComponentModel.DataAnnotations;
using Microsoft.EntityFrameworkCore.Sqlite;


namespace ClientesApi.Model;

public class Clientes
{
    [Key]
    public int ClienteId { get; set; }
    public string? Nombrecompleto { get; set;}
    public string? Genero { get; set; }
    public string? FechaNacimiento { get; set; }
    public string? Nacionalidad { get; set; }

    [Required(ErrorMessage = "* El campo Email es obligatorio")]
    [RegularExpression(@"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$", ErrorMessage = "* Formato de email incorrecto")]
    [EmailAddress(ErrorMessage = "* Formato de email incorrecto")]
    public string? Email { get; set; }

    [Required(ErrorMessage = "* El campo Número de Teléfono es obligatorio")]
    [RegularExpression(@"^\d{10}$", ErrorMessage = "* Número de teléfono debe tener exactamente 10 dígitos")]
    public string? NumeroTelefono { get; set; }

    [RegularExpression(@"^\d{11}$", ErrorMessage = "* La Cedula debe tener exactamente 11 dígitos")]
    public string? Cedula { get; set;}


 }
