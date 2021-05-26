package ru.mkliman.Kliman_first_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.mkliman.Kliman_first_boot.client.HundaiClient;
import ru.mkliman.Kliman_first_boot.model.Car;
import ru.mkliman.Kliman_first_boot.model.Model;
import ru.mkliman.Kliman_first_boot.model.TelegramUser;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

@Component
public class CarServiceImpl implements CarService {


    private static final Set<Model> stringSet = new HashSet<>();
    @Autowired
    private TelegramUserService telegramUserService;
    @Autowired
    private SendBotMessageService sendBotMessageService;

    @Override
    public void findCar() {

        List<TelegramUser> telegramUserList = telegramUserService.retrieveAllActiveUsers();
        while (true) {
            Car cars = HundaiClient.getTemplate();
            Car mockCar = getMockCar();
            Set<Model> newCars = new HashSet<>();
            cars.getModels().forEach(model -> {
                if (!stringSet.contains(model)) {
                    newCars.add(model);
                    String complectation = "";
                    switch (model.getComplectation_id()) {
                        case 652:
                        case 670:
                        case 668:
                        case 676:
                        case 678:
                            complectation = "Active";
                            break;
                        case 669:
                        case 672:
                        case 674:
                        case 675:
                        case 679:
                            complectation = "Travel";
                            break;
                        case 786:
                        case 788:
                        case 789:
                            complectation = "Black&Brown";
                            break;
                        case 787:
                        case 790:
                        case 791:
                            complectation = "Black&Brown с пакетом Winter";
                            break;
                        case 742:
                        case 743:
                        case 744:
                        case 745:
                        case 746:
                            complectation = "Travel + Advanced с двухцветным кузовом";
                            break;
                        case 805:
                        case 806:
                        case 807:
                        case 808:
                        case 809:
                            complectation = "Travel + Advanced New с двухцветным кузовом";
                            break;
                        case 682:
                            complectation = "Style";
                            break;
                        case 810:
                            complectation = "Style new";
                            break;
                        case 731:
                        case 732:
                            complectation = "Standart";
                            break;
                        case 653:
                        case 654:
                        case 655:
                        case 656:
                            complectation = "Active Plus";
                            break;
                        case 657:
                        case 662:
                        case 663:
                        case 664:
                        case 671:
                        case 673:
                        case 741:
                        case 677:
                            complectation = "Comfort";
                            break;
                        case 665:
                        case 666:
                            complectation = "Elegance";
                            break;
                        case 694:
                            complectation = "Prosafety";
                            break;
                        case 772:
                        case 773:
                        case 774:
                        case 775:
                            complectation = "Special, 10 years";
                            break;
                        case 776:
                        case 777:
                            complectation = "Special, 10 years + comfort";
                            break;
                        case 525:
                        case 600:
                            complectation = "Primary";
                            break;
                        case 548:
                        case 601:
                        case 603:
                        case 604:
                        case 628:
                            complectation = "Family";
                            break;
                        case 549:
                        case 602:
                        case 605:
                        case 630:
                            complectation = "Lifestyle";
                            break;
                        case 550:
                        case 606:
                        case 631:
                            complectation = "Dynamic";
                            break;
                        case 551:
                        case 632:
                            complectation = "High-Tech plus";
                            break;
                        case 715:
                        case 716:
                            complectation = "Primary New";
                            break;
                        case 717:
                        case 719:
                        case 720:
                        case 723:
                            complectation = "Family New";
                            break;
                        case 718:
                        case 721:
                        case 724:
                            complectation = "Lifestyle New";
                            break;
                        case 722:
                        case 725:
                            complectation = "Dynamic New";
                            break;
                        case 726:
                            complectation = "High-Tech plus New";
                            break;
                    }

                    String modification = "";
                    switch (model.getModification_id()) {
                        case 227:
                            modification = "1.4 - 6МТ";
                            break;
                        case 228:
                            modification = "1.4 - 6АТ";
                            break;
                        case 229:
                            modification = "1.6 - 6МТ";
                            break;
                        case 230:
                            modification = "1.6 - 6АТ";
                            break;
                        case 231:
                            modification = "1.6л 6MT 2WD";
                            break;
                        case 232:
                            modification = "1.6л 6AT 2WD";
                            break;
                        case 233:
                            modification = "2.0л 6AT 2WD";
                            break;
                        case 234:
                            modification = "2.0л 6AT 4WD";
                            break;
                        case 235:
                            modification = "1.6л 6MT 4WD";
                            break;
                        case 236:
                            modification = "1.6л 6AT 4WD";
                            break;

                        case 209:
                            modification = "2.0 (150 л.с.) MPI-6AT-2WD";
                            break;
                        case 210:
                            modification = "2.0 (150 л.с.) MPi-6MT-4WD";
                            break;
                        case 211:
                            modification = "2.0 (150 л.с.) MPi-6AT-4WD";
                            break;
                        case 213:
                            modification = "2.0 (185 л.с.) Diesel-8AT-4WD";
                            break;
                        case 214:
                            modification = "2.0 (150 л.с.) MPi-6MT-2WD";
                            break;
                        case 223:
                            modification = "2.4 (184 л.с.) GDi-6AT-4WD";
                            break;
                    }

                    String color = "";
                    switch (model.getColor_exterior_id()) {
                        case 196:
                        case 121:
                        case 166:
                            color = "Коричневая";
                            break;
                        case 11:
                        case 89:
                        case 110:
                        case 115:
                        case 130:
                        case 143:
                        case 192:
                        case 226:
                        case 228:
                        case 239:
                        case 245:
                            color = "Белая";
                            break;
                        case 103:
                        case 142:
                        case 149:
                        case 155:
                        case 185:
                        case 222:
                        case 224:
                        case 227:
                            color = "Красная";
                            break;
                        case 102:
                        case 151:
                        case 157:
                        case 159:
                        case 165:
                        case 190:
                        case 193:
                        case 240:
                            color = "Синия";
                            break;
                        case 72:
                        case 113:
                        case 122:
                        case 139:
                        case 152:
                        case 225:
                            color = "Черная";
                            break;
                        case 17:
                        case 114:
                        case 186:
                        case 191:
                        case 229:
                            color = "Серебристая";
                            break;
                        case 30:
                        case 67:
                        case 92:
                        case 111:
                        case 144:
                        case 145:
                        case 146:
                        case 148:
                        case 164:
                        case 188:
                        case 189:
                        case 194:
                        case 197:
                        case 205:
                        case 220:
                        case 223:
                        case 234:
                        case 235:
                        case 246:
                            color = "Серая";
                            break;
                        case 96:
                        case 195:
                        case 221:
                            color = "Бежевая";
                            break;
                        case 154:
                            color = "Тёмно-зеленый";
                            break;
                    }

                    String message = "Модель: " + model.getModel_name()
                            + ", стоимость: " + model.getPrice()
                            + ", комплектация: " + complectation
                            + ", год выпуска: " + model.getYear()
                            + ", " + modification
                            + ", цвет: " + color
                            + ", количество: " + model.getCount_available();
                    System.out.println("FINDED CAR: " + message);
                    telegramUserList
                            .stream()
                            .filter(TelegramUser::isActive)
                            .forEach(user -> sendBotMessageService.sendMessage(user.getChatId(), message));
                } else {
                    newCars.add(model);
                }


            });
            stringSet.clear();
            stringSet.addAll(newCars);
            try {
                if (LocalDateTime.now().getHour() > 12 && LocalDateTime.now().getHour() < 13) {
                    Integer i = getRandomDoubleBetweenRange(100, 1000);
                    System.out.println("random i: " + i);
                    Thread.sleep(i);
                } else {
                    Integer i = getRandomDoubleBetweenRange(100000, 1000000);
                    System.out.println("random i: " + i);
                    Thread.sleep(i);
                }
//            Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static Integer getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return Integer.parseInt(String.valueOf(x).split("\\.")[0]);
    }

    private Car getMockCar() {
        Car cars2 = new Car();
        Model model2 = new Model();
        model2.setId(1310);
        model2.setCar_id(31);
        model2.setModification_id(231);
        model2.setComplectation_id(668);
        model2.setPackage_id(0);
        model2.setColor_exterior_id(196);
        model2.setColor_interior_id(209);
        model2.setCount_show(365);
        model2.setPrice(1162000);
        model2.setYear(2021);
        model2.setOcn("CTW5D2617DD336");
        model2.setCount_available(1);
        model2.setModel_name("TESTOVAYA");
        model2.setDiscount_state(0);
        model2.setDiscount_start(0);
        model2.setCredit_available(1);
        model2.setCash_availabl(1);
        cars2.setModels(Set.of(model2));
        return cars2;
    }
}
