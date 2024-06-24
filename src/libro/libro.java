package libro;

public class libro {

        // Atributos
        private String titulo;
        private String autor;
        private String editorial;
        private double precio;

        // Constructor sin parámetros
        public libro() {
            // Inicializa los atributos con valores por defecto
            this.titulo = "Alicia en el pais de las marivillas";
            this.autor = "Charles Lutwidge Dodgson.";
            this.editorial = "Macmillan";
            this.precio = 85.50;
        }

        // Constructor con parámetros
        public libro(String titulo, String autor, String editorial, double precio) {
            // Inicializa los atributos con los valores dados
            this.titulo = titulo;
            this.autor = autor;
            this.editorial = editorial;
            this.precio = precio;
        }

        // Método para mostrar los detalles del libro
        public void mostrarDetalles() {
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Editorial: " + editorial);
            System.out.println("Precio: " + precio);
        }

        // Método para actualizar el precio del libro
        public void actualizarPrecio(double nuevoPrecio) {
            this.precio = nuevoPrecio;
        }

        // Getters y Setters para cada atributo
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public String getAutor() {
            return autor;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }
        public String getEditorial() {
            return editorial;
        }
        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }
        public double getPrecio() {
            return precio;
        }
        public void setPrecio(double precio) {
            this.precio=precio;
        }
    }

