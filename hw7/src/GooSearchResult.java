class GooSearchResult {
    private String url;

    public GooSearchResult(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    private String parseDomain(){
        String protocol = "://";
        int protocolIndex = url.indexOf(protocol);
        int startIndex = protocolIndex + protocol.length();
        int endIndex = url.indexOf("/", startIndex);
        if (endIndex == -1) {
            endIndex = url.length();
        }
        return url.substring(startIndex, endIndex);

    }

    public static void main(String[] args) {
        System.out.println(new GooSearchResult("https://test.com").parseDomain());
    }
}
