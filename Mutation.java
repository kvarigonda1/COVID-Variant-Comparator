public class Mutation {
    private int position;
    private char originalChar;
    private char mutatedChar;
    private boolean isAminoAcid;

    public Mutation (int position, char originalChar, char mutatedChar, boolean isAminoAcid) {
        this.position = position;
        this.originalChar = originalChar;
        this.mutatedChar = mutatedChar;
        this.isAminoAcid = isAminoAcid;
    }

    public int getPosition() {
        return position;
    }

    public char getOriginalChar() {
        return originalChar;
    }

    public char getMutatedChar() {
        return mutatedChar;
    }

    public boolean isAminoAcid() {
        return isAminoAcid;
    }

    @Override
    public String toString() {
        String type = isAminoAcid ? "AA" : "NT";
        return String.format("[%s Mutation] Pos: %d | %c → %c", type, position + 1, originalChar, mutatedChar);
    }
}
