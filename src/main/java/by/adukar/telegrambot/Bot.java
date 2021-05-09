package by.adukar.telegrambot;

import by.adukar.telegrambot.buttons.reply.ReplyButtons;

import by.adukar.telegrambot.service.FileService;
import by.adukar.telegrambot.service.TextService;
import by.adukar.telegrambot.service.UserService;
import lombok.SneakyThrows;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.polls.SendPoll;
import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;


public class Bot extends TelegramLongPollingBot {

    ReplyButtons replyButtons = new ReplyButtons();

    UserService userService = new UserService();
    TextService textService = new TextService();
    FileService fileService = new FileService();

    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        sendAnswerFromBot(update);
    }

    @SneakyThrows
    public void sendAnswerFromBot(Update update){
        Long chatId = update.getMessage().getChatId();


       if(update.getMessage().getText().equals("/start")){
           sendMsg("hello hlebushek i am bot", chatId);
           sendMsg("command: /start , /myLocation , /hello , /command , /myId , /Location , /admin , /photo , /photo1 , /opross , /country", chatId);
           sendMsgWithButtons("что вас интересует?",replyButtons.keyboardMarkupForSelectStudentOrTeacher(),chatId);
       }
       if (update.getMessage().getText().equals(("/opross"))){
           sendPoll(chatId);
           sendDice(chatId);
       }
       if (update.getMessage().getText().equals(("Country"))){
           sendMsgWithButtons("какие страны вас интересуют?", replyButtons.keyboardMarkupForSelectCountry(), chatId);
       }
       if (update.getMessage().getText().equals(("Англия"))){
           sendMsgWithButtons("Великобритания (официальное название – Соединенное Королевство Великобритании и Северной Ирландии) – " +
                   "островное государство на северо-западе Европы, состоящее из Англии, Шотландии, Уэльса и Северной Ирландии. В Англии, на родине Шекспира и группы The Beatles, " +
                   "находится столица государства Лондон – мировой деловой и культурный центр. Также страна известна неолитическим сооружением Стоунхендж, " +
                   "римскими банями в городе Бат и старинными университетами в Оксфорде и Кембридже", replyButtons.keyboardMarkupForSelectАнглия(), chatId);
           sendPhoto("https://www.tripzaza.com/ru/destinations/wp-content/uploads/2018/08/Dostoprimechatelnosti-Londona-e1533796630149.jpg", chatId );
       }
       if (update.getMessage().getText().equals(("attractionsA"))){
           sendMsgWithButtons("что вас интересует?" , replyButtons.keyboardMarkupForSelectattractionsA(), chatId);
       }
       if (update.getMessage().getText().equals(("BuckinghamPalace"))){
           sendMsgWithButtons("Букинге́мский дворе́ц (англ. Buckingham Palace [ˈbʌkɪŋəm ˈpælɪs]) — официальная " +
                   "лондонская резиденция королевы Великобритании Елизаветы II[1]. Расположен напротив улицы Мэлл и " +
                   "Грин-парка с беломраморным и позолоченным " +
                   "памятником королеве Виктории. Когда монарх находится во дворце, над крышей дворца развевается королевский штандарт.", replyButtons.keyboardMarkupForSelectBuckinghamPalace(), chatId);
           sendPhoto("https://img.gazeta.ru/files3/846/10784846/upload-shutterstock_457813381-pic4_zoom-1500x1500-51560.jpg", chatId);
       }
       if(update.getMessage().getText().equals(("Stonehenge"))){
           sendMsgWithButtons("", replyButtons.keyboardMarkupForSelectStonehenge(), chatId);
           sendPhoto("https://cdn23.img.ria.ru/images/153053/81/1530538161_0:259:2566:1702_1920x0_80_0_0_464a6fb91204c572ce4cd99a80469d78.jpg", chatId);
       }
       if (update.getMessage().getText().equals(("Испания"))){
           sendMsgWithButtons("Испания – европейская страна, расположенная на Пиренейском полуострове. Территория Испании разделена на 17 автономных регионов. В столице страны, Мадриде, находятся Королевский дворец и музей Прадо, где хранятся произведения европейских мастеров. В Сеговии можно посетить средневековый замок (Алькасар)" +
                   " и увидеть хорошо сохранившийся римский акведук. Барселона – столица автономного " +
                   "сообщества Каталония. Облик этого города определяют многочисленные причудливо-фантастические " +
                   "творения архитектора Антонио Гауди, среди которых храм Святого Семейства." , replyButtons.keyboardMarkupForSelectИспания(), chatId);
           sendPhoto("https://34travel.me/media/upload/images/2016/march/madrid_guide/new/jorge-fernandez-salas-v8XeGZf8tcs-unsplash.jpg", chatId);
       }
        if (update.getMessage().getText().equals(("attractionsS"))){
            sendMsgWithButtons("что вас интересует?" , replyButtons.keyboardMarkupForSelectattractionsS(), chatId);
        }

       if (update.getMessage().getText().equals(("Франция"))){
           sendMsgWithButtons("Франция – это страна в Западной Европе, на территории которой находятся средневековые города, " +
                   "альпийские деревни и пляжи Средиземного моря. Париж, столица государства, славится своими домами моды, старейшими " +
                   "художественными музеями, в числе которых Лувр, и достопримечательностями, такими как Эйфелева башня. Франция известна своими винами и изысканной кухней. " +
                   "Наскальная живопись в пещере Ласко, амфитеатр Трех Галлий в Лионе и огромный Версальский " +
                   "дворец свидетельствуют о богатой истории этих мест", replyButtons.keyboardMarkupForSelectФранция(), chatId);
           sendPhoto("https://media.tacdn.com/media/attractions-splice-spp-674x446/07/03/1c/9c.jpg", chatId);

       }
        if (update.getMessage().getText().equals(("attractionsF"))){
            sendMsgWithButtons("что вас интересует?" , replyButtons.keyboardMarkupForSelectattractionsF(), chatId);
        }

       if(update.getMessage().getText().equals(("/hello"))){
           sendMsg("hello human", chatId);
       }

       if(update.getMessage().getText().equals(("/myLocation"))){
           sendMsg("I don't know how to do that yet. Come back later", chatId);
       }
       if(update.getMessage().getText().equals(("/command"))){
           sendMsg("/start , /myLocation , /hello , /command , /myId , /Location , /admin , /photo , /photo1 ", chatId);
       }
       if(update.getMessage().getText().equals(("/myId"))){
           sendMsg("i don't know how to do that,sorry bro",chatId);
       }
       if (update.getMessage().getText().equals(("/photo"))){
           sendPhoto("https://images.theconversation.com/files/350865/original/file-20200803-24-50u91u.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=1200&h=675.0&fit=crop", chatId);
       }
        if (update.getMessage().getText().equals(("/photo1"))){
            sendPhoto("https://www.minecraft.net/etc.clientlibs/minecraft/clientlibs/main/resources/img/minecraft-creeper-face.jpg", chatId);
        }
        if (update.getMessage().getText().equals(("/Location"))){
            sendLocation(chatId);
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

    public synchronized void sendLocation(Long chatId){
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