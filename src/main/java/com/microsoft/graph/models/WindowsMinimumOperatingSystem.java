package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The minimum operating system required for a Windows mobile app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Windows version 10.0 or later.
     */
    private Boolean v100;
    /**
     * Windows 10 1607 or later.
     */
    private Boolean v101607;
    /**
     * Windows 10 1703 or later.
     */
    private Boolean v101703;
    /**
     * Windows 10 1709 or later.
     */
    private Boolean v101709;
    /**
     * Windows 10 1803 or later.
     */
    private Boolean v101803;
    /**
     * Windows 10 1809 or later.
     */
    private Boolean v101809;
    /**
     * Windows 10 1903 or later.
     */
    private Boolean v101903;
    /**
     * Windows 10 1909 or later.
     */
    private Boolean v101909;
    /**
     * Windows 10 2004 or later.
     */
    private Boolean v102004;
    /**
     * Windows 10 21H1 or later.
     */
    private Boolean v1021H1;
    /**
     * Windows 10 2H20 or later.
     */
    private Boolean v102H20;
    /**
     * Windows version 8.0 or later.
     */
    private Boolean v80;
    /**
     * Windows version 8.1 or later.
     */
    private Boolean v81;
    /**
     * Instantiates a new windowsMinimumOperatingSystem and sets the default values.
     */
    public WindowsMinimumOperatingSystem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsMinimumOperatingSystem
     */
    @jakarta.annotation.Nonnull
    public static WindowsMinimumOperatingSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsMinimumOperatingSystem();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("v10_0", (n) -> { this.setV100(n.getBooleanValue()); });
        deserializerMap.put("v10_1607", (n) -> { this.setV101607(n.getBooleanValue()); });
        deserializerMap.put("v10_1703", (n) -> { this.setV101703(n.getBooleanValue()); });
        deserializerMap.put("v10_1709", (n) -> { this.setV101709(n.getBooleanValue()); });
        deserializerMap.put("v10_1803", (n) -> { this.setV101803(n.getBooleanValue()); });
        deserializerMap.put("v10_1809", (n) -> { this.setV101809(n.getBooleanValue()); });
        deserializerMap.put("v10_1903", (n) -> { this.setV101903(n.getBooleanValue()); });
        deserializerMap.put("v10_1909", (n) -> { this.setV101909(n.getBooleanValue()); });
        deserializerMap.put("v10_2004", (n) -> { this.setV102004(n.getBooleanValue()); });
        deserializerMap.put("v10_21H1", (n) -> { this.setV1021H1(n.getBooleanValue()); });
        deserializerMap.put("v10_2H20", (n) -> { this.setV102H20(n.getBooleanValue()); });
        deserializerMap.put("v8_0", (n) -> { this.setV80(n.getBooleanValue()); });
        deserializerMap.put("v8_1", (n) -> { this.setV81(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the v10_0 property value. Windows version 10.0 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV100() {
        return this.v100;
    }
    /**
     * Gets the v10_1607 property value. Windows 10 1607 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV101607() {
        return this.v101607;
    }
    /**
     * Gets the v10_1703 property value. Windows 10 1703 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV101703() {
        return this.v101703;
    }
    /**
     * Gets the v10_1709 property value. Windows 10 1709 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV101709() {
        return this.v101709;
    }
    /**
     * Gets the v10_1803 property value. Windows 10 1803 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV101803() {
        return this.v101803;
    }
    /**
     * Gets the v10_1809 property value. Windows 10 1809 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV101809() {
        return this.v101809;
    }
    /**
     * Gets the v10_1903 property value. Windows 10 1903 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV101903() {
        return this.v101903;
    }
    /**
     * Gets the v10_1909 property value. Windows 10 1909 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV101909() {
        return this.v101909;
    }
    /**
     * Gets the v10_2004 property value. Windows 10 2004 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV102004() {
        return this.v102004;
    }
    /**
     * Gets the v10_21H1 property value. Windows 10 21H1 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV1021H1() {
        return this.v1021H1;
    }
    /**
     * Gets the v10_2H20 property value. Windows 10 2H20 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV102H20() {
        return this.v102H20;
    }
    /**
     * Gets the v8_0 property value. Windows version 8.0 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV80() {
        return this.v80;
    }
    /**
     * Gets the v8_1 property value. Windows version 8.1 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV81() {
        return this.v81;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("v10_0", this.getV100());
        writer.writeBooleanValue("v10_1607", this.getV101607());
        writer.writeBooleanValue("v10_1703", this.getV101703());
        writer.writeBooleanValue("v10_1709", this.getV101709());
        writer.writeBooleanValue("v10_1803", this.getV101803());
        writer.writeBooleanValue("v10_1809", this.getV101809());
        writer.writeBooleanValue("v10_1903", this.getV101903());
        writer.writeBooleanValue("v10_1909", this.getV101909());
        writer.writeBooleanValue("v10_2004", this.getV102004());
        writer.writeBooleanValue("v10_21H1", this.getV1021H1());
        writer.writeBooleanValue("v10_2H20", this.getV102H20());
        writer.writeBooleanValue("v8_0", this.getV80());
        writer.writeBooleanValue("v8_1", this.getV81());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the v10_0 property value. Windows version 10.0 or later.
     * @param value Value to set for the v10_0 property.
     */
    public void setV100(@jakarta.annotation.Nullable final Boolean value) {
        this.v100 = value;
    }
    /**
     * Sets the v10_1607 property value. Windows 10 1607 or later.
     * @param value Value to set for the v10_1607 property.
     */
    public void setV101607(@jakarta.annotation.Nullable final Boolean value) {
        this.v101607 = value;
    }
    /**
     * Sets the v10_1703 property value. Windows 10 1703 or later.
     * @param value Value to set for the v10_1703 property.
     */
    public void setV101703(@jakarta.annotation.Nullable final Boolean value) {
        this.v101703 = value;
    }
    /**
     * Sets the v10_1709 property value. Windows 10 1709 or later.
     * @param value Value to set for the v10_1709 property.
     */
    public void setV101709(@jakarta.annotation.Nullable final Boolean value) {
        this.v101709 = value;
    }
    /**
     * Sets the v10_1803 property value. Windows 10 1803 or later.
     * @param value Value to set for the v10_1803 property.
     */
    public void setV101803(@jakarta.annotation.Nullable final Boolean value) {
        this.v101803 = value;
    }
    /**
     * Sets the v10_1809 property value. Windows 10 1809 or later.
     * @param value Value to set for the v10_1809 property.
     */
    public void setV101809(@jakarta.annotation.Nullable final Boolean value) {
        this.v101809 = value;
    }
    /**
     * Sets the v10_1903 property value. Windows 10 1903 or later.
     * @param value Value to set for the v10_1903 property.
     */
    public void setV101903(@jakarta.annotation.Nullable final Boolean value) {
        this.v101903 = value;
    }
    /**
     * Sets the v10_1909 property value. Windows 10 1909 or later.
     * @param value Value to set for the v10_1909 property.
     */
    public void setV101909(@jakarta.annotation.Nullable final Boolean value) {
        this.v101909 = value;
    }
    /**
     * Sets the v10_2004 property value. Windows 10 2004 or later.
     * @param value Value to set for the v10_2004 property.
     */
    public void setV102004(@jakarta.annotation.Nullable final Boolean value) {
        this.v102004 = value;
    }
    /**
     * Sets the v10_21H1 property value. Windows 10 21H1 or later.
     * @param value Value to set for the v10_21H1 property.
     */
    public void setV1021H1(@jakarta.annotation.Nullable final Boolean value) {
        this.v1021H1 = value;
    }
    /**
     * Sets the v10_2H20 property value. Windows 10 2H20 or later.
     * @param value Value to set for the v10_2H20 property.
     */
    public void setV102H20(@jakarta.annotation.Nullable final Boolean value) {
        this.v102H20 = value;
    }
    /**
     * Sets the v8_0 property value. Windows version 8.0 or later.
     * @param value Value to set for the v8_0 property.
     */
    public void setV80(@jakarta.annotation.Nullable final Boolean value) {
        this.v80 = value;
    }
    /**
     * Sets the v8_1 property value. Windows version 8.1 or later.
     * @param value Value to set for the v8_1 property.
     */
    public void setV81(@jakarta.annotation.Nullable final Boolean value) {
        this.v81 = value;
    }
}
