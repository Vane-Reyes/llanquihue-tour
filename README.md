# 🏞️ LlanquihueTourApp

## 👩‍💻 Autor
- Vanessa Catalina Reyes González
- Sección 004A — Carrera Analista Programador Computacional
- Sede Virtual

## 📋 Descripción general
Sistema para cargar, buscar por nombre y filtrar tours de Llanquihue Tour desde un archivo de texto.

## 🗂️ Estructura del proyecto
- `src/model`: clase Tour (datos de cada tour, incluye composición, dejando clase Lugar como atributo), clase Lugar (datos del lugar donde ocurre el Tour).
- `src/data`: clase GestorDatos (lee el archivo, valida los datos y crea los objetos).
- `src/service`: clase `TourService`, que centraliza las operaciones sobre la lista de tours: `agregarTodos` (carga los tours en el servicio), `listar` (devuelve todos los tours), `buscar` (busca un tour por su nombre) y `filtrarPorPrecio` (devuelve los tours con precio mayor a un valor dado).
- `src/ui`: clase Main (ejecuta el programa).
- `resources/tours.txt`: datos de origen.

## ⚙️ Instrucciones para clonar y ejecutar
1. Clonar el repositorio: `git clone https://github.com/Vane-Reyes/llanquihue-tour.git`
2. Abrir el proyecto en IntelliJ IDEA.
3. Ejecutar la clase `Main` ubicada en `src/ui`.

## 🔗 Repositorio GitHub
https://github.com/Vane-Reyes/llanquihue-tour

## 📅 Fecha de entrega
- Versión 1: 16/11/2026
- Versión 2: 23/11/2026