

public class CelcoinPixDTO{
    String clientRequestId;
    MerchantDTO merchant;
    String type;

    public String getclientRequestId() {
        return clientRequestId;
    }
    public void setclientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }
    public String merchant() {
        return merchant;
    }
    public void setmerchant(MerchantDTO merchant) {
        this.merchant = merchant;
    }
    public String gettype() {
        return type;
    }
    public void settype(String type) {
        this.type = type;
    }
}