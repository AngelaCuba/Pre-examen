package Ejercico4AbstractF;

public class Est {
    private String name;
    private String ci;

    public Est() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void insciribirse(Materias materias) {

        IM materiaEstudiante = AbstFacM.make(materias);
        materiaEstudiante.showInfo();


    }



}
