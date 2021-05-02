package by.adukar.telegrambot;

import by.adukar.telegrambot.buttons.reply.ReplyButtons;
import by.adukar.telegrambot.consts.Commands;
import by.adukar.telegrambot.consts.Paths;
import by.adukar.telegrambot.consts.Photos;
import by.adukar.telegrambot.consts.Text;
import by.adukar.telegrambot.enums.Color;
import by.adukar.telegrambot.service.FileService;
import by.adukar.telegrambot.service.TextService;
import by.adukar.telegrambot.service.UserService;
import lombok.SneakyThrows;
import org.telegram.telegrambots.api.methods.send.*;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;


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
           sendMsg("command: /start , /myLocation , /hello , /command , /myId , /Location , /admin , /photo , /photo1", chatId);
           sendMsgWithButtons("text",replyButtons.keyboardMarkupForSelectStudentOrTeacher(),chatId);
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
            sendPhoto(sendPhotoRequest);
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


    @Override
    public String getBotUsername() {
        return "Map2233Bot";
    }

    @Override
    public String getBotToken() {
        return "1784502453:AAEl7FgKP2L66cdJExZ8z4zFiSh0IdGBTPs";
    }
}