public class Sequence {
    private String id;
    private String nucleotideSeq;
    private String proteinSeq;

    public Sequence(String id, String nucleotideSeq) {
        this.id = id;
        this.nucleotideSeq = nucleotideSeq;
    }
    public String getId() {
        return id;
    }
    public String getNucleotideSeq() {
        return nucleotideSeq;
    }
    public String getProteinSeq() {
        return proteinSeq;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNucleotideSeq(String nucleotideSeq) {
        this.nucleotideSeq = nucleotideSeq;
    }
    @Override
    public String toString() {
        return "ID: " + id + "\nNucleotide: " + nucleotideSeq;
    }
}
