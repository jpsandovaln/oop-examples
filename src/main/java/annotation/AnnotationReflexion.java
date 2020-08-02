package annotation;

/**
 * @author HP
 * @version 1.1
 */
@CustomMappingClass(path = "/api/v2")
public class AnnotationReflexion {

    @CustomMappingMethodGet(getPath = "/getValue")
    public void getValue() {
        System.out.println("method get.");
    }

    @CustomMappingMethodPost(postPath = "/postValue")
    public void postMethod() {
        System.out.println("method post.");
    }
}
