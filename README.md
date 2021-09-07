**«Игры разума»** — набор из пяти консольных игр, построенных по принципу популярных мобильных приложений для прокачки мозга. Каждая игра задает вопросы, на которые нужно дать правильные ответы. После трех правильных ответов считается, что игра пройдена. Неправильные ответы завершают игру и предлагают пройти ее заново. Игры:

**- Even:** поиск пропущенных чисел в последовательности чисел.
**- Calc:** арифметические выражения, которые необходимо вычислить.
**- Progression:** определение четного числа.
**- GCD:** определение наибольшего общего делителя.
**- Prime:** определение простого числа.

## Установка (Gradle 7.1.1, Java 11+)
1. Используйте команду `make build` для сборки проекта.
2. Используйте команду `make run-dist` для запуска игры.

_Пример игры:_

```bash
$ brain-progression
Welcome to the Brain Game!
What number is missing in this progression?
May I have your name? Nikita
Hello, Nikita!
Question: 14 .. 18 20 22 24 26 28
Your answer: 16 # Пользователь вводит ответ
Correct!
Question: 5 6 7 8 9 .. 11 12
Your answer: 10 # Пользователь вводит ответ
Correct!
Question: 12 15 18 21 .. 27 30 33
Your answer: 24 # Пользователь вводит ответ
Correct!
Congratulations, NIkita!
```
### Hexlet tests and linter status:
[![Actions Status](https://github.com/AidanKlark/java-project-lvl1/workflows/hexlet-check/badge.svg)](https://github.com/AidanKlark/java-project-lvl1/actions)

<a href="https://codeclimate.com/github/codeclimate/codeclimate/maintainability"><img src="https://api.codeclimate.com/v1/badges/a99a88d28ad37a79dbf6/maintainability" /></a>

![Java CI](https://github.com/AidanKlark/java-project-lvl1/actions/workflows/main.yml/badge.svg)