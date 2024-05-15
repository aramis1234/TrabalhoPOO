import math

class Shape:
    def __init__(self, name):
        self.name = name
    
    def get_name(self):
        return self.name
    
    def area(self):
        pass
    
    def perimeter(self):
        pass

class Retangulo(Shape):
    def __init__(self, comprimento, largura):
        super().__init__("Retângulo")
        self.comprimento = comprimento
        self.largura = largura
    
    def area(self):
        return self.comprimento * self.largura
    
    def perimeter(self):
        return 2 * (self.comprimento + self.largura)

class Circulo(Shape):
    def __init__(self, raio):
        super().__init__("Círculo")
        self.raio = raio
    
    def area(self):
        return math.pi * self.raio ** 2
    
    def perimeter(self):
        return 2 * math.pi * self.raio

class Losango(Shape):
    def __init__(self, diagonal_maior, diagonal_menor):
        super().__init__("Losango")
        self.diagonal_maior = diagonal_maior
        self.diagonal_menor = diagonal_menor
    
    def area(self):
        return (self.diagonal_maior * self.diagonal_menor) / 2
    
    def perimeter(self):
        return 4 * math.sqrt(((self.diagonal_maior/2) ** 2) + ((self.diagonal_menor/2) ** 2))

class Hexagono(Shape):
    def __init__(self, lado):
        super().__init__("Hexágono")
        self.lado = lado
    
    def area(self):
        return (3 * math.sqrt(3) * self.lado ** 2) / 2
    
    def perimeter(self):
        return 6 * self.lado

class Pentagono(Shape):
    def __init__(self, lado):
        super().__init__("Pentágono")
        self.lado = lado
    
    def area(self):
        return 1/4 * math.sqrt(5 * (5 + 2 * math.sqrt(5))) * self.lado ** 2
    
    def perimeter(self):
        return 5 * self.lado


retangulo = Retangulo(5, 4)
print("Nome:", retangulo.get_name())
print("Área:", retangulo.area())
print("Perímetro:", retangulo.perimeter())

circulo = Circulo(3)
print("\nNome:", circulo.get_name())
print("Área:", circulo.area())
print("Perímetro:", circulo.perimeter())

losango = Losango(6, 4)
print("\nNome:", losango.get_name())
print("Área:", losango.area())
print("Perímetro:", losango.perimeter())

hexagono = Hexagono(4)
print("\nNome:", hexagono.get_name())
print("Área:", hexagono.area())
print("Perímetro:", hexagono.perimeter())

pentagono = Pentagono(5)
print("\nNome:", pentagono.get_name())
print("Área:", pentagono.area())
print("Perímetro:", pentagono.perimeter())
