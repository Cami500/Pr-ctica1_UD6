# UD6 - Práctica 1 - Refactorizar

* [1. Realiza los siguientes cambios en el código](#1-realiza-los-siguientes-cambios-en-el-código)
* [2. **Refactoriza** el código fuente de la siguiente manera: ( Haz las capturas de todas las ventanas que aparezcan)](#2-refactoriza-el-código-fuente-de-la-siguiente-manera--haz-las-capturas-de-todas-las-ventanas-que-aparezcan)
* [3. En el método `main`, **refactoriza**](#3-en-el-método-main-refactoriza)
* [4. Ejecuta el programa y haz una captura de consola](#4-ejecuta-el-programa-y-haz-una-captura-de-consola)
* [5. Haz una captura del código fuente resultado después de refactorizar](#5-haz-una-captura-del-código-fuente-resultado-después-de-refactorizar)

Realiza un *fork* del proyecto que se encuentra en: <https://github.com/Cami500/Practica1_UD6>. Una vez ralizado, crea una nueva rama que se llame **tu_nombrea+apellido**  y comprueba que puedes ejecutarlo con **Eclipse**. Cuando lo tengas, realiza las siguientes tareas:

> Cada tarea debe estar como máximo en un commit diferente y la rama **tu_nombrea+apellido** debe subirse a tu repositorio nuevo creado.
> La entrega se realiza adjuntando el enlace al repositorio de la actividad y adjuntando la carpeta con el original y el pdf con las capturas solicitadas/texto de la tarea.

## 1. Realiza los siguientes cambios en el código

* Renombra el paquete `ed.fran` a `ed.<tu_nombre>`
* Renombra las cadenas que se encuentran definidas en el método `main` de la classe `Escuela`.

> Ejecuta el código y realiza una captura del resultado en consola.

## 2. **Refactoriza** el código fuente de la siguiente manera: ( Haz las capturas de todas las ventanas que aparezcan)

Cambia el nombre de los atributos de la clase `Persona`. 

> **Nota:** pulsa en `options` para que se cambie también el nombre en las cadenas literales donde aparezcan esas variables:

![Refactor Options Image](md_media/refactor.png)

* n -> nombre
* c -> apellidos
* a -> anyo
* cl -> ciclo formativo

Cambia el nombre de las clases:

* Escuela -> Instituto
* Persona -> Alumno

## 3. En el método 'main', **refactoriza**

Extrae las cadenas y números a constantes de clase con los siguientes nombres: (Haz **capturas** de todas las ventanas que aparezcan)


"Camilo" -> `kNOMBRE_ALUMNO`
"Juan" -> `kAPELLIDOS_ALUMNO`
"1º DAM/DAW" -> `kCICLO_FORMATIVO`
2023 -> `kANYO`

## 4. Ejecuta el programa y haz una captura de consola

(De este apartado no es necesario un commit a menos que faltara algo del commit anterior)

## 5. Haz una captura del código fuente resultado después de refactorizar

(De este apartado no es necesario un commit a menos que faltara algo del commit anterior)
