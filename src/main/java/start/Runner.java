package start;

import accessories.*;
import aquarium.Aquarium;
import livingCreatures.*;

public class Runner {

    public static double totalPrice = 0; // глобальный счетчик общей цены

    // метод для отображения текста на консоль
    public static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {

        print("Утро. Это комната маленькой Кэтти, сегодня весьма важный день для нее.");
        print("Как никак 6 лет исполняется один раз в жизни.");
        print("Вот Кэтти уже проснулась и в ту же минуту в дверь входят мама и папа, а в руках у него стеклянный ящик.");

        Aquarium aquarium = new Aquarium(100, 50, "high");

        print("Так в комнате появился аквариум.");
        print("Объем " + aquarium.getCapacity() + " литров, стекло " + aquarium.getDurabilityFlewDown() + " прочности - с гордостью сказал папа.");
        print("Он еще долго возился, присоединяя к аквариуму какие-то непонятные трубочки и коробки.");

        Filter filter = new Filter("фильтр", 15);
        Heater heater = new Heater("обогреватель", 10);
        Thermostat thermostat = new Thermostat("термостат", 8);
        Lamp lamp = new Lamp("лампа", 5);

        print("Ну вот, " + heater.getName() + ", " + thermostat.getName() + ", " + filter.getName() + " и " + lamp.getName() + " установлены. - выдохнул папа.");
        print("Можно наполнять.");
        print("В аквариум налили воды, - но подождите, это ведь не все?! - спросила Кэтти.");
        print("Конечно нет! - ответил папа и установил еще какие-то штуки.");

        Island leftIsland = new Island("левый островок", 6);
        Island rightIsland = new Island("правый островок", 6);

        print("В результате, получилось 2 маленьких островка над водой, слева и справа.");
        print("Затем мама с папой нарочно отгородили аквариум от Кэтти, а когда девочка с возмущенным воплем прорвалась таки к аквариуму...");
        print("Она увидела двух маленьких черепашек на островках, а под ними, в воде, плавали четыре удивительно красивые рыбки.");

        Fish firstFish = new Fish("Желток", 15);
        Fish secondFish = new Fish("Белок", 17);
        Fish thirdFish = new Fish("Фуфик", 20);
        Fish fourthFish = new Fish("Кэп", 21);

        Turtle firstTurtle = new Turtle("Ранго", 30);
        Turtle secondTurtle = new Turtle("Джонни Депп", 50);

        print("Кэтти сразу же раздала всем имена...");
        print("C тех пор в комнате у Кэтти жили четыре рыбки: " + firstFish.getName() + ", " + secondFish.getName() + ", " + thirdFish.getName() + " и " + fourthFish.getName() + ".");
        print("А также две черепашки: " + firstTurtle.getName() + " и " + secondTurtle.getName() + ".");
        print("Позднее, мама начала делать уборку в соседней комнате и заметила бумагу, лежавшую под столом.");
        print("Это оказалась квитанция на оплату подарка для Кэтти, внизу значилась общая сумма и составляла она: " + totalPrice + "$...");
    }
}
