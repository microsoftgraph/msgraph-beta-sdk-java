package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Define the rule when the admin wants the devices to be cleaned up. */
public class ManagedDeviceCleanupSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Number of days when the device has not contacted Intune. */
    private String _deviceInactivityBeforeRetirementInDays;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new managedDeviceCleanupSettings and sets the default values.
     * @return a void
     */
    public ManagedDeviceCleanupSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.managedDeviceCleanupSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceCleanupSettings
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceCleanupSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceCleanupSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the deviceInactivityBeforeRetirementInDays property value. Number of days when the device has not contacted Intune.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceInactivityBeforeRetirementInDays() {
        return this._deviceInactivityBeforeRetirementInDays;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDeviceCleanupSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("deviceInactivityBeforeRetirementInDays", (n) -> { currentObject.setDeviceInactivityBeforeRetirementInDays(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceInactivityBeforeRetirementInDays", this.getDeviceInactivityBeforeRetirementInDays());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deviceInactivityBeforeRetirementInDays property value. Number of days when the device has not contacted Intune.
     * @param value Value to set for the deviceInactivityBeforeRetirementInDays property.
     * @return a void
     */
    public void setDeviceInactivityBeforeRetirementInDays(@javax.annotation.Nullable final String value) {
        this._deviceInactivityBeforeRetirementInDays = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
