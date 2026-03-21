# Atividade: Factory Method e Strategy

## Alunos

    Erick Martins Silva
    Gabriel Barretto Galdino dos Santos

## Contexto

    O sistema simula um cenário de batalha medieval no Vale de Arkhon,
    uma região fictícia estratégica disputada por exércitos rivais.
    O jogador assume o papel de comandante de um exército, sendo responsável
    por definir as estratégias utilizadas pelas tropas durante o combate.
    O exército é composto por três tipos de unidades militares: Soldados,
    Arqueiros e Cavalaria. Cada unidade possui características diferentes e
    exerce um papel específico no campo de batalha.
    Os soldados atuam na linha de frente, os arqueiros oferecem suporte à
    distância e a cavalaria realiza ataques rápidos e manobras de flanqueamento.
    Durante a batalha, ocorrerá um evento inesperado, como o surgimento de
    reforços inimigos. Nesses momentos, o jogador pode alterar as estratégias
    das unidades, adaptando o comportamento do exército de acordo com a
    situação do campo de batalha.

## Melhorias

    Para evoluir o jogo no caso de adicionar novas estratégias para as
    unidades, basta criar uma nova classe que implemente a interface
    Strategy e definir o comportamento específico daquela estratégia.

    Para criar uma nova unidade, deve-se criar uma nova classe correspondente
    que implemente a classe abstrata Unidade, junto de sua classe criadora.
