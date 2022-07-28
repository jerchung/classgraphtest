package classgraphtest;

import java.util.Arrays;
import java.util.List;

import classgraphtest.packagea.TestInterface;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;

public class ClassGraphTest {
  public static void main(String[] args) {
    List<Class<TestInterface>> classes;
    try(ScanResult result =
            new ClassGraph()
                .enableAllInfo()
                .acceptPackages("classgraphtest.packagec")
                .scan()) {
      classes = result
          .getClassesImplementing(TestInterface.class.getName())
          .loadClasses(TestInterface.class);
    }

    System.out.println(Arrays.toString(classes.toArray()));
  }
}
