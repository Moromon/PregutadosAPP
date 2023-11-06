package com.example.apptrivial

data class Question(
    val question: String, // El texto de la pregunta
    val options: List<String>, // Lista de opciones de respuesta
    val correctAnswer: Int, // El índice de la respuesta correcta en la lista de opciones

)


val questionsTema1 = listOf(
    Question(
        "¿Cuál de estos personajes es el famoso fontanero de Nintendo?",
        listOf("Link", "Donkey Kong", "Sonic", "Mario"),
        3
    ),
    Question(
        "¿Qué juego de rompecabezas presenta un cubo mágico llamado Rubik?",
        listOf("Tetris", "Pac-Man", "Space Invaders", "Rubik's Cube"),
        3,

    ),
    Question(
        "¿Qué juego popular presenta bloques que caen desde la parte superior de la pantalla?",
        listOf("Minecraft", "Tetris", "Pong", "Super Mario Bros."),
        1,

    ),
    Question(
        "¿Cuál es el enemigo principal en el juego 'Pac-Man'?",
        listOf("Fantasmas", "Monedas", "Hongos", "Aliens"),
        0,

    ),
    Question(
        "¿En qué juego debes recolectar anillos dorados y enfrentarte a un malvado doctor llamado Robotnik?",
        listOf("Sonic the Hedgehog", "Street Fighter II", "Final Fantasy", "Pac-Man"),
        0,

    ),
    Question(
        "¿Cuál es el nombre del mundo ficticio donde ocurren los juegos de 'The Legend of Zelda'?",
        listOf("Mushroom Kingdom", "Hyrule", "Kanto", "Azeroth"),
        1,

    ),
    Question(
        "¿Cuál de estos juegos se desarrolla en un mundo post-apocalíptico lleno de zombis?",
        listOf("Call of Duty", "The Sims", "Resident Evil", "Super Mario Kart"),
        2,

    ),

    Question(
        "¿En qué juego puedes construir y explorar un mundo abierto de bloques?",
        listOf("The Sims", "SimCity", "Minecraft", "RollerCoaster Tycoon"),
        2,

    ),
    Question(
        "¿Qué personaje de videojuego es conocido por comer fantasmas en un laberinto?",
        listOf("Link", "Sonic", "Pac-Man", "Luigi"),
        2,

    ),

    Question(
        "¿Cuál de estos juegos es un MMORPG (juego de rol en línea multijugador masivo)?",
        listOf("The Elder Scrolls: Skyrim", "Dark Souls", "World of Warcraft", "Bioshock"),
        2,

    ),

    Question(
        "¿Cuál de estos juegos se lanzó primero y es considerado uno de los primeros juegos de plataformas?",
        listOf("Super Mario Bros.", "Donkey Kong", "Mega Man", "Metroid"),
        1,

    ),
    Question(
        "¿Cuál es el nombre del protagonista en la serie de juegos 'The Witcher'?",
        listOf("Gandalf", "Geralt", "Gordon Freeman", "Gollum"),
        1,

    ),
    Question(
        "¿Cuál de estos juegos de estrategia en tiempo real desarrollada por Blizzard?",
        listOf("StarCraft", "Civilization", "Age of Empires", "Command & Conquer"),
        0,

    ),
    Question(
        "¿Cuál es el género de juegos de 'League of Legends'?",
        listOf(
            "FPS",
            "MOBA",
            "Juego de carreras",
            "Juego de lucha"
        ),
        1,

    ),
    Question(
        "¿Qué juego de rol (RPG) presenta un mundo post-apocalíptico y un personaje llamado Vault Dweller?",
        listOf("Final Fantasy VII", "Fallout", "The Elder Scrolls: Oblivion", "Dark Souls"),
        1,

    ),
    Question(
        "¿Cuál de estos juegos de lucha presenta un torneo llamado 'The King of Iron Fist Tournament'?",
        listOf("Super Smash Bros.", "Mortal Kombat", "Tekken", "Street Fighter II"),
        2,

    ),
    Question(
        "¿En qué juego puedes asumir el papel de un conductor de camiones y recorrer Europa entregando mercancías?",
        listOf(
            "Euro Truck Simulator 2",
            "Grand Theft Auto V",
            "Forza Horizon 4",
            "Burnout Paradise"
        ),
        0,

    ),
    Question(
        "¿Cuál es el nombre del científico que protagoniza la serie de juegos 'Half-Life'?",
        listOf("Dr. Octavius", "Dr. Kleiner", "Dr. Freeman", "Dr. Wallace Breen"),
        2,

    ),
    Question(
        "¿Qué se desarrolla en un mundo de fantasía y presenta personajes como orcos, elfos y dragones?",
        listOf(
            "Mass Effect",
            "The Legend of Zelda",
            "Dragon Age: Inquisition",
            "Grand Theft Auto V"
        ),
        2,

    ),

    Question(
        "¿Cuál de estos juegos fue creado por Hideo Kojima?",
        listOf("Metal Gear Solid", "Final Fantasy VII", "The Witcher 3", "Dark Souls"),
        0,

    ),

    Question(
        "¿Cuál es el nombre del juego de rol (RPG) que popularizó la serie 'Final Fantasy'?",
        listOf("Final Fantasy I", "Final Fantasy IV", "Final Fantasy VII", "Final Fantasy X"),
        0,

    ),
    Question(
        "¿En qué juego los jugadores pueden construir y gestionar su propio parque de atracciones?",
        listOf("RollerCoaster Tycoon", "Minecraft", "SimCity", "The Sims"),
        0,

    ),
    Question(
        "¿Cuál es el nombre del juego en el que los jugadores pueden diseñar y gestionar su propia ciudad?",
        listOf("SimCity", "Cities: Skylines", "Civilization", "The Sims"),
        0,

    ),
    Question(
        "¿En qué juego los jugadores pueden explorar un vasto mundo de fantasía lleno de dragones y aventuras épicas?",
        listOf(
            "The Witcher 3",
            "Elder Scrolls V: Skyrim",
            "Dragon Age: Inquisition",
            "Mass Effect"
        ),
        1,

    ),
    Question(
        "¿Cuál de estos FPS se desarrolla en un mundo de ciencia ficción y presenta un arsenal de armas futuristas?",
        listOf("Half-Life", "Bioshock", "Destiny", "Halo"),
        3,

    ),
    Question(
        "¿En qué año se lanzó el juego 'The Last of Us Part II'?",
        listOf("2018", "2019", "2020", "2021"),
        2,

    ),

    Question(
        "En el juego 'Cyberpunk 2077', ¿quién interpreta al personaje Johnny Silverhands?",
        listOf(
            "Keanu Reeves",
            "Tom Hardy",
            "Leonardo DiCaprio",
            "No está basado en una persona real"
        ),
        0,

    ),

    Question(
        "¿Cuál de los siguientes juegos se centra en la exploración de un planeta alienígena y la construcción de bases?",
        listOf(
            "Mass Effect: Andromeda",
            "Subnautica",
            "The Witcher 3: Wild Hunt",
            "Red Dead Redemption 2"
        ),
        1,

    ),

    Question(
        "En 'Sekiro: Shadows Die Twice', ¿cuál es la principal arma del protagonista?",
        listOf("Espada", "Hacha", "Lanza", "Kusarigama"),
        0,

    ),


    Question(
        "En el juego 'Ghost of Tsushima', ¿cuál es el nombre del protagonista samurái?",
        listOf("Ryoma", "Takashi", "Jin Sakai", "Kazuki"),
        2,

    ),

    Question(
        "¿Cuál de los siguientes juegos es un juego de rol de mundo abierto con elementos de vikingos?",
        listOf(
            "The Elder Scrolls V: Skyrim",
            "Assassin's Creed Valhalla",
            "The Legend of Zelda: Breath of the Wild",
            "Red Dead Redemption 2"
        ),
        1,

    ),

    Question(
        "En 'Death Stranding', ¿quién interpreta al personaje principal, Sam Bridges?",
        listOf("Norman Reedus", "Mads Mikkelsen", "Guillermo del Toro", "Troy Baker"),
        0,

    ),

    Question(
        "¿Qué juego de plataformas en 2D lanzado en 2018 protagoniza un personaje llamado Madeline que debe escalar una montaña?",
        listOf("Celeste", "Hollow Knight", "Cuphead", "Hades"),
        0,

    ),

    Question(
        "En el juego 'Valorant', ¿cuál es el objetivo principal del equipo atacante?",
        listOf(
            "Plantar la bomba",
            "Rescatar rehenes",
            "Eliminar al equipo contrario",
            "Conseguir el mayor número de bajas"
        ),
        0,

    ),
    Question(
        "¿Qué popular juego indie de supervivencia y construcción de bases fue desarrollado por Klei Entertainment?",
        listOf("Terraria", "Stardew Valley", "Don't Starve", "Celeste"),
        2,

    ),

    Question(
        "En el juego indie 'Hollow Knight', ¿cuál es el nombre del protagonista?",
        listOf("Hornet", "Silk Song", "Knight", "Grub"),
        2,

    ),

    Question(
        "¿Cuál de los siguientes juegos independientes se centra en un mundo postapocalíptico con mecánicas de supervivencia y construcción?",
        listOf("Inside", "The Witness", "The Forest", "Firewatch"),
        2,

    ),

    Question(
        "En el juego indie 'Undertale', ¿cuál es el nombre del personaje principal que los jugadores controlan?",
        listOf("Sans", "Papyrus", "Frisk", "Chara"),
        2,

    ),

    Question(
        "En 'Celeste', un juego indie de plataformas, ¿cuál es el objetivo principal de la protagonista Madeline?",
        listOf(
            "Conquistar un castillo",
            "Escalar una montaña",
            "Encontrar tesoros",
            "Rescatar a un príncipe"
        ),
        1,

    ),


    Question(
        "En el juego indie 'Cuphead', ¿cuál es el nombre de los dos hermanos protagonistas que deben derrotar a jefes desafiantes?",
        listOf("Mickey y Minnie", "Mario y Luigi", "Cuphead y Mugman", "SpongeBob y Patrick"),
        2,

    ),

    Question(
        "¿Cuál es el nombre del desarrollador independiente detrás del juego 'Super Meat Boy'?",
        listOf("Team Meat", "Studio MDHR", "Double Fine Productions", "Heart Machine"),
        0,

    ),

    Question(
        "En el juego indie 'Braid', ¿cuál es el principal elemento de jugabilidad relacionado con el tiempo?",
        listOf(
            "Controlar la gravedad",
            "Viajar en el tiempo",
            "Cambio de forma del personaje",
            "Rompecabezas basados en música"
        ),
        1,

    ),
)

val questionsTema2 = listOf(
    Question(
        "¿Cuál fue el primer videojuego comercialmente exitoso?",
        listOf("Pong", "Space Invaders", "Tetris", "Pac-Man"),
        0,

    ),
    Question(
        "¿Qué consola ayudó a revivir la industria de los videojuegos después de la crisis de 1983?",
        listOf("NES", "Atari 2600", "Sega Genesis", "PlayStation"),
        0,

    ),
    Question(
        "¿Cuál fue el primer videojuego en presentar gráficos en 3D?",
        listOf("Pong", "Donkey Kong", "Spacewar!", "Battlezone"),
        3,

    ),
    Question(
        "¿En qué año se lanzó el juego 'Super Mario Bros.' de Nintendo?",
        listOf("1983", "1985", "1990", "1992"),
        1,

    ),
    Question(
        "¿Cuál fue el primer juego de rol (RPG) ampliamente conocido?",
        listOf("The Legend of Zelda", "Final Fantasy", "Dragon Quest", "Diablo"),
        2,

    ),
    Question(
        "¿Cuál de los siguientes juegos popularizó el género de los juegos de disparos en primera persona (FPS)?",
        listOf("Doom", "Sonic the Hedgehog", "Street Fighter II", "Super Mario Bros."),
        0,

    ),
    Question(
        "¿En qué año se lanzó el juego 'Pac-Man' de Namco?",
        listOf("1978", "1980", "1982", "1984"),
        1,

    ),
    Question(
        "¿Cuál fue el primer juego de arcade de gran éxito que presentaba una mecánica de juego de plataforma?",
        listOf("Donkey Kong", "Space Invaders", "Galaga", "Centipede"),
        0,

    ),
    Question(
        "¿Quién creó el juego de aventuras 'The Legend of Zelda'?",
        listOf("Shigeru Miyamoto", "Hideo Kojima", "Yuji Naka", "Tim Schafer"),
        0,

    ),
    Question(
        "¿Cuál es el juego que a menudo se considera como el primer juego de rol (RPG) de acción?",
        listOf("The Legend of Zelda", "Final Fantasy", "Dragon Quest", "Diablo"),
        0,

    ),
    Question(
        "¿Cuál fue el primer juego en utilizar la técnica del 'scrolling' para permitir desplazamiento lateral en un videojuego?",
        listOf("Defender", "Donkey Kong", "Pac-Man", "Frogger"),
        1,

    ),
    Question(
        "¿En qué año se lanzó la consola Sega Genesis (Mega Drive en Europa)?",
        listOf("1985", "1988", "1991", "1993"),
        2,

    ),
    Question(
        "¿Cuál fue el primer videojuego en presentar una historia narrativa significativa?",
        listOf("Space Invaders", "Pong", "Adventure", "Asteroids"),
        2,

    ),
    Question(
        "¿Quién creó el juego 'Space Invaders'?",
        listOf("Shigeru Miyamoto", "Toru Iwatani", "Hideo Kojima", "Yu Suzuki"),
        1,

    ),
    Question(
        "¿Cuál fue el primer juego en utilizar el 'modem' para el juego en línea?",
        listOf("Doom", "Quake", "Wolfenstein 3D", "Pong"),
        0,

    ),
    Question(
        "¿Qué compañía lanzó la consola Atari 2600?",
        listOf("Atari", "Nintendo", "Sega", "Sony"),
        0,

    ),
    Question(
        "¿En qué año se lanzó el juego 'Tetris' de Alexey Pajitnov?",
        listOf("1980", "1984", "1989", "1991"),
        1,

    ),
    Question(
        "¿Qué juego popularizó el género de las aventuras gráficas en la década de 1980?",
        listOf("Maniac Mansion", "Mega Man", "Metroid", "Mortal Kombat"),
        0,

    ),
    Question(
        "¿Quién fue el creador del juego 'Super Mario Bros.'?",
        listOf("Yuji Naka", "Hideo Kojima", "Shigeru Miyamoto", "Tim Schafer"),
        2,

    ),
    Question(
        "¿Cuál de estos juegos de rol (RPG) se lanzó primero?",
        listOf(
            "Final Fantasy",
            "Dragon Quest",
            "The Elder Scrolls: Arena",
            "Diablo"
        ),
        1,

    ),
    Question(
        "¿En qué año se lanzó el juego 'Sonic the Hedgehog' de Sega?",
        listOf("1985", "1989", "1991", "1993"),
        1,

    ),
    Question(
        "¿Cuál fue el primer juego de la serie 'Metal Gear' creado por Hideo Kojima?",
        listOf(
            "Metal Gear Solid",
            "Metal Gear",
            "Metal Gear 2",
            "Metal Gear Solid 3"
        ),
        1,

    ),
    Question(
        "¿Qué consola se lanzó en 1994 y popularizó los juegos en 3D?",
        listOf(
            "SNES",
            "Sega Saturn",
            "Sony PlayStation",
            "Sega Genesis (Mega Drive)"
        ),
        2,

    ),
    Question(
        "¿Cuál de estos juegos fue lanzado primero?",
        listOf("'Street Fighter II'", "'Mortal Kombat'", "'Tekken'", "'Super Smash Bros.'"),
        0,

    ),
    Question(
        "¿Qué compañía desarrolló la serie de juegos 'The Elder Scrolls'?",
        listOf("Bethesda Game Studios", "BioWare", "Square Enix", "Blizzard Entertainment"),
        0,

    ),
    Question(
        "¿Cuál fue el primer juego de rol (RPG) de acción en la serie 'Final Fantasy'?",
        listOf("Final Fantasy I", "Final Fantasy IV", "Final Fantasy VII", "Final Fantasy X"),
        1,

    ),
    Question(
        "¿Cuál de estos juegos se lanzó primero?",
        listOf("'Resident Evil'", "'Silent Hill'", "'Alone in the Dark'", "'Dead Space'"),
        2,

    ),
    Question(
        "¿Qué juego popularizó el género de los juegos de construcción y simulación?",
        listOf("The Sims", "SimCity", "Minecraft", "RollerCoaster Tycoon"),
        1,

    ),
    Question(
        "¿Cuál de estos juegos se lanzó primero?",
        listOf("'Half-Life'", "'Quake'", "'Doom'", "'Unreal'"),
        2,

    ),
    Question(
        "¿En qué año se lanzó el juego 'Donkey Kong' de Nintendo?",
        listOf("1979", "1981", "1983", "1985"),
        1,

    ),
    Question(
        "¿Cuál de los siguientes juegos popularizó el género de los juegos de aventuras gráficas?",
        listOf("Maniac Mansion", "Mega Man", "Metroid", "Mortal Kombat"),
        0,

    ),
    Question(
        "¿Quién creó el juego 'Pong'?",
        listOf("Toru Iwatani", "Shigeru Miyamoto", "Hideo Kojima", "Nolan Bushnell"),
        3,

    ),
    Question(
        "¿Cuál de los siguientes juegos popularizó el género de los juegos de lucha?",
        listOf("Street Fighter II", "Sonic the Hedgehog", "Doom", "Super Mario Bros."),
        0,

    ),
    Question(
        "¿En qué año se lanzó el juego 'Asteroids' de Atari?",
        listOf("1973", "1975", "1979", "1981"),
        2,

    ),
    Question(
        "¿Cuál fue el primer videojuego en presentar una mecánica de juego de disparos?",
        listOf("Spacewar!", "Pong", "Adventure", "Tetris"),
        0,

    ),
    Question(
        "¿Quién creó el juego 'Adventure' para la consola Atari 2600?",
        listOf("Toru Iwatani", "Shigeru Miyamoto", "Warren Robinett", "Hideo Kojima"),
        2,

    ),
    Question(
        "¿Cuál de los siguientes juegos popularizó el género de los juegos de carreras en perspectiva cenital (top-down)?",
        listOf("Gran Turismo", "Super Mario Kart", "Micro Machines", "Need for Speed"),
        2,

    ),
    Question(
        "¿En qué año se lanzó el juego 'Doom' de id Software?",
        listOf("1990", "1992", "1993", "1995"),
        2,

    ),
    Question(
        "¿Cuál fue el primer videojuego en presentar una 'pantalla de carga' antes de jugar?",
        listOf("Pong", "Space Invaders", "Pac-Man", "Dragon's Lair"),
        3,

    ),
    Question(
        "¿Qué juego popularizó el género de los juegos de estrategia en tiempo real (RTS)?",
        listOf("StarCraft", "Age of Empires", "Civilization", "Command & Conquer"),
        3,

    ),
)

