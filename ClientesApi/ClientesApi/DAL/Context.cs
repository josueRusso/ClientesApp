using ClientesApi.Model;
using Microsoft.EntityFrameworkCore;


namespace ClientesApi.DAL
{
    public class Context : DbContext
    {
        public DbSet<Clientes> Clientes { get; set; }

        public Context(DbContextOptions<Context> options) : base(options) { }
    }
}
