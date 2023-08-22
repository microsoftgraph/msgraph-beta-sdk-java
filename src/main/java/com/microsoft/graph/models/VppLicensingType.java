package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for iOS Volume-Purchased Program (Vpp) Licensing Type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VppLicensingType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Whether the program supports the device licensing type.
     */
    private Boolean supportDeviceLicensing;
    /**
     * Whether the program supports the device licensing type.
     */
    private Boolean supportsDeviceLicensing;
    /**
     * Whether the program supports the user licensing type.
     */
    private Boolean supportsUserLicensing;
    /**
     * Whether the program supports the user licensing type.
     */
    private Boolean supportUserLicensing;
    /**
     * Instantiates a new vppLicensingType and sets the default values.
     */
    public VppLicensingType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vppLicensingType
     */
    @jakarta.annotation.Nonnull
    public static VppLicensingType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppLicensingType();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("supportDeviceLicensing", (n) -> { this.setSupportDeviceLicensing(n.getBooleanValue()); });
        deserializerMap.put("supportsDeviceLicensing", (n) -> { this.setSupportsDeviceLicensing(n.getBooleanValue()); });
        deserializerMap.put("supportsUserLicensing", (n) -> { this.setSupportsUserLicensing(n.getBooleanValue()); });
        deserializerMap.put("supportUserLicensing", (n) -> { this.setSupportUserLicensing(n.getBooleanValue()); });
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
     * Gets the supportDeviceLicensing property value. Whether the program supports the device licensing type.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportDeviceLicensing() {
        return this.supportDeviceLicensing;
    }
    /**
     * Gets the supportsDeviceLicensing property value. Whether the program supports the device licensing type.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportsDeviceLicensing() {
        return this.supportsDeviceLicensing;
    }
    /**
     * Gets the supportsUserLicensing property value. Whether the program supports the user licensing type.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportsUserLicensing() {
        return this.supportsUserLicensing;
    }
    /**
     * Gets the supportUserLicensing property value. Whether the program supports the user licensing type.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportUserLicensing() {
        return this.supportUserLicensing;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("supportDeviceLicensing", this.getSupportDeviceLicensing());
        writer.writeBooleanValue("supportsDeviceLicensing", this.getSupportsDeviceLicensing());
        writer.writeBooleanValue("supportsUserLicensing", this.getSupportsUserLicensing());
        writer.writeBooleanValue("supportUserLicensing", this.getSupportUserLicensing());
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
     * Sets the supportDeviceLicensing property value. Whether the program supports the device licensing type.
     * @param value Value to set for the supportDeviceLicensing property.
     */
    public void setSupportDeviceLicensing(@jakarta.annotation.Nullable final Boolean value) {
        this.supportDeviceLicensing = value;
    }
    /**
     * Sets the supportsDeviceLicensing property value. Whether the program supports the device licensing type.
     * @param value Value to set for the supportsDeviceLicensing property.
     */
    public void setSupportsDeviceLicensing(@jakarta.annotation.Nullable final Boolean value) {
        this.supportsDeviceLicensing = value;
    }
    /**
     * Sets the supportsUserLicensing property value. Whether the program supports the user licensing type.
     * @param value Value to set for the supportsUserLicensing property.
     */
    public void setSupportsUserLicensing(@jakarta.annotation.Nullable final Boolean value) {
        this.supportsUserLicensing = value;
    }
    /**
     * Sets the supportUserLicensing property value. Whether the program supports the user licensing type.
     * @param value Value to set for the supportUserLicensing property.
     */
    public void setSupportUserLicensing(@jakarta.annotation.Nullable final Boolean value) {
        this.supportUserLicensing = value;
    }
}
