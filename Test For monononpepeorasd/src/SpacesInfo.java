public class SpacesInfo {


    public String getSpaceName(int num) {
       switch(num){
           case 1:
               return "Alligator";
           case 2:
               return "Bear";
           case 3:
               return "Cat";
           case 4:
               return "Dog";
           case 5:
               return "Elephant";
           case 6:
               return "Fox";
           case 7:
               return "Giraffe";
           case 8:
               return "Horse";
           case 9:
               return "Iguana";
           default:
               return "Major ERROR (skill issue)";
       }
    }

    public String getSpaceFact(int num){
        switch(num){
            case 1:
                return "The Alligator is big";
            case 2:
                return "The Bear is big";
            default:
                return "idfk";
        }
    }

    public int setBasePrice(){
        return 5;
    }
    public int setUpgradePrice(int num){
        int price;
        switch (num){
            case 1:
                price = 10;
                break;
            case 2:
                price = 15;
                break;
            case 3:
                price = 20;
                break;
            case 4:
                price = 40;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }
}
