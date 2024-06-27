package Nestedinner_DZ;

public class Car {

    String carBrand;
    int speed, weight;

    public Car(String carBrand, int speed, int weight) {
        this.carBrand = carBrand;
        this.speed = speed;
        this.weight = weight;
    }
    public void start(){

        Engine engine = new Engine();
        Brake brake = new Brake();
        engine.isRunning();
        brake.isReleased();
    }
    public void stop(){
        Engine engine = new Engine();
        Brake brake = new Brake();
        brake.isPress();
        engine.isStop();
    }

    //внутренний класс, характеризующий составную часть автомобиля,

    private class Engine{
        //методы, описывающие поведение данного класса

        public void isRunning(){
            System.out.println("Автомобиль " + carBrand + " заведен.");
            System.out.println("Двигатель работает.");

            // создаем локальный класс

            class Piston{
                private void processEngine() {
                    System.out.println("1 такт: Впрыск топлива");
                    System.out.println("2 такт: Сжатие");
                    System.out.println("3 такт: Воспламенение и рабочий ход.");
                    System.out.println("4 такт: Выхлоп");
                }
            }
            Piston piston = new Piston();
            piston.processEngine();
        }
        public void isStop(){
            System.out.println("Двигатель не работает.");
        }
    }

    //внутренний класс, характеризующий составную часть автомобиля,
    private class Brake{

        //методы, описывающие поведение данного класса
        public void isPress(){
            System.out.println("Педаль тормоза нажата.");

            // создаем локальный класс
            class BrakePad {
                private void processBreak(){
                    System.out.println("Главный тормозной цилиндр создает давление в гидровлической системе.");
                    System.out.println("Давление передается к тормозным цилиндрам.");
                    System.out.println("Цилиндры прижимают колодки к тормозному диску.");
                    System.out.println("Трение между тормозными колодками и дисками замедляет вращение колес");
                }
            }
            BrakePad brakePad = new BrakePad();
            brakePad.processBreak();
        }
        public void isReleased(){
            System.out.println("Педаль тормоза отпущена");
        }
    }

}
