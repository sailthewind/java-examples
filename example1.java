      import java.util.ArrayList;
      import java.util.List;

      class Main {
          public static int findSurvivor(int totalCandidates, int k) {
              List<Integer> candidates = new ArrayList<>();

              // Initialize the list of candidates
              for (int i = 1; i <= totalCandidates; i++) {
                  candidates.add(i);
              }

              int index = 0;
              while (candidates.size() > 1) {
                  // Find the next candidate to eliminate
                  index = (index + k - 1) % candidates.size();
                  candidates.remove(index);
              }

              // The last remaining candidate is the survivor
              return candidates.get(0);
          }

          public static void main(String[] args) {
              int totalCandidates = 10; // Change this to the total number of candidates.
              int k = 3; // Change this to the count for elimination.

              int survivor = findSurvivor(totalCandidates, k);
              System.out.println("The survivor is candidate #" + survivor);
          }
      }
