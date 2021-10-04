package interfaces;

import java.io.File;
import java.io.FileNotFoundException;

public interface ITransformable {

    String transformarAString(File file) throws FileNotFoundException;
}
