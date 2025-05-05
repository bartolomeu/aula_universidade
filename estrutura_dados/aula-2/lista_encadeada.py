class PlayList:
    head:'Faixa'

    def __init__(self, faixa:'Faixa'):
        self.head = faixa    
    
    def adcionar(self, faixa:'Faixa', noInicio=True):
        if(self.head == None):
            self.head = faixa
        if(noInicio):
            old = self.head
            self.head = faixa
            self.head.proximo = old
        else:
            ultimo = self.head
            while ultimo.proximo != None:
                ultimo = ultimo.proximo
            ultimo.proximo = faixa

    def remover(self, id:int):
        achou = self.buscar(id)
        if( achou != None):
            anterior = achou.anterior
            proximo = achou.proximo
            anterior.proximo = proximo

    def buscar(self, id:int):
        if(self.head != None):
            item = self.head
            while item.id != id:
                item = item.proximo
            if(item.id == id):
                return item


class Faixa:
    proximo: 'Faixa'
    anterior: 'Faixa'

    def __init__(self, id:int, titulo:str):
        self.id = id
        self.titulo = titulo
    
if __name__ == "__main__":
    faixa1 = Faixa(1, "Victory Leap")
    faixa2 = Faixa(2, "Killing in the Name")
    faixa3 = Faixa(3, "Hidropônica")
    faixa4 = Faixa(4, "Que pais é esse")

    playlist = PlayList(faixa1)
    playlist.adcionar(faixa2)
    playlist.adcionar(faixa3, False)
    playlist.adcionar(faixa4, False)

    print(playlist.head.titulo)  # Victory Leap
    print(playlist.head.proximo.titulo)  # Killing in the Name
    print(playlist.head.proximo.proximo.titulo)  # Hidropônica
    print(playlist.head.proximo.proximo.proximo.titulo)  # Que pais é esse