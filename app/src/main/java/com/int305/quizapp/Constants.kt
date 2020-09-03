package com.int305.quizapp

object Constants{


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        //1
        val que1 = Question(
            1,
            "Which of the following laptop features allows users to overcome " +
                    "keyboard size restrictions? ",
            "Touchpad",
            "Numeric Keypad",
            "Fn key",
            "Digitizer",
            3
        )

        questionsList.add(que1)

        //2
        val que2 = Question(
            2,
            "IP addresses that are assigned to a node each time it connects to the network " +
                     "are called ____ IP addresses.",
            "Dynamic",
            "Static",
            "Variable",
            "Reserved",
            1
        )

        questionsList.add(que2)

        //3
        val que3 = Question(
            3,
            "You are replacing a hard disk and want to get the best performance " +
                     "possible from a standard magnetic HDD. Which rotational speed would you " +
                     "choose on your new hard disk?",
            "10,000 RPM",
            "15,000 RPM",
            "17,000 RPM",
            "54,000 RPM",
            2
        )

        questionsList.add(que3)

        //4
        val que4 = Question(
            4,
            "Which touch screen technology uses electrodes that sense the " +
                    "conductive properties of skin?",
            "Passive",
            "Capacitive",
            "Resistive",
            "Resistant",
            2
        )

        questionsList.add(que4)

        //5
        val que5 = Question(
            5,
            "Which Applications level protocol is used to transfer files on the Internet?",
            "Email",
            "FTP",
            "Web Browser",
            "Telnet",
            2
        )

        questionsList.add(que5)

        return questionsList



    }

}