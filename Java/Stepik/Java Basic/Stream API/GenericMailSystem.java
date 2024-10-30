public static class MailMessage implements Sendable <String>  {
        private final String sender;
        private final String recipient;
        private final String message;

        public MailMessage(String sender, String recipient, String message)  {
            this.sender = sender;
            this.recipient = recipient;
            this.message = message;
        }

        public String getFrom() {
            return this.sender;
        }

        public String getTo() {
            return this.recipient;
        }

        public String getContent() {
            return this.message;
        }

    }

    public static class Salary implements Sendable <Integer> {
        private final int money;
        private final String company;
        private final String worker;
        public Salary(String company, String worker, int money) {
            this.money = money;
            this.company = company;
            this.worker = worker;
        }

        @Override
        public String getFrom() {
            return this.company;
        }
        @Override
        public String getTo() {
            return this.worker;
        }

        @Override
        public Integer getContent() {
            return this.money;
        }

    }

    public static class MailService <T> implements Consumer<Sendable <T>> {
        Map <String, List <T>> mailBox = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                return super.getOrDefault(key,Collections.emptyList());
            }
        };

        public Map<String, List<T>> getMailBox() {
            return mailBox;
        }

        @Override
        public void accept(Sendable<T> sendable) {
            List<T> contentList = mailBox.getOrDefault(sendable.getTo(), new ArrayList<>());
            contentList.add(sendable.getContent());
            mailBox.put(sendable.getTo(),contentList);
        }
    }

    public static interface Sendable <T> {
        String getFrom();
        String getTo();
        T getContent();
    }
