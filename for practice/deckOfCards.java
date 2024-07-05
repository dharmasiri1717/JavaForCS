public class deckOfCards {
    public static void main(String[] args) {
        String rank[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String suit[] = {"♠","♥","♣","♦"};
        String deck[] = new String[52];

        for(int i = 0; i < suit.length; i++){
            for(int j = 0; j < rank.length; j++){
                deck[j + rank.length * i] = suit[i] + rank[j];
            }
        }

        for(String card : deck){
            System.out.printf(card+ " ");
        }
    }
}
