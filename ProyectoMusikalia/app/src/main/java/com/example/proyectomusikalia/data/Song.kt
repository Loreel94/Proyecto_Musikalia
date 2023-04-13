package com.example.proyectomusikalia.data

import androidx.annotation.DrawableRes
import com.example.proyectomusikalia.R

data class Song(
    val name: String,
    val artist: String,
    val album: String,
    val year: Int,
    @DrawableRes val imageResourceId: Int,
    val lyrics: String,
    val meaning: String
)

val songBandaSonora = listOf (
    Song("'Casablanca' As Time Goes By", "Dooley Wilson", "Original Motion Picture Soundtrack", 1942, R.drawable.casablanca, "You must remember this\n" +
                "A kiss is still a kiss\n" +
                "A sigh is just a sigh\n" +
                "The fundamental things apply\n" +
                "As time goes by\n" +
                "\n" +
                "And when two lovers woo\n" +
                "They still say, \"I love you.\"\n" +
                "On that you can rely\n" +
                "No matter what the future brings\n" +
                "As time goes by\n" +
                "\n" +
                "\n" +
                "Moonlight and love songs are never out of date\n" +
                "Hearts full of passion, jealousy and hate\n" +
                "Woman needs man and man must have his mate\n" +
                "That no one can deny\n" +
                "\n" +
                "It's still the same old story\n" +
                "A fight for love and glory\n" +
                "A case of do or die\n" +
                "The world will always welcome lovers\n" +
                "As time goes by\n" +
                "\n" +
                "Moonlight and love songs are never out of date\n" +
                "Hearts full of passion, jealousy and hate\n" +
                "Womans need man and man must have his mate\n" +
                "That no one can deny\n" +
                "\n" +
                "It's still the same old story\n" +
                "A fight for love and glory\n" +
                "A case of do or die\n" +
                "The world will always welcome lovers\n" +
                "As time goes by", "El sentido simbólico de \"As Time Goes By\" es el poder del amor y el recuerdo en nuestras vidas. La letra de la canción habla de un amor que ha resistido el paso del tiempo y que sigue siendo fuerte y vibrante, a pesar de las dificultades y los obstáculos que la vida ha presentado. La canción sugiere que, aunque el tiempo puede pasar y las cosas pueden cambiar, el amor verdadero siempre será una fuerza poderosa que puede superar cualquier adversidad.\n" +
                "\n" +
                "Además, la canción también es un recordatorio de la importancia de los recuerdos y la nostalgia en nuestras vidas. La letra habla de momentos compartidos y recuerdos que perduran, sugiriendo que nuestros recuerdos pueden mantener vivos nuestros sentimientos de amor y conexión, incluso cuando estamos separados de nuestros seres queridos. En este sentido, la canción es un llamado a valorar nuestros recuerdos y a encontrar consuelo en ellos cuando enfrentamos momentos difíciles.\n" +
                "\n" +
                "En resumen, \"As Time Goes By\" es una canción que simboliza el poder del amor y la importancia de los recuerdos en nuestras vidas. Es una canción que nos recuerda que, aunque las cosas pueden cambiar y el tiempo puede pasar, el amor verdadero y los recuerdos duraderos siempre estarán con nosotros."),
    Song("'Eduardo Manostijera' Ice Dance", "Danny Elfman", "Edward Scissorhands: Original Motion Picture Soundtrack", 1990, R.drawable.icedance, "Instrumental", "La música de la película de Tim Burton, compuesta por Danny Elfman, es uno de los elementos clave de la historia de Eduardo Manostijeras. La canción principal es una pieza instrumental que refleja el sentido de la soledad y la vulnerabilidad del personaje de Edward, con sus manos de tijera. La música también transmite un aire de nostalgia y de melancolía, y se utiliza para crear un ambiente mágico y onírico en la película. En resumen, la banda sonora contribuye a la atmósfera poética y fantástica de la historia de Eduardo Manostijeras."),
    Song("The Good, the Bad and the Ugly (El bueno, el feo y el malo)", "Ennio Morricone", "The Good, the Bad and the Ugly: Original Motion Picture Soundtrack", 1966, R.drawable.el_bueno__el_feo_y_el_malo, "Instrumental", "La música de Ennio Morricone para El bueno, el feo y el malo es icónica y se ha convertido en un símbolo de los westerns spaghetti. La canción principal es una pieza instrumental que utiliza efectos de sonido y una variedad de instrumentos para crear una atmósfera tensa y dramática. La música se utiliza para introducir a los tres personajes principales de la película (el bueno, el feo y el malo) y se repite a lo largo del filme para enfatizar la rivalidad y la tensión entre ellos. La banda sonora contribuye a la estética única de la película y a su reputación como un clásico del género western."),
    Song("The Godfather Waltz", "Nino Rota", "The Godfather: Original Motion Picture Soundtrack", 1972, R.drawable.the_godfather, "Instrumental", "La música de Nino Rota para El Padrino es una de las bandas sonoras más famosas de la historia del cine. La canción principal es un vals que se utiliza para presentar al personaje principal de la película, Don Vito Corleone. La música es evocadora y elegante, pero también sugiere cierta tensión y peligro, lo que refleja la dualidad del personaje de Corleone. La banda sonora también incluye una variedad de otras piezas musicales, algunas de las cuales se utilizan para resaltar momentos dramáticos o emotivos de la trama. En conjunto, la música de El Padrino contribuye a su reputación como una obra maestra del cine y a su estatus como una de las películas más influyentes de la historia."),
    Song("Now We Are Free", "Hans Zimmer, Lisa Gerrard", "Gladiator: Music from the Motion Picture", 2000, R.drawable.gladiator, "(Idioma inventado)\n" +
                "\n" +
                "Anol shalom\n" +
                "Anol sheh lay konnud de ne um\n" +
                "Flavum nom de leesh\n" +
                "Ham de nam um das\n" +
                "La um de Flavne\n" +
                "\n" +
                "We de ze zu bu\n" +
                "We de so a are you\n" +
                "Un va-a pesh a lay\n" +
                "Un vi-I bee\n" +
                "Un da la pech ni sa (ah)\n" +
                "Un di-I lay na day\n" +
                "Un ma la pech a nay\n" +
                "Mee di nu ku\n" +
                "\n" +
                "La la da pa da le na da na, ve va da pa da le na la dumda\n" +
                "\n" +
                "Anol shalom\n" +
                "Anol sheh ley kon-nud de ne um\n" +
                "Flavum, flavum\n" +
                "M-ai shondol-lee flavu\n" +
                "Lof flesh lay nof ne\n" +
                "Nom de lis\n" +
                "Ham de num um dass\n" +
                "La um de flavne\n" +
                "Shom de nomm\n" +
                "Ma-lun des dwondi, dwwoondi\n" +
                "Alas sharum do koos\n" +
                "Shaley koot-tum\n", "La música de Gladiator, compuesta por Hans Zimmer y Lisa Gerrard, es una combinación de sonidos electrónicos modernos y coros y cantos étnicos antiguos. La canción principal, \"Now We Are Free\", es cantada por Gerrard en un idioma ficticio y se utiliza para resaltar momentos emocionales y poderosos de la película. La canción habla sobre la idea de la libertad y la esperanza, lo que refleja la lucha del personaje principal, el general romano Maximus, por encontrar la justicia y la venganza en un mundo corrupto. La música de Gladiator también incluye una variedad de otras piezas, algunas de las cuales se utilizan para resaltar la acción y la aventura de la trama. En conjunto, la banda sonora contribuye a la atmósfera épica y emocional de la película, y ha sido aclamada como una de las mejores bandas sonoras de la historia del cine."),
    Song("Hedwig's Theme", "John Williams", "Harry Potter and the Philosopher's Stone (Original Motion Picture Soundtrack)", 2001, R.drawable.caratula_bso_harry_potter, "Instrumental", "Representa la magia y la aventura de Harry Potter, y se convirtió en la melodía icónica de la saga cinematográfica. Es especialmente asociada con el personaje de Hedwig, la lechuza de Harry, y se utiliza a menudo para introducir escenas de Hogwarts y de los momentos de descubrimiento en la trama."),
    Song("No Time For Caution", "Hans Zimmer", "Interstellar: Original Motion Picture Soundtrack", 2014, R.drawable.interstellar, "Instrumental", "La música de Interstellar, compuesta por Hans Zimmer, es una mezcla de sonidos electrónicos y orquestales. La canción principal, \"No Time for Caution\", se utiliza en una escena clave de la película en la que los astronautas se enfrentan a una situación de vida o muerte. La música es tensa y emocionante, con un sentido de urgencia que refleja la gravedad de la situación. La banda sonora de Interstellar también incluye una variedad de otras piezas, algunas de las cuales se utilizan para resaltar la maravilla y la grandeza del espacio, mientras que otras se utilizan para resaltar momentos emotivos y dramáticos de la trama. En conjunto, la música de Interstellar ayuda a crear una atmósfera épica y emocional que complementa la historia de la película."),
    Song("Theme from Jurassic Park", "John Williams", "Jurassic Park: Original Motion Picture Soundtrack", 1993, R.drawable.jurassic_park, "Instrumental", "La canción principal de la banda sonora de Jurassic Park, compuesta por el legendario compositor John Williams, es una melodía hermosa y emocionante que se ha convertido en un clásico del cine. La música se utiliza para resaltar la maravilla y el asombro que sienten los personajes al ver por primera vez los dinosaurios vivos en la isla. El tema principal también se utiliza en momentos de peligro y acción, a medida que los personajes luchan por sobrevivir en un entorno hostil y peligroso. La banda sonora de Jurassic Park en su conjunto es una obra maestra del cine, con temas inolvidables que ayudan a contar la historia de la película de una manera emocionante y conmovedora."),
    Song("The Pink Panther Theme", "Henry Mancini", "The Pink Panther Soundtrack", 1963, R.drawable.la_pantera_rosa, "Instrumental", "Sentido simbólico de la canción: La Pantera Rosa es una comedia clásica de la década de 1960, conocida por su icónica animación y su famosa canción de apertura, The Pink Panther Theme. Compuesta por Henry Mancini, la canción es un instrumental de jazz ligero y se ha convertido en un icono cultural en sí misma. La melodía es juguetona y divertida, con una sección de viento de bronce muy distintiva y pegajosa. La canción se ha convertido en un símbolo de la película y su personaje principal, el Inspector Clouseau, y se ha utilizado en muchas otras películas y programas de televisión desde entonces."),
    Song("Tara's Theme (Tema de Tara)", "Max Steiner", "Lo que el viento se llevó (Original Soundtrack)", 1939, R.drawable.lo_que_el_viento_se_llev_, "Instrumental", "La canción se convirtió en un icono de la película y en una de las melodías más reconocidas de la historia del cine. Es un tema nostálgico que evoca la emoción, la aventura y el romanticismo de la trama. La música también tiene un fuerte sentido de la continuidad y la duración, simbolizando la persistencia de los personajes y sus luchas a lo largo del tiempo."),
    Song("Tema de Psicosis", "Bernard Herrmann", "Original Soundtrack Recording", 1960, R.drawable.psicosis, "Instrumental", "La banda sonora de Psicosis es famosa por su uso de la música para crear tensión y generar emociones en el espectador. El tema principal, compuesto para la famosa escena de la ducha, es un ejemplo de cómo la música puede ser utilizada para crear un sentido de peligro e inquietud. La composición de Herrmann se ha convertido en un clásico y es reconocida como una de las mejores bandas sonoras de la historia del cine."),
    Song("Star Wars Main Theme", "John Williams", "Original Motion Picture Sounstrack", 1977, R.drawable.starwarsost, "Instrumental", "El tema principal de Star Wars, compuesto por John Williams, es uno de los más icónicos de la historia del cine. Su melodía es utilizada en diversos momentos de la saga, representando la lucha entre el bien y el mal, la aventura y la emoción. La música de Williams ha sido clave para la narrativa de Star Wars y ha logrado trascender la pantalla, convirtiéndose en un símbolo de la cultura pop."),
    Song("Don't You (Forget About Me", "Simple Minds", "The Breakfast Club: Original Motion Picture Soundtrack", 1985, R.drawable.the_breakfast_club, "Hey, hey, hey, hey\n" +
                "Ooh, woah\n" +
                "\n" +
                "Won't you come see about me?\n" +
                "I'll be alone, dancing, you know it, baby\n" +
                "\n" +
                "Tell me your troubles and doubts\n" +
                "Giving everything inside and out and\n" +
                "Love's strange, so real in the dark\n" +
                "Think of the tender things that we were working on\n" +
                "\n" +
                "Slow change may pull us apart\n" +
                "When the light gets into your heart, baby\n" +
                "\n" +
                "Don't you, forget about me\n" +
                "Don't, don't, don't, don't\n" +
                "Don't you, forget about me\n" +
                "\n" +
                "Will you stand above me?\n" +
                "Look my way, never love me\n" +
                "Rain keeps falling, rain keeps falling\n" +
                "Down, down, down\n" +
                "\n" +
                "Will you recognize me?\n" +
                "Call my name or walk on by\n" +
                "Rain keeps falling, rain keeps falling\n" +
                "Down, down, down, down\n" +
                "\n" +
                "Hey, hey, hey, hey\n" +
                "Ooh, woah\n" +
                "\n" +
                "Don't you try and pretend\n" +
                "It's my feeling we'll win in the end\n" +
                "I won't harm you or touch your defenses\n" +
                "Vanity and security, ah\n" +
                "\n" +
                "Don't you forget about me\n" +
                "I'll be alone, dancing, you know it, baby\n" +
                "Going to take you apart\n" +
                "I'll put us back together at heart, baby\n" +
                "\n" +
                "Don't you, forget about me\n" +
                "Don't, don't, don't, don't\n" +
                "Don't you, forget about me\n" +
                "\n" +
                "As you walk on by\n" +
                "Will you call my name?\n" +
                "As you walk on by\n" +
                "Will you call my name?\n" +
                "When you walk away\n" +
                "\n" +
                "Or will you walk away?\n" +
                "Will you walk on by?\n" +
                "Come on, call my name\n" +
                "Will you call my name?\n" +
                "\n" +
                "I say\n" +
                "La, la-la-la-la, la-la-la-la\n" +
                "La-la-la-la-la-la-la-la-la-la\n" +
                "La-la-la-la, la-la-la-la\n" +
                "La-la-la-la-la-la-la-la-la-la\n" +
                "La-la-la-la, la-la-la-la\n" +
                "La-la-la-la-la-la-la-la-la-la\n" +
                "When you walk on by\n" +
                "And you call my name\n" +
                "When you walk on by", "La canción simboliza la sensación de los adolescentes de la época de querer pertenecer a un grupo y la necesidad de ser recordados después de su tiempo en la escuela. Es un himno para todos aquellos que luchan por encontrar su lugar en el mundo y para aquellos que se sienten incomprendidos. Además, la canción es un recordatorio de la película y del mensaje que transmite sobre la conexión humana y la importancia de aceptar nuestras diferencias."),
    Song("My Heart Will Go On", "Celine Dion", "Let's Talk About Love", 1997, R.drawable.titanic, "Every night in my dreams\n" +
                "I see you, I feel you,\n" +
                "That is how I know you go on\n" +
                "\n" +
                "Far across the distance\n" +
                "And spaces between us\n" +
                "You have come to show you go on\n" +
                "\n" +
                "Near, far, wherever you are\n" +
                "I believe that the heart does go on\n" +
                "Once more you open the door\n" +
                "And you're here in my heart\n" +
                "And my heart will go on and on\n" +
                "\n" +
                "Love can touch us one time\n" +
                "And last for a lifetime\n" +
                "And never let go till we're one\n" +
                "\n" +
                "Love was when I loved you\n" +
                "One true time I hold to\n" +
                "In my life we'll always go on\n" +
                "\n" +
                "Near, far, wherever you are\n" +
                "I believe that the heart does go on\n" +
                "Once more you open the door\n" +
                "And you're here in my heart\n" +
                "And my heart will go on and on\n" +
                "\n" +
                "There is some love that will not go away\n" +
                "\n" +
                "You're here, there's nothing I fear,\n" +
                "And I know that my heart will go on\n" +
                "We'll stay forever this way\n" +
                "You are safe in my heart\n" +
                "And my heart will go on and on\n", "My Heart Will Go On es la canción principal de la banda sonora de la película Titanic, y se ha convertido en una de las canciones más famosas de la historia del cine. La letra de la canción habla del amor verdadero que trasciende la distancia y el tiempo, y se ha convertido en un símbolo del amor épico y trágico de la película. La música, compuesta por James Horner, es emotiva y conmovedora, y ayuda a capturar la emoción y el drama de la historia de Jack y Rose. La canción, interpretada por Celine Dion, ganó el premio al mejor tema original en los Premios de la Academia de 1998 y se convirtió en un éxito mundial, vendiendo millones de copias en todo el mundo."),
    Song("Tiburón", "Lalo Schifrin", "Banda Sonora Original de la Película 'Tiburón'", 1975, R.drawable.jaws_poster, "Instrumental", "\"Tiburón\" es una canción instrumental que se convirtió en un clásico instantáneo después del lanzamiento de la película homónima en 1975. La canción fue compuesta por Lalo Schifrin, quien también compuso la banda sonora de la película. El sentido simbólico de la canción se relaciona con la tensión y el peligro que se siente cuando se enfrenta a algo amenazante e impredecible, como un tiburón.\n" +
                "\n" +
                "La música comienza con una introducción tranquila y misteriosa que evoca la sensación de estar en el océano, y poco a poco va construyendo tensión con el uso de cuerdas y vientos. La canción se acelera a medida que la tensión aumenta, creando una sensación de peligro inminente. La música finalmente llega a un clímax dramático con un golpe de tambores, que representa la aparición del tiburón.\n" +
                "\n" +
                "En este sentido, la canción simboliza la amenaza que representa el tiburón en la película y la tensión que se siente al enfrentarse a algo peligroso e impredecible. Además, la canción se ha convertido en un símbolo cultural del terror y el peligro, y ha sido utilizada en numerosas parodias y referencias en la cultura popular. En resumen, \"Tiburón\" es una canción que simboliza la tensión y el peligro, y que ha llegado a representar un elemento icónico de la cultura popular.")

)

val songClasica = listOf(

    Song("Air", "Johann Sebastian Bach", "Suite para orquesta n.º 3 en re mayor, BWV 1068", 1731, R.drawable.johann_sebastian_bach, "Instrumental", "Air es una pieza musical barroca escrita para ser interpretada por una orquesta. Se caracteriza por tener un tempo lento y relajado, con una melodía suave y delicada que ha sido utilizada en numerosas ocasiones en la cultura popular, como en la película The English Patient. La obra es un ejemplo del alto nivel de habilidad compositiva de Bach, y su sentido simbólico radica en la belleza y la elegancia de la música, así como en su capacidad para evocar emociones en el oyente."),
    Song("Andante cantabile", "Joseph Haydn", "Sinfonía No. 5 en Si bemol mayor", 1761, R.drawable._00px_joseph_haydn, "Instrumental", "El sentido de \"Andante cantabile\" es profundamente emotivo y conmovedor, caracterizado por una sensación de dulzura y delicadeza en su melodía. La pieza comienza con una introducción de violonchelo en solitario que establece una atmósfera serena y nostálgica. Luego, los demás instrumentos se unen gradualmente, creando un sonido armonioso y cálido.\n" +
                "\n" +
                "La pieza transmite un sentido de tristeza y melancolía, pero también una sensación de belleza y serenidad. La melodía es suave y fluida, evocando un sentimiento de calma y contemplación. La música parece tener un carácter expresivo, como si estuviera comunicando emociones profundas y complejas que no pueden ser expresadas con palabras."),
    Song("Claro de Luna (Moonlight Sonata en inglés)\n", "Ludwig van Beethoven", "Piano Sonata No. 14 en Do sostenido menor, Op. 27, No. 2", 1801, R.drawable.beethoven, "Instrumental", "La obra es considerada una de las más famosas del repertorio clásico y es conocida por su atmósfera melancólica y suave. Aunque Beethoven nunca se refirió a la obra como \"Claro de Luna\", el título se le atribuye a una crítica musical que comparó la obra con el reflejo de la luna en el agua. La pieza ha sido utilizada en numerosas películas, televisión y anuncios publicitarios, y se ha convertido en un símbolo de la música clásica."),
    Song("Danza eslava nº 2", "Antonín Dvorak", "Danzas Eslavas", 1878, R.drawable.dvorak, "Instrumental", "La Danza eslava nº 2 es una pieza muy conocida y popular del compositor checo Antonín Dvorak. Su ritmo animado y su melodía alegre y nostálgica son un homenaje a la música tradicional de Europa Central y Oriental. La pieza ha sido utilizada en diversas ocasiones en el cine, la televisión y otros medios, y se ha convertido en un símbolo de la cultura checa y de la música clásica en general."),
    Song("Danza Húngara nº5", "Johannes Brahms", "Hungarian Dances", 1869, R.drawable.johannes_brahms, "Instrumental", "Esta obra es una de las 21 danzas húngaras escritas por Brahms y está basada en la música popular húngara. Su sentido simbólico es principalmente musical, destacando su complejidad y belleza en la ejecución de los instrumentos. Además, es una de las obras más populares del repertorio clásico y ha sido utilizada en películas y otros medios de comunicación."),
    Song("En un mercado persa (In a Persian Market)", "Albert William Ketelbey", "No se trata de una canción en un álbum específico, sino de una pieza clásica que ha sido interpretada y grabada por numerosas orquestas y directores de música", 1921, R.drawable.albert_ketelbey, "Instrumental", "La obra busca evocar la atmósfera de un mercado persa a través de la música. Utiliza instrumentos y melodías típicos de la música persa y árabe, así como también elementos de música occidental. A través de los diferentes movimientos de la obra, Ketelbey busca recrear el bullicio y la actividad de un mercado, así como también momentos de tranquilidad y contemplación. En general, la obra tiene un sentido simbólico de exotismo y de evocación de culturas y lugares lejanos."),
    Song("Liebestraum No. 3 (S. 541/3)", "Franz Liszt (compositor)", "N/A (se encuentra en diversas recopilaciones de música clásica)", 1850, R.drawable.franz_liszt_oil_canvas_henri_lehmann_carnavalet_1840, "Instrumental", ""),
    Song("Grand Valse Brillante", "Fréderic Chopin (compositor)", "Es una pieza individual", 1834, R.drawable.chopin, "Instrumental", ""),
    Song("Polonaise, Op. 53 (también conocida como Polonesa heroica)", "Fréderic Chopin", "No aplica, es una pieza de música clásica", 1843, R.drawable.chopin, "Instrumental", "La Polonesa heroica, como su nombre lo indica, tiene un carácter heroico y solemne, reflejando la devoción de Chopin a su Polonia natal y su lucha por la libertad. La pieza representa un homenaje a la resistencia polaca contra las fuerzas rusas en 1830-31. Es una de las obras más populares y virtuosas de Chopin, y es considerada una de las polonesas más importantes de la historia de la música"),
    Song("Peer Gynt, Op. 23: Morning Mood", "Edvard Grieg", "Peer Gynt Suite No. 1, Op. 46", 1888, R.drawable.edvard_grieg, "Instrumental", "Esta pieza de Grieg se ha utilizado en películas, televisión y anuncios para representar un nuevo día, un nuevo comienzo o una sensación de paz y tranquilidad. El tono suave y sereno de la música puede sugerir la calma antes de la tormenta o una sensación de renovación. En resumen, \"La mañana\" de Grieg se ha convertido en un ícono musical para representar la esperanza y el despertar."),
    Song("Minueto", "Luigi Boccherini", "Quintetos de cuerda Op. 11 y Op. 33", 1771, R.drawable.lboccherinifxd, "Instrumental", "La obra es un minueto, una danza muy popular en la época barroca. El minueto solía ser una danza de salón de la corte francesa, pero luego se extendió por toda Europa. Esta pieza de Boccherini es un ejemplo clásico del género, con su ritmo suave y elegante y sus melodías encantadoras. El minueto también se caracteriza por su forma ternaria, que se divide en tres secciones principales. Como una de las piezas más conocidas de Boccherini, el minueto sigue siendo una obra muy popular en la música clásica."),
    Song("Minueto en Sol Mayor", "Johann Sebastian Bach", "Cuaderno para Anna Magdalena Bach", 0, R.drawable.johann_sebastian_bach, "Instrumental", "El minueto era una danza de salón muy popular en la época barroca, y se utilizaba en muchas ocasiones como música de fondo para eventos y celebraciones. En este caso, el Minueto en Sol Mayor es una de las piezas más conocidas del Cuaderno para Anna Magdalena Bach, un libro de música que el compositor escribió para su segunda esposa Anna Magdalena. La pieza en sí misma representa la elegancia y la sofisticación de la época barroca, y es una muestra del talento y la habilidad de Bach como compositor de música instrumental."),
    Song("Nocturne op.9 No.2", "Frédéric Chopin", "Nocturnes", 1832, R.drawable.chopin, "Instrumental", "Esta pieza musical se considera una de las obras más famosas de Chopin y se ha utilizado en numerosas películas, programas de televisión y anuncios. El sentido simbólico de la pieza es su capacidad para evocar una sensación de melancolía y nostalgia, lo que la hace ideal para situaciones románticas o tristes en la pantalla. Además, la pieza ha sido asociada con la elegancia y la sofisticación, lo que la hace apropiada para escenas de alta sociedad o en entornos elegantes."),
    Song("Rapsodia Húngara No.2", "Franz Liszt", "Hungarian Rhapsodies", 1851, R.drawable.franz_liszt_oil_canvas_henri_lehmann_carnavalet_1840, "Instrumental", "La Rapsodia Húngara No.2 es una obra virtuosística y emocionalmente intensa que refleja la pasión y la riqueza del folclore húngaro. La obra ha sido utilizada en numerosas películas y programas de televisión, y ha sido considerada como una de las obras más representativas de Liszt. Simboliza la habilidad técnica y la pasión que pueden ser expresadas a través de la música, y la importancia de preservar y honrar las tradiciones culturales."),
    Song("Serenata", "Franz Schubert", "Es una obra individual", 1828, R.drawable._40px_franz_schubert_by_wilhelm_august_rieder_1875, "Instrumental", "La Serenata de Schubert es una obra muy conocida y popular, y es vista como una de las más hermosas composiciones para guitarra clásica. Su tono tranquilo y romántico evoca una sensación de paz y serenidad, y ha sido utilizada en varias películas y programas de televisión para crear una atmósfera nostálgica y emotiva. La serenata también es conocida por sus arpegios, que representan la delicadeza y la gracia en la música.")
)

 val songCountry = listOf(
     Song("Blue Moon of Kentucky", "Bill Monroe and The Blue Grass Boys", "Single", 1947, R.drawable.bill_monroe, "Blue moon of Kentucky, keep on shining\n" +
                 "Shine on the one that's gone and proved untrue\n" +
                 "Blue moon of Kentucky, keep on shining\n" +
                 "Shine on the one that's gone and left me blue\n" +
                 "\n" +
                 "It was on a moonlight night\n" +
                 "The star is shining bright\n" +
                 "And they whispered from on high\n" +
                 "Your love has said good-bye\n" +
                 "\n" +
                 "Blue moon of Kentucky, keep on shining\n" +
                 "Shine on the one that's gone and said good-bye\n" +
                 "\n" +
                 "Blue moon of Kentucky, keep on shining\n" +
                 "Shine on the one that's gone and proved untrue\n" +
                 "Blue moon of Kentucky, keep on shining\n" +
                 "Shine on the one that's gone and left me blue\n" +
                 "\n" +
                 "It is on a moonlight night\n" +
                 "The stars shining bright\n" +
                 "They whispered from high\n" +
                 "Your love has said good-bye\n" +
                 "\n" +
                 "Blue moon of Kentucky, keep on shining\n" +
                 "Shine on the one that's gone and said good-bye", "La canción es un ejemplo del estilo de bluegrass, un género musical popular en la zona rural de Estados Unidos. La letra habla de una ruptura amorosa y del anhelo por la persona que se ha ido. La melodía y la instrumentación (banjo, guitarra, mandolina) son características del bluegrass y ayudaron a popularizar el género en su momento."),
     Song("I've Got a Tiger By the Tail", "Buck Owens and the Buckaroos", "I've Got a Tiger By the Tail", 1965, R.drawable.buck_owens, "I've got a tiger by the tail, it's plain to see\n" +
                 "I won't be much when you get through with me\n" +
                 "Well, I'm a losin' weight and turnin' mighty pale\n" +
                 "Looks like I've got a tiger by the tail\n" +
                 "\n" +
                 "Well, I thought the day I met you, you were meek as a lamb\n" +
                 "Just the kind to fit my dreams and plans\n" +
                 "But now, the pace we're livin' takes the wind from my sails\n" +
                 "And it looks like I've got a tiger by the tail\n" +
                 "\n" +
                 "I've got a tiger by the tail, it's plain to see\n" +
                 "I won't be much when you get through with me\n" +
                 "Well, I'm a losin' weight and turnin' mighty pale\n" +
                 "Looks like I've got a tiger by the tail\n" +
                 "\n" +
                 "Well, every night you drag me where the bright lights are found\n" +
                 "There ain't no way to slow you down\n" +
                 "I'm about as helpless as a leaf in a gale\n" +
                 "And it looks like I've got a tiger by the tail\n" +
                 "\n" +
                 "I've got a tiger by the tail, it's plain to see\n" +
                 "I won't be much when you get through with me\n" +
                 "Well, I'm a losin' weight and turnin' mighty pale\n" +
                 "Looks like I've got a tiger by the tail\n" +
                 "\n" +
                 "Well, she's a tiger when she wants love\n" +
                 "And she's a snake if I try to leave\n" +
                 "And I can't help but be fascinated\n" +
                 "'Cause she's a woman and I'm just a man\n" +
                 "\n" +
                 "I've got a tiger by the tail, it's plain to see\n" +
                 "I won't be much when you get through with me\n" +
                 "Well, I'm a losin' weight and turnin' mighty pale\n" +
                 "Looks like I've got a tiger by the tail", "La canción cuenta la historia de una relación amorosa que se ha salido de control. El narrador se siente abrumado y agotado por la personalidad fuerte y enérgica de su pareja, que lo lleva a lugares y situaciones que lo hacen sentir incómodo y fuera de lugar. El título de la canción, \"Tengo un tigre por la cola\", es una metáfora para describir la sensación de estar atrapado y sin control en una situación peligrosa. La canción es un ejemplo del estilo country y western de los años 60 y muestra la habilidad de Buck Owens y su banda para mezclar la música country con elementos del rock and roll."),
     Song("Jolene", "Dolly Parton", "Jolene", 1973, R.drawable.dolly_parton, "Jolene, Jolene, Jolene, Jolene\n" +
                 "I'm begging of you, please don't take my man\n" +
                 "Jolene, Jolene, Jolene, Jolene\n" +
                 "Please don't take him just because you can\n" +
                 "\n" +
                 "Your beauty is beyond compare\n" +
                 "With flaming locks of auburn hair\n" +
                 "With ivory skin and eyes of emerald green\n" +
                 "Your smile is like a breath of spring\n" +
                 "Your voice is soft like summer rain\n" +
                 "And I cannot compete with you, Jolene\n" +
                 "\n" +
                 "He talks about you in his sleep\n" +
                 "There's nothing I can do to keep\n" +
                 "From crying when he calls your name, Jolene\n" +
                 "\n" +
                 "And I can easily understand\n" +
                 "How you could easily take my man\n" +
                 "But you don't know what he means to me, Jolene\n" +
                 "\n" +
                 "Jolene, Jolene, Jolene, Jolene\n" +
                 "I'm begging of you, please don't take my man\n" +
                 "Jolene, Jolene, Jolene, Jolene\n" +
                 "Please don't take him just because you can\n" +
                 "\n" +
                 "You could have your choice of men\n" +
                 "But I could never love again\n" +
                 "He's the only one for me, Jolene\n" +
                 "\n" +
                 "I had to have this talk with you\n" +
                 "My happiness depends on you\n" +
                 "And whatever you decide to do, Jolene\n" +
                 "\n" +
                 "Jolene, Jolene, Jolene, Jolene\n" +
                 "I'm begging of you, please don't take my man\n" +
                 "Jolene, Jolene, Jolene, Jolene\n" +
                 "Please don't take him even though you can", "La canción trata sobre los celos y el miedo a perder a alguien amado. Jolene es descrita como una mujer hermosa y encantadora, y la narradora teme que pueda robar a su hombre. Aunque la canción es una muestra de vulnerabilidad y tristeza, también es una demostración de la fuerza y la determinación de la narradora para luchar por su amor."),
     Song("He Stopped Loving Her Today", "George Jones", "I Am What I Am", 1980, R.drawable.george_jones_ha_muerto_the_possum, "He said I'll love you 'til I die\n" +
                 "She told him you'll forget in time\n" +
                 "As the years went slowly by\n" +
                 "She still preyed upon his mind\n" +
                 "\n" +
                 "He kept her picture on his wall\n" +
                 "Went half-crazy now and then\n" +
                 "He still loved her through it all\n" +
                 "Hoping she'd come back again\n" +
                 "\n" +
                 "Kept some letters by his bed\n" +
                 "Dated 1962\n" +
                 "He had underlined in red\n" +
                 "Every single \"I love you\"\n" +
                 "\n" +
                 "I went to see him just today\n" +
                 "Oh, but I didn't see no tears\n" +
                 "All dressed up to go away\n" +
                 "First time I'd seen him smile in years\n" +
                 "\n" +
                 "(Chorus)\n" +
                 "He stopped loving her today\n" +
                 "They placed a wreath upon his door\n" +
                 "And soon they'll carry him away\n" +
                 "He stopped loving her today\n" +
                 "\n" +
                 "You know she came to see him one last time\n" +
                 "Oh, we all wondered if she would\n" +
                 "And it kept running through my mind\n" +
                 "This time he's over her for good\n" +
                 "\n" +
                 "(Chorus)\n" +
                 "He stopped loving her today\n" +
                 "They placed a wreath upon his door\n" +
                 "And soon they'll carry him away\n" +
                 "He stopped loving her today", "La canción es sobre un hombre que nunca deja de amar a una mujer, incluso después de que ella lo deja y sigue adelante con su vida. Él la ama hasta el día de su muerte, y ella nunca vuelve a él. La canción es un tributo a la idea del amor verdadero y duradero, y cómo puede sobrevivir incluso después de que una relación haya terminado. Es considerada como una de las mejores canciones de amor de todos los tiempos."),
     Song("I'm So Lonesome I Could Cry", "Hank Williams", "Moanin' the Blues", 1949, R.drawable.hank_williams_promotional_photo, "Hear that lonesome whippoorwill\n" +
                 "He sounds too blue to fly\n" +
                 "The midnight train is whining low\n" +
                 "I'm so lonesome, I could cry\n" +
                 "\n" +
                 "I've never seen a night so long\n" +
                 "When time goes crawling by\n" +
                 "The moon just went behind a cloud\n" +
                 "To hide its face and cry\n" +
                 "\n" +
                 "Did you ever see a robin weep\n" +
                 "When leaves begin to die?\n" +
                 "That means he's lost the will to live\n" +
                 "I'm so lonesome, I could cry\n" +
                 "\n" +
                 "The silence of a falling star\n" +
                 "Lights up a purple sky\n" +
                 "And as I wonder where you are\n" +
                 "I'm so lonesome, I could cry\n" +
                 "\n" +
                 "I'm so lonesome, I could cry", "La letra de esta canción habla sobre la soledad y la tristeza que puede sentir una persona cuando está lejos de alguien que ama o que ha perdido. La voz melancólica de Hank Williams y la instrumentación simple y nostálgica contribuyen a crear una atmósfera de dolor y añoranza. La canción se ha convertido en un clásico de la música country y ha sido versionada por muchos artistas a lo largo de los años."),
     Song("Settin' the Woods on Fire", "Hank Williams", "The Complete Hank Williams", 1952, R.drawable.hank_williams_promotional_photo, "Comb your hair and paint and powder\n" +
                 "You act proud and I'll act prouder\n" +
                 "You sing loud and I'll sing louder\n" +
                 "Tonight we're settin' the woods on fire\n" +
                 "\n" +
                 "You're my gal and I'm your feller\n" +
                 "Dress up in your frock of yeller\n" +
                 "I'll look swell but you'll look sweller\n" +
                 "Tonight we're settin' the woods on fire\n" +
                 "\n" +
                 "We'll be listenin' to the fiddle\n" +
                 "Makin' love beneath the middle\n" +
                 "Just movin' slow, no place to go\n" +
                 "Tonight we're settin' the woods on fire\n" +
                 "\n" +
                 "We'll be listenin' to the fiddle\n" +
                 "Makin' love beneath the middle\n" +
                 "Just movin' slow, no place to go\n" +
                 "Tonight we're settin' the woods on fire\n" +
                 "\n" +
                 "We'll be listenin' to the fiddle\n" +
                 "Makin' love beneath the middle\n" +
                 "Just movin' slow, no place to go\n" +
                 "Tonight we're settin' the woods on fire", "La canción habla de una pareja que está decidida a causar un gran impacto en el mundo y en su relación. Utilizan la música y el amor para hacerlo, mostrando que juntos pueden ser más fuertes que separados. Además, la canción también puede interpretarse como una expresión de rebeldía y libertad, ya que la pareja está dispuesta a romper con las normas y convenciones sociales para disfrutar de su amor."),
     Song("Standing on the Corner (Blue Yodel #9)", "Jimmie Rodgers", "single", 1930, R.drawable.jimmie_rodgers, "Standing on the corner, all alone\n" +
                 "Trying to forget, the one I've known\n" +
                 "(What did you wrong) to drive her away\n" +
                 "(What did I do) that I could not say\n" +
                 "\n" +
                 "All alone, I'm so blue\n" +
                 "Thinking of the one, who's untrue\n" +
                 "On the corner, we used to meet\n" +
                 "Oh Lord, I'd give my life\n" +
                 "To see her sweet face, again\n" +
                 "\n" +
                 "Standing on the corner, all alone\n" +
                 "Trying to forget, the one I've known", "La canción trata sobre la tristeza y la soledad después de haber perdido a un amor. Es un tema común en la música country y blues, que a menudo refleja la dureza de la vida en el campo y la nostalgia por un tiempo pasado. En este caso, la letra evoca una sensación de desesperación y anhelo, y la repetición de la frase \"standing on the corner\" crea una sensación de estar atrapado en un lugar, incapaz de avanzar. La canción se convirtió en un éxito para Jimmie Rodgers y sigue siendo un clásico del country de la época temprana."),
     Song("I Walk the Line", "Johnny Cash", "I Walk the Line", 1956, R.drawable.johnny_cash_1977, "I keep a close watch on this heart of mine\n" +
                 "I keep my eyes wide open all the time\n" +
                 "I keep the ends out for the tie that binds\n" +
                 "Because you're mine, I walk the line\n" +
                 "\n" +
                 "I find it very, very easy to be true\n" +
                 "I find myself alone when each day is through\n" +
                 "Yes, I'll admit that I'm a fool for you\n" +
                 "Because you're mine, I walk the line\n" +
                 "\n" +
                 "As sure as night is dark and day is light\n" +
                 "I keep you on my mind both day and night\n" +
                 "And happiness I've known proves that it's right\n" +
                 "Because you're mine, I walk the line\n" +
                 "\n" +
                 "You've got a way to keep me on your side\n" +
                 "You give me cause for love that I can't hide\n" +
                 "For you I know I'd even try to turn the tide\n" +
                 "Because you're mine, I walk the line", "La letra de la canción habla sobre la lealtad y el compromiso en una relación amorosa. El cantante se compromete a mantenerse fiel a su pareja, manteniendo un estrecho control sobre sus sentimientos y acciones. La canción se ha convertido en un himno para la fidelidad y la integridad en el amor."),
     Song("It Wasn't God Who Made Honky Tonk Angels", "Kitty Wells", "It Wasn't God Who Made Honky Tonk Angels", 1952, R.drawable.kitty_wells, "As I sit here tonight, the jukebox playing\n" +
                 "The tune about the wild side of life\n" +
                 "As I listen to the words you are saying\n" +
                 "It brings memories when I was a trusting wife\n" +
                 "It wasn't God who made honky tonk angels\n" +
                 "As you said in the words of your song\n" +
                 "Too many times married men think they're still single\n" +
                 "That has caused many a good girl to go wrong\n" +
                 "\n" +
                 "It's a shame that all the blame is on us women\n" +
                 "It's not true that only you men feel the same\n" +
                 "From the start most every heart that's ever broken\n" +
                 "Was because there always was a man to blame\n" +
                 "It wasn't God who made honky tonk angels\n" +
                 "As you said in the words of your song\n" +
                 "Too many times married men think they're still single\n" +
                 "That has caused many a good girl to go wrong\n" +
                 "\n" +
                 "It's a shame that all the blame is on us women\n" +
                 "It's not true that only you men feel the same\n" +
                 "From the start most every heart that's ever broken\n" +
                 "Was because there always was a man to blame\n" +
                 "It wasn't God who made honky tonk angels\n" +
                 "As you said in the words of your song\n" +
                 "Too many times married men think they're still single\n" +
                 "That has caused many a good girl to go wrong", "La canción es un himno feminista en el que se critica la idea de que las mujeres son las únicas responsables de las infidelidades en el matrimonio y se señala la falta de responsabilidad de los hombres en el tema. Además, se cuestiona el papel de la mujer en la sociedad y se defiende su derecho a disfrutar de la vida nocturna y a tomar sus propias decisiones. Es considerada una de las canciones más importantes de la música country por su mensaje progresista y por ser la primera canción de una artista femenina en llegar al número uno en la lista de música country."),
     Song("Mama Tried", "Merle Haggard", "Mama Tried", 1968, R.drawable.merle_haggard, "Verse 1:\n" +
                 "The first thing I remember knowing\n" +
                 "Was a lonesome whistle blowing\n" +
                 "And a young'un's dream of growing up to ride\n" +
                 "On a freight train leaving town\n" +
                 "Not knowing where I'm bound\n" +
                 "No one could change my mind but Mama tried\n" +
                 "\n" +
                 "Chorus:\n" +
                 "One and only rebel child\n" +
                 "From a family meek and mild\n" +
                 "My Mama seemed to know what lay in store\n" +
                 "Despite my Sunday learning\n" +
                 "Towards the bad I kept turning\n" +
                 "'Til Mama couldn't hold me anymore\n" +
                 "\n" +
                 "Verse 2:\n" +
                 "I turned twenty-one in prison\n" +
                 "Doin' life without parole\n" +
                 "No one could steer me right but Mama tried, Mama tried\n" +
                 "Mama tried to raise me better\n" +
                 "But her pleading, I denied\n" +
                 "That leaves only me to blame, 'cause Mama tried\n" +
                 "\n" +
                 "Chorus:\n" +
                 "One and only rebel child\n" +
                 "From a family meek and mild\n" +
                 "My Mama seemed to know what lay in store\n" +
                 "Despite my Sunday learning\n" +
                 "Towards the bad I kept turning\n" +
                 "'Til Mama couldn't hold me anymore\n" +
                 "\n" +
                 "Verse 3:\n" +
                 "Dear old Daddy, rest his soul\n" +
                 "Left my Momma heavy load\n" +
                 "She tried so very hard to fill his shoes\n" +
                 "Working hours without rest\n" +
                 "Wanted me to have the best\n" +
                 "She tried to raise me right, but I refused\n" +
                 "\n" +
                 "Chorus:\n" +
                 "One and only rebel child\n" +
                 "From a family meek and mild\n" +
                 "My Mama seemed to know what lay in store\n" +
                 "Despite my Sunday learning\n" +
                 "Towards the bad I kept turning\n" +
                 "'Til Mama couldn't hold me anymore\n" +
                 "\n" +
                 "Verse 4:\n" +
                 "Mama tried to raise me better\n" +
                 "But her pleading, I denied\n" +
                 "That leaves only me to blame 'cause Mama tried\n" +
                 "That leaves only me to blame 'cause Mama tried", "La canción habla de un joven rebelde que se siente atraído por la vida delictiva y el alcoholismo, y aunque su madre siempre trató de guiarlo por el camino correcto, él decidió seguir su propio camino. El sentido simbólico de la canción es el amor de una madre y la importancia de tener un buen guía en la vida para evitar caer en la tentación del mal."),
     Song("Crazy", "Pasty Cline", "Pasty Cline Showcase", 1961, R.drawable.patsy_cline, "Crazy, I'm crazy for feeling so lonely\n" +
                 "I'm crazy, crazy for feeling so blue\n" +
                 "I knew you'd love me as long as you wanted\n" +
                 "And then someday you'd leave me for somebody new\n" +
                 "\n" +
                 "Worry, why do I let myself worry?\n" +
                 "Wonderin', what in the world did I do?\n" +
                 "Crazy, for thinking that my love could hold you\n" +
                 "I'm crazy for trying, and crazy for crying\n" +
                 "And I'm crazy for loving you\n" +
                 "\n" +
                 "Crazy, for thinking that my love could hold you\n" +
                 "I'm crazy for trying, and crazy for crying\n" +
                 "And I'm crazy for loving you", "La canción expresa el dolor y la locura que se siente al amar a alguien que ya no está y saber que nunca volverá, incluso sabiendo que esa persona puede no haber sido buena para uno. La letra refleja la lucha interna de la protagonista por tratar de dejar ir a su amado, pero su amor es más fuerte y la lleva a sentirse loca y triste. Es una de las canciones más emblemáticas de Patsy Cline y ha sido versionada por numerosos artistas a lo largo de los años."),
     Song("You Don't Know Me", "Ray Charles", "Modern Sounds in Country and Western Music", 1962, R.drawable.ray_charles, "You give your hand to me\n" +
                 "And then you say, \"Hello\"\n" +
                 "And I can hardly speak\n" +
                 "My heart is beating so\n" +
                 "And anyone can tell\n" +
                 "You think you know me well\n" +
                 "But you don't know me\n" +
                 "\n" +
                 "No, you don't know the one\n" +
                 "Who dreams of you at night\n" +
                 "And longs to kiss your lips\n" +
                 "Longs to hold you tight\n" +
                 "To you, I'm just a friend\n" +
                 "That's all I've ever been\n" +
                 "'Cause you don't know me\n" +
                 "\n" +
                 "For I never knew the art of making love\n" +
                 "Though my heart aches with love for you\n" +
                 "Afraid and shy, I let my chance go by\n" +
                 "A chance that you might love me too\n" +
                 "\n" +
                 "You give your hand to me\n" +
                 "And then you say, \"Goodbye\"\n" +
                 "I watch you walk away\n" +
                 "Beside the lucky guy\n" +
                 "Oh, to never, never know\n" +
                 "The one who loves you so\n" +
                 "'Cause you don't know me", "La canción habla de un amor no correspondido y de la frustración de no poder expresar los verdaderos sentimientos. La letra sugiere que a veces las personas piensan que conocen a alguien, pero en realidad no saben lo que esa persona siente o piensa en su interior. También se puede interpretar como una crítica a la superficialidad de las relaciones sociales, donde la gente sólo se preocupa por la imagen que proyectan en lugar de mostrar su verdadero yo."),
     Song("Man of Constant Sorrow", "Stanley Brothers", "N/A", 1951, R.drawable.stanley_brothers, "I am a man of constant sorrow\n" +
                 "I've seen trouble all my days\n" +
                 "I'll say goodbye to Colorado\n" +
                 "Where I was born and partly raised\n" +
                 "\n" +
                 "Your mother says that I'm a stranger\n" +
                 "My face you'll never see no more\n" +
                 "But there's one promise that is given\n" +
                 "I'll meet you on God's golden shore\n" +
                 "\n" +
                 "Through this open world I'm a-bound to ramble\n" +
                 "Through ice and snows, sleet and rain\n" +
                 "I'm a-bound to ride that Northern railroad\n" +
                 "Perhaps I'll die upon this train\n" +
                 "\n" +
                 "I'm going back to Colorado\n" +
                 "The place that I started from\n" +
                 "If I knowed how bad you'd treat me\n" +
                 "Honey, I never would have come", "Esta canción es un clásico de la música bluegrass, un género que tiene sus raíces en la música folklórica de los Apalaches. La letra habla de un hombre que ha visto muchos problemas y ha tenido que enfrentar muchas dificultades en su vida. A pesar de todo, sigue adelante y se aferra a la promesa de encontrarse con su amada en el paraíso. La canción ha sido interpretada por muchos artistas a lo largo de los años, y ha sido utilizada en varias películas y series de televisión. Su sentido simbólico se relaciona con la idea de que la vida puede ser dura, pero siempre hay esperanza y una promesa de algo mejor en el futuro."),
     Song("Stand By Your Man", "Tammy Wynette", "Stand By Your Man", 1968, R.drawable.tammy_w, "Sometimes it's hard to be a woman\n" +
                 "Giving all your love to just one man\n" +
                 "You'll have bad times, and he'll have good times\n" +
                 "Doing things that you don't understand\n" +
                 "But if you love him, you'll forgive him\n" +
                 "Even though he's hard to understand\n" +
                 "And if you love him, oh be proud of him\n" +
                 "'Cause after all he's just a man\n" +
                 "\n" +
                 "Stand by your man\n" +
                 "Give him two arms to cling to\n" +
                 "And something warm to come to\n" +
                 "When nights are cold and lonely\n" +
                 "\n" +
                 "Stand by your man\n" +
                 "And show the world you love him\n" +
                 "Keep giving all the love you can\n" +
                 "Stand by your man\n" +
                 "\n" +
                 "Stand by your man\n" +
                 "And show the world you love him\n" +
                 "Keep giving all the love you can\n" +
                 "Stand by your man", "La canción se ha convertido en un himno de la lealtad y el compromiso de la mujer hacia su hombre. Aunque la letra ha sido criticada por perpetuar roles de género tradicionales, muchos ven la canción como una expresión de amor y apoyo incondicional en una relación. También se ha utilizado como una especie de himno para la lucha por los derechos de las mujeres, como en la manifestación \"Stand by Your Woman\" en 1977 en apoyo a la igualdad de derechos de la mujer."),
     Song("Mammas, Don’t Let Your Babies Grow Up to Be Cowboys", "Waylon Jennings and Willie Nelson", "Waylon & Willie", 1978, R.drawable.waylon_willie, "Cowboys ain't easy to love and they're harder to hold\n" +
                 "They'd rather give you a song than diamonds or gold\n" +
                 "Lonestar belt buckles and old faded Levi's\n" +
                 "And each night begins a new day\n" +
                 "If you don't understand him, an' he don't die young\n" +
                 "He'll prob'ly just ride away\n" +
                 "\n" +
                 "Mamas, don't let your babies grow up to be cowboys\n" +
                 "Don't let 'em pick guitars or drive them old trucks\n" +
                 "Let 'em be doctors and lawyers and such\n" +
                 "Mamas, don't let your babies grow up to be cowboys\n" +
                 "'Cause they'll never stay home and they're always alone\n" +
                 "Even with someone they love\n" +
                 "\n" +
                 "Cowboys like smokey old pool rooms and clear mountain mornings\n" +
                 "Little warm puppies and children and girls of the night\n" +
                 "Them that don't know him won't like him and them that do\n" +
                 "Sometimes won't know how to take him\n" +
                 "He ain't wrong, he's just different but his pride won't let him\n" +
                 "Do things to make you think he's right\n" +
                 "\n" +
                 "Mamas, don't let your babies grow up to be cowboys\n" +
                 "Don't let 'em pick guitars or drive them old trucks\n" +
                 "Let 'em be doctors and lawyers and such\n" +
                 "Mamas, don't let your babies grow up to be cowboys\n" +
                 "'Cause they'll never stay home and they're always alone\n" +
                 "Even with someone they love\n" +
                 "\n" +
                 "Cowboys like smokey old pool rooms and clear mountain mornings\n" +
                 "Little warm puppies and children and girls of the night\n" +
                 "Them that don't know him won't like him and them that do\n" +
                 "Sometimes won't know how to take him\n" +
                 "He ain't wrong, he's just different but his pride won't let him\n" +
                 "Do things to make you think he's right\n" +
                 "\n" +
                 "Mamas, don't let your babies grow up to be cowboys\n" +
                 "Don't let 'em pick guitars or drive them old trucks\n" +
                 "Let 'em be doctors and lawyers and such\n" +
                 "Mamas, don't let your babies grow up to be cowboys\n" +
                 "'Cause they'll never stay home and they're always alone\n" +
                 "Even with someone they love", "La canción es un consejo a las madres para que no permitan que sus hijos crezcan queriendo ser vaqueros, ya que pueden llevar una vida difícil y solitaria. Aunque los vaqueros pueden ser románticos y atractivos, también son impredecibles y a menudo se alejan de casa por largos períodos de tiempo. La canción sugiere que es mejor que los hijos de las madres se conviertan en profesionales como médicos o abogados, y no en personas que se dediquen a la vida de vaquero.")
 )

val songJazz = listOf (
     Song("Strange Fruit", "Billie Holiday", "Single", 1939, R.drawable.billie_holiday, "Southern trees bear strange fruit\n" +
                 "Blood on the leaves and blood at the root\n" +
                 "Black bodies swingin' in the Southern breeze\n" +
                 "Strange fruit hangin' from the poplar trees\n" +
                 "\n" +
                 "Pastoral scene of the gallant South\n" +
                 "The bulgin' eyes and the twisted mouth\n" +
                 "Scent of magnolias, sweet and fresh\n" +
                 "Then the sudden smell of burnin' flesh\n" +
                 "\n" +
                 "Here is a fruit for the crows to pluck\n" +
                 "For the rain to gather, for the wind to suck\n" +
                 "For the sun to rot, for the trees to drop\n" +
                 "Here is a strange and bitter crop", "La canción denuncia el linchamiento de personas negras en el sur de Estados Unidos y la violencia racial en general. La letra presenta una imagen impactante de cuerpos negros colgados de árboles, comparándolos con frutas extrañas y amargas que nadie quiere recoger. La canción se ha convertido en un himno contra la injusticia racial y ha sido reconocida como una de las canciones más importantes e influyentes en la historia de la música estadounidense."),
     Song("Goodbye Pork Pie Hat", "Charles Mingus", "Mingus Ah Um", 1959, R.drawable.charles_mingus, "Instrumental", "La canción fue compuesta por Mingus como un homenaje a Lester Young, un saxofonista de jazz que solía llevar un sombrero tipo \"pork pie\". La pieza es un lamento triste y melancólico que expresa la tristeza y la pérdida que sintió Mingus al enterarse de la muerte de Young. La canción se ha convertido en un clásico del jazz y es considerada una de las mejores composiciones de Mingus."),
     Song("Billie's Bounce", "Charlie Parker", "La canción no fue lanzada en un álbum específico, sino que se grabó en varias sesiones de grabación a lo largo de la carrera de Charlie Parker.", 1945, R.drawable.charlie_parker, "Instrumental", "Como una composición instrumental de jazz, \"Billie's Bounce\" no tiene un sentido simbólico específico en términos de letras o significado de las palabras. Sin embargo, la música de jazz en general a menudo se asocia con la libertad, la improvisación y la exploración de emociones complejas a través de la música."),
     Song("Jumpin' at the Woodside", "Count Basie", "The Count Basie Orchestra 1937-38 (Recopilación)", 1938, R.drawable.count_basie, "Instrumental", "La canción es un ejemplo del jazz swing de la era del big band de los años 30. Fue un éxito para la Count Basie Orchestra y se convirtió en una de sus canciones más emblemáticas. La música enérgica y vibrante es un llamado a la celebración y al baile, y representa el espíritu de la época del swing. La canción también es significativa por su papel en la promoción de la música negra y el talento de los músicos negros durante un tiempo de segregación racial en los Estados Unidos."),
     Song("Take Five", "Dave Brubeck Quartet", "Time Out", 1959, R.drawable.dave_brubeck, "Instrumental", "\"Take Five\" es una de las canciones de jazz más populares de todos los tiempos, conocida por su distintiva melodía y ritmo en 5/4. La canción fue escrita por el saxofonista Paul Desmond, quien también la interpretó en el álbum. El tema ha sido utilizado en numerosas películas, programas de televisión y anuncios publicitarios. El sentido simbólico de la canción radica en su capacidad para evocar el ambiente sofisticado y elegante de la música de jazz, así como su capacidad para inspirar a músicos de todo el mundo."),
     Song("A Night In Tunisia", "Dizzy Gillespie", "Groovin' High", 1945, R.drawable.dizzy_gillespie, "Instrumental", "\"A Night In Tunisia\" es considerada una de las canciones más importantes de la era del bebop en el jazz. El tema se inspiró en la música y la cultura africana, y la mezcla con el jazz para crear un sonido innovador en su época. La canción representa la experimentación y la búsqueda de nuevas formas de expresión musical en el jazz, y se convirtió en un estándar del género."),
     Song("Mood Indigo", "Duke Ellington", "The Duke: Essential Collection", 1930, R.drawable.duke_ellington, "You ain't never been blue, no, no, no\n" +
                 "You ain't never been blue\n" +
                 "Till you've had that mood indigo\n" +
                 "That feeling goes stealing down to my shoes\n" +
                 "While I just sit here and sigh, \"Go 'long blues\"\n" +
                 "\n" +
                 "Always get that mood indigo\n" +
                 "Since my baby said goodbye\n" +
                 "In the evening when lights are low\n" +
                 "I'm so lonesome I could cry\n" +
                 "\n" +
                 "'Cause there's nobody who cares about me\n" +
                 "I'm just a soul who's bluer than blue can be\n" +
                 "When I get that mood indigo\n" +
                 "I could lay me down and die\n" +
                 "\n" +
                 "Always get that mood indigo\n" +
                 "Since my baby said goodbye\n" +
                 "In the evening when lights are low\n" +
                 "I'm so lonesome I could cry\n" +
                 "\n" +
                 "'Cause there's nobody who cares about me\n" +
                 "I'm just a soul who's bluer than blue can be\n" +
                 "When I get that mood indigo\n" +
                 "I could lay me down and die", "La canción se trata de la tristeza profunda que uno siente después de una ruptura amorosa. La letra describe cómo el narrador se siente abatido después de que su amante se fue, y cómo todo parece triste y sombrío en su ausencia. El título de la canción, \"Mood Indigo\", hace referencia a un estado de ánimo de tristeza y melancolía."),
     Song("Summertime", "Ella Fitzgerald", "Ella Fitzgerald Sings the George and Ira Gershwin Songbook", 1957, R.drawable.ella_fitzgerald, "Summertime, and the livin' is easy\n" +
                 "Fish are jumpin' and the cotton is high\n" +
                 "Oh, your daddy's rich and your ma is good-lookin'\n" +
                 "So hush, little baby, don't you cry\n" +
                 "\n" +
                 "One of these mornin's you're gonna rise up singin'\n" +
                 "Then you'll spread your wings and you'll take to the sky\n" +
                 "But till that mornin', there's a nothin' can harm you\n" +
                 "With Daddy and Mammy standin' by", "Esta canción es uno de los clásicos más famosos de la música americana y ha sido interpretada por muchos artistas. Fue escrita por George e Ira Gershwin como parte de la ópera \"Porgy and Bess\" en 1935. La letra y la música evocan la imagen de un verano relajado y cálido en el sur de Estados Unidos. La canción se ha convertido en un himno de la música popular y es un ejemplo del talento de Ella Fitzgerald como cantante de jazz."),
     Song("My Favorite Things", "John Coltrane", "My Favorite Things", 1961, R.drawable.john_coltrane, "Instrumental", "La interpretación de Coltrane de \"My Favorite Things\" se considera un clásico del jazz. La pieza fue escrita originalmente por Richard Rodgers y Oscar Hammerstein II para el musical \"The Sound of Music\". La versión de Coltrane, sin embargo, se desvía del arreglo original, utilizando un tiempo inusual de 3/4, y destacando su uso de modulaciones y escalas modales. La canción se ha convertido en un símbolo del jazz moderno y ha sido interpretada por muchos artistas a lo largo de los años."),
     Song("What a Wonderful World", "Louis Armstrong", "What a Wonderful World", 1967, R.drawable.louis_armstrong, "I see trees of green, red roses too\n" +
                 "I see them bloom for me and you\n" +
                 "And I think to myself, what a wonderful world\n" +
                 "\n" +
                 "I see skies of blue and clouds of white\n" +
                 "The bright blessed day, the dark sacred night\n" +
                 "And I think to myself, what a wonderful world\n" +
                 "\n" +
                 "The colors of the rainbow, so pretty in the sky\n" +
                 "Are also on the faces of people passing by\n" +
                 "I see friends shaking hands, saying, \"How do you do?\"\n" +
                 "They're really saying, \"I love you\"\n" +
                 "\n" +
                 "I hear babies cry, I watch them grow\n" +
                 "They'll learn much more than I'll never know\n" +
                 "And I think to myself, what a wonderful world\n" +
                 "Yes, I think to myself, what a wonderful world\n", "Esta canción es un himno a la belleza de la vida y a la bondad del ser humano. A través de la observación de la naturaleza y la interacción humana, Armstrong transmite un mensaje de esperanza y optimismo, destacando la importancia de valorar lo que nos rodea y apreciar la diversidad. La letra ha sido considerada como una oda a la humanidad y un llamado a la paz y la armonía."),
     Song("So What", "Miles Davis", "Kind Of Blue", 1959, R.drawable.miles_davis, "Instrumental", "\"So What\" es considerada una de las piezas de jazz más famosas de todos los tiempos. Fue escrita por el pianista y compositor Bill Evans, y se destaca por su uso de la escala modal en lugar de la armonía convencional. La canción simboliza la exploración y experimentación del jazz de la década de 1950, así como el enfoque de Davis en el minimalismo y la simplicidad en su música."),
    Song("Feeling Good", "Nina Simone", "I Put a Spell on You", 1965, R.drawable.nina_simone, "Birds flying high, you know how I feel\n" +
                "Sun in the sky, you know how I feel\n" +
                "Breeze driftin' on by, you know how I feel\n" +
                "It's a new dawn, it's a new day, it's a new life for me\n" +
                "And I'm feeling good\n" +
                "\n" +
                "Fish in the sea, you know how I feel\n" +
                "River running free, you know how I feel\n" +
                "Blossom on the tree, you know how I feel\n" +
                "It's a new dawn, it's a new day, it's a new life for me\n" +
                "And I'm feeling good\n" +
                "\n" +
                "Dragonfly out in the sun, you know what I mean, don't you know\n" +
                "Butterflies all havin' fun, you know what I mean\n" +
                "Sleep in peace when day is done, that's what I mean\n" +
                "And this old world is a new world\n" +
                "And a bold world for me, yeah\n" +
                "\n" +
                "Stars when you shine, you know how I feel\n" +
                "Scent of the pine, you know how I feel\n" +
                "Oh, freedom is mine, and I know how I feel\n" +
                "It's a new dawn, it's a new day, it's a new life for me\n" +
                "\n" +
                "And I'm feeling good", "La canción habla sobre la liberación personal y la felicidad después de un tiempo difícil. Se ha utilizado en varias películas y programas de televisión como símbolo de triunfo y superación. La letra invita a sentirse bien y disfrutar la vida, sin importar las dificultades del pasado. Nina Simone interpreta la canción con gran pasión y emoción, lo que ha hecho que sea considerada una de las mejores canciones de su carrera."),
    Song("Georgia On My Mind", "Ray Charles", "The Genius Hits the Road", 1960, R.drawable.ray_charles, "Georgia, Georgia\n" +
                "The whole day through\n" +
                "Just an old sweet song\n" +
                "Keeps Georgia on my mind\n" +
                "\n" +
                "Georgia, Georgia\n" +
                "A song of you\n" +
                "Comes as sweet and clear\n" +
                "As moonlight through the pines\n" +
                "\n" +
                "Other arms reach out to me\n" +
                "Other eyes smile tenderly\n" +
                "Still in peaceful dreams I see\n" +
                "The road leads back to you\n" +
                "\n" +
                "Georgia, Georgia\n" +
                "No peace I find\n" +
                "Just an old sweet song\n" +
                "Keeps Georgia on my mind", "La canción es un homenaje al estado de Georgia, donde nació el cantante y pianista Ray Charles. Además, se ha convertido en un himno no oficial del estado y ha sido adoptada como una de sus canciones oficiales. La letra habla de la nostalgia que siente el cantante por Georgia, incluso cuando está lejos, y de cómo la música puede mantener vivo el recuerdo de su hogar."),
    Song("Moritat", "Sonny Rollins", "The Bridge", 1962, R.drawable.sonny_rollins_by_john_abbott_bw, "Instrumental", "La canción es una versión del tema \"Die Moritat von Mackie Messer\" de la ópera \"Los cuentos de Hoffmann\". Es conocida como \"Moritat\" o \"Mack the Knife\" y se ha convertido en un estándar del jazz. La interpretación de Sonny Rollins es particularmente notable por su uso del saxofón tenor y su estilo improvisado, lo que le da una sensación fresca y emocionante a la canción. La canción ha sido utilizada en varias películas y programas de televisión y se ha convertido en un icono del jazz."),
    Song("Round Midnight", "Thelonious Mon", "Genius of Modern Music, Vol. 1", 1947, R.drawable.thelonious_monk, "Instrumental", "Round Midnight es una de las canciones más icónicas de Thelonious Monk, y ha sido interpretada por numerosos músicos de jazz. Se caracteriza por su tono melancólico y evocador, lo que la convierte en una pieza de música muy emotiva. La canción ha sido asociada con la noche y la soledad, y su sentido simbólico radica en su capacidad para evocar emociones profundas y nostálgicas en el oyente.")

)

val songPop = listOf(

    Song("Baby One More Time", "Britney Spears", "...Baby One More Time", 1998, R.drawable.britney_spears_2013__straighten_crop_, "[Intro]\n" +
            "Oh, baby, baby\n" +
            "Oh, baby, baby\n" +
            "\n" +
            "[Verse 1]\n" +
            "Oh, baby, baby\n" +
            "How was I supposed to know\n" +
            "That something wasn't right here?\n" +
            "Oh, baby, baby\n" +
            "I shouldn't have let you go\n" +
            "And now you're out of sight, yeah\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Show me how you want it to be\n" +
            "Tell me, baby, 'cause I need to know now\n" +
            "Oh, because\n" +
            "\n" +
            "[Chorus]\n" +
            "My loneliness is killing me (And I)\n" +
            "I must confess, I still believe (Still believe)\n" +
            "When I'm not with you, I lose my mind\n" +
            "Give me a sign\n" +
            "Hit me, baby, one more time\n" +
            "\n" +
            "[Verse 2]\n" +
            "Oh, baby, baby\n" +
            "The reason I breathe is you (Oh, yeah)\n" +
            "Boy, you got me blinded\n" +
            "Oh, pretty, baby\n" +
            "There's nothing that I wouldn't do\n" +
            "It's not the way I planned it\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Show me how you want it to be\n" +
            "Tell me, baby, 'cause I need to know now\n" +
            "Oh, because\n" +
            "\n" +
            "[Chorus]\n" +
            "My loneliness is killing me (And I)\n" +
            "I must confess, I still believe (Still believe)\n" +
            "When I'm not with you, I lose my mind\n" +
            "Give me a sign\n" +
            "Hit me, baby, one more time\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "Oh, baby, baby (Oh)\n" +
            "Oh, baby, baby (Yeah)\n" +
            "\n" +
            "[Bridge]\n" +
            "Oh, baby, baby\n" +
            "How was I supposed to know?\n" +
            "Oh, pretty, baby\n" +
            "I shouldn't have let you go\n" +
            "I must confess that my loneliness is killing me now\n" +
            "Don't you know I still believe\n" +
            "That you will be here and give me a sign\n" +
            "Hit me, baby, one more time\n" +
            "\n" +
            "[Chorus]\n" +
            "My loneliness is killing me (And I)\n" +
            "I must confess, I still believe (Still believe)\n" +
            "When I'm not with you, I lose my mind\n" +
            "Give me a sign\n" +
            "Hit me, baby, one more time\n" +
            "\n" +
            "[Outro]\n" +
            "I must confess (My loneliness)\n" +
            "That my loneliness (Is killing me)\n" +
            "Is killing me now (I must confess, I still believe)\n" +
            "Don't you know I still believe (When I'm not with you)\n" +
            "That you will be here (I lose my mind)\n" +
            "And give me a sign\n" +
            "Hit me, baby, one more time\n", "La letra de la canción habla sobre una persona que todavía cree en su relación con otra persona y quiere volver con ella, a pesar de haberla perdido. La canción fue un éxito mundial y se considera un hito en la carrera de Britney Spears. Es vista como un himno de la cultura pop y ha sido interpretada en varios programas de televisión, películas y eventos importantes."),
    Song("Like A Prayer", "Madonna", "Like A Prayer", 1989, R.drawable.madonna_f53e, "[Intro]\n" +
            "Life is a mystery\n" +
            "Everyone must stand alone\n" +
            "I hear you call my name\n" +
            "And it feels like home\n" +
            "\n" +
            "[Chorus]\n" +
            "When you call my name\n" +
            "It's like a little prayer\n" +
            "I'm down on my knees\n" +
            "I want to take you there\n" +
            "In the midnight hour\n" +
            "I can feel your power\n" +
            "Just like a prayer\n" +
            "You know I'll take you there\n" +
            "\n" +
            "[Verse 1]\n" +
            "I hear your voice\n" +
            "It's like an angel sighing\n" +
            "I have no choice\n" +
            "I hear your voice\n" +
            "Feels like flying\n" +
            "I close my eyes\n" +
            "Oh God, I think I'm falling\n" +
            "Out of the sky\n" +
            "I close my eyes\n" +
            "Heaven, help me\n" +
            "\n" +
            "[Chorus]\n" +
            "When you call my name\n" +
            "It's like a little prayer\n" +
            "I'm down on my knees\n" +
            "I want to take you there\n" +
            "In the midnight hour\n" +
            "I can feel your power\n" +
            "Just like a prayer\n" +
            "You know I'll take you there\n" +
            "\n" +
            "[Verse 2]\n" +
            "Like a child\n" +
            "You whisper softly to me\n" +
            "You're in control\n" +
            "Just like a child\n" +
            "Now I'm dancing\n" +
            "It's like a dream\n" +
            "No end and no beginning\n" +
            "You're here with me\n" +
            "It's like a dream\n" +
            "Let the choir sing\n" +
            "\n" +
            "[Chorus]\n" +
            "When you call my name\n" +
            "It's like a little prayer\n" +
            "I'm down on my knees\n" +
            "I wanna take you there\n" +
            "In the midnight hour\n" +
            "I can feel your power\n" +
            "Just like a prayer\n" +
            "You know I'll take you there\n" +
            "When you call my name\n" +
            "It's like a little prayer\n" +
            "I'm down on my knees\n" +
            "I wanna take you there\n" +
            "In the midnight hour\n" +
            "I can feel your power\n" +
            "Just like a prayer\n" +
            "You know I'll take you there\n" +
            "\n" +
            "[Reprise]\n" +
            "Life is a mystery\n" +
            "Everyone must stand alone\n" +
            "I hear you call my name\n" +
            "And it feels like home\n" +
            "\n" +
            "[Chorus]\n" +
            "Just like a prayer\n" +
            "Your voice can take me there\n" +
            "Just like a muse to me\n" +
            "You are a mystery\n" +
            "Just like a dream\n" +
            "You are not what you seem\n" +
            "Just like a prayer, no choice\n" +
            "Your voice can take me there\n" +
            "\n" +
            "[Bridge]\n" +
            "Just like a prayer, I'll take you there\n" +
            "It's like a dream to me (Mmmm...)\n" +
            "Just like a prayer, I'll take you there (I'll take you there)\n" +
            "It's like a dream to me (Oh, oh-oh-oh yeah)\n" +
            "Just like a prayer, I'll take you there (I'll take you there)\n" +
            "It's like a dream to me (Oh yeah, yeah, yeah yeah yeah yeah)\n" +
            "Just like a prayer, I'll take you there (Oh, yeah)\n" +
            "It's like a dream to me (Oh, oh)\n" +
            "\n" +
            "[Chorus]\n" +
            "Just like a prayer\n" +
            "Your voice can take me there\n" +
            "Just like a muse to me\n" +
            "You are a mystery\n" +
            "Just like a dream\n" +
            "You are not what you seem\n" +
            "Just like a prayer, no choice\n" +
            "Your voice can take me there\n" +
            "Just like a prayer\n" +
            "Your voice can take me there\n" +
            "Just like a muse to me\n" +
            "You are a mystery\n" +
            "Just like a dream\n" +
            "You are not what you seem\n" +
            "Just like a prayer, no choice\n" +
            "Your voice can take me there\n" +
            "Your voice can take me there\n" +
            "Like a prayer\n" +
            "\n" +
            "[Outro]\n" +
            "It's like a prayer, your voice can take me there\n" +
            "It's like a prayer\n" +
            "It's like a prayer, your voice can take me there\n" +
            "It's like a prayer\n" +
            "It's like a prayer, your voice can take me there\n" +
            "It's like a prayer\n" +
            "It's like a prayer, your voice can take me there\n" +
            "It's like a prayer", "La canción \"Like a Prayer\" de Madonna ha sido interpretada como una canción que expresa la relación de la cantante con la religión. La letra habla de una conexión espiritual que se siente al ser llamado por el nombre de alguien, y cómo esta conexión es similar a una oración. También se puede interpretar como una canción sobre el amor y la devoción a otra persona, como una forma de adoración. Además, el video musical de la canción incluye imágenes religiosas y temas controvertidos como el racismo y la intolerancia religiosa. En general, la canción y el video han sido vistos como una declaración audaz y provocativa por parte de Madonna, que desafía las normas sociales y religiosas de su tiempo."),
    Song("When Doves Cry", "Prince", "Purple Rain", 1984, R.drawable.prince, "[Intro]\n" +
            "Yeah, yeah, yeah, yeah, yeah\n" +
            "Yeah, yeah, yeah, yeah, yeah\n" +
            "Yeah, yeah, yeah, yeah, yeah\n" +
            "\n" +
            "[Verse 1]\n" +
            "Dig, if you will, the picture\n" +
            "Of you and I engaged in a kiss\n" +
            "The sweat of your body covers me\n" +
            "Can you, my darling?\n" +
            "Can you picture this?\n" +
            "\n" +
            "[Verse 2]\n" +
            "Dream, if you can, a courtyard\n" +
            "An ocean of violets in bloom\n" +
            "Animals strike curious poses\n" +
            "They feel the heat\n" +
            "The heat between me and you\n" +
            "\n" +
            "[Chorus]\n" +
            "How can you just leave me standing\n" +
            "Alone in a world that's so cold? (So cold)\n" +
            "Maybe I'm just too demanding\n" +
            "Maybe I'm just like my father, too bold\n" +
            "Maybe you're just like my mother\n" +
            "She's never satisfied (She's never satisfied)\n" +
            "Why do we scream at each other?\n" +
            "This is what it sounds like\n" +
            "When doves cry\n" +
            "\n" +
            "[Verse 3]\n" +
            "Touch, if you will, my stomach (Hmm)\n" +
            "Feel how it trembles inside (Mhm)\n" +
            "You've got the butterflies all tied up\n" +
            "Don't make me chase you\n" +
            "Even doves have pride\n" +
            "\n" +
            "[Chorus]\n" +
            "How can you just leave me standing\n" +
            "Alone in a world so cold? (World so cold)\n" +
            "Maybe I'm just too demanding\n" +
            "Maybe I'm just like my father, too bold\n" +
            "Maybe you're just like my mother\n" +
            "She's never satisfied (She's never satisfied)\n" +
            "Why do we scream at each other?\n" +
            "This is what it sounds like\n" +
            "When doves cry", "La canción habla sobre la ruptura de una relación y las emociones contradictorias que surgen. El título de la canción, \"When Doves Cry\" (Cuando las palomas lloran), sugiere la idea de que incluso los animales más pacíficos y amorosos pueden experimentar dolor y sufrimiento, al igual que los seres humanos. La letra también hace referencia a la relación conflictiva de Prince con sus padres, lo que sugiere que sus propias experiencias personales influyeron en la creación de la canción. En general, la canción es una exploración emocional y simbólica de la complejidad de las relaciones humanas."),
    Song("Shallow", "Lady Gaga ft. Bradley Cooper", "A Star is Born (Original Motion Picture Soundtrack)", 2018, R.drawable._5381324989371, "[Verse 1: Bradley Cooper]\n" +
            "Tell me somethin', girl\n" +
            "Are you happy in this modern world?\n" +
            "Or do you need more?\n" +
            "Is there somethin' else you're searchin' for?\n" +
            "\n" +
            "[Refrain: Bradley Cooper]\n" +
            "I'm fallin'\n" +
            "In all the good times\n" +
            "I find myself longing for change\n" +
            "And, in the bad times, I fear myself\n" +
            "\n" +
            "\n" +
            "[Verse 2: Lady Gaga]\n" +
            "Tell me something, boy\n" +
            "Aren't you tired tryna fill that void?\n" +
            "Or do you need more?\n" +
            "Ain't it hard keepin' it so hardcore?\n" +
            "\n" +
            "[Refrain: Lady Gaga]\n" +
            "I'm falling\n" +
            "In all the good times\n" +
            "I find myself longing for change\n" +
            "And, in the bad times, I fear myself\n" +
            "\n" +
            "[Chorus: Lady Gaga]\n" +
            "I'm off the deep end, watch as I dive in\n" +
            "I'll never meet the ground\n" +
            "Crash through the surface where they can't hurt us\n" +
            "We're far from the shallow now\n" +
            "\n" +
            "[Post-Chorus: Lady Gaga & Bradley Cooper]\n" +
            "In the sha-ha, sha-hallow\n" +
            "In the sha-ha, sha-la-la-la-low\n" +
            "In the sha-ha, sha-hallow\n" +
            "We're far from the shallow now\n" +
            "\n" +
            "[Bridge: Lady Gaga]\n" +
            "Oh, ha, ah, ha\n" +
            "Oh-ah, ha\n" +
            "\n" +
            "You might also like\n" +
            "Midnight Rain\n" +
            "Taylor Swift\n" +
            "Blind\n" +
            "SZA\n" +
            "The Grants\n" +
            "Lana Del Rey\n" +
            "\n" +
            "[Chorus: Lady Gaga]\n" +
            "I'm off the deep end, watch as I dive in\n" +
            "I'll never meet the ground\n" +
            "Crash through the surface where they can't hurt us\n" +
            "We're far from the shallow now\n" +
            "\n" +
            "[Post-Chorus: Lady Gaga & Bradley Cooper]\n" +
            "In the sha-ha, shallow\n" +
            "In the sha-ha, sha-la-la-la-low\n" +
            "In the sha-ha, shallow\n" +
            "We're far from the shallow now", " La canción \"Shallow\" es una balada pop rock que representa la conexión y la colaboración entre dos personas que encuentran una forma de salir adelante juntas a pesar de sus diferencias. La letra habla sobre enfrentar el miedo y tomar riesgos para encontrar la verdadera felicidad. La canción también hace referencia a la idea de sumergirse en lo profundo y encontrar la confianza para ser auténticos y vulnerables."),
    Song("Can't Stop the Feeling!", "Justin Timberlake", "Banda sonora de la película \"Trolls\"", 2016, R.drawable._yk5t9rwkdkat8qv45934eez2ca, "[Verse 1]\n" +
            "I got this feelin' inside my bones\n" +
            "It goes electric, wavey when I turn it on\n" +
            "All through my city, all through my home\n" +
            "We're flyin' up, no ceilin', when we in our zone\n" +
            "\n" +
            "[Refrain]\n" +
            "I got that sunshine in my pocket, got that good soul in my feet\n" +
            "I feel that hot blood in my body when it drops (Ooh)\n" +
            "I can't take my eyes up off it, movin' so phenomenally\n" +
            "Room on lock, the way we rock it, so don't stop\n" +
            "\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "And under the lights when everything goes\n" +
            "Nowhere to hide when I'm gettin' you close\n" +
            "When we move, well, you already know\n" +
            "So just imagine (Just imagine, just imagine)\n" +
            "\n" +
            "[Chorus]\n" +
            "Nothin' I can see but you\n" +
            "When you dance, dance, dance\n" +
            "A feelin' good, good, creepin' up on you\n" +
            "So just dance, dance, dance, come on\n" +
            "All those things I shouldn't do\n" +
            "But you dance, dance, dance\n" +
            "And ain't nobody leavin' soon, so keep dancin'\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "I can't stop the feelin'\n" +
            "So just dance, dance, dance\n" +
            "I can't stop the feelin'\n" +
            "So just dance, dance, dance, come on\n" +
            "\n" +
            "[Verse 2]\n" +
            "Ooh, it's somethin' magical\n" +
            "It's in the air, it's in my blood, it's rushin' on (Rushin' on)\n" +
            "I don't need no reason, don't need control (Need control)\n" +
            "I fly so high, no ceilin', when I'm in my zone\n" +
            "\n" +
            "You might also like\n" +
            "A&W\n" +
            "Lana Del Rey\n" +
            "The Pi Song (100 Digits of π)\n" +
            "AsapSCIENCE\n" +
            "Sugar\n" +
            "Maroon 5\n" +
            "\n" +
            "[Refrain]\n" +
            "'Cause I got that sunshine in my pocket, got that good soul in my feet\n" +
            "I feel that hot blood in my body when it drops (Ooh)\n" +
            "I can't take my eyes up off it, movin' so phenomenally\n" +
            "Room on lock, the way we rock it, so don't stop\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "And under the lights when everything goes\n" +
            "Nowhere to hide when I'm gettin' you close\n" +
            "When we move, well, you already know\n" +
            "So just imagine (Just imagine, just imagine)\n" +
            "\n" +
            "[Chorus]\n" +
            "Nothin' I can see but you\n" +
            "When you dance, dance, dance\n" +
            "A feelin' good, good, creepin' up on you\n" +
            "So just dance, dance, dance, come on\n" +
            "All those things I shouldn't do\n" +
            "But you dance, dance, dance (No, no, no)\n" +
            "And ain't nobody leavin' soon, so keep dancin'\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "I can't stop the feelin'\n" +
            "So just dance, dance, dance\n" +
            "I can't stop the feelin'\n" +
            "So just dance, dance, dance, come on\n" +
            "I can't stop the feelin' (Woo)\n" +
            "So just dance, dance, dance\n" +
            "I can't stop the feelin' (Yeah)\n" +
            "So keep dancin', come on\n" +
            "\n" +
            "\n" +
            "[Bridge]\n" +
            "Oh\n" +
            "Yeah, oh\n" +
            "I can't stop the\n" +
            "I can't stop the\n" +
            "I can't stop the, I can't stop the\n" +
            "\n" +
            "[Chorus]\n" +
            "(I can't stop the feelin')\n" +
            "Nothin' I can see but you\n" +
            "When you dance, dance, dance\n" +
            "(I can't stop the feelin')\n" +
            "A feelin' good, good, creepin' up on you\n" +
            "So just dance, dance, dance, come on (Oh)\n" +
            "(I can't stop the feelin')\n" +
            "All those things I shouldn't do\n" +
            "But you dance, dance, dance (Dance, dance, dance)\n" +
            "(I can't stop the feelin')\n" +
            "And ain't nobody leavin' soon, so keep dancin'\n" +
            "(I can't stop the feelin')\n" +
            "\n" +
            "[Outro]\n" +
            "Everybody sing\n" +
            "Got this feelin' in my body\n" +
            "(I can't stop the feelin')\n" +
            "Got this feelin' in my body (Oh, no)\n" +
            "(I can't stop the feelin')\n" +
            "Wanna see you move your body (No, no, no)\n" +
            "(I can't stop the feelin')\n" +
            "Got this feelin' in my body, come on\n" +
            "Break it down\n" +
            "Got this feelin' in my body (Uh)\n" +
            "I can't stop the feelin'\n" +
            "Got this feeling in my body, come on (Ooh)", "La canción tiene una energía positiva y se centra en sentirse bien y disfrutar la vida al máximo. En general, el mensaje de la canción es que la felicidad es contagiosa y no hay nada que pueda detenerla."),
    Song("Shape of You", "Ed Sheeran", "÷ (Divide)", 2017, R.drawable._1e9599d_d924_44b4_b5a2_70a1f0a51443_alta_libre_aspect_ratio_default_0, "[Verse 1]\n" +
            "A club isn't the best place to find a lover\n" +
            "So the bar is where I go (Mm)\n" +
            "Me and my friends at the table doin' shots\n" +
            "Drinkin' fast and then we talk slow (Mm)\n" +
            "And you come over and start up a conversation with just me\n" +
            "And trust me, I'll give it a chance now (Mm)\n" +
            "Take my hand, stop, put Van the Man on the jukebox\n" +
            "And then we start to dance and now I'm singin' like\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Girl, you know I want your love\n" +
            "Your love was handmade for somebody like me\n" +
            "Well, come on now, follow my lead\n" +
            "I may be crazy, don't mind me\n" +
            "Say, \"Boy, let's not talk too much\"\n" +
            "Grab on my waist and put that body on me\n" +
            "Well, come on now, follow my lead\n" +
            "Come, come on now, follow my lead, mm\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "I'm in love with the shape of you\n" +
            "We push and pull like a magnet do\n" +
            "Although my heart is fallin' too\n" +
            "I'm in love with your body\n" +
            "And last night, you were in my room\n" +
            "And now my bed sheets smell like you\n" +
            "Every day, discoverin' somethin' brand new\n" +
            "Well, I'm in love with your body\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "Oh, I, oh, I, oh, I, oh, I\n" +
            "Well, I'm in love with your body\n" +
            "Oh, I, oh, I, oh, I, oh, I\n" +
            "Well, I'm in love with your body\n" +
            "Oh, I, oh, I, oh, I, oh, I\n" +
            "Well, I'm in love with your body\n" +
            "Every day, discoverin' somethin' brand new\n" +
            "I'm in love with the shape of you\n" +
            "\n" +
            "[Verse 2]\n" +
            "One week in, we let the story begin\n" +
            "We're goin' out on our first date (Mm)\n" +
            "You and me are thrifty, so go all-you-can-eat\n" +
            "Fill up your bag and I fill up a plate (Mm)\n" +
            "We talk for hours and hours about the sweet and the sour\n" +
            "And how your family is doin' okay (Mm)\n" +
            "And leave and get in a taxi, and kiss in the backseat\n" +
            "Tell the driver make the radio play and I'm singin' like\n" +
            "\n" +
            "You might also like\n" +
            "A&W\n" +
            "Lana Del Rey\n" +
            "Perfect\n" +
            "Ed Sheeran\n" +
            "Falling Back\n" +
            "Drake\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Girl, you know I want your love\n" +
            "Your love was handmade for somebody like me\n" +
            "Well, come on now, follow my lead\n" +
            "I may be crazy, don't mind me\n" +
            "Say, \"Boy, let's not talk too much\"\n" +
            "Grab on my waist and put that body on me\n" +
            "Well, come on now, follow my lead\n" +
            "Come, come on now, follow my lead\n" +
            "\n" +
            "[Chorus]\n" +
            "I'm in love with the shape of you\n" +
            "We push and pull like a magnet do\n" +
            "Although my heart is fallin' too\n" +
            "I'm in love with your body\n" +
            "And last night, you were in my room\n" +
            "And now my bed sheets smell like you\n" +
            "Every day, discoverin' somethin' brand new\n" +
            "Well, I'm in love with your body\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "Oh, I, oh, I, oh, I, oh, I\n" +
            "Well, I'm in love with your body\n" +
            "Oh, I, oh, I, oh, I, oh, I\n" +
            "Well, I'm in love with your body\n" +
            "Oh, I, oh, I, oh, I, oh, I\n" +
            "Well, I'm in love with your body\n" +
            "Every day, discoverin' somethin' brand new\n" +
            "I'm in love with the shape of you\n" +
            "\n" +
            "\n" +
            "[Bridge]\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "\n" +
            "[Chorus]\n" +
            "I'm in love with the shape of you\n" +
            "We push and pull like a magnet do\n" +
            "Although my heart is fallin' too\n" +
            "I'm in love with your body\n" +
            "And last night, you were in my room\n" +
            "And now my bed sheets smell like you\n" +
            "Every day, discoverin' somethin' brand new\n" +
            "Well, I'm in love with your body\n" +
            "\n" +
            "[Outro]\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "I'm in love with your body\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "I'm in love with your body\n" +
            "Come on, be my baby, come on\n" +
            "Come on, be my baby, come on\n" +
            "I'm in love with your body\n" +
            "Every day, discoverin' somethin' brand new\n" +
            "I'm in love with the shape of you", "\"Shape of You\" es una canción que habla sobre el enamoramiento y la atracción física entre dos personas. El cantante describe cómo se siente al conocer a alguien que le atrae físicamente y cómo se mueve su cuerpo al bailar juntos. La letra también sugiere que el amor no tiene forma ni tamaño definido, sino que puede surgir en cualquier lugar y entre cualquier persona.\n" +
            "\n" +
            "En resumen, el sentido simbólico de \"Shape of You\" se centra en la atracción física y la conexión emocional que puede surgir entre dos personas, independientemente de su forma o tamaño."),
    Song("Bad Romance", "Lady Gaga", "The Fame Monster", 2009, R.drawable._1l7wvj5vcl__sl1400_, "[Chorus]\n" +
            "Oh-oh-oh-oh-oh, oh-oh-oh-oh\n" +
            "Oh-oh-oh\n" +
            "Caught in a bad romance\n" +
            "Oh-oh-oh-oh-oh, oh-oh-oh-oh\n" +
            "Oh-oh-oh\n" +
            "Caught in a bad romance\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "Ra-ra, ah-ah-ah\n" +
            "Roma, roma-ma\n" +
            "Gaga, ooh, la-la\n" +
            "Want your bad romance\n" +
            "Ra-ra-ah-ah-ah\n" +
            "Roma, roma-ma\n" +
            "Gaga, ooh, la-la\n" +
            "Want your bad romance\n" +
            "\n" +
            "\n" +
            "[Verse 1]\n" +
            "I want your ugly, I want your disease\n" +
            "I want your everything as long as it's free\n" +
            "I want your love\n" +
            "Love, love, love, I want your love (Oh, ey)\n" +
            "I want your drama, the touch of your hand (Hey!)\n" +
            "I want your leather-studded kiss in the sand\n" +
            "I want your love\n" +
            "Love, love, love, I want your love\n" +
            "(Love, love, love, I want your love)\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "You know that I want you\n" +
            "And you know that I need you\n" +
            "I want it bad, your bad romance\n" +
            "\n" +
            "[Chorus]\n" +
            "I want your love, and I want your revenge\n" +
            "You and me could write a bad romance\n" +
            "(Oh-oh-oh-oh-oh)\n" +
            "I want your love, and all your lover's revenge\n" +
            "You and me could write a bad romance\n" +
            "Oh-oh-oh-oh-oh, oh-oh-oh-oh\n" +
            "Oh-oh-oh\n" +
            "Caught in a bad romance\n" +
            "Oh-oh-oh-oh-oh, oh-oh-oh-oh\n" +
            "Oh-oh-oh\n" +
            "Caught in a bad romance\n" +
            "\n" +
            "You might also like\n" +
            "The Boy Is Mine\n" +
            "Brandy & Monica\n" +
            "Poker Face\n" +
            "Lady Gaga\n" +
            "BREAK MY SOUL\n" +
            "Beyoncé\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "Ra-ra, ah-ah-ah\n" +
            "Roma-roma-ma\n" +
            "Gaga, ooh, la-la\n" +
            "Want your bad romance\n" +
            "\n" +
            "[Verse 2]\n" +
            "I want your horror, I want your design\n" +
            "'Cause you're a criminal as long as you're mine\n" +
            "I want your love\n" +
            "Love, love, love, I want your love (Uh)\n" +
            "I want your psycho, your vertigo schtick (Hey!)\n" +
            "Want you in my rear window, baby, you're sick\n" +
            "I want your love\n" +
            "Love, love, love, I want your love\n" +
            "(Love, love, love, I want your love)\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "You know that I want you\n" +
            "And you know that I need you ('Cause I'm a free bitch, baby)\n" +
            "I want it bad, your bad romance\n" +
            "\n" +
            "[Chorus]\n" +
            "I want your love, and I want your revenge\n" +
            "You and me could write a bad romance\n" +
            "(Oh-oh-oh-oh-oh)\n" +
            "I want your love, and all your lover's revenge\n" +
            "You and me could write a bad romance\n" +
            "Oh-oh-oh-oh-oh, oh-oh-oh-oh\n" +
            "Oh-oh-oh\n" +
            "Caught in a bad romance\n" +
            "Oh-oh-oh-oh-oh, oh-oh-oh-oh\n" +
            "Oh-oh-oh\n" +
            "Caught in a bad romance\n" +
            "\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "Ra-ra-ah-ah-ah\n" +
            "Roma-roma-ma\n" +
            "Gaga, ooh, la-la\n" +
            "Want your bad romance\n" +
            "Ra-ra-ah-ah-ah\n" +
            "Roma, roma-ma\n" +
            "Gaga, ooh, la-la\n" +
            "Want your bad romance\n" +
            "\n" +
            "[Interlude]\n" +
            "Walk, walk, fashion, baby\n" +
            "Work it, move that bitch crazy\n" +
            "Walk, walk, fashion, baby\n" +
            "Work it, move that bitch crazy\n" +
            "Walk, walk, fashion, baby\n" +
            "Work it, move that bitch crazy\n" +
            "Walk, walk, passion, baby\n" +
            "Work it, I'm a free bitch, baby\n" +
            "\n" +
            "[Bridge]\n" +
            "I want your love, and I want your revenge\n" +
            "I want your love, I don't wanna be friends\n" +
            "Je veux ton amour, et je veux ta revanche\n" +
            "Je veux ton amour, I don't wanna be friends\n" +
            "(Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh)\n" +
            "(I want your bad romance)\n" +
            "(I want your bad romance) No, I don't wanna be friends\n" +
            "(I want your bad romance) (Caught in a bad romance)\n" +
            "(I want your bad romance) I don't wanna be friends\n" +
            "(Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh)\n" +
            "(I want your bad romance)\n" +
            "(I want your bad romance) Want your bad romance\n" +
            "(I want your bad romance) (Caught in a bad romance)\n" +
            "Want your bad romance\n" +
            "\n" +
            "[Chorus]\n" +
            "I want your love, and I want your revenge\n" +
            "You and me could write a bad romance\n" +
            "(Oh-oh-oh-oh-oh)\n" +
            "I want your love, and all your lover's revenge\n" +
            "You and me could write a bad romance\n" +
            "Oh-oh-oh-oh-oh, oh-oh-oh-oh (Want your bad romance)\n" +
            "Oh-oh-oh\n" +
            "Caught in a bad romance (Want your bad romance)\n" +
            "Oh-oh-oh-oh-oh, oh-oh-oh-oh (Want your bad romance)\n" +
            "Oh-oh-oh\n" +
            "Caught in a bad romance\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "Ra-ra-ah-ah-ah\n" +
            "Roma, roma-ma\n" +
            "Gaga, ooh, la-la\n" +
            "Want your bad romance", "La canción \"Bad Romance\" es una crítica a la obsesión por el amor y las relaciones superficiales. En el video musical, Lady Gaga presenta un mundo oscuro y surrealista en el que la pasión se transforma en posesión. La canción también se puede interpretar como una crítica a la industria de la música y cómo las relaciones entre artistas y sellos discográficos pueden ser superficiales y explotadoras."),
    Song("I Want it That Way", "Backstreet Boys", "Millennium", 1999, R.drawable._33d6da374e41, "[Intro: AJ]\n" +
            "Yeah-eh-eh\n" +
            "\n" +
            "[Verse 1: Brian & Nick]\n" +
            "You are my fire\n" +
            "The one desire\n" +
            "Believe when I say\n" +
            "I want it that way\n" +
            "But we are two worlds apart\n" +
            "Can't reach to your heart\n" +
            "When you say\n" +
            "That I want it that way\n" +
            "\n" +
            "\n" +
            "[Chorus: Nick & All]\n" +
            "Tell me why\n" +
            "Ain't nothin' but a heartache\n" +
            "Tell me why\n" +
            "Ain't nothing but a mistake\n" +
            "Tell me why\n" +
            "I never wanna hear you say\n" +
            "I want it that way\n" +
            "\n" +
            "[Verse 2: AJ, AJ & Brian]\n" +
            "Am I your fire?\n" +
            "Your one desire\n" +
            "Yes, I know it's too late\n" +
            "But I want it that way\n" +
            "\n" +
            "[Chorus: AJ, All & Brian]\n" +
            "Tell me why\n" +
            "Ain't nothin' but a heartache\n" +
            "Tell me why\n" +
            "Ain't nothin' but a mistake\n" +
            "Tell me why\n" +
            "I never wanna hear you say\n" +
            "I want it that way\n" +
            "\n" +
            "[Bridge: Kevin, All, Howie, Kevin & AJ]\n" +
            "Now I can see that we're fallin' apart\n" +
            "From the way that it used to be, yeah\n" +
            "No matter the distance\n" +
            "I want you to know\n" +
            "That deep down inside of me\n" +
            "You are my fire\n" +
            "The one desire\n" +
            "You are (You are, you are, you are)\n" +
            "\n" +
            "You might also like\n" +
            "Did you know that there’s a tunnel under Ocean Blvd\n" +
            "Lana Del Rey\n" +
            "Ghost in the Machine\n" +
            "SZA\n" +
            "Circo Loco\n" +
            "Drake & 21 Savage\n" +
            "\n" +
            "[Interlude: Nick & All]\n" +
            "Don't wanna hear you say\n" +
            "Ain't nothin' but a heartache\n" +
            "Ain't nothin' but a mistake\n" +
            "(Don't wanna hear you say)\n" +
            "I never wanna hear you say (Oh, yeah)\n" +
            "I want it that way\n" +
            "\n" +
            "[Chorus: All, Brian, Nick & AJ]\n" +
            "Tell me why\n" +
            "Ain't nothin' but a heartache\n" +
            "Tell me why\n" +
            "Ain't nothin' but a mistake\n" +
            "Tell me why\n" +
            "I never wanna hear you say (Don't wanna hear you say)\n" +
            "I want it that way\n" +
            "Tell me why\n" +
            "Ain't nothin' but a heartache\n" +
            "Ain't nothin' but a mistake\n" +
            "Tell me why\n" +
            "I never wanna hear you say (Never wanna hear you say, yeah)\n" +
            "I want it that way\n" +
            "\n" +
            "[Outro: AJ]\n" +
            "'Cause I want it that way", "La canción se interpreta como una historia de amor en la que el cantante expresa su deseo de estar con su pareja y su necesidad de saber si ella también siente lo mismo. La letra es un poco ambigua y ha generado diferentes interpretaciones por parte de los fans, pero en general se considera una canción romántica y emotiva."),
    Song("Like a Virgin", "Madonna", "Like a Virgin", 1984, R.drawable.madonna_f53e, "[Verse 1]\n" +
            "I made it through the wilderness\n" +
            "Somehow I made it through\n" +
            "Didn't know how lost I was until I found you\n" +
            "I was beat, incomplete\n" +
            "I'd been had, I was sad and blue, but you made me feel\n" +
            "Yeah, you made me feel shiny and new\n" +
            "\n" +
            "[Chorus]\n" +
            "Like a virgin\n" +
            "Touched for the very first time\n" +
            "Like a virgin\n" +
            "When your heart beats next to mine\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "Gonna give you all my love, boy\n" +
            "My fear is fading fast\n" +
            "Been saving it all for you, 'cause only love can last\n" +
            "You're so fine and you're mine\n" +
            "Make me strong, yeah you make me bold, oh your love thawed out\n" +
            "Yeah, your love thawed out what was scared and cold\n" +
            "\n" +
            "[Chorus]\n" +
            "Like a virgin (Hey)\n" +
            "Touched for the very first time\n" +
            "Like a virgin\n" +
            "With your heartbeat next to mine\n" +
            "\n" +
            "Whoa whoa whoa\n" +
            "Whoa whoa whoa, ah\n" +
            "Whoa whoa whoa\n" +
            "\n" +
            "[Verse 3]\n" +
            "You're so fine and you're mine\n" +
            "I'll be yours 'til the end of time 'cause you made me feel\n" +
            "Yeah, you made me feel I've nothing to hide\n" +
            "\n" +
            "[Chorus]\n" +
            "Like a virgin (Hey)\n" +
            "Touched for the very first time\n" +
            "Like a virgin\n" +
            "With your heartbeat next to mine\n" +
            "\n" +
            "You might also like\n" +
            "Just a Girl\n" +
            "No Doubt\n" +
            "Like a Girl\n" +
            "Lizzo\n" +
            "No More Mr. Nice Guy\n" +
            "Alice Cooper\n" +
            "\n" +
            "[Outro]\n" +
            "Like a virgin\n" +
            "Ooh-ooh, like a virgin\n" +
            "Feels so good inside\n" +
            "When you hold me, and your heart beats, and you love me\n" +
            "Oh-ooh oh-oh-oh, ooh-ooh, ooh\n" +
            "Ooh baby, yeah\n" +
            "Can't you hear my heart beat for the very first time?", "La canción se ha interpretado de diversas maneras. Algunos ven el tema como una celebración de la sexualidad femenina y la liberación sexual. Otros ven la canción como una crítica al concepto de la virginidad y la presión que se ejerce sobre las mujeres para que se ajusten a ciertos estándares sociales. También se ha sugerido que la canción es una metáfora de la experiencia creativa de Madonna y su transformación en una estrella del pop."),
    Song("Take On Me", "A-ha", "Hunting High and Low", 1985, R.drawable.mariah_carey, "[Verse 1]\n" +
            "We're talking away\n" +
            "I don't know what I'm to say\n" +
            "I'll say it anyway\n" +
            "Today's another day to find you\n" +
            "Shying away\n" +
            "I'll be coming for your love, okay?\n" +
            "\n" +
            "[Chorus]\n" +
            "Take on me (Take on me)\n" +
            "Take me on (Take on me)\n" +
            "I'll be gone\n" +
            "In a day or two\n" +
            "\n" +
            "[Verse 2]\n" +
            "So, needless to say\n" +
            "I'm odds and ends\n" +
            "But I'll be stumbling away\n" +
            "Slowly learning that life is okay\n" +
            "Say after me\n" +
            "It's no better to be safe than sorry\n" +
            "\n" +
            "[Chorus]\n" +
            "Take on me (Take on me)\n" +
            "Take me on (Take on me)\n" +
            "I'll be gone\n" +
            "In a day or two\n" +
            "\n" +
            "[Instrumental Break]\n" +
            "\n" +
            "[Verse 3]\n" +
            "Oh, things that you say, yeah\n" +
            "Is it life or just to play my worries away?\n" +
            "You're all the things I've got to remember\n" +
            "You're shying away\n" +
            "I'll be coming for you anyway\n" +
            "\n" +
            "[Chorus]\n" +
            "Take on me (Take on me)\n" +
            "Take me on (Take on me)\n" +
            "I'll be gone\n" +
            "In a day\n" +
            "\n" +
            "[Outro]\n" +
            "(Take on me) (Take on me)\n" +
            "(Take me on) (Take on me)\n" +
            "I'll be gone (Take on me) (Take on me)\n" +
            "In a day (Take me on) (Take on me)\n" +
            "(Take on me) (Take on me)\n" +
            "(Take me on) (Take on me)\n" +
            "(Take on...)", "La canción es una mezcla de sintetizadores y elementos de rock y pop, y su letra trata sobre la atracción romántica y el deseo de una conexión emocional profunda. El verso \"I'll be gone in a day or two\" puede interpretarse como una referencia a la naturaleza efímera de las relaciones y la importancia de aprovechar el momento presente. La canción ha sido descrita como un himno pop icónico de los años 80 y ha sido reconocida por su pegadiza melodía y su distintivo videoclip animado."),
    Song("Thriller", "Michael Jackson", "Thriller", 1982, R.drawable.michael_jackson_portada_bad, "[Verse 1]\n" +
            "It's close to midnight\n" +
            "And something evil's lurking in the dark\n" +
            "Under the moonlight\n" +
            "You see a sight that almost stops your heart\n" +
            "You try to scream\n" +
            "But terror takes the sound before you make it\n" +
            "You start to freeze\n" +
            "As horror looks you right between the eyes\n" +
            "You're paralyzed\n" +
            "\n" +
            "[Chorus]\n" +
            "'Cause this is thriller, thriller night\n" +
            "And no one's gonna save you\n" +
            "From the beast about to strike\n" +
            "You know it's thriller, thriller night\n" +
            "You're fighting for your life inside a killer\n" +
            "Thriller tonight, yeah\n" +
            "Ooh\n" +
            "\n" +
            "[Verse 2]\n" +
            "You hear the door slam\n" +
            "And realize there's nowhere left to run\n" +
            "You feel the cold hand\n" +
            "And wonder if you'll ever see the sun\n" +
            "You close your eyes\n" +
            "And hope that this is just imagination (Girl)\n" +
            "But all the while\n" +
            "You hear a creature creepin’ up behind\n" +
            "You're out of time\n" +
            "\n" +
            "[Chorus]\n" +
            "'Cause this is thriller, thriller night\n" +
            "There ain't no second chance\n" +
            "Against the thing with forty eyes, girl\n" +
            "Thriller (Ooh), thriller night\n" +
            "You're fighting for your life\n" +
            "Inside a killer, thriller tonight\n" +
            "\n" +
            "[Bridge]\n" +
            "Night creatures call\n" +
            "And the dead start to walk in their masquerade\n" +
            "There's no escaping the jaws of the alien this time\n" +
            "(They're open wide)\n" +
            "This is the end of your life, ooh\n" +
            "\n" +
            "[Verse 3]\n" +
            "They're out to get you\n" +
            "There's demons closing in on every side (Ooh)\n" +
            "They will possess you\n" +
            "Unless you change that number on your dial\n" +
            "Now is the time\n" +
            "For you and I to cuddle close together, yeah\n" +
            "All through the night\n" +
            "I'll save you from the terror on the screen\n" +
            "I'll make you see\n" +
            "\n" +
            "[Chorus]\n" +
            "That this is thriller, thriller night\n" +
            "'Cause I can thrill you more\n" +
            "Than any ghoul would ever dare try\n" +
            "Thriller (Ooh), thriller night\n" +
            "So let me hold you tight\n" +
            "And share a killer, thriller, chiller\n" +
            "Thriller, here tonight\n" +
            "'Cause this is thriller, thriller night\n" +
            "Girl, I can thrill you more\n" +
            "Than any ghoul would ever dare try\n" +
            "Thriller (Ooh), thriller night\n" +
            "So let me hold you tight\n" +
            "And share a killer, thriller (Ow!)\n" +
            "\n" +
            "[Outro: Vincent Price & Michael Jackson]\n" +
            "I'm gonna thrill you tonight\n" +
            "Darkness falls across the land\n" +
            "The midnight hour is close at hand\n" +
            "Creatures crawl in search of blood\n" +
            "To terrorize y'all’s neighborhood (I'm gonna thrill you tonight)\n" +
            "And whosoever shall be found\n" +
            "Without the soul for getting down\n" +
            "Must stand and face the hounds of hell\n" +
            "And rot inside a corpse's shell\n" +
            "I'm gonna thrill you tonight\n" +
            "Thriller, ooh, babe (Thriller)\n" +
            "I'm gonna thrill you tonight (Thriller night)\n" +
            "Thriller, oh, darling (Oh, baby)\n" +
            "I'm gonna thrill you tonight (Thriller)\n" +
            "Ooh, babe (Thriller night)\n" +
            "I'm gonna thrill you tonight (Thriller)\n" +
            "Oh, darling (Oh, baby)\n" +
            "Thriller night, babe (Thriller night, babe)\n" +
            "Ooh\n" +
            "The foulest stench is in the air\n" +
            "The funk of forty thousand years (Thriller night, thriller)\n" +
            "And grisly ghouls from every tomb\n" +
            "Are closing in to seal your doom\n" +
            "And though you fight to stay alive\n" +
            "Your body starts to shiver (I'm gonna thrill you tonight)\n" +
            "For no mere mortal can resist\n" +
            "The evil of the thriller!\n" +
            "AHAHAHAHAHAHAHAHA\n" +
            "AHAHAHAHAHAHAHAHA!", "\"Thriller\" es una canción de horror que trata sobre una criatura malvada que acecha y ataca a su víctima en la noche. El simbolismo detrás de la canción es la idea de enfrentar nuestros miedos y superarlos. También representa la emoción y la emoción de estar asustado y emocionado al mismo tiempo. La canción es un homenaje a los clásicos de terror y se convirtió en un gran éxito, convirtiéndose en uno de los videos musicales más icónicos de todos los tiempos."),
    Song("Billie Jean", "Michael Jackson", "Thriller", 1982, R.drawable.michael_jackson_portada_bad, "[Verse 1]\n" +
            "She was more like a beauty queen from a movie scene\n" +
            "I said, \"Don't mind, but what do you mean, I am the one\n" +
            "Who will dance on the floor in the round?\"\n" +
            "She said I am the one\n" +
            "Who will dance on the floor in the round\n" +
            "She told me her name was Billie Jean as she caused a scene\n" +
            "Then every head turned with eyes that dreamed of bein' the one\n" +
            "Who will dance on the floor in the round\n" +
            "\n" +
            "[Pre-Chorus 1]\n" +
            "People always told me, \"Be careful of what you do\n" +
            "Don't go around breakin' young girls' hearts\" (Hee-hee)\n" +
            "And mother always told me, \"Be careful of who you love\n" +
            "And be careful of what you do (Oh-oh)\n" +
            "'Cause the lie becomes the truth\" (Oh-oh), hey-ey\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "Billie Jean is not my lover, uh\n" +
            "She's just a girl who claims that I am the one (Oh, baby)\n" +
            "But the kid is not my son (Hoo)\n" +
            "She says I am the one (Oh, baby)\n" +
            "But the kid is not my son (Hee-hee-hee, no-no, hee-hee-hee, hoo)\n" +
            "\n" +
            "[Verse 2]\n" +
            "For forty days and for forty nights, the law was on her side\n" +
            "But who can stand when she's in demand? Her schemes and plans\n" +
            "'Cause we danced on the floor in the round (Hee)\n" +
            "So take my strong advice\n" +
            "Just remember to always think twice\n" +
            "(Don't think twice) Do think twice! (A-hoo!)\n" +
            "She told my baby we'd danced 'til three, then she looked at me\n" +
            "Then showed a photo of a baby cryin', his eyes were like mine (Oh, no)\n" +
            "'Cause we danced on the floor in the round, baby (Ooh, hee-hee-hee)\n" +
            "\n" +
            "[Pre-Chorus 2]\n" +
            "People always told me, \"Be careful of what you do\n" +
            "And don't go around breakin' young girls' hearts\" (Don't break no hearts; hee-hee)\n" +
            "But she came and stood right by me\n" +
            "Just the smell of sweet perfume (Ha-oh)\n" +
            "This happened much too soon (Ha-oh, ha-ooh)\n" +
            "She called me to her room (Ha-oh, hoo), hey-ey\n" +
            "\n" +
            "You might also like\n" +
            "Jimmy Cooks\n" +
            "Drake\n" +
            "Glimpse of Us\n" +
            "Joji\n" +
            "You’re On Your Own, Kid\n" +
            "Taylor Swift\n" +
            "\n" +
            "[Chorus]\n" +
            "Billie Jean is not my lover (Hoo)\n" +
            "She's just a girl who claims that I am the one\n" +
            "But the kid is not my son\n" +
            "No-no-no, no-no-no-no-no-no (Hoo)\n" +
            "Billie Jean is not my lover, uh\n" +
            "She's just a girl who claims that I am the one (Oh, baby)\n" +
            "But the kid is not my son (Oh, no, no)\n" +
            "She says I am the one (Oh, baby)\n" +
            "But the kid is not my son (No, hee-hee-hee, ah, hee-hee-hee)\n" +
            "\n" +
            "[Break]\n" +
            "Hee, hoo\n" +
            "\n" +
            "[Chorus]\n" +
            "She says I am the one, uh\n" +
            "But the kid is not my son (No-no-no, hoo, ohh)\n" +
            "Billie Jean is not my lover, uh\n" +
            "She's just a girl who claims that I am the one (You know what you did to me, baby)\n" +
            "But the kid is not my son\n" +
            "No-no-no (No-no-no, ah), no-no-no-no (No-no-no)\n" +
            "She says I am the one (No)\n" +
            "But the kid is not my son (No-no-no-no)\n" +
            "\n" +
            "[Outro]\n" +
            "She says I am the one (You know what you did)\n" +
            "She says he is my son (Breakin' my heart, babe)\n" +
            "She says I am the one\n" +
            "Yeah, yeah, Billie Jean is not my lover, uh\n" +
            "Yeah, Billie Jean is not my lover, uh\n" +
            "Yeah, Billie Jean is not my lover, uh (She is just a girl)\n" +
            "Yeah, Billie Jean is not my lover, uh (She is just a girl; don't call me Billie Jean, hoo)\n" +
            "Billie Jean is not my lover, uh (She is just a girl; she's not at the scene)\n" +
            "Billie Jean is not (Hee), aaow, ooh\n" +
            "Yeah, Billie Jean is", "La letra de la canción cuenta la historia de una mujer que afirmaba que Michael Jackson era el padre de uno de sus hijos. Según Jackson, la canción fue inspirada en varias mujeres que habían afirmado ser madres de su hijo. La canción también habla sobre el acoso y la presión que Jackson experimentó en su vida personal y profesional.\n" +
            "Es importante mencionar que \"Billie Jean\" fue uno de los mayores éxitos de la carrera de Michael Jackson, llegando al puesto número uno en las listas de éxitos de Estados Unidos y varios otros países. La canción también es famosa por su icónico riff de sintetizador y por su distintivo video musical."),
    Song("I Kissed a Girl", "Katy Perry", "One of the Boys", 2008, R.drawable.a_971243_1621271824_7896, "[Verse 1]\n" +
            "This was never the way I planned\n" +
            "Not my intention\n" +
            "I got so brave, drink in hand\n" +
            "Lost my discretion\n" +
            "It's not what I'm used to\n" +
            "Just wanna try you on\n" +
            "I'm curious for you\n" +
            "Caught my attention\n" +
            "\n" +
            "[Chorus]\n" +
            "I kissed a girl and I liked it\n" +
            "The taste of her cherry chapstick\n" +
            "I kissed a girl just to try it\n" +
            "I hope my boyfriend don't mind it\n" +
            "It felt so wrong, it felt so right\n" +
            "Don't mean I'm in love tonight\n" +
            "I kissed a girl and I liked it\n" +
            "I liked it\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "No, I don't even know your name\n" +
            "It doesn't matter\n" +
            "You're my experimental game\n" +
            "Just human nature\n" +
            "It's not what good girls do\n" +
            "Not how they should behave\n" +
            "My head gets so confused\n" +
            "Hard to obey\n" +
            "\n" +
            "[Chorus]\n" +
            "I kissed a girl and I liked it\n" +
            "The taste of her cherry chapstick\n" +
            "I kissed a girl just to try it\n" +
            "I hope my boyfriend don't mind it\n" +
            "It felt so wrong, it felt so right\n" +
            "Don't mean I'm in love tonight\n" +
            "I kissed a girl and I liked it\n" +
            "I liked it\n" +
            "\n" +
            "[Bridge]\n" +
            "Us girls, we are so magical\n" +
            "Soft skin, red lips, so kissable\n" +
            "Hard to resist, so touchable\n" +
            "Too good to deny it\n" +
            "Ain't no big deal, it's innocent\n" +
            "\n" +
            "You might also like\n" +
            "Cupid (Twin Version)\n" +
            "FIFTY FIFTY (피프티피프티)\n" +
            "Search & Rescue\n" +
            "Drake\n" +
            "The Grants\n" +
            "Lana Del Rey\n" +
            "\n" +
            "[Chorus]\n" +
            "I kissed a girl and I liked it\n" +
            "The taste of her cherry chapstick\n" +
            "I kissed a girl just to try it\n" +
            "I hope my boyfriend don't mind it\n" +
            "It felt so wrong, it felt so right\n" +
            "Don't mean I'm in love tonight\n" +
            "I kissed a girl and I liked it\n" +
            "I liked it", " La canción \"I Kissed a Girl\" es un himno a la libertad sexual femenina, en el que la cantante Katy Perry explora su curiosidad y atracción por una chica. La canción se ha interpretado como una crítica a la cultura conservadora y heteronormativa que a menudo limita la expresión sexual femenina. En lugar de sentirse avergonzada o juzgada por su experiencia, Perry celebra su beso con una chica como algo liberador y emocionante. La canción fue un gran éxito y ayudó a establecer a Katy Perry como una de las artistas pop más relevantes del momento."),
    Song("Yesterday", "The Beatles", "Help!", 1965, R.drawable.the_beatles, "[Verse 1]\n" +
            "Yesterday\n" +
            "All my troubles seemed so far away\n" +
            "Now it looks as though they're here to stay\n" +
            "Oh, I believe in yesterday\n" +
            "\n" +
            "[Verse 2]\n" +
            "Suddenly\n" +
            "I'm not half the man I used to be\n" +
            "There's a shadow hanging over me\n" +
            "Oh, yesterday came suddenly\n" +
            "\n" +
            "[Chorus]\n" +
            "Why she had to go? I don't know, she wouldn't say\n" +
            "I said something wrong, now I long for yesterday\n" +
            "\n" +
            "[Verse 3]\n" +
            "Yesterday\n" +
            "Love was such an easy game to play\n" +
            "Now I need a place to hide away\n" +
            "Oh, I believe in yesterday\n" +
            "\n" +
            "[Chorus]\n" +
            "Why she had to go? I don't know, she wouldn't say\n" +
            "I said something wrong, now I long for yesterday\n" +
            "\n" +
            "[Verse 4]\n" +
            "Yesterday\n" +
            "Love was such an easy game to play\n" +
            "Now I need a place to hide away\n" +
            "Oh, I believe in yesterday\n" +
            "\n" +
            "[Outro]\n" +
            "Mmm-mmm-mmm-mmm-mmm, hmm-hmm", "La canción se centra en la nostalgia por el pasado y la pérdida de un amor. Es una de las canciones más famosas de The Beatles y ha sido interpretada por muchos artistas en todo el mundo. La letra y la melodía melancólica de la canción evocan una sensación de tristeza y añoranza, y es considerada una de las mejores canciones de la historia de la música."),
    Song("Your Song", "Elton John", "Elton John", 1975, R.drawable.elton_john_2011_shankbone_2__cropped_, "[Verse 1]\n" +
            "It's a little bit funny\n" +
            "This feeling inside\n" +
            "I'm not one of those who can easily hide\n" +
            "I don't have much money, but boy if I did\n" +
            "I'd buy a big house where we both could live\n" +
            "\n" +
            "[Verse 2]\n" +
            "If I was a sculptor, heh\n" +
            "But then again, no\n" +
            "Or a man who makes potions in a traveling show\n" +
            "I know it's not much, but it's the best I can do\n" +
            "My gift is my song and this one's for you\n" +
            "\n" +
            "[Chorus]\n" +
            "And you can tell everybody\n" +
            "This is your song\n" +
            "It may be quite simple, but now that it's done\n" +
            "I hope you don't mind\n" +
            "I hope you don't mind\n" +
            "That I put down in the words\n" +
            "How wonderful life is while you're in the world\n" +
            "\n" +
            "[Verse 3]\n" +
            "I sat on the roof and kicked off the moss\n" +
            "Well a few of the verses, well they've got me quite cross\n" +
            "But the sun's been quite kind\n" +
            "While I wrote this song\n" +
            "It's for people like you that keep it turned on\n" +
            "\n" +
            "[Verse 4]\n" +
            "So excuse me forgetting\n" +
            "But these things I do\n" +
            "You see I've forgotten, if they're green or they're blue\n" +
            "Anyway the thing is, what I really mean\n" +
            "Yours are the sweetest eyes I've ever seen\n" +
            "\n" +
            "[Chorus]\n" +
            "And you can tell everybody\n" +
            "This is the song\n" +
            "It may be quite simple, but now that it's done\n" +
            "I hope you don't mind\n" +
            "I hope you don't mind\n" +
            "That I put down in the words\n" +
            "How wonderful life is while you're in the world\n" +
            "\n" +
            "[Outro]\n" +
            "I hope you don't mind\n" +
            "I hope you don't mind\n" +
            "That I put down in the words\n" +
            "How wonderful life is while you're in the world", "\"Your Song\" es una balada de amor escrita por Bernie Taupin y compuesta por Elton John. La canción habla de un amor simple, pero genuino, y la letra refleja la humildad y sinceridad del cantante. La canción se ha convertido en un clásico y ha sido versionada por muchos artistas debido a su mensaje universal de amor y gratitud por la vida.")
)

val songRyb = listOf(

    Song("Poison", "Bell Biv Devoe", "Poison", 1990, R.drawable.bell_biv_devoe, "[Intro: Michael Bivins, Ronnie DeVoe, Ricky Bell]\n" +
            "Yeah, Spyderman and Freeze in full effect\n" +
            "Uh-huh\n" +
            "You ready, Ron?\n" +
            "I'm ready\n" +
            "You ready, Biv?\n" +
            "I'm ready, Slick, are you?\n" +
            "Oh, yeah, break it down\n" +
            "\n" +
            "[Verse 1: Michael Bivins, Ronnie DeVoe, Ricky Bell]\n" +
            "Girl, I, must (Warn you)\n" +
            "I sense something strange in my mind\n" +
            "Situation is (Serious)\n" +
            "Let's cure it 'cause we're running out of time\n" +
            "It's oh, so (Beautiful)\n" +
            "Relationships they seem from the start\n" +
            "It's all so (Deadly)\n" +
            "When love is not together from the heart\n" +
            "\n" +
            "[Chorus: Ricky Bell]\n" +
            "It's drivin' me out of my mind!\n" +
            "That's why it's hard for me to find\n" +
            "Can't get it out of my head!\n" +
            "Miss her, kiss her, love her\n" +
            "(Wrong move you're dead!)\n" +
            "\n" +
            "[Post-Chorus: Ricky Bell]\n" +
            "That girl is (Poison)...\n" +
            "Never trust a big butt and smile\n" +
            "That girl is (Poison)..\n" +
            "(\"POISON!!\")\n" +
            "\n" +
            "[Verse 2: Michael Bivins, Ronnie DeVoe, Ricky Bell]\n" +
            "[If I were you I'd take pre-]\n" +
            "(-caution)\n" +
            "Before I step to meet a fly girl, you know?\n" +
            "'Cause in some (Portions)\n" +
            "You'll think she's the best thing in the world\n" +
            "She's so - (Fly)\n" +
            "She'll drive you right out of your mind\n" +
            "And steal your heart when you're blind\n" +
            "Beware she's schemin', she'll make you think you're dreamin'\n" +
            "You'll fall in love and you'll be screamin', \"Demon!\"\n" +
            "\n" +
            "[Verse 3: Ronnie Devoe]\n" +
            "Poison, deadly, movin' in slow\n" +
            "Lookin for a mellow fellow like DeVoe\n" +
            "Gettin paid, laid, so better lay low\n" +
            "Schemin on house, money, and the whole show\n" +
            "The low pro ho she'll be cut like an aaa-FRO\n" +
            "See what you're sayin', huh, she's a winner to you\n" +
            "But I know she's a loser (How do you know?)\n" +
            "Me and the crew used to do her!\n" +
            "\n" +
            "[Bridge: All]\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\"\n" +
            "\"POISON!\n" +
            "\n" +
            "[Verse 4: Michael Bivins]\n" +
            "I was at the park, shake, breakin and takin 'em all\n" +
            "And that night, I played the wall\n" +
            "Checkin' out the fellas, the highs and lows\n" +
            "Keepin' one eye open, still clockin' the hoes\n" +
            "There was one particular girl that stood out from the rest\n" +
            "Poison as can be, the high power chest\n" +
            "Michael Biv here and I'm runnin' the show\n" +
            "Bell, Biv DeVoe [Ronnie laughs]\n" +
            "..now you know!\n" +
            "Yo, Slick, blow..\n" +
            "\n" +
            "[Pre-Chorus: Michael Bivins]\n" +
            "It's drivin' me out of my mind!\n" +
            "That's why it's HARD for me to find\n" +
            "Can't get it out of my head!\n" +
            "Miss her, kiss her, love her\n" +
            "(Wrong move you're dead!)\n" +
            "\n" +
            "[Chorus: Michael Bivins]\n" +
            "That girl is (Poison)...\n" +
            "Never trust a big butt and smile\n" +
            "That girl is (Poison)..\n" +
            "(\"POISON!!\")\n" +
            "\n" +
            "[B.B.D. Adlibs]\n" +
            "Yo' fellas, that was my end of..\n" +
            "You know what I'm sayin', Mike?\n" +
            "Yeah, B.B.D. in full effect\n" +
            "Yo', wassup to Ralph T and Johnny G\n" +
            "And I can't forget about my boy, B. Brown\n" +
            "And the whole NE crew\n" +
            "\n" +
            "Poison..\n" +
            "[Bell harmonies]\n", "La canción \"Poison\" habla sobre una mujer que es venenosa y peligrosa para los hombres que se acercan a ella. El sentido simbólico puede interpretarse como una advertencia para tener cuidado con las personas tóxicas en nuestras vidas y alejarnos de ellas antes de que nos lastimen. También puede ser una reflexión sobre la idea de que el amor no siempre es lo que parece y que las apariencias pueden ser engañosas."),
    Song("No Diggity", "Blackstreet (ft. Dr. Dre, Queen Pen)", "Another Level", 1996, R.drawable.blackstreet, "[Intro]\n" +
            "Yeah\n" +
            "You know what?\n" +
            "I like the playettes\n" +
            "No diggity, no doubt, uh\n" +
            "Play on, playette\n" +
            "Play on, playette\n" +
            "Yo, Dre, drop the verse\n" +
            "\n" +
            "[Verse 1: Dr. Dre]\n" +
            "It's going down, fade to Blackstreet\n" +
            "The homies got at me, collab' creations bump like acne\n" +
            "No doubt, I put it down, never slouch\n" +
            "As long as my credit can vouch, a dog couldn't catch me **** out\n" +
            "Tell me who can stop when Dre makin' moves\n" +
            "Attracting honeys like a magnet\n" +
            "Giving 'em eargasms with my mellow accent\n" +
            "Still moving this flavor\n" +
            "With the homies Blackstreet and Teddy\n" +
            "The original rump shakers\n" +
            "\n" +
            "[Verse 2: Teddy Riley]\n" +
            "Shorty get down, good Lord\n" +
            "Baby got 'em open all over town\n" +
            "Strictly biz, she don't play around\n" +
            "Cover much grounds, got game by the pound\n" +
            "Getting paid is her forte\n" +
            "Each and every day, true player way\n" +
            "I can't get her out of my mind (Wow)\n" +
            "I think about the girl all the time (Wow-wow)\n" +
            "East side to the west side\n" +
            "Pushin' phat rides, it's no surprise\n" +
            "She got tricks in the stash, stacking up the cash\n" +
            "Fast when it comes to the gas\n" +
            "By no means average\n" +
            "She's on when she's got to have it\n" +
            "Baby, you're a perfect ten, I wanna get in\n" +
            "Can I get down so I can win?\n" +
            "\n" +
            "[Chorus: Teddy Riley & Chauncey \"Black\" Hannibal]\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Bag it up)\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Bag it up, girl)\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Bag it up)\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Get up)\n" +
            "\n" +
            "[Verse 3: Chauncey \"Black\" Hannibal]\n" +
            "She's got class and style\n" +
            "Street knowledge by the pound\n" +
            "Baby never act wild\n" +
            "Very low-key on the profile\n" +
            "Catchin' feelings is a no\n" +
            "Let me tell you how it goes\n" +
            "Herb's the word, spin's the verb\n" +
            "Lovers, it curves, so freak what you heard\n" +
            "Rollin' with the phatness\n" +
            "You don't even know what the half is\n" +
            "You've got to pay to play\n" +
            "Just for shorty bang-bang to look your way\n" +
            "I like the way you work it\n" +
            "Trump tight all day, every day\n" +
            "You're blowing my mind, maybe in time\n" +
            "Baby, I can get you in my ride\n" +
            "\n" +
            "[Chorus: Teddy Riley & Chauncey \"Black\" Hannibal]\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Bag it up)\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Oh, yeah)\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Bag it up, babe)\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Get up)\n" +
            "\n" +
            "[Break: Teddy Riley & Chauncey \"Black\" Hannibal]\n" +
            "Hey yo, hey yo, hey yo, hey yo (Hey yo, that girl looks good)\n" +
            "Hey yo, hey yo, hey yo, hey yo (Play on, play on, play on)\n" +
            "Hey yo, hey yo, hey yo, hey yo (You're my kind of girl)\n" +
            "Hey yo, hey yo, hey yo, hey yo (Hey yo)\n" +
            "\n" +
            "[Verse 4: Queen Pen]\n" +
            "'Cause that's my peeps and we rolls deep\n" +
            "Flyin' first class from New York City to Blackstreet\n" +
            "What you know about me? Not a **** thing\n" +
            "Cartier wooden frames sported by my shorty\n" +
            "As for me, icy gleaming pinkie diamond ring\n" +
            "We bes the baddest clique up on the scene\n" +
            "Ain't you getting bored with these fake-**** broads?\n" +
            "I shows and proves, no doubt, I been diggin' you so\n" +
            "Please excuse if I come across rude, that's just me\n" +
            "And that's how a playette's got to be\n" +
            "Stay kickin' game with a capital G\n" +
            "Ask the peoples on my block, I'm as real as can be\n" +
            "Word is bond, faking moves never been my thing\n" +
            "So, Teddy, pass the word to your **** Chauncy\n" +
            "I'll be sending the call, let's say, around 3:30\n" +
            "Queen Pen and Blackstreet, it's no diggity (No diggity, no doubt, baby)\n" +
            "\n" +
            "[Chorus: Teddy Riley & Chauncey \"Black\" Hannibal]\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Girl, you got it going on)\n" +
            "I like the way you work it\n" +
            "No diggity, I got to bag it up (Play on, play on, play on)\n" +
            "(Hey yo, hey yo, hey yo, hey yo) I like the way you work it\n" +
            "No diggity, I got to bag it up (Hey, ooh)\n" +
            "(Hey yo, hey yo, hey yo, hey yo) I like the way you work it\n" +
            "No diggity, I got to bag it up (Hell, yeah, babe)\n" +
            "\n" +
            "[Outro: Teddy Riley & Chauncey \"Black\" Hannibal]\n" +
            "Yeah, come on\n" +
            "Becky in full effect (No doubt)\n" +
            "Lisa in full effect (Right)\n" +
            "Vicky in full effect (Uh-huh)\n" +
            "Tamika in full effect (Yeah)\n" +
            "Blaze in full effect (Right)\n" +
            "Ain't nothin' goin' on but the rent (No doubt)\n" +
            "Yeah, play on, playette (Play on, playette)\n" +
            "Play on (Play on), play on (play on)\n" +
            "'Cause I like it (Right)\n" +
            "No diggity, no doubt, yeah\n" +
            "Blackstreet productions\n" +
            "We out, we out (Right)\n" +
            "We out, we out", "\"No Diggity\" es una canción de R&B y hip-hop que se ha convertido en un clásico de la música popular. La canción presenta un ritmo pegajoso y una letra seductora que ha sido interpretada como un himno a la autoconfianza y el poder sexual.\n" +
            "\n" +
            "El título de la canción, \"No Diggity\", es una expresión coloquial que significa \"sin duda\" o \"de ninguna manera\", y se utiliza en la letra para subrayar la fuerza y la determinación del protagonista. La canción habla de un hombre que está seguro de sí mismo y de sus habilidades para atraer a las mujeres, y que no está dispuesto a permitir que nada se interponga en su camino.\n" +
            "\n" +
            "Además de su letra sugestiva, \"No Diggity\" también es conocida por su famoso riff de piano, que ha sido sampleado y utilizado en numerosas canciones y películas. En general, la canción representa un momento icónico de la música popular de los años 90 y sigue siendo un favorito de los fans del R&B y el hip-hop."),
    Song("I Wanna Sex You Up", "Color Me Badd", "C.M.B.", 1991, R.drawable.color_me_badd, "[Intro - repeated throughout]\n" +
            "A tick tock, ya don't stop\n" +
            "To the tick tock, ya don't stop\n" +
            "To the tick tock, ya don't stop\n" +
            "To the tick tock, ya don't stop\n" +
            "\n" +
            "[Verse 1: Bryan Abrams]\n" +
            "Come inside, take off your coat\n" +
            "I'll make you feel at home\n" +
            "Now let's pour a glass of wine\n" +
            "'Cause now we're all alone\n" +
            "I've been waiting all night\n" +
            "So just let me hold you close to me\n" +
            "'Cause I've been dying for you girl\n" +
            "To make love to me\n" +
            "\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "(Ooo) Girl, you make me feel real good\n" +
            "(Ooo) We can do it 'til we both wake up\n" +
            "(Ooo) Girl, you know I'm hooked on you\n" +
            "(Ooo) And this is what I'll do\n" +
            "\n" +
            "[Chorus]\n" +
            "(I wanna love you down)\n" +
            "(Ooo, I wanna sex you up)\n" +
            "All night (You make me feel good)\n" +
            "I want to (Let me rub you down)\n" +
            "(Ooo, I wanna sex you up)\n" +
            "\n" +
            "[Verse 2]\n" +
            "Let me take off all your clothes\n" +
            "Disconnect the phone, so nobody knows\n" +
            "Let me light a candle\n" +
            "So we can make it better\n" +
            "Makin' love until we drown, dig\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "(Ooo) Girl, you know it feels real good\n" +
            "(Ooo) We can do it 'til we both wake up\n" +
            "(Ooo) Girl, you know I'm hooked on you\n" +
            "(Ooo) And this is what I'll do\n" +
            "\n" +
            "You might also like\n" +
            "BULLET\n" +
            "NF\n" +
            "Motownphilly\n" +
            "Boyz II Men\n" +
            "Silent Night\n" +
            "Christmas Songs\n" +
            "\n" +
            "[Chorus]\n" +
            "(Ooo, yeah) I wanna sex you up\n" +
            "Makin' love until we drown\n" +
            "(Ooo) I wanna sex you up\n" +
            "(Ah, ah)\n" +
            "\n" +
            "[Bridge: Spoken]\n" +
            "Girl, you just make me feel so good\n" +
            "I just wanna, I just wanna look at you\n" +
            "Don't say anything at all\n" +
            "Just lay back, and enjoy the ride, yeah\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "All I want to do is\n" +
            "\n" +
            "[Chorus]\n" +
            "(I wanna love you down)\n" +
            "(Ooo, I wanna sex you up)\n" +
            "All night (You make me feel good)\n" +
            "I want to (Let me rub you down)\n" +
            "(Ooo, I wanna sex you up)\n" +
            "\n" +
            "[Outro]\n" +
            "Make sweet lovin' all night long (Ooo, I wanna sex you up)\n" +
            "Feels so right, it can't be wrong (Ooo)\n" +
            "Don't be shy girl, rescue me (Ooo, I wanna sex you up)\n" +
            "Open up your heart, and I'll set you free\n" +
            "Oh, I wanna touch you in all the right places, baby\n" +
            "I wanna make love to you, yeah\n" +
            "All night, all night, yeah\n" +
            "To me, yeah\n" +
            "Make sweet lovin' all night long\n" +
            "Feels so right, it can't be wrong\n" +
            "Don't be shy girl, rescue me", "La canción \"I Wanna Sex You Up\" es una canción de amor y seducción que describe el deseo físico del cantante hacia su pareja. Aunque la letra puede ser considerada explícita y sexual, en su sentido simbólico la canción también puede interpretarse como una expresión de amor y pasión. El título de la canción, \"I Wanna Sex You Up\", puede entenderse como una forma de expresar el deseo de acercarse íntimamente a la persona amada, y la letra de la canción hace referencia a diferentes formas de seducción y cariño, como los besos y los abrazos. En resumen, la canción puede interpretarse como una expresión de amor y pasión, aunque su lenguaje y temática son sexualmente explícitos."),
    Song("My Boo", "Ghost Town DJs", "So So Def Bass All-Stars Vol. 2", 1996, R.drawable.ghost_town_djs, "[Intro]\n" +
            "Boy you should know that\n" +
            "I've got you on my mind\n" +
            "Your secret admirer\n" +
            "I've been watching you\n" +
            "\n" +
            "[Chorus]\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your lovin' strong, gonna give my all to you\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your love is strong gonna give my all to you\n" +
            "\n" +
            "\n" +
            "[Verse 1]\n" +
            "Every day I pray my heart can win\n" +
            "Every night I pray I can call you my man (Yeah, yeah, yeah)\n" +
            "I need you, I want you, to have you, hold you, squeeze you\n" +
            "So I'm going out every weekend just to see my boo again\n" +
            "\n" +
            "[Chorus]\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your love is strong, gonna give my all to you\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your love is strong gonna give my all to you\n" +
            "\n" +
            "[Verse 2]\n" +
            "These feelings I have for you can go deeper if you can come\n" +
            "Correct with your game boy (No, no), no, you can't be lame, boy\n" +
            "But if you can please me then my love will come easy\n" +
            "I'll do anything you want, freak me boy, I'm thinking of you\n" +
            "\n" +
            "[Chorus]\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your lovin' strong, gonna give my all to you\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your love is strong, gonna give my all to you\n" +
            "\n" +
            "You might also like\n" +
            "Blind\n" +
            "SZA\n" +
            "HOPE\n" +
            "NF\n" +
            "Favorite Song\n" +
            "Toosii\n" +
            "\n" +
            "[Bridge]\n" +
            "Boy you've got all I need from what I see\n" +
            "And boy every night I am constantly thinking of you\n" +
            "\n" +
            "[Chorus]\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your lovin' strong, gonna give my all to you\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your lovein' strong, gonna give my all to you\n" +
            "\n" +
            "[Outro]\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your lovin' strong, gonna give my all to you\n" +
            "At night I think of you\n" +
            "I want to be your lady, maybe\n" +
            "If your game is on give me a call, boo\n" +
            "If your lovein' strong, gonna give my all to you", "La canción \"My Boo\" es un clásico del género de la música electrónica y del baile de la década de 1990. La letra habla sobre la conexión emocional y física entre dos personas que se atraen mutuamente, lo que se puede interpretar como un sentido de amor y romance. La canción también tiene un sentido simbólico de nostalgia y melancolía, ya que evoca recuerdos de la época en que fue lanzada y de la cultura pop de los años 90. En resumen, \"My Boo\" es una canción que transmite sentimientos de amor, conexión emocional y nostalgia, y es un clásico del género de la música electrónica y del baile."),
    Song("Pony", "Ginuwine (el nombre real del artista es Elgin Baylor Lumpkin)", "Ginuwine...the Bachelor", 1996, R.drawable.ginuwine_performing_in_austin__texas_2014, "[Verse 1]\n" +
            "I'm just a bachelor\n" +
            "I'm looking for a partner\n" +
            "Someone who knows how to ride\n" +
            "Without even falling off\n" +
            "Gotta be compatible takes me to my limits\n" +
            "Girl when I break you off\n" +
            "I promise that you won't wanna get off\n" +
            "\n" +
            "[Chorus]\n" +
            "If you're horny, let's do it, ride it, my pony\n" +
            "My saddle's waitin', come and jump on it\n" +
            "If you're horny, let's do it, ride it, my pony\n" +
            "My saddle's waitin', come and jump on it\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "Sitting here flossing\n" +
            "Peeping your steelo\n" +
            "Just once if I have the chance\n" +
            "The things I would do to you\n" +
            "You and your body, every single portion\n" +
            "Send chills up and down your spine\n" +
            "Juices flowing down your thigh\n" +
            "\n" +
            "[Chorus]\n" +
            "If you're horny, let's do it, ride it, my pony\n" +
            "My saddle's waitin', come and jump on it\n" +
            "If you're horny, let's do it, ride it, my pony\n" +
            "My saddle's waitin', come and jump on it\n" +
            "\n" +
            "[Verse 3]\n" +
            "If we're gonna get nasty baby\n" +
            "First we'll show and tell\n" +
            "Till I reach your pony tail\n" +
            "Lurk all over and through you baby\n" +
            "Until we reach the stream\n" +
            "You'll be on my jockey team\n" +
            "(Ooooh)\n" +
            "\n" +
            "[Chorus]\n" +
            "If you're horny, let's do it, ride it, my pony\n" +
            "My saddle's waitin', come and jump on it\n" +
            "If you're horny, let's do it, ride it, my pony\n" +
            "My saddle's waitin', come and jump on it\n" +
            "If you're horny, let's do it, ride it, my pony\n" +
            "My saddle's waitin', come and jump on it\n" +
            "If you're horny, let's do it, ride it, my pony\n" +
            "My saddle's waitin', come and jump on it\n" +
            "If you're horny, let's do it, ride it, my pony\n" +
            "My saddle's waitin', come and jump on it\n" +
            "Ride it\n" +
            "My saddle\n" +
            "\n" +
            "You might also like\n" +
            "DEATH\n" +
            "Melanie Martinez\n" +
            "The Grants\n" +
            "Lana Del Rey\n" +
            "Eyes Closed\n" +
            "Ed Sheeran\n" +
            "\n" +
            "[Outro]\n" +
            "They throw the best damn party\n" +
            "They throw the best damn party\n" +
            "They throw the best damn party\n" +
            "They throw the best damn party\n" +
            "They throw the best damn party\n" +
            "They throw the best damn party\n" +
            "It's the urban up in here, A.K.A\n" +
            "[Spoken]\n" +
            "Throw the best damn party They throw the best\n" +
            "Damn, sick of being alone", "\"Pony\" es una canción R&B sensual que se ha convertido en un clásico del género. La letra de la canción, que es bastante explícita, habla de la atracción física y sexual entre un hombre y una mujer, con la metáfora de un \"pony\" como símbolo de la fuerza y la potencia sexual del hombre. La canción se ha convertido en un himno de la cultura pop, y ha sido utilizada en numerosas películas y programas de televisión, así como en la música de otros artistas. Además, \"Pony\" ha sido remezclada y reinterpretada en diferentes géneros musicales, lo que demuestra su influencia y relevancia hasta el día de hoy."),
    Song("Don't Walk Away", "Jade", "Jade to the Max", 1992, R.drawable.jade, "[Voicemail Intro]\n" +
            "\"Hi! We're not in right now\n" +
            "But if you leave your name and number\n" +
            "We'll get back to you, to you, to you\" *laughing*\n" +
            "\n" +
            "[Verse 1]\n" +
            "I got all this love, waiting just for you\n" +
            "I just gotta know, that your love is true\n" +
            "Can't keep running, boy, in and out my life\n" +
            "Wanna be your girl, not 'cause the mood is right\n" +
            "\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "If I let you come inside, tomorrow will you hide\n" +
            "Will you be there for me when I need someone to hold?\n" +
            "Baby, don't misunderstand, I do want you for my man\n" +
            "I just need a little time before I invest my love\n" +
            "\n" +
            "[Chorus]\n" +
            "Don't walk away, boy (Ooh, don't walk away)\n" +
            "My love won't hurt you (No, no)\n" +
            "Don't walk away, boy\n" +
            "I'll be right there for you\n" +
            "\n" +
            "[Verse 2]\n" +
            "You say all the things, that I like to hear\n" +
            "You push all my buttons, baby\n" +
            "Love to have you close to me\n" +
            "Wanna feel your love, wanna be for sure\n" +
            "That it's me you need, baby, each and every night\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "If I let you come inside, tomorrow will you hide\n" +
            "Will you be there for me when I need someone to hold?\n" +
            "Baby, don't misunderstand, I do want you for my man\n" +
            "I just need a little time before I invest my love\n" +
            "\n" +
            "[Chorus]\n" +
            "Don't walk away, boy (Don't walk away, boy)\n" +
            "My love won't hurt you (No)\n" +
            "Don't walk away, boy (Don't walk away)\n" +
            "I'll be right there for you\n" +
            "\n" +
            "You might also like\n" +
            "Love Song\n" +
            "Death Cab for Cutie\n" +
            "Nobody Gets Me\n" +
            "SZA\n" +
            "Good Times\n" +
            "Chic\n" +
            "\n" +
            "[Bridge]\n" +
            "Baby, don't misunderstand\n" +
            "I want you for my man\n" +
            "I need a little time\n" +
            "Before I give you my love\n" +
            "(Don't walk away, boy) Don't walk away\n" +
            "(I'll be right there for you)\n" +
            "\n" +
            "Don't walk away\n" +
            "\n" +
            "This is what it sounds like when we make love\n" +
            "(Don't walk away, boy)\n" +
            "(Don't walk away, boy)\n" +
            "(I'll be right there for you)\n" +
            "\n" +
            "Don't walk away\n" +
            "\n" +
            "[Chorus]\n" +
            "Don't walk away, boy (No)\n" +
            "My love won't hurt you (Won't hurt you)\n" +
            "Don't walk away, boy\n" +
            "I'll be right there for you (I'll be right there, oh yeah)\n" +
            "Don't walk away, boy (Don't walk away)\n" +
            "My love won't hurt you (No)\n" +
            "Don't walk away, boy\n" +
            "I'll be right there for you", "La canción \"Don't Walk Away\" de Jade es una canción de amor que habla de la importancia de luchar por una relación y no rendirse ante los obstáculos. El título de la canción y la letra hablan de no dar la espalda a una relación, incluso cuando las cosas se ponen difíciles. El sentido simbólico de la canción es que la perseverancia y el compromiso son claves para mantener una relación amorosa saludable y duradera. Además, la canción es un ejemplo del estilo de música R&B de la década de 1990, que se caracterizaba por las armonías vocales, las letras románticas y las melodías suaves y pegadizas."),
    Song("Fantasy", "Mariah Carey", "Daydream", 1995, R.drawable.mariah_carey, "[Verse 1]\n" +
            "Oh, when you walk by every night\n" +
            "Talking sweet and looking fine\n" +
            "I get kind of hectic inside\n" +
            "Mmm, baby, I'm so into you\n" +
            "Darling, if you only knew\n" +
            "All the things that flow through my mind\n" +
            "\n" +
            "[Chorus]\n" +
            "But it's just a sweet, sweet fantasy, baby\n" +
            "When I close my eyes, you come and take me\n" +
            "On and on and on, it's so deep in my daydreams\n" +
            "But it's just a sweet, sweet fantasy, baby (Fantasy)\n" +
            "(And I want you so badly)\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "Images of rapture\n" +
            "Creep into me slowly\n" +
            "As you're going to my head\n" +
            "And my heart beats faster\n" +
            "When you take me over\n" +
            "Time and time and time again\n" +
            "\n" +
            "[Chorus]\n" +
            "But it's just a sweet, sweet fantasy, baby\n" +
            "When I close my eyes, you come and take me\n" +
            "On and on and on, it's so deep in my daydreams\n" +
            "But it's just a sweet, sweet fantasy, baby (Fantasy)\n" +
            "Oh, oh, it's just a sweet, sweet fantasy, baby\n" +
            "When I close my eyes you come and take me\n" +
            "On and on and on, it's so deep in my daydreams\n" +
            "But it's just a sweet, sweet fantasy, baby (Fantasy)\n" +
            "\n" +
            "[Bridge]\n" +
            "I'm in heaven\n" +
            "With my boyfriend, my lovely boyfriend\n" +
            "There's no beginning and there is no end\n" +
            "Feels like I'm dreaming, but I'm not sleeping\n" +
            "\n" +
            "[Chorus]\n" +
            "Oh, it's just a sweet, sweet fantasy, baby\n" +
            "When I close my eyes, you come and take me\n" +
            "On and on and on, it's so deep in my daydreams\n" +
            "But it's just a sweet, sweet fantasy, baby\n" +
            "Sweet, sweet fantasy, baby\n" +
            "When I close my eyes, you come and take me\n" +
            "On and on and on, it's so deep in my daydreams\n" +
            "But it's just a sweet, sweet fantasy, baby\n" +
            "Sweet, sweet fantasy, baby\n" +
            "Sweet, sweet fantasy, baby", "La canción \"Fantasy\" de Mariah Carey se considera un himno de empoderamiento femenino y de liberación sexual. La letra de la canción habla de una fantasía sexual en la que Carey es dueña de su propia sexualidad y se siente libre de expresarla. La canción también hace referencia a la cultura pop y a la música de los años 80, lo que la convierte en una canción divertida y energética que ha sido muy popular desde su lanzamiento. En general, \"Fantasy\" se ha convertido en un himno para las mujeres que desean ser dueñas de su propia vida y sexualidad, y que están dispuestas a luchar por ello."),
    Song("Return of the Mack", "Mark Morrison", "Return of the Mack", 1996, R.drawable.mark_morrison, "[Intro]\n" +
            "Ooh-oh-oh-oh\n" +
            "Come on\n" +
            "Oh yeah\n" +
            "\n" +
            "[Verse 1]\n" +
            "Well, I tried to tell you so (Yes, I did)\n" +
            "But I guess you didn't know\n" +
            "As the saddest story goes\n" +
            "Baby, now I got the flow\n" +
            "'Cause I knew it from the start\n" +
            "Baby, when you broke my heart\n" +
            "That I had to come again\n" +
            "And show you that I'd win\n" +
            "\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "You lied to me\n" +
            "All those times I said that I loved you\n" +
            "You lied to me\n" +
            "Yes, I tried, yes I tried\n" +
            "You lied to me\n" +
            "Even though you knew I'd die for you\n" +
            "You lied to me\n" +
            "Yes, I cried, yes I cried\n" +
            "\n" +
            "[Chorus]\n" +
            "Return of the Mack (There it is)\n" +
            "Return of the Mack (Come on)\n" +
            "Return of the Mack (Oh my God)\n" +
            "You know that I'll be back (Here I am)\n" +
            "Return of the Mack (Once again)\n" +
            "Return of the Mack (Top of the world)\n" +
            "Return of the Mack (Watch my flow)\n" +
            "You know that I'll be back (Here I go)\n" +
            "\n" +
            "[Verse 2]\n" +
            "So, I'm back up in the game (Hustling slow)\n" +
            "Running things to keep my swing (All night long)\n" +
            "Letting all the people know\n" +
            "That I'm back to run the show\n" +
            "'Cause what you did you know was wrong\n" +
            "And all the nasty things you've done (Oh, oh, oh)\n" +
            "So baby listen carefully\n" +
            "While I sing my comeback song\n" +
            "\n" +
            "You might also like\n" +
            "Did you know that there’s a tunnel under Ocean Blvd\n" +
            "Lana Del Rey\n" +
            "HOPE\n" +
            "NF\n" +
            "One in a Million\n" +
            "Guns N’ Roses\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "You lied to me\n" +
            "'Cause she said she'd never turn on me\n" +
            "You lied to me\n" +
            "But you did, but you did\n" +
            "You lied to me\n" +
            "All this pain you said I'd never feel\n" +
            "You lied to me\n" +
            "But I do, but I do, do, do\n" +
            "\n" +
            "[Chorus]\n" +
            "Return of the Mack (There it is)\n" +
            "Return of the Mack (Hold on)\n" +
            "Return of the Mack (Don't you know)\n" +
            "You know that I'll be back (Here I go)\n" +
            "Return of the Mack (Oh, little girl)\n" +
            "Return of the Mack (Once my pearl)\n" +
            "Return of the Mack (Up and down)\n" +
            "You know that I'll be back (Round and round)\n" +
            "\n" +
            "[Interlude: Angie Brown]\n" +
            "Ahh, Mark, stop lying about your big break\n" +
            "For God sake, I need a real man, uh\n" +
            "(The return of the mack, aoww) stop letting me down\n" +
            "Stop letting me down\n" +
            "\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "You lied to me\n" +
            "Cause she said she'd never turn on me\n" +
            "You lied to me\n" +
            "But you did, but you did\n" +
            "You lied to me\n" +
            "All this pain you said I'd never feel\n" +
            "You lied to me\n" +
            "But I do, but I do, do, do\n" +
            "\n" +
            "[Chorus]\n" +
            "Return of the Mack (It is)\n" +
            "Return of the Mack (Come on)\n" +
            "Return of the Mack (Oh, my God)\n" +
            "You know that I'll be back (Here I am)\n" +
            "Return of the Mack (Once again)\n" +
            "Return of the Mack (Top of the world)\n" +
            "Return of the Mack (Watch my flow)\n" +
            "You know that I'll be back (Don't you know)\n" +
            "Return of the Mack (Here it is)\n" +
            "Return of the Mack (Hold on)\n" +
            "Return of the Mack (Be strong)\n" +
            "You know that I'll be back (Here I go)\n" +
            "Return of the Mack (My little baby)\n" +
            "Return of the Mack (Watch my flow)\n" +
            "Return of the Mack (Up and down)\n" +
            "You know that I'll be back (Round and round)", "La canción \"Return of the Mack\" de Mark Morrison es una celebración del regreso de un hombre poderoso y exitoso después de haber pasado por tiempos difíciles y haber superado los obstáculos. La letra de la canción hace referencia a las críticas y a los comentarios negativos que recibió el personaje principal en el pasado, pero enfatiza su determinación para seguir adelante y triunfar. En este sentido, la canción se convierte en un himno de superación personal y de confianza en uno mismo, y ha sido considerada como una canción inspiradora y motivadora para muchos oyentes. Además, su pegajoso ritmo y su estilo soul-funk la han convertido en un clásico de los años 90 y en una de las canciones más reconocidas de la carrera de Mark Morrison."),
    Song("Real Love", "Mary J.Blige", "What's the 411?", 1992, R.drawable.gettyimages_1153284320, "[Verse 1]\n" +
            "We are lovers through and through\n" +
            "And though we made it through the storm\n" +
            "I really want you to realize, I really want to put you on\n" +
            "I've been searching for someone to satisfy my every need\n" +
            "Won't you be my inspiration?\n" +
            "Be the real love that I need\n" +
            "\n" +
            "[Chorus]\n" +
            "Real love, I'm searching for a real love\n" +
            "Someone to set my heart free\n" +
            "Real love, I'm searching for a real love\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "Ooh, when I met you\n" +
            "I just knew that you would take my heart and run\n" +
            "Until you told me how you loved for me, you said I'm not the one\n" +
            "So I slowly came to see all of the things that you were made of\n" +
            "And now I hope my dreams and inspiration lead me towards a real love\n" +
            "\n" +
            "[Chorus]\n" +
            "Real love, I'm searching for a real love\n" +
            "Someone to set my heart free\n" +
            "Real love, I'm searching for a real love\n" +
            "I got to have a real love\n" +
            "\n" +
            "[Bridge]\n" +
            "Love so true, and oh baby, I thought that love was true\n" +
            "I thought that you were the answer to the question in my mind\n" +
            "But it seems that I was wrong, if I stay strong, maybe I'll find\n" +
            "A real love\n" +
            "\n" +
            "[Verse 3]\n" +
            "So I've tried my best and prayed to God he'll send me someone real\n" +
            "To caress me and to guide me towards a love my heart can feel\n" +
            "Now I know I can be faithful, I can be your all and all\n" +
            "Ill give you good lovin' through the summertime, winter, spring and fall\n" +
            "\n" +
            "[Chorus]\n" +
            "Real love, I'm searching for a real love (Real love, real love)\n" +
            "Someone to set my heart free\n" +
            "Real love, I'm searching for a real love\n" +
            "Real love, I'm searching for a real love\n" +
            "Someone to set my heart free\n" +
            "Real love, I'm searching for a real love\n" +
            "\n" +
            "You might also like\n" +
            "Did you know that there’s a tunnel under Ocean Blvd\n" +
            "Lana Del Rey\n" +
            "Whopper Whopper\n" +
            "Burger King\n" +
            "Nobody Gets Me\n" +
            "SZA\n" +
            "\n" +
            "[Bridge]\n" +
            "See, I'm searching for a real love and I don't know where to go\n" +
            "(Real love, I'm searching for a real love)\n" +
            "Been around the world and high and low and still I never know\n" +
            "(Someone to set my heart free\n" +
            "Real love, I'm searching for a real love)\n" +
            "How it feels to have a real love cause it seems it's not around\n" +
            "Gotta end it in this way 'cause it seems he can't be found\n" +
            "\n" +
            "[Chorus]\n" +
            "Real love, I'm searching for a real love\n" +
            "Someone to set my heart free\n" +
            "Real love, I'm searching for a real love\n" +
            "Real love, I'm searching for a real love\n" +
            "Someone to set my heart free\n" +
            "Real love, I'm searching for a real love\n" +
            "Real love", "\"Real Love\" es una canción sobre la búsqueda del amor verdadero y auténtico en un mundo lleno de superficialidad y falsedad. La letra habla sobre la necesidad de encontrar a alguien que nos acepte tal como somos y que nos ame de verdad, a pesar de nuestras imperfecciones. La canción también transmite un sentido de empoderamiento y confianza en uno mismo, al afirmar que no se conformará con menos que el amor verdadero. En este sentido, la canción es un himno a la autoestima y la autenticidad en las relaciones amorosas. La voz de Mary J. Blige, que combina elementos de R&B, soul y hip hop, se convierte en la perfecta transmisora de este mensaje de amor y respeto propio. \"Real Love\" se convirtió en un éxito instantáneo y ayudó a lanzar la carrera de Mary J. Blige como una de las artistas más influyentes y populares de la música negra de los años 90."),
    Song("Ascension (Don't Ever Wonder", "Maxwell", "Maxwell's Urban Hang Suite", 1996, R.drawable.maxwell, "[Verse 1]\n" +
            "It happened the moment, when you were revealed\n" +
            "'Cause you were a dream that you should not have been\n" +
            "A fantasy real\n" +
            "You gave me this beating, baby\n" +
            "This rhythm inside\n" +
            "And you made me feel good and feel nice and feel loved\n" +
            "Gave me paradise\n" +
            "\n" +
            "[Chorus]\n" +
            "So shouldn't I realize\n" +
            "You're the highest of the high\n" +
            "If you don't know, then I'll say it\n" +
            "So don't ever wonder (Don't ever wonder)\n" +
            "So shouldn't I realize (Shouldn't I realize)\n" +
            "You're the highest of the high\n" +
            "If you don't know, then I'll say it\n" +
            "So don't ever wonder\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "So tell me how long\n" +
            "How long it's gonna take until you speak, babe?\n" +
            "'Cause I can't live my life\n" +
            "Without you here by my side\n" +
            "You gave me the feelin', feelin' in my life\n" +
            "\n" +
            "[Chorus]\n" +
            "So shouldn't I realize\n" +
            "You're the highest of the high\n" +
            "If you don't know, then I'll say it\n" +
            "So don't ever wonder, wonder (Don't ever wonder)\n" +
            "Shouldn't I realize (Ooh, shouldn't I realize)\n" +
            "You're the highest of the high (That you're the highest of the high)\n" +
            "If you don't know, then I'll say it\n" +
            "So don't ever wonder (Don't ever wonder)\n" +
            "Shouldn't I realize\n" +
            "You're the highest of the high\n" +
            "If you don't know, then I'll say it\n" +
            "So don't ever wonder (Don't ever, don't ever wonder)\n" +
            "\n" +
            "[Outro]\n" +
            "Ooh (Don't ever wonder)\n" +
            "Ooh (Don't ever wonder)\n" +
            "(Don't ever wonder)\n" +
            "\n" +
            "You might also like\n" +
            "HOPE\n" +
            "NF\n" +
            "Used\n" +
            "SZA\n" +
            "Run This Town\n" +
            "JAY-Z\n" +
            "\n" +
            "Never question me (Don't ever wonder)\n" +
            "Without you, there's no me (Don't ever wonder)\n" +
            "(Don't ever wonder)\n" +
            "\n" +
            "Can't you see? (Don't ever wonder)\n" +
            "Can't you see? (Don't ever wonder)\n" +
            "(Don't ever wonder)\n", "\"Ascension (Don't Ever Wonder)\" es una canción de R&B/soul que habla de la búsqueda del amor y la intimidad emocional. El título de la canción sugiere una idea de elevación o ascenso hacia un estado superior de la existencia, y la letra de la canción habla de cómo el amor puede ser un camino hacia esa elevación. La canción también tiene un sentido de nostalgia por el pasado, ya que el cantante canta sobre los recuerdos de un amor anterior que lo ha llevado a buscar una conexión más profunda en el presente. En general, la canción transmite un sentido de esperanza y optimismo sobre la posibilidad de encontrar amor y felicidad en la vida."),
    Song("This Is How We Do It", "Montell Jordan", "This Is How We Do It", 1995, R.drawable.montell_jordan, "[Intro]\n" +
            "(Background chatter)\n" +
            "This is how we do it!\n" +
            "(This is how we do it!)\n" +
            "Sha la la la la la lo\n" +
            "Shabada lo lo lo, whoa\n" +
            "(This is how we do it!)\n" +
            "Lo lo lo low-oh-oh\n" +
            "\n" +
            "[Verse 1]\n" +
            "This is how we do it\n" +
            "It's Friday night, and I feel alright\n" +
            "The party is here on the West Side\n" +
            "So I reach for my 40 and I turn it up\n" +
            "Designated driver, take the keys to my truck\n" +
            "Hit the 'shaw cause I'm faded\n" +
            "Honies in the street say, \"Monty, yo, we made it!\"\n" +
            "It feels so good in my hood tonight\n" +
            "The summertime skirts and the guys in Kani\n" +
            "All the gangbangers forgot about the drive-by\n" +
            "You gotta get your groove on, before you go get paid\n" +
            "\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "So tip up your cup and throw your hands up\n" +
            "And let me hear the party say\n" +
            "\n" +
            "[Chorus]\n" +
            "I'm kinda buzzed and it's all because (This is how we do it)\n" +
            "South Central does it like nobody does (This is how we do it)\n" +
            "To all my neighbors, you got much flavor (This is how we do it)\n" +
            "Let's flip the track, bring the old school back (this is how we do it)\n" +
            "\n" +
            "[Verse 2]\n" +
            "This is how we do it, all hands are in the air\n" +
            "And wave them from here to there\n" +
            "If you're an O.G. mack or a wannabe player\n" +
            "You see the hood's been good to me\n" +
            "Ever since I was a lower-case g\n" +
            "But now I'm a big G\n" +
            "The girls see I got the money\n" +
            "Hundred-dollar bills, y'all\n" +
            "If you were from where I'm from then you would know\n" +
            "That I gotta get mine in a big black truck\n" +
            "You can get yours in a '64\n" +
            "Whatever it is, the party's underway\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "So tip up your cup and throw your hands up\n" +
            "And let me hear the party say...\n" +
            "\n" +
            "You might also like\n" +
            "Special\n" +
            "SZA\n" +
            "Sweet\n" +
            "Lana Del Rey\n" +
            "NewJeans - OMG (Romanized)\n" +
            "Genius Romanizations\n" +
            "\n" +
            "[Chorus]\n" +
            "I'm kinda buzzed and it's all because (This is how we do it)\n" +
            "South Central does it like nobody does (This is how we do it)\n" +
            "To all my neighbors you got much flavor (This is how we do it)\n" +
            "Let's flip the track, bring the old school back (This is how we do it)\n" +
            "I'm kinda buzzed and it's all because (This is how we do it)\n" +
            "South Central does it like nobody does (This is how we do it)\n" +
            "Y?N-Vee, SCC (This is how we do it)\n" +
            "I'll never come wack on an old school track (This is how we do it)\n" +
            "\n" +
            "[Verse 3]\n" +
            "Check it out!\n" +
            "Once upon a time in '94\n" +
            "Montell made no money and life sure was slow\n" +
            "All they said was 6' 8\" he stood\n" +
            "And people thought the music that he made was good\n" +
            "There lived a D.J. and Paul was his name\n" +
            "He came up to Monty, this is what he said\n" +
            "You and Oji are gonna make some cash\n" +
            "Sell a million records and we're makin' tha dash\n" +
            "\n" +
            "[Chorus]\n" +
            "Ohh, I'm buzzin' because... (This is how we do it)\n" +
            "South Central does it like nobody does (This is how we do it)\n" +
            "To all my neighbors you got much flavor (This is how we do it)\n" +
            "I'll never come wack on an old school track (This is how we do it)\n" +
            "I'm kinda buzzed and it's all because (This is how we do it)\n" +
            "South Central does it like nobody does (This is how we do it)\n" +
            "\n" +
            "\n" +
            "[Outro]\n" +
            "Oh, it's party time! (This is how we do it)\n" +
            "Straight up comin' from the West Side (This is how we do it)\n" +
            "OG's got the flavor, yeah (This is how we do it)\n" +
            "And Monty does it like nobody does (This is how we do it)\n" +
            "C'mon now, Def Jam, you know what it is (This is how we do it)\n" +
            "\n" +
            "[Spoken Interlude]\n" +
            "Yo Montell, this Percy, man\n" +
            "The barber, your barber\n" +
            "Man I'm sitting up here listening to ya tape, dude\n" +
            "And this shit is on, man\n" +
            "You gon' make it, fool\n" +
            "Keep on doing what you doing, man\n" +
            "My phone number is area code\n" +
            "Nine oh nine, zero, eighty-\n" +
            "Gimme a call, man\n" +
            "We getting ready to step out to the Fox Hills Mall right now\n" +
            "But, uh\n" +
            "It's Monday morning, about a quarter to eleven, peace", "\"This Is How We Do It\" es una canción emblemática del hip hop y R&B de la década de 1990 que celebra la cultura y el estilo de vida de la comunidad afroamericana. La letra describe la fiesta perfecta, donde se baila, se canta y se celebra la vida al máximo. Además, la canción transmite un mensaje de orgullo y empoderamiento, al afirmar que \"esto es lo que hacemos y cómo lo hacemos, y nadie puede detenernos\". A lo largo de los años, \"This Is How We Do It\" se ha convertido en un himno generacional y en un ejemplo de la música que trasciende las barreras culturales y sigue siendo relevante en la actualidad."),
    Song("Can We", "SWV y Missy Elliott", "Release Some Tension", 1997, R.drawable.swv___can_we,"[Intro: Missy]\n" +
            "Uh-huh, yeah, yeah yeah yeah yeah, uh-huh (ooh, ooh)\n" +
            "See, me and Timbaland, we got the shit that hits from here\n" +
            "From here to overseas (say what?), with SWV's (say what?)\n" +
            "Check it, one time, uh-huh, uh-huh\n" +
            "See, um, um\n" +
            "Me, I'm super fly, supa dupa fly\n" +
            "Rub your hands up my thigh and go supa dupa high\n" +
            "Till you see my apple pie\n" +
            "Tell me if you like, tell me if you like, uh-huh\n" +
            "\n" +
            "\n" +
            "[Verse 1: Coko]\n" +
            "Baby got me, tipsy, tipsy\n" +
            "Off the Remy, your love, tasty, baby\n" +
            "You're sendin' me crazy, crazy\n" +
            "Can I be your lady?\n" +
            "I love the things you say to me\n" +
            "I like it when you're talkin' dirty\n" +
            "\n" +
            "[Chorus: SWV & Missy / (Coko)]\n" +
            "Can we get kinky tonight? (Can we?)\n" +
            "I got so many things on my mind (On my mind)\n" +
            "I never seen a guy so fine (Ooh)\n" +
            "I like it when you do me, do me (Can we?)\n" +
            "Can we get kinky tonight? (Tonight)\n" +
            "I got so many things on my mind (On my mind)\n" +
            "I wanna feel you squeeze me tight (Yeah)\n" +
            "\n" +
            "[Verse 2: Coko]\n" +
            "Ooh honey, you got me\n" +
            "So high, so high, I can't lie\n" +
            "About the way you blazin' me\n" +
            "If you want me, then take me\n" +
            "You sendin' me crazy, crazy\n" +
            "Baby, I love the way you taste me\n" +
            "You're so tasty like pastry\n" +
            "\n" +
            "You might also like\n" +
            "Gettin’ Funky\n" +
            "SWV\n" +
            "Someone\n" +
            "SWV\n" +
            "Metro Spider\n" +
            "Metro Boomin & Young Thug\n" +
            "\n" +
            "[Chorus: SWV & Missy / (Coko)]\n" +
            "Can we get kinky tonight? (Can we?)\n" +
            "I got so many things on my mind (On my mind)\n" +
            "I never seen a guy so fine (Yeah-yeah)\n" +
            "I like it when you do me, do me (Can we?)\n" +
            "Can we get kinky tonight? (Tonight)\n" +
            "I got so many things on my mind (On my mind, yeah)\n" +
            "I wanna feel you squeeze me tight (Hey-yeah, ah-yeah)\n" +
            "\n" +
            "[Bridge: Lelee / (Coko)]\n" +
            "Spend the night with me\n" +
            "Spend the night with me, me, me (Spend the night)\n" +
            "Spend the night with me\n" +
            "Don't care what we do\n" +
            "Just as long as I'm with you (Oh)\n" +
            "\n" +
            "[Chorus: SWV & Missy / (Coko)]\n" +
            "Can we get kinky tonight?\n" +
            "I got so many things on my mind\n" +
            "I never seen a guy so fine (So fine)\n" +
            "I like it when you do me, do me (Can we?)\n" +
            "Can we get kinky tonight? (Tonight)\n" +
            "I got so many things on my mind (Yeah-yeah, hey-yeah)\n" +
            "I wanna feel you squeeze me tight (Yeah, ah-yeah)\n" +
            "\n" +
            "[Break: Missy]\n" +
            "(Uh-huh, uh-huh, uh-huh, yeah, yeah, yeah)\n" +
            "Can we get kinky tonight?\n" +
            "I got so many things on my mind\n" +
            "I never seen a guy so fine\n" +
            "I like it when you do me, do me, uh-huh\n" +
            "Can we get kinky tonight?\n" +
            "I got so many things on my mind\n" +
            "I wanna feel you squeeze me tight, uh-huh, uh-huh\n" +
            "\n" +
            "\n" +
            "[Verse 3: Missy]\n" +
            "We can sit in the back of my 300\n" +
            "We kissin' and we fondlin'\n" +
            "We high and we blunted\n" +
            "Take me if you want it to the Ho-Jo\n" +
            "Up all night like No-Doz\n" +
            "Yes, I got the feelin', feel me flow\n" +
            "Don't ask me if I'm nasty\n" +
            "Freaky deaky\n" +
            "See, y'all can't see me\n" +
            "Me, Timbaland and SWV\n" +
            "We hit you with the hee\n" +
            "Now shall we?\n" +
            "Ha-ha, check it out\n" +
            "\n" +
            "[Chorus: SWV & Missy]\n" +
            "Can we get kinky tonight?\n" +
            "I got so many things on my mind\n" +
            "I never seen a guy so fine\n" +
            "I like it when you do me, do me\n" +
            "Can we get kinky tonight?\n" +
            "I got so many things on my mind\n" +
            "I wanna feel you squeeze me tight", "La canción \"Can We\" es un tema de amor y seducción, en la que las voces sensuales de SWV y el rap de Missy Elliott se combinan para crear una canción con un fuerte sentido de intimidad y pasión. La letra de la canción habla de un hombre y una mujer que están experimentando una fuerte atracción el uno por el otro, y se preguntan si pueden llevar su relación al siguiente nivel. El sentido simbólico de la canción es el deseo de conexión profunda y de amor verdadero, pero también puede ser interpretada como una exploración de la sexualidad y la exploración de la intimidad. \"Can We\" es un clásico del R&B de los años 90 y es recordada por su mezcla única de voces seductoras y ritmos sensuales, así como por su sentido lírico de amor y pasión."),
    Song("Waterfalls", "TLC", "CrazySexyCool", 1995, R.drawable.waterfalls_by_tlc_us_cd_maxi_single, "[Verse 1: T-Boz]\n" +
            "A lonely mother gazing out of the window\n" +
            "Staring at a son that she just can't touch\n" +
            "If at any time he's in a jam, she'll be by his side\n" +
            "But he doesn't realize he hurts her so much\n" +
            "But all the praying just ain't helping at all\n" +
            "'Cause he can't seem to keep himself out of trouble\n" +
            "So he goes out and he makes his money the best way he knows how\n" +
            "Another body laying cold in the gutter\n" +
            "Listen to me\n" +
            "\n" +
            "\n" +
            "[Chorus: T-Boz & TLC]\n" +
            "Don't go chasing waterfalls\n" +
            "Please stick to the rivers and the lakes that you're used to\n" +
            "I know that you're gonna have it your way or nothing at all\n" +
            "But I think you're moving too fast\n" +
            "\n" +
            "[Verse 2: T-Boz]\n" +
            "Little precious has a natural obsession for temptation\n" +
            "But he just can't see\n" +
            "She gives him loving that his body can't handle\n" +
            "But all he can say is, \"Baby, it's good to me\"\n" +
            "One day, he goes and takes a glimpse in the mirror\n" +
            "But he doesn't recognize his own face\n" +
            "His health is fading, and he doesn't know why\n" +
            "Three letters took him to his final resting place\n" +
            "Y'all don't hear me\n" +
            "\n" +
            "[Chorus: T-Boz & TLC, Chilli]\n" +
            "Don't go chasing waterfalls\n" +
            "Please stick to the rivers and the lakes that you're used to\n" +
            "I know that you're gonna have it your way or nothing at all\n" +
            "(Your way or no way)\n" +
            "But I think you're moving too fast\n" +
            "Don't go chasing waterfalls\n" +
            "Please stick to the rivers and the lakes that you're used to\n" +
            "I know that you're gonna have it your way or nothing at all\n" +
            "But I think you're moving too fast\n" +
            "\n" +
            "You might also like\n" +
            "Used\n" +
            "SZA\n" +
            "Kintsugi\n" +
            "Lana Del Rey\n" +
            "Love Language\n" +
            "SZA\n" +
            "\n" +
            "[Verse 3: Left Eye]\n" +
            "Come on!\n" +
            "I seen a rainbow yesterday, but too many storms\n" +
            "Have come and gone, leaving a trace of not one God-given ray\n" +
            "Is it because my life is ten shades of gray, I pray\n" +
            "All ten fade away, seldom praise Him for the sunny days\n" +
            "And like His promise is true, only my faith can undo\n" +
            "The many chances I blew to bring my life to anew\n" +
            "Clear blue and unconditional skies\n" +
            "Have dried the tears from my eyes, no more lonely cries\n" +
            "My only bleeding hope is for the folk who can't cope\n" +
            "With such an endurin' pain that it keeps 'em in the pourin' rain\n" +
            "Who's to blame for tooting 'caine into your own vein?\n" +
            "What a shame, you shoot and aim for someone else's brain\n" +
            "You claim the insane, and name this day in time\n" +
            "For falling prey to crime\n" +
            "I say the system's got you victim to your own mind\n" +
            "Dreams are hopeless aspirations in hopes of coming true\n" +
            "Believe in yourself, the rest is up to me and you\n" +
            "\n" +
            "[Chorus: T-Boz & TLC, Chilli]\n" +
            "Don't go chasing waterfalls\n" +
            "Please stick to the rivers and the lakes that you're used to\n" +
            "I know that you're gonna have it your way or nothing at all\n" +
            "But I think you're moving too fast\n" +
            "Don't go chasing waterfalls\n" +
            "Please stick to the rivers and the lakes that you're used to\n" +
            "I know that you're gonna have it your way or nothing at all\n" +
            "But I think you're movin' too fast (Ooh, you're movin' too fast)\n" +
            "Don't go chasing waterfalls (Don't go, don't go)\n" +
            "Please stick to the rivers and the lakes that you're used to\n" +
            "I know that you're gonna have it your way or nothing at all\n" +
            "(I know, I know, your way hey)\n" +
            "But I think you're moving too fast", "La canción \"Waterfalls\" de TLC, lanzada en 1995 como parte de su álbum \"CrazySexyCool\", tiene un sentido simbólico que aborda temas de la vida y la muerte, el amor y las consecuencias de las decisiones. La letra de la canción habla de la importancia de vivir la vida de manera auténtica y de ser consciente de las decisiones que se toman, ya que pueden tener consecuencias graves y duraderas.\n" +
            "\n" +
            "La letra también hace referencia a la idea de que el amor no siempre puede ser suficiente para superar las dificultades y las pruebas de la vida, y que algunas veces hay que aceptar que ciertas situaciones simplemente no pueden ser cambiadas. En este sentido, la canción tiene un mensaje de aceptación y de encontrar la paz en las circunstancias difíciles de la vida.\n" +
            "\n" +
            "El título de la canción, \"Waterfalls\" (Cascadas), se refiere a la imagen de las cascadas como una metáfora de la vida y de cómo ésta fluye como el agua, a veces suave y tranquila, y otras veces caótica y peligrosa. En conjunto, la canción \"Waterfalls\" de TLC es una reflexión sobre los altibajos de la vida y una llamada a la reflexión sobre nuestras decisiones y cómo éstas afectan a nuestro destino."),
    Song("Feels Good", "Tony! Toni! Toné!", "The Revival", 1990, R.drawable.tony__toni__tone__promotional_photo, "[Intro: Spoken]\n" +
            "Play this record as frequently as possible\n" +
            "Then, as it becomes easier for you\n" +
            "Play the record once a day or as needed\n" +
            "\n" +
            "[Chorus]\n" +
            "It feels good, yeah\n" +
            "It feels good, woah\n" +
            "It feels good\n" +
            "It feels good\n" +
            "It sho' feels good to me\n" +
            "\n" +
            "\n" +
            "If the rhythm feels good to you baby\n" +
            "Let me hear you say (oh oh baby)\n" +
            "If the rhythm feels good to you baby\n" +
            "Let me hear you say (oh oh baby)\n" +
            "If the rhythm feels good to you baby\n" +
            "Let me hear you say (oh oh baby)\n" +
            "And if the rhythm feels good to you baby\n" +
            "Let it take you away (oh oh baby)\n" +
            "\n" +
            "[Verse 1]\n" +
            "Moments that we share\n" +
            "Special times alone\n" +
            "Just don't ever change\n" +
            "Cause I'm so into you\n" +
            "And you know\n" +
            "\n" +
            "[Chorus]\n" +
            "It feels good, yeah (to know that you by my side)\n" +
            "It feels good, woo (to know that you there for me)\n" +
            "It feels good, yeah (to know that you wanna be around)\n" +
            "It feels good (to know you love me for me)\n" +
            "Your rhythm, it sho' feels good to me\n" +
            "\n" +
            "If the rhythm feels good to you baby\n" +
            "Let me hear you say (oh oh baby)\n" +
            "If the rhythm feels good to you baby\n" +
            "Let me hear you say (oh oh baby)\n" +
            "If the rhythm feels good to you baby\n" +
            "Let me hear you say (oh oh baby)\n" +
            "And if the rhythm feels good to you baby\n" +
            "Let it take you away (oh oh baby)\n" +
            "\n" +
            "You might also like\n" +
            "Muddy Feet\n" +
            "Miley Cyrus\n" +
            "Flowers\n" +
            "Miley Cyrus\n" +
            "Notice Me\n" +
            "SZA\n" +
            "\n" +
            "[Verse 2]\n" +
            "Last night was so fun\n" +
            "Lovin' 101\n" +
            "I was holding you so tight\n" +
            "Now I just might make you my wife\n" +
            "Cause you know\n" +
            "\n" +
            "[Chorus]\n" +
            "It feels good (to know that I really care)\n" +
            "It feels good (to know that I can relax when I'm with you)\n" +
            "It feels good (to know I can be by your side)\n" +
            "It feels good (having you around)\n" +
            "Your rhythm, it sho' feels good to me\n" +
            "\n" +
            "You know that I love you (yeah)\n" +
            "You know that I want you (it feels good)\n" +
            "You know that I need you (ahhh)\n" +
            "You know that I care\n" +
            "It feels good, yeah\n" +
            "It feels good\n" +
            "\n" +
            "If the rhythm feels good to you baby\n" +
            "Let me hear you say (oh oh baby)\n" +
            "If the rhythm feels good to you baby\n" +
            "Let me hear you say (oh oh baby)\n" +
            "If the rhythm feels good to you baby\n" +
            "Let me hear you say (oh oh baby)\n" +
            "And if the rhythm feels good to you baby\n" +
            "Let it take you away (oh oh baby)\n" +
            "\n" +
            "\n" +
            "[Verse 3: Mocedes]\n" +
            "Mocedes the Mellow, quite a nice fellow\n" +
            "Met 3T, hit a rhyme, acapello\n" +
            "They had the rhythm and I had the rhyme\n" +
            "So then a hit of that one more time\n" +
            "It worked out and then they worked it in\n" +
            "Tony! Toni! Toné! has done it again\n" +
            "\n" +
            "[Chorus]\n" +
            "Feels good, yeah\n" +
            "It feels good\n" +
            "It feeeeels good\n" +
            "It feels good\n" +
            "It feels good\n" +
            "It feels good, yeah\n" +
            "It feels good\n" +
            "\n" +
            "[Outro]\n" +
            "I feel it all in my hands\n" +
            "I feel it all in my feet\n" +
            "I feel it all in my bones\n" +
            "I feel it all in my bones\n" +
            "I feel it all in my feet\n" +
            "I feel it all in my heart\n" +
            "I feel it all in my soul\n" +
            "\n" +
            "And, you know\n" +
            "It feels good, yeah\n" +
            "It feels good\n" +
            "A-doo-doo doo doo doo\n" +
            "It feels good, yeah\n" +
            "It feels good\n" +
            "\n" +
            "I feel it, feel it, girl\n" +
            "Can you feel it\n" +
            "Can you feel it, feel it, feel it, feel it\n" +
            "Got to feel it, yeah\n" +
            "I got to feel it\n" +
            "\n" +
            "And I feel like this, I feel like\n" +
            "A-doo-doo doo doo doo doo doo\n" +
            "A-doo-doo doo-doo doo doo doo doo doo\n" +
            "Doo Doo\n" +
            "And I, I feel good\n" +
            "Woo, I feel good\n" +
            "I feel good\n" +
            "I feel it all in my hands\n" +
            "I feel it all in my feet\n" +
            "I feel it all over me\n" +
            "And I feel good", "La canción \"Feels Good\" de Tony! Toni! Toné! se considera un clásico del new jack swing de los años 90, un género que fusionaba el R&B, el soul y el hip-hop. En cuanto al sentido simbólico, la letra de la canción habla de la felicidad y el bienestar que se siente cuando uno encuentra el amor verdadero. La canción también hace referencia al poder de la música para hacernos sentir bien y mejorar nuestro estado de ánimo. En resumen, \"Feels Good\" es una canción que transmite un mensaje positivo y optimista sobre el amor y la felicidad, y que celebra la importancia de la música en nuestras vidas."),
    Song("Hey Mr. DJ", "Zhané", "Pronounced Jah-Nay", 1993, R.drawable.zhan__hey_mr__dj, "[Intro]\n" +
            "What we're gonna do now is go back\n" +
            "\n" +
            "[Chorus]\n" +
            "Everybody, move your body, now do it\n" +
            "Here is something that's gonna make you move and groove\n" +
            "Hey D.J. keep playing that song, all night\n" +
            "On and on and on (on and on and on and on)\n" +
            "Everybody, move your body, now do it\n" +
            "Here is something that's gonna make you move and groove\n" +
            "Hey D.J. keep playing that song, all night\n" +
            "On and on and on (on and on and on and on)\n" +
            "\n" +
            "\n" +
            "[Verse 1]\n" +
            "It's Friday night and the weekend's here\n" +
            "I need to unwind, where's the party, Mr. D.J\n" +
            "I am ready to call my friends\n" +
            "So we could all get down\n" +
            "Where's the party, hey Mr. D.J\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Hey Mr. D.J. (You can get this started)\n" +
            "Everybody's ready to party (All night, all night)\n" +
            "All the girls are ready (So we can all get to it)\n" +
            "So we can party 'till the break of dawn, oh\n" +
            "\n" +
            "[Chorus]\n" +
            "Everybody, move your body, now do it\n" +
            "Here is something that's gonna make you move and groove\n" +
            "Hey D.J. keep playing that song, all night\n" +
            "On and on and on (on and on and on and on)\n" +
            "Everybody, move your body, now do it\n" +
            "Here is something that's gonna make you move and groove\n" +
            "Hey D.J. keep playing that song, all night\n" +
            "On and on and on (on and on and on and on)\n" +
            "\n" +
            "[Verse 2]\n" +
            "It's Friday night and the weekend's here\n" +
            "I need to unwind, where's the party, Mr. D.J\n" +
            "I am ready to call my friends\n" +
            "So we could all get down\n" +
            "Where's the party, hey Mr. D.J\n" +
            "\n" +
            "You might also like\n" +
            "A&W\n" +
            "Lana Del Rey\n" +
            "Ghost in the Machine\n" +
            "SZA\n" +
            "Just Married\n" +
            "Kelsea Ballerini\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Hey Mr. D.J. (You can get this started)\n" +
            "Everybody's ready to party (All night, all night)\n" +
            "All the girls are ready (So we can all get to it)\n" +
            "So we can party 'till the break of dawn, oh\n" +
            "\n" +
            "[Verse 3: Fam]\n" +
            "Once again, it's on, yo Zhané blow the horn\n" +
            "Let the D.J. know to keep playing your song\n" +
            "Maybe I'll browse, snatch up the blouse\n" +
            "Rip the foul, ho\n" +
            "And get rub-a-dub style\n" +
            "'Cause your body won't move\n" +
            "If it can't feel the groove\n" +
            "So can't boogie, have to show and prove\n" +
            "Hey, now I'm feeling the vibe\n" +
            "Rolling with the flavor\n" +
            "Feeling alright\n" +
            "Ho, yo, there's a party over here\n" +
            "Yo, oh no, the party's over there\n" +
            "Call up your friends, let 'em know\n" +
            "Fam's tagging along\n" +
            "Hey D.J. keep playing that song\n" +
            "\n" +
            "[Chorus]\n" +
            "Everybody, move your body, now do it\n" +
            "Here is something that's gonna make you move and groove\n" +
            "Hey D.J. keep playing that song, all night\n" +
            "On and on and on (on and on and on and on)\n" +
            "Everybody, move your body, now do it\n" +
            "Here is something that's gonna make you move and groove\n" +
            "Hey D.J. keep playing that song, all night\n" +
            "On and on and on (on and on and on and on)", "La canción \"Hey Mr. DJ\" de Zhané fue un éxito en la escena del R&B y el hip hop de los años 90. La letra habla sobre una mujer que está en una fiesta y le pide al DJ que ponga su canción favorita para que ella pueda bailar. El sentido simbólico de la canción es el poder de la música para unir a la gente y hacerles sentir felices y libres. La canción también representa la cultura de las discotecas y los clubes nocturnos de los años 90, donde la música era el elemento central de la fiesta y donde la gente se reunía para bailar y divertirse. Además, \"Hey Mr. DJ\" se ha convertido en un himno de la música dance y sigue siendo un éxito popular en las pistas de baile de todo el mundo.")
)

val songSalsa = listOf(
    Song("Cali Pachanguero", "Grupo Niche", "Al Pasito!", 1984, R.drawable.grupo_niche_photo_test, "Coro 1\n" +
            "\n" +
            "Cali pachanguero, Cali luz de un nuevo cielo\n" +
            "\n" +
            "De romantica luna, el lucero que es leno\n" +
            "De mirar en tu valle la mujer que yo quiero\n" +
            "\n" +
            "Del jilguero que canta, calles que se levantan\n" +
            "Carnaval en juanchito todo un pueblo que inspira\n" +
            "\n" +
            "Coro 1\n" +
            "\n" +
            "\n" +
            "Es por eso que espero que los dias que lejos\n" +
            "Cuando dure mi ausencia sabes bien que me muero\n" +
            "Todos los caminos conducen a ti\n" +
            "Si supieras la pena que un dia senti\n" +
            "Cuando en frente de mi tus montañas no vi\n" +
            "\n" +
            "Coro 2\n" +
            "\n" +
            "Que todo, que todo, que todo que\n" +
            "\n" +
            "Coro 3\n" +
            "\n" +
            "Que todo el mundo te cante\n" +
            "Que todo el mundo te mime\n" +
            "Celoso estoy pa' que mires\n" +
            "No me voy mas ni por miles\n" +
            "\n" +
            "Pregones\n" +
            "\n" +
            "Permita que me arrepienta oh\n" +
            "Mi bella cenicienta\n" +
            "De rodillas mi presencia\n" +
            "Si mi ausencia fue tu afrenta\n" +
            "\n" +
            "Que noches, que noches tan bonitas\n" +
            "Silo' en sus callesitas\n" +
            "Al fondo mi valle en risa\n" +
            "Hay! todito se divisa\n" +
            "\n" +
            "You might also like\n" +
            "Han cogido la cosa\n" +
            "Grupo Niche\n" +
            "Una Aventura\n" +
            "Grupo Niche\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "\n" +
            "Un clasico en el Pascual\n" +
            "Adornado de mujeres sin par\n" +
            "America y Cali a ganar\n" +
            "Aqui no se puede empatar\n" +
            "\n" +
            "Barranquilla, puerta de oro\n" +
            "Paris la ciudad luz\n" +
            "Nueva York capital del mundo\n" +
            "Y del cielo Cali, la sucursal\n" +
            "\n" +
            "A millas siento tu aroma\n" +
            "Cualquiera justo razona\n" +
            "Que Cali es Cali señoras, señores\n" +
            "Lo demas es loma", "\"Cali pachanguero\" es una canción icónica de la salsa colombiana que celebra la ciudad de Cali y su cultura festiva y musical. El término \"pachanguero\" se refiere a alguien que disfruta de la fiesta y la música, y la canción anima a los oyentes a unirse a la celebración. Además, la canción también tiene un mensaje de unidad y orgullo por la identidad cultural afrocolombiana, y se ha convertido en un himno para la comunidad afrodescendiente de Colombia y otros países de América Latina. \"Cali pachanguero\" se ha convertido en una de las canciones más emblemáticas del Grupo Niche y de la música salsa en general, y sigue siendo un clásico en las fiestas y celebraciones en todo el mundo."),
    Song("Conteo Regresivo", "Gilberto Santa", "Contraste", 1991, R.drawable.gilberto_santa_rosa, "[Intro]\n" +
            "Dí eso que te canta todo el mundo\n" +
            "No he venido a casa en casi un mes\n" +
            "O chocas con la verdad, no finges\n" +
            "Si he tenido fallas, tú también\n" +
            "Se hizo tarde para ser felices\n" +
            "Sin comentarios, yo lo sé\n" +
            "Cuatro mil razones hoy nos sobran\n" +
            "Para terminar con este estrés\n" +
            "Dosis de amor hacían falta\n" +
            "Pero ninguno cedió\n" +
            "\n" +
            "\n" +
            "[Coro]\n" +
            "Ahora sólo hay números en tu cabeza\n" +
            "De una relación que no da para más\n" +
            "Ahora sólo hay símbolos de suma y resta\n" +
            "Sumas mis errores, resto tu bondad\n" +
            "Ahora soy la pieza en tu rompecabezas\n" +
            "Que nunca hizo falta, que no encajará\n" +
            "Voy a enumerar todos nuestros errores\n" +
            "Cuando llegue a cero todo acabará\n" +
            "\n" +
            "[Verso 1]\n" +
            "Diez - nunca me dices que me amas\n" +
            "Nueve - siempre cambio la verdad\n" +
            "Ocho - cuando salgo de la casa\n" +
            "Siete - casi siempre llego a las\n" +
            "Seis - no me agradan tus detalles\n" +
            "Cinco - a esta altura nos da igual\n" +
            "Cuatro - se nos apago la llama\n" +
            "Tres - casi voy a terminar\n" +
            "Dos - si no hay amor, no hay nada\n" +
            "Es oportuno el adiós\n" +
            "\n" +
            "[Coro]\n" +
            "Ahora sólo hay números en tu cabeza\n" +
            "De una relación que no da para más\n" +
            "Ahora sólo hay símbolos de suma y resta\n" +
            "Sumas mis errores, resto tu bondad\n" +
            "Ahora soy la pieza en tu rompecabezas\n" +
            "Que nunca hizo falta, que no encajará\n" +
            "Voy a enumerar todos nuestros errores\n" +
            "Cuando llegue a cero todo acabará\n" +
            "\n" +
            "You might also like\n" +
            "Pensando en ti\n" +
            "Gilberto Santa Rosa\n" +
            "Almost Like Praying\n" +
            "Lin-Manuel Miranda\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "\n" +
            "[Verso 2]\n" +
            "Aquí empezó el conteo regresivo\n" +
            "Cuando llegue a cero se acabo\n" +
            "Tú te vas, yo me voy, nos vamos los dos\n" +
            "No hay razón para quedarnos\n" +
            "Tú conmigo, yo contigo\n" +
            "El amor está perdido lo nuestro se termino\n" +
            "Sin remedio se murió\n" +
            "Aquí empezó el conteo regresivo\n" +
            "Ni te quedas aquí ni me quedo contigo\n" +
            "Cuando llegue a cero se acabo\n" +
            "Tú te vas, yo me voy, nos vamos los dos\n" +
            "Esto no tiene salvación\n" +
            "No hay solución para el adiós\n" +
            "Cada cual por su camino\n" +
            "Ya que esto no nos convino\n" +
            "A buscar otro destino\n" +
            "Por que esto fue un desatino\n" +
            "De los dos…\n" +
            "Aquí empezó el conteo regresivo\n" +
            "10, 9, 8, 7, 6, 5\n" +
            "Cuando llegue a cero se acabo\n" +
            "Tú te vas, yo me voy, nos vamos los dos\n" +
            "¡Camina!\n" +
            "\n" +
            "[Outro]\n" +
            "Aquí empezó el conteo regresivo\n" +
            "Cuando llegue a cero se acabo\n" +
            "Tú te vas, yo me voy, nos vamos los dos\n" +
            "Si ya lo intentamos todo y nada nos funcionó\n" +
            "¿Qué Pasó?\n" +
            "Cuando llegue a cero se acabo\n" +
            "Tú te vas, yo me voy, nos vamos los dos\n" +
            "Y cuando llegue a cero\n" +
            "Ni me quieres ni te quiero\n" +
            "El amor se termino\n" +
            "Cuando llegue a cero se acabo\n" +
            "Tú te vas, yo me voy, nos vamos los dos\n" +
            "\n" +
            "\n" +
            "Cero", "La canción \"Conteo regresivo\" es una composición de salsa romántica que presenta un simbolismo de ansiedad y miedo a perder el amor de alguien. El título de la canción y la letra describen la sensación de estar en un \"conteo regresivo\" hacia la pérdida de la relación, donde cada momento se siente más crítico y la separación parece inevitable. El sentido simbólico de la canción es una expresión de los sentimientos intensos y dramáticos que se experimentan cuando se teme perder a alguien importante en la vida. En este caso, se utiliza el simbolismo del tiempo para representar la urgencia de la situación y el miedo a no poder detener el final de la relación."),
    Song("Dile a ella", "Víctor Manuelle", "Inconfundible", 2001, R.drawable.victor_manuelle, "No, te sorprendas al verme aquí\n" +
            "Buscando saber como esta\n" +
            "Preguntando si ella es feliz\n" +
            "\n" +
            "Se que fui el culpable de que a aquel amor\n" +
            "Le llegara su adiós\n" +
            "Adiós que ella nunca comprendió\n" +
            "\n" +
            "Tu, que has sido su amiga, su amiga fiel\n" +
            "Debes saber y entender\n" +
            "El porque de aquella decisión\n" +
            "\n" +
            "\n" +
            "Yo vivía atado a otra relación\n" +
            "Era mejor el adiós\n" +
            "Que por mí conociera la desilusión\n" +
            "\n" +
            "Dile a ella que a pesar del tiempo no he podido olvidarla\n" +
            "Que recuerdo su tierna mirada\n" +
            "Cuando me decía, amor jamás te dejare de amar\n" +
            "Dile a ella que a pesar de todo la llevo en mi alma\n" +
            "Que me despierto cada mañana\n" +
            "Pensando en las cosas que con ella pude encontrar\n" +
            "\n" +
            "Dile, que no he vivido un momento\n" +
            "En que no existe en mi pensar\n" +
            "\n" +
            "Dile a ella, dile a ella, dile a ella\n" +
            "\n" +
            "Tu, que has sido su amiga, su amiga fiel\n" +
            "Debes saber y entender\n" +
            "El porque de aquella decisión\n" +
            "\n" +
            "Yo vivía atado a otra relación\n" +
            "Era mejor el adiós\n" +
            "Que por mí conociera la desilusión\n" +
            "\n" +
            "Dile a ella que a pesar del tiempo no he podido olvidarla\n" +
            "Que recuerdo su tierna mirada\n" +
            "Cuando me decía, amor jamás te dejare de amar\n" +
            "Dile a ella que a pesar de todo la llevo en mi alma\n" +
            "Que me despierto cada mañana\n" +
            "Pensando en las cosas que con ella pude encontrar\n" +
            "\n" +
            "You might also like\n" +
            "Nuestra Historia\n" +
            "Víctor Manuelle\n" +
            "Isla Bendita\n" +
            "Unidos Por Puerto Rico\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "\n" +
            "Dile, que no he vivido un momento\n" +
            "En que no existe en mi pensar\n" +
            "\n" +
            "Dile a ella, dile a ella, dile a ella\n" +
            "\n" +
            "Dile a ella que no puedo olvidarla\n" +
            "Dile a ella que no puedo olvidarla\n" +
            "\n" +
            "Cuentale, que todavia la quiero y dicelo\n" +
            "Que por ella me muero y porfavor\n" +
            "\n" +
            "Dile a ella (dile) que no puedo olvidarla\n" +
            "\n" +
            "Que no he vivdo un momento en que yo\n" +
            "He dejado de pensarla\n" +
            "\n" +
            "Dile a ella (dile) que no puedo olvidarla\n" +
            "(Ve y dicelo)\n" +
            "\n" +
            "Dile, dile dile a ella, a ella\n" +
            "Dile, dile dile a ella, a ella\n" +
            "Dile, dile dile a ella, a ella\n" +
            "Dile, dile dile a ella, a ella\n" +
            "Dile, dile dile a ella, a ella\n" +
            "\n" +
            "Que no la puedo olvidar\n" +
            "(Dile, dile dile a ella, a ella)\n" +
            "Que ne he vivido un momento\n" +
            "En que no deje de pensar\n" +
            "(Dile, dile)\n" +
            "Pero ve y dicelo\n" +
            "Que no he podido olvidarla\n" +
            "Que aunque pase mucho tiempo\n" +
            "Aun yo la llevo en mi alma\n" +
            "\n" +
            "\n" +
            "(Dile, dile)\n" +
            "(Dile, dile dile a ella, a ella)\n" +
            "\n" +
            "(Dile, dile)\n" +
            "(Dile, dile dile a ella, a ella)\n" +
            "\n" +
            "(Dile, dile)\n" +
            "Dile que no soy feliz\n" +
            "Tu que eres su amiga fiel\n" +
            "Que no he podido olvidarla\n" +
            "Por favor ve y cuentale\n" +
            "Y todavia no\n" +
            "\n" +
            "(Dile, dile dile a ella)\n" +
            "Que no he podido olvidarla\n" +
            "(Dile, dile)\n" +
            "(Dile, dile dile a ella)\n" +
            "(Dile, dile)\n" +
            "(Dile, dile dile a ella)\n" +
            "(Dile, dile)\n" +
            "(Dile, dile)\n" +
            "(Dile, dile dile a ella, a ella)\n" +
            "(Dile, dile dile a ella, a ella)\n" +
            "\n" +
            "(Dile, dile dile a ella, a ella)\n" +
            "\n" +
            "Que no he podido olvidarla!!!", "La canción \"Dile a ella\" es una balada de salsa que trata sobre la infidelidad y el dolor que causa a la persona que es engañada. La letra habla de un hombre que está siendo infiel a su pareja y le pide a su amante que no le llame más, que no le busque más, y que le deje en paz. En el coro, el cantante repite el título de la canción, \"Dile a ella\", pidiendo a su amante que le diga la verdad a su pareja y que no le mienta más. La canción tiene un sentido simbólico de la importancia de la honestidad y la lealtad en las relaciones amorosas, y de las consecuencias dolorosas que puede causar la falta de estas cualidades. Además, la canción utiliza el género musical de la salsa para transmitir la emoción intensa y apasionada del tema."),
    Song("El Preso", "Fruko y sus Tesos", "El Preso", 1974, R.drawable.el_preso, "[Intro]\n" +
            "Oye, te hablo desde la prisión\n" +
            "Wilson Manyoma, hormona\n" +
            "¡Ébaya!\n" +
            "¡Y dice!\n" +
            "\n" +
            "[Verso 1]\n" +
            "En el mundo en que yo vivo\n" +
            "Siempre hay cuatro esquinas\n" +
            "Pero entre esquina y esquina\n" +
            "Siempre habrá lo mismo\n" +
            "Para mí no existe el cielo ni luna ni estrellas\n" +
            "Para mí no alumbra el Sol, pa' mí todo e' tinieblas\n" +
            "\n" +
            "\n" +
            "[Coro 1]\n" +
            "Ay, ay, ay, qué negro es mi destino\n" +
            "Ay, ay, ay, todo' de mí se alejan\n" +
            "Ay, ay, ay, perdí toda esperanza\n" +
            "Ay, adiós, solo llegan mis quejas\n" +
            "\n" +
            "Te hablo desde aquí, Kike Triunfante\n" +
            "¡Ébaya!\n" +
            "\n" +
            "[Verso 2]\n" +
            "Condenado para siempre\n" +
            "En esta horrible celda\n" +
            "Donde no llega el cariño\n" +
            "Ni la voz de nadie\n" +
            "Aquí me paso los días\n" +
            "Y la noche entera\n" +
            "Sólo vivo del recuerdo\n" +
            "Eterno de mi madre\n" +
            "\n" +
            "[Coro 2]\n" +
            "Ay, ay, ay, sólo espero que llegue\n" +
            "Ay, ay, ay, el día que la muerte\n" +
            "Ay, ay, ay, me lleve a estar con ella\n" +
            "Ay, al fin, ya cambiará mi suerte\n" +
            "\n" +
            "Con este lamento, doctor Villanueva\n" +
            "¡Como!\n" +
            "¡Y vuelve otra vez!\n" +
            "\n" +
            "You might also like\n" +
            "Manyoma\n" +
            "Joe Arroyo\n" +
            "Cachondea\n" +
            "Fruko y Sus Tesos\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "\n" +
            "[Instrumental]\n" +
            "\n" +
            "[Pregón]\n" +
            "Ay, qué sólo estoy, solo me espera la muerte\n" +
            "Ay, qué solo estoy, ¿cuándo cambiará mi suerte\n" +
            "Con esta triste soledad\n" +
            "Vivir en esta condena\n" +
            "Ya no quiero sufrir más\n" +
            "Te lo digo, Magdalena, eh-eh, ah\n" +
            "Ay, qué sólo estoy, solo me espera la muerte\n" +
            "Ay, qué solo estoy, ¿cuándo cambiará mi suerte\n" +
            "Compañeros de prisión\n" +
            "Gente de todas las clases\n" +
            "Que no tienen corazón\n" +
            "Y no saben lo que hacen\n" +
            "\n" +
            "[Puente]\n" +
            "Sólo con mi pena\n" +
            "Sólo en mi condena\n" +
            "Sólo con mi pena\n" +
            "Sólo en mi condena\n" +
            "\n" +
            "[Outro]\n" +
            "Oye, Fruko solo voy con mis penas\n" +
            "En esta celda, treinta años de condena, ay\n", "\"El Preso\" es una canción icónica del género de la salsa y es considerada uno de los mayores éxitos de Fruko y Sus Tesos. La letra de la canción describe la historia de un hombre que está en la cárcel y sufre por su situación, pero que se aferra a la esperanza de ser liberado algún día. El sentido simbólico de la canción es el de la libertad y la lucha por los derechos humanos, especialmente en relación a las personas que están privadas de su libertad. La canción se convirtió en un himno para los presos políticos en América Latina, y ha sido interpretada por muchos otros artistas y bandas de salsa en todo el mundo. Además, \"El Preso\" es un ejemplo de cómo la música puede servir como una herramienta para expresar las preocupaciones sociales y políticas, y para dar voz a aquellos que no pueden hacerlo por sí mismos."),
    Song("Fuego en el 23", "La Sonora Ponceña", "Hacheros Pa' un Palo", 1975, R.drawable.sonora_ponce_a, "Alalalalala alalalalala\n" +
            "Alalalalala alala\n" +
            "En el 23 de la 110\n" +
            "No se puede estar tranquilo\n" +
            "¡Te dire por que!\n" +
            "Lo mismo a las doce del dia que a la una que a las tres\n" +
            "A veces de madrugada lo mismo al amanecer\n" +
            "Se forma una rebambaramba que se juntan 4, 5, 7, 8, 9 o 10\n" +
            "Y salen gritando\n" +
            "Avisale al super\n" +
            "Que nos estamos quemando\n" +
            "No se sabe el fuego en donde es\n" +
            "Una mañana dormia y corriendo me tire\n" +
            "Un grito que decia hay fuego en el 23\n" +
            "Se rebento la bombilla y no se sabe como fue\n" +
            "\n" +
            "\n" +
            "Hay fuego en el 23, en el 23\n" +
            "Hay fuego en el 23, en el 23\n" +
            "En el 23 de la 110 dicen que el fuego empezo a las 3\n" +
            "Hay fuego en el 23, en el 23\n" +
            "Dale paso a la sirena\n" +
            "Porque sino la ciudad se quema\n" +
            "Hay fuego en el 23, en el 23\n" +
            "Bombero hay fuego\n" +
            "Si no llega el agua me quemo\n" +
            "Hay fuego en el 23, en el 23\n" +
            "Caliente\n" +
            "Hechale agua que se quema\n" +
            "Se quema tepito\n" +
            "Que apaguen el fuego, que lo apaguen\n" +
            "Si no llegan los bomberos lo apago yo\n" +
            "Traigan la escalera el extinguidor\n" +
            "Que apaguen el fuego, (fuego fuego) que lo apaguen, que me quemo\n" +
            "Que yo no quiero morir, en candela\n" +
            "Yo no quiero morir, en candela\n" +
            "Que apaguen el fuego, (fuego fuego) que lo apaguen, que me quemo\n" +
            "Que apaguen el fuego\n" +
            "Que esto es un infierno\n" +
            "Que me quemo\n" +
            "Que apaguen el fuego, (fuego fuego) que lo apaguen, que me quemo\n" +
            "Fuego por aqui, fuego por alla\n" +
            "Dame el hacha la escalera y la manguera\n" +
            "Que apaguen el fuego, (fuego fuego) que lo apaguen, que me quemo\n" +
            "Se quema marota\n" +
            "Cuidado que te quemas\n" +
            "Abre la nevera\n" +
            "Fuego, en los calzones de tu abuelo\n" +
            "En los calzones de tu abuelo\n" +
            "Hay fuego en el ruedo\n" +
            "Fuego, que vengan los bomberos\n" +
            "Que vengan los bomberos bendito sea Dios\n" +
            "Que se quema tu abuelo\n" +
            "Fuego, en los calzones de tu abuelo\n" +
            "Que yo no quiero morir, en candela\n" +
            "Yo no quiero morir", "\"Fuego en el 23\" es una canción emblemática de la salsa y la música latina en general. Aunque su letra es sencilla, la canción se ha convertido en un clásico gracias a su ritmo pegajoso y su sentido simbólico.\n" +
            "\n" +
            "El título de la canción hace referencia a un incendio ocurrido en un edificio del barrio Santurce en San Juan, Puerto Rico, donde se encontraba el estudio de grabación de la Sonora Ponceña. A pesar del siniestro, la banda pudo recuperarse y continuar su carrera musical.\n" +
            "\n" +
            "En términos simbólicos, \"Fuego en el 23\" se ha convertido en una metáfora de la resiliencia y la fuerza de voluntad en momentos de adversidad. La canción habla de levantarse después de la caída, de mantenerse firme frente a los obstáculos y de seguir adelante a pesar de las dificultades.\n" +
            "\n" +
            "En resumen, \"Fuego en el 23\" es una canción que ha trascendido más allá de su contexto original para convertirse en un himno de la música latina y un ejemplo de perseverancia y superación."),
    Song("La Rebelión", "Joe Arroyo", "La Leyenda", 1986, R.drawable.arroyo_joe, "[Intro]\n" +
            "Quiero contarle, mi hermano, un pedacito de la historia negra\n" +
            "De la historia nuestra, caballero, y dice así\n" +
            "¡Uh!\n" +
            "¡Dice!\n" +
            "\n" +
            "[Verso 1]\n" +
            "En los años mil seiscientos, cuando el tirano mandó\n" +
            "Las calles de Cartagena, aquella historia vivió\n" +
            "Cuando aquí llegaban esos negreros, africanos en cadenas\n" +
            "Besaban mi tierra, esclavitud perpetua\n" +
            "Esclavitud perpetua\n" +
            "Esclavitud perpetua\n" +
            "\n" +
            "\n" +
            "[Interludio]\n" +
            "Que lo diga Salomé\n" +
            "Escucha, nené\n" +
            "\n" +
            "[Verso 2]\n" +
            "Un matrimonio africano, esclavos de un español\n" +
            "Él les daba muy mal trato y a su negra le pegó\n" +
            "Y fue allí, se reveló el negro guapo\n" +
            "Tomó venganza por su amor\n" +
            "Y aún se escucha en la verja, \"No le pegue a mi negra\"\n" +
            "\n" +
            "[Coro]\n" +
            "No le pegue a la negra\n" +
            "No le pegue a la negra\n" +
            "Oye, man, no le pegue a la negra\n" +
            "No le pegue a la negra\n" +
            "No, no, no, no, no, no\n" +
            "No, no, no, no, no, no\n" +
            "No le pegue a la negra\n" +
            "Oye, esa negra se me respeta\n" +
            "No le pegue a la negra\n" +
            "Eh, que aún se escucha, se escucha en la verja\n" +
            "No le pegue a la negra\n" +
            "No-no-no-no-no, no-no-no-no-no\n" +
            "No-no-no-no le pegue a la negra\n" +
            "No le pegue a la negra\n" +
            "Negra que me dice en el chambaracaté, chambaracaté\n" +
            "No le pegue a la negra\n" +
            "No le pegue a la negra\n" +
            "No le pegue a la negra\n" +
            "No le pegue a la negra\n" +
            "No le pegue\n" +
            "\n" +
            "You might also like\n" +
            "Boy’s a liar Pt. 2\n" +
            "PinkPantheress & Ice Spice\n" +
            "TQG\n" +
            "KAROL G & Shakira\n" +
            "Favorite Song\n" +
            "Toosii\n" +
            "\n" +
            "[Puente]\n" +
            "Y con ustedes, Chelito de Castro\n" +
            "\n" +
            "[Coro]\n" +
            "Vamos a ver, que le pegue a jeva\n" +
            "No le pegue a la negra\n" +
            "Porque el alma, que el alma, que el alma\n" +
            "Que el alma, que el alma se me revienta\n" +
            "No le pegue a la negra\n" +
            "Eh, no, no, no, no, no, no le pegue a mi negra\n" +
            "No le pegue a la negra\n" +
            "Porque el alma se me agita, mi prieta\n" +
            "No le pegue a la negra\n" +
            "\n" +
            "[Outro]\n" +
            "El Chombo lo sabe\n" +
            "Y tú también, uh\n" +
            "No le pegue a la negra", "La canción \"La rebelión\" de Joe Arroyo tiene un sentido simbólico de resistencia y lucha contra la opresión y la injusticia. La letra de la canción habla sobre la historia de los esclavos africanos que fueron llevados a América Latina durante la época colonial y que se rebelaron contra sus amos para recuperar su libertad y su dignidad. La canción se convirtió en un himno para la comunidad afrodescendiente en América Latina y en un símbolo de la lucha por la igualdad y la justicia social. Además, la música de la canción es una mezcla de ritmos caribeños, africanos y afrocolombianos, lo que refleja la diversidad cultural y étnica de la región y resalta la importancia de la música como forma de expresión y resistencia."),
    Song("Las Caras Lindas", "Ismael Rivera", "El Nazareno", 1978, R.drawable.rivera_ismael, "Las caras lindas de mi gente negra\n" +
            "Son un desfile de melaza en flor\n" +
            "Que cuando pasa frente a mi se alegra\n" +
            "De su negrura, todo el corazón\n" +
            "\n" +
            "Las caras lindas de mi raza prieta\n" +
            "Tienen de llanto, de pena y dolor\n" +
            "Son las verdades, que la vida reta\n" +
            "Pero que llevan dentro mucho amor\n" +
            "\n" +
            "\n" +
            "Somos la melaza que ríe\n" +
            "La melaza que llora\n" +
            "Somos la melaza que ama\n" +
            "Y en cada beso, es conmovedora\n" +
            "\n" +
            "Por eso vivo orgulloso de su colorido\n" +
            "Somos betún amable, de clara poesía\n" +
            "Tienen su ritmo, tienen melodía\n" +
            "Las caras lindas de mi gente negra\n" +
            "\n" +
            "[Coro]\n" +
            "(Las caras lindas, las caras lindas)\n" +
            "Que lindas pero..pero mira que lindas son\n" +
            "(Las caras lindas de mi gente negra)\n" +
            "Tienen, tienen, tienen, tienen de llanto\n" +
            "Mucha melodía, te digo Belen tienen belleza\n" +
            "Y también tienen poesía de la bien linda\n" +
            "(Las caras lindas, las caras lindas)\n" +
            "(Las caras lindas de mi gente negra)\n" +
            "\n" +
            "Caritas lindas de gente negra\n" +
            "Que en La Calma tengo un montón\n" +
            "Las caras lindas de mi gente negra, son un vacilón\n" +
            "(Las caras lindas, las caras lindas)\n" +
            "(Las caras lindas de mi gente negra)\n" +
            "Somos te digo, la melaza que ríe, jajajajaja\n" +
            "Que canta y que llora y en cada beso\n" +
            "Bien conmovedora y cautivadora\n" +
            "(Las caras lindas, las caras lindas)\n" +
            "(Las caras lindas de mi gente negra)\n" +
            "Te digo que en PortoBello Panamá\n" +
            "Yo vi la cara más bella y pura\n" +
            "Y es por eso que mi corazón\n" +
            "Se alegra de su negrura. !Esa si que es linda!\n" +
            "(Las caras lindas, las caras lindas)\n" +
            "(Las caras lindas de mi gente negra)\n" +
            "\n" +
            "You might also like\n" +
            "Comedia\n" +
            "Ismael Rivera\n" +
            "El Nazareno\n" +
            "Ismael Rivera\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "\n" +
            "Suena!\n" +
            "Que lin, que lin, que lindas son\n" +
            "Negrura de la pura!\n" +
            "Que lin, que lin, que lindas son\n" +
            "\n" +
            "(Las caras lindas, las caras lindas)\n" +
            "(Las caras lindas de mi gente negra)\n" +
            "Oyeme, pero que bonitas son, lindas son\n" +
            "Chulas son, bonitas son, lindas que son\n" +
            "Lindas como tú veras, así son\n" +
            "Lindas como aquellas que dije son un vacilón\n" +
            "Un riquito vacilón, con tu corazón, rico de melón\n" +
            "\n" +
            "Que lindas, que lindas, que lindas, que lindas\n" +
            "Que chulas que son, bonitas que son, bien bonitas\n" +
            "Chulitas que son, que lindas son, caritas lindas\n" +
            "Lindas lindas son\n" +
            "Llévame!\n" +
            "\n" +
            "Lindas que son, lindas son\n" +
            "Pero que lindas son, pero que lindas son\n" +
            "Lindas que son, lindas son\n" +
            "Componte!\n" +
            "\n" +
            "Muchas caras lindas\n" +
            "Pero que lin, que lin, que lindas son\n" +
            "\n" +
            "\n" +
            "Roco toco tin pero que lindas que lindas son\n" +
            "Las caras lindas de mi gente negra, son un montón\n" +
            "(Las caras lindas, las caras lindas)\n" +
            "(Las caras lindas de mi gente negra)\n" +
            "Desfile de negrura, de la pura que viene de allá bajo\n" +
            "Las caras lindas de mi gente negra son un vacilón\n" +
            "(Las caras lindas, las caras lindas)\n" +
            "(Las caras lindas de mi gente negra)\n" +
            "Melaza que ríe, melaza que ríe, jajajaja\n" +
            "Ay que canta y que llora, y en cada beso bien conmovedora\n" +
            "Pero que linda!", "\"Las Caras Lindas\" es una canción emblemática de la música afrocaribeña que fue compuesta por el famoso músico puertorriqueño Ismael Rivera. La canción es un homenaje a la belleza y diversidad de las personas afrodescendientes, y se ha convertido en un himno de orgullo para las comunidades afrocaribeñas en Puerto Rico y en todo el mundo.\n" +
            "\n" +
            "La letra de la canción celebra las diferentes tonalidades de piel, rasgos y características de las personas negras, y exalta su valor y su contribución a la cultura y la sociedad. La canción también reconoce las luchas y el dolor histórico de la comunidad afrocaribeña, pero al mismo tiempo, transmite un mensaje de esperanza y resistencia.\n" +
            "\n" +
            "En resumen, \"Las Caras Lindas\" es una canción que trasciende los límites de la música y se convierte en un símbolo de la lucha contra la discriminación racial y la promoción de la diversidad y la inclusión."),
    Song("Llorarás", "Oscar D'León", "30 Años de Éxitos", 1993, R.drawable.descarga, "[Verso 1]\n" +
            "Sé que tú no quieres, que yo a ti te quiera\n" +
            "Siempre tú me esquivas de alguna manera\n" +
            "Si te busco por aquí, me sales por allá\n" +
            "Lo único que yo quiero; no me hagas sufrir más (tú ve')\n" +
            "\n" +
            "[Verso 2]\n" +
            "(Oye, oye bien)\n" +
            "Por tu mal comportamiento, te vas a arrepentir\n" +
            "Bien caro tendrás que pagar todo mi sufrimiento\n" +
            "Llorarás y llorarás sin alguien que te consuele\n" +
            "Así te darás de cuenta que si te engañan duele\n" +
            "\n" +
            "\n" +
            "[Verso 3]\n" +
            "(Oye, mira)\n" +
            "Y después vendrás a mi, pidiéndome perdón\n" +
            "Pero ya mi corazón, no se acuerda más de ti\n" +
            "Llorarás y llorarás sin alguien que te consuele\n" +
            "Así te darás de cuenta que si te engañan duele\n" +
            "\n" +
            "[Puente]\n" +
            "¡Te lo juro que sí!\n" +
            "¡Bandolera!\n" +
            "¡Ahora el que ríe soy yo!\n" +
            "\n" +
            "[Pregón]\n" +
            "Llorarás, llorarás, llorarás (llorarás)\n" +
            "Como lo sufrí yo (llorarás)\n" +
            "Oye tú llorarás (llorarás)\n" +
            "Nadie te comprenderá (llorarás)\n" +
            "Todo lo malo que hiciste (llorarás)\n" +
            "Oye mira lo pagarás (llorarás)\n" +
            "Llorarás, llorarás (llorarás)\n" +
            "Llorarás, llorarás (llorarás)\n" +
            "Tú me hiciste sufrir (llorarás)\n" +
            "Ahora el que ríe soy yo (llorarás)\n" +
            "Que no, que no, que sí, que sí (llorarás)\n" +
            "Ahora yo voy a vivir (llorarás)\n" +
            "Mi vida como yo quiera (llorarás)\n" +
            "Echa pa'lante que me voy (llorarás)\n" +
            "En esta navidad mama (llorarás)\n" +
            "¡Llévatela!", "La canción \"Llorarás\" de Oscar D'León es un clásico de la salsa, en la que se cuenta la historia de una persona que ha sido traicionada por su pareja, y que ahora está sufriendo por su engaño. La letra de la canción evoca sentimientos de dolor y tristeza, y habla sobre la inevitabilidad de las lágrimas después de una desilusión amorosa.\n" +
            "\n" +
            "En este sentido, el tema de la canción es el desamor y la traición, y el sentido simbólico de la misma es el de representar la profunda tristeza y el dolor que se experimentan cuando se pierde a alguien que se amaba. La canción se ha convertido en un himno para aquellos que han sufrido por amor, y ha sido interpretada por muchos otros artistas en diferentes versiones a lo largo de los años."),
    Song("Pedro Navaja", "Willie Colón y Rubén Blades", "Siembra", 1978, R.drawable.willie_y_ruben, "[Verso]\n" +
            "Por la esquina del viejo barrio lo vi pasar\n" +
            "Con el tumba'o que tienen los guapos al caminar\n" +
            "Las manos siempre en los bolsillos de su gabán\n" +
            "Pa' que no sepan en cuál de ellas lleva el puñal\n" +
            "Usa sombrero de ala ancha de medio la'o\n" +
            "Y zapatillas por si hay problemas, salir vola'o\n" +
            "Lentes oscuros pa' que no sepan qué está mirando\n" +
            "Y un diente de oro que cuando ríe se ve brillando\n" +
            "Como a tres cuadras de aquella esquina, una mujer\n" +
            "Va recorriendo la acera entera por quinta vez\n" +
            "Y en un zaguán entra y se da un trago para olvidar\n" +
            "Que el día está flojo y no hay clientes pa' trabajar\n" +
            "Un carro pasa muy despacito por la avenida\n" +
            "No tiene marcas, pero to' saben que e' policía, hmm\n" +
            "Pedro Navaja, las manos siempre dentro 'el gabán\n" +
            "Mira y sonríe y el diente de oro vuelve a brillar\n" +
            "Mientras camina pasa la vista de esquina a esquina\n" +
            "No se ve un alma, está desierta to'a la avenida\n" +
            "Cuando, de pronto, esa mujer sale del zaguán\n" +
            "Y Pedro Navaja aprieta un puño dentro 'el gabán\n" +
            "Mira pa' un lado, mira pa'l otro y no ve a nadie\n" +
            "Y a la carrera, pero sin ruido, cruza la calle\n" +
            "Y mientras tanto, en la otra acera va esa mujer\n" +
            "Refunfuñando, pues no hizo pesos con qué comer\n" +
            "Mientras camina del viejo abrigo saca un revolver, esa mujer\n" +
            "Y va a guardarlo en su cartera pa' que no estorbe\n" +
            "Un .38, Smith & Wesson del especial\n" +
            "Que carga encima pa' que la libre de todo mal\n" +
            "Y Pedro Navaja, puñal en mano, le fue pa' encima\n" +
            "El diente de oro iba alumbrando to'a la avenida (¡Guiso fácil!)\n" +
            "Mientras reía, el puñal le hundía sin compasión\n" +
            "Cuando, de pronto, sonó un disparo como un cañón\n" +
            "Y Pedro Navaja cayó en la acera mientras veía a esa mujer\n" +
            "Que, revolver en mano y de muerte herida, a él le decía:\n" +
            "\"Yo que pensaba: hoy no es mi día, estoy salá'\n" +
            "Pero Pedro Navaja, tú estás peor, ¡no estás en na'!\"\n" +
            "Y créanme, gente, que aunque hubo ruido nadie salió\n" +
            "No hubo curiosos, no hubo preguntas, nadie lloró\n" +
            "Sólo un borracho con los dos cuerpos se tropezó\n" +
            "Cogió el revolver, el puñal, los pesos y se marchó\n" +
            "Y tropezando se fue cantando desafina'o\n" +
            "El coro que aquí les traje, y da el mensaje de mi canción\n" +
            "\n" +
            "\n" +
            "[Coro]\n" +
            "La vida te da sorpresas, sorpresas te da la vida, ¡ay, Dios!\n" +
            "La vida te da sorpresas, sorpresas te da la vida, ¡ay, Dios!\n" +
            "Pedro Navaja, matón de esquina\n" +
            "Quien a hierro mata, a hierro termina\n" +
            "La vida te da sorpresas, sorpresas te da la vida, ¡ay, Dios!\n" +
            "Maleante pescador, el anzuelo que tiraste\n" +
            "En vez de una sardina, un tiburón enganchaste\n" +
            "\n" +
            "[Puente]\n" +
            "La, la, la, la, la, la, la, la\n" +
            "I like to live in America\n" +
            "\n" +
            "[Coro]\n" +
            "La vida te da sorpresas, sorpresas te da la vida, ¡ay, Dios!\n" +
            "Ocho millones de historias tiene la ciudad de Nueva York\n" +
            "La vida te da sorpresas, sorpresas te da la vida, ¡ay, Dios!\n" +
            "Como decía mi abuelita: \"El que de último ríe, se ríe mejor\"\n" +
            "\n" +
            "[Puente]\n" +
            "La, la, la, la, la, la, la, la\n" +
            "La, la, la, la, la, la, la, la\n" +
            "I like to live in America\n" +
            "\n" +
            "[Coro]\n" +
            "La vida te da sorpresas, sorpresas te da la vida, ¡ay, Dios!\n" +
            "Cuando lo manda el destino no lo cambia ni el más bravo\n" +
            "Si naciste pa' martillo del cielo te caen los clavos\n" +
            "La vida te da sorpresas, sorpresas te da la vida, ¡ay, Dios!\n" +
            "En barrio de guapos cuida'o en la acera\n" +
            "Cuida'o camará', que el que no corre, vuela\n" +
            "La vida te da sorpresas, sorpresas te da la vida, ¡ay, Dios!\n" +
            "Como en una novela de Kafka, el borracho doblo por el callejón\n" +
            "La vida te da sorpresas, sorpresas te da la vida, ¡ay Dios!", "\"Pedro Navaja\" es una canción icónica de la salsa, que cuenta la historia de un hombre sin escrúpulos que se dedica a robar y a matar en las calles de la ciudad. La canción se utiliza a menudo como una metáfora de la lucha por la supervivencia en un entorno urbano hostil, en el que los individuos están en constante peligro y deben estar alerta y preparados para enfrentar cualquier situación. Además, la letra también es una crítica social y política, ya que se refiere a la corrupción y la violencia en la sociedad, y llama a la necesidad de un cambio en la mentalidad colectiva. En este sentido, la canción se ha convertido en un himno popular para la lucha contra la injusticia y la opresión."),
    Song("Periódico de Ayer", "Héctor Lavoe", "De ti depende", 1976, R.drawable.hector_lavoe_live__1988, "[Verso]\n" +
            "Tu amor es un periódico de ayer\n" +
            "Que nadie más procura ya leer\n" +
            "Sensacional cuando salió en la madrugada\n" +
            "A mediodía ya noticia confirmada\n" +
            "Y en la tarde materia olvidada\n" +
            "Tu amor es un periódico de ayer\n" +
            "Fue el titular que alcanzó página entera\n" +
            "Por eso ya te conocen donde quiera\n" +
            "Tu nombre ha sido un recorte que guardé\n" +
            "Y en el álbum del olvido lo pegué\n" +
            "Tu amor es un periódico de ayer\n" +
            "Que nadie más procura ya leer\n" +
            "El comentario que nació en la madrugada\n" +
            "Y fuimos ambos la noticia propagada\n" +
            "Y en la tarde materia olvidada\n" +
            "Tu amor es un periódico de ayer\n" +
            "\n" +
            "\n" +
            "[Puente 1]\n" +
            "¡Cógelo ahora, Lola!\n" +
            "\n" +
            "[Coro]\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "Oye noticia que todos saben, ya yo no quiero leer\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "Tú no serviste pa' nada mami, y al safacon yo te eché\n" +
            "Echa camina, apartate de mi vera, apartate de mi lado\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "Tu eres el diario La Prensa, Radio Bemba, Radio Bemba\n" +
            "\n" +
            "[Puente 2]\n" +
            "¡Sacúde, doble fea!\n" +
            "\n" +
            "[Coro]\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "¿Para qué voy a leer la historia de un amor que no puedo ni creer?\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "Te quise, te tuve, te mantuve, pero ya no te quiero\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "A tu casa yo no voy, Polito, dame y tumba la cheveta, ¡La chaveta!\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "En el álbum de mi vida, en una página escondida, allí te encontré\n" +
            "\n" +
            "[Coro]\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "Anda vete de mi vera, cosa buena, ya no te quiero ni ver\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "¿Qué te pasa?, ¿estás llorando?, tienes alma de papel\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "Y como el papel aguanta todo, así mismo te trate\n" +
            "¿Y para qué leer un periódico de ayer?\n" +
            "Analizate tu historia, y así podrás comprender", "La canción \"Periódico de Ayer\" es considerada uno de los grandes clásicos de la música salsa, y ha sido interpretada por varios artistas y orquestas. La letra de la canción habla de un amor que se ha perdido, comparándolo con las noticias del periódico de ayer, que ya no tienen importancia. A través de su letra, Lavoe expresa el dolor y la tristeza de un amor perdido, y el deseo de recuperar lo que se ha ido.\n" +
            "\n" +
            "El sentido simbólico de la canción es una reflexión sobre el paso del tiempo y la efímera naturaleza del amor y las relaciones humanas. La letra sugiere que el pasado ya no tiene importancia, y que lo que importa es el presente y el futuro. También sugiere que las noticias del pasado ya no tienen relevancia, y que lo importante es vivir el presente y crear nuevas historias.\n" +
            "\n" +
            "En resumen, \"Periódico de Ayer\" es una canción emblemática de la música salsa que habla sobre la pérdida del amor y la importancia de vivir el presente. A través de su letra, Héctor Lavoe transmite un sentido simbólico profundo que ha resonado en muchas personas a lo largo de los años."),
    Song("\"Quítate Tú\" (You Step Aside)\n", "Fania All Stars", "Live at the Cheetah, Volume 1", 1972, R.drawable._1sgnr8hhql__sl1500_, "Quitate tu pa'ponerme yo quitate tu\n" +
            "Quitate tu pa'ponerme yo quitate tu\n" +
            "Para que bailen los pollos Pa'que gosen si señor\n" +
            "No me importa lo que digan Porque yo soy tiburon\n" +
            "\n" +
            "Quitate tu pa'ponerme yo quitate tu\n" +
            "Quitate tu pa'ponerme yo quitate tu\n" +
            "Oreste Roberto y Rey aora vienen acabando\n" +
            "Con la fania all star AdalBerto esta inspirando\n" +
            "\n" +
            "Quitate tu pa'ponerme yo quitate tu\n" +
            "Quitate tu pa'ponerme yo quitate tu\n" +
            "De donde viene este prieto se preguntan mucha gente\n" +
            "De la caldera de ponce vengo yo con este ritmo caliente\n" +
            "\n" +
            "\n" +
            "Quitate tu pa'ponerme yo quitate tu\n" +
            "Quitate tu pa'ponerme yo quitate tu\n" +
            "Este ritmo caballero llegara hasta mañana\n" +
            "El que no save cantar por mi madre me lo como\n" +
            "\n" +
            "Quitate tu pa'ponerme yo quitate tu\n" +
            "Quitate tu pa'ponerme yo quitate tu\n" +
            "\n" +
            "Ahora yo traigo un ritmo este es un ritmo moruno\n" +
            "Y yo vengo con\n" +
            "La fania caballero, cantando mi son montuno\n" +
            "\n" +
            "Quitate tu pa'ponerme yo\n" +
            "Quitate tu pa'calificar en la rumba, tu tienes que\n" +
            "Meter mano si no lo haces echate pa' fuera\n" +
            "Mira que vengo acabando te lo digo yo\n" +
            "Cheo feliciano\n" +
            "\n" +
            "Quitate tu pa'ponerme yo\n" +
            "Quitate tu hay caballero yo le digo cuando me pongo a inspirar\n" +
            "Esque tambien soy de ponce y tambien\n" +
            "Yo se cantar por mi madre juro yo\n" +
            "\n" +
            "Quitate tu pa'ponerme yo\n" +
            "Quitate tu soy un givaro que siento por que la gefa me admira\n" +
            "Esta musica me inspira y asi me gusta inspirar mama\n" +
            "Pongo ala gente a gosar\n" +
            "Con mi sabrosa guajira\n" +
            "\n" +
            "You might also like\n" +
            "El Rey De La Puntualidad\n" +
            "Héctor Lavoe\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "Fingertips\n" +
            "Lana Del Rey\n" +
            "\n" +
            "Quitate tu pa'ponerme yo\n" +
            "Quitate tu ahora tu te quitaste\n" +
            "Pero ora vengo yo\n" +
            "Aunque sea muy chikitito pero\n" +
            "No soy trucoro\n" +
            "\n" +
            "Quitate tu pa'ponerme yo\n" +
            "Quitate tu hablando aqui en la esquina\n" +
            "Cantando le traigo yo este rico son monduno\n" +
            "Pa'que goce el sabroson\n" +
            "\n" +
            "Quitate tu pa'ponerme yo\n" +
            "Quitate tu", "La canción \"Quítate Tú\" es una de las canciones más icónicas del género de la salsa, y se ha convertido en un himno para los latinos y los amantes de la música latina en todo el mundo. En su sentido simbólico, la canción habla de la importancia de ceder el espacio y permitir que otros muestren sus talentos y habilidades. En la letra, el cantante pide que se aparten y se den un paso atrás para que otros puedan mostrar lo que pueden hacer. Esto tiene una resonancia particular en la cultura latina, que valora mucho la competencia y el talento, pero también la humildad y el respeto por los demás. En este sentido, \"Quítate Tú\" es una canción que celebra la diversidad y la creatividad, al tiempo que promueve la idea de que todos tenemos algo que aportar y que debemos estar dispuestos a ceder el espacio para que otros puedan brillar."),
    Song("Sin Salsa No Hay Paraíso", "El Gran Combo de Puerto Rico", "Aquí No Se Sienta Nadie", 1995, R.drawable.gran_combo_foto, "Señores yo soy salsero\n" +
            "Para salsero mi dios me quiso\n" +
            "Me puso a cantar en clave y\n" +
            "Con mi sabor estoy en el guiso\n" +
            "\n" +
            "Oiga mi gente yo bailo salsa\n" +
            "Bailando salsa papa me hizo\n" +
            "Cantando salsa me elevo al cielo\n" +
            "Porque sin salsa no hay paraíso\n" +
            "\n" +
            "No hay paraíso no\n" +
            "Porque sin salsa no hay paraíso\n" +
            "Si no hay clave pues no hay guiso\n" +
            "Porque sin salsa no hay paraíso\n" +
            "\n" +
            "\n" +
            "Cuando en la radio yo escucho salsa\n" +
            "Yo me emociono y hasta me erizo\n" +
            "Y para encender la fiesta\n" +
            "Yo, espero el punto preciso\n" +
            "Mi salsa esta en toda partes\n" +
            "La baila el chino también el suizo\n" +
            "\n" +
            "Que dios bendiga la salsa\n" +
            "Porque sin salsa no hay paraíso\n" +
            "No hay paraíso no\n" +
            "Porque sin salsa no hay paraíso\n" +
            "No no no no no no hay paraíso\n" +
            "Que va porque sin salsa no hay paraíso\n" +
            "\n" +
            "Bailando salsa bambalina me hizo\n" +
            "Mi madrina es la salsa\n" +
            "Y mi padrino es el ritmo\n" +
            "Rumba rumba rumba rumba con\n" +
            "Rumba fue mi bautizo\n" +
            "\n" +
            "Que yo la canto desde jovencito\n" +
            "Con el gran combo sigo en lo mismo\n" +
            "Yo, yo canto en clave porque dios lo quiso\n" +
            "\n" +
            "Paraíso no hay paraíso no hay\n" +
            "Paraíso no hay sin salsa\n" +
            "Cuando se ponga un bien bello\n" +
            "Yo me siento en el eden\n" +
            "Si no hay un orquesta, si no hay una banda\n" +
            "Y si el pueblo no la canta ni la baila\n" +
            "\n" +
            "You might also like\n" +
            "El Comején\n" +
            "El Gran Combo de Puerto Rico\n" +
            "Brujeria\n" +
            "El Gran Combo de Puerto Rico\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "\n" +
            "La baila el chino, la baila el suizo\n" +
            "Por eso estamos en el mismo ritmo\n" +
            "Esto es internacional y mundial, y a la gente le encanta\n" +
            "El mundo entero baila esta salsa", "La canción \"Sin salsa no hay paraíso\" del grupo El Gran Combo de Puerto Rico destaca la importancia de la salsa como parte integral de la identidad cultural de Puerto Rico y el Caribe en general. A través de la letra, el grupo resalta cómo la salsa es un género musical que se vive y se siente en cada esquina de la isla y que es parte de la alegría y la pasión de su gente. Además, la canción invita a la gente a unirse y disfrutar juntos de la salsa, como una forma de celebrar la vida y superar los problemas cotidianos. En este sentido, la canción tiene un sentido simbólico de la salsa como una expresión cultural y social que une a las personas y les brinda una sensación de pertenencia y felicidad."),
    Song("Toro Mata", "Celia Cruz y Johnny Pacheco", "Celia & Johnny", 1974, R.drawable.toro_mata, "Toro mata y toro mata\n" +
            "Toro mata rumbambero y toro mata toro torito\n" +
            "\n" +
            "Toro mata y toro mata\n" +
            "Toro mata rumbambero y toro mata\n" +
            "\n" +
            "Apolon le permite hacer el quite pichinche toro mata toro toro torito\n" +
            "\n" +
            "Apolon le permite hacer el quite pichinche toro mata toro toro\n" +
            "\n" +
            "Toro mata y toro mata\n" +
            "Toro mata rumbambero y toro mata toro torito y toro\n" +
            "\n" +
            "\n" +
            "Toro mata y toro mata\n" +
            "Toro mata rumbambero y toro mata\n" +
            "\n" +
            "Toro viejo se murio mañana comemos carne hay toro mata toro toro torito\n" +
            "\n" +
            "Toro viejo se murio mañana comemos carne hay toro mata toro toro torito\n" +
            "\n" +
            "Toro mata y toro mata\n" +
            "Toro mata rumbambero hay toro mata toro torito\n" +
            "\n" +
            "Toro mata y toro mata\n" +
            "Toro mata rumbambero hay toro mata\n" +
            "\n" +
            "Apolon no le permite hacer el quite pichinche toro mata toro toro torito\n" +
            "\n" +
            "Apolon no le permite hacer el quite pichinche toro mata toro toro torito\n" +
            "\n" +
            "Toro mata y toro mata\n" +
            "Toro mata rumbambero hay toro mata torito toro toro\n" +
            "\n" +
            "Toro mata y toro mata\n" +
            "Toro mata rumbambero hay toro mata\n" +
            "\n" +
            "Quien trajo a ese negro aqui\n" +
            "Ay la pondé pondé se fugo de manati ay la pondé\n" +
            "Ponde el negro cara bali ay la pónde pónde ay\n" +
            "La pónde la pongo la ponde yeeeehhh\n" +
            "\n" +
            "You might also like\n" +
            "Vieja Luna\n" +
            "Celia Cruz\n" +
            "Quimbara\n" +
            "Celia Cruz\n" +
            "Quimbara\n" +
            "Celia Cruz\n" +
            "\n" +
            "Ay la pondé pondé yeeeh toro mata ay toro mata ay toro mata ay la pónde", "\"Toro mata\" es una canción de salsa que habla sobre el poder y la fuerza del toro, un símbolo de la masculinidad y la virilidad. La letra de la canción describe al toro como un animal feroz y orgulloso, que puede matar a cualquier persona que se le acerque demasiado. En este sentido, la canción puede ser interpretada como una metáfora de la lucha y la competencia en el amor y la vida en general, y cómo uno debe ser fuerte y decidido para sobrevivir y triunfar. Además, la canción también celebra la cultura y las tradiciones afro-cubanas, incorporando ritmos y sonidos típicos de la música afrocaribeña. \"Toro mata\" es considerada una de las canciones más icónicas de la carrera de Celia Cruz y Johnny Pacheco, y es ampliamente reconocida como un clásico de la salsa."),
    Song("Ven, devórame otra vez", "Lalo Rodríguez", "Simplemente...Lalo", 1988, R.drawable.lalo_rodriguez, "[Intro]\n" +
            "He llenado tu tiempo vacío de aventuras más\n" +
            "Y mi mente ha parido nostalgia por no verte ya\n" +
            "Y haciendo el amor te he nombrado sin quererlo yo\n" +
            "Porque en todas busco lo salvaje de tu sexo amor\n" +
            "\n" +
            "[Verso]\n" +
            "Hasta en sueños he creído tenerte devorándome\n" +
            "Y he mojado mis sabanas blancas recordándote\n" +
            "En mi cama nadie es como tu\n" +
            "No he podido encontrar la mujer\n" +
            "Que dibuje mi cuerpo en cada rincón\n" +
            "Sin que sobre un pedazo de piel\n" +
            "\n" +
            "\n" +
            "[Coro]\n" +
            "Ay ven devórame otra vez\n" +
            "Ven devórame otra vez\n" +
            "Ven castígame con tus deseos más\n" +
            "Que el vigor lo guardé para ti\n" +
            "Ay ven devórame otra vez\n" +
            "Ven devórame otra vez\n" +
            "Que la boca me sabe a tu cuerpo\n" +
            "Desesperan mis ganas por ti\n" +
            "\n" +
            "[Verso]\n" +
            "Hasta en sueños he creído tenerte devorándome\n" +
            "Y he mojado mis sabanas blancas recordándote\n" +
            "En mi cama nadie es como tu\n" +
            "No he podido encontrar la mujer\n" +
            "Que dibuje mi cuerpo en cada rincón\n" +
            "Sin que sobre un pedazo de piel, ay ven\n" +
            "\n" +
            "[Coro]\n" +
            "Ay ven devórame otra vez\n" +
            "Ven devórame otra vez\n" +
            "Ven castígame con tus deseos más\n" +
            "Que el vigor lo guardé para ti\n" +
            "Ay ven devórame otra vez\n" +
            "Ven devórame otra vez\n" +
            "Que la boca me sabe a tu cuerpo\n" +
            "Desesperan mis ganas por ti\n" +
            "\n" +
            "You might also like\n" +
            "Nobody Gets Me\n" +
            "SZA\n" +
            "Devórame\n" +
            "Ñengo Flow\n" +
            "Low\n" +
            "SZA\n" +
            "\n" +
            "Hasta en sueños he creído tenerte devorándome\n" +
            "Y he mojado mis sabanas blancas recordándote\n" +
            "En mi cama nadie es como tu\n" +
            "No he podido encontrar la mujer\n" +
            "Que dibuje mi cuerpo en cada rincón\n" +
            "Sin que sobre un pedazo de piel\n" +
            "\n" +
            "[Coro]\n" +
            "Ven devórame otra vez, ven devórame otra vez\n" +
            "Ven castígame con tus deseos más\n" +
            "Que el vigor lo guarde para ti\n" +
            "Ay ven devórame otra vez\n" +
            "Ven devórame otra vez\n" +
            "Que la boca me sabe a tu cuerpo d\n" +
            "Desesperan mis ganas por ti\n" +
            "\n" +
            "[Coro]\n" +
            "Ven devórame otra vez, devórame otra vez\n" +
            "Hace tiempo que mi cuerpo\n" +
            "Esta reclamando en silencio\n" +
            "Tus momentos de placer\n" +
            "Son ansias de amarte\n" +
            "Deseos de mi carne\n" +
            "Que hacen que te llame ven devórame\n" +
            "Devórame otra vez, devórame otra vez\n" +
            "Devórame suavecito y con calma\n" +
            "Hasta el amanecer\n" +
            "Ven castígame con tus deseos más\n" +
            "Que el vigor lo guarde para ti, ven", "\"Ven, devórame otra vez\" es una canción de salsa romántica que habla sobre un deseo ardiente y apasionado entre dos amantes. La letra describe la necesidad de estar juntos y la intensidad del deseo sexual.\n" +
            "\n" +
            "El sentido simbólico de la canción es el de la pasión y el amor desenfrenado, que puede ser visto como una metáfora de la vida misma y la búsqueda constante del placer y la satisfacción. La letra sugiere que la única forma de satisfacer este deseo ardiente es a través de la entrega total al otro, sin restricciones ni limitaciones.\n" +
            "\n" +
            "En resumen, \"Ven, devórame otra vez\" es una canción icónica de la salsa romántica que explora los temas de la pasión y el deseo apasionado, y que ha sido interpretada por diversos artistas y ha sido popular en la cultura latina por décadas."),
    Song("Vivir mi vida", "Marc Anthony", "3.0", 2013, R.drawable.marc_anthony, "[Intro]\n" +
            "Voy a reír, voy a bailar\n" +
            "Vivir mi vida la la la la\n" +
            "Voy a reír, voy a gozar\n" +
            "Vivir mi vida la la la la\n" +
            "\n" +
            "[Chorus]\n" +
            "Voy a reír (¡Eso!), voy a bailar\n" +
            "Vivir mi vida la la la la\n" +
            "Voy a reír, voy a gozar\n" +
            "Vivir mi vida la la la la\n" +
            "\n" +
            "\n" +
            "[Verse 1]\n" +
            "A veces llega la lluvia\n" +
            "Para limpiar las heridas\n" +
            "A veces sólo una gota\n" +
            "Puede vencer la sequía\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Y para qué llorar, ¿pa' qué?\n" +
            "Si duele una pena, se olvida\n" +
            "Y para qué sufrir, ¿pa' qué?\n" +
            "Si así es la vida, hay que vivirla la la le\n" +
            "\n" +
            "[Chorus]\n" +
            "Voy a reír, voy a bailar\n" +
            "Vivir mi vida la la la la\n" +
            "Voy a reír, voy a gozar\n" +
            "Vivir mi vida la la la la\n" +
            "¡Eso!\n" +
            "\n" +
            "[Verse 2]\n" +
            "Voy a vivir el momento\n" +
            "Para entender el destino\n" +
            "Voy a escuchar en silencio\n" +
            "Para encontrar el camino\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Y para qué llorar, ¿pa' qué?\n" +
            "Si duele una pena, se olvida\n" +
            "Y para qué sufrir, ¿pa' qué?\n" +
            "Si duele una pena, se olvida la la le\n" +
            "\n" +
            "You might also like\n" +
            "Marc Anthony - Vivir Mi Vida (English Translation)\n" +
            "Genius English Translations\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "HOPE\n" +
            "NF\n" +
            "\n" +
            "[Chorus]\n" +
            "Voy a reír (¡Toma!), voy a bailar\n" +
            "Vivir mi vida la la la la\n" +
            "Voy a reír, voy a gozar\n" +
            "Vivir mi vida la la la la\n" +
            "¡Mi gente!\n" +
            "¡Toma!\n" +
            "\n" +
            "[Verse 3]\n" +
            "Voy a reír, voy a bailar\n" +
            "¿Pa’ qué llorar? ¿Pa’ qué sufrir?\n" +
            "Empieza a soñar, a reír\n" +
            "Voy a reír, voy a bailar (¡Toma!)\n" +
            "Siente y baila y goza\n" +
            "Que la vida es una sola\n" +
            "Voy a reír, voy a bailar\n" +
            "Vive, sigue\n" +
            "Siempre pa’lante\n" +
            "No mires pa’ tras\n" +
            "¡Eso!\n" +
            "¡Mi gente!\n" +
            "La vida es una\n" +
            "Haha\n" +
            "¡Toma!\n" +
            "\n" +
            "[Chorus]\n" +
            "Voy a reír, voy a bailar\n" +
            "Vivir mi vida la la la la\n" +
            "Voy a reír, voy a gozar\n" +
            "Vivir mi vida la la la la", "La canción \"Vivir mi vida\" es un himno de positividad y superación personal que invita al oyente a seguir adelante y disfrutar de la vida a pesar de los obstáculos y las adversidades. La letra habla de cómo, a pesar de los momentos difíciles que ha atravesado, el cantante está decidido a vivir su vida al máximo y disfrutar cada momento. La canción también tiene un sentido simbólico como un mensaje de empoderamiento para aquellos que enfrentan dificultades, alentándolos a perseverar y encontrar la felicidad en sus vidas. El ritmo de la canción es alegre y bailable, lo que la convierte en un éxito popular en todo el mundo.")
)

val songSoul = listOf(
    Song("(Sittin' On) The Dock of the Bay", "Otis Redding", "The Dock of the Bay", 1968, R.drawable.otis_redding_1967, "[Intro]\n" +
            "Voy a reír, voy a bailar\n" +
            "Vivir mi vida la la la la\n" +
            "Voy a reír, voy a gozar\n" +
            "Vivir mi vida la la la la\n" +
            "\n" +
            "[Chorus]\n" +
            "Voy a reír (¡Eso!), voy a bailar\n" +
            "Vivir mi vida la la la la\n" +
            "Voy a reír, voy a gozar\n" +
            "Vivir mi vida la la la la\n" +
            "\n" +
            "\n" +
            "[Verse 1]\n" +
            "A veces llega la lluvia\n" +
            "Para limpiar las heridas\n" +
            "A veces sólo una gota\n" +
            "Puede vencer la sequía\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Y para qué llorar, ¿pa' qué?\n" +
            "Si duele una pena, se olvida\n" +
            "Y para qué sufrir, ¿pa' qué?\n" +
            "Si así es la vida, hay que vivirla la la le\n" +
            "\n" +
            "[Chorus]\n" +
            "Voy a reír, voy a bailar\n" +
            "Vivir mi vida la l[Verse 1]\n" +
            "Sittin' in the mornin' sun\n" +
            "I'll be sittin' when the evenin' come\n" +
            "Watching the ships roll in\n" +
            "And then I watch 'em roll away again, yeah\n" +
            "\n" +
            "[Chorus]\n" +
            "I'm sittin' on the dock of the bay\n" +
            "Watching the tide roll away\n" +
            "Ooh, I'm just sittin' on the dock of the bay\n" +
            "Wastin' time\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "I left my home in Georgia\n" +
            "Headed for the 'Frisco bay\n" +
            "'Cause I've had nothing to live for\n" +
            "And look like nothin's gonna come my way\n" +
            "\n" +
            "[Chorus]\n" +
            "So I'm just gonna sit on the dock of the bay\n" +
            "Watching the tide roll away\n" +
            "Ooh, I'm sittin' on the dock of the bay\n" +
            "Wastin' time\n" +
            "\n" +
            "[Bridge]\n" +
            "Look like nothing's gonna change\n" +
            "Everything still remains the same\n" +
            "I can't do what ten people tell me to do\n" +
            "So I guess I'll remain the same, yes\n" +
            "\n" +
            "[Verse 3]\n" +
            "Sittin' here resting my bones\n" +
            "And this loneliness won't leave me alone\n" +
            "It's two thousand miles I roamed\n" +
            "Just to make this dock my home\n" +
            "\n" +
            "[Chorus]\n" +
            "Now, I'm just gonna sit at the dock of the bay\n" +
            "Watching the tide roll away\n" +
            "Ooh-wee, I'm sittin' on the dock of the bay\n" +
            "Wastin' time\n" +
            "\n" +
            "[Outro]\n" +
            "*Whistling*", "La canción \"The Dock of the Bay\" es considerada un clásico de la música soul y se ha convertido en un himno para aquellos que buscan escapar del estrés y la agitación de la vida cotidiana. La letra de la canción habla de un hombre que está sentado en un muelle, mirando el agua y reflexionando sobre su vida y sus luchas. Aunque la canción tiene un tono melancólico, también es una celebración de la tranquilidad y la serenidad que se puede encontrar en la naturaleza y la soledad. La canción se ha convertido en un himno para aquellos que buscan encontrar la paz interior y la tranquilidad en un mundo cada vez más caótico. La canción también es un tributo a Otis Redding, quien murió trágicamente en un accidente de avión poco después de su lanzamiento, convirtiéndose en un legado musical y un recordatorio de la belleza y la fragilidad de la vida."),
    Song("Ain't No Sunshine", "Bill Withers", "Just As I Am", 1971, R.drawable._40px_bill_withers_1976, "[Verse 1]\n" +
            "Ain't no sunshine when she's gone\n" +
            "It's not warm when she's away\n" +
            "Ain't no sunshine when she's gone\n" +
            "And she's always gone too long\n" +
            "Anytime she goes away\n" +
            "\n" +
            "[Verse 2]\n" +
            "Wonder this time where she's gone\n" +
            "Wonder if she's gonna stay\n" +
            "Ain't no sunshine when she's gone\n" +
            "And this house just ain't no home\n" +
            "Anytime she goes away\n" +
            "\n" +
            "\n" +
            "[Bridge]\n" +
            "And I know, I know, I know, I know\n" +
            "I know, I know, I know, I know\n" +
            "I know, I know, I know, I know\n" +
            "I know, I know, I know, I know\n" +
            "I know, I know, I know, I know\n" +
            "I know, I know, I know, I know\n" +
            "I know, I know\n" +
            "Hey, I ought to leave the young thing alone\n" +
            "But ain't no sunshine when she's gone\n" +
            "\n" +
            "[Verse 3]\n" +
            "Ain't no sunshine when she's gone\n" +
            "Only darkness everyday\n" +
            "Ain't no sunshine when she's gone\n" +
            "And this house just ain't no home\n" +
            "Anytime she goes away\n" +
            "\n" +
            "[Outro]\n" +
            "Anytime she goes away\n" +
            "Anytime she goes away\n" +
            "Anytime she goes away", "La canción \"Ain't No Sunshine\" es una poderosa balada soul que habla sobre la tristeza y la soledad que se siente cuando alguien a quien amas se va. Con su letra emotiva y su ritmo suave, la canción se ha convertido en un clásico de la música popular y ha sido interpretada por muchos otros artistas.\n" +
            "\n" +
            "En términos simbólicos, la canción puede representar el sentimiento de pérdida y de vacío emocional que se siente cuando se pierde a alguien importante en la vida. También puede simbolizar la nostalgia y la melancolía que se experimenta al recordar momentos felices del pasado que ya no volverán. La repetición constante de la frase \"Ain't no sunshine when she's gone\" puede representar el vacío y la oscuridad que se siente cuando alguien que iluminaba tu vida ya no está presente. En resumen, \"Ain't No Sunshine\" es una canción emocionalmente profunda que puede representar diferentes sentidos simbólicos para cada oyente."),
    Song("Let's Stay Together", "Al Green", "Let's Stay Together", 1972, R.drawable.channels4_profile, "[Verse 1]\n" +
            "I, I'm so in love with you\n" +
            "Whatever you want to do is alright with me\n" +
            "'Cause you make me feel so brand new\n" +
            "And I want to spend my life with you\n" +
            "\n" +
            "[Verse 2]\n" +
            "Let me say that since, baby, since we've been together\n" +
            "Ooh, loving you forever is what I need\n" +
            "Let me be the one you come running to\n" +
            "I'll never be untrue\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "Ooh, baby, let's, let's stay together\n" +
            "Lovin' you whether\n" +
            "Whether times are good or bad, happy or sad\n" +
            "Ooh, yeah\n" +
            "Whether times are good or bad, happy or sad\n" +
            "\n" +
            "[Verse 3]\n" +
            "Why somebody, why people break up\n" +
            "Turn around and make up, I just can't see\n" +
            "You'd never do that to me, would you baby?\n" +
            "Just being around you is all I see, it's what I want to do\n" +
            "\n" +
            "[Chorus]\n" +
            "Let's, we ought to stay together\n" +
            "Lovin' you whether\n" +
            "Whether times are good or bad, happy or sad\n" +
            "\n" +
            "[Outro]\n" +
            "C'mon, let's, let's stay together\n" +
            "I'll keep on lovin' you whether\n" +
            "Whether times are, oh times are good or times are bad", "La canción \"Let's Stay Together\" de Al Green es un himno de amor y compromiso. Con su letra dulce y suave, la canción habla sobre la importancia de mantener una relación amorosa fuerte y duradera, incluso en momentos difíciles. El mensaje principal de la canción es que el amor verdadero puede superar cualquier obstáculo, y que los amantes deben estar dispuestos a trabajar juntos y permanecer juntos a pesar de los desafíos que puedan enfrentar. \"Let's Stay Together\" es considerada una de las canciones más icónicas del soul y ha sido versionada y reinterpretada por muchos artistas a lo largo de los años."),
    Song("Don't Play That Song For Me", "Aretha Franklin", "Spirit in the Dark", 1970, R.drawable._00px_aretha_franklin_1968, "[Verse 1]\n" +
            "Don’t play that song for me\n" +
            "Cause it brings back memories\n" +
            "Of days that I once knew\n" +
            "The days that I spent with you\n" +
            "Oh no! Don’t let them play it (Oh no!)\n" +
            "It fills my heart with pain (It hurts!)\n" +
            "Please stop it right away\n" +
            "'Cause I remember just a' what he said\n" +
            "\n" +
            "[Chorus]\n" +
            "He said, darling (Darling I, I love you)\n" +
            "And I know that he lied (Darling I, I love you)\n" +
            "You know that you lied (Darling I, I love you)\n" +
            "You know that you lied (You lied)\n" +
            "Lied (You lied)\n" +
            "You lied (To me)\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "Hey mister, don’t play it no more\n" +
            "Don’t play it no more\n" +
            "I can’t stand it\n" +
            "Don’t play it no more (No more)\n" +
            "No more (No more)\n" +
            "No more (Can't stand it)\n" +
            "I remember on our first date\n" +
            "He kissed me and he walked away\n" +
            "I was only seventeen\n" +
            "I never dreamed he'd be so mean\n" +
            "\n" +
            "[Chorus]\n" +
            "He told me darling (Darling, I love you)\n" +
            "Baby, baby, you lied (Darling, I need you)\n" +
            "You, you lied (Darling, I love you)\n" +
            "You know that you lied (You lied)\n" +
            "Lied (You lied)\n" +
            "Lied, lied (To me)\n" +
            "\n" +
            "[Outro]\n" +
            "O-o-oh darling (Darling, I love you)\n" +
            "You know that you lied, yeah (Darling, I need you)\n" +
            "You know i know you lied (Darling, I love you)\n" +
            "Darling, you lied (You lied)\n" +
            "You lied (You lied)\n" +
            "You lied. You’re all that I need. You lied (To me)\n" +
            "O-u-o-o-o-oh, you lied (Don't play it no more)\n" +
            "Hey baby don’t play it no more (Wo-o-oh, don't play it no more)\n" +
            "Don’t do it. Don’t play it no more (Wo-o-oh, for me)\n" +
            "No more (For me)\n" +
            "I can’t stand it no more (Don't play it no more)\n" +
            "Ouh! Hey! Don’t play it no more (Wo-o-oh, don’t play it no more)", "La canción \"Don't Play That Song For Me\" de Aretha Franklin es una reflexión sobre el dolor y el sufrimiento que se siente cuando una canción te recuerda a alguien que amas y que ya no está contigo. La letra habla de la necesidad de superar ese dolor y avanzar en la vida, dejando atrás los recuerdos y las emociones que puedan detenernos. La canción es un llamado a la fortaleza y la determinación, a pesar de los desafíos y la adversidad que puedan presentarse. Con su poderosa voz y su emotiva interpretación, Aretha Franklin transmite un mensaje de esperanza y superación personal que resuena en todos aquellos que han experimentado la pérdida y el dolor en sus vidas."),
    Song("Back to Black", "Amy Winehouse", "Back to Black", 2006, R.drawable.amy_winehouse, "[Verse 1]\n" +
            "He left no time to regret\n" +
            "Kept his dick wet with his same old safe bet\n" +
            "Me and my head high\n" +
            "And my tears dry, get on without my guy\n" +
            "You went back to what you know\n" +
            "So far removed from all that we went through\n" +
            "And I tread a troubled track\n" +
            "My odds are stacked, I'll go back to black\n" +
            "\n" +
            "[Chorus]\n" +
            "We only said goodbye with words\n" +
            "I died a hundred times\n" +
            "You go back to her and I go back to\n" +
            "I go back to us\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "I love you much, it's not enough\n" +
            "You love blow and I love puff\n" +
            "And life is like a pipe\n" +
            "And I'm a tiny penny rollin' up the walls inside\n" +
            "\n" +
            "[Chorus]\n" +
            "We only said goodbye with words\n" +
            "I died a hundred times\n" +
            "You go back to her and I go back to\n" +
            "We only said goodbye with words\n" +
            "I died a hundred times\n" +
            "You go back to her and I go back to\n" +
            "\n" +
            "[Bridge]\n" +
            "Black, black, black, black\n" +
            "Black, black, black\n" +
            "I go back to\n" +
            "I go back to\n" +
            "\n" +
            "[Chorus]\n" +
            "We only said goodbye with words\n" +
            "I died a hundred times\n" +
            "You go back to her and I go back to\n" +
            "We only said goodbye with words\n" +
            "I died a hundred times\n" +
            "You go back to her and I go back to black", "\"Back to Black\" es una canción que habla sobre la ruptura de una relación amorosa y la tristeza y dolor que siente la protagonista. Aunque en apariencia puede parecer una canción sobre una situación común en el amor, hay ciertos elementos que le otorgan un sentido simbólico profundo.\n" +
            "\n" +
            "En primer lugar, el título de la canción, \"Back to Black\", se refiere a la idea de volver a una etapa oscura o negativa. Esto se puede interpretar como un símbolo de la depresión y la adicción que Amy Winehouse sufrió durante gran parte de su vida, y que eventualmente la llevaron a su prematura muerte.\n" +
            "\n" +
            "Además, la letra de la canción describe la protagonista como una \"viuda negra\", lo que puede ser interpretado como un símbolo de la muerte y la destrucción que lleva consigo el amor, y la forma en que a veces puede dejar a las personas emocionalmente destrozadas.\n" +
            "\n" +
            "En resumen, \"Back to Black\" es una canción con un fuerte sentido simbólico, que habla sobre el dolor y la tristeza que se siente después de una ruptura amorosa, pero que también puede ser interpretada como un símbolo de la depresión y la adicción, y de la oscuridad que puede habitar en el corazón humano."),
    Song("My Woman's Good To Me", "George Benson", "Tell It Like It Is", 1969, R.drawable.george_benson, "Your lips are warm and close to mine\n" +
            "I know they taste like warm red wine\n" +
            "And if I'd let myself go, I know I'd fall\n" +
            "But someone waiting all alone\n" +
            "By an lonely telephone\n" +
            "And though I'd love to stay, I know I'll call\n" +
            "\n" +
            "'Cause I\n" +
            "Can't forget her\n" +
            "No I\n" +
            "Can't forget her\n" +
            "No, no, no\n" +
            "'Cause my woman's good to me\n" +
            "\n" +
            "Her eyes are not as brown as yours\n" +
            "Her lips are not as soft as yours\n" +
            "And if kiss you, she'd probably never know\n" +
            "But when tomorrow brings the sun\n" +
            "I'll have to live with what I done\n" +
            "And though I'd love to stay, I know I'll go\n" +
            "\n" +
            "'Cause I\n" +
            "Can't forget her\n" +
            "No I\n" +
            "Can't forget her\n" +
            "No, no, no\n" +
            "My woman's good to me\n" +
            "My woman is good to me\n" +
            "My woman's good to me", "\"My Woman's Good To Me\" es una canción de amor que expresa gratitud y apreciación hacia la pareja. El sentido simbólico de la canción puede ser interpretado como un homenaje a la mujer en la vida del cantante, reconociendo su importancia y su papel en su vida. La letra también puede ser vista como un recordatorio de la importancia de valorar y respetar a la pareja, y de la necesidad de cuidar y mantener una relación sana y feliz. La canción transmite un mensaje positivo y optimista sobre el amor y las relaciones, y su melodía y arreglos musicales refuerzan esa sensación de felicidad y armonía."),
    Song("Feeling Good", "Nina Simone", "I Put a Spell on You", 1965, R.drawable.nina_simone, "[Intro]\n" +
            "Birds flying high, you know how I feel\n" +
            "Sun in the sky, you know how I feel\n" +
            "Breeze driftin' on by, you know how I feel\n" +
            "\n" +
            "[Refrain]\n" +
            "It's a new dawn\n" +
            "It's a new day\n" +
            "It's a new life for me, yeah\n" +
            "It's a new dawn\n" +
            "It's a new day\n" +
            "It's a new life for me, ooh\n" +
            "And I'm feeling good\n" +
            "\n" +
            "\n" +
            "[Verse 1]\n" +
            "Fish in the sea, you know how I feel\n" +
            "River running free, you know how I feel\n" +
            "Blossom on the tree, you know how I feel\n" +
            "\n" +
            "[Refrain]\n" +
            "It's a new dawn\n" +
            "It's a new day\n" +
            "It's a new life for me\n" +
            "And I'm feeling good\n" +
            "\n" +
            "[Verse 2]\n" +
            "Dragonfly out in the sun, you know what I mean, don't you know?\n" +
            "Butterflies all havin' fun, you know what I mean\n" +
            "Sleep in peace when day is done, that's what I mean\n" +
            "And this old world is a new world\n" +
            "And a bold world, for me\n" +
            "\n" +
            "[Bridge]\n" +
            "Stars when you shine, you know how I feel\n" +
            "Scent of the pine, you know how I feel\n" +
            "Oh, freedom is mine\n" +
            "And I know how I feel\n" +
            "\n" +
            "[Refrain]\n" +
            "It's a new dawn\n" +
            "It's a new day\n" +
            "It's a new life for me\n" +
            "\n" +
            "You might also like\n" +
            "DOGTOOTH\n" +
            "Tyler, The Creator\n" +
            "Did you know that there’s a tunnel under Ocean Blvd\n" +
            "Lana Del Rey\n" +
            "SOS\n" +
            "SZA\n" +
            "\n" +
            "[Outro]\n" +
            "I'm feeling good!", "\"Feeling Good\" es una canción clásica del jazz, originalmente escrita por los compositores ingleses Anthony Newley y Leslie Bricusse en 1964. Nina Simone grabó su propia versión en 1965 para su álbum \"I Put a Spell on You\"."),
    Song("I Try", "Macy Gray", "On How Life Is", 1999, R.drawable.macy_gray, "[Verse 1]\n" +
            "Games, changes and fears\n" +
            "When will they go from here?\n" +
            "When will they stop?\n" +
            "I believe that fate has brought us here\n" +
            "And we should be together, babe\n" +
            "But we're not\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "I play it off, but I'm dreaming of you\n" +
            "And I'll keep my cool, but I'm feigning\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "I try to say goodbye and I choke\n" +
            "I try to walk away and I stumble\n" +
            "Though I try to hide it, it's clear\n" +
            "My world crumbles when you are not near\n" +
            "Goodbye and I choke\n" +
            "I try to walk away and I stumble\n" +
            "Though I try to hide it, it's clear\n" +
            "My world crumbles when you are not near\n" +
            "\n" +
            "[Verse 2]\n" +
            "I may appear to be free\n" +
            "But I'm just a prisoner of your love\n" +
            "And I may seem alright and smile when you leave\n" +
            "But my smiles are just a front\n" +
            "Just a front, hey!\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "I play it off, but I'm dreaming of you\n" +
            "And I'll keep my cool, but I'm feigning\n" +
            "\n" +
            "[Chorus]\n" +
            "I try to say goodbye and I choke (Yeah)\n" +
            "I try to walk away and I stumble\n" +
            "Though I try to hide it, it's clear\n" +
            "My world crumbles when you are not near\n" +
            "Goodbye and I choke (Yeah!)\n" +
            "I try to walk away and I stumble\n" +
            "Though I try to hide it, it's clear\n" +
            "My world crumbles when you are not near\n" +
            "\n" +
            "You might also like\n" +
            "Taco Truck x VB\n" +
            "Lana Del Rey\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "All Things End\n" +
            "Hozier\n" +
            "\n" +
            "[Bridge]\n" +
            "Here is my confession\n" +
            "May I be your possession?\n" +
            "Boy, I need your touch\n" +
            "Your love, kisses, and such\n" +
            "With all my might, I try\n" +
            "But this I can't deny\n" +
            "Deny\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "I play it off, but I'm dreaming of you\n" +
            "(But I'm dreaming of you, babe)\n" +
            "I'll keep my cool, but I'm feigning\n" +
            "\n" +
            "[Chorus]\n" +
            "I try to say goodbye and I choke (Yeah)\n" +
            "I try to walk away and I stumble (Oh)\n" +
            "Though I try to hide it, it's clear\n" +
            "My world crumbles when you are not near\n" +
            "Goodbye and I choke (Yeah, yeah, yeah)\n" +
            "I try to walk away and I stumble (Hey, yeah, yeah!)\n" +
            "Though I try to hide it, it's clear (Sick of love)\n" +
            "My world crumbles when you are not near (Love, your love, kisses ends)\n" +
            "Goodbye and I choke (Goodbye and I choke, yeah)\n" +
            "I try to walk away and I stumble\n" +
            "Though I try to hide it, it's clear\n" +
            "My world crumbles when you are not near\n" +
            "\n" +
            "\n" +
            "[Outro]\n" +
            "Yeah, yeah, yeah\n" +
            "Yeah, yeah", "La canción \"I Try\" de Macy Gray se interpreta a menudo como una expresión de vulnerabilidad y nostalgia. La letra describe los sentimientos de una persona que intenta seguir adelante después de una relación fallida, pero que no puede evitar recordar los buenos momentos pasados con su pareja. La canción tiene un tono melancólico y emotivo, con la voz distintiva de Macy Gray y su estilo musical soul y R&B. Además, la letra también se puede interpretar como una reflexión sobre el poder del amor y la dificultad de superar el dolor emocional. En este sentido, la canción puede ser vista como un símbolo de la experiencia humana de enfrentar y superar las adversidades emocionales."),
    Song("It's a Man's Man's Man's World", "James Brown", "James Brown Sings Raw Soul", 1966, R.drawable.james_brown_1996, "[Chorus]\n" +
            "This is a man's world\n" +
            "This is a man's world\n" +
            "But it wouldn't be nothing\n" +
            "Nothing without a woman or a girl\n" +
            "\n" +
            "[Verse 1]\n" +
            "You see, man made the cars\n" +
            "To take us over the road\n" +
            "Man made the train\n" +
            "To carry the heavy load\n" +
            "Man made the electric light\n" +
            "To take us out of the dark\n" +
            "Man made the boat for the water\n" +
            "Like Noah made the ark\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "This is a man's, man's, man's world\n" +
            "But it wouldn't be nothing\n" +
            "Nothing without a woman or a girl\n" +
            "\n" +
            "[Verse 2]\n" +
            "Man thinks about a little bit of baby girls\n" +
            "And a baby boys\n" +
            "Man make them happy\n" +
            "'Cause man make them toys\n" +
            "And after man make everything, everything he can\n" +
            "You know that man makes money\n" +
            "To buy from other man\n" +
            "\n" +
            "[Chorus]\n" +
            "This is a man's world\n" +
            "But it wouldn't be nothing, nothing\n" +
            "Not one little thing without a woman or a girl\n" +
            "\n" +
            "[Outro]\n" +
            "He's lost in the wilderness\n" +
            "He's lost in bitterness\n" +
            "He's lost, lawd have mercy now, in loneliness", "La canción \"It's a Man's Man's Man's World\" de James Brown se considera un himno feminista, aunque irónicamente es interpretada por un hombre. La letra describe la idea de que el mundo es un lugar dominado por los hombres, pero al mismo tiempo reconoce que nada de lo que los hombres hacen tendría sentido sin la presencia de las mujeres. A través de la canción, Brown intenta llamar la atención sobre las luchas y dificultades que enfrentan las mujeres en una sociedad dominada por los hombres, y destaca la importancia de reconocer y valorar la contribución de las mujeres en todos los ámbitos de la vida. La canción se ha convertido en un clásico de la música popular y ha sido interpretada por muchos otros artistas a lo largo de los años."),
    Song("No One", "Alicia Keys", "As I Am", 2007, R.drawable.alicia_keys, "[Verse 1]\n" +
            "I just want you close\n" +
            "Where you can stay forever\n" +
            "You can be sure\n" +
            "That it will only get better\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "You and me together\n" +
            "Through the days and nights\n" +
            "I don't worry 'cause\n" +
            "Everything's gonna be alright\n" +
            "People keep talking, they can say what they like\n" +
            "But all I know is everything's gonna be alright\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "No one, no one, no one\n" +
            "Can get in the way of what I'm feelin'\n" +
            "No one, no one, no one\n" +
            "Can get in the way of what I feel for you, you, you\n" +
            "Can get in the way of what I feel for you\n" +
            "\n" +
            "[Verse 2]\n" +
            "When the rain is pouring down\n" +
            "And my heart is hurting\n" +
            "You will always be around\n" +
            "This, I know for certain\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "You and me together\n" +
            "Through the days and nights\n" +
            "I don't worry 'cause\n" +
            "Everything's gonna be alright\n" +
            "People keep talking, they can say what they like\n" +
            "But all I know is everything's gonna be alright\n" +
            "\n" +
            "[Chorus]\n" +
            "No one, no one, no one\n" +
            "Can get in the way of what I'm feelin'\n" +
            "No one, no one, no one\n" +
            "Can get in the way of what I feel for you, you, you\n" +
            "Can get in the way of what I feel\n" +
            "\n" +
            "You might also like\n" +
            "If I Ain’t Got You\n" +
            "Alicia Keys\n" +
            "Did you know that there’s a tunnel under Ocean Blvd\n" +
            "Lana Del Rey\n" +
            "The Twelve Days of Christmas\n" +
            "Christmas Songs\n" +
            "\n" +
            "[Bridge]\n" +
            "I know some people search the world\n" +
            "To find something like what we have\n" +
            "I know people will try, try to divide, something so real\n" +
            "So 'til the end of time, I'm telling you there ain't no one\n" +
            "\n" +
            "[Chorus]\n" +
            "No one, no one\n" +
            "Can get in the way of what I'm feelin'\n" +
            "No one, no one, no one\n" +
            "Can get in the way of what I feel for you\n" +
            "\n" +
            "[Outro]\n" +
            "Oh-oh-oh-oh-oh, oh-oh-oh-oh-oh\n" +
            "Oh-oh-oh-oh-oh\n" +
            "Oh-oh-oh-oh-oh-oh-oh-oh-oh-oh-oh-oh\n" +
            "Oh, oh-oh-oh-oh-oh, oh-oh-oh-oh-oh\n" +
            "Oh-oh-oh-oh-oh-oh-oh-oh-oh-oh-oh-oh, oh", "La canción \"No One\" es una oda al amor verdadero y la conexión entre dos personas. El mensaje principal de la canción es que el amor es lo que realmente importa en la vida, y que nada más importa si se tiene a la persona adecuada a su lado. La letra de la canción se centra en la idea de que no importa lo que pase en la vida, el amor siempre prevalecerá. Alicia Keys canta sobre su deseo de estar con alguien a quien pueda amar incondicionalmente, y la fuerza y la seguridad que le da esa conexión. La canción es un himno al amor y la felicidad, y es un recordatorio de la importancia de mantenerse fieles a uno mismo y a los que se aman en la vida."),
    Song("Only Love Can Hurt Like This", "Paloma Faith", "A Perfect Contradiction", 2014, R.drawable.paloma_faith, "[Verse 1]\n" +
            "I tell myself you don't mean a thing\n" +
            "And what we got got no hold on me\n" +
            "But when you're not there, I just crumble\n" +
            "I tell myself I don't care that much\n" +
            "But I feel like I die 'till I feel your touch\n" +
            "\n" +
            "[Chorus]\n" +
            "Only love, only love can hurt like this\n" +
            "Only love can hurt like this\n" +
            "Must've been a deadly kiss\n" +
            "Only love can hurt like this\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "Say I wouldn't care if you walked away (Oh)\n" +
            "But every time you're there I'm begging you to stay\n" +
            "When you come close (When you come close), I just tremble\n" +
            "And every time, every time you go (Oh)\n" +
            "It's like a knife that cuts right to my soul\n" +
            "\n" +
            "[Chorus]\n" +
            "Only love, only love can hurt like this\n" +
            "Only love can hurt like this\n" +
            "Must've been a deadly kiss\n" +
            "Only love can hurt like this\n" +
            "Only love can hurt like this\n" +
            "Your kisses burning to my skin\n" +
            "Only love can hurt like this\n" +
            "\n" +
            "[Bridge]\n" +
            "But it's the sweetest pain\n" +
            "Burning hot through my veins\n" +
            "Love is torture, makes me more sure\n" +
            "Only love can hurt like this (Uh-uh)\n" +
            "\n" +
            "[Chorus]\n" +
            "Only love can hurt like this\n" +
            "Only love can hurt like this\n" +
            "Must've been a deadly kiss\n" +
            "Only love can hurt like this\n" +
            "Only love can hurt like this\n" +
            "Your kisses burning to my skin\n" +
            "Only love can hurt like this\n" +
            "(Only love can hurt like this)\n" +
            "Only love can hurt like this\n" +
            "(Only love can hurt)\n" +
            "\n" +
            "You might also like\n" +
            "Did you know that there’s a tunnel under Ocean Blvd\n" +
            "Lana Del Rey\n" +
            "Used\n" +
            "SZA\n" +
            "Special\n" +
            "SZA\n" +
            "\n" +
            "[Outro]\n" +
            "Save me, save me\n" +
            "Only love, only love\n" +
            "'Cause only love can hurt like this\n" +
            "And it must've been a deadly kiss", "La canción \"Only Love Can Hurt Like This\" es una balada de amor que habla sobre el dolor que puede causar el amor cuando no es correspondido o cuando termina. La letra describe los sentimientos de la cantante hacia su amante, y cómo su amor por él es tan fuerte que a veces le duele, pero al mismo tiempo no puede dejar de sentirlo.\n" +
            "\n" +
            "El sentido simbólico de la canción radica en la idea de que el amor puede ser hermoso pero también puede ser doloroso, y que solo aquellos que han experimentado un amor verdadero pueden comprenderlo. La letra de la canción también puede interpretarse como un llamado a ser valientes y a tomar riesgos en el amor, a pesar del dolor que pueda causar.\n" +
            "\n" +
            "En general, \"Only Love Can Hurt Like This\" es una canción emotiva y conmovedora que ha sido aclamada por su letra honesta y su interpretación vocal poderosa por parte de Paloma Faith. Desde su lanzamiento en 2014, se ha convertido en uno de los mayores éxitos de la carrera de la artista británica."),
    Song("Respect", "Otis Redding", "Otis Blue/Otis Redding Sings Soul", 1965, R.drawable.otis_redding_1967, "[Verse 1]\n" +
            "What you want, honey, you got it\n" +
            "And what you need, baby, you got it\n" +
            "All I'm askin' is give me a little respect when I come home\n" +
            "Ooh, yeah\n" +
            "Hey, hey, hey\n" +
            "Yeah, now\n" +
            "Ooh, yeah\n" +
            "\n" +
            "[Verse 2]\n" +
            "You can do me wrong, honey, if you wanna\n" +
            "But only do me wrong, honey, while I'm gone\n" +
            "All I'm askin' is give it, give it when I come home\n" +
            "Ooh, yeah\n" +
            "Hey, hey, hey\n" +
            "Yeah, now\n" +
            "\n" +
            "\n" +
            "[Verse 3]\n" +
            "Hey, little girl, you're sweeter than honey\n" +
            "And I wanna give you all of my money\n" +
            "All I'm askin' is give it when I come home\n" +
            "Yeah, now\n" +
            "Hey, hey, hey\n" +
            "Ooh, yeah, now\n" +
            "\n" +
            "[Verse 4]\n" +
            "Hey, little girl, you're so sweeter than honey\n" +
            "And I wanna give you all of my money\n" +
            "But all I want you to do is give it, give it, give it when I come home\n" +
            "Ooh, yeah\n" +
            "Hey, hey, hey\n" +
            "\n" +
            "[Outro]\n" +
            "Respect when I want it\n" +
            "Respect when I need it\n" +
            "Respect when I want it\n" +
            "Respect when I need it\n" +
            "Got to, got to have it\n" +
            "We got to have it\n" +
            "Got to, got to have it\n" +
            "Give it to me when I want it\n" +
            "Give it to me when I need it\n" +
            "Give it to me with respect, ah\n" +
            "Give it to me when I want it\n" +
            "Got to, got to give it\n" +
            "Got to, got to give it\n" +
            "You got to give it\n" +
            "You got to give it\n" +
            "We got to give it", "\"Respect\" es una canción soul escrita y originalmente grabada por Otis Redding en 1965. La canción fue un éxito comercial y crítico para Redding, alcanzando el puesto número 35 en la lista de singles de Billboard en los Estados Unidos. Sin embargo, fue su versión de la canción por Aretha Franklin en 1967 la que se convirtió en un éxito internacional y se convirtió en un himno para la lucha por los derechos civiles.\n" +
            "\n" +
            "La canción en sí misma es un llamado a la igualdad y el respeto mutuo en una relación romántica, con Redding exigiendo que su amante le dé el mismo respeto que él le da a ella. La letra también puede interpretarse como un llamado más amplio a la igualdad y el respeto entre todas las personas, independientemente de su género, raza o estatus social.\n" +
            "\n" +
            "La versión de Aretha Franklin de la canción se convirtió en un himno para la lucha por los derechos civiles y el movimiento feminista, en parte debido a la letra de la canción y en parte debido a la interpretación de Franklin, que le dio una nueva energía y significado. La canción es vista como un símbolo de la lucha por la igualdad y el respeto, y su mensaje sigue siendo relevante hoy en día."),
    Song("Rolling In The Deep", "Adele", "21", 2010, R.drawable.adele_canciones, "[Verse 1]\n" +
            "There's a fire starting in my heart\n" +
            "Reaching a fever pitch and it's bringing me out the dark\n" +
            "Finally, I can see you crystal clear\n" +
            "Go ahead and sell me out and I'll lay your shit bare\n" +
            "See how I'll leave with every piece of you\n" +
            "Don't underestimate the things that I will do\n" +
            "There's a fire starting in my heart\n" +
            "Reaching a fever pitch, and it's bringing me out the dark\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "The scars of your love remind me of us\n" +
            "They keep me thinkin' that we almost had it all\n" +
            "The scars of your love, they leave me breathless\n" +
            "I can't help feeling\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "We could've had it all (You're gonna wish you never had met me)\n" +
            "Rolling in the deep (Tears are gonna fall, rolling in the deep)\n" +
            "You had my heart inside of your hand (You're gonna wish you never had met me)\n" +
            "And you played it to the beat (Tears are gonna fall, rolling in the deep)\n" +
            "\n" +
            "[Verse 2]\n" +
            "Baby, I have no story to be told\n" +
            "But I've heard one on you, now I'm gonna make your head burn\n" +
            "Think of me in the depths of your despair\n" +
            "Make a home down there, as mine sure won't be shared\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "(You're gonna wish you never had met me) The scars of your love remind me of us\n" +
            "(Tears are gonna fall, rolling in the deep) They keep me thinkin' that we almost had it all\n" +
            "(You're gonna wish you never had met me) The scars of your love, they leave me breathless\n" +
            "(Tears are gonna fall, rolling in the deep) I can't help feeling\n" +
            "\n" +
            "[Chorus]\n" +
            "We could've had it all (You're gonna wish you never had met me)\n" +
            "Rolling in the deep (Tears are gonna fall, rolling in the deep)\n" +
            "You had my heart inside of your hand (You're gonna wish you never had met me)\n" +
            "And you played it to the beat (Tears are gonna fall, rolling in the deep)\n" +
            "Could've had it all\n" +
            "Rolling in the deep\n" +
            "You had my heart inside of your hand\n" +
            "But you played it with a beating\n" +
            "\n" +
            "You might also like\n" +
            "Set Fire to the Rain\n" +
            "Adele\n" +
            "Maroon\n" +
            "Taylor Swift\n" +
            "A&W\n" +
            "Lana Del Rey\n" +
            "\n" +
            "[Bridge]\n" +
            "Throw your soul through every open door (Ooh woah, oh)\n" +
            "Count your blessings to find what you look for (Woah)\n" +
            "Turn my sorrow into treasured gold (Ooh woah, oh)\n" +
            "You'll pay me back in kind and reap just what you sow\n" +
            "\n" +
            "[Breakdown]\n" +
            "(You're gonna wish you never had met me)\n" +
            "We could've had it all (Tears are gonna fall, rolling in the deep)\n" +
            "We could've had it all, yeah (You're gonna wish you never had met me)\n" +
            "It all, it all, it all (Tears are gonna fall, rolling in the deep)\n" +
            "\n" +
            "[Chorus]\n" +
            "We could've had it all (You're gonna wish you never had met me)\n" +
            "Rolling in the deep (Tears are gonna fall, rolling in the deep)\n" +
            "You had my heart inside of your hand (You're gonna wish you never had met me)\n" +
            "And you played it to the beat (Tears are gonna fall, rolling in the deep)\n" +
            "Could've had it all (You're gonna wish you never had met me)\n" +
            "Rolling in the deep (Tears are gonna fall, rolling in the deep)\n" +
            "You had my heart inside of your hand (You're gonna wish you never had met me)\n" +
            "But you played it, you played it, you played it\n" +
            "You played it to the beat", "El título \"Rolling in the Deep\" se refiere a sumergirse en algo profundo y peligroso, lo que puede simbolizar la complejidad y la intensidad de las emociones que se sienten después de una ruptura. Además, la letra menciona que \"tienes mi corazón por dentro de tus manos\", lo que puede representar la vulnerabilidad que se siente al enamorarse y confiar en otra persona.\n" +
            "\n" +
            "Sin embargo, muchos también han interpretado la canción como una declaración de fuerza y determinación, especialmente en su coro repetitivo que dice \"we could have had it all\" (\"podríamos haberlo tenido todo\"), que puede ser visto como un llamado a la lucha por la igualdad y la justicia en cualquier ámbito de la vida.\n" +
            "\n" +
            "En resumen, la canción \"Rolling in the Deep\" de Adele puede ser interpretada tanto como una canción de amor triste como una poderosa metáfora de la lucha por la justicia y la igualdad."),
    Song("Superstition", "Stevie Wonder", "Talking Book", 1972, R.drawable.stevie_wonder_1994, "[Verse 1]\n" +
            "Very superstitious\n" +
            "Writing's on the wall\n" +
            "Very superstitious\n" +
            "Ladder's 'bout to fall\n" +
            "Thirteen month old baby\n" +
            "Broke the looking glass\n" +
            "Seven years of bad luck\n" +
            "The good things in your past\n" +
            "\n" +
            "[Chorus]\n" +
            "When you believe in things\n" +
            "That you don't understand\n" +
            "Then you suffer\n" +
            "Superstition ain't the way, yeah\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "Ooh, very superstitious\n" +
            "Wash your face and hands\n" +
            "Rid me of the problem\n" +
            "Do all that you can\n" +
            "Keep me in a daydream\n" +
            "Keep me going strong\n" +
            "You don't want to save me\n" +
            "Sad is my song\n" +
            "\n" +
            "[Chorus]\n" +
            "When you believe in things\n" +
            "That you don't understand\n" +
            "Then you suffer\n" +
            "Superstition ain't the way, yeah\n" +
            "\n" +
            "[Verse 3]\n" +
            "Very superstitious\n" +
            "Nothing more to say\n" +
            "Very superstitious\n" +
            "The devil's on his way\n" +
            "Thirteen month old baby\n" +
            "Broke the looking glass\n" +
            "Seven years of bad luck\n" +
            "Good things in your past\n" +
            "\n" +
            "You might also like\n" +
            "Love From The Other Side\n" +
            "Fall Out Boy\n" +
            "Soldier, Poet, King\n" +
            "The Oh Hellos\n" +
            "What’s Up?\n" +
            "4 Non Blondes\n" +
            "\n" +
            "[Chorus]\n" +
            "When you believe in things\n" +
            "That you don't understand\n" +
            "Then you suffer\n" +
            "Superstition ain't the way\n" +
            "No, no, no", "\"Superstition\" es una canción de Stevie Wonder que habla sobre la superstición y cómo puede afectar a nuestra vida. En la letra, se hace referencia a creencias populares como el número 13, los espejos rotos, los gatos negros, entre otras. El mensaje principal de la canción es que la superstición no tiene base real y que no debemos dejar que nos controle o nos impida hacer lo que queremos.\n" +
            "\n" +
            "La canción también es conocida por su distintivo riff de guitarra, que fue tocado por Jeff Beck en la grabación original. Además, \"Superstition\" se convirtió en uno de los mayores éxitos de Stevie Wonder y es considerada como una de las mejores canciones de funk de todos los tiempos. Con su mensaje y su ritmo pegajoso, \"Superstition\" sigue siendo una canción popular y relevante en la cultura musical actual."),
    Song("Wonderful World", "Sam Cooke", "The Wonderful World of Sam Cooke", 1961, R.drawable.sam_cooke_2, "[Verse 1]\n" +
            "Don't know much about history\n" +
            "Don't know much biology\n" +
            "Don't know much about a science book\n" +
            "Don't know much about the French I took\n" +
            "\n" +
            "[Chorus 1]\n" +
            "But I do know that I love you\n" +
            "And I know that if you love me, too\n" +
            "What a wonderful world this would be\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "Don't know much about geography\n" +
            "Don't know much trigonometry\n" +
            "Don't know much about algebra\n" +
            "Don't know what a slide rule is for\n" +
            "\n" +
            "[Chorus 2]\n" +
            "But I do know one and one is two\n" +
            "And if this one could be with you\n" +
            "What a wonderful world this would be\n" +
            "\n" +
            "[Bridge]\n" +
            "Now, I don't claim to be an A student\n" +
            "But I'm trying to be\n" +
            "For maybe by being an A student, baby\n" +
            "I can win your love for me\n" +
            "\n" +
            "[Verse 1]\n" +
            "Don't know much about history\n" +
            "Don't know much biology\n" +
            "Don't know much about a science book\n" +
            "Don't know much about the French I took\n" +
            "\n" +
            "[Chorus 1]\n" +
            "But I do know that I love you\n" +
            "And I know that if you love me, too\n" +
            "What a wonderful world this would be\n" +
            "\n" +
            "You might also like\n" +
            "Blind\n" +
            "SZA\n" +
            "LET GO\n" +
            "Central Cee\n" +
            "Nobody Gets Me\n" +
            "SZA\n" +
            "\n" +
            "[Verse 3]\n" +
            "La ta ta ta ta ta ta (History)\n" +
            "Hmm-mm-mm (Biology)\n" +
            "Whoa, la ta ta ta ta ta ta (Science book)\n" +
            "Hmm-mm-mm (French I took)\n" +
            "\n" +
            "[Chorus 1]\n" +
            "Yeah, but I do know that I love you\n" +
            "And I know that if you love me, too\n" +
            "What a wonderful world this would be", "\"Wonderful World\" es una canción con un fuerte sentido simbólico de optimismo y esperanza. La letra de la canción habla de un mundo lleno de belleza y maravillas, y sugiere que podemos encontrar la felicidad y la satisfacción en las cosas simples de la vida, como ver el cielo azul y las flores floreciendo. La canción es un recordatorio de que, a pesar de las dificultades y los desafíos de la vida, siempre hay algo bueno en el mundo que podemos disfrutar y apreciar. La letra de la canción también puede ser vista como una crítica a la cultura de la época que enfatizaba el consumismo y la búsqueda de la riqueza y el éxito material, sugiriendo que la verdadera felicidad y satisfacción pueden encontrarse en las cosas más simples y cotidianas. En resumen, \"Wonderful World\" es una canción que nos invita a apreciar la belleza y la maravilla del mundo que nos rodea y a encontrar la felicidad en las cosas simples de la vida.")
)

val songBlues = listOf(
    Song("Boogie Chillun", "John Lee Hooker", "Boogie Chillen No.2", 1996, R.drawable.boogie, "Well my mama she didn't 'low me\n" +
            "Just to stay out all night long, oh Lord\n" +
            "Well my mama didn't 'low me\n" +
            "Just to stay out all night long\n" +
            "I didn't care what she didn't 'low\n" +
            "I would boogie-woogie anyhow\n" +
            "\n" +
            "When I first came to town people\n" +
            "I was walkin' down Hastings Street\n" +
            "Everybody was talkin' about the Henry Swing Club\n" +
            "I decided I drop in there that night\n" +
            "When I got there, I say, \"Yes, people\"\n" +
            "They was really havin' a ball!\n" +
            "Yes, I know\n" +
            "Boogie Chillin\n" +
            "\n" +
            "\n" +
            "\n" +
            "One night I was layin' down\n" +
            "I heard mama 'n papa talkin'\n" +
            "I heard papa tell mama\n" +
            "Let that boy boogie-woogie\n" +
            "It's in him, and it got to come out\n" +
            "And I felt so good\n" +
            "Went on boogie'n just the same", "Boogie Chillun\" es una canción de blues escrita e interpretada por el legendario músico de blues estadounidense John Lee Hooker en 1948. La canción ha sido interpretada y grabada por muchos otros músicos a lo largo de los años.\n" +
            "\n" +
            "El sentido simbólico de \"Boogie Chillun\" se centra en la idea del \"boogie\", que se refiere a un tipo de música de baile y estilo de vida asociado con la cultura afroamericana. La canción habla de una persona que está \"despertando al boogie\" y disfrutando de la música y el baile que lo acompaña.\n" +
            "\n" +
            "El \"boogie\" también se ha asociado históricamente con una forma de liberación y expresión de la cultura afroamericana, que se remonta a la época de la esclavitud en Estados Unidos. A través del baile y la música, la gente afroamericana podía expresar su individualidad y creatividad, y conectarse con su patrimonio cultural.\n" +
            "\n" +
            "En el contexto de \"Boogie Chillun\", la canción puede entenderse como un llamado a la libertad, la expresión personal y la celebración de la cultura afroamericana. La música y el baile que la acompañan representan una forma de liberación y un medio para conectarse con las raíces culturales y la historia de la comunidad afroamericana."),
    Song("Born Under a Bad Sign", "Albert King", "Born Under a Bad Sign", 1967, R.drawable.nexos_born_under_a_bad_sign, "[Chorus]\n" +
            "Born under a bad sign\n" +
            "Been down since I began to crawl\n" +
            "If it wasn't for bad luck\n" +
            "You know, I wouldn't have no luck at all\n" +
            "\n" +
            "[Verse 1]\n" +
            "Hard luck and trouble\n" +
            "Been my only friend\n" +
            "I've been on my own\n" +
            "Ever since I was ten\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "Born under a bad sign\n" +
            "Been down since I began to crawl\n" +
            "If it wasn't for bad luck\n" +
            "You know, I wouldn't have no luck at all\n" +
            "\n" +
            "[Verse 2]\n" +
            "I can't read\n" +
            "I didn't know how to write\n" +
            "My whole life has been\n" +
            "One big fight\n" +
            "\n" +
            "[Chorus]\n" +
            "Born under a bad sign\n" +
            "I've been down since I began to crawl\n" +
            "If it wasn't for bad luck\n" +
            "I say, I wouldn't have no luck at all\n" +
            "\n" +
            "[Bridge]\n" +
            "That ain't lie, ah, oh\n" +
            "You know, if it wasn't for bad luck\n" +
            "I wouldn't have no kinda luck\n" +
            "If it wasn't for real bad luck\n" +
            "I wouldn't have no luck at all\n" +
            "\n" +
            "[Verse 3]\n" +
            "You know wine and women\n" +
            "Is all I crave\n" +
            "A big legged woman\n" +
            "Gonna carry me to my grave\n" +
            "\n" +
            "You might also like\n" +
            "僕たちのサヨナラ (bokutachinosayonara)\n" +
            "乃木坂46 (Nogizaka46)\n" +
            "ALL GODS BLESS ME\n" +
            "RYKEYDADDYDIRTY\n" +
            "Have A Good Time\n" +
            "ZORN\n" +
            "\n" +
            "[Chorus]\n" +
            "Born under a bad sign\n" +
            "I've been down since I began to crawl\n" +
            "If it wasn't for bad luck\n" +
            "I tell ya, I wouldn't have no luck at all\n" +
            "\n" +
            "[Outro]\n" +
            "Yeah, I'm a bad luck boy\n" +
            "Been havin' bad luck all of my days, yes", "\"Born Under a Bad Sign\" es una canción de blues escrita por William Bell y Booker T. Jones, y popularizada por el guitarrista Albert King. La canción tiene un sentido simbólico de mala suerte y desgracia.\n" +
            "\n" +
            "La letra habla de una persona que ha experimentado una serie de dificultades y obstáculos en su vida, desde el momento en que nació. El protagonista se siente maldecido por la mala suerte, y parece que no puede escapar de ella. La letra describe la serie de eventos desafortunados que le han ocurrido a la persona, desde que nació bajo una mala estrella hasta que se encontró con el amor equivocado y experimentó el dolor y la decepción.\n" +
            "\n" +
            "El sentido simbólico de la canción es el de una persona que parece haber sido maldecida desde el principio y no puede escapar de la mala suerte. La canción es una expresión de desesperación y tristeza, pero también puede ser interpretada como un llamado a la superación de la adversidad y la lucha contra la mala suerte. En resumen, el sentido simbólico de \"Born Under a Bad Sign\" es el de una persona que ha experimentado una serie de dificultades y desafíos en su vida, y que siente que está maldecida por la mala suerte."),
    Song("Stormy Monday", "The Allman Brothers Band", "At Fillmore East", 1971, R.drawable.stormy_monday, "They call it Stormy Monday\n" +
            "But Tuesday's just as bad\n" +
            "They call it Stormy Monday\n" +
            "But Tuesday's just as bad\n" +
            "Lord, and Wednesday's worse\n" +
            "And Thursday's also sad\n" +
            "\n" +
            "The eagle flies on Friday\n" +
            "Saturday I go out to play\n" +
            "The eagle flies on Friday\n" +
            "Saturday I go out to play\n" +
            "Sunday I go to church\n" +
            "Gonna kneel down and pray\n" +
            "\n" +
            "\n" +
            "\n" +
            "Lord have mercy\n" +
            "Lord have mercy on me\n" +
            "Lord have mercy\n" +
            "Lord have mercy on me\n" +
            "Though I'm tryin' and tryin' to find my baby\n" +
            "Won't somebody please send her home to me", "\"Stormy Monday\" es una canción de blues escrita por T-Bone Walker en 1947. La canción ha sido interpretada por muchos artistas a lo largo de los años y ha sido considerada como un estándar del blues.\n" +
            "\n" +
            "El sentido simbólico de la canción \"Stormy Monday\" está relacionado con la idea de la lucha y el dolor que se experimenta en la vida. La letra de la canción describe la experiencia de un hombre que ha estado luchando contra la adversidad durante toda su vida. A través de la letra, se describe una situación en la que el protagonista ha sido abandonado por su pareja, ha perdido su trabajo y ha sido marginado por la sociedad. A pesar de todo esto, sigue adelante y continúa luchando.\n" +
            "\n" +
            "La letra de la canción también utiliza la imagen de la lluvia y la tormenta para simbolizar la oscuridad y la tristeza que el protagonista está experimentando. La idea de que la lluvia finalmente desaparecerá y que el sol volverá a salir simboliza la esperanza y la idea de que siempre hay una oportunidad para superar las dificultades de la vida.\n" +
            "\n" +
            "En resumen, el sentido simbólico de \"Stormy Monday\" se relaciona con la idea de la lucha y el dolor que se experimenta en la vida, y la necesidad de encontrar la fuerza y la esperanza para seguir adelante. La canción utiliza la imagen de la lluvia y la tormenta para simbolizar la oscuridad y la tristeza, y la idea de que la lluvia finalmente desaparecerá y el sol volverá a salir simboliza la idea de que siempre hay una oportunidad para superar las dificultades."),
    Song("Cross Road Blues", "Robert Johnson", "King of the Delta Blues Singers", 1961, R.drawable.robert_johnson, "[Verse 1]\n" +
            "I went to the crossroad, fell down on my knees\n" +
            "I went to the crossroad, fell down on my knees\n" +
            "Asked the Lord above, \"Have mercy now\n" +
            "Save poor Bob if you please\"\n" +
            "\n" +
            "[Verse 2]\n" +
            "Yeoo, standin' at the crossroad, tried to flag a ride\n" +
            "Ooo eeee, I tried to flag a ride\n" +
            "Didn't nobody seem to know me, babe, everybody pass me by\n" +
            "\n" +
            "\n" +
            "[Verse 3]\n" +
            "Standin' at the crossroad, baby, risin' sun goin' down\n" +
            "Standin' at the crossroad, baby, eee, eee, risin' sun goin' down\n" +
            "I believe to my soul, now, poor Bob is sinkin' down\n" +
            "\n" +
            "[Verse 4]\n" +
            "You can run, you can run, tell my friend Willie Brown\n" +
            "You can run, you can run, tell my friend Willie Brown\n" +
            "That I got the crossroad blues this mornin', Lord\n" +
            "Babe, I am sinkin' down\n" +
            "\n" +
            "[Verse 5]\n" +
            "And I went to the crossroad, mama, I looked east and west\n" +
            "I went to the crossroad, baby, I looked east and west\n" +
            "Lord, I didn't have no sweet woman\n" +
            "Oh well, babe, in my distress", " \"Cross Road Blues\" es una canción de blues que habla de un hombre que está en una encrucijada, tratando de decidir qué camino tomar en su vida. La letra hace referencia a la idea del diablo en la encrucijada, una creencia popular en el sur de Estados Unidos en la década de 1930, según la cual un músico de blues podía hacer un trato con el diablo en una encrucijada para obtener habilidades musicales excepcionales a cambio de su alma. La canción se ha convertido en un icono cultural y ha sido versionada por numerosos artistas en diferentes géneros musicales."),
    Song("Cry Baby", "Bert Berns y Jerry Ragovoy", "Sencillo Independiente", 1963, R.drawable.cry_baby, "Cry baby, cry baby, cry baby\n" +
            "Honey, welcome back home\n" +
            "I know she told you\n" +
            "Honey, I know she told you that she loved you\n" +
            "Much more than I did\n" +
            "But all I know is that she left you\n" +
            "And you swear that you just don't know why\n" +
            "But you know, honey I'll always\n" +
            "I'll always be around\n" +
            "If you ever want me\n" +
            "Come on and cry, cry baby\n" +
            "Cry baby, cry baby\n" +
            "Oh honey, welcome back home\n" +
            "Don't you know\n" +
            "Honey, ain't nobody ever gonna love you\n" +
            "The way I try to do?\n" +
            "Who'll take all your pain\n" +
            "Honey, your heartache, too?\n" +
            "And if you need me, you know\n" +
            "That I'll always be around\n" +
            "If you ever want me\n" +
            "Come on and cry, cry baby\n" +
            "Cry baby, cry baby\n" +
            "Oh daddy, like you always saying to do\n" +
            "And when you're walkin' around the world, babe\n" +
            "You said you'd try to look for the end of the road\n" +
            "You might find out later that the road'll end in Detroit\n" +
            "Honey, the road'll even end in Kathmandu\n" +
            "You can go all around the world\n" +
            "Trying to find something to do with your life, baby\n" +
            "When you only gotta do one thing well\n" +
            "You only gotta do one thing well to make it in this world, babe\n" +
            "You got a woman waiting for you there\n" +
            "All you ever gotta do is be a good man one time to one woman\n" +
            "And that'll be the end of the road, babe\n" +
            "I know you got more tears to share, babe\n" +
            "So come on, come on, come on, come on, come on\n" +
            "And cry, cry baby\n" +
            "Cry baby, cry\n" +
            "And if you ever feel a little lonely, dear\n" +
            "I want you to come on, come on to your mama now\n" +
            "And if you ever want a little love of a woman\n" +
            "Come on and baby, baby, baby, babe, babe, baby now\n" +
            "Cry baby yeah", " \"Cry Baby\" se centra en una persona que llora y se queja constantemente, incluso cuando no hay nada realmente malo en su vida. La letra sugiere que esta persona debería dejar de llorar y empezar a apreciar las cosas buenas de la vida. La canción ha sido interpretada como una crítica a la actitud autocompasiva y la falta de resiliencia en algunas personas."),
    Song("Dust My Broom", "Elmore James", "Blues After Hours", 1952, R.drawable.robert, "I'm gettin' up soon in the mornin'\n" +
            "I believe I'll dust my broom\n" +
            "I'm gettin' up soon in the mornin'\n" +
            "I believe I'll dust my broom\n" +
            "Out with the best gal I'm lovin'\n" +
            "Now my friends can get in my room\n" +
            "I'm gonna write a letter, telephone every town I know\n" +
            "I'm gonna write a letter, telephone every town I know\n" +
            "If I don't find her in Mississippi\n" +
            "She be in East Monroe I know\n" +
            "And I don't want no woman\n" +
            "Want every downtown man she meets\n" +
            "No I don't want no woman\n" +
            "Want every downtown man she meets\n" +
            "Man, she's a no good doney\n" +
            "They shouldn't allow her on the street, yeah\n" +
            "I believe, I believe my time ain't long\n" +
            "I believe, I believe my time ain't long\n" +
            "I ain't gonna leave my baby\n" +
            "And break up my happy home", "La canción \"Dust My Broom\" es considerada un clásico del blues y ha sido versionada por varios artistas a lo largo de los años. El título de la canción, que se traduce como \"sacude mi escoba\", es una metáfora que representa la idea de dejar atrás los problemas y comenzar de nuevo. Elmore James utiliza la guitarra slide para crear un sonido único y distintivo que ha influido en muchos músicos de blues y rock. La letra de la canción habla de un hombre que está cansado de ser tratado mal por su pareja y decide \"sacudir su escoba\" y alejarse de esa relación. En general, \"Dust My Broom\" es una canción que habla de la superación personal y el deseo de seguir adelante."),
    Song("Goodnight Irene", "Eric Clapton", "I Still Do", 2016, R.drawable.irene, "At Saturday night I got married\n" +
            "Me and my wife settled down\n" +
            "But me and my wife have parted\n" +
            "I'm gonna take another stroll downtown\n" +
            "Irene goodnight (goodnight Irene)\n" +
            "Irene goodnight\n" +
            "Goodnight Irene, goodnight Irene\n" +
            "I'll get you in my dream\n" +
            "Stop your ramblin'\n" +
            "Stop your gamblin'\n" +
            "Stop stayin' out late, late at night\n" +
            "Go home to your wife and your family\n" +
            "Sit down by your fireside so bright\n" +
            "Irene goodnight\n" +
            "Irene goodnight\n" +
            "Goodnight Irene, goodnight Irene\n" +
            "I'll get you in my dream\n" +
            "I love Irene and got new I do\n" +
            "Still the sea runs dry\n" +
            "And if Irene ever turns her back on me\n" +
            "I'm gonna take morphine and die\n" +
            "Irene goodnight, Irene goodnight\n" +
            "Goodnight Irene, goodnight Irene\n" +
            "I'll get you in my dream\n" +
            "Irene goodnight, Irene goodnight\n" +
            "Goodnight Irene, goodnight Irene\n" +
            "I'll get you in my dream\n" +
            "Goodnight Irene, goodnight Irene\n" +
            "I'll get you in my dream", " \"Goodnight Irene\" es una canción popular estadounidense que ha sido interpretada por muchos artistas a lo largo de los años. La letra cuenta la historia de un hombre que se siente triste por haber perdido a su amada Irene. El sentido simbólico de la canción puede ser interpretado de diferentes maneras, pero en general, se puede decir que habla sobre el amor y la pérdida, y cómo a veces es difícil superar el dolor de una relación rota. La canción también puede ser vista como una forma de despedida, un adiós a alguien que ya no está presente en nuestras vidas. En la versión de Eric Clapton, su estilo de blues rock le da una nueva dimensión a la canción, añadiendo su característico sonido de guitarra y su voz melancólica."),
    Song("How Long Blues", "Eric Clapton", "From The Cradle", 1994, R.drawable.how_long, "How long, baby how long,\n" +
            "Has that evening train been gone?\n" +
            "How long,\n" +
            "How how long,\n" +
            "Baby how long?\n" +
            "Went to the station, didn't see no train.\n" +
            "Down in my heart, I have an aching pain.\n" +
            "How long,\n" +
            "How how long,\n" +
            "Baby how long?\n" +
            "I feel disgusted, I feel so bad\n" +
            "Thinking 'bout the good time that I once have had.\n" +
            "How long,\n" +
            "How how long,\n" +
            "Baby how long?\n" +
            "I could see the green grass growing on the hill;\n" +
            "I ain't seen no greenback on a dollar bill.\n" +
            "How long,\n" +
            "How how long,\n" +
            "Baby how long?\n" +
            "You're gonna be sorry, you'll feel so blue.\n" +
            "When you want me, baby, I declare I won't want you.\n" +
            "How long,\n" +
            "How how long,\n" +
            "Baby how long?\n" +
            "Don't have no money for to ride the train.\n" +
            "I would ride the rods, baby, to be with you again.\n" +
            "How long, baby how long\n" +
            "Must I keep my, my watch in pawn?\n" +
            "How long,\n" +
            "How how long,\n" +
            "Baby how long?", "La canción \"How Long Blues\" es un clásico del blues que se ha interpretado en diversas versiones a lo largo de los años. En ella, el narrador lamenta el tiempo que ha pasado desde que su amante lo dejó y se pregunta cuánto tiempo más tendrá que esperar para que ella regrese. La letra se enfoca en el dolor y la tristeza de la separación, y en la lucha por superar la situación. En general, la canción representa el sentimiento de pérdida y la dificultad de seguir adelante después de una relación fallida. La interpretación de Eric Clapton es particularmente emotiva y conmovedora, lo que ha hecho que esta canción sea muy popular entre los fanáticos del blues y del rock en todo el mundo."),
    Song("Mannish Boy", "Muddy Waters", "Electric Mud", 1968, R.drawable.mel_london, "Oh, yeah\n" +
            "Oh, yeah\n" +
            "Everything gonna be alright this mornin'\n" +
            "Now, when I was a young boy\n" +
            "At the age of five\n" +
            "My mother said I was gonna be\n" +
            "The greatest man alive\n" +
            "But now I'm a man\n" +
            "I'm age twenty-one\n" +
            "I want you to believe me, honey\n" +
            "We having lots of fun\n" +
            "I'm a man (yeah)\n" +
            "I spell M\n" +
            "A, child\n" +
            "N\n" +
            "That represent man\n" +
            "No B\n" +
            "O, child\n" +
            "Y\n" +
            "That spell mannish boy\n" +
            "I'm a man\n" +
            "I'm a full-grown man\n" +
            "I'm a man\n" +
            "I'm a rollin' stone\n" +
            "I'm a man\n" +
            "I'm a hoochie-coochie man\n" +
            "Sittin' on the outside\n" +
            "Just me and my mate\n" +
            "I'm made to move\n" +
            "Come up two hours late\n" +
            "Wasn't that a man?\n" +
            "I spell M\n" +
            "A, child\n" +
            "N\n" +
            "That represesnt man\n" +
            "No B\n" +
            "O, child\n" +
            "Y\n" +
            "That spell mannish boy\n" +
            "I'm a man\n" +
            "I'm a full-grown man\n" +
            "I'm a man\n" +
            "I'm a rolllin' stone\n" +
            "I'm a man\n" +
            "Full-grown man\n" +
            "Oh, well\n" +
            "Oh, well", "\"Mannish Boy\" es una canción de blues que habla de la masculinidad y la virilidad, y se ha convertido en un clásico del género. El personaje masculino en la canción se presenta como un \"hombre de verdad\" que sabe cómo tratar a las mujeres y que está seguro de sí mismo. La letra puede ser interpretada como una crítica a la idea de que la masculinidad se define por la fuerza y la agresividad, y como una afirmación de que la verdadera masculinidad se basa en la confianza en sí mismo y el respeto hacia las mujeres. La canción ha sido versionada por muchos artistas y sigue siendo una influencia importante en la música blues y rock.\n" +
            "\n" +
            "\n"),
    Song("Pride and Joy", "Stevie Ray Vaughan", "Texas Flood", 1983, R.drawable.stevie_ray, "Well, you've heard about love givin' sight to the blind\n" +
            "My baby lovin' cause the sun to shine\n" +
            "She my sweet little thing\n" +
            "She my pride and joy\n" +
            "She my sweet little baby\n" +
            "I'm her little lover boy\n" +
            "Yeah, I love my baby\n" +
            "Heart and soul\n" +
            "Love like ours won't never grow old\n" +
            "She my sweet little thing\n" +
            "She my pride and joy\n" +
            "She my sweet little baby\n" +
            "I'm her little lover boy\n" +
            "Yeah, I love my Lenee\n" +
            "She long and lean\n" +
            "You mess with her\n" +
            "You'll see a man get mean\n" +
            "She my sweet little thing\n" +
            "She my pride and joy\n" +
            "She my sweet little baby\n" +
            "I'm her little lover boy\n" +
            "Well, I love my baby\n" +
            "Like the finest wine\n" +
            "Stick with her until the end of time\n" +
            "She my sweet little thing\n" +
            "She my pride and joy\n" +
            "She my sweet little baby\n" +
            "I'm her little lover boy\n" +
            "Yeah, I love my baby\n" +
            "Heart and soul\n" +
            "Love like ours won't never grow old\n" +
            "She my sweet little thing\n" +
            "She my pride and joy\n" +
            "She my sweet little baby\n" +
            "I'm her little lover boy", "La canción \"Pride and Joy\" es un homenaje al amor de Stevie Ray Vaughan por su guitarra. A través de la letra, Vaughan expresa su devoción por su \"bebé\" (su guitarra), describiéndola como su fuente de alegría y su \"orgullo y alegría\". Además, la canción es un ejemplo icónico del género del blues y del talento virtuoso de Vaughan como guitarrista, lo que la convierte en un himno para los aficionados al blues y a la música en general."),
    Song("Spoonful", "Howlin' Wolf", "Cream", 1966, R.drawable.willie_dixon, "It could be a spoonful of diamond,\n" +
            "It could be a spoonful of gold,\n" +
            "Just a little spoon of your precious love,\n" +
            "Satisfy my soul.\n" +
            "\n" +
            "Men lies about little,\n" +
            "Some of them cries about little,\n" +
            "Some of them dies about littles,\n" +
            "Everything fight about a spoonful,\n" +
            "Dat spoon, dat spoon, dat ...\n" +
            "\n" +
            "It could be a spoonful of coffee,\n" +
            "Could be a spoonful of tea,\n" +
            "But a little spoon of your precious love,\n" +
            "Good enough for me.\n" +
            "\n" +
            "Men lies about that,\n" +
            "Some of them dies about that,\n" +
            "Find more lyrics at ※ Mojim.com\n" +
            "Some of them cries about that,\n" +
            "But everything fight about a spoonful.\n" +
            "\n" +
            "That spoon, dat spoon, dat ...\n" +
            "\n" +
            "It could be a spoonful of water,\n" +
            "Saved from the deserts sand,\n" +
            "But one spoon of them fortifies.\n" +
            "Save you from another man.\n" +
            "\n" +
            "Men lies about that,\n" +
            "Some of them cries about that,\n" +
            "Some of them dies about that,\n" +
            "Everybody fightin' about a spoonful.\n" +
            "\n" +
            "That spoon, dat spoon, dat ...", "\"Spoonful\" es una canción de blues que presenta una serie de imágenes y metáforas sugerentes. En particular, la letra de la canción se centra en la idea de que el amor es como una cuchara llena de sustancia. Algunos han interpretado esta canción como una metáfora para la droga o la adicción, mientras que otros simplemente la ven como una canción de amor con una letra poética y evocadora. En cualquier caso, \"Spoonful\" es una canción que ha tenido un gran impacto en la música popular y sigue siendo interpretada y grabada por artistas de todo el mundo."),
    Song("Sweet Home Chicago", "The Blues Brothers", "Vocalion", 1980, R.drawable.sweet_home_chicago, "Oh, baby don't you wanna go?\n" +
            "Come on\n" +
            "Oh, baby don't you wanna go?\n" +
            "Back to that same old place\n" +
            "Sweet home Chicago\n" +
            "Come on\n" +
            "Baby don't you wanna go?\n" +
            "Hi-de-hey\n" +
            "Baby don't you wanna go?\n" +
            "Back to that same old place\n" +
            "Oh, sweet home Chicago\n" +
            "Well, 1 and 1 is 2\n" +
            "6 and 2 is 8\n" +
            "Come on baby, don't ya' make me late\n" +
            "Hi-de-hey\n" +
            "Baby don't you wanna go?\n" +
            "Back to that same old place\n" +
            "Sweet home Chicago\n" +
            "Come on\n" +
            "Baby don't you wanna go?\n" +
            "Ho, come on\n" +
            "Baby don't you wanna go?\n" +
            "Back to that same old place\n" +
            "Sweet home Chicago\n" +
            "6 and 3 is 9\n" +
            "9 and 9 is 18\n" +
            "Look there brother baby and see what I've seen\n" +
            "Hi-de-hey\n" +
            "Baby don't you wanna go?\n" +
            "Back to that same old place\n" +
            "Sweet home Chicago\n" +
            "Oh, come on\n" +
            "Baby don't you wanna go?\n" +
            "Come on\n" +
            "Baby don't you wanna go?\n" +
            "Back to that same old place\n" +
            "My sweet home Chicago", "La canción \"Sweet Home Chicago\" de Robert Johnson es un clásico del blues que expresa el anhelo por el hogar y el anhelo por el hogar. La letra habla de alguien que deja su hogar en California para viajar a Chicago, solo para encontrar a alguien que necesita su ayuda. La canción sugiere que, a pesar de los desafíos de la vida, nada es tan reconfortante como estar de vuelta en casa. La voz de la cantante resuena con nostalgia así como con el deseo de mantenerse en contacto con amigos y familiares. La repetición del estribillo afirma la idea de que el hogar es un lugar al que uno siempre puede regresar en tiempos de problemas. Por lo tanto, la canción habla de la fuerte conexión que existe entre las personas y sus lugares de origen."),
    Song("The Memphis Blues", "W.C.Handy", "Memphis Blues", 1954, R.drawable.the_memphis_blues, "Folks I've just been down, down to Memphis town\n" +
            "That's where the people smile, smile on you all the while\n" +
            "Hospitality, they were good to me\n" +
            "I couldn't spend a dime and had the grandest time\n" +
            "I went out a dancing with a Tennessee dear\n" +
            "They had a fellow named Handy with a band you should hear\n" +
            "And while the folks gently swayed\n" +
            "All them boys began to play in real harmony\n" +
            "I never will forget that tune they call\n" +
            "Handy's Memphis Blues, oh yes, those blues\n" +
            "They've got a trumpet man leading the band\n" +
            "And folks, he sure blow some horn\n" +
            "And when the clarinet seconds to the trombones croon\n" +
            "It moans just like a sinner on Revival Day\n" +
            "That melancholy strain that ever haunting ain\n" +
            "Is like a morning sorrow song\n" +
            "Here comes the very part that wraps a spell around my heart\n" +
            "It sets me wild to hear that loving tune again, those Memphis Blues\n", "La temática de la canción cuenta la historia de un forastero que intenta escapar una sociedad cuadrada, es la historia de un hombre que busca desesperadamente una forma de salir de Mobile's Grand Street y entrar en algún tipo de mundo cuerdo, como el que se puede encontrar, aparentemente, en Memphis."),
    Song("The Thrill Is Gone", "B.B.King", "Completely Well", 1969, R.drawable.rick_darnell, "The thrill is gone\n" +
            "The thrill is gone away\n" +
            "The thrill is gone, baby\n" +
            "The thrill is gone away\n" +
            "You know you done me wrong, baby\n" +
            "And you'll be sorry someday\n" +
            "The thrill is gone\n" +
            "It's gone away from me\n" +
            "The thrill is gone, baby\n" +
            "The thrill is gone away from me\n" +
            "Although, I'll still live on\n" +
            "But so lonely I'll be\n" +
            "The thrill is gone\n" +
            "It's gone away for good\n" +
            "All the thrill is gone\n" +
            "Baby, it's gone away for good\n" +
            "Someday I know I'll be open-armed baby\n" +
            "Just like I know, I know I should\n" +
            "You know, I'm free, free now, baby\n" +
            "I'm free from your spell\n" +
            "Oh, free, free, free now, baby\n" +
            "I'm free from your spell\n" +
            "And now that it's all over\n" +
            "All that I can do is wish you well", "La canción es una balada de blues que habla sobre la pérdida de una relación amorosa. La letra simboliza la sensación de dolor y tristeza que se siente cuando una relación termina. La guitarra de B.B. King añade una dimensión emocional a la canción, ya que su sonido triste y melancólico refleja el tema de la canción. \"The Thrill Is Gone\" es considerada una de las mejores canciones de B.B. King y una de las mejores canciones de blues de todos los tiempos."),
    Song("Whip It to a Jelly", "Clara Smith", "Whip It to a Jelly", 1997, R.drawable.clara_smith, "There's a new dance that can't be beat\n" +
            "You move most everything, step your beat called\n" +
            "Whip it to a jelly, stir it in a bowl\n" +
            "You just whip it to a jelly if you like good jelly roll\n" +
            "\n" +
            "Folks I left most everything, whip that jelly most everyday lord\n" +
            "Whip it to a jelly, and stir it in a bowl\n" +
            "Now you whip it to a jelly, if you like good jelly roll\n" +
            "\n" +
            "Jut like Anne, long and slim, when she whip it it's too bad Jim, lord\n" +
            "She whip it to a jelly and stir it in a bowl\n" +
            "Now you whip it to a jelly, if you like good jelly roll\n" +
            "\n" +
            "I wear my skirt up to my knee, and whip that jelly with who I please\n" +
            "Oh whip it to a jelly mm", "")
)

val songDisco = listOf(
    Song("Staying Alive", "Bee Gees", "Saturday Night Fever", 1977, R.drawable.bee_gees_1977, "[Verse 1]\n" +
            "Well, you can tell by the way I use my walk\n" +
            "I'm a woman's man, no time to talk\n" +
            "The music loud and the women warm\n" +
            "I've been kicked around since I was born\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "And now it's alright, it's okay\n" +
            "And you may look the other way\n" +
            "But we can try to understand\n" +
            "The New York Times' effect on man\n" +
            "\n" +
            "[Chorus]\n" +
            "Whether you're a brother or whether you're a mother\n" +
            "You're stayin' alive, stayin' alive\n" +
            "Feel the city breakin' and everybody shakin'\n" +
            "And we're stayin' alive, stayin' alive\n" +
            "Ah, ah, ah, ah\n" +
            "Stayin' alive, stayin' alive\n" +
            "Ah, ah, ah, ah\n" +
            "Stayin' alive\n" +
            "Oh, when you walk\n" +
            "\n" +
            "[Verse 2]\n" +
            "Well now, I get low and I get high\n" +
            "And if I can't get either, I really try\n" +
            "Got the wings of Heaven on my shoes\n" +
            "I'm a dancin' man and I just can't lose\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "You know it's alright, it's okay\n" +
            "I'll live to see another day\n" +
            "But we can try to understand\n" +
            "The New York Times' effect on man\n" +
            "\n" +
            "[Chorus]\n" +
            "Whether you're a brother or whether you're a mother\n" +
            "You're stayin' alive, stayin' alive\n" +
            "Feel the city breakin' and everybody shakin'\n" +
            "And we're stayin' alive, stayin' alive\n" +
            "Ah, ah, ah, ah\n" +
            "Stayin' alive, stayin' alive\n" +
            "Ah, ah, ah, ah\n" +
            "Stayin' alive\n" +
            "(Hey, yeah)\n" +
            "\n" +
            "[Bridge]\n" +
            "Life goin' nowhere\n" +
            "Somebody help me\n" +
            "Somebody help me, yeah\n" +
            "Life goin' nowhere\n" +
            "Somebody help me, yeah\n" +
            "I'm stayin' alive\n" +
            "\n" +
            "[Verse 1]\n" +
            "Well, you can tell by the way I use my walk\n" +
            "I'm a woman's man, no time to talk\n" +
            "The music loud and the women warm\n" +
            "I've been kicked around since I was born\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "And now it's alright, it's okay\n" +
            "And you may look the other way\n" +
            "But we can try to understand\n" +
            "The New York Times' effect on man\n" +
            "\n" +
            "[Chorus]\n" +
            "Whether you're a brother or whether you're a mother\n" +
            "You're stayin' alive, stayin' alive\n" +
            "Feel the city breakin' and everybody shakin'\n" +
            "And we're stayin' alive, stayin' alive\n" +
            "Ah, ah, ah, ah\n" +
            "Stayin' alive, stayin' alive\n" +
            "Ah, ah, ah, ah\n" +
            "Stayin' alive\n" +
            "(Hey, yeah)\n" +
            "\n" +
            "[Outro]\n" +
            "Life goin' nowhere\n" +
            "Somebody help me\n" +
            "Somebody help me, yeah\n" +
            "Life goin' nowhere\n" +
            "Somebody help me, yeah\n" +
            "I'm stayin' alive\n" +
            "Life goin' nowhere\n" +
            "Somebody help me\n" +
            "Somebody help me, yeah\n" +
            "Life goin' nowhere\n" +
            "Somebody help me, yeah\n" +
            "I'm stayin' alive\n" +
            "Life goin' nowhere\n" +
            "Somebody help me\n" +
            "Somebody help me, yeah\n" +
            "Life goin' nowhere\n" +
            "Somebody help me, yeah\n" +
            "I'm stayin' alive\n" +
            "Life goin' nowhere\n" +
            "Somebody help me\n" +
            "Somebody help me, yeah\n" +
            "Life goin' nowhere\n" +
            "Somebody help me, yeah\n" +
            "I'm stayin' alive", "La canción es un himno de la época disco y del movimiento de baile que surgió en los años 70. La letra habla de mantenerse con vida y seguir adelante a pesar de los obstáculos, y se convirtió en un himno para la juventud en aquel entonces. La canción también es reconocida por su característico ritmo de guitarra y bajo, que se ha convertido en un icono de la cultura pop."),
    Song("Dancing Queen", "ABBA", "Arrival", 1976, R.drawable.abba, "[Chorus]\n" +
            "You can dance, you can jive\n" +
            "Having the time of your life\n" +
            "Ooh, see that girl, watch that scene\n" +
            "Digging the dancing queen\n" +
            "\n" +
            "[Verse 1]\n" +
            "Friday night and the lights are low\n" +
            "Looking out for a place to go\n" +
            "Where they play the right music, getting in the swing\n" +
            "You come to look for a king\n" +
            "Anybody could be that guy\n" +
            "Night is young and the music's high\n" +
            "With a bit of rock music, everything is fine\n" +
            "You're in the mood for a dance\n" +
            "And when you get the chance\n" +
            "\n" +
            "[Chorus]\n" +
            "You are the dancing queen\n" +
            "Young and sweet, only seventeen\n" +
            "Dancing queen\n" +
            "Feel the beat from the tambourine, oh yeah\n" +
            "You can dance, you can jive\n" +
            "Having the time of your life\n" +
            "Ooh, see that girl, watch that scene\n" +
            "Digging the dancing queen\n" +
            "\n" +
            "[Verse 2]\n" +
            "You're a teaser, you turn 'em on\n" +
            "Leave 'em burning and then you're gone\n" +
            "Looking out for another, anyone will do\n" +
            "You're in the mood for a dance\n" +
            "And when you get the chance\n" +
            "\n" +
            "[Chorus]\n" +
            "You are the dancing queen\n" +
            "Young and sweet, only seventeen\n" +
            "Dancing queen\n" +
            "Feel the beat from the tambourine, oh yeah\n" +
            "You can dance, you can jive\n" +
            "Having the time of your life\n" +
            "Ooh, see that girl, watch that scene\n" +
            "Digging the dancing queen\n" +
            "\n" +
            "[Outro]\n" +
            "Digging the dancing queen", "La canción es un himno a la juventud, la diversión y el baile. El título \"Dancing Queen\" se refiere a una chica joven que es el alma de la fiesta, atractiva y carismática. La letra habla de la música como una forma de escape y de la danza como una forma de liberación. La canción se ha convertido en un clásico de la música pop y ha sido utilizada en películas, programas de televisión y comerciales, y es una de las canciones más icónicas del grupo ABBA."),
    Song("I Will Survive", "Gloria Gaynor", "Love Tracks", 1978, R.drawable.gloria_gaynor, "[Intro]\n" +
            "At first I was afraid, I was petrified\n" +
            "Kept thinkin' I could never live without you by my side\n" +
            "But then I spent so many nights thinkin' how you did me wrong\n" +
            "And I grew strong and I learned how to get along\n" +
            "\n" +
            "[Verse 1]\n" +
            "And so you're back, from outer space\n" +
            "I just walked in to find you here with that sad look upon your face\n" +
            "I should have changed that stupid lock\n" +
            "I should have made you leave your key\n" +
            "If I'd have known for just one second you'd be back to bother me\n" +
            "\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Go on now, go, walk out the door\n" +
            "Just turn around now, 'cause you're not welcome anymore\n" +
            "Weren't you the one who tried to hurt me with goodbye?\n" +
            "Did you think I'd crumble? Did you think I'd lay down and die?\n" +
            "\n" +
            "[Chorus]\n" +
            "Oh no, not I, I will survive\n" +
            "Oh, as long as I know how to love, I know I'll stay alive\n" +
            "I've got all my life to live, and I've got all my love to give\n" +
            "And I'll survive, I will survive, hey hey\n" +
            "\n" +
            "[String Solo]\n" +
            "\n" +
            "[Verse 2]\n" +
            "It took all the strength I had not to fall apart\n" +
            "Just tryin' hard to mend the pieces of my broken heart\n" +
            "And I spent oh so many nights just feeling sorry for myself\n" +
            "I used to cry, but now I hold my head up high\n" +
            "And you see me, somebody new\n" +
            "I'm not that chained up little person still in love with you\n" +
            "And so you felt like droppin' in and just expect me to be free\n" +
            "Now I'm saving all my lovin' for someone who's lovin' me\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Go on now, go, walk out the door\n" +
            "Just turn around now, 'cause you're not welcome anymore\n" +
            "Weren't you the one who tried to break me with goodbye?\n" +
            "Did you think I'd crumble? Did you think I'd lay down and die?\n" +
            "\n" +
            "You might also like\n" +
            "All the Small Things\n" +
            "\u200B\u200Bblink-182\n" +
            "Private Eyes\n" +
            "Hall & Oates\n" +
            "Special\n" +
            "SZA\n" +
            "\n" +
            "[Chorus]\n" +
            "Oh no, not I, I will survive\n" +
            "Oh, as long as I know how to love, I know I'll stay alive\n" +
            "I've got all my life to live, and I've got all my love to give\n" +
            "And I'll survive, I will survive, oh\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Go on now go, walk out the door\n" +
            "Just turn around now, 'cause you're not welcome anymore\n" +
            "Weren't you the one who tried to break me with goodbye?\n" +
            "Did you think I'd crumble? Did you think I'd lay down and die?\n" +
            "\n" +
            "[Chorus]\n" +
            "Oh no, not I, I will survive\n" +
            "Oh, as long as I know how to love, I know I'll stay alive\n" +
            "I've got all my life to live, and I've got all my love to give\n" +
            "And I'll survive, I will survive, I will survive\n" +
            "\n" +
            "[Saxophone Solo]\n" +
            "\n" +
            "[Verse 2]\n" +
            "It took all the strength I had not to fall apart\n" +
            "Just tryin' hard to mend the pieces of my broken heart\n" +
            "And I spent oh so many nights just feeling sorry for myself\n" +
            "I used to cry, but now I hold my head up high\n" +
            "And you see me, somebody new\n" +
            "I'm not that chained up little person still in love with you\n" +
            "And so you felt like droppin' in and just expect me to be free\n" +
            "Well, now I'm saving all my lovin' for someone who's lovin' me\n" +
            "\n" +
            "\n" +
            "[Pre-Chorus]\n" +
            "Go on now go, walk out the door\n" +
            "Just turn around now, 'cause you're not welcome anymore\n" +
            "Weren't you the one who tried to hurt me with goodbye?\n" +
            "Did you think I'd crumble? Did you think I'd break down and die?\n" +
            "\n" +
            "[Chorus]\n" +
            "Oh no, not I, I will survive\n" +
            "Oh, as long as I know how to love, I know I'll stay alive\n" +
            "I've got all my life to live, and I've got all my love to give\n" +
            "And I'll survive, I will survive, I will survive\n" +
            "\n" +
            "[Outro]\n" +
            "I've got all my life to live, and I've got so much love to give\n" +
            "And I'll survive, yes, I'll survive, yeah, I'll survive", "\"I Will Survive\" es una canción icónica de empoderamiento y superación personal. Con una letra que habla de una mujer que se recupera y encuentra fuerza después de una relación fallida, la canción se ha convertido en un himno de la lucha contra la adversidad. Además, la canción se considera un hito en la música disco y ha sido muy influyente en la cultura popular. \"I Will Survive\" también ha sido utilizada en varias películas y programas de televisión como una canción inspiradora de autoafirmación y determinación."),
    Song("Le Freak", "Chic", "C'est Chic", 1978, R.drawable.chic, "[Chorus]\n" +
            "Ah, freak out\n" +
            "Le freak, c'est chic\n" +
            "Freak out\n" +
            "Ah, freak out\n" +
            "Le freak, c'est chic\n" +
            "Freak out\n" +
            "\n" +
            "[Verse 1]\n" +
            "Have you heard about the new dance craze\n" +
            "Listen to us, I'm sure you'll be amazed\n" +
            "Big fun to be had by everyone\n" +
            "It's up to you, it surely can be done\n" +
            "Young and old are doing it, I'm told\n" +
            "Just one try, and you too will be sold\n" +
            "It's called Le Freak, they're doing it night and day\n" +
            "Allow us, we'll show you the way\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "Ah, freak out\n" +
            "Le freak, c'est chic\n" +
            "Freak out\n" +
            "Ah, freak out\n" +
            "Le freak, c'est chic\n" +
            "Freak out\n" +
            "\n" +
            "[Verse 2]\n" +
            "All that pressure got you down\n" +
            "Has your head spinning all around\n" +
            "Feel the rhythm, check the rhyme\n" +
            "Come on along and have a real good time\n" +
            "Like the days of \"Stompin' at the Savoy\"\n" +
            "Now we freak, oh what a joy\n" +
            "Just come on down, to the 54\n" +
            "And find a spot out on the floor\n" +
            "\n" +
            "[Chorus]\n" +
            "Ah, freak out\n" +
            "Le freak, c'est chic\n" +
            "Freak out\n" +
            "\n" +
            "[Breakdown]\n" +
            "Now freak\n" +
            "I said freak\n" +
            "Now freak\n" +
            "\n" +
            "You might also like\n" +
            "All I Want for Christmas Is You\n" +
            "Mariah Carey\n" +
            "O Holy Night\n" +
            "Christmas Songs\n" +
            "The Twelve Days of Christmas\n" +
            "Christmas Songs\n" +
            "\n" +
            "[Verse 2]\n" +
            "All that pressure got you down\n" +
            "Has your head spinning all around\n" +
            "Feel the rhythm, check the ride\n" +
            "Come on along and have a real good time\n" +
            "Like the days of \"Stompin' at the Savoy\"\n" +
            "Now we freak, oh what a joy\n" +
            "Just come on down, to the 54\n" +
            "And find a spot out on the floor\n" +
            "\n" +
            "[Chorus]\n" +
            "Ah, freak out\n" +
            "Le freak, c'est chic\n" +
            "Freak out\n" +
            "Ah, freak out\n" +
            "Le freak, c'est chic\n" +
            "Freak out", "La canción es un himno de la música disco que celebra la cultura de la noche y la fiesta. Su letra habla de una experiencia personal del cantante Nile Rodgers y el bajista Bernard Edwards, quienes fueron rechazados en la entrada de un club de Nueva York llamado Studio 54 y decidieron crear su propia fiesta en la calle. \"Le Freak\" se convirtió en un éxito mundial y se ha convertido en un icono de la música disco."),
Song("Funky Town", " Lipps Inc.", "Mouth to Mouth", 1980, R.drawable.r_13660294_1558469208_9344, "[Verse]\n" +
        "Gotta make a move to a town that's right for me\n" +
        "Town to keep me movin', keep me groovin' with some energy\n" +
        "\n" +
        "[Pre-Chorus]\n" +
        "Well, I talk about it, talk about it\n" +
        "Talk about it, talk about it\n" +
        "Talk about, talk about\n" +
        "Talk about movin'\n" +
        "Gotta move on\n" +
        "Gotta move on\n" +
        "Gotta move on\n" +
        "\n" +
        "\n" +
        "[Drum Solo]\n" +
        "\n" +
        "[Chorus]\n" +
        "A-won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "\n" +
        "[Instrumental Bridge 1]\n" +
        "\n" +
        "[Chorus]\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "\n" +
        "[Instrumental Bridge 2]\n" +
        "\n" +
        "[Verse]\n" +
        "Gotta make a move to a town that's right for me\n" +
        "Town to keep me movin', keep me groovin' with some energy\n" +
        "\n" +
        "[Pre-Chorus]\n" +
        "Well, I talk about it, talk about it\n" +
        "Talk about it, talk about it\n" +
        "Talk about, talk about\n" +
        "Talk about movin'\n" +
        "Gotta move on\n" +
        "Gotta move on\n" +
        "Gotta move on\n" +
        "\n" +
        "You might also like\n" +
        "Dawns\n" +
        "Zach Bryan\n" +
        "Rap God\n" +
        "Eminem\n" +
        "Satanist\n" +
        "\u200Bboygenius\n" +
        "\n" +
        "[Instrumental Bridge 3]\n" +
        "\n" +
        "[Chorus]\n" +
        "A-won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "\n" +
        "[Instrumental Bridge 4]\n" +
        "\n" +
        "[Chorus]\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown?\n" +
        "Won't you take me to Funkytown, yeah?\n" +
        "Won't you take me down to Funkytown?\n" +
        "Won't you take me down to Funkytown?\n" +
        "Won't you take me down to Funkytown?\n" +
        "Won't you take me down to Funkytown?\n" +
        "(Won't you take me to) Funkytown?\n" +
        "(Won't you take me to) Funkytown?\n" +
        "(Won't you take me to) Funkytown?\n" +
        "(Won't you take me to) Funkytown?\n" +
        "Take me, won't you take me?\n" +
        "Take me, won't you take me?\n" +
        "Take me, (won't you take me) won't you take me?\n" +
        "Take me, (won't you take me) won't you take me?\n" +
        "I wanna go (won't you take me) to Funkytown\n" +
        "I wanna go (won't you take me) to Funkytown\n" +
        "I wanna go (won't you take me) to Funkytown\n" +
        "I wanna go (won't you take me) to Funkytown", "\"Funky Town\" es una canción muy conocida de la era del disco que se caracteriza por su ritmo pegajoso y su estilo de baile. En cuanto al sentido simbólico, la letra habla de la búsqueda de un lugar donde la música y la fiesta nunca terminen, un lugar donde se pueda escapar de la realidad y disfrutar de la vida nocturna. En este sentido, la canción puede ser vista como una celebración de la cultura disco y de la idea de la música como una forma de escapismo y de liberación."),
    Song("Y.M.C.A", "Village People", "Cruisin", 1978, R.drawable._551443260_467141_1551444555_sumario_normal, "[Verse 1]\n" +
            "Young man, there's no need to feel down, I said\n" +
            "Young man, pick yourself off the ground, I said\n" +
            "Young man, 'cause you're in a new town\n" +
            "There's no need to be unhappy\n" +
            "Young man, there's a place you can go, I said\n" +
            "Young man, when you're short on your dough you can\n" +
            "Stay there and I'm sure you will find\n" +
            "Many ways to have a good time\n" +
            "\n" +
            "[Chorus]\n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "They have everything for young men to enjoy\n" +
            "You can hang out with all the boys\n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "You can get yourself clean, you can have a good meal\n" +
            "You can do whatever you feel\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "Young man, are you listening to me? I said\n" +
            "Young man, what do you want to be? I said\n" +
            "Young man, you can make real your dreams\n" +
            "But you've got to know this one thing\n" +
            "No man does it all by himself, I said\n" +
            "Young man, put your pride on the shelf\n" +
            "And just go there, to the Y.M.C.A. \n" +
            "I'm sure they can help you today\n" +
            "\n" +
            "[Chorus]\n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "They have everything for young men to enjoy\n" +
            "You can hang out with all the boys\n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "You can get yourself clean, you can have a good meal\n" +
            "You can do whatever you feel\n" +
            "\n" +
            "[Verse 3]\n" +
            "Young man, I was once in your shoes, I said\n" +
            "I was down and out with the blues, I felt\n" +
            "No man cared if I were alive\n" +
            "I felt the whole world was so jive\n" +
            "That's when someone came up to me and said\n" +
            "\"Young man, take a walk up the street\n" +
            "It's a place there called the Y.M.C.A. \n" +
            "They can start you back on your way\"\n" +
            "\n" +
            "You might also like\n" +
            "Blind\n" +
            "SZA\n" +
            "Love Language\n" +
            "SZA\n" +
            "Low\n" +
            "SZA\n" +
            "\n" +
            "[Chorus]\n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "It's fun to stay at the Y.M.C.A. \n" +
            "They have everything for young men to enjoy\n" +
            "You can hang out with all the boys\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "Y.M.C.A., it's fun to stay at the\n" +
            "Y.M.C.A. \n" +
            "Young man, young man, there's no need to feel down\n" +
            "Young man, young man, get yourself off the ground\n" +
            "\n" +
            "[Instrumental Break]\n" +
            "\n" +
            "[Outro]\n" +
            "Y.M.C.A., it's fun to stay at the\n" +
            "Y.M.C.A. \n" +
            "Young man, young man, are you listening to me?\n" +
            "Young man, young man, what do you wanna be?\n" +
            "Y.M.C.A., you'll find it at the\n" +
            "Y.M.C.A. \n" +
            "No man, no man does it all by himself\n" +
            "Young man, young man, put your pride on the shelf\n" +
            "Y.M.C.A. and just go to the\n" +
            "Y.M.C.A. \n" +
            "Young man, young man, I was once in your shoes\n" +
            "Young man, young man, I was down with the blues\n" +
            "Y.M.C.A., it's fun to stay at the", "\"YMCA\" es una canción que se convirtió en un himno para la comunidad LGBTQ+ durante la década de 1970 y desde entonces ha sido considerada como un himno de la cultura gay. La letra habla sobre la organización YMCA, que es una institución juvenil cristiana que promueve actividades deportivas y sociales. Sin embargo, la canción ha sido interpretada como una invitación para que los hombres homosexuales se encuentren en los vestuarios de la YMCA para tener encuentros sexuales. La canción se ha convertido en un clásico en las fiestas y eventos LGBTQ+."),
    Song("Don't Stop 'Til You Get Enough", "Michael Jackson", "Off the Wall", 1979, R.drawable.michael_jackson_portada_bad, "[Spoken Intro]\n" +
            "You know, I was\n" +
            "I was wondering, you know\n" +
            "If you could keep on\n" +
            "Because the force\n" +
            "It's got a lot of power\n" +
            "And it make me feel like ah\n" +
            "It make me feel like… ooh!\n" +
            "\n" +
            "[Verse 1]\n" +
            "Lovely is the feelin' now\n" +
            "Fever, temperatures risin' now\n" +
            "Power (Oh, power) is the force, the vow\n" +
            "That makes it happen, it asks no questions why (Ooh)\n" +
            "So get closer (Closer now)\n" +
            "To my body now\n" +
            "Just love me\n" +
            "'Til you don't know how (Ooh)\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "\n" +
            "[Verse 2]\n" +
            "Touch me and I feel on fire\n" +
            "Ain’t nothin' like a love desire (Ooh)\n" +
            "I'm melting (I'm melting)\n" +
            "Like hot candle wax\n" +
            "Sensation (Oh, sensation)\n" +
            "Lovely where we're at (Ooh!)\n" +
            "So let love take us through the hours\n" +
            "I won't be complainin' (Aah)\n" +
            "'Cause this is love power (Ooh)\n" +
            "\n" +
            "[Chorus]\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "\n" +
            "You might also like\n" +
            "All Of The Girls You Loved Before\n" +
            "Taylor Swift\n" +
            "Special\n" +
            "SZA\n" +
            "Seek & Destroy\n" +
            "SZA\n" +
            "\n" +
            "[Instrumental Interlude]\n" +
            "Ooh!\n" +
            "Oh, baby\n" +
            "Keep on\n" +
            "Keep on\n" +
            "\n" +
            "[Verse 3]\n" +
            "Heartbreak enemy despise\n" +
            "Eternal (Oh, eternal)\n" +
            "Love shines in my eyes (Ooh)\n" +
            "So let love take us through the hours (Oh, let love)\n" +
            "I won't be complainin' (No, no) (Hoo!)\n" +
            "'Cause your love is alright, alright (Ooh)\n" +
            "\n" +
            "[Chorus]\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Don't stop, baby)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough (Oh, my baby)\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "\n" +
            "\n" +
            "[Refrain]\n" +
            "Lovely is the feelin' now\n" +
            "I won't be complainin' (Ooh, ooh)\n" +
            "The force is love power\n" +
            "\n" +
            "[Chorus / Outro]\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Don't stop, darlin')\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Don't, baby)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Keep on)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Keep on, darlin')\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Love power, yeah)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Keep on, darlin')\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Love power)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "(Keep on with the power, would ya, ooh)\n" +
            "Don't stop 'til you get enough\n" +
            "(Don't stop 'til you get enough, ooh)\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Keep on, yeah)\n" +
            "Don't stop 'til you get enough (Ah, ah now)\n" +
            "Keep on with the force, don't stop (Yeah)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Keep on, baby)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Don't 'til you get enough)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Keep on, darlin')\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Alright, yeah)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Keep on baby)\n" +
            "Don't stop 'til you get enough\n" +
            "Keep on with the force, don't stop (Don't stop)", "La canción es una celebración del baile y el ritmo, y es vista por muchos como un himno a la alegría y la liberación. Además, la letra sugiere una actitud positiva hacia la vida y la perseverancia en la consecución de los objetivos. En ese sentido, la canción también puede ser interpretada como un llamado a no rendirse en la búsqueda de la felicidad y el éxito."),
    Song("September", "Earth, Wind & Fire", "The Best of Earth, Wind & Fire, Vol. 1", 1978, R.drawable.a_22164_1589675749_3805, "[Verse 1]\n" +
            "Do you remember\n" +
            "The 21st night of September?\n" +
            "Love was changin' the minds of pretenders\n" +
            "While chasin' the clouds away\n" +
            "Our hearts were ringin'\n" +
            "In the key that our souls were singin'\n" +
            "As we danced in the night, remember\n" +
            "How the stars stole the night away, oh, yeah\n" +
            "\n" +
            "[Chorus]\n" +
            "Hey, hey, hey\n" +
            "Ba-dee-ya, say, do you remember?\n" +
            "Ba-dee-ya, dancin' in September\n" +
            "Ba-dee-ya, never was a cloudy day\n" +
            "\n" +
            "\n" +
            "[Post-Chorus]\n" +
            "Ba-du-da, ba-du-da, ba-du-da, ba-du\n" +
            "Ba-du-da, ba-du, ba-du-da, ba-du\n" +
            "Ba-du-da, ba-du, ba-du-da\n" +
            "\n" +
            "[Verse 2]\n" +
            "My thoughts are with you\n" +
            "Holdin' hands with your heart to see you\n" +
            "Only blue talk and love, remember\n" +
            "How we knew love was here to stay\n" +
            "Now December\n" +
            "Found the love that we shared in September\n" +
            "Only blue talk and love, remember\n" +
            "The true love we share today\n" +
            "\n" +
            "[Chorus]\n" +
            "Hey, hey, hey\n" +
            "Ba-dee-ya, say, do you remember?\n" +
            "Ba-dee-ya, dancin' in September\n" +
            "Ba-dee-ya, never was a cloudy day\n" +
            "There was a—\n" +
            "Ba-dee-ya (Dee-ya, dee-ya), say, do you remember?\n" +
            "Ba-dee-ya (Dee-ya, dee-ya), dancin' in September\n" +
            "Ba-dee-ya (Dee-ya, dee-ya), golden dreams were shiny days\n" +
            "\n" +
            "[Bridge]\n" +
            "The bell was ringin', oh, oh\n" +
            "Our souls were singin'\n" +
            "Do you remember never a cloudy day? Yow\n" +
            "\n" +
            "You might also like\n" +
            "Spin Bout U\n" +
            "Drake & 21 Savage\n" +
            "GOD DID\n" +
            "DJ Khaled\n" +
            "There’d Better Be a Mirrorball\n" +
            "Arctic Monkeys\n" +
            "\n" +
            "[Chorus]\n" +
            "There was a\n" +
            "Ba-dee-ya (Dee-ya, dee-ya), say, do you remember?\n" +
            "Ba-dee-ya (Dee-ya, dee-ya), dancin' in September\n" +
            "Ba-dee-ya (Dee-ya, dee-ya), never was a cloudy day\n" +
            "And we'll say\n" +
            "Ba-dee-ya (Dee-ya, dee-ya), say, do you remember?\n" +
            "Ba-dee-ya (Dee-ya, dee-ya), dancin' in September\n" +
            "Ba-dee-ya (Dee ya, dee-ya), golden dreams were shiny days\n" +
            "\n" +
            "[Outro]\n" +
            "Ba-dee-ya, dee-ya, dee-ya\n" +
            "Ba-dee-ya, dee-ya, dee-ya\n" +
            "Ba-dee-ya, dee-ya, dee-ya, dee-ya!\n" +
            "Ba-dee-ya, dee-ya, dee-ya\n" +
            "Ba-dee-ya, dee-ya, dee-ya\n" +
            "Ba-dee-ya, dee-ya, dee-ya, dee-ya!", "\"September\" es una canción de disco-funk escrita por Maurice White, Al McKay y Allee Willis e interpretada por la banda estadounidense Earth, Wind & Fire. La canción fue lanzada en 1978 como parte del álbum \"The Best of Earth, Wind & Fire, Vol. 1\".\n" +
            "\n" +
            "La letra de la canción habla sobre la felicidad y el amor que se siente durante el mes de septiembre, y cómo esta felicidad puede ser sentida en cualquier momento del año. Muchos han interpretado la canción como un tributo al espíritu festivo y alegre de la época de fin de verano y comienzos de otoño, cuando la naturaleza está cambiando y la gente se prepara para una nueva temporada.\n" +
            "\n" +
            "Además, \"September\" se ha convertido en un clásico de la música popular y ha sido ampliamente utilizado en películas, programas de televisión y anuncios publicitarios. La canción es conocida por su ritmo alegre y pegadizo, y es considerada una de las canciones más icónicas de la década de 1970."),
    Song("Disco Inferno", "The Trammps", "Disco Inferno", 1976, R.drawable.disco_inferno, "[Intro]\n" +
            "Burn, baby, burn\n" +
            "Burn, baby, burn\n" +
            "Burn, baby, burn\n" +
            "Burn, baby, burn, burning\n" +
            "\n" +
            "[Verse 1]\n" +
            "To my surprise, listen, one hundred stories high\n" +
            "People getting loose, y'all, getting down on the roof, do ya hear?\n" +
            "The funk was flaming, out of control\n" +
            "It was so entertaining when the boogie started to explode, I heard somebody say\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "(Burn, baby, burn) Disco inferno\n" +
            "(Burn, baby, burn) Burn the mother down\n" +
            "(Burn, baby, burn) Disco inferno, yeah\n" +
            "(Burn, baby, burn) Burn the mother down (Burning)\n" +
            "\n" +
            "[Verse 2]\n" +
            "Satisfaction (Ooh-ooh-ooh)\n" +
            "Came in the chain reaction (Burning)\n" +
            "I couldn't get enough\n" +
            "'Til I had to self-destruct (Ooh-ooh-ooh)\n" +
            "The heat was on (Burning)\n" +
            "Rising to the top, mm\n" +
            "Everybody's going strong (Ooh-ooh-ooh)\n" +
            "And that is when my spark got hot, I heard somebody say\n" +
            "\n" +
            "[Chorus]\n" +
            "(Burn, baby, burn) Disco inferno\n" +
            "(Burn, baby, burn) Burn the mother down, y'all\n" +
            "(Burn, baby, burn) Disco inferno, yeah\n" +
            "(Burn, baby, burn) Mother down (Burning)\n" +
            "\n" +
            "[Bridge]\n" +
            "Up above my head\n" +
            "I hear music in the air (I hear music)\n" +
            "That makes me know\n" +
            "There's a party somewhere\n" +
            "\n" +
            "You might also like\n" +
            "Thinkin’ Bout Me\n" +
            "Morgan Wallen\n" +
            "As It Was\n" +
            "Harry Styles\n" +
            "Peppers\n" +
            "Lana Del Rey\n" +
            "\n" +
            "[Verse 3]\n" +
            "Satisfaction, mm, came in a chain reaction, do ya hear?\n" +
            "I couldn't get enough, so I had to self-destruct, mm\n" +
            "The heat was on, rising to the top, mm\n" +
            "Everybody going strong, that is when my spark got hot, I heard somebody say\n" +
            "\n" +
            "[Chorus]\n" +
            "(Burn, baby, burn) Disco inferno\n" +
            "(Burn, baby, burn) Burn the mother down\n" +
            "(Burn, baby, burn) Disco inferno, yeah\n" +
            "(Burn, baby, burn) Burn the mother down, get it\n" +
            "(Burn, baby, burn) Ahh, hey\n" +
            "(Burn, baby, burn) Burn the mother down\n" +
            "(Burn, baby, burn) Disco inferno\n" +
            "(Burn, baby, burn) Burn that mother down (Burning)\n" +
            "\n" +
            "[Interlude]\n" +
            "Ow, uh\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "\n" +
            "[Guitar Solo]\n" +
            "\n" +
            "[Interlude]\n" +
            "Burning, burning, burning, burning\n" +
            "Burning, burning, burning, burning\n" +
            "Burning, burning, burning, burning\n" +
            "Burning, burning, burning, burning\n" +
            "Burning, burning, burning, burning\n" +
            "Burning, burning, burning, burning\n" +
            "I wanted you to understand what I'm talking about\n" +
            "I'm not talking about burning down a building\n" +
            "It's coming from the soul (Just can't stop)\n" +
            "Soul funk (When my spark gets hot)\n" +
            "Burning in my soul (Just can't stop)\n" +
            "Ow (When my spark gets hot), now, listen\n" +
            "Don't you rescue me (Just can't stop)\n" +
            "Let my spirit burn free (When my spark gets hot)\n" +
            "Don't you rescue me, no (Just can't stop)\n" +
            "Let my spirit burn free (When my spark gets hot)\n" +
            "Everybody say \"ow\" (Ow)\n" +
            "Say \"ow\" (Ow)\n" +
            "You feel the spirit, say \"ow\" (Ow)\n" +
            "Disco funk (Ow)\n" +
            "Come out here on the floor, uh\n" +
            "Let's rock some more, uh\n" +
            "I'm on fire (Burning, burning)\n" +
            "I'm on fire (Burning, burning)\n" +
            "Let the good times roll (Burning, burning)\n" +
            "Aw, yeah (Burning, burning)\n" +
            "Hah, get out there, alright (Burning)\n" +
            "Feel pretty good, y'all (Burning)\n" +
            "People getting loose, mm (Burning)\n" +
            "Getting down on the groove, y'all (Burning)\n" +
            "The flame is higher, mm (Burning, burning)\n" +
            "It's higher (Burning, burning)\n" +
            "Alright (Burning, burning), uh, Lord have mercy\n" +
            "I can't get enough (Burning, burning)\n" +
            "I want some more, mm (Burning, burning)\n" +
            "I want some more (Burning, burning)\n" +
            "I'm burning (Burning, burning)\n" +
            "I'm burning (Burning, burning)\n" +
            "Burning in the soul, y'all (Burning, burning)\n" +
            "Burning, burning\n" +
            "Burning, burning\n" +
            "Burning\n" +
            "\n" +
            "\n" +
            "[Synthesizer Solo]\n" +
            "\n" +
            "[Interlude]\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "Just can't stop\n" +
            "When my spark gets hot\n" +
            "\n" +
            "[Outro]\n" +
            "(Burn, baby, burn) Disco inferno\n" +
            "(Burn, baby, burn) Burn that mother down\n" +
            "(Burn, baby, burn) Disco inferno, yeah\n" +
            "(Burn, baby, burn) Burn the mother down, get it\n" +
            "(Burn, baby, burn) Ahh, hey\n" +
            "(Burn, baby, burn) Burn the mother down\n" +
            "(Burn, baby, burn)", "\"Disco Inferno\" se ha convertido en un himno del movimiento disco de la década de 1970. La letra de la canción describe una fiesta en la que el ritmo y la música son tan poderosos que la pista de baile se convierte en un \"infierno de disco\". La canción puede interpretarse como una celebración de la música disco y la cultura de la discoteca, así como una metáfora de la pasión y la intensidad de la vida nocturna. En resumen, \"Disco Inferno\" es un clásico de la música disco que encapsula el espíritu y la energía de la época."),
Song("Boogie Wonderland", "Earth, Wind & Fire and The Emotions", "\"I Am\" de Earth, Wind & Fire", 1979, R.drawable._1x2md3k1zl__sl1024_, "[Chorus]\n" +
        "Dance, boogie wonderland, hah, hah\n" +
        "Dance, boogie wonderland\n" +
        "\n" +
        "[Verse 1]\n" +
        "Midnight creeps so slowly into hearts of men\n" +
        "Who need more than they get\n" +
        "Daylight deals a bad hand to a woman\n" +
        "Who has laid too many bets\n" +
        "\n" +
        "The mirror stares you in the face\n" +
        "And says \"Baby, uh, uh, it don't work\"\n" +
        "You say your prayers though you don't care\n" +
        "You dance and shake the hurt\n" +
        "\n" +
        "\n" +
        "[Chorus]\n" +
        "Dance, boogie wonderland, hah, hah\n" +
        "Dance, boogie wonderland (Ooh, ooh, ooh dance, yeah)\n" +
        "\n" +
        "[Verse 2]\n" +
        "Sound fly through the night\n" +
        "I chase my vinyl dreams to boogie wonderland\n" +
        "I find romance when I start to dance in boogie wonderland\n" +
        "(Ooh, ooh, ooh, ooh, dance, ooh, ooh, ooh, ooh)\n" +
        "(Dance, ooh, ooh, ooh, dance)\n" +
        "I find romance when I start to dance in boogie wonderland\n" +
        "(Dance, ooh, ooh, ooh, dance, ooh, ooh, ooh, ooh)\n" +
        "(Dance, ooh, ooh, ooh, dance)\n" +
        "\n" +
        "[Bridge]\n" +
        "All the love in the world can't be gone\n" +
        "All the need to be loved can't be wrong\n" +
        "All the records are playing and my heart keeps saying (Oh)\n" +
        "\"Boogie wonderland, wonderland\" (Haaah, aaah-aaaaaah)\n" +
        "\n" +
        "[Chorus]\n" +
        "Dance, boogie wonderland, hah, hah\n" +
        "(Dance, ooh, ooh, ooh, dance, ooh, ooh, ooh, ooh)\n" +
        "(Dance, ooh, ooh, ooh, dance)\n" +
        "Dance, boogie wonderland, hah, hah\n" +
        "(Dance, ooh, ooh, ooh, dance, ooh, ooh, ooh, ooh)\n" +
        "(Dance, ooh, ooh, ooh, dance)\n" +
        "\n" +
        "You might also like\n" +
        "We Are Family\n" +
        "Sister Sledge\n" +
        "Gonna Be a Lovely Day\n" +
        "Kirk Franklin\n" +
        "Work\n" +
        "Rihanna\n" +
        "\n" +
        "[Post-Chorus]\n" +
        "I find romance when I start to dance in boogie wonderland\n" +
        "I find romance when I start to dance in boogie wonderland\n" +
        "\n" +
        "[Chorus]\n" +
        "Dance, boogie wonderland, hah, hah\n" +
        "(Dance, ooh, ooh, ooh, dance, ooh, ooh, ooh, ooh)\n" +
        "(Dance, ooh, ooh, ooh, dance)\n" +
        "Dance, boogie wonderland\n" +
        "(Dance, ooh, ooh, ooh, dance, ooh, ooh, ooh, ooh)\n" +
        "(Dance, ooh, ooh, ooh, dance)\n" +
        "\n" +
        "[Hook]\n" +
        "Hmm hmm hmm hmm, hmm hmm hmm hmm\n" +
        "Hmm hmm hmm hmm, wonderland\n" +
        "Hmm hmm hmm hmm, hmm hmm hmm hmm\n" +
        "Hmm hmm hmm hmm, wonderland\n" +
        "Hmm hmm hmm hmm, hmm hmm hmm hmm\n" +
        "Hmm hmm hmm hmm\n" +
        "\n" +
        "[Bridge]\n" +
        "All the love in the world can't be gone\n" +
        "(All the love in the world can't be gone)\n" +
        "All the need to be loved can't be wrong\n" +
        "(All the need to be loved can't be wrong)\n" +
        "All the records are playing and my heart keeps saying\n" +
        "(Oooh, haa-woah, haa-woah)\n" +
        "\"Boogie wonderland, wonderland\" (Wonderland, aaah)\n" +
        "\n" +
        "\n" +
        "[Chorus]\n" +
        "Dance, boogie wonderland, hah, hah\n" +
        "Dance, boogie wonderland, hah, hah\n" +
        "\n" +
        "[Outro]\n" +
        "I find romance when I start to dance in boogie wonderland\n" +
        "(Dance, dance, dance, dance)\n" +
        "(Dance, dance, dance, aah)\n" +
        "I find romance when I start to dance in boogie wonderland\n" +
        "(Dance, dance, dance, dance)\n" +
        "(Dance, dance, dance)\n" +
        "Dance, boogie wonderland, hah, hah\n" +
        "(Dance, dance, dance, dance)\n" +
        "(Dance, dance, haa, aah)\n" +
        "(Dance, ooh, ooh, ooh, dance, ooh, ooh, ooh, ooh)\n" +
        "(Dance, ooh, ooh, ooh, dance)\n" +
        "Dance, boogie wonderland\n" +
        "(Dance, dance, dance, dance)\n" +
        "(Dance, dance, dance, aah)\n" +
        "(Dance, ooh, ooh, ooh, dance, ooh, ooh, ooh, ooh)\n" +
        "(Dance, ooh, ooh, ooh, dance)", "\"Boogie Wonderland\" es una canción que se centra en la idea de escapar de la realidad y sumergirse en un mundo de música y baile. La letra describe un lugar imaginario donde la música y la danza son la única preocupación y todo lo demás queda en segundo plano. En este sentido, la canción puede ser interpretada como un llamado a liberarse de las preocupaciones cotidianas y encontrar la felicidad a través del baile y la música. Además, el ritmo funky y energético de la canción refleja la celebración de la vida y el amor por la música y el baile que son valores centrales de la música de Earth, Wind & Fire."),
    Song("You Should Be Dancing", "Bee Gees", "Children of the World", 1976, R.drawable.bee_gees_1977, "[Verse 1]\n" +
            "My baby moves at midnight\n" +
            "Goes right on 'til the dawn\n" +
            "My woman, take me higher\n" +
            "My woman, keep me warm\n" +
            "\n" +
            "[Chorus]\n" +
            "What you doin' on your back? Hey\n" +
            "What you doin' on your back? Hey\n" +
            "You should be dancing, yeah\n" +
            "Dancing, yeah\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "She's juicy and she's trouble\n" +
            "She gets it to me good\n" +
            "My woman, give me power\n" +
            "Go right down to my blood\n" +
            "\n" +
            "[Chorus]\n" +
            "What you doin' on your back? Hey\n" +
            "What you doin' on your back? Hey\n" +
            "You should be dancing, yeah\n" +
            "Dancing, yeah\n" +
            "What you doin' on your back?\n" +
            "What you doin' on your back? Hey\n" +
            "You should be dancing, yeah\n" +
            "Dancing, yeah\n" +
            "\n" +
            "[Instrumental Solo]\n" +
            "\n" +
            "[Verse 3]\n" +
            "My baby moves at midnight, yeah\n" +
            "Goes right on 'til the dawn, yeah\n" +
            "My woman takes me higher\n" +
            "My woman, keep me warm\n" +
            "\n" +
            "[Chorus]\n" +
            "What you doin' on your back? Hey\n" +
            "What you doin' on your back? Hey\n" +
            "You should be dancing, yeah\n" +
            "Dancing, yeah\n" +
            "What you doin' on your back? Hey\n" +
            "What you doin' on your back? Hey\n" +
            "You should be dancing, yeah\n" +
            "Dancing, yeah\n" +
            "\n" +
            "You might also like\n" +
            "WOMB\n" +
            "Melanie Martinez\n" +
            "Night Fever\n" +
            "Bee Gees\n" +
            "More Than a Woman\n" +
            "Bee Gees\n" +
            "\n" +
            "[Instrumental Break]\n" +
            "\n" +
            "[Outro]\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah\n" +
            "You should be dancing, yeah", "La canción representa una llamada a la acción y la liberación a través de la música y el baile. Con su ritmo pegadizo y letras optimistas, \"You Should Be Dancing\" invita al oyente a olvidarse de las preocupaciones y disfrutar del momento presente. Además, la canción fue un éxito en las pistas de baile de la época y se considera un clásico de la música disco."),
    Song("Good Times", "Chic", "Risqué", 1979, R.drawable.chic, "[Chorus]\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Leave your cares behind\n" +
            "These are the good times\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Our new state of mind\n" +
            "These are the good times\n" +
            "\n" +
            "[Verse 1]\n" +
            "Happy days are here again\n" +
            "The time is right for makin' friends\n" +
            "Let's get together, how 'bout a quarter to ten?\n" +
            "Come tomorrow, let's all do it again\n" +
            "Boys will be boys, better let them have their toys\n" +
            "Girls will be girls, cute ponytails and curls\n" +
            "Must put an end to this stress and strife\n" +
            "I think I want to live the sporting life\n" +
            "\n" +
            "\n" +
            "[Chorus]\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Leave your cares behind\n" +
            "These are the good times\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Our new state of mind\n" +
            "These are the good times\n" +
            "\n" +
            "[Verse 2]\n" +
            "A rumor has it that it's getting late\n" +
            "Time marches on, just can't wait\n" +
            "The clock keeps turning, why hesitate?\n" +
            "You silly fool; you can't change your fate\n" +
            "Let's cut the rug, a little jive and jitterbug\n" +
            "We want the best, we won't settle for less\n" +
            "Don't be a drag; participate\n" +
            "Clams on the half shell, and roller skates, roller skates\n" +
            "\n" +
            "[Hook]\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Leave your cares behind\n" +
            "These are the good times\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Our new state of mind\n" +
            "These are the good times\n" +
            "Good times\n" +
            "\n" +
            "You might also like\n" +
            "Soldier, Poet, King\n" +
            "The Oh Hellos\n" +
            "Blind\n" +
            "SZA\n" +
            "Dawns\n" +
            "Zach Bryan\n" +
            "\n" +
            "[Instrumental Break]\n" +
            "\n" +
            "[Verse 2]\n" +
            "A rumor has it that it's getting late\n" +
            "Time marches on, just can't wait\n" +
            "The clock keeps turning, why hesitate?\n" +
            "You silly fool; you can't change your fate\n" +
            "Let's cut the rug, a little jive and jitterbug\n" +
            "We want the best, we won't settle for less\n" +
            "Don't be a drag; participate\n" +
            "Clams on the half shell, and roller skates, roller skates\n" +
            "\n" +
            "[Hook]\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Leave your cares behind\n" +
            "These are the good times\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Our new state of mind\n" +
            "These are the good times\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Leave your cares behind\n" +
            "These are the good times\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Our new state of mind\n" +
            "These are the good times\n" +
            "Good times\n" +
            "These are the good times\n" +
            "Leave your cares behind\n" +
            "These are the good times\n" +
            "Good times", "\"Good Times\" se convirtió en un himno de la era disco y ha sido sampleada y versionada en innumerables ocasiones en la música moderna. La canción representa la alegría y la felicidad que se experimenta en una noche de fiesta, y se ha convertido en un símbolo de la cultura disco de los años 70. La línea de bajo icónica de la canción ha sido particularmente influyente en la música posterior, y ha sido sampleada en numerosas canciones de hip hop y música electrónica."),
    Song("Celebration", "Kool & The Gang", "Celebrate!", 1980, R.drawable._1jgk2s8jul__sl1400_, "[Intro]\n" +
            "Yahoo! (This is your celebration)\n" +
            "Yahoo! (This is your celebration)\n" +
            "Celebrate good times, come on (Let's celebrate)\n" +
            "Celebrate good times, come on (Let's celebrate)\n" +
            "\n" +
            "[Verse]\n" +
            "There's a party goin' on right here\n" +
            "A celebration to last throughout the years\n" +
            "So bring your good times and your laughter too\n" +
            "We gonna celebrate your party with you\n" +
            "Come on now\n" +
            "\n" +
            "\n" +
            "[Hook]\n" +
            "(Celebration) Let's all celebrate and have a good time\n" +
            "(Celebration) We gon' celebrate and have a good time\n" +
            "\n" +
            "[Bridge 1]\n" +
            "It's time to come together\n" +
            "It's up to you, what's your pleasure?\n" +
            "(Everyone around the world come on)\n" +
            "\n" +
            "[Pre-Hook]\n" +
            "Yahoo! It's a celebration\n" +
            "Yahoo!\n" +
            "\n" +
            "[Hook]\n" +
            "Celebrate good times, come on (It's a celebration)\n" +
            "Celebrate good times, come on (Let's celebrate)\n" +
            "\n" +
            "[Verse]\n" +
            "There's a party goin' on right here\n" +
            "A dedication to last throughout the years\n" +
            "So bring your good times and your laughter too\n" +
            "We gonna celebrate and party with you\n" +
            "Come on now\n" +
            "\n" +
            "[Hook]\n" +
            "(Celebration) Let's all celebrate and have a good time, yeah-yeah\n" +
            "(Celebration) We gon' celebrate and have a good time\n" +
            "\n" +
            "You might also like\n" +
            "MILK OF THE SIREN\n" +
            "Melanie Martinez\n" +
            "PLUTO\n" +
            "Melanie Martinez\n" +
            "Satanist\n" +
            "\u200Bboygenius\n" +
            "\n" +
            "[Bridge 1]\n" +
            "It's time to come together\n" +
            "It's up to you, what's your pleasure?\n" +
            "(Everyone around the world come on)\n" +
            "\n" +
            "[Pre-Hook]\n" +
            "Yahoo! It's a celebration\n" +
            "Yahoo! It's a celebration\n" +
            "\n" +
            "[Hook]\n" +
            "Celebrate good times, come on (Let's celebrate, come on now)\n" +
            "Celebrate good times, come on (Let's celebrate)\n" +
            "\n" +
            "[Bridge 2]\n" +
            "We're gonna have a good time tonight\n" +
            "Let's celebrate, it's all right\n" +
            "We're gonna have a good time tonight\n" +
            "Let's celebrate, it's all right, baby\n" +
            "We're gonna have a good time tonight (Celebration)\n" +
            "Let's celebrate, it's all right\n" +
            "We're gonna have a good time tonight (Celebration)\n" +
            "Let's celebrate, it's all right\n" +
            "\n" +
            "[Pre-Hook]\n" +
            "Yahoo!\n" +
            "Yahoo!\n" +
            "\n" +
            "\n" +
            "[Hook]\n" +
            "Celebrate good times, come on (Let's celebrate)\n" +
            "Celebrate good times, come on (It's a celebration)\n" +
            "Celebrate good times, come on (Let's celebrate)\n" +
            "Celebrate good times, come on (Come on and celebrate tonight)\n" +
            "(Baby everything's gonna be alright, let's celebrate)\n" +
            "Celebrate good times, come on\n" +
            "Celebrate good times, come on (Let's have a great time, celebrate)\n" +
            "Celebrate good times, come on", "\"Celebration\" es una canción que celebra la vida y la felicidad, y se ha convertido en un himno de fiesta y celebración en todo el mundo. La canción es conocida por su letra pegadiza y su ritmo animado, y ha sido utilizada en numerosas películas, programas de televisión y eventos deportivos. Además de su sentido simbólico como canción de fiesta, \"Celebration\" también ha sido interpretada como una canción de empoderamiento, ya que anima a los oyentes a ser positivos y a disfrutar de la vida al máximo."),
    Song("Shake Your Body (Down to the Ground)", "The Jacksons", "Destiny", 1979, R.drawable.nxjsvfi4_400x400, "[Verse 1]\n" +
            "I don't know what's gonna happen to you baby\n" +
            "But I do know that I love ya'\n" +
            "You walk around this town with your head all up in the sky\n" +
            "And I do know that I want ya'\n" +
            "\n" +
            "[Chorus]\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground (Ooh)\n" +
            "\n" +
            "\n" +
            "[Verse 2]\n" +
            "You tease me with your loving to play hard to get\n" +
            "'Cause you do know that I want ya'\n" +
            "You walk around this town with your head all up in the sky\n" +
            "And you do know that I want ya'\n" +
            "\n" +
            "[Chorus]\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground (Shake it on down)\n" +
            "\n" +
            "[Verse 3]\n" +
            "You're the spark that lit the fire inside of me\n" +
            "And you do know that I love it\n" +
            "I need to do you something to get closer to your soul\n" +
            "And you do know that I want ya'\n" +
            "\n" +
            "[Chorus]\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground (Ooh)\n" +
            "\n" +
            "You might also like\n" +
            "Things I Do For You\n" +
            "The Jacksons\n" +
            "\u200B\u200B\u200Blabour\n" +
            "Paris Paloma\n" +
            "The Grants\n" +
            "Lana Del Rey\n" +
            "\n" +
            "[Verse 4]\n" +
            "You tease me with your loving to play hard to get\n" +
            "'Cause you do know that I want ya'\n" +
            "I need to do you something to get closer to your soul\n" +
            "And you do know that I want ya'\n" +
            "\n" +
            "[Chorus]\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Lets dance, girl let's shout (Let's shout, are you aroused?) (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake your body down to the ground\n" +
            "Let's dance, let's shout (Shout)\n" +
            "Shake it over! (Ooh)\n" +
            "Down, down, down, down, down\n" +
            "And around, shake it over, ooh!\n" +
            "You know I wanna dance\n" +
            "Let's dance and shout\n" +
            "Dance\n" +
            "Dance shout\n" +
            "Dance\n" +
            "Dance, shout\n" +
            "Let's dance\n" +
            "Dance shout", "\"Shake Your Body (Down to the Ground)\" es una canción divertida y bailable que celebra el poder de la música para unir a las personas y hacerlas bailar. El sentido simbólico de la canción se puede interpretar como una llamada a la acción para que las personas dejen de lado sus diferencias y se unan en la pista de baile para disfrutar del ritmo y la alegría de la música. La canción es un clásico de la música disco y ha sido utilizada en numerosas películas, programas de televisión y anuncios comerciales desde su lanzamiento.")
)

val songRock = listOf(
    Song("Bohemian Rhapsody", "Queen", "A Night at the Opera", 1975, R.drawable.queen, "[Intro]\n" +
            "Is this the real life? Is this just fantasy?\n" +
            "Caught in a landslide, no escape from reality\n" +
            "Open your eyes, look up to the skies and see\n" +
            "I'm just a poor boy, I need no sympathy\n" +
            "Because I'm easy come, easy go, little high, little low\n" +
            "Any way the wind blows doesn't really matter to me, to me\n" +
            "\n" +
            "[Verse 1]\n" +
            "Mama, just killed a man\n" +
            "Put a gun against his head, pulled my trigger, now he's dead\n" +
            "Mama, life had just begun\n" +
            "But now I've gone and thrown it all away\n" +
            "Mama, ooh, didn't mean to make you cry\n" +
            "If I'm not back again this time tomorrow\n" +
            "Carry on, carry on as if nothing really matters\n" +
            "\n" +
            "[Verse 2]\n" +
            "Too late, my time has come\n" +
            "Sends shivers down my spine, body's aching all the time\n" +
            "Goodbye, everybody, I've got to go\n" +
            "Gotta leave you all behind and face the truth\n" +
            "Mama, ooh (Any way the wind blows)\n" +
            "I don't wanna die\n" +
            "I sometimes wish I'd never been born at all\n" +
            "\n" +
            "[Guitar Solo]\n" +
            "\n" +
            "[Verse 3]\n" +
            "I see a little silhouetto of a man\n" +
            "Scaramouche, Scaramouche, will you do the Fandango?\n" +
            "Thunderbolt and lightning, very, very frightening me\n" +
            "(Galileo) Galileo, (Galileo) Galileo, Galileo Figaro magnifico\n" +
            "But I'm just a poor boy, nobody loves me\n" +
            "He's just a poor boy from a poor family\n" +
            "Spare him his life from this monstrosity\n" +
            "Easy come, easy go, will you let me go?\n" +
            "Bismillah! No, we will not let you go\n" +
            "(Let him go) Bismillah! We will not let you go\n" +
            "(Let him go) Bismillah! We will not let you go\n" +
            "(Let me go) Will not let you go\n" +
            "(Let me go) Will not let you go\n" +
            "(Never, never, never, never let me go) Ah\n" +
            "No, no, no, no, no, no, no\n" +
            "(Oh, mamma mia, mamma mia) Mamma mia, let me go\n" +
            "Beelzebub has a devil put aside for me, for me, for me!\n" +
            "\n" +
            "[Verse 4]\n" +
            "So you think you can stone me and spit in my eye?\n" +
            "So you think you can love me and leave me to die?\n" +
            "Oh, baby, can't do this to me, baby!\n" +
            "Just gotta get out, just gotta get right outta here\n" +
            "\n" +
            "[Outro]\n" +
            "(Ooh)\n" +
            "(Ooh, yeah, ooh, yeah)\n" +
            "Nothing really matters, anyone can see\n" +
            "Nothing really matters\n" +
            "Nothing really matters to me\n" +
            "Any way the wind blows", "\"Bohemian Rhapsody\" es una canción icónica que se ha convertido en un himno del rock. La letra enigmática y poética ha llevado a muchas interpretaciones sobre su significado, desde la lucha entre el bien y el mal hasta la exploración de la identidad y la sexualidad. En general, la canción se considera un homenaje a la complejidad y la variedad de la vida, y una reflexión sobre la mortalidad y la trascendencia."),
    Song("Highway to Hell", "AC/DC", "Highway to Hell", 1979, R.drawable.acdc, "Livin' easy\n" +
            "Lovin' free\n" +
            "Season ticket on a one way ride\n" +
            "Askin' nothin'\n" +
            "Leave me be\n" +
            "Takin' everythin' in my stride\n" +
            "Don't need reason\n" +
            "Don't need rhyme\n" +
            "Ain't nothin' that I'd rather do\n" +
            "Goin' down\n" +
            "Party time\n" +
            "My friends are gonna be there too\n" +
            "I'm on the highway to hell\n" +
            "On the highway to hell\n" +
            "Highway to hell\n" +
            "I'm on the highway to hell\n" +
            "No stop signs\n" +
            "Speed limit\n" +
            "Nobody's gonna slow me down\n" +
            "Like a wheel\n" +
            "Gonna spin it\n" +
            "Nobody's gonna mess me around\n" +
            "Hey satan\n" +
            "Payin' my dues\n" +
            "Playin' in a rockin' band\n" +
            "Hey mumma\n" +
            "Look at me\n" +
            "I'm on the way to the promised land\n" +
            "I'm on the highway to hell\n" +
            "Highway to hell\n" +
            "I'm on the highway to hell\n" +
            "Highway to hell\n" +
            "Don't stop me\n" +
            "I'm on the highway to hell\n" +
            "On the highway to hell\n" +
            "Highway to hell\n" +
            "I'm on the highway to hell\n" +
            "(Highway to hell) I'm on the highway to hell\n" +
            "(Highway to hell) highway to hell\n" +
            "(Highway to hell) highway to hell\n" +
            "(Highway to hell)\n" +
            "And I'm goin' down\n" +
            "All the way\n" +
            "I'm on the highway to hell", "\"Highway to Hell\" es una canción que ha sido interpretada por muchos como una metáfora de la vida en la carretera como músico, y de los excesos y peligros que pueden acompañar ese estilo de vida. La letra habla de un viaje por una carretera que conduce al infierno, y ha sido interpretada por algunos como una crítica a la industria musical o a la sociedad en general por llevar a los artistas a un estilo de vida destructivo. También se ha interpretado como una reflexión sobre el destino final de la humanidad, y la posibilidad de que nuestras acciones nos lleven a la condenación eterna. En general, la canción se ha convertido en un himno del rock clásico y ha sido versionada y reinterpretada por muchos artistas a lo largo de los años."),
    Song("Walk This Way", "Aerosmith", "Toys in the Attic", 1975, R.drawable.aerosmith, "Backstroke lover always hidin' 'neath the cover\n" +
            "'Till I talked to my daddy, he say\n" +
            "He said, \"You ain't seen nothing\n" +
            "'Till you're down on a muffin\n" +
            "Then you're sure to be a-changin' your ways\"\n" +
            "I met a cheerleader, was a real young bleeder\n" +
            "All the times I can reminisce\n" +
            "'Cause the best thing lovin' with her sister and her cousin\n" +
            "Only started with a little kiss, like this\n" +
            "See-saw swingin' with the boys in the school\n" +
            "With your feet flyin' up in the air\n" +
            "Singin' \"Hey diddle-diddle with the kitty in the middle\n" +
            "Of the swing\" like I didn't care\n" +
            "So I took a big chance at the high school dance\n" +
            "With a missy who was ready to play\n" +
            "Wasn't me she was foolin'\n" +
            "'Cause she knew what she was doin'\n" +
            "And I know love is here to stay\n" +
            "When she told me to\n" +
            "Walk this way, walk this way\n" +
            "Walk this way, walk this way\n" +
            "Walk this way, walk this way\n" +
            "Walk this way, walk this way\n" +
            "Ah, just give me a kiss\n" +
            "Like this\n" +
            "School girl sweetie with the classy kinda sassy\n" +
            "Little skirt's climbin' way up her knees\n" +
            "There was three young ladies in the school gym locker\n" +
            "When I noticed they was lookin' at me\n" +
            "I was a high school loser, never made it with a lady\n" +
            "'Til the boys told me something I missed\n" +
            "Then my next door neighbor with a daughter had a favor\n" +
            "So I gave her just a little kiss, like this\n" +
            "See-saw swingin' with the boys in the school\n" +
            "With your feet flyin' up in the air\n" +
            "Singin' \"Hey diddle-diddle with the kitty in the middle\n" +
            "Of the swing\" like I didn't care\n" +
            "So I took a big chance at the high school dance\n" +
            "With a missy who was ready to play\n" +
            "Wasn't me she was foolin'\n" +
            "'Cause she knew what she was doin'\n" +
            "When she told me how to walk this way\n" +
            "She told me to\n" +
            "Walk this way, walk this way\n" +
            "Walk this way, walk this way\n" +
            "Walk this way, walk this way\n" +
            "Walk this way, talk this way\n" +
            "Just give me a kiss\n" +
            "Like this", "Sentido simbólico: \"Walk This Way\" es una canción que representa la fusión de dos géneros musicales diferentes: el rock y el rap. La colaboración entre Aerosmith y Run-DMC fue un momento histórico en la música y en la cultura popular en general, ya que marcó uno de los primeros casos de éxito en la colaboración intergénero. La canción habla de la importancia de tener confianza en uno mismo y seguir adelante con determinación, independientemente de las dificultades que puedan presentarse en el camino. El sentido simbólico de la canción, por lo tanto, se relaciona con la idea de la colaboración y la superación de las barreras culturales y musicales para lograr algo más grande juntos."),
    Song("Paranoid", "Black Sabbath", "Paranoid", 1970, R.drawable.paranoid, "Finished with my woman 'cause\n" +
            "She couldn't help me with my mind\n" +
            "People think I'm insane because\n" +
            "I am frowning all the time\n" +
            "All day long I think of things\n" +
            "But nothing seems to satisfy\n" +
            "Think I'll lose my mind\n" +
            "If I don't find something to pacify\n" +
            "Can you help me\n" +
            "Occupy my brain?\n" +
            "Oh yeah\n" +
            "I need someone to show me\n" +
            "The things in life that I can't find\n" +
            "I can't see the things that make\n" +
            "True happiness, I must be blind\n" +
            "Make a joke and I will sigh\n" +
            "And you will laugh and I will cry\n" +
            "Happiness I cannot feel\n" +
            "And love to me is so unreal\n" +
            "And so as you hear these words\n" +
            "Telling you now of my state\n" +
            "I tell you to enjoy life\n" +
            "I wish I could but it's too late", "\"Paranoid\" es una canción que habla sobre el miedo y la ansiedad que siente alguien que cree que está siendo perseguido por algo o alguien. El tema simboliza los miedos e inquietudes que surgen en la mente de una persona y cómo estos pueden ser difíciles de superar. La canción ha sido descrita como un himno del heavy metal y ha sido citada como una de las canciones más influyentes e importantes del género."),
    Song("Thunder Road", "Bruce Springsteen y E Street Band", "Live 1975-86", 1986, R.drawable.bruce_springsteen, "A screen door slams, Mary's dress sways\n" +
            "Like a vision she dances across the porch\n" +
            "As the radio plays\n" +
            "Roy Orbison singing for the lonely\n" +
            "Hey, that's me, and I want you only\n" +
            "Don't turn me home again\n" +
            "I just can't face myself alone again\n" +
            "Don't run back inside, darling\n" +
            "You know just what I'm here for\n" +
            "So you're scared and you're thinking\n" +
            "That maybe we ain't that young anymore\n" +
            "Show a little faith, there's magic in the night\n" +
            "You ain't a beauty but, hey, you're alright\n" +
            "Oh, and that's alright with me\n" +
            "You can hide 'neath your covers and study your pain\n" +
            "Make crosses from your lovers, throw roses in the rain\n" +
            "Waste your summer praying in vain\n" +
            "For a savior to rise from these streets\n" +
            "Well now I'm no hero, that's understood\n" +
            "All the redemption I can offer, girl\n" +
            "Is beneath this dirty hood\n" +
            "With a chance to make it good somehow\n" +
            "Hey, what else can we do now?\n" +
            "Except roll down the window\n" +
            "And let the wind blow back your hair\n" +
            "Well, the night's busting open\n" +
            "These two lanes will take us anywhere\n" +
            "We got one last chance to make it real\n" +
            "To trade in these wings on some wheels\n" +
            "Climb in back, heaven's waiting down on the tracks\n" +
            "Oh-oh, come take my hand\n" +
            "We're riding out tonight to case the promised land\n" +
            "Oh-oh, Thunder Road\n" +
            "Oh, Thunder Road, oh, Thunder Road\n" +
            "Lying out there like a killer in the sun\n" +
            "Hey, I know it's late, we can make it if we run\n" +
            "Oh-oh, Thunder Road\n" +
            "Sit tight, take hold\n" +
            "Thunder Road\n" +
            "Well, I got this guitar\n" +
            "And I learned how to make it talk\n" +
            "And my car's out back\n" +
            "If you're ready to take that long walk\n" +
            "From your front porch to my front seat\n" +
            "The door's open but the ride ain't free\n" +
            "And I know you're lonely for words that I ain't spoken\n" +
            "Tonight we'll be free, all the promises'll be broken\n" +
            "There were ghosts in the eyes\n" +
            "Of all the boys you sent away\n" +
            "They haunt this dusty beach road\n" +
            "On the skeleton frames of burned out Chevrolets\n" +
            "They scream your name at night in the street\n" +
            "Your graduation gown lies in rags at their feet\n" +
            "And in the lonely cool before dawn\n" +
            "You hear their engines roaring on\n" +
            "When you get to the porch\n" +
            "They're gone on the wind\n" +
            "So Mary, climb in\n" +
            "It's a town full of losers\n" +
            "I'm pulling out of here to win", "La canción \"Thunder Road\" de Bruce Springsteen es una oda a la libertad y la escapada de la vida cotidiana. La letra se centra en una pareja que abandona todo lo que conocen para salir a la carretera y escapar de su vida pasada. El sentimiento de emoción y la sensación de libertad que se siente al dejar atrás todo lo que se conoce es el sentido simbólico principal de la canción. Además, \"Thunder Road\" es una canción sobre la juventud y la búsqueda de un futuro mejor, lo que ha hecho que se convierta en una canción icónica para toda una generación de fanáticos de la música rock."),
    Song("Crossroads", "Cream", "Fresh Cream", 1966, R.drawable.cream, "I went down to the crossroads\n" +
            "Fell down on my knees\n" +
            "Down to the crossroads\n" +
            "Fell down on my knees\n" +
            "Asked the Lord above for mercy\n" +
            "Take me, if you please\n" +
            "I went down to the crossroads\n" +
            "Tried to flag a ride\n" +
            "Down to the crossroads\n" +
            "Tried to flag a ride\n" +
            "Nobody seemed to know me\n" +
            "Everybody passed me by\n" +
            "Well, I'm going down to Rosedale\n" +
            "Take my rider by my side\n" +
            "Going down to Rosedale\n" +
            "Take my rider by my side\n" +
            "You can still borrow a house, baby\n" +
            "On the riverside\n" +
            "Going down to Rosedale\n" +
            "Take my rider by my side\n" +
            "Going down to Rosedale\n" +
            "Take my rider by my side\n" +
            "You can still borrow a house, baby\n" +
            "On the riverside\n" +
            "You can run, you can run\n" +
            "Tell my friend boy Willie Brown\n" +
            "Run, you can run\n" +
            "Tell my friend boy Willie Brown\n" +
            "And I'm standing at the crossroads\n" +
            "Believe I'm sinking down", "\"Crossroads\" es una canción que ha adquirido un fuerte sentido simbólico a lo largo de los años. La letra describe a un hombre que llega a una encrucijada y se encuentra con el diablo, a quien le pide ayuda para tocar la guitarra. A cambio, el diablo le pide su alma. La canción ha sido interpretada como una alegoría de la lucha entre el bien y el mal, así como una metáfora de las tentaciones y decisiones difíciles que enfrentamos en la vida. La idea de una encrucijada también se ha utilizado como símbolo de la elección y la transición en la música, la literatura y la cultura en general."),
    Song("Highway Star", "Deep Purple", "Machine Head", 1972, R.drawable.deep_purple, "Nobody gonna take my car\n" +
            "I'm gonna race it to the ground\n" +
            "Nobody gonna beat my car\n" +
            "It's gonna break the speed of sound\n" +
            "Ooh it's a killing machine\n" +
            "It's got everything\n" +
            "Like a driving power big fat tires\n" +
            "And everything\n" +
            "I love it and I need it\n" +
            "I bleed it\n" +
            "Yeah it's a wild hurricane\n" +
            "Alright hold tight\n" +
            "I'm a highway star\n" +
            "Nobody gonna take my girl\n" +
            "I'm gonna keep her to the end\n" +
            "Nobody gonna have my girl\n" +
            "She stays close on every bend\n" +
            "Ooh she's a killing machine\n" +
            "She's got everything\n" +
            "Like a moving mouth body control\n" +
            "And everything\n" +
            "I love her I need her\n" +
            "I seed her\n" +
            "Yeah she turns me on\n" +
            "Alright hold on tight\n" +
            "I'm a highway star\n" +
            "Nobody gonna take my head\n" +
            "I got speed inside my brain\n" +
            "Nobody gonna steal my head\n" +
            "Now that I'm on the road again\n" +
            "Ooh I'm in heaven again\n" +
            "I've got everything\n" +
            "Like a moving ground an open road\n" +
            "And everything\n" +
            "I love it and I need it\n" +
            "I seed it\n" +
            "Eight cylinders all mine\n" +
            "Alright hold on tight\n" +
            "I'm a highway star\n" +
            "Nobody gonna take my car\n" +
            "I'm gonna race it to the ground\n" +
            "Nobody gonna beat my car\n" +
            "It's gonna break the speed of sound\n" +
            "Ooh it's a killing machine\n" +
            "It's got everything\n" +
            "Like a driving power big fat tires\n" +
            "And everything\n" +
            "I love it and I need it\n" +
            "I bleed it\n" +
            "Yeah it's a mad hurricane\n" +
            "Alright hold on tight\n" +
            "I'm a highway star\n" +
            "I'm a highway star\n" +
            "I'm a highway star", "Sentido simbólico: \"Highway Star\" es una canción que habla sobre la vida en la carretera, la velocidad y la sensación de libertad que se experimenta al conducir. También se interpreta como una metáfora sobre la búsqueda constante de la perfección y el éxito en la vida, representado por la imagen de una \"estrella de la carretera\" que nunca se detiene y siempre busca ir más allá de los límites. La canción se ha convertido en un himno del rock clásico y ha sido reconocida como una de las mejores canciones de guitarra de todos los tiempos."),
    Song("The Trooper", "Iron Maiden", "Piece of Mind", 1983, R.drawable.iron_maiden, "You'll take my life, but I'll take yours too\n" +
            "You'll fire your musket, but I'll run you through\n" +
            "So when you're waiting for the next attack\n" +
            "You'd better stand, there's no turning back\n" +
            "The bugle sounds, the charge begins\n" +
            "But on this battlefield, no one wins\n" +
            "The smell of acrid smoke and horses' breath\n" +
            "As I plunge on into certain death\n" +
            "The horse, he sweats with fear, we break to run\n" +
            "The mighty roar of the Russian guns\n" +
            "And as we race towards the human wall\n" +
            "The screams of pain as my comrades fall\n" +
            "We hurdle bodies that lay on the ground\n" +
            "And the Russians fire another round\n" +
            "We get so near, yet so far away\n" +
            "We won't live to fight another day\n" +
            "We get so close, near enough to fight\n" +
            "When a Russian gets me in his sights\n" +
            "He pulls the trigger and I feel the blow\n" +
            "A burst of rounds take my horse below\n" +
            "And as I lay there gazing at the sky\n" +
            "My body's numb and my throat is dry\n" +
            "And as I lay forgotten and alone\n" +
            "Without a tear, I draw my parting groan", ""),
    Song("Whole Lotta Love", "Led Zeppelin", "The Song Remains the Same", 1969, R.drawable.led_zeppelin, "You need cooling\n" +
            "Baby I'm not fooling\n" +
            "I'm gonna send ya\n" +
            "Back to schooling\n" +
            "A-way down inside\n" +
            "A-honey you need it\n" +
            "I'm gonna give you my love\n" +
            "I'm gonna give you my love\n" +
            "Want to whole lotta love\n" +
            "Want to whole lotta love\n" +
            "Want to whole lotta love\n" +
            "Want to whole lotta love\n" +
            "You've been learning\n" +
            "Um baby I been learning\n" +
            "All them good times baby, baby\n" +
            "I've been year-yearning\n" +
            "A-way, way down inside\n" +
            "A-honey you need-ah\n" +
            "I'm gonna give you my love, ah\n" +
            "I'm gonna give you my love, ah oh\n" +
            "Whole lotta love\n" +
            "Want to whole lotta love\n" +
            "Want to whole lotta love\n" +
            "Want to whole lotta love\n" +
            "You've been cooling\n" +
            "And baby I've been drooling\n" +
            "All the good times, baby\n" +
            "I've been misusing\n" +
            "A-way, way down inside\n" +
            "I'm gonna give ya my love\n" +
            "I'm gonna give ya every inch of my love\n" +
            "I'm gonna give ya my love\n" +
            "Hey!\n" +
            "Alright! Let's go!\n" +
            "Whole lotta love\n" +
            "Want to whole lotta love\n" +
            "Want to whole lotta love\n" +
            "Want to whole lotta love\n" +
            "Way down inside\n" +
            "Woman, you need, yeah\n" +
            "Love\n" +
            "My, my, my, my\n" +
            "My, my, my, my\n" +
            "Lord\n" +
            "Shake for me girl\n" +
            "I wanna be your backdoor man\n" +
            "Hey, oh, hey, oh\n" +
            "Hey, oh, hey, oh\n" +
            "Ooh\n" +
            "Oh, oh, oh, oh\n" +
            "Cool, my, my baby\n" +
            "A-keep it cooling baby\n" +
            "A-keep it cooling baby\n" +
            "Ah-keep it cooling baby\n" +
            "Ah-keep it cooling baby\n" +
            "Ah-keep it cooling baby", ""),
    Song("Free Bird", "Lynyrd Skynyrd", "Pronounced 'lĕh-'nérd 'skin-'nérd", 1973, R.drawable.freebird, "If I leave here tomorrow\n" +
            "Would you still remember me?\n" +
            "For I must be traveling on now\n" +
            "'Cause there's too many places I've got to see\n" +
            "But if I stay here with you, girl\n" +
            "Things just couldn't be the same\n" +
            "'Cause I'm as free as a bird now\n" +
            "And this bird you cannot change\n" +
            "Oh, oh, oh, oh\n" +
            "And the bird you cannot change\n" +
            "And this bird, you cannot change\n" +
            "Lord knows, I can't change\n" +
            "Bye-bye baby, it's been sweet love, yeah, yeah\n" +
            "Though this feelin' I can't change\n" +
            "But please don't take it so badly\n" +
            "'Cause Lord knows, I'm to blame\n" +
            "But if I stay here with you, girl\n" +
            "Things just couldn't be the same\n" +
            "'Cause I'm as free as a bird now\n" +
            "And this bird you cannot change\n" +
            "Oh, oh, oh, oh\n" +
            "And the bird you cannot change\n" +
            "And this bird, you cannot change\n" +
            "Lord knows, I can't change\n" +
            "Lord help me, I can't change\n" +
            "Lord, I can't change\n" +
            "Won't you fly high, free bird, yeah", ""),
    Song("Ace of Spades", "Motörhead", "Ace of Spades", 1980, R.drawable.ace_of_spades, "If you like to gamble\n" +
            "I tell you, I'm your man\n" +
            "You win some, lose some\n" +
            "It's all the same to me\n" +
            "The pleasure is to play\n" +
            "Makes no difference what you say\n" +
            "I don't share your greed\n" +
            "The only card I need\n" +
            "Is the Ace of Spades\n" +
            "The Ace of Spades\n" +
            "Playing for the high one\n" +
            "Dancing with the devil\n" +
            "Going with the flow\n" +
            "It's all a game to me\n" +
            "Seven or eleven\n" +
            "Snake eyes watching you\n" +
            "Double up or quit\n" +
            "Double stake or split\n" +
            "The Ace of Spades\n" +
            "The Ace of Spades\n" +
            "You know I'm born to lose\n" +
            "And gambling's for fools\n" +
            "But that's the way I like it, baby\n" +
            "I don't want to live forever\n" +
            "And don't forget the joker\n" +
            "Pushing up the ante\n" +
            "I know you got to see me\n" +
            "Read 'em and weep\n" +
            "The dead man's hand again\n" +
            "I see it in your eyes\n" +
            "Take one look and die\n" +
            "The only thing you see\n" +
            "You know it's gonna be\n" +
            "The Ace of Spades\n" +
            "The Ace of Spades, uh", "El “as de picas” que da nombre a la canción es la carta más valiosa de la baraja y la letra habla de ganar y perder, subir la apuesta o plantarse, aunque también hay referencias más difíciles de captar como el término “ante” del póker o las expresiones “seven or eleven” y “snake eyes” que son específicas de los dados."),
    Song("Comfortably Numb", "Pink Floyd", "The Wall", 1979, R.drawable.pink_floyd, "Hello? (Hello? Hello? Hello?)\n" +
            "Is there anybody in there?\n" +
            "Just nod if you can hear me\n" +
            "Is there anyone home?\n" +
            "Come on now\n" +
            "I hear you're feeling down\n" +
            "Well I can ease your pain\n" +
            "Get you on your feet again\n" +
            "Relax\n" +
            "I'll need some information first\n" +
            "Just the basic facts\n" +
            "Can you show me where it hurts?\n" +
            "There is no pain you are receding\n" +
            "A distant ship smoke on the horizon\n" +
            "You are only coming through in waves\n" +
            "Your lips move but I can't hear what you're saying\n" +
            "When I was a child I had a fever\n" +
            "My hands felt just like two balloons\n" +
            "Now I've got that feeling once again\n" +
            "I can't explain you would not understand\n" +
            "This is not how I am\n" +
            "I have become comfortably numb\n" +
            "I have become comfortably numb\n" +
            "Okay (okay, okay, okay)\n" +
            "Just a little pinprick\n" +
            "There'll be no more, ah\n" +
            "But you may feel a little sick\n" +
            "Can you stand up?\n" +
            "I do believe it's working, good\n" +
            "That'll keep you going through the show\n" +
            "Come on it's time to go\n" +
            "There is no pain you are receding\n" +
            "A distant ship, smoke on the horizon\n" +
            "You are only coming through in waves\n" +
            "Your lips move but I can't hear what you're saying\n" +
            "When I was a child\n" +
            "I caught a fleeting glimpse\n" +
            "Out of the corner of my eye\n" +
            "I turned to look but it was gone\n" +
            "I cannot put my finger on it now\n" +
            "The child is grown\n" +
            "The dream is gone\n" +
            "I have become comfortably numb", ""),
Song("Don't Stop Me Now", "Queen", "Bohemian Rhapsody", 1979, R.drawable.queen, "Tonight I'm gonna have myself a real good time\n" +
        "I feel alive\n" +
        "And the world I'll turn it inside out, yeah\n" +
        "I'm floating around in ecstasy\n" +
        "So, (don't stop me now)\n" +
        "(Don't stop me)\n" +
        "'Cause I'm having a good time, having a good time\n" +
        "I'm a shooting star leaping through the sky like a tiger\n" +
        "Defying the laws of gravity\n" +
        "I'm a racing car passing by like Lady Godiva\n" +
        "I'm gonna go, go, go, there's no stopping me\n" +
        "I'm burnin' through the sky, yeah\n" +
        "200 degrees, that's why they call me Mister Fahrenheit\n" +
        "I'm travelling at the speed of light\n" +
        "I wanna make a supersonic man out of you\n" +
        "I'm having such a good time\n" +
        "I'm having a ball\n" +
        "(Don't stop me now)\n" +
        "If you wanna have a good time\n" +
        "Just give me a call\n" +
        "(Don't stop me now)\n" +
        "'Cause I'm having a good time\n" +
        "(Don't stop me now)\n" +
        "Yes, I'm havin' a good time\n" +
        "I don't want to stop at all, yeah\n" +
        "I'm a rocket ship on my way to Mars on a collision course\n" +
        "I am a satellite I'm out of control\n" +
        "I am a sex machine ready to reload like an atom bomb\n" +
        "About to oh, oh, oh, oh, oh, explode\n" +
        "I'm burnin' through the sky, yeah\n" +
        "200 degrees, that's why they call me Mister Fahrenheit\n" +
        "I'm travelling at the speed of light\n" +
        "I wanna make a supersonic woman of you\n" +
        "Hey, hey, hey\n" +
        "(Don't stop me, don't stop me, ooh, ooh, ooh) I like it\n" +
        "(Don't stop me, don't stop me) Have a good time, good time\n" +
        "(Don't stop me, don't stop me) Woah\n" +
        "Let loose, honey, all right\n" +
        "Oh, I'm burnin' through the sky, yeah\n" +
        "200 degrees, that's why they call me Mister Fahrenheit (hey)\n" +
        "I'm travelling at the speed of light\n" +
        "I wanna make a supersonic man out of you (hey, hey)\n" +
        "I'm having such a good time\n" +
        "I'm having a ball\n" +
        "(Don't stop me now)\n" +
        "If you wanna have a good time (ooh, alright)\n" +
        "Just give me a call\n" +
        "(Don't stop me now)\n" +
        "'Cause I'm having a good time (hey, hey)\n" +
        "(Don't stop me now)\n" +
        "Yes, I'm havin' a good time\n" +
        "I don't want to stop at all\n" +
        "Ah, da, da, da, da\n" +
        "Da, da, ah, ah\n" +
        "Ah, da, da, ah, ah, ah\n" +
        "Ah, da, da\n" +
        "Ah, da, da, ah, ah\n" +
        "Ooh, ooh-ooh, ooh-ooh", "“Don't Stop me Now” de Queen es la canción más feliz del mundo. La música es capaz de transmitir e intensificar una serie de emociones: la tristeza, la rabia, el amor y la alegría son solo algunos de los tantos sentimientos humanos que una pieza musical interpreta en diversidad de letras y ritmos."),
    Song("London Calling", "The Clash", "London Calling", 1979, R.drawable.london_calling, "London calling to the faraway towns\n" +
            "Now war is declared and battle come down\n" +
            "London calling to the underworld\n" +
            "Come out of the cupboard, you boys and girls\n" +
            "London calling, now don't look to us\n" +
            "Phony Beatlemania has bitten the dust\n" +
            "London calling, see we ain't got no swing\n" +
            "Except for the ring of the truncheon thing\n" +
            "The ice age is coming, the sun's zooming in\n" +
            "Meltdown expected, the wheat is growing thin\n" +
            "Engines stop running, but I have no fear\n" +
            "'Cause London is drowning\n" +
            "I live by the river\n" +
            "London calling to the imitation zone\n" +
            "Forget it, brother, you can go it alone\n" +
            "London calling to the zombies of death\n" +
            "Quit holding out and draw another breath\n" +
            "London calling and I don't want to shout\n" +
            "But while we were talking, I saw you nodding out\n" +
            "London calling, see we ain't got no high\n" +
            "Except for that one with the yellowy eye\n" +
            "The ice age is coming, the sun's zooming in\n" +
            "Engines stop running, the wheat is growing thin\n" +
            "A nuclear era, but I have no fear\n" +
            "'Cause London is drowning\n" +
            "I, I live by the river\n" +
            "The ice age is coming, the sun's zooming in\n" +
            "Engines stop running, the wheat is growing thin\n" +
            "A nuclear era, but I have no fear\n" +
            "'Cause London is drowning\n" +
            "I, I live by the river\n" +
            "Now get this\n" +
            "London calling, yes, I was there, too\n" +
            "And you know what they said? Well, some of it was true\n" +
            "London calling at the top of the dial\n" +
            "And after all this, won't you give me a smile?\n" +
            "I never felt so much alike, alike, alike, alike", "La letra de \"London Calling\" relata la precaria situación de la banda en ese momento. Es un grito de \"socorro\" a la sociedad londinense y al mundo entero. Por aquel entonces THE CLASH estaban endeudados y sin un manager que le representara."),
    Song("Gimme Shelter", "The Rolling Stones", "Let It Bleed", 1969, R.drawable.the_rolling_stones, "Ooh, a storm is threatening\n" +
            "My very life today\n" +
            "If I don't get some shelter\n" +
            "Ooh yeah I'm gonna fade away\n" +
            "War, children\n" +
            "It's just a shot away\n" +
            "It's just a shot away\n" +
            "War, children\n" +
            "It's just a shot away\n" +
            "It's just a shot away\n" +
            "Ooh, see the fire is sweepin'\n" +
            "Our streets today\n" +
            "Burns like a red coal carpet\n" +
            "Mad bull lost its way\n" +
            "War, children\n" +
            "It's just a shot away\n" +
            "It's just a shot away\n" +
            "War, children\n" +
            "It's just a shot away\n" +
            "It's just a shot away\n" +
            "Rape, murder, it's just a shot away\n" +
            "It's just a shot away\n" +
            "Rape, murder, yeah, it's just a shot away\n" +
            "It's just a shot away\n" +
            "Rape, murder, it's just a shot away\n" +
            "It's just a shot away\n" +
            "Mmm, a flood is threatening\n" +
            "My very life today\n" +
            "Gimme, gimme shelter\n" +
            "Or I'm gonna fade away\n" +
            "War, children\n" +
            "It's just a shot away\n" +
            "It's just a shot away\n" +
            "It's just a shot away\n" +
            "It's just a shot away\n" +
            "It's just a shot away\n" +
            "I tell you love, sister\n" +
            "It's just a kiss away\n" +
            "It's just a kiss away\n" +
            "It's just a kiss away\n" +
            "It's just a kiss away\n" +
            "It's just a kiss away\n" +
            "Kiss away, kiss away")
)


