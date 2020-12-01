# Ejericios Android

**Por:** Jhonathan Pizarra\
**Asignatura:** Tópicos Especiales\
**Facultad:** ESFOT\
**Descripción:**\
En este caso he creado una aplicación Andorid en la cuál se incuye todo lo visto en clase, y adeicinalemnte abarca nuevos elementos, los cuales me han sido asignados y están en el libro "Manual Báscio Andorid Studio", el app incluye:
* #18 Layout 
* #25 Reproducción de audio 
* #31 Dibujar: pintar fondo y dibujar líneas 
* #46 Componente ActionBar (Ocultarlo y mostrarlo) 

*Además se cuenta con*:
* Icono
* SplashScreen
* Registro con Firebase
* Login con autenticación  (Creedenciales: correo = jhonathan-xabier@chidori.com  - contraseña = 123456)
* Dinamic Images
* Responsive Design
* Input controll
* Personalización

***Explicación de lo realizado:***\
Consiste un juego que muestra un Animal Cartoon, se solicita que escribas su nombre y marcará con un "Check" o un "Wrong" dependiendo de tu respuesta. Asegúrate de escribir bien el nombre del animalito.\
(+)Luego pasará a otra imagen aleatoria, y se repite el proceso. (Ejercicio #18)\
(+)Para ayuda al jugador, se presenta un cuadro con opción a reproducir audio (Ejercicio #25)\
(+)Existe un total de 10 animales, los más dificiles de que aparezcan son en Lobo y el Búho, si se te aparecen, siéntete afortunado! (Ejercicio #31)\
(+)Por último, para salir del juego hay una menu overflow en el ActionBar, que se muestra o parmanece oculto dependiendo de lo que quiera hacer el usuario (Ejercicio #46)

Para el desarollo se procedió primero por la creación de los "Frames" del Registro y de "Login" con ayuda de Firebase, usé "input de tipo hint" para guiar al usuario en su registro o inicio de sesión\
Luego por medio de "buttons" se inicia una acción como gracias a su método "onClick", el cual llama a alguna función del "Activity"; las acciones más comunes asosiadas a estos botones, son el paso de un frame, a otro, pero también ocurren ahí validaciones (que si el campo está vacío, que si escribió bien un mail, que si escribió bien el nombre de un animal..etc)

Como parte de la interacción con el usuario además tenemos sonidos, los cuales mediante la clase MediaPlayer son utilizados en esta aplicación. Algo curioso de estos sonidos es que Andorid no tolera que el nombre de estos tengan una mayúscula, es decir, si tu archivo se llama  tigerRoar.mp3, o TigerRoar.mp3, o Tigerroar.mp3, no funcionará, siempre de los siempres, para usar sonidos en Andorid debes mantenerlos en minúsculas y alojados en una carpeta de nombre "raw" que igual siempre de los siempres debe tener ese nombre y esa característica: estar escríto en minúsculas.

Para las imágenes es la misma historia, la diferencia es que estas estarán alojadas en la carpeta "drawable"\
Para mostrar imágenes dinámicas utilizamos numeros aleatorios, y mediante la clase Math y el método random variamos en números del 0 al 10, con ese número aleatorio ya solo quedaba asociarlo a una imagen, y pintarlo en el ImageView como tal.\
Para esta parte y la del sonido o usamos una serie de condiciones qeu nos permitían establcer, en base al número aleatorio, el sonido que debía escucharse si se presionaba el botón "play" y la imágen que debía pintarse de forma aleatoria.

Por último tenemos iconos y splashscreen, esos modifiqué algunas etiquetas en el archivo .Manifest, y referenciaba a imágenes de mi proyecto. El resto podría decirse que fue carpinteria, y diseño.

Fue un deber muy chévere, me divertí mucho haciéndolo, y sé que se puede mejorar, incorporar nuevas cosas, así que seguiré trabajando en él conforme aprenda cosas nuevas en las clases de Tópicos Especiales.\
Gracias... Totales

2020-A
