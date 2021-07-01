package gun56.Soru3;

public class TxtFileI implements IReadFile {
    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String close() {
        return "clasing.txt";
    }
}
