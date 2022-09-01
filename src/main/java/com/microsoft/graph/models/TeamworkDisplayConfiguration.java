package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDisplayConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The list of configured displays. Applicable only for Microsoft Teams Rooms devices. */
    private java.util.List<TeamworkConfiguredPeripheral> _configuredDisplays;
    /** Total number of connected displays, including the inbuilt display. Applicable only for Teams Rooms devices. */
    private Integer _displayCount;
    /** Configuration for the inbuilt display. Not applicable for Teams Rooms devices. */
    private TeamworkDisplayScreenConfiguration _inBuiltDisplayScreenConfiguration;
    /** True if content duplication is allowed. Applicable only for Teams Rooms devices. */
    private Boolean _isContentDuplicationAllowed;
    /** True if dual display mode is enabled. If isDualDisplayModeEnabled is true, then the content will be displayed on both front of room screens instead of just the one screen, when it is shared via the HDMI ingest module on the Microsoft Teams Rooms device. Applicable only for Teams Rooms devices. */
    private Boolean _isDualDisplayModeEnabled;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new teamworkDisplayConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkDisplayConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkDisplayConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDisplayConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkDisplayConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDisplayConfiguration();
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
     * Gets the configuredDisplays property value. The list of configured displays. Applicable only for Microsoft Teams Rooms devices.
     * @return a teamworkConfiguredPeripheral
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkConfiguredPeripheral> getConfiguredDisplays() {
        return this._configuredDisplays;
    }
    /**
     * Gets the displayCount property value. Total number of connected displays, including the inbuilt display. Applicable only for Teams Rooms devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDisplayCount() {
        return this._displayCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkDisplayConfiguration currentObject = this;
        return new HashMap<>(6) {{
            this.put("configuredDisplays", (n) -> { currentObject.setConfiguredDisplays(n.getCollectionOfObjectValues(TeamworkConfiguredPeripheral::createFromDiscriminatorValue)); });
            this.put("displayCount", (n) -> { currentObject.setDisplayCount(n.getIntegerValue()); });
            this.put("inBuiltDisplayScreenConfiguration", (n) -> { currentObject.setInBuiltDisplayScreenConfiguration(n.getObjectValue(TeamworkDisplayScreenConfiguration::createFromDiscriminatorValue)); });
            this.put("isContentDuplicationAllowed", (n) -> { currentObject.setIsContentDuplicationAllowed(n.getBooleanValue()); });
            this.put("isDualDisplayModeEnabled", (n) -> { currentObject.setIsDualDisplayModeEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the inBuiltDisplayScreenConfiguration property value. Configuration for the inbuilt display. Not applicable for Teams Rooms devices.
     * @return a teamworkDisplayScreenConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkDisplayScreenConfiguration getInBuiltDisplayScreenConfiguration() {
        return this._inBuiltDisplayScreenConfiguration;
    }
    /**
     * Gets the isContentDuplicationAllowed property value. True if content duplication is allowed. Applicable only for Teams Rooms devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsContentDuplicationAllowed() {
        return this._isContentDuplicationAllowed;
    }
    /**
     * Gets the isDualDisplayModeEnabled property value. True if dual display mode is enabled. If isDualDisplayModeEnabled is true, then the content will be displayed on both front of room screens instead of just the one screen, when it is shared via the HDMI ingest module on the Microsoft Teams Rooms device. Applicable only for Teams Rooms devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDualDisplayModeEnabled() {
        return this._isDualDisplayModeEnabled;
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
        writer.writeCollectionOfObjectValues("configuredDisplays", this.getConfiguredDisplays());
        writer.writeIntegerValue("displayCount", this.getDisplayCount());
        writer.writeObjectValue("inBuiltDisplayScreenConfiguration", this.getInBuiltDisplayScreenConfiguration());
        writer.writeBooleanValue("isContentDuplicationAllowed", this.getIsContentDuplicationAllowed());
        writer.writeBooleanValue("isDualDisplayModeEnabled", this.getIsDualDisplayModeEnabled());
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
     * Sets the configuredDisplays property value. The list of configured displays. Applicable only for Microsoft Teams Rooms devices.
     * @param value Value to set for the configuredDisplays property.
     * @return a void
     */
    public void setConfiguredDisplays(@javax.annotation.Nullable final java.util.List<TeamworkConfiguredPeripheral> value) {
        this._configuredDisplays = value;
    }
    /**
     * Sets the displayCount property value. Total number of connected displays, including the inbuilt display. Applicable only for Teams Rooms devices.
     * @param value Value to set for the displayCount property.
     * @return a void
     */
    public void setDisplayCount(@javax.annotation.Nullable final Integer value) {
        this._displayCount = value;
    }
    /**
     * Sets the inBuiltDisplayScreenConfiguration property value. Configuration for the inbuilt display. Not applicable for Teams Rooms devices.
     * @param value Value to set for the inBuiltDisplayScreenConfiguration property.
     * @return a void
     */
    public void setInBuiltDisplayScreenConfiguration(@javax.annotation.Nullable final TeamworkDisplayScreenConfiguration value) {
        this._inBuiltDisplayScreenConfiguration = value;
    }
    /**
     * Sets the isContentDuplicationAllowed property value. True if content duplication is allowed. Applicable only for Teams Rooms devices.
     * @param value Value to set for the isContentDuplicationAllowed property.
     * @return a void
     */
    public void setIsContentDuplicationAllowed(@javax.annotation.Nullable final Boolean value) {
        this._isContentDuplicationAllowed = value;
    }
    /**
     * Sets the isDualDisplayModeEnabled property value. True if dual display mode is enabled. If isDualDisplayModeEnabled is true, then the content will be displayed on both front of room screens instead of just the one screen, when it is shared via the HDMI ingest module on the Microsoft Teams Rooms device. Applicable only for Teams Rooms devices.
     * @param value Value to set for the isDualDisplayModeEnabled property.
     * @return a void
     */
    public void setIsDualDisplayModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isDualDisplayModeEnabled = value;
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
