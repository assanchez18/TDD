# TDD
TDD exercise for XP module
La rama para la corrección de la práctica es la denominada "Before_point"

Sé que en clase estuvimos hablando sobre las herencias y las cases FromPoint y UntilPoint, pero he llegado a esta solución aplicando TDD. No creo que sea necesario hacer una herencia de la clase Point ya que no es necesario para poder calcular cualquier tipo de intervalo. De hecho, la clase Point queda como una clase de datos, pero quizás queda más legible así, ya que de otro modo habría que pasar por parámetro en el constructor dos booleanos para determinar de qué tipo (abierto o cerrado) es cada extremo del intervalo.
Añadí un Enumerado con el tipo de de cada extremo del enumerado para intentar darle mayor legilibilidad.

No he implementado las pruebas de los infinitos ni los cortes entr intervalos abiertos y los mixtos ya que la lógica ya está cubierta por el resto de las pruebas.

A pesar de lo que hemos hablado en clase, no veo que haya tanta casuística en la comprobación de intervalos ya que en los casos no triviaales, donde la intersección se produce en las fronteras opuestas de dos intervalos solo hay dos posibilidades, ambos son cerrados, entonces hay intersección y en cualquier otro caso, nunca habrá intersección.
Por ejemplo:
Intervalo A (0,5)
Intervalo B (5,10)  nunca cortarán salvo que el extremo superior de A sea cerrado de modo (0,5] y el extremo inferior de B sea también cerrado [5,10)

