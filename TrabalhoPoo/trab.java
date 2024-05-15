class Funcionario:
    def __init__(self, nome, valor_hora, horas_trabalhadas, cargo):
        self.nome = nome
        self.valor_hora = valor_hora
        self.horas_trabalhadas = horas_trabalhadas
        self.cargo = cargo

    def calcular_salario(self):
        salario_base = self.valor_hora * self.horas_trabalhadas
        if self.cargo == "Líder":
            salario_base *= 1.02
        elif self.cargo == "Gerente":
            salario_base *= 1.05
        return salario_base

funcionario1 = Funcionario("João", 20, 160, "Líder")
print(f"O salário de {funcionario1.nome} é R${funcionario1.calcular_salario():.2f}")

funcionario2 = Funcionario("Maria", 25, 160, "Gerente")
print(f"O salário de {funcionario2.nome} é R${funcionario2.calcular_salario():.2f}")
