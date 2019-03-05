
package Objects;

public class Paciente 
{ 
private String m_strNombre;
private String m_strApellidos;
private String m_strGender;
private String m_strSymptoms;

private int m_iBirthyear;
private int m_iBirthMonth;
private int m_BirthDay;

    public Paciente(String m_strNombre, String m_strApellidos, String m_strGender, String m_strSymptoms, int m_iBirthyear, int m_iBirthMonth, int m_BirthDay) {
        this.m_strNombre = m_strNombre;
        this.m_strApellidos = m_strApellidos;
        this.m_strGender = m_strGender;
        this.m_strSymptoms = m_strSymptoms;
        this.m_iBirthyear = m_iBirthyear;
        this.m_iBirthMonth = m_iBirthMonth;
        this.m_BirthDay = m_BirthDay;
    }

    public String getM_strNombre() {
        return m_strNombre;
    }

    public void setM_strNombre(String m_strNombre) {
        this.m_strNombre = m_strNombre;
    }

    public String getM_strApellidos() {
        return m_strApellidos;
    }

    public void setM_strApellidos(String m_strApellidos) {
        this.m_strApellidos = m_strApellidos;
    }

    public String getM_strGender() {
        return m_strGender;
    }

    public void setM_strGender(String m_strGender) {
        this.m_strGender = m_strGender;
    }

    public String getM_strSymptoms() {
        return m_strSymptoms;
    }

    public void setM_strSymptoms(String m_strSymptoms) {
        this.m_strSymptoms = m_strSymptoms;
    }

    public int getM_iBirthyear() {
        return m_iBirthyear;
    }

    public void setM_iBirthyear(int m_iBirthyear) {
        this.m_iBirthyear = m_iBirthyear;
    }

    public int getM_iBirthMonth() {
        return m_iBirthMonth;
    }

    public void setM_iBirthMonth(int m_iBirthMonth) {
        this.m_iBirthMonth = m_iBirthMonth;
    }

    public int getM_BirthDay() {
        return m_BirthDay;
    }

    public void setM_BirthDay(int m_BirthDay) {
        this.m_BirthDay = m_BirthDay;
    }

}
