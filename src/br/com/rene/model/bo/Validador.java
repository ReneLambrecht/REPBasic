package br.com.rene.model.bo;

/**
 *
 * @author Rene
 */
public interface Validador<T> {
    
    void validador(T t) throws Exception;
    
}