val questionsTema3 = listOf(
    Question(
        "¿Qué consola de videojuegos lanzó Sony en 1994?",
        listOf("PlayStation", "Sega Genesis", "Nintendo 64", "Atari 2600"),
        0,

    ),

    Question(
        "¿Cuál de estas consolas es conocida por su controlador con un joystick y un botón de disparo único?",
        listOf("Atari 2600", "Sega Saturn", "Xbox One", "PlayStation 4"),
        0,

    ),

    Question(
        "¿Qué consola ayudó a revivir la industria de los videojuegos después de la crisis de 1983?",
        listOf(
            "NES",
            "Super Nintendo (SNES)",
            "Nintendo 64",
            "GameCube"
        ),
        0,

    ),

    Question(
        "¿Cuál de las siguientes consolas fue la primera en presentar un lector de discos ópticos?",
        listOf("PlayStation", "Sega Genesis", "Nintendo 64", "Atari 2600"),
        0,

    ),

    Question(
        "¿Qué consola de Microsoft se lanzó en 2001 para competir con PlayStation 2 y GameCube?",
        listOf("Xbox", "Xbox 360", "Xbox One", "Xbox Series X"),
        0,

    ),

    Question(
        "¿Cuál de las siguientes consolas de Nintendo presentó un controlador con pantalla táctil?",
        listOf("Nintendo Switch", "Wii U", "Game Boy Advance", "Super Nintendo (SNES)"),
        1,

    ),

    Question(
        "¿Cuál de estas consolas de Sony se lanzó en 2000 y presentaba un lector de discos miniDVD?",
        listOf("PlayStation 2", "PlayStation 3", "PlayStation 4", "PlayStation 5"),
        0,

    ),

    Question(
        "¿Cuál fue la primera consola de Sega en presentar gráficos en 3D?",
        listOf("Sega Saturn", "Sega Genesis", "Dreamcast", "Sega CD"),
        2,

    ),

    Question(
        "¿Cuál consola portátil de Nintendo se lanzó en 1989 y fue la primera en presentar una pantalla a color?",
        listOf("Game Boy", "Game Boy Color", "Game Boy Advance", "Nintendo DS"),
        1,

    ),

    Question(
        "¿Qué consola de Sony se lanzó en 2013 y presentó una cámara que rastreaba el movimiento?",
        listOf("PlayStation 3", "PlayStation 4", "PlayStation 5", "PlayStation Vita"),
        1,

    ),


    Question(
        "¿Qué consola de Sega se lanzó en 1999 y fue la última en su línea de consolas domésticas?",
        listOf("Sega Genesis", "Sega Saturn", "Sega Dreamcast", "Sega Master System"),
        2,

    ),

    Question(
        "¿Qué consola es considerada como una de las primeras consolas de videojuegos en la historia?",
        listOf("Atari 2600", "Odyssey", "ColecoVision", "Magnavox Odyssey"),
        3,

    ),

    Question(
        "¿Cuál fue la primera consola de Nintendo en presentar un sistema de realidad virtual?",
        listOf("Virtual Boy", "Game Boy Advance", "Nintendo DS", "Wii U"),
        0,

    ),

    Question(
        "¿Cuál de las siguientes consolas fue lanzada por SNK y era conocida por su extenso catálogo de juegos de lucha?",
        listOf("Neo Geo", "Sega Saturn", "TurboGrafx-16", "ColecoVision"),
        0,

    ),

    Question(
        "¿Cuál fue la primera consola en presentar un lector de Blu-ray y se lanzó en 2006?",
        listOf("PlayStation 3", "PlayStation 4", "Xbox 360", "Xbox One"),
        0,

    ),

    Question(
        "¿Cuál de las siguientes consolas tenia un accesorio llamado '32X' para mejorar los gráficos y el rendimiento?",
        listOf("Sega CD", "Sega Saturn", "Sega Genesis", "Sega Dreamcast"),
        2,

    ),

    Question(
        "¿Qué consola se lanzó en 1995 y fue conocida por su soporte para gráficos en 2D y 3D?",
        listOf("PlayStation", "Sega Saturn", "Nintendo 64", "Atari Jaguar"),
        1,

    ),

    Question(
        "¿Cuál fue la primera consola de Sony en presentar un disco duro incorporado y se lanzó en 2000?",
        listOf("PlayStation 2", "PlayStation 3", "PlayStation 4", "PlayStation 5"),
        0,

    ),

    Question(
        "¿Qué consola se lanzó en 1998 y fue conocida por su capacidad de juego en línea a través de un módem?",
        listOf("Nintendo 64", "Sega Dreamcast", "PlayStation 2", "Xbox"),
        1,

    ),
    Question(
        "¿Cuál de las siguientes consolas se lanzó primero en la década de 1970?",
        listOf("Atari 2600", "Super Nintendo", "PlayStation", "Xbox One"),
        0,

    ),

    Question(
        "En la serie de juegos 'The Legend of Zelda', ¿cuál es el nombre del personaje principal?",
        listOf("Ganondorf", "Link", "Zelda", "Ganon"),
        1,

    ),

    Question(
        "¿Cuál es el nombre del fontanero italiano que protagoniza la serie de juegos de Nintendo?",
        listOf("Luigi", "Bowser", "Mario", "Yoshi"),
        2,

    ),

    Question(
        "¿Cuál es el juego más vendido de todos los tiempos?",
        listOf("Minecraft", "Tetris", "GTA5", "Fortnite"),
        1,

    ),

    Question(
        "En la serie 'Metal Gear Solid', ¿quién es el creador y director de los juegos?",
        listOf("Hideo Kojima", "Shigeru Miyamoto", "Tim Schafer", "Todd Howard"),
        0,

    ),

    Question(
        "¿Cuál de las siguientes consolas fue la primera en introducir el formato de cartuchos intercambiables?",
        listOf("Atari 2600", "Sega Genesis", "Super Nintendo", "PlayStation"),
        0,

    ),

    Question(
        "En 'The Witcher 3: Wild Hunt', ¿cuál es el nombre del protagonista?",
        listOf("Geralt of Rivia", "Ciri", "Yennefer", "Triss"),
        0,

    ),

    Question(
        "¿Cuál es el nombre de la inteligencia artificial que ayuda al protagonista en el juego 'Halo'?",
        listOf("Cortana", "Siri", "Alexa", "GLaDOS"),
        0,

    ),

    Question(
        "¿En qué año se lanzó la primera consola Xbox de Microsoft?",
        listOf("2000", "2001", "2002", "2003"),
        0,

    ),

    Question(
        "En la serie de juegos 'Pokémon', ¿cuál es el nombre del primer Pokémon en la Pokédex nacional?",
        listOf("Charmander", "Pikachu", "Bulbasaur", "Rattata"),
        2,

    ),
    Question(
        "¿En qué año se lanzó el juego 'Pac-Man' de Namco?",
        listOf("1978", "1980", "1982", "1985"),
        1,

    ),


    Question(
        "En el juego 'Tetris', ¿cuál es el nombre del creador ruso que diseñó el juego?",
        listOf("Shigeru Miyamoto", "Alexey Pajitnov", "Will Wright", "Hideo Kojima"),
        1,

    ),


    Question(
        "¿Cuál de los siguientes juegos de arcade se caracterizaba por su laberinto y un personaje llamado 'Pac-Man'?",
        listOf("Asteroids", "Space Invaders", "Pong", "Pac-Man"),
        3,

    ),

    Question(
        "En el juego 'Super Mario Bros.', ¿cuál es el nombre del personaje principal que debe rescatar a la princesa Peach?",
        listOf("Luigi", "Bowser", "Toad", "Mario"),
        3,

    ),

    Question(
        "En el juego 'Frogger', ¿cuál es el objetivo del jugador?",
        listOf(
            "Nadar en un río",
            "Saltar troncos y vehículos",
            "Escapar de una cueva",
            "Construir una ciudad"
        ),
        1,

    ),

)