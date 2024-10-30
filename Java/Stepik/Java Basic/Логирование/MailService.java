 public static class Thief implements MailService {
        private static int StolenValue;
        private static int MinValue;

        public Thief(int m) {
            MinValue = m;
        }

        public int getStolenValue() {
            return StolenValue;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail.getClass() == MailPackage.class){
                Package pckg =  ((MailPackage) mail).getContent();
                if (pckg.getPrice() >= MinValue){
                    StolenValue += pckg.getPrice();
                    return new MailPackage(mail.getFrom(),mail.getTo(),
                        new Package("stones instead of " + pckg.getContent(), 0));
                }
            }
            return mail;
        }
    }


    // ------======== Spy =======---------
    public static class Spy implements MailService {
        private final Logger logger;

        public Spy(Logger l) {
            this.logger = l;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail.getClass() == MailMessage.class) {
                if (mail.getTo().equals(AUSTIN_POWERS) || mail.getFrom().equals(AUSTIN_POWERS)) {
                    logger.log(Level.WARNING,
                            "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                            new Object[]{mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});

                } else logger.log(Level.INFO, "Usual correspondence: from {0} to {1}",
                        new Object[]{mail.getFrom(), mail.getTo()});
            }
            return mail;
        }

    }

    // ------======== Inspector =======---------
    public static class IllegalPackageException extends RuntimeException {
        public IllegalPackageException() {

        }

        public IllegalPackageException (String message) {

        }
    }

    public static class StolenPackageException extends RuntimeException {
        public StolenPackageException() {
        }

        public StolenPackageException (String message) {
        }
    }

    public static class Inspector implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail.getClass() == MailPackage.class){
                Package pckg =  ((MailPackage) mail).getContent();
                if (pckg.getContent().contains("weapons") || pckg.getContent().contains("banned substance")){
                    throw new IllegalPackageException();
                } else if (pckg.getContent().contains("stones")){
                    throw new StolenPackageException();
                }
            }
            return mail;
        }
    }

    // ------======== Ненадёжный сотрудник =======---------
    public static class UntrustworthyMailWorker implements MailService {
        private static MailService[] workers;
        private static RealMailService realWorker = new RealMailService();

        public UntrustworthyMailWorker (MailService[] w){
            workers = w;
        }

        public MailService getRealMailService() {
            return realWorker;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            Sendable processed = mail;

            for (int i = 0; i < workers.length; i++) {

                processed = workers[i].processMail(processed);

            }

            return realWorker.processMail(processed);

        }
    }
