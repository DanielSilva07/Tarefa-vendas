package br.com.danielsilva.annotations;

    import java.lang.annotation.*;


    @Documented
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TipoChave {

        String value();
    }
