package com.example.gmailclone

import com.example.gmailclone.model.Account
import com.example.gmailclone.model.MailData

val mailList= listOf(
    MailData(
        mailId = 1,
        userName = "Héctor",
        subject = "Email regarding something important",
        body="This is regarding an important oportunity to you",
        timeStamp = "09:10"),
    MailData(
        mailId = 2,
        userName = "Claudia",
        subject = "Email regarding Liverpool",
        body="This is regarding an your shopping",
        timeStamp = "09:12"),
    MailData(
        mailId = 3,
        userName = "Claudia",
        subject = "Email regarding Amazon",
        body="This is regarding an your order",
        timeStamp = "09:13"),
    MailData(
        mailId = 4,
        userName = "Claudia",
        subject = "Email regarding Walmart",
        body="This is regarding your groseries",
        timeStamp = "09:13"),
    MailData(
        mailId = 5,
        userName = "Claudia",
        subject = "Email regarding Banamex",
        body="Your card is empty",
        timeStamp = "09:15"),
    MailData(
        mailId = 6,
        userName = "Claudia",
        subject = "Email regarding Banamex",
        body="Your card is empty",
        timeStamp = "09:15"),
    MailData(
        mailId = 7,
        userName = "Claudia",
        subject = "Email regarding Banamex",
        body="Your card is empty",
        timeStamp = "09:15"),
    MailData(
        mailId = 8,
        userName = "Manuel",
        subject = "Another Email regarding Banamex",
        body="Your card is empty",
        timeStamp = "09:16"),
    MailData(
        mailId = 9,
        userName = "Manuel",
        subject = "Another Email regarding Bajío",
        body="Your card is empty",
        timeStamp = "09:16")
)

val accountList = listOf<Account>(
    Account(icon = R.drawable.tutorial, userName = "Mr Games", email = "mrgamesmx@gmail.com", unReadMails = 98),
    Account(userName = "Héctor Sandoval", email = "hector@hector.com", unReadMails = 1),
    Account(userName = "Claudia Sandoval", email = "claudia@caudia.com", unReadMails = 99),
)