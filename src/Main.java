public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();

        point1.x = 12;
        point1.y = 3;
        point1.sym = '*';

        point2.x = 12;
        point2.y = 4;
        point2.sym ='#';

        Main main = new Main();
        System.out.print(main.printPosition(point1.x, point1.y, point1.sym));
        System.out.println(main.printPosition(point2.x, point2.y - point1.y, point2.sym));

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
