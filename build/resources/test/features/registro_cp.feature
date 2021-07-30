#language: es
#encoding: utf-8

Característica: Registro de usuarios nuevos
  Yo como usuario
  Quiero registar nuevos usuarios
  Para ingresarlos al sistema

  @PruebaExitosa
  Esquema del escenario: registro de usario nuevo
    Dado que Juan se encuentra en la pagina web
    Cuando el se loguea en la pagina web
      | usuario   | contraseña   |
      | <usuario> | <contraseña> |
    Cuando el ingreso todos los datos
    Entonces el puede ver que el registro Terminado

    Ejemplos:
      | usuario    | contraseña |
      | 1040738879 | hjpnpz*42  |

