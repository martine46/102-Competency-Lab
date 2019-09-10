public class Game {

        public static void main(String args[])

        {
            System.out.println("********** Welcome to my Video Game Mario Bros. **********");

            Character mario = new Character("Mario (M)", 3 , 100 , 25, 5);
            Character toad = new Character("Toad (T)" , 3 , 100 , 50, 4);

            //mario.setName("Mario  (M)");
            //mario.setAttackPoints(25);
            //mario.setEnergy(100);
            //mario.setBonusPoints(5);
            //mario.setLifePoints(3);

           //System.out.println ( mario.getName());
           //System.out.println ( mario.getAttackPoints());
           //System.out.println ( mario.getEnergy());
           //System.out.println ( mario.getBonusPoints());
           //System.out.println ( mario.getLifePoints());

         mario.printCharacter();
         toad.printCharacter();

            mario.Attack(toad);
            toad.Attack(mario);
            toad.Attack(mario);
            toad.Attack(mario);

            toad.Attack(mario);
            toad.Attack(mario);
            toad.Attack(mario);

            toad.Attack(mario);
            




        }

           
}