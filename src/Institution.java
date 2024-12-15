class Institution {
    private String name;
    private String address;
    private int establishedYear;

    public Institution(String name, String address, int establishedYear) {
        this.name = name;
        this.address = address;
        this.establishedYear = establishedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    @Override
    public String toString() {
        return "Institution{name='" + name + "', address='" + address + "', establishedYear=" + establishedYear + "}";
    }
}
