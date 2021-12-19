from random import shuffle



class Card:
    marks = ["♠", "♥", "♦", "♣"]
    numbers = [None, None, "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"]

    def __init__(self, n, m):
        self.number = n
        self.mark = m

    def __repr__(self):
        return f"{self.marks[self.mark]}{self.numbers[self.number]}"
    
    def __lt__(self, other):
        if self.number == other.number:
            return self.mark < other.mark
        return self.number < other.number
    
    def __gt__(self, other):
        if self.number == other.number:
            return self.mark > other.mark
        return self.number > other.number
    
    

class Deck:
    def __init__(self):
        self.cards = list()

        for i in range(2, 15):
            for j in range(4):
                self.cards.append(Card(i, j))
        shuffle(self.cards)
    
    def rm_card(self):
        if self.cards == 0:
            return None
        return self.cards.pop()

class Player:
    def __init__(self, name):
        self.wins = 0
        self.name = name
        self.card = None

class Game:
    def __init__(self):
        player1_name = input("プレイヤー1の名前を入力してください：")
        player2_name = input("プレイヤー2の名前を入力してください(com)：")
        self.deck = Deck()
        self.player1 = Player(player1_name)
        self.player2 = Player(player2_name)
    
    def draw(self, p1c, p2c, this_time_winner):
        card_detail = f"{self.player1.name} のカードは {p1c} です。\n{self.player2.name} のカードは {p2c} です。"
        this_time_winner_msg = f"{this_time_winner}が1勝！"
        print(card_detail)
        print(this_time_winner_msg)
        
    def judge(self, p1c, p2c):
        if p1c > p2c:
            self.player1.wins += 1
            return self.player1.name
        else:
            self.player2.wins += 1
            return self.player2.name
    
    def winner(self):
        print("=====終了=====")
        if self.player1.wins > self.player2.wins:
            msg = f"{self.player1.name}の勝利!"
        elif self.player1.wins < self.player2.wins:
            msg = f"{self.player2.name}の勝利!"
        else:
            msg = "引き分け！"
            return
        print(f"{self.player1.name}：{self.player1.wins}勝\n{self.player2.name}：{self.player2.wins}勝")
        print(msg)
        
    
    def play(self):
        print("=====戦争開始=====")
        cards = self.deck.cards
        num = 1
        while len(cards) > 0:
            print(f"====={num}回目=====")
            p1c = self.deck.rm_card()
            p2c = self.deck.rm_card()
            winner_name = self.judge(p1c, p2c)
            self.draw(p1c, p2c, winner_name)
            command = input("続けるにはEnterを押してください。qで終了。")
            if command == "q":
                break
            num += 1
        self.winner()
        
game = Game()
game.play()