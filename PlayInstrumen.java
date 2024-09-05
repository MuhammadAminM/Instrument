public class PlayInstrumen {
    public static void main(String[] args) {
        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 250.9);

        a.setType("Guitar");
        a.setPrice(101.5);
        a.print();
        System.out.println("-------------");  
        b.print();
        System.out.println("-------------");
        c.print();
        System.out.println("-------------");
        

        if(a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Harga Guitar paling murah");
        }else if(b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Harga Piano paling mahal");
        }else {
            System.out.println("Harga Violin paling mahal");
        }

        if(a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Harga Guitar paling murah");
        }else if(b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Harga Piano paling mahal");
        }else {
            System.out.println("Harga Violin paling mahal");
        }
    }
    
}
