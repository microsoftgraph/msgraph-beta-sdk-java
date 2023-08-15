package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationDependentOn implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identifier of parent setting/ parent setting option dependent on
     */
    private String dependentOn;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Identifier of parent setting/ parent setting id dependent on
     */
    private String parentSettingId;
    /**
     * Instantiates a new deviceManagementConfigurationDependentOn and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationDependentOn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationDependentOn
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationDependentOn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationDependentOn();
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
     * Gets the dependentOn property value. Identifier of parent setting/ parent setting option dependent on
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDependentOn() {
        return this.dependentOn;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("dependentOn", (n) -> { this.setDependentOn(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parentSettingId", (n) -> { this.setParentSettingId(n.getStringValue()); });
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
     * Gets the parentSettingId property value. Identifier of parent setting/ parent setting id dependent on
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getParentSettingId() {
        return this.parentSettingId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dependentOn", this.getDependentOn());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("parentSettingId", this.getParentSettingId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dependentOn property value. Identifier of parent setting/ parent setting option dependent on
     * @param value Value to set for the dependentOn property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDependentOn(@jakarta.annotation.Nullable final String value) {
        this.dependentOn = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the parentSettingId property value. Identifier of parent setting/ parent setting id dependent on
     * @param value Value to set for the parentSettingId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setParentSettingId(@jakarta.annotation.Nullable final String value) {
        this.parentSettingId = value;
    }
}
