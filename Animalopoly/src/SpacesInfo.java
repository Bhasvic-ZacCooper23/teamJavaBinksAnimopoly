public class SpacesInfo {

    // this (class?) is kinda like a warehouse that stores all the information about the spaces in one place, because I didn't want it in the space class.
    public String getSpaceName(int num) {
        // All names of the spaces. default being an error message.
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
               return "Narwhal";
           case 13:
               return "Skip turn";
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
        // All the fun facts about the spaces. (just copied and pasted from wikipedia). default being an error message.
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
                return "Latin: Elephas maximus\n" +
                        "\n" +
                        "What? Elephants are the largest living land animals with hella big noses.\n" +
                        "\n" +
                        "Where? Elephants are scattered throughout sub-Saharan Africa, South Asia, and Southeast Asia.\n" +
                        "\n" +
                        "How big? Male: 261–289 cm (8 ft 7 in – 9 ft 6 in) (shoulder height), 3.5–4.6 t (3.9–5.1 short tons) (weight); Female: 228–252 cm (7 ft 6 in – 8 ft 3 in) (shoulder height), 2.3–3.1 t (2.5–3.4 short tons) (weight).\n" +
                        "\n" +
                        "Endangered? Very, fewer than 52,000 are left in the wild.\n" +
                        "\n";
            case 6:
                return "Latin: Vulpes vulpes\n" +
                        "\n" +
                        "What? Foxes are small to medium-sized, omnivorous mammals belonging to several genera of the family Canidae.  The most common and widespread species of fox is the red fox (Vulpes vulpes) with about 47 recognized subspecies.\n" +
                        "\n" +
                        "Where? Foxes live on every continent except Antarctica.\n" +
                        "\n" +
                        "How big? males weigh on average between 4.1 and 8.7 kilograms (9 and 19+1⁄4 pounds),[7] while the smallest species, the fennec fox, weighs just 0.7 to 1.6 kg (1+1⁄2 to 3+1⁄2 lb).\n" +
                        "\n" +
                        "Endangered? Not at all.\n" +
                        "\n";
            case 7:
                return "Latin: Giraffa camelopardalis\n" +
                        "\n" +
                        "What? The giraffe is a large (very tall) African hoofed mammal belonging to the genus Giraffa.\n" +
                        "\n" +
                        "Where? Its scattered range extends from Chad in the north to South Africa in the south, and from Niger in the west to Somalia in the east.\n" +
                        "\n" +
                        "How big? Fully grown giraffes stand 4.3–5.7 m (14–19 ft) tall, with males taller than females.[47] The average weight is 1,192 kg (2,628 lb) for an adult male and 828 kg (1,825 lb) for an adult female.\n" +
                        "\n" +
                        "Endangered? Two subspecies are classified as endangered.\n" +
                        "\n";
            case 8:
                return "Latin: Equus caballus\n" +
                        "\n" +
                        "What? The horse is a domesticated, one-toed, hoofed mammal.\n" +
                        "\n" +
                        "Where? EVERYWHERE.\n" +
                        "\n" +
                        "How big? The size of horses varies by breed, but also is influenced by nutrition. Light-riding horses usually range in height from 14 to 16 hands (56 to 64 inches, 142 to 163 cm) and can weigh from 380 to 550 kilograms (840 to 1,210 lb).[25] Larger-riding horses usually start at about 15.2 hands (62 inches, 157 cm) and often are as tall as 17 hands (68 inches, 173 cm), weighing from 500 to 600 kilograms (1,100 to 1,320 lb).[26] Heavy or draft horses are usually at least 16 hands (64 inches, 163 cm) high and can be as tall as 18 hands (72 inches, 183 cm) high. They can weigh from about 700 to 1,000 kilograms (1,540 to 2,200 lb)\n" +
                        "\n" +
                        "Endangered? Not at all.\n" +
                        "\n";
            case 9:
                return "Latin: Iguana iguana\n" +
                        "\n" +
                        "What? Iguana is a genus of herbivorous lizards.\n" +
                        "\n" +
                        "Where? Iguanas are native to tropical areas of Mexico, Central America, South America, and the Caribbean.\n" +
                        "\n" +
                        "How big? Iguanas are large lizards that can range from 1.2 to 2.0 m (4 to 6.5 ft) in length, including their tails.\n" +
                        "\n" +
                        "Endangered? Iguanas are among the world's most endangered animals.\n" +
                        "\n";
            case 10:
                return "Latin: Panthera onca\n" +
                        "\n" +
                        "What? The jaguar is a large cat species of the genus Panthera.\n" +
                        "\n" +
                        "Where? The jaguar is native to the Americas.\n" +
                        "\n" +
                        "How big? Jaguars can have a body length of up to 1.85 m (6 ft 1 in) and a weight of up to 158 kg (348 lb).\n" +
                        "\n" +
                        "Endangered? Near threatened\n" +
                        "\n";
            case 11:
                return "Latin: Panthera leo\n" +
                        "\n" +
                        "What? The lion is a large cat of the genus Panthera.\n" +
                        "\n" +
                        "Where? The lion is native to Africa and India.\n" +
                        "\n" +
                        "How big? Head-and-body length 184–208 cm (72–82 in) Tail length 82.5–93.5 cm (32.5–36.8 in) Weight 186.55–225 kg (411.3–496.0 lb) in Southern Africa 174.9 kg (386 lb) in East Africa, 160–190 kg (350–420 lb) in India\n" +
                        "\n" +
                        "Endangered? Vulnerable\n" +
                        "\n";
            case 12:
                return "Latin: Monodon monoceros\n" +
                        "\n" +
                        "What? The narwhal, is a species of toothed whale.\n" +
                        "\n" +
                        "Where? It is mostly found in Arctic waters.\n" +
                        "\n" +
                        "How big?  An adult narwhal is typically 3.5 to 5.5 m (11 to 18 ft) in length and 800 to 1,600 kg (1,800 to 3,500 lb) in weight.\n" +
                        "\n" +
                        "Endangered? No.\n" +
                        "\n";
            case 13:
                return "Skip your next turn.";
            case 14:
                return "Latin: Enteroctopus dofleini\n" +
                        "\n" +
                        "What? An octopus is a soft-bodied, eight-limbed mollusc.\n" +
                        "\n" +
                        "Where? Octopuses inhabit various regions of the ocean, including coral reefs, pelagic waters, and the seabed; some live in the intertidal zone and others at abyssal depths.\n" +
                        "\n" +
                        "How big? Adults usually weigh around 15 kg (33 lb), with an arm span of up to 4.3 m (14 ft).[19] The largest specimen of this species to be scientifically documented was an animal with a live mass of 71 kg (157 lb).\n" +
                        "\n" +
                        "Endangered? No.\n" +
                        "\n";
            case 15:
                return "Latin: Aptenodytes forsteri\n" +
                        "\n" +
                        "What? Penguins are a group of aquatic flightless birds.\n" +
                        "\n" +
                        "Where?  They live almost exclusively in the Southern Hemisphere: only one species, the Galápagos penguin, is found north of the Equator.\n" +
                        "\n" +
                        "How big? on average, adults are about 1.1 m (3 ft 7 in) tall and weigh 35 kg (77 lb).\n" +
                        "\n" +
                        "Endangered? Near threatened\n" +
                        "\n";
            case 16:
                return "Latin: Setonix brachyurus\n" +
                        "\n" +
                        "What? The quokka is a small macropod about the size of a domestic cat.\n" +
                        "\n" +
                        "Where? The quokka's range is a small area of southwestern Australia. They inhabit some smaller islands off the coast of Western Australia.\n" +
                        "\n" +
                        "How big? A quokka weighs 2.5 to 5.0 kg (5.5 to 11 lb) and is 40 to 54 cm (16 to 21 in) long with a 25-to-30 cm-long (9.8-to-12 in) tail.\n" +
                        "\n" +
                        "Endangered? Vulnerable.\n" +
                        "\n";
            case 17:
                return "Latin: Oryctolagus cuniculus\n" +
                        "\n" +
                        "What? Rabbits, also known as bunnies or bunny rabbits, are small mammals in the family Leporidae.\n" +
                        "\n" +
                        "Where? Rabbit habitats include meadows, woods, forests, grasslands, deserts and wetlands. The best known species, the European rabbit, lives in burrows, or rabbit holes. A group of burrows is called a warren.\n" +
                        "\n" +
                        "How big? An adult European rabbit can measure 40 cm (16 in) in length, and weigh 1,200–2,000 g (2.6–4.4 lb). The hind foot measures 8.5–10 cm (3.3–3.9 in) in length, while the ears are 6.5–7.5 cm (2.6–3.0 in).\n" +
                        "\n" +
                        "Endangered? Near Threatened.\n" +
                        "\n";
            case 18:
                return "Latin: Boa constrictor\n" +
                        "\n" +
                        "What? Snakes are elongated, limbless, carnivorous reptiles of the suborder Serpentes.\n" +
                        "\n" +
                        "Where? The Boa constrictor is native to tropical South America.\n" +
                        "\n" +
                        "How big? Clear sexual dimorphism is seen in the species, with females generally being larger in both length and girth than males. The usual size of mature female boas is between 7 and 10 ft (2.1 and 3.0 m) whereas males are between 6 and 8 ft (1.8 and 2.4 m).\n" +
                        "\n" +
                        "Endangered? No.\n" +
                        "\n";
            case 19:
                return "Latin: Panthera tigris\n" +
                        "\n" +
                        "What? The tiger is the largest living cat species and a member of the genus Panthera.\n" +
                        "\n" +
                        "Where? What remains of the range where tigers still roam free is fragmented, stretching in spots from Siberian temperate forests to subtropical and tropical forests on the Indian subcontinent, Indochina and a single Indonesian island, Sumatra.\n" +
                        "\n" +
                        "How big? Tigers average a total length of 3 m (9.8 ft), with males weighing 200–260 kg (440–570 lb) and females weighing 100–160 kg (220–350 lb).\n" +
                        "\n" +
                        "Endangered? Endangered.\n" +
                        "\n";
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
                return "Latin: Coragyps atratus\n" +
                        "\n" +
                        "What? The black vulture, also known as the American black vulture, is a bird of prey that scavenges on carrion.\n" +
                        "\n" +
                        "Where? Its range extends from the southeastern United States to Perú, Central Chile and Uruguay in South America.\n" +
                        "\n" +
                        "How big? Measuring 56–74 cm (22–29 in) in length, with a 1.33–1.67 m (52–66 in) wingspan. Weight ranges from 1.6 to 3 kg (3.5 to 6.6 lb)\n" +
                        "\n" +
                        "Endangered? Population declining\n" +
                        "\n";
            case 22:
                return "Latin: Odobenus rosmarus\n" +
                        "\n" +
                        "What? The walrus is a large pinniped marine mammal" +
                        "\n" +
                        "Where? discontinuous distribution about the North Pole in the Arctic Ocean and subarctic seas of the Northern Hemisphere.\n" +
                        "\n" +
                        "How big? While some outsized Pacific males can weigh as much as 2,000 kg (4,400 lb), most weigh between 800 and 1,700 kg (1,800 and 3,700 lb).  Length typically ranges from 2.2 to 3.6 m (7 ft 3 in to 11 ft 10 in).\n" +
                        "\n" +
                        "Endangered? Data deficient.\n" +
                        "\n";
            case 23:
                return "Latin: Homo sapiens\n" +
                        "\n" +
                        "What? Humans or modern humans are the most common and widespread species of primate, and the last surviving species of the genus Homo.\n" +
                        "\n" +
                        "Where? EVERYWHERE.\n" +
                        "\n" +
                        "How big? It is estimated that the worldwide average height for an adult human male is about 171 cm (5 ft 7 in), while the worldwide average height for adult human females is about 159 cm (5 ft 3 in). The average mass of an adult human is 59 kg (130 lb) for females and 77 kg (170 lb) for males.\n" +
                        "\n" +
                        "Endangered? The complete opposite, there are too many.\n" +
                        "\n";
            case 24:
                return "Latin: Bos grunniens\n" +
                        "\n" +
                        "What? The yak is a species of long-haired domesticated cattle.\n" +
                        "\n" +
                        "Where? Found throughout the Himalayan region of South Asia, the Tibetan Plateau, Gilgit-Baltistan (Kashmir), Tajikistan and as far north as Mongolia and Siberia.\n" +
                        "\n" +
                        "How big? Males weigh 350 to 585 kg (772 to 1,290 lb), females weigh 225 to 255 kg (496 to 562 lb). males are 111–138 centimetres (44–54 in) high at the withers, while females are 105–117 centimetres (41–46 in) high at the withers.\n" +
                        "\n" +
                        "Endangered? Vulnerable\n" +
                        "\n";
            case 25:
                return "Latin: Equus grevyi\n" +
                        "\n" +
                        "What? Zebras are African equines with distinctive black-and-white striped coats.\n" +
                        "\n" +
                        "Where? Eastern Africa including the Horn; arid and semiarid grasslands and shrublands.\n" +
                        "\n" +
                        "How big? Body length of 250–300 cm (98–118 in) with 38–75 cm (15–30 in) tail, 125–160 cm (4.10–5.25 ft) shoulder height and weighs 352–450 kg (776–992 lb).\n" +
                        "\n" +
                        "Endangered? Threatened by habitat loss\n" +
                        "\n";
            default:
                return "Latin: Majore Errore.\n" +
                        "\n" +
                        "What? something went wrong.\n" +
                        "\n" +
                        "Where? idk you find out yourself. (Spaces? SpacesInfo? who knows?).\n" +
                        "\n" +
                        "How big? BIG ERROR (MAJOR).\n" +
                        "\n" +
                        "Endangered? huh?\n" +
                        "\n";
        }
    }
    // Returns the initial price needed to buy a space. (Separate from the Spaces class for ease of editing I guess).
    public int setBasePrice()
    {
        return 500;
    }

    // Returns the new price needed to upgrade the space (pretty much all placeholder numbers)
    public int setUpgradePrice(int level, int num){
        int price;
        switch (level){
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
        return price * (num/4+1);
    }

    // returns the rent the space now has via level
    public int getRent(int level, int num){
        int rent;
        switch(level){
            case 0:
                rent = 0;
                break;
            case 1:
                rent = 50;
                break;
            case 2:
                rent = 100;
                break;
            case 3:
                rent = 200;
                break;
            default:
                rent = 999;
                break;
        }
        return rent*(num/5+1);
    }
}
