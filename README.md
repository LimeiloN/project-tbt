# project-rpg
Un petit tactical rpg dans la console.

#### Inspirations
Librement inspiré de :
- Xcom
- Dofus
- Age of Empires (NDS)

### Livrables et évaluation
Les livrables attendus du projet sont :
1. Un cahier des charges de votre programme, explicitant votre choix de projet, votre organisation en équipe (qui fait quoi, quand ?) et le comportement attendu de votre programme. Ce livrable est attendu pour la fin de la première séance (deux pages maximum).
2. Le programme dans sa version finale, attendu pour la dernière séance. Une attention particulière sera portée aux points suivants :
   - Le programme se compile et s’exécute de manière normale,
   - Le programme réalise les fonctions décrites par le cahier des charges
   - Le code source du programme est lisible, respecte les conventions de codage et est commenté.
3. Le diagramme UML de votre projet, attendu pour la dernière séance.

Une soutenance sera organisée lors de la dernière séance du semestre, où vous présenterez tous vos livrables et plus particulièrement votre programme. Cette soutenance durera 15 minutes, avec 8 minutes de présentation et 6 minutes de questions de la part de votre enseignant. Tous les livrables devront être envoyés par mail à votre enseignant, préalablement à cette soutenance. Le mini-projet sera évalué sur la base de la qualité des livrables, la complexité du projet, votre soutenance et le comportement de l’équipe durant les séances.

### Cahier des charges
Un cahier des charges de votre programme, explicitant votre choix de projet, votre organisation en équipe (qui fait quoi, quand ?) et le comportement attendu de votre programme. Ce livrable est attendu pour la fin de la première séance (deux pages maximum). **Faudra l'écrire pour mercredi**

### Cadre du projet
Nous avons choisi le 5ème problème, le jeu de plateau, où l'objectif 
est de simuler un combat entre deux entités.

La rédaction du cahier des charges, la planification du développement 
et le développent lui-même s'étaleront sur une période d'un mois, 
du 13 Avril au 13 Mai 2019, date de rendu.

---

## Principe du jeu
Le jeu proposé s'appuie sur des mécaniques tirées de Tactical-RPG et 
de combats au tour-par-tour.

Sur une grande grille, chaque joueur contrôle le déplacement de ses 
personnages: à chaque tour, un joueur prend le contrôle de l'un de ses 
personnages (dans un ordre choisi avant la partie), 
et réalise l'une des actions suivantes:

- Se déplacer
- Se déplacer et attaquer un personnage adverse
- Se protéger

Lorsqu'un combat est enclenché, un deuxième aspect du jeu 
apparaît: le mode duel. Les deux participants au duel s'engagent 
dans un combat qui ne peut avoir que deux issues: la défaite ou la 
retraite d'un des deux personnages.

Gagne le joueur qui parvient à vaincre en premier tous les 
personnages contrôlés par son adversaire.

La carte du jeu sera choisie au préalable parmi celles prédéfinies.
Le joueur aura aussi la possibilité de ramasser des items au sol afin
de lui donner un avantage.

Un mode Joueur vs IA est envisagé.

---

### Organisation du code
La classe principale est `lorganisation.projectrpg.Game`. 
`lorganisation.projectrpg.map.LevelMap` représente une carte du jeu.
Tout le rendu visuel est effectué dans `lorganisation.projectrpg.TerminalGameRenderer`.
Le diagramme UML donne toutes les informations quand aux relations 
entre les classes.

### Détails techniques
Nous nous limiterons à l'interface de commande.

Nous utiliserons la bibliothèque [JLine3](https://github.com/jline/jline3)
qui, sans rentrer dans les détails, nous permettra de gérer la console
dans les détails, comme la couleur ou la position du curseur.

Nous utiliserons aussi la bibliothèque [Gson](https://github.com/google/gson)
afin de faciliter la lecture des fichiers JSON utilisés pour la
configuration.

---

### Compilation
Ce projet utilise [Gradle](https://gradle.org/ "Site web de Gradle") 
pour gérer toutes les tâches relatives à la compilation et aux librairies. 
Par conséquent, il est nécessaire d'avoir la dernière version de gradle 
installée ou d'utiliser le gradle wrapper fourni.

Test du jeu :
```bash
$ gradlew play
```

Création du jar exécutable du jeu et des scripts de lancement :
```bash
$ gradlew shadowJar copyScripts
```

### Note sur la compatibilité
Sera compatible tout système supporté par JLine3, ce qui inclus :
 - Windows
 - Linux
 - OS X
 - Solaris
 - FreeBSD

D'une manière générale, tout système doté d'une console supportant les 
caractères de contrôle ANSI (VT100) est compatible.
