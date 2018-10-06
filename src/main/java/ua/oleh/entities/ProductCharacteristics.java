package ua.oleh.entities;

import javax.persistence.*;

@Entity
@Table(name = "product_characteristics", schema = "web_task", catalog = "")
public class ProductCharacteristics {
    private Integer id;
    private String productName;
    private String productCharacteristics;
    private Double price;
    private String mark;
    private String model;
    private String productClass;
    private String productType;
    private String cpuName;
    private String gpuName;
    private String ramName;
    private String romName;
    private String ramModel;
    private String romModel;
    private Integer ramSize;
    private Integer romSize;
    private String gabarites;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_characteristics")
    public String getProductCharacteristics() {
        return productCharacteristics;
    }

    public void setProductCharacteristics(String productCharacteristics) {
        this.productCharacteristics = productCharacteristics;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "mark")
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Basic
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "product_class")
    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    @Basic
    @Column(name = "product_type")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "cpu_name")
    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    @Basic
    @Column(name = "gpu_name")
    public String getGpuName() {
        return gpuName;
    }

    public void setGpuName(String gpuName) {
        this.gpuName = gpuName;
    }

    @Basic
    @Column(name = "ram_name")
    public String getRamName() {
        return ramName;
    }

    public void setRamName(String ramName) {
        this.ramName = ramName;
    }

    @Basic
    @Column(name = "rom_name")
    public String getRomName() {
        return romName;
    }

    public void setRomName(String romName) {
        this.romName = romName;
    }

    @Basic
    @Column(name = "ram_model")
    public String getRamModel() {
        return ramModel;
    }

    public void setRamModel(String ramModel) {
        this.ramModel = ramModel;
    }

    @Basic
    @Column(name = "rom_model")
    public String getRomModel() {
        return romModel;
    }

    public void setRomModel(String romModel) {
        this.romModel = romModel;
    }

    @Basic
    @Column(name = "ram_size")
    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    @Basic
    @Column(name = "rom_size")
    public Integer getRomSize() {
        return romSize;
    }

    public void setRomSize(Integer romSize) {
        this.romSize = romSize;
    }

    @Basic
    @Column(name = "gabarites")
    public String getGabarites() {
        return gabarites;
    }

    public void setGabarites(String gabarites) {
        this.gabarites = gabarites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductCharacteristics that = (ProductCharacteristics) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productCharacteristics != null ? !productCharacteristics.equals(that.productCharacteristics) : that.productCharacteristics != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (mark != null ? !mark.equals(that.mark) : that.mark != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (productClass != null ? !productClass.equals(that.productClass) : that.productClass != null) return false;
        if (productType != null ? !productType.equals(that.productType) : that.productType != null) return false;
        if (cpuName != null ? !cpuName.equals(that.cpuName) : that.cpuName != null) return false;
        if (gpuName != null ? !gpuName.equals(that.gpuName) : that.gpuName != null) return false;
        if (ramName != null ? !ramName.equals(that.ramName) : that.ramName != null) return false;
        if (romName != null ? !romName.equals(that.romName) : that.romName != null) return false;
        if (ramModel != null ? !ramModel.equals(that.ramModel) : that.ramModel != null) return false;
        if (romModel != null ? !romModel.equals(that.romModel) : that.romModel != null) return false;
        if (ramSize != null ? !ramSize.equals(that.ramSize) : that.ramSize != null) return false;
        if (romSize != null ? !romSize.equals(that.romSize) : that.romSize != null) return false;
        if (gabarites != null ? !gabarites.equals(that.gabarites) : that.gabarites != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productCharacteristics != null ? productCharacteristics.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (productClass != null ? productClass.hashCode() : 0);
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + (cpuName != null ? cpuName.hashCode() : 0);
        result = 31 * result + (gpuName != null ? gpuName.hashCode() : 0);
        result = 31 * result + (ramName != null ? ramName.hashCode() : 0);
        result = 31 * result + (romName != null ? romName.hashCode() : 0);
        result = 31 * result + (ramModel != null ? ramModel.hashCode() : 0);
        result = 31 * result + (romModel != null ? romModel.hashCode() : 0);
        result = 31 * result + (ramSize != null ? ramSize.hashCode() : 0);
        result = 31 * result + (romSize != null ? romSize.hashCode() : 0);
        result = 31 * result + (gabarites != null ? gabarites.hashCode() : 0);
        return result;
    }
}
