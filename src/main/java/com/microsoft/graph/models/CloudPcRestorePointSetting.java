package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcRestorePointSetting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The time interval in hours to take snapshots (restore points) of a Cloud PC automatically. Possible values are 4, 6, 12, 16, and 24. The default frequency is 12 hours. */
    private Integer _frequencyInHours;
    /** The OdataType property */
    private String _odataType;
    /** If true, the user has the ability to use snapshots to restore Cloud PCs. If false, non-admin users cannot use snapshots to restore the Cloud PC. */
    private Boolean _userRestoreEnabled;
    /**
     * Instantiates a new cloudPcRestorePointSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcRestorePointSetting() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.cloudPcRestorePointSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcRestorePointSetting
     */
    @javax.annotation.Nonnull
    public static CloudPcRestorePointSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcRestorePointSetting();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcRestorePointSetting currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("frequencyInHours", (n) -> { currentObject.setFrequencyInHours(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("userRestoreEnabled", (n) -> { currentObject.setUserRestoreEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the frequencyInHours property value. The time interval in hours to take snapshots (restore points) of a Cloud PC automatically. Possible values are 4, 6, 12, 16, and 24. The default frequency is 12 hours.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFrequencyInHours() {
        return this._frequencyInHours;
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
     * Gets the userRestoreEnabled property value. If true, the user has the ability to use snapshots to restore Cloud PCs. If false, non-admin users cannot use snapshots to restore the Cloud PC.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserRestoreEnabled() {
        return this._userRestoreEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("frequencyInHours", this.getFrequencyInHours());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("userRestoreEnabled", this.getUserRestoreEnabled());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the frequencyInHours property value. The time interval in hours to take snapshots (restore points) of a Cloud PC automatically. Possible values are 4, 6, 12, 16, and 24. The default frequency is 12 hours.
     * @param value Value to set for the frequencyInHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrequencyInHours(@javax.annotation.Nullable final Integer value) {
        this._frequencyInHours = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the userRestoreEnabled property value. If true, the user has the ability to use snapshots to restore Cloud PCs. If false, non-admin users cannot use snapshots to restore the Cloud PC.
     * @param value Value to set for the userRestoreEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRestoreEnabled(@javax.annotation.Nullable final Boolean value) {
        this._userRestoreEnabled = value;
    }
}
