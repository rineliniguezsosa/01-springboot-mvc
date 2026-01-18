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

## RequestParam() ó HttpServletRequest

Decorador que se usa para obtener parámetros de la URL

# RequestBody

Recibe JSON del body.

# @Value

Lee valores del application.properties.

# @PropertySource 
es una anotación de configuración que se usa para cargar archivos .properties personalizados y poder leer sus valores con @Value o Environment.

## Endpoints

##### PARAMS
- GET api/params/foo?message=Hola como estas
- GET api/params/bar?txt=hola&code=200
- GET api/params/request?txt=hola&code=500

##### PARAMS URL
- GET /api/path/var/hola%20mundo
- GET /api/path/multiple/camisa/1