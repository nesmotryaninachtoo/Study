/*В этой задаче вам нужно реализовать метод, настраивающий параметры логирования.
Конфигурирование в коде позволяет выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.

Требуется выставить такие настройки, чтобы:

    1)Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
    2)Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
    3)Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java",
    независимо от серьезности сообщения печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".
*/

private static void configureLogging() {
        Logger loggerClassA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerClassA.setLevel(Level.ALL);
        Logger loggerClassB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerClassB.setLevel(Level.WARNING);
        Logger logger = Logger.getLogger("org.stepic.java");
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new XMLFormatter());
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);
    }
