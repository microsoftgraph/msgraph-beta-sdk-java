package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDisplayScreenConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices. */
    private Integer backlightBrightness;
    /** Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices. */
    private Period backlightTimeout;
    /** True if high contrast mode is enabled. Not applicable for Teams Rooms devices. */
    private Boolean isHighContrastEnabled;
    /** True if screensaver is enabled. Not applicable for Teams Rooms devices. */
    private Boolean isScreensaverEnabled;
    /** The OdataType property */
    private String odataType;
    /** Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices. */
    private Period screensaverTimeout;
    /**
     * Instantiates a new teamworkDisplayScreenConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkDisplayScreenConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDisplayScreenConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkDisplayScreenConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDisplayScreenConfiguration();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the backlightBrightness property value. The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBacklightBrightness() {
        return this.backlightBrightness;
    }
    /**
     * Gets the backlightTimeout property value. Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getBacklightTimeout() {
        return this.backlightTimeout;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("backlightBrightness", (n) -> { this.setBacklightBrightness(n.getIntegerValue()); });
        deserializerMap.put("backlightTimeout", (n) -> { this.setBacklightTimeout(n.getPeriodValue()); });
        deserializerMap.put("isHighContrastEnabled", (n) -> { this.setIsHighContrastEnabled(n.getBooleanValue()); });
        deserializerMap.put("isScreensaverEnabled", (n) -> { this.setIsScreensaverEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("screensaverTimeout", (n) -> { this.setScreensaverTimeout(n.getPeriodValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHighContrastEnabled property value. True if high contrast mode is enabled. Not applicable for Teams Rooms devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHighContrastEnabled() {
        return this.isHighContrastEnabled;
    }
    /**
     * Gets the isScreensaverEnabled property value. True if screensaver is enabled. Not applicable for Teams Rooms devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsScreensaverEnabled() {
        return this.isScreensaverEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the screensaverTimeout property value. Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getScreensaverTimeout() {
        return this.screensaverTimeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("backlightBrightness", this.getBacklightBrightness());
        writer.writePeriodValue("backlightTimeout", this.getBacklightTimeout());
        writer.writeBooleanValue("isHighContrastEnabled", this.getIsHighContrastEnabled());
        writer.writeBooleanValue("isScreensaverEnabled", this.getIsScreensaverEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writePeriodValue("screensaverTimeout", this.getScreensaverTimeout());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the backlightBrightness property value. The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices.
     * @param value Value to set for the backlightBrightness property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBacklightBrightness(@javax.annotation.Nullable final Integer value) {
        this.backlightBrightness = value;
    }
    /**
     * Sets the backlightTimeout property value. Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices.
     * @param value Value to set for the backlightTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBacklightTimeout(@javax.annotation.Nullable final Period value) {
        this.backlightTimeout = value;
    }
    /**
     * Sets the isHighContrastEnabled property value. True if high contrast mode is enabled. Not applicable for Teams Rooms devices.
     * @param value Value to set for the isHighContrastEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHighContrastEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isHighContrastEnabled = value;
    }
    /**
     * Sets the isScreensaverEnabled property value. True if screensaver is enabled. Not applicable for Teams Rooms devices.
     * @param value Value to set for the isScreensaverEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsScreensaverEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isScreensaverEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the screensaverTimeout property value. Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices.
     * @param value Value to set for the screensaverTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreensaverTimeout(@javax.annotation.Nullable final Period value) {
        this.screensaverTimeout = value;
    }
}
