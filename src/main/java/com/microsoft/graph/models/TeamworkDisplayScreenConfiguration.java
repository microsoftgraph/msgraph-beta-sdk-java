package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkDisplayScreenConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices.
     */
    private Integer backlightBrightness;
    /**
     * Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices.
     */
    private PeriodAndDuration backlightTimeout;
    /**
     * True if high contrast mode is enabled. Not applicable for Teams Rooms devices.
     */
    private Boolean isHighContrastEnabled;
    /**
     * True if screensaver is enabled. Not applicable for Teams Rooms devices.
     */
    private Boolean isScreensaverEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices.
     */
    private PeriodAndDuration screensaverTimeout;
    /**
     * Instantiates a new teamworkDisplayScreenConfiguration and sets the default values.
     */
    public TeamworkDisplayScreenConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDisplayScreenConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkDisplayScreenConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDisplayScreenConfiguration();
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
     * Gets the backlightBrightness property value. The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBacklightBrightness() {
        return this.backlightBrightness;
    }
    /**
     * Gets the backlightTimeout property value. Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getBacklightTimeout() {
        return this.backlightTimeout;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("backlightBrightness", (n) -> { this.setBacklightBrightness(n.getIntegerValue()); });
        deserializerMap.put("backlightTimeout", (n) -> { this.setBacklightTimeout(n.getPeriodAndDurationValue()); });
        deserializerMap.put("isHighContrastEnabled", (n) -> { this.setIsHighContrastEnabled(n.getBooleanValue()); });
        deserializerMap.put("isScreensaverEnabled", (n) -> { this.setIsScreensaverEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("screensaverTimeout", (n) -> { this.setScreensaverTimeout(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHighContrastEnabled property value. True if high contrast mode is enabled. Not applicable for Teams Rooms devices.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHighContrastEnabled() {
        return this.isHighContrastEnabled;
    }
    /**
     * Gets the isScreensaverEnabled property value. True if screensaver is enabled. Not applicable for Teams Rooms devices.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsScreensaverEnabled() {
        return this.isScreensaverEnabled;
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
     * Gets the screensaverTimeout property value. Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getScreensaverTimeout() {
        return this.screensaverTimeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("backlightBrightness", this.getBacklightBrightness());
        writer.writePeriodAndDurationValue("backlightTimeout", this.getBacklightTimeout());
        writer.writeBooleanValue("isHighContrastEnabled", this.getIsHighContrastEnabled());
        writer.writeBooleanValue("isScreensaverEnabled", this.getIsScreensaverEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writePeriodAndDurationValue("screensaverTimeout", this.getScreensaverTimeout());
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
     * Sets the backlightBrightness property value. The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices.
     * @param value Value to set for the backlightBrightness property.
     */
    public void setBacklightBrightness(@jakarta.annotation.Nullable final Integer value) {
        this.backlightBrightness = value;
    }
    /**
     * Sets the backlightTimeout property value. Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices.
     * @param value Value to set for the backlightTimeout property.
     */
    public void setBacklightTimeout(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backlightTimeout = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the isHighContrastEnabled property value. True if high contrast mode is enabled. Not applicable for Teams Rooms devices.
     * @param value Value to set for the isHighContrastEnabled property.
     */
    public void setIsHighContrastEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isHighContrastEnabled = value;
    }
    /**
     * Sets the isScreensaverEnabled property value. True if screensaver is enabled. Not applicable for Teams Rooms devices.
     * @param value Value to set for the isScreensaverEnabled property.
     */
    public void setIsScreensaverEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isScreensaverEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the screensaverTimeout property value. Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices.
     * @param value Value to set for the screensaverTimeout property.
     */
    public void setScreensaverTimeout(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.screensaverTimeout = PeriodAndDuration.ofPeriodAndDuration(value);
    }
}
