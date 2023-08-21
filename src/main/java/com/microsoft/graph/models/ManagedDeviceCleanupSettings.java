package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Define the rule when the admin wants the devices to be cleaned up.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceCleanupSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of days when the device has not contacted Intune.
     */
    private String deviceInactivityBeforeRetirementInDays;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new managedDeviceCleanupSettings and sets the default values.
     */
    public ManagedDeviceCleanupSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceCleanupSettings
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceCleanupSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceCleanupSettings();
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
     * Gets the deviceInactivityBeforeRetirementInDays property value. Number of days when the device has not contacted Intune.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceInactivityBeforeRetirementInDays() {
        return this.deviceInactivityBeforeRetirementInDays;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("deviceInactivityBeforeRetirementInDays", (n) -> { this.setDeviceInactivityBeforeRetirementInDays(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceInactivityBeforeRetirementInDays", this.getDeviceInactivityBeforeRetirementInDays());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the deviceInactivityBeforeRetirementInDays property value. Number of days when the device has not contacted Intune.
     * @param value Value to set for the deviceInactivityBeforeRetirementInDays property.
     */
    public void setDeviceInactivityBeforeRetirementInDays(@jakarta.annotation.Nullable final String value) {
        this.deviceInactivityBeforeRetirementInDays = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
