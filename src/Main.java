public class Main {
    public static void main(String[] args) {
        int x1 = 12;
        int y1 = 3;
        char sym1 = '*';

        int x2 = 12;
        int y2 = 4;
        char sym2 ='#';

        Main main = new Main();
        System.out.print(main.printPosition(x1,y1,sym1));
        System.out.println(main.printPosition(x2,y2-y1,sym2));

















    }
    public String printPosition(int x,int y, char sym){

        StringBuilder positionBuilder = new StringBuilder();
        for (int i = 0; i < y; i++) {
            positionBuilder.append("\n");
        }
        StringBuilder positionBuilder1 = new StringBuilder(positionBuilder.toString());
        for (int i = 0; i < x; i++) {
            positionBuilder1.append(" ");
        }
        String position = positionBuilder1.toString();
        position+=sym;
        return position;
    }
}
