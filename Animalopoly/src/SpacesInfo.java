public class SpacesInfo {


    public String getSpaceName(int num) {
       switch(num){
           case 0:
               return "Start";
           case 1:
               return "American Alligator";
           case 2:
               return "Brown Bear";
           case 3:
               return "Capybara";
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
           case 10:
               return "Jaguar";
           case 11:
               return "Lion";
           case 12:
               return "Skip turn";
           case 13:
               return "Narwhal";
           case 14:
               return "Octopus";
           case 15:
               return "Penguin";
           case 16:
               return "Quokka";
           case 17:
               return "Rabbit";
           case 18:
               return "Snake";
           case 19:
               return "Tiger";
           case 20:
               return "ULTIMATE SHREW";
           case 21:
               return "Vulture";
           case 22:
               return "Walrus";
           case 23:
               return "Human";
           case 24:
               return "Yak";
           case 25:
               return "Zebra";
           default:
               return "Major ERROR (skill issue)";
       }
    }

    public String getSpaceFact(int num){
        switch(num){
            case 0:
                return "The start space, if you land on this space, gain £1000.";
            case 1:
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
            case 2:
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
            case 3:
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
            case 4:
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
            case 10:
                return "Jaguar";
            case 11:
                return "Lion";
            case 12:
                return "Skip your next turn";
            case 13:
                return "Narwhal";
            case 14:
                return "Octopus";
            case 15:
                return "Penguin";
            case 16:
                return "Quokka";
            case 17:
                return "Rabbit";
            case 18:
                return "Snake";
            case 19:
                return "Tiger";
            case 20:
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
            case 21:
                return "Vulture";
            case 22:
                return "Walrus";
            case 23:
                return "Human";
            case 24:
                return "Yak";
            case 25:
                return "Zebra";
            default:
                return "Major (fact) ERROR (skill issue)";
        }
    }
    public int setBasePrice()
    {
        return 500;
    }
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
