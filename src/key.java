public class key {
    private String remoteEngineStart;
    private String keylessEntry;


    key(String remoteEngineStart, String keylessEntry){
        if (remoteEngineStart.isBlank() || remoteEngineStart.isEmpty()){
            this.remoteEngineStart = "Не указано";
        } else{
            this.remoteEngineStart = remoteEngineStart;
        }

        if (keylessEntry.isEmpty() || keylessEntry.isBlank()){
            this.keylessEntry = "Не указано";
        } else{
            this.keylessEntry = keylessEntry;
        }
    }

    public String getRemoteEngineStart() {
        return remoteEngineStart;
    }

    public String getKeylessEntry() {
        return keylessEntry;
    }
}
