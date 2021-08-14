package pl.grzesk075.springbootdemo2.sandbox.soap;

public class InfoWS {

    public String getInfo(InfoType infoType){
        switch (infoType){
            case NEWS:
                return "Breaking news";
            case RUMORS:
                return "Celebrities wear red shoes";
            default:
                throw new IllegalArgumentException("Unsupported info type");
        }
    }
}
