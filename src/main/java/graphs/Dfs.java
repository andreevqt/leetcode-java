package graphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;
/**
 * 
 * 
 * 
 *  
 * 
 * 
 * 
 */

public class Dfs {

  public static void main(String[] args) {

    var sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println(n);
    System.out.println(m);

    var g = new ArrayList<>(Stream.generate(ArrayList<Integer>::new).limit(n).toList());
    var used = new boolean[n];
    System.out.println(g);

    for (int i = 0; i < m; i++) {
      int from = 0, to = 0;
      from = sc.nextInt();
      to = sc.nextInt();
      // from--;
      // to--;
      g.get(from).add(to);
      g.get(to).add(from);
    }

    System.out.println(g);

    sc.close();

  }

}
