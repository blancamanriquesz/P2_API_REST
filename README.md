# P2_API_REST
Práctica 2  API REST
## Endpoints API Carrito

| Método | Ruta                | Body (JSON)                          | Descripción                    | Respuestas |
|-------:|---------------------|---------------------------------------|--------------------------------|-----------|
| GET    | /api/carritos       | -                                     | Lista todos los carritos       | 200 |
| GET    | /api/carritos/{id}  | -                                     | Obtiene carrito por id         | 200, 404 |
| POST   | /api/carritos       | {idArticulo, descripcion, unidades}   | Crea un carrito                | 201, 400 |
| PUT    | /api/carritos/{id}  | {idArticulo, descripcion, unidades}   | Actualiza un carrito           | 200, 404, 400 |
| DELETE | /api/carritos/{id}  | -                                     | Borra un carrito               | 204, 404 |
