public class SpacesInfo {


    public String getSpaceName(int num) {
       switch(num){
           case 1:
               return "Start";
           case 2:
               return "American Alligator";
           case 3:
               return "Brown Bear";
           case 4:
               return "Capybara";
           case 5:
               return "Dog";
           case 6:
               return "Elephant";
           case 7:
               return "Fox";
           case 8:
               return "Giraffe";
           case 9:
               return "Horse";
           case 10:
               return "Iguana";
           case 11:
               return "Jaguar";
           case 12:
               return "Lion";
           case 13:
               return "Skip turn";
           case 14:
               return "Narwhal";
           case 15:
               return "Octopus";
           case 16:
               return "Penguin";
           case 17:
               return "Quokka";
           case 18:
               return "Rabbit";
           case 19:
               return "Snake";
           case 20:
               return "Tiger";
           case 21:
               return "ULTIMATE SHREW";
           case 22:
               return "Vulture";
           case 23:
               return "Walrus";
           case 24:
               return "Human";
           case 25:
               return "Yak";
           case 26:
               return "Zebra";
           default:
               return "Major ERROR (skill issue)";
       }
    }

    public String getSpaceFact(int num){
        switch(num){
            case 1:
                return "The start space, if you land on this space, gain £1000.";
            case 2:
                return "Latin: Alligator mississippiensis\n" +
                        "\n" +
                        "What? An American alligator.\n" +
                        "\n" +
                        "Where? American alligators are found in the southeast United States: all of Florida and Louisiana; the southern parts of Georgia, Alabama, and Mississippi; coastal South and North Carolina; East Texas, the southeast corner of Oklahoma, and the southern tip of Arkansas.\n" +
                        "\n" +
                        "How big? An average adult American alligator's weight and length is 360 kg (790 lb) and 4 m (13 ft).\n" +
                        "\n" +
                        "Endangered? Not at all.\n" +
                        "\n";
            case 3:
                return "Latin: Ursus arctos\n" +
                        "\n" +
                        "What? A large bear species\n" +
                        "\n" +
                        "Where? Across Eurasia and North America. It is mostly found in forested habitats, and can be found in elevations of 5,000 m (16,000 ft).\n" +
                        "\n" +
                        "How big? Adults of different subspecies range in weight from 80 to 600 kg (180 to 1,320 lb), with males being heavier than females.\n" +
                        "\n" +
                        "Endangered? Not at all.\n" +
                        "\n";
            case 4:
                return "Latin: Hydrochoerus hydrochaeris\n" +
                        "\n" +
                        "What? The largest living rodent in the world.\n" +
                        "\n" +
                        "Where? Capybaras are semiaquatic mammals[15] found throughout all countries of South America except Chile.[19] They live in densely forested areas near bodies of water, such as lakes, rivers, swamps, ponds, and marshes,[14] as well as flooded savannah and along rivers in the tropical rainforest.\n" +
                        "\n" +
                        "How big? Adult capybaras grow to 106 to 134 cm (3.48 to 4.40 ft) in length, stand 50 to 62 cm (20 to 24 in) tall at the withers, and typically weigh 35 to 66 kg (77 to 146 lb), with males being heavier than females.\n" +
                        "\n" +
                        "Endangered? Not at all.\n" +
                        "\n";
            case 5:
                return "Latin: Canis familiaris\n" +
                        "\n" +
                        "What? A domesticated descendant of the wolf. Also called the domestic dog.\n" +
                        "\n" +
                        "Where? EVERYWHERE.\n" +
                        "\n" +
                        "How big? Adult capybaras grow to 106 to 134 cm (3.48 to 4.40 ft) in length, stand 50 to 62 cm (20 to 24 in) tall at the withers, and typically weigh 35 to 66 kg (77 to 146 lb), with males being heavier than females.\n" +
                        "\n" +
                        "Endangered? Not at all.\n" +
                        "\n";
            case 6:
                return "Elephant";
            case 7:
                return "Fox";
            case 8:
                return "Giraffe";
            case 9:
                return "Horse";
            case 10:
                return "Iguana";
            case 11:
                return "Jaguar";
            case 12:
                return "Lion";
            case 13:
                return "Skip your next turn";
            case 14:
                return "Narwhal";
            case 15:
                return "Octopus";
            case 16:
                return "Penguin";
            case 17:
                return "Quokka";
            case 18:
                return "Rabbit";
            case 19:
                return "Snake";
            case 20:
                return "Tiger";
            case 21:
                return "Latin: Crocidura ultima\n" +
                        "\n" +
                        "What? An African shrew with a badass name\n" +
                        "\n" +
                        "Where? Kenya, in the Jombeni region, Nyeri.\n" +
                        "\n" +
                        "How big? Head and body 90 mm / 3.5 “, tail 60 mm / 2.3 ” long\n" +
                        "\n" +
                        "Endangered? It was previously listed as Critically Endangered, but now Data Deficient.\n" +
                        "\n";
            case 22:
                return "Vulture";
            case 23:
                return "Walrus";
            case 24:
                return "Human";
            case 25:
                return "Yak";
            case 26:
                return "Zebra";
            default:
                return "Major (fact) ERROR (skill issue)";
        }
    }
    public int setBasePrice(){return 1000;}
    public int setUpgradePrice(int num){
        int price;
        switch (num){
            case 0:
                price = 10;
                break;
            case 1:
                price = 50;
                break;
            case 2:
                price = 100;
                break;
            case 3:
                price = 500;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }
}
