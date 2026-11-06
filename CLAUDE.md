# NotesBySubject · contexto para Claude

App Android (Kotlin + Jetpack Compose) del trabajo final de Smart Application Programming (CUNEF, M27). Cada foto de la pizarra o de los apuntes se guarda en la carpeta de la asignatura que hay en ese momento según el horario.

## Documentos que mandan (en este orden)
1. La rúbrica del profesor.
2. `MAI_SAP_Skeleton_App1_NotesBySubject.docx` (en la carpeta `Trabajo Final`, fuera del repo).
3. `README.md` de este proyecto: su sección "Facts you cannot guess" tiene la URL del horario, los campos del JSON y los avisos de cada fila.

## Base y referencia
- Se parte de este skeleton. No se cambia ninguna versión de `gradle/libs.versions.toml` y no se añade el plugin `org.jetbrains.kotlin.android`.
- Referencia de código: la app completa SnapSplit del profesor (`SnapSplit/Solución de la aplicación/SnapSplit`). Los módulos se copian **adaptados** a NotesBySubject, nunca tal cual:
  - Cámara: guardar en `filesDir/notes/<subjectId>/`, no en MediaStore. Compartir con FileProvider + `FLAG_GRANT_READ_URI_PERMISSION`.
  - Nivel (A9): hace falta la gravedad. El filtro de SnapSplit la quita, así que no sirve tal cual.
  - Retrofit (A5): `lenientJson = Json { ignoreUnknownKeys = true }` en los dos lectores, `.client(httpClient)`, y `room` puede ser `null`.
  - Firebase (A6): Firestore en modo producción. El login solo protege la pantalla Classmates.
  - WorkManager (A7): el recordatorio periódico sí se programa, y hay que evitar avisar dos veces de la misma clase.
- Paquete: `com.example.notesbysubject`.

## Forma de trabajar
- Paso a paso, en el orden de la sección 6 del documento del skeleton: marco de navegación, A1, A4, A3, A5, A8, A2, A9, A10, A7, A6, y al final tests, .aab y README.
- **Cuaderno de prompts:** uno solo, `prompts/NotesBySubject.md`. Cada prompt que el grupo envíe a una IA (Claude o Gemini) se añade en el momento, con ID `NBS-xx` correlativo y el campo **Author** como `(rellenar)`, que el grupo completa a mano.
- Los prompts para Gemini se dan con las 5 partes: Context, Task, Facts, Limits, Done when.
- Después de cada cambio, dar al grupo los comandos de git para hacer commit (con el ID del prompt en el mensaje) y push.
- Nunca escribir contraseñas, claves ni el `.jks` o `.aab` en el repo ni en un prompt. `google-services.json` sí va al repo.

## Decisiones de diseño tomadas
(se irán añadiendo aquí y en el README)
