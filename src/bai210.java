 class CentralHub {
    public void registerDevice(SmartLight light) {
        System.out.println(
                "[HUB] Đang kết nối với thiết bị: " + light.getName()
        );
    }
}
class SmartLight {
    private String id;
    private String name;
    private int brightness;

    public SmartLight(String id, String name, int brightness) {
        this.id = id;
        this.name = name;
        this.setBrightness(brightness);
    }

    public SmartLight(String id, String name) {
        this(id, name, 50);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else {
            this.brightness = brightness;
        }
    }

    public void setBrightness(String preset) {
        if ("MAX".equals(preset)) {
            this.setBrightness(100);
        } else if ("MIN".equals(preset)) {
            this.setBrightness(10);
        } else if ("ECO".equals(preset)) {
            this.setBrightness(30);
        } else {
            System.err.println("Preset không hợp lệ: " + preset);
        }
    }

    public void connectToHub(CentralHub hub) {
        hub.registerDevice(this);
    }

    public static void main(String[] args) {
        CentralHub hub = new CentralHub();

        SmartLight l1 =
                new SmartLight("L01", "Đèn phòng khách", 80);
        SmartLight l2 =
                new SmartLight("L02", "Đèn ngủ");

        l2.setBrightness("ECO");

        l1.connectToHub(hub);
        l2.connectToHub(hub);

        System.out.println(l1.getName()
                + " brightness = " + l1.getBrightness());
        System.out.println(l2.getName()
                + " brightness = " + l2.getBrightness());
    }
}
