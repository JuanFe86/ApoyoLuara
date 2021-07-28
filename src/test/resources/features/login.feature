#language: es
#encoding: utf-8

Característica: Autenticacion pagina web
  Yo como usuario
  Quiero autenticarme en la pagina web con usuario y clave
  Para realizar operaciones requeridas

  @PruebaExitosa
  Esquema del escenario: Ingreso exitoso a la aplicacion web
    Dado que Juan se encuentra en la pagina web
    Cuando el se loguea en la pagina web
      | usuario   | contraseña   |
      | <usuario> | <contraseña> |
    Entonces el puede ver el mensaje ¡ Hola LAURA RAMIREZ !

    Ejemplos:
      | usuario    | contraseña |
      | 1040738879 | hjpnpz*42  |