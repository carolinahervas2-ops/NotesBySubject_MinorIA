# NotesBySubject · Cuaderno de prompts

Un único cuaderno para el grupo. Cada entrada indica en **Author** quién envió el prompt. Las entradas van en el orden en que se enviaron los prompts y se escriben en el momento de enviarlos. Los IDs son `NBS-` seguido de un número que sube de uno en uno.

Formato de cada entrada: el de `prompts/README.md`.

## NBS-01

- **Date and time:** 2026-10-30
- **Author:** Carolina
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** ninguno (solo lectura)
- **Result:** accepted
- **How I checked it:** Claude listó el contenido de la carpeta Smart Application Programming

### Prompt

confirmame que puedes leer los archvios de la carpeta smart application programming

### What happened

Claude encontró la carpeta en OneDrive\Desktop, listó todos sus archivos y leyó Guia_NotesBySubject.md para comprobar el acceso. Avisó de que el .zip de la raíz pesa 22 bytes (vacío o dañado).

## NBS-02

- **Date and time:** 2026-10-30
- **Author:** Ana
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** ninguno (solo lectura)
- **Result:** accepted
- **How I checked it:** Claude confirmó la carpeta "Solución de la aplicación" y resumió el enunciado y la guía de SnapSplit

### Prompt

Quiero hacer el trabajo Final, confirmame que lees todos los archivos que mi profesor me ha dado de ayuda, debes saber que en la aisgntura estamos usando Android Sudio para hacer codigo y crear aplicaciones. Tienes como ejemplo de aplicacion hecha por mi profsor el de Snap SPlit, la idea es crear la aplicaicon del trabajo final (NotesBySubject) basandose en la ya creada por el profesor (SnapSplit). En la carpeta C:\Users\carol\OneDrive\Desktop\Smart Application Programming\SnapSplit\Solución de la aplicación tienes la solucion del SnapSplit, confirmame que la ves y puedes entrar a los archivos, ese proyecto sera la base que usaremos para nuestro trabajo. Ten en cuenta que al final del trabajo necesitarmos un documento aparte con todos los prompts que hemos usado, Asi que ves guardandolos. My importante tb que tenemos que ir subiendo los archivos y los cambios al repo de github, asi que cuando vayamos ahciendo cambios, recuerdame los comandos para subirlos a github. Vamos a ir paso por paso, quiero saber el contexto teorico que necesito para este trabajo, tb queiro que me digas qeu archivos me van a ser utiles, es decir con los que tendre que trabajar. Si tienes dudas sobre como quiero desarrollar la aplicacion me la haces antes de asumir cosas, vamos a comenzar y recuerda paso a paso.

### What happened

Claude leyó el .docx del skeleton, el .docx de SnapSplit completo, los README y el timetable.json. Propuso partir del skeleton de NotesBySubject y copiar módulos de SnapSplit. Dio el contexto teórico por fila (A1–A10) y la lista de archivos de trabajo. Detectó que faltan las Guías S5–S12, que no hay repo ni carpeta C:\Android y que Git no tiene nombre ni email configurados. Hizo 5 preguntas antes de empezar.

## NBS-03

- **Date and time:** 2026-10-30
- **Author:** Carolina
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** prompts_borrador.md (este borrador)
- **Result:** accepted
- **How I checked it:** (pendiente)

### Prompt

En cuanto al SnapSplit tu centrate en lo que esta ya completo y terminado. Antes de responder a las preguntas, queiro que me digas si es posible tener esta conversacion de claude code en dos ordenadores y cuentas distintas (la otra persona tb tiene claude enterprise como yo) si es posible dime como lo hacemos, sino seguimos.

### What happened

Claude explicó que una sesión de Claude Code no se comparte en directo entre dos cuentas, y propuso exportar la conversación (/export) y compartir el contexto a través del repositorio (CLAUDE.md). Creó este borrador del cuaderno.

## NBS-04

- **Date and time:** 2026-10-30
- **Author:** Ana
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** ninguno del proyecto (solo lectura; extrajo los .zip de las sesiones a una carpeta temporal)
- **Result:** accepted
- **How I checked it:** (pendiente)

### Prompt

Bien, de momento trabajamos en esta sesión. El repositorio ya esta creado y estamos las dos compañeras del trabajo metidas como colaboradoras. El nombre del cuaderno mejor que sea el nombre de la app (por ejemplo, NotesBySubject). En cuento al github, se llama NotesBySubject_minorIA, confirmame que puedes acceder a el o si no es necesario que accedas a el pues ya cuando acabemos el proyecto lo vams subiendo nosotras ahi (tu nos tendras que dar los comandos de como hacerlo). Si, podemos usar Gemini si es necesario, asi que si qieres nos das tb los prompts completos que tengamos que meter a gemini (los cuales tb hay que tener en cuenta en el archivo de prompts de entrega del trabajo). Me parece bien qeu empecemos con el skeleton de NotesBySubject pero en cuanto a copiar los modulos de SnapSplit, quiero que te asegures de que el contenido se adapta correctamente a la app de NotesBYSuject. He modificado la carpeta de snapSplit C:\Users\carol\OneDrive\Desktop\Smart Application Programming\SnapSplit para que la tengas as organizada y completa, ahora tienes las sesiones por un lado(con carpetas comprimidas y todo, confirmame que lees todo) y el snapSplit completo por otro lado.

