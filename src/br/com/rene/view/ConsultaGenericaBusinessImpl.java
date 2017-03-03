/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rene.view;

/**
 *
 * @author Rene_sever
 */
public class ConsultaGenericaBusinessImpl {
    

        /*implements ConsultaGenericaBusiness {
 
    @SuppressWarnings("unchecked")
    public ConsultaGenerica retornaConsultaGenericaByBean(Class c) throws BusinessException {
        ConsultaGenerica cgb = new ConsultaGenerica();
               
        DaoFactory daoFactory = DaoFactory.getInstance();
               
                // percorre todos os atributos declarados na classe e superclasses.
                for (Class clazz = c; clazz != null; clazz = clazz.getSuperclass()) {
                        for (Field field : clazz.getDeclaredFields()) {
                                String fieldName = field.getName();
                                Class fieldType = field.getType();
                               
                                AtributoValor av = null;
                               
                                // se o atributo é um tipo complexo que está referenciado a uma lista então possui a
                                // anotação @ManyToOne da  JPA.
                                if (isAnnotationPresent(field, ManyToOne.class)) {
                                        // a partir do tipo genérico retorna a respectiva Dao e obtem a quantidade de registros.
                                        Dao dao = daoFactory.getDao(fieldType);
                                       
                                        // se estiver anotado com FewElements indica que está relacionado à uma "lista de poucos itens".
                                        if (isAnnotationPresent(field, FewElements.class)) {
                                                av = new AtributoValorTipoLista();
                                                av.setTipo(TipoAtributoValor.RELACIONAMENTO_LISTA);
                                               
                                                List listaOpcoes = dao.retornaTudo();
                                               
                                                if (listaOpcoes.size() > 0) {
                                                        // a partir do primeiro elemento da lista, descobre qual o tipo do objeto que ela agrega.
                                                        Class objectGenericType = listaOpcoes.get(0).getClass();
                                                       
                                                        // obtem a definição dos métodos acessores dos atributos de Id e Descrição.
                                                        Method methodGetId = getIdFieldAccessor(objectGenericType);
                                                        Method methodGetDescription = getDescriptionFieldAccessor(objectGenericType);
                                               
                                                        for (Object object : listaOpcoes) {
                                                                Object idValue = getValueFromField(methodGetId, object);
                                                                String descriptionValue = (String)getValueFromField(methodGetDescription, object);
                                                               
                                                                ((AtributoValorTipoLista)av).addOpcao(new Long(idValue.toString()), descriptionValue);
                                    }
                                                }
                                        }
                                        else {
                                                // já que é uma lista com muitos elementos então define como um atributo complexo
                                                // e será buscado através de uma nova consulta.
                                                av = new AtributoValor();
                                                av.setTipo(TipoAtributoValor.RELACIONAMENTO_COMPLEXO);
                                        }                            
                                }
                                else if (isAnnotationPresent(field, OneToMany.class)) {
                                        // atributos anotados com OneToMany não devem ser listados.
                                }
                                else if (fieldType.isEnum()){
                                        av = new AtributoValorTipoLista();
                                        av.setTipo(TipoAtributoValor.ENUMERACAO);
                                       
                                        for (Object enumConstant : fieldType.getEnumConstants()) {
                                try {
                                        Long idValue = new Long(String.valueOf(enumConstant.getClass().getMethod("ordinal").invoke(enumConstant)));
                                        String descriptionValue = enumConstant.toString();
                                       
                                        ((AtributoValorTipoLista)av).addOpcao(idValue, descriptionValue);
                        } catch (Exception e) {
                            throw new DevTimeException(e.toString());
                        }
                                } // for opções
                                }
                                else {
                                        // o atributo é um tipo primitivo (ou um Wrapper)
                                        av = new AtributoValor();
                                        av.setTipo(TipoAtributoValor.PRIMITIVO);
                                } // end else
                               
                                av.setNomeAtributo(fieldName);
                                av.setTipoAtributo(fieldType);
                               
                                cgb.addAtributoValor(av);
                } // end foreach
            } // end for
                return cgb;
    }
       
        @SuppressWarnings("unchecked")
    private Method getIdFieldAccessor(Class c) {
                try {
                        for (Class clazz = c; clazz != null; clazz = clazz.getSuperclass()) {
                                for (Method method : clazz.getDeclaredMethods()) {
                                        if (method.isAnnotationPresent(Id.class)) {
                                                return method;
                                        }
                                }
                        }
        } catch (Exception e) {
            throw new DevTimeException(e.toString());
        }
       
        throw new DevTimeException("erro.janela.IdAnnotationMissing");
        }
       
        @SuppressWarnings("unchecked")
    private Method getDescriptionFieldAccessor(Class c) {
                for (Class clazz = c; clazz != null; clazz = clazz.getSuperclass()) {
                        for (Method method : clazz.getDeclaredMethods()) {
                                if (method.isAnnotationPresent(DescriptionField.class)) {
                                        return method;
                                }
                        }
                }
               
                throw new DevTimeException("erro.janela.descriptionFieldAnnotationMissing");
        }
       
        // obtem o valor do atributo de instância através do seu método get.
        private Object getValueFromField(Method method, Object object) {
                try {
                return method.invoke(object);
        } catch (Exception e) {
            throw new DevTimeException(e.toString());
        }
        }
       
        @SuppressWarnings("unchecked")
    private boolean isAnnotationPresent(Field field, Class annotation) {
                if (field.isAnnotationPresent(annotation)) {
                        return true;
                }
                else { // procura a anotação no seu getter.
                        Class ownerClass = field.getDeclaringClass();
                       
                        // descobre qual o nome do método a ser obtido.
                        String fieldName = field.getName();
                        String firstChar = String.valueOf(fieldName.charAt(0)).toUpperCase();
                        fieldName = firstChar + fieldName.substring(1);
                        String getterName = "get" + fieldName;
                       
                        try {
                    Method methodDef = ownerClass.getMethod(getterName);
                    return (methodDef.isAnnotationPresent(annotation));
            } catch (Exception e) {
                throw new DevTimeException(e.toString());
            }
                }
        }
*/
}