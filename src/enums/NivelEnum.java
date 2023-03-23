package enums;

public enum NivelEnum {
    FACIL(1), MEDIO(2), DIFICIL(3);
    private Integer nivelTypeId;
    NivelEnum(Integer nivelId){
        this.nivelTypeId = nivelId;
    }

    public Integer getNivelTypeId(){
        return this.nivelTypeId;
    }
}



