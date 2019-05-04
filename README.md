# Defeat-the-dragon
Vídeo com o programa executando: https://www.youtube.com/watch?v=l2ixrxKnwlM

Crie um programa simulando uma batalha de RPG: Faça o usuário escolher a classe digitando um número. Deverá aparecer uma mensagem com a classe que ele escolheu, caso ele digite um número inválido, envie uma mensagem de erro.

Classes: 1 – Bárbaro 2 – Guerreiro 3 – Arqueiro 4 - Mago
HP: 3000 HP: 2000 HP: 1500 HP: 1500
Dano: 1000 Dano: 2000 Dano: 2500 Dano: 3000
O dragão deve ter 20000 de vida e 300 de dano.

Ao enfrentar o dragão, primeiramente deverá aparecer o HP atual do usuário, e do Dragão, e então o usuário deverá ter 3 opções.
1 – ATACAR 2 – CURAR-SE 3 – FUGIR.

Atacar: Deverá fazer o cálculo do dano causado ao dragão, e do dano que o dragão causou no usuário. Caso o dano da classe que o usuário escolheu for maior que o HP atual do dragão, o usuário não levará dano (é como se o usuário sempre atacasse primeiro). Curar-se: Vai retornar o HP para o HP original da classe que o usuário escolheu, e ele não levará dano.
Fugir: Vai apenas mostrar uma mensagem ao usuário, e encerrará o programa.

Se o usuário digitar um código inválido, deverá aparecer uma mensagem de erro, e o programa será encerrado.

Se o HP do usuário zerar, deverá aparecer uma mensagem que ele morreu, e o programa vai encerrar.

Quando o dragão for derrotado, deve aparecer à mensagem de vitória, e o programa será encerrado.

Alguns detalhes: Vocês podem usar outros dados para as informações das classes e do dragão. Apenas mantenham a coerência: O Bárbaro deverá ter maior HP e menor dano, o guerreiro deve ser equilibrado, o Arqueiro com Dano alto e HP baixo, o mago com maior dano e menor HP, o dragão não pode ter um dano maior que o HP do mago.
Vocês podem usar as Strings ao invés dos Int se quiserem, mas devem garantir que vão aparecer as mensagem de erro para as opções inválidas, recomendo usarem int e também usarem os dados padrões, também aconselho usarem uma variável pra fazer a função de cura. Deve ser criado um boolean para garantir que o usuário escolheu uma classe válida. E podem usar as mesmas mensagens que usei no programa do vídeo, sem problema, e se usarem suas próprias mensagens, apenas garantam que façam sentido com a proposta dela.
