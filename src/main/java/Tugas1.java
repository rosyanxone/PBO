public class Tugas1 {
    static void nomor1() {
        System.out.println("Saya Pasti Bisa");
        System.out.println("Pemrograman itu menyenangkan");
        System.out.println("Aku Bahagia Kuliah di Informatika");
    }
    
    static void nomor2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Belajar JAVA itu Menyenangkan");
        }
    }
    
    static void nomor3() {
        int x = 13;
        int y = x;
        for (int i=1; i<=4; i++){
            for (int j=1; j<=35; j++){

                // Membuat J
                if(i < 3 && j == 5 || i == 3 && (j == 1 || j == 4) 
                        || i == 4 && (j == 2 || j == 3)) {
                    System.out.print("J");
                }
                
                
                // Membuat A
                if ((i==2 && j==11) || (i==4 && j==12) || (i+j==12 && i < 3) || 
                (i+j==11 && i>2) ||  (i == 3 && (j > 7 && j < 11) ) ) {
                    System.out.print("A");
                }
                

                // Membuat V
                if(j-13==i && i>2 || i==3 && j==15 || i==1 && j==16 || 
                i+j==22 && i < 2 || i==2 && j==16 || i==2 && j==19) {
                    System.out.print("V");
                }


                // Membuat A
                if ((i==j-24 && i==2) || (i==j-18 && i>2) || (i+j==26 && i==2) ||
                (i==4&& j==28) || (i == 3 && (j > 20 && j < 26) || (i==1 && j==26))) {
                    System.out.print("A");
                }
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    
    static void nomor4() {
        System.out.println("a \ta^2 \ta^3");
        int i=0;
        while(i<4) {
            i++;
            int x = i*i;
            int y = i*i*i;
            System.out.println(i+" \t"+x+" \t"+y+" \t");
        }
    }
    
    
    static void nomor5() {
        int x = 1, y = 1;
        do{
            x++;
            y+=x;
        }while(x<9);
        System.out.println("Total dari penjumlahan 9 bilangan pertama adalah: "+y);
    }
    
    
    public static void main(String[] args) {
        nomor1();
        System.out.println("\n");
        nomor2();
        System.out.println("\n");
        nomor3();
        System.out.println("\n");
        nomor4();
        System.out.println("\n");
        nomor5();
    }
}