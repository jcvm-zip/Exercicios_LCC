import random

def gerar_numero_aleatorio(inicio, fim):
    return random.randint(inicio, fim)

def main():
    inicio_intervalo = 1
    fim_intervalo = 100
    numero_secreto = gerar_numero_aleatorio(inicio_intervalo, fim_intervalo)
    tentativas = []

    print("Bem-vindo ao Jogo de Adivinhação Numérica!")
    print(f"Tente adivinhar o número entre {inicio_intervalo} e {fim_intervalo}.")

    while True:
        palpite = int(input("Digite seu palpite: "))
        tentativas.append(palpite)

        if palpite == numero_secreto:
            print(f"Parabéns! Você adivinhou o número em {len(tentativas)} tentativas.")
            break
        elif palpite < numero_secreto:
            print("Seu palpite é muito baixo. Tente novamente.")
        else:
            print("Seu palpite é muito alto. Tente novamente.")

        opcao = input("Deseja encerrar o jogo? (s/n): ").lower()
        if opcao == "s":
            print(f"O número correto era {numero_secreto}.")
            print("Tentativas:")
            for i, tentativa in enumerate(tentativas):
                print(f"Tentativa {i + 1}: {tentativa}")
            break

if __name__ == "__main__":
    main()
