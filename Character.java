public class Character{


    //attributes

    private int LifePoints;
    private int Energy;
    private int AttackPoints;
    private int BonusPoints;

    public String Name;

    public void setLifePoints(int LifePoints){
            this.LifePoints=LifePoints;


    }

public int getLifePoints(){
    return LifePoints;
}
 
 public void setEnergy(int Energy){
            this.Energy=Energy;


    }

public int getEnergy(){
    return Energy;
}

public void setAttackPoints(int AttackPoints){
            this.AttackPoints=AttackPoints;


    }

public int getAttackPoints(){
    return AttackPoints;
}

public void setBonusPoints(int BonusPoints){
            this.BonusPoints=BonusPoints;


    }

public int getBonusPoints(){
    return BonusPoints;
}

public void setName(String Name){
            this.Name=Name;


    }

public String getName(){
    return Name;
}


public void printCharacter(){
    System.out.println(Name + " \n LifePoints "+ LifePoints + " \n Energy " + Energy + " \n AttackPoints" + AttackPoints);
}

public Character(String name, int LifePoints, int Energy, int AttackPoints, int BonusPoints){
    this.Name=Name;
    this.LifePoints=LifePoints;
    this.Energy=Energy;
    this.AttackPoints=AttackPoints;
    this.BonusPoints=BonusPoints;
}
 
 public void Attack(Character Opponent){
                //int lp;
                //int newlp;
               
            int OpponentLP=Opponent.getEnergy();
            int AttackP=getAttackPoints();

            System.out.println(Name + " is attacking " + Opponent.getName());


            int newEnergy=Opponent.getEnergy()-getAttackPoints();
            Opponent.setEnergy(newEnergy);
            Opponent.printCharacter();

            if(Opponent.getEnergy()<=0){
                //System.out.println(Name + " Defeated " + Opponent.getName());
                
                int newLP=Opponent.getLifePoints()-1;
                Opponent.setLifePoints(newLP);
                Opponent.setEnergy(100);
                Opponent.printCharacter();

             if(Opponent.getLifePoints()<=0)   
             System.out.println("-------GAME OVER-------");


            

            }

    //if(opponent.getlifePoints()<=0)   System.out.println ( “-------GAME OVER-------”)
            
            //System.out.println(newEnergy);


            }


}