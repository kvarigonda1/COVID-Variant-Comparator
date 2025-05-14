import java.util.HashMap;
public class Sequence {
    private String id;
    private String nucleotideSeq;
    private String proteinSeq;

    public Sequence(String id, String nucleotideSeq) {
        this.id = id;
        this.nucleotideSeq = nucleotideSeq;
        translate();
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

    private HashMap<String, String> getCodonTable() {
        HashMap<String, String> codons = new HashMap<>();
        codons.put("TTT", "F"); codons.put("TTC", "F");
        codons.put("TTA", "L"); codons.put("TTG", "L");
        codons.put("CTT", "L"); codons.put("CTC", "L");
        codons.put("CTA", "L"); codons.put("CTG", "L");
        codons.put("ATT", "I"); codons.put("ATC", "I");
        codons.put("ATA", "I"); codons.put("ATG", "M");
        codons.put("GTT", "V"); codons.put("GTC", "V");
        codons.put("GTA", "V"); codons.put("GTG", "V");
        codons.put("TCT", "S"); codons.put("TCC", "S");
        codons.put("TCA", "S"); codons.put("TCG", "S");
        codons.put("CCT", "P"); codons.put("CCC", "P");
        codons.put("CCA", "P"); codons.put("CCG", "P");
        codons.put("ACT", "T"); codons.put("ACC", "T");
        codons.put("ACA", "T"); codons.put("ACG", "T");
        codons.put("GCT", "A"); codons.put("GCC", "A");
        codons.put("GCA", "A"); codons.put("GCG", "A");
        codons.put("TAT", "Y"); codons.put("TAC", "Y");
        codons.put("TAA", "*"); codons.put("TAG", "*");
        codons.put("CAT", "H"); codons.put("CAC", "H");
        codons.put("CAA", "Q"); codons.put("CAG", "Q");
        codons.put("AAT", "N"); codons.put("AAC", "N");
        codons.put("AAA", "K"); codons.put("AAG", "K");
        codons.put("GAT", "D"); codons.put("GAC", "D");
        codons.put("GAA", "E"); codons.put("GAG", "E");
        codons.put("TGT", "C"); codons.put("TGC", "C");
        codons.put("TGA", "*"); codons.put("TGG", "W");
        codons.put("CGT", "R"); codons.put("CGC", "R");
        codons.put("CGA", "R"); codons.put("CGG", "R");
        codons.put("AGT", "S"); codons.put("AGC", "S");
        codons.put("AGA", "R"); codons.put("AGG", "R");
        codons.put("GGT", "G"); codons.put("GGC", "G");
        codons.put("GGA", "G"); codons.put("GGG", "G");
        return codons;
    }

    public void translate() {
        StringBuilder protein = new StringBuilder();
        HashMap<String, String> codonTable = getCodonTable();

        for (int i = 0; i + 2 < nucleotideSeq.length(); i += 3) {
            String codon = nucleotideSeq.substring(i, i + 3).toUpperCase();
            protein.append(codonTable.getOrDefault(codon, "X"));
        }
        this.proteinSeq = protein.toString();
    }
}
