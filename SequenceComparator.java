import java.util.*;
public class SequenceComparator {
    public static ArrayList<Mutation> compareNucleotideSequences(Sequence ref, Sequence query) {
        String refSeq = ref.getNucleotideSeq();
        String querySeq = query.getNucleotideSeq();
        ArrayList<Mutation> mutations = new ArrayList<>();

        int len = Math.min(refSeq.length(), querySeq.length());

        for (int i = 0; i < len; i++) {
            char refChar = refSeq.charAt(i);
            char queryChar = querySeq.charAt(i);
            if (refChar != queryChar) {
                mutations.add(new Mutation(i, refChar, queryChar, false));
            }
        }
        return mutations;
    }
    public static ArrayList<Mutation> compareProteinSequences(Sequence ref, Sequence query) {
        String refProt = ref.getProteinSeq();
        String queryProt = query.getProteinSeq();
        ArrayList<Mutation> mutations = new ArrayList<>();

        int len = Math.min(refProt.length(), queryProt.length());

        for (int i = 0; i < len; i++) {
            char refChar = refProt.charAt(i);
            char queryChar = queryProt.charAt(i);
            if (refChar != queryChar) {
                mutations.add(new Mutation(i, refChar, queryChar, true));
            }
        }

        return mutations;
    }
}
