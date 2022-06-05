package trainning.banksystem;

public class BeneficiaryNumList {
    private int idBenefic;
    private String beneficNum;

    private String beneficName;

    public BeneficiaryNumList(int idBenefic, String beneficNum, String beneficName) {
        this.idBenefic = idBenefic;
        this.beneficNum = beneficNum;
        this.beneficName = beneficName;
    }

    public int getIdBenefic() {
        return idBenefic;
    }

    public void setIdBenefic(int idBenefic) {
        this.idBenefic = idBenefic;
    }

    public String getBeneficNum() {
        return beneficNum;
    }

    public void setBeneficNum(String beneficNum) {
        this.beneficNum = beneficNum;
    }

    public String toString() {
        return idBenefic + " - " + beneficNum;
    }
}
