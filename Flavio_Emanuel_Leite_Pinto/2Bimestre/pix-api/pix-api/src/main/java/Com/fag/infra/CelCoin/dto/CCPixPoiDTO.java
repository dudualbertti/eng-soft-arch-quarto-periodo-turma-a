package Com.fag.infra.CelCoin.dto;
import jakarta.json.bind.annotation.JsonbProperty;

public class CCPixPoiDTO {
    @JsonbProperty("transaction_data")
    private CCPixResponseTrxData trxData;

    public CCPixResponseTrxData getTrxData() {
        return trxData;
    }

    public void setTrxData(CCPixResponseTrxData trxData) {
        this.trxData = trxData;
    }

}