### What happened

Claude leyó la carpeta "SnapSplit Sesiones": 12 PDFs de prácticas (S1–S12) y 13 .zip con el código de inicio de cada sesión, SnapSplit al final de S6 y SnapSplit completo. Comprobó que el .zip completo es idéntico a la carpeta "Solución de la aplicación". Detectó que en el PC no está instalado el CLI de GitHub (gh).

## NBS-05

- **Date and time:** 2026-10-30
- **Author:** Ana
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** ninguno
- **Result:** accepted
- **How I checked it:** (pendiente)

### Prompt

Puedo acceder a esta conversacion de claude code mas adelante,  si salgo y cierro la terminal ?

### What happened

Claude explicó que la conversación se guarda en el PC y se recupera con `claude --continue` o `claude --resume` desde la misma carpeta (C:\Users\carol).

## NBS-06

- **Date and time:** 2026-10-30
- **Author:** Carolina
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** ninguno
- **Result:** accepted
- **How I checked it:** (pendiente)

### Prompt

que paso de comandos necesito hacer cuando quiera volver a acceder a etsa conversacion?

### What happened

Claude dio los pasos: abrir la terminal, `cd C:\Users\carol` y `claude --resume` (o `claude --continue`).

## NBS-07

- **Date and time:** 2026-11-06
- **Author:** Carolina
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** prompts/NotesBySubject.md (nuevo), CLAUDE.md (nuevo)
- **Result:** accepted
- **How I checked it:** (rellenar)

### Prompt

Ignora lo de que haya dos personas con distintos files para prompts, solo vamos a hacer uno archivo, pero lo adaptaremos para poner que prompt ha hecho cada una (acuerdate de poner author en cada pompt y ya lo rellenamos nosotras).Muy importante que nos vayas dando los comandos necesarios. Guardame los cambios en la carpeta del proyecto (C:\Users\carol\OneDrive\Desktop\Smart Application Programming\Trabajo Final). Si necesitas algo mas para empezar pregunta.

### What happened

Claude pasó el borrador al cuaderno único `prompts/NotesBySubject.md`, con el campo Author en cada entrada para rellenarlo a mano, y creó `CLAUDE.md` con el contexto del proyecto. Avisó de que la ruta en OneDrive es demasiado larga para compilar (Windows tiene desactivadas las rutas largas) y preguntó dónde compilar.
## NBS-08

- **Date and time:** 2026-11-06
- **Author:** Ana
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** todo el skeleton copiado a C:\Android\NotesBySubject
- **Result:** (rellenar)
- **How I checked it:** (rellenar)

### Prompt

Me parece bien todo, trabaja en la carpeta  C:\Android\NotesBySubject. Creo que la url del repo es esta: https://github.com/carolinahervas2-ops/NotesBySubject_MinorIA.git, solo esta subido el README.md, no hay nada mas. Ya he hecho lo de git en mi terminal, mi compañera (Ana) va a trabajar conmigo asi que solo usaremos este ordenador. Mas adelante te pediremos ayuda por si queremos meter el proyecto en su ordenador. SIgue con el proyecto

### What happened

Claude comprobó la configuración de Git (nombre y email ya puestos). No pudo leer el repositorio desde su terminal ("Repository not found", porque el repo es privado y su terminal no puede pedir credenciales), así que pidió que lo clonáramos nosotras en C:\Android\NotesBySubject. Después copió dentro el skeleton y el cuaderno y preparó el primer commit.
## NBS-09

- **Date and time:** 2026-11-06
- **Author:** Carolina
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** todo el skeleton (primer commit), README.md, CLAUDE.md, prompts/NotesBySubject.md
- **Result:** accepted
- **How I checked it:** git status muestra todos los archivos del skeleton listos para el commit; (rellenar: el proyecto abre y la app se ejecuta en el emulador)

### Prompt

A ver prueba ahora que he cambiado el repo a publico

### What happened

Con el repo público, Claude lo clonó en C:\Android\NotesBySubject. El repo solo tenía un README.md, que era el del skeleton con un título añadido. Copió encima el skeleton completo con su README original, CLAUDE.md y este cuaderno, y dejó los archivos preparados (git add) para que hagamos nosotras el commit y el push.
## NBS-10

- **Date and time:** 2026-11-06
- **Author:** Ana
- **Tool:** Claude Code (Opus 5.5)
- **Files touched:** prompts/NotesBySubject.md
- **Result:** accepted
- **How I checked it:** git log muestra el commit 9d2fa4c

### Prompt

Dime los pasos en orden, acabo de poner git commit -m "NBS-09 Add the skeleton, the prompt logbook and CLAUDE.md", y me has dicho que cambiemos los nombres del archivo prompts/NotesBySubject, una vez los cambie que hago?

### What happened

Claude comprobó que el commit NBS-09 se había creado bien. Aclaró que no hay que cambiar el nombre del archivo, solo rellenar el campo Author de cada entrada, y dio los comandos en orden: guardar, git add, git commit, git push.