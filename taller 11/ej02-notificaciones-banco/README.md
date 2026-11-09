# Taller 11 · Ejercicio 2 — BancoPlata

Programación 1 (POO) · Universidad Libre · Docente: Andrés Castaño

## Situación
El banco notifica por SMS, correo y push. Ahora quiere agregar WhatsApp, y cada canal nuevo obliga a tocar varios `if/else` repetidos.

## Cómo ejecutar
```bash
javac -d out src/*.java
java -cp out Main
```
Al final de la salida, la línea **ESPERADO** dice cómo debe verse el programa cuando quede corregido.

## Qué hacer
1. Ejecute el código tal como está y observe la diferencia con lo **ESPERADO**.
2. Identifique en el código la(s) línea(s) que delatan el problema.
3. Decida qué patrón creacional aplica (Singleton, Factory Method o Builder) y refactorice.
4. Ajuste `Main.java` solo en lo necesario para usar su solución (no borre los casos de prueba).
5. Haga commit y push de su solución en este repositorio.
