# Spring boot MVC 

## resumen de esta sección

### @Controller

Decorador que se usa para controladores tradicionales que devuelven vistas (HTML).

```java
@Controller
public class UserController {

}

```

### Métodos http 

**@GetMapping**	Obtener datos
**@PostMapping** Crear nuevos recursos
**@PutMapping**	Actualizar (reemplazar)
**@DeleteMapping**	Eliminar recursos
**@PatchMapping**	Actualización parcial
**(Todos) @RequestMapping**	Uso más genérico

### Model y ModelMap

pasamos datos a la vista usando model 

## RestController

decorador para gestionar solicitudes http, api rest 

## RequestMapping

decorador para definir una ruta base 

## ResponseBody

Decorador para retorno JSON de un método.

## @ModelAttribute("") 

Decorador en Spring Boot (y en Spring MVC en general) se usa para pasar datos entre el controlador y la vista o para vincular automáticamente datos del formulario a un objeto del modelo.

## RequestParam()

Decorador que se usa para obtener parámetros de la URL