class Car
{
    public void Number()
    {
        System.out.println("The hashcode of car class is:" + this.hashCode());
        System.out.println(this.getClass().getName());
    }

}

class Honda extends Car
{
    public void HondaNumber()
    {
        System.out.println("The hashcode of car class is:: " + super.hashCode() + "The hashcode of Honda car is:: " + this.hashCode());
    }

}


public class ConstructorInherit {

    public static void main(String[] args) {
        System.out.println("Here are the hashcodes/n");
        Honda n1 = new Honda();
        n1.HondaNumber();
    }
}
