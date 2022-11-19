package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A complex type to store the expedited quality update settings such as release date and days until forced reboot. */
public class ExpeditedWindowsQualityUpdateSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of days after installation that forced reboot will happen. */
    private Integer _daysUntilForcedReboot;
    /** The OdataType property */
    private String _odataType;
    /** The release date to identify a quality update. */
    private String _qualityUpdateRelease;
    /**
     * Instantiates a new expeditedWindowsQualityUpdateSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExpeditedWindowsQualityUpdateSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.expeditedWindowsQualityUpdateSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a expeditedWindowsQualityUpdateSettings
     */
    @javax.annotation.Nonnull
    public static ExpeditedWindowsQualityUpdateSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpeditedWindowsQualityUpdateSettings();
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
     * Gets the daysUntilForcedReboot property value. The number of days after installation that forced reboot will happen.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDaysUntilForcedReboot() {
        return this._daysUntilForcedReboot;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExpeditedWindowsQualityUpdateSettings currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("daysUntilForcedReboot", (n) -> { currentObject.setDaysUntilForcedReboot(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("qualityUpdateRelease", (n) -> { currentObject.setQualityUpdateRelease(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the qualityUpdateRelease property value. The release date to identify a quality update.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQualityUpdateRelease() {
        return this._qualityUpdateRelease;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("daysUntilForcedReboot", this.getDaysUntilForcedReboot());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("qualityUpdateRelease", this.getQualityUpdateRelease());
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
     * Sets the daysUntilForcedReboot property value. The number of days after installation that forced reboot will happen.
     * @param value Value to set for the daysUntilForcedReboot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDaysUntilForcedReboot(@javax.annotation.Nullable final Integer value) {
        this._daysUntilForcedReboot = value;
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
     * Sets the qualityUpdateRelease property value. The release date to identify a quality update.
     * @param value Value to set for the qualityUpdateRelease property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQualityUpdateRelease(@javax.annotation.Nullable final String value) {
        this._qualityUpdateRelease = value;
    }
}
