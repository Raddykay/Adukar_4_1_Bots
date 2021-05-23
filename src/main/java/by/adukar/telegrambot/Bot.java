package by.adukar.telegrambot;

import by.adukar.telegrambot.buttons.inline.InlineButtons;
import by.adukar.telegrambot.buttons.reply.ReplyButtons;

import by.adukar.telegrambot.service.FileService;
import by.adukar.telegrambot.service.TextService;
import by.adukar.telegrambot.service.UserService;
import lombok.SneakyThrows;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.polls.SendPoll;
import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;


public class Bot extends TelegramLongPollingBot {

    ReplyButtons replyButtons = new ReplyButtons();

    UserService userService = new UserService();
    TextService textService = new TextService();
    FileService fileService = new FileService();
    InlineButtons inlineButtons = new InlineButtons();

    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        sendAnswerFromBot(update);
    }

    @SneakyThrows
    public void sendAnswerFromBot(Update update){
        if (update.hasCallbackQuery()) {
            if(update.getCallbackQuery().getData().equals("trcn")) {
                Long chatIdFromCallBack = update.getCallbackQuery().getFrom().getId().longValue();
                sendMsg("chatIdFromCallBack", chatIdFromCallBack);
            }
            if(update.getCallbackQuery().getData().equals("trc2342n")) {
                Long chatIdFromCallBack = update.getCallbackQuery().getFrom().getId().longValue();
                sendMsg("chatIdFr23423omCallBack", chatIdFromCallBack);
            }
        }


        Long chatId = update.getMessage().getChatId();


       if(update.getMessage().getText().equals("/start")){
           sendMsg("Привет хлебушек, я бот ;)", chatId);
           sendMsgWithButtons("что вас интересует?",replyButtons.keyboardMarkupForSelectStudentOrTeacher(),chatId);
           sendMsgWithButtons("если вы знаете команды можно их написать через клавиатуру например : Англия", replyButtons.keyboardMarkupForSelectStudentOrTeacher(), chatId);
       }
       if(update.getMessage().getText().equals("назад")){
         sendMsgWithButtons("что вас интересует?", replyButtons.keyboardMarkupForSelectназад(), chatId);
       }
       if (update.getMessage().getText().equals("оценка")){
           sendMsgWithButtons("во сколько оценим?", replyButtons.keyboardMarkupForSelectоценка(), chatId);
       }
       if (update.getMessage().getText().equals("⭐")){
           sendMsgWithButtons("ладно...", replyButtons.keyboardMarkupForSelectоценка(), chatId);
       }
        if (update.getMessage().getText().equals("⭐2")){
            sendMsgWithButtons("ок!", replyButtons.keyboardMarkupForSelectоценка(), chatId);
        }
        if (update.getMessage().getText().equals("⭐3")){
            sendMsgWithButtons("хорошая оценка!", replyButtons.keyboardMarkupForSelectоценка(), chatId);
        }
        if (update.getMessage().getText().equals("⭐4")){
            sendMsgWithButtons("я тоже так считаю", replyButtons.keyboardMarkupForSelectоценка(), chatId);
        }
        if (update.getMessage().getText().equals("⭐5")){
            sendMsgWithButtons("даже так.", replyButtons.keyboardMarkupForSelectоценка(), chatId);
        }



        if (update.getMessage().getText().equals(("опрос"))){
           sendPoll(chatId);
           sendDice(chatId);
       }
       if (update.getMessage().getText().equals(("Страны"))){
           sendMsgWithButtons("какие страны вас интересуют?", replyButtons.keyboardMarkupForSelectCountry(), chatId);
       }
       if (update.getMessage().getText().equals(("Англия"))){
           sendMsgWithButtons("Великобритания (официальное название – Соединенное Королевство Великобритании и Северной Ирландии) – " +
                   "островное государство на северо-западе Европы, состоящее из Англии, Шотландии, Уэльса и Северной Ирландии. В Англии, на родине Шекспира и группы The Beatles, " +
                   "находится столица государства Лондон – мировой деловой и культурный центр. Также страна известна неолитическим сооружением Стоунхендж, " +
                   "римскими банями в городе Бат и старинными университетами в Оксфорде и Кембридже", replyButtons.keyboardMarkupForSelectАнглия(), chatId);
           sendPhoto("https://www.tripzaza.com/ru/destinations/wp-content/uploads/2018/08/Dostoprimechatelnosti-Londona-e1533796630149.jpg", chatId );
       }
       if (update.getMessage().getText().equals(("координатыA"))){
           sendLocationA(chatId);
       }
       if (update.getMessage().getText().equals(("достопримечательностиА"))){
           sendMsgWithButtons("что вас интересует?" , replyButtons.keyboardMarkupForSelectattractionsA(), chatId);
       }
       if (update.getMessage().getText().equals(("БукингемскийДворец"))){
           sendMsgWithButtons("Букинге́мский дворе́ц (англ. Buckingham Palace [ˈbʌkɪŋəm ˈpælɪs]) — официальная " +
                   "лондонская резиденция королевы Великобритании Елизаветы II[1]. Расположен напротив улицы Мэлл и " +
                   "Грин-парка с беломраморным и позолоченным " +
                   "памятником королеве Виктории. Когда монарх находится во дворце, над крышей дворца развевается королевский штандарт.", replyButtons.keyboardMarkupForSelectBuckinghamPalace(), chatId);
           sendPhoto("https://img.gazeta.ru/files3/846/10784846/upload-shutterstock_457813381-pic4_zoom-1500x1500-51560.jpg", chatId);
       }
       if (update.getMessage().getText().equals(("координатыBKP"))){
           sendLocationBuckinghamPalace(chatId);
       }
       if(update.getMessage().getText().equals(("Биг-Бен"))){
           sendMsgWithButtons("Биг-Бен (англ. Big Ben) — популярное туристическое название часовой башни Вестминстерского дворца. Официальное название башни с 2012 года — Башня Елизаветы, или Елизаветинская башня (англ. Elizabeth Tower)[1][2].\n" +
                   "\n" +
                   "Изначально «Биг-Бен» являлось названием самого большого из шести колоколов, однако часто это название расширительно относят и к часам, и к самой часовой башне в целом[3]. На момент отливки Биг-Бен был самым большим и тяжёлым колоколом Соединённого Королевства. Его вес при этом составлял 13,7 тонны. В 1881 году уступил первенство колоколу Большой Пол (17 тонн).\n" +
                   "\n" +
                   "Башня Елизаветы — один из самых узнаваемых символов Великобритании, часто используемый в сувенирах, рекламе, кинофильмах.", replyButtons.keyboardMarkupForSelectStonehenge(), chatId);
           sendPhoto("https://i.pinimg.com/originals/aa/68/27/aa682789630b6dc229ad519bf73730c9.jpg", chatId);
       }
       if (update.getMessage().getText().equals("координатыBGBN")){
           sendLocationBigBan(chatId);
       }
        if(update.getMessage().getText().equals(("Стоунхендж"))){
            sendMsgWithButtons("Стоунхендж, Стонхендж[7] (англ. Stonehenge [ˈstəʊnˌhendʒ]) — внесённое в список Всемирного наследия каменное мегалитическое сооружение (кромлех) в графстве Уилтшир (Англия). Находится примерно в 130 км к юго-западу от Лондона, примерно в 3,2 км к западу от Эймсбери и в 13 км к северу от Солсбери.\n" +
                    "\n" +
                    "Один из самых знаменитых археологических памятников в мире, Стоунхендж состоит из кольцевых и подковообразных" +
                    "сооружений, построенных из больших менгиров. Он находится в центре самого плотного комплекса памятников неолита и " +
                    "бронзового века в Англии. Сам памятник " +
                    "и его окрестности были включены в список Всемирного наследия ЮНЕСКО в 1986 г. вместе с Эйвбери. " +
                    "Стоунхендж передан британской короной в управление «Английскому наследию», тогда как ближайшие" +
                    " окрестности принадлежат Национальному трасту.", replyButtons.keyboardMarkupForSelectStonehenge(), chatId);
            sendPhoto("https://cdn23.img.ria.ru/images/153053/81/1530538161_0:259:2566:1702_1920x0_80_0_0_464a6fb91204c572ce4cd99a80469d78.jpg", chatId);
        }
        if (update.getMessage().getText().equals(("координатыSTEGE"))){
            sendLocationStonehenge(chatId);
        }
       if (update.getMessage().getText().equals(("Испания"))){
           sendMsgWithButtons("Испания – европейская страна, расположенная на Пиренейском полуострове. Территория Испании разделена на 17 автономных регионов. В столице страны, Мадриде, находятся Королевский дворец и музей Прадо, где хранятся произведения европейских мастеров. В Сеговии можно посетить средневековый замок (Алькасар)" +
                   " и увидеть хорошо сохранившийся римский акведук. Барселона – столица автономного " +
                   "сообщества Каталония. Облик этого города определяют многочисленные причудливо-фантастические " +
                   "творения архитектора Антонио Гауди, среди которых храм Святого Семейства." , replyButtons.keyboardMarkupForSelectИспания(), chatId);
           sendPhoto("https://34travel.me/media/upload/images/2016/march/madrid_guide/new/jorge-fernandez-salas-v8XeGZf8tcs-unsplash.jpg", chatId);
       }
       if (update.getMessage().getText().equals(("координатыS"))){
           sendLocationS(chatId);
       }
        if (update.getMessage().getText().equals(("достопримечательностиS"))){
            sendMsgWithButtons("что вас интересует?" , replyButtons.keyboardMarkupForSelectattractionsS(), chatId);
        }
        if (update.getMessage().getText().equals(("ХрамСвятогоСемейства"))){
            sendMsgWithButtons("Первый проект был разработан архитектором Франсиско дель Вильяр (кат. Francisco de Paula del Villar y Lozano), на место которого в конце 1883 года был приглашён Антонио Гауди, значительно изменивший первоначальный проект. По решению инициаторов строительства храма финансирование работ должно выполняться исключительно за счёт пожертвований прихожан, что является одной из причин столь длительного строительства.\n" +
                    "\n" +
                    "Также окончание строительства задерживает сложность изготовления каменных блоков. Согласно компьютерной модели, каждый из них требует индивидуальной обработки и подгонки.\n" +
                    "\n" +
                    "Необычный внешний вид храма сделал его одной из главных достопримечательностей Барселоны. По сведениям газеты El Periódico de Catalunya[es]," +
                    " в 2006 году строительство посетило 2,26 миллиона человек, что ставит объект в один ряд по " +
                    "популярности с музеем Прадо и дворцом Альгамбра." , replyButtons.keyboardMarkupForSelectИспания(), chatId);
            sendPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/%CE%A3%CE%B1%CE%B3%CF%81%CE%AC%CE%B4%CE%B1_%CE%A6%CE%B1%CE%BC%CE%AF%CE%BB%CE%B9%CE%B1_2941.jpg/375px-%CE%A3%CE%B1%CE%B3%CF%81%CE%AC%CE%B4%CE%B1_%CE%A6%CE%B1%CE%BC%CE%AF%CE%BB%CE%B9%CE%B1_2941.jpg", chatId);
        }
        if (update.getMessage().getText().equals("координатыHMS")){
            sendLocationДворецХрамСвятогоСемейства(chatId);
        }
        if (update.getMessage().getText().equals(("ЗамокКоломарес"))){
            sendMsgWithButtons("Фантастически прекрасный испанский замок Коломарес (El Castillo Monumento de Colomares), расположенный в провинции Малага, относящейся к автономному сообществу Андалусия, — главная достопримечательность курортного города Бенальмадена. Это легендарная история открытия Нового Света Христофором Колумбом, высеченная в камне. И как бы многие туристы ни относились снисходительно и свысока к замкам-новостроям, прекрасный замок Коломарес восхитит любого, кто увидит его собственными глазами." , replyButtons.keyboardMarkupForSelectЗамокКоломарес(), chatId);
            sendPhoto("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToNrjOQhuCj1rbyqI0ClsGkRidDGllXNmSvw&usqp=CAU",chatId);
        }
        if (update.getMessage().getText().equals("координатыZMK")){
            sendLocationДворецЗамокКоломарес(chatId);
        }
        if (update.getMessage().getText().equals(("СантьягоДеКомпостело"))) {
            sendMsgWithButtons("Сантья́го-де-Компосте́ла (галис. Santiago de Compostela [sãnˈtjaɰo ðe komposˈtɛla], исп. Santiago de Compostela [sanˈtjaɣo ðe komposˈtela]) — столица автономного сообщества Галисия в Испании. Муниципалитет находится в составе района (комарки) Сантьяго. Город возник вокруг Сантьягского собора — крупнейшего центра паломничества. В 1985 году старая часть города вошла в список Всемирного наследия ЮНЕСКО. Культурная столица Европы 2000 года.", replyButtons.keyboardMarkupForSelectСантьягоДеКомпостело(), chatId);
            sendPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Collage_de_Santiago_de_Compostela.jpg/424px-Collage_de_Santiago_de_Compostela.jpg", chatId);
        }
        if (update.getMessage().getText().equals("координатыSDEKOM")){
            sendLocationСантьягоДеКомпостело(chatId);
        }
       if (update.getMessage().getText().equals(("Франция"))){
           sendMsgWithButtons("Франция – это страна в Западной Европе, на территории которой находятся средневековые города, " +
                   "альпийские деревни и пляжи Средиземного моря. Париж, столица государства, славится своими домами моды, старейшими " +
                   "художественными музеями, в числе которых Лувр, и достопримечательностями, такими как Эйфелева башня. Франция известна своими винами и изысканной кухней. " +
                   "Наскальная живопись в пещере Ласко, амфитеатр Трех Галлий в Лионе и огромный Версальский " +
                   "дворец свидетельствуют о богатой истории этих мест", replyButtons.keyboardMarkupForSelectФранция(), chatId);
           sendPhoto("https://media.tacdn.com/media/attractions-splice-spp-674x446/07/03/1c/9c.jpg", chatId);

       }
       if (update.getMessage().getText().equals(("координатыF"))){
           sendLocationF(chatId);
       }
       if (update.getMessage().getText().equals(("ЭйфелеваБашня"))){
           sendMsgWithButtons("йфелева ба́шня (фр. tour Eiffel, МФА: [tu.ʁ‿ɛ.fɛl]) — металлическая башня в центре Парижа, самая узнаваемая его архитектурная достопримечательность. Названа в честь главного конструктора Гюстава Эйфеля; сам Эйфель называл её просто «300-метровой башней» (tour de 300 mètres).\n" +
                   "\n" +
                   "Башня, впоследствии ставшая символом Парижа, была построена в 1889 году и первоначально задумывалась как временное сооружение, служившее входной аркой парижской Всемирной выставки 1889 года.\n" +
                   "\n" +
                   "Эйфелеву башню называют самой посещаемой платной[2] и самой фотографируемой достопримечательностью мира[3].", replyButtons.keyboardMarkupForSelectЭйфелеваБашня(), chatId);
           sendPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Tour_Eiffel_Wikimedia_Commons_%28cropped%29.jpg/450px-Tour_Eiffel_Wikimedia_Commons_%28cropped%29.jpg",chatId);
       }
       if (update.getMessage().getText().equals("координатыELB")){
           sendLocationЭйфелеваБашня(chatId);
       }
       if (update.getMessage().getText().equals(("ДворецФонтенбло"))){
           sendMsgWithButtons("Замок Фонтенбло, или Дворец Фонтенбло (фр. Château de Fontainebleau) — дворец в 69 км к юго-востоку от Парижа. Расположен во французском департаменте Сена и Марна, вокруг которого со временем сформировался город Фонтенбло. Первые упоминания относятся к 1137 году[3]. Перестроен Франциском I в XVI веке в ренессансном стиле на месте средневекового замка.\n" +
                   "\n" +
                   "Здесь жили многие правители Франции начиная с Людовика VII и заканчивая Наполеоном III. Четыре монарха родились во дворце — Филипп IV Красивый, Франциск II Валуа, Генрих III Валуа и Людовик XIII.\n" +
                   "\n" +
                   "В 1981 году дворец и парк Фонтенбло вошли в список объектов Всемирного наследия ЮНЕСКО во Франции.", replyButtons.keyboardMarkupForSelectСантьягоДворецФонтенбло(), chatId);
           sendPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Chateau_Fontainebleau.jpg/411px-Chateau_Fontainebleau.jpg",chatId);
       }
       if (update.getMessage().getText().equals("координатыFNTBLO")){
           sendLocationДворецФонтенбло(chatId);
       }
       if (update.getMessage().getText().equals(("ПарижскийДиснейлэнд"))){
           sendMsgWithButtons("Disneyland P (читается Диснейлэ́нд; до 1994 года Евро-Диснейленд; до 2009 года Disneyland Resort) — комплекс парков развлечений компании «Уолт Дисней» в городе Марн-ля-Вале в 32 км восточнее Парижа. Площадь парка составляет около 1943 га. В среднем за год парижский Диснейленд посещают 12,5 млн человек.\n" +
                   "\n" +
                   "Открытие парка состоялось 12 апреля 1992 года. На территории Диснейленда находятся два тематических парка Disneyland Park (с 1992) и Walt Disney Studios Park (с 2002 года), увеселительный парк Disney Village, поле для гольфа Golf Disneyland, а также отели и деловые и жилые кварталы.", replyButtons.keyboardMarkupForSelectПарижскийДиснейлэнд(), chatId);
           sendPhoto("https://paris-life.info/wp-content/uploads/2018/12/paris-disnayland-1.jpg",chatId);
       }
       if (update.getMessage().getText().equals("координатыPRDL")){
           sendLocationДворецПарижскийДиснейлэнд(chatId);
       }
        if (update.getMessage().getText().equals(("достопримечательностиF"))){
            sendMsgWithButtons("что вас интересует?" , replyButtons.keyboardMarkupForSelectattractionsF(), chatId);
        }

       if(update.getMessage().getText().equals(("привет"))){
           sendMsg("привет кожанный", chatId);
       }
        if(update.getMessage().getText().equals(("пока"))){
            sendMsg("ладно..возрощайся потом :)", chatId);
        }
        if(update.getMessage().getText().equals(("сам ты кожанный"))){
            sendMsg("ок.", chatId);
        }
        if(update.getMessage().getText().equals(("как дела?"))){
            sendMsg("как обычно.", chatId);
        }
        if(update.getMessage().getText().equals(("кто ты?"))){
            sendMsg("Обама.", chatId);
        }
        if(update.getMessage().getText().equals(("да"))){
            sendMsg("нет", chatId);
        }
        if(update.getMessage().getText().equals(("нет"))){
            sendMsg("да", chatId);
        }
        if(update.getMessage().getText().equals(("пошли в GYM"))){
            sendMsg("я бы хотел , но я не умею ходить :(", chatId);
        }
        if(update.getMessage().getText().equals(("спишь?"))){
            sendMsg("нет блин, лежу.", chatId);
        }
        if(update.getMessage().getText().equals(("лежишь?"))){
            sendMsg("нет блин, сплю.", chatId);
        }
        if(update.getMessage().getText().equals(("..."))){
            sendMsg("что молчишь?", chatId);
        }
        if(update.getMessage().getText().equals(("дурачок?"))){
            sendMsg("может быть.", chatId);
        }
        if(update.getMessage().getText().equals(("почему?"))){
            sendMsg("потому.", chatId);
        }
        if(update.getMessage().getText().equals(("ладно"))){
            sendMsg("ладно.", chatId);
        }
        if(update.getMessage().getText().equals(("пакет"))){
            sendMsg("из петёрочки?", chatId);
        }
        if(update.getMessage().getText().equals(("кто я?"))){
            sendMsg("Алла Пугачёва , а так же кожанный.", chatId);
        }
        if(update.getMessage().getText().equals(("всмысле?"))){
            sendMsg("карамысле.", chatId);
        }
        if(update.getMessage().getText().equals(("пошёл ты"))){
            sendMsg("чел, я бы с радостью , но у меня нет ног :(", chatId);
        }


       if(update.getMessage().getText().equals(("command"))){
           sendMsg("/start , myLocation , hello , command , myId , Location , /admin", chatId);
       }
        if (update.getMessage().getText().equals(("Location"))){
            sendLocationA(chatId);
        }
        if (update.getMessage().getText().equals(("/admin"))){
            sendContact(chatId);
        }

    }

    public synchronized void sendMsg(String message, Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }

    public synchronized void sendContact(Long chatId) {
        SendContact sendContact = new SendContact();
        sendContact.setPhoneNumber("+375293436008");
        sendContact.setFirstName("Aleksander");
        sendContact.setLastName("Buinevich");
        sendContact.setChatId(chatId);
        try {
            execute(sendContact);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }

  /*  public synchronized void sendDocument(Long chatId) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument("http://www.africau.edu/images/default/sample.pdf");
        sendDocument.setCaption("Текст к документу");
        try {
            execute(sendDocument);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }*/

    public synchronized void sendLocationA(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("51.5466587"));
        sendLocation.setLongitude(Float.valueOf("-0.3415513"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationF(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("46.4723857"));
        sendLocation.setLongitude(Float.valueOf("2.2713003"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationS(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("40.2460501"));
        sendLocation.setLongitude(Float.valueOf("-3.3899717"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationBuckinghamPalace(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("51.4995183"));
        sendLocation.setLongitude(Float.valueOf("-0.1460191"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationStonehenge(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("51.178882"));
        sendLocation.setLongitude(Float.valueOf("-1.8349697"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationBigBan(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("51.5007325"));
        sendLocation.setLongitude(Float.valueOf("-0.1268141"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationЭйфелеваБашня(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("48.8583736"));
        sendLocation.setLongitude(Float.valueOf("2.2922926"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationДворецФонтенбло(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("48.4026162"));
        sendLocation.setLongitude(Float.valueOf("2.6947615"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationДворецПарижскийДиснейлэнд(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("48.8673893"));
        sendLocation.setLongitude(Float.valueOf("2.7814043"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationДворецХрамСвятогоСемейства(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("41.4036339"));
        sendLocation.setLongitude(Float.valueOf("2.1721671"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationДворецЗамокКоломарес(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("41.3758127"));
        sendLocation.setLongitude(Float.valueOf("2.1755719"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    public synchronized void sendLocationСантьягоДеКомпостело(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(Float.valueOf("42.8802625"));
        sendLocation.setLongitude(Float.valueOf("-8.5797892"));

        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }

    public synchronized void sendPhoto(String pathToPhoto, Long chatId) {
        SendPhoto sendPhotoRequest = new SendPhoto();
        sendPhotoRequest.setChatId(chatId);
        sendPhotoRequest.setPhoto(pathToPhoto);
        try {
           execute(sendPhotoRequest);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendMsgWithButtons(String message, ReplyKeyboardMarkup replyKeyboardMarkup, Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }

    public synchronized void sendMsgWithButtons(String message, InlineKeyboardMarkup replyKeyboardMarkup, Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            System.out.println( "Exception: " + e.toString());
        }
    }
    @SneakyThrows
    public synchronized void sendPoll(Long chatId){
        SendPoll sendPoll = new SendPoll();
        sendPoll.enableNotification();
        sendPoll.setQuestion("столица Франции");
        sendPoll.setAnonymous(true);
        sendPoll.setOptions(List.of("Европа", "Прага", "Париж"));
        sendPoll.setChatId(chatId);
        sendPoll.setType("quiz");
        sendPoll.setCorrectOptionId(2);
        execute(sendPoll);

    }
    @SneakyThrows
    public synchronized void sendDice(Long chatId) {
        SendDice sendDice = new SendDice();
        sendDice.setChatId(chatId);
        execute(sendDice);
    }




    @Override
    public String getBotUsername() {
        return "Map2233Bot";
    }

    @Override
    public String getBotToken() {
        return "1784502453:AAEl7FgKP2L66cdJExZ8z4zFiSh0IdGBTPs";
    }
}