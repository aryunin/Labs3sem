package Lab3;

enum Currency {
    USD {
        @Override
        public void showInfo() {
            System.out.print("Доллар США - денежная единица США, одна из основных резервных валют мира.");
        }
    },
    Euro {
        @Override
        public void showInfo() {
            System.out.print("Евро - официальная валюта 19 стран «еврозоны».");
        }
    },
    Ruble {
        @Override
        public void showInfo() {
            System.out.print("Рубль - название современных валют России (российский рубль), Белоруссии (белорусский рубль),\nа также непризнанного государства Приднестровская Молдавская Республика.");
        }
    },
    Pound {
        @Override
        public void showInfo() {
            System.out.print("Фунт - денежная единица, являющаяся: национальной валютой Соединённого Королевства\nВеликобритании и Северной Ирландии (Великобритании).");
        }
    },
    Hryvnia {
        @Override
        public void showInfo() {
            System.out.print("Гривна - национальная валюта Украины (с 1996 года), названная в честь древнерусской гривны.");
        }
    },
    Jena {
        @Override
        public void showInfo() {
            System.out.print("Иена - денежная единица Японии, одна из основных резервных валют мира.");
        }
    };

    abstract public void showInfo();
}
