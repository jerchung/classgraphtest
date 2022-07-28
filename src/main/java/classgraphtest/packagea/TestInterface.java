package classgraphtest.packagea;

import classgraphtest.packageb.TestImplementationShouldNotInclude;
import com.google.inject.ImplementedBy;

@ImplementedBy(TestImplementationShouldNotInclude.class)
public interface TestInterface {
}
