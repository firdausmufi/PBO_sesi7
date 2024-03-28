public class App {

    public static void main(String[] args) throws Exception {
        Mahasiswa<String> mhs1 = new Mahasiswa<String>("Firdaus", "2022");
        Mahasiswa<Integer> mhs2 = new Mahasiswa<Integer>("Muhammad", 2022);
        Mahasiswa<Double> mhs3 = new Mahasiswa<Double>("Firdaus", 2022.0);

        mhs1.info();
        mhs2.info();
        mhs3.info();
    }
    
}
