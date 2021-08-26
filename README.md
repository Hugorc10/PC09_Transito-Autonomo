# Transito-autonomo
Trabalho de programação concorrente da Universidade Estadual do Sudoeste da Bahia (UESB)

A condição de corrida de Rick e Morty é um problema de sincronização e comunicação entre processos.
Simula um trânsito de carros (ou pessoas, como é o caso do meu programa) que não pode colidir.
As áreas em que os carros podem colidir são as seções críticas (partes do código em que dois processos disputam o acesso a um recurso compartilhado).
O objetivo do programa é simular esse trânsito evitando que os carros batam, usando a variável semáforo especial criada por Dijlkstra.

Rick and Morty Race Condition is inter-process communication and synchronization problem. 
It simulates a traffic of cars (or people, as is the case of my program) that can not collide.
The areas that cars may collide are critical section (parts of the code where two processes dispute access to a shared resource).
The purpose of the program is to simulate this transit avoiding that the cars chop, using the special semaphore variable created by Dijlkstra.

![Imagem dos percusos](https://i.imgur.com/6OfBDgD.jpg)
