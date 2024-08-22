# Flores de Samambaia

## Introdução

A flor de samambaia (Fern Flower) é um elemento da mitologia eslava, associada a poderes mágicos e proteção. Este projeto simula a busca por essa flor mágica, onde um caçador tenta desenhar um círculo em torno dela. O sucesso ou fracasso do caçador é determinado com base nas dimensões e posições dos círculos representando o caçador e a flor.

## Desafio

O objetivo deste projeto é determinar se um caçador de flores de samambaia consegue colher a flor ou se falha e acaba morrendo. Isso é feito com base em dois círculos:

- **Círculo do Caçador:** Representa o círculo que o caçador desenhou.
- **Círculo da Flor:** Representa a área da flor.

### Entrada

A entrada consiste em seis inteiros:

- `R1` (Raio do círculo do caçador, onde R1 ≥ 1)
- `X1` (Coordenada X do centro do círculo do caçador)
- `Y1` (Coordenada Y do centro do círculo do caçador)
- `R2` (Raio do círculo da flor, onde R2 ≤ 1000)
- `X2` (Coordenada X do centro do círculo da flor)
- `Y2` (Coordenada Y do centro do círculo da flor)

### Saída

O programa retorna uma única linha contendo:

- **"MORTO"** se o caçador falha em colher a flor.
- **"RICO"** se o caçador consegue colher a flor.

## Lógica do Código

O código calcula a distância entre os centros dos dois círculos e verifica se o círculo do caçador cobre completamente o círculo da flor. Se a soma da distância e do raio da flor for menor ou igual ao raio do caçador, o caçador consegue colher a flor.

## Implementação

O código está implementado na classe `FlorSamambaia`. O método principal (`main`) solicita a entrada do usuário e chama o método `tentativaDesenhar` para determinar o resultado.
tado na classe FlorSamambaia. O método principal (main) solicita a entrada do usuário e chama o método tentativaDesenhar para determinar o resultado.
