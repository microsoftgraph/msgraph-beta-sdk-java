package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDisplayConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The list of configured displays. Applicable only for Microsoft Teams Rooms devices.
     */
    private java.util.List<TeamworkConfiguredPeripheral> configuredDisplays;
    /**
     * Total number of connected displays, including the inbuilt display. Applicable only for Teams Rooms devices.
     */
    private Integer displayCount;
    /**
     * Configuration for the inbuilt display. Not applicable for Teams Rooms devices.
     */
    private TeamworkDisplayScreenConfiguration inBuiltDisplayScreenConfiguration;
    /**
     * True if content duplication is allowed. Applicable only for Teams Rooms devices.
     */
    private Boolean isContentDuplicationAllowed;
    /**
     * True if dual display mode is enabled. If isDualDisplayModeEnabled is true, then the content will be displayed on both front of room screens instead of just the one screen, when it is shared via the HDMI ingest module on the Microsoft Teams Rooms device. Applicable only for Teams Rooms devices.
     */
    private Boolean isDualDisplayModeEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new teamworkDisplayConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkDisplayConfiguration() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the configuredDisplays property value. The list of configured displays. Applicable only for Microsoft Teams Rooms devices.
     * @return a teamworkConfiguredPeripheral
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkConfiguredPeripheral> getConfiguredDisplays() {
        return this.configuredDisplays;
    }
    /**
     * Gets the displayCount property value. Total number of connected displays, including the inbuilt display. Applicable only for Teams Rooms devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDisplayCount() {
        return this.displayCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("configuredDisplays", (n) -> { this.setConfiguredDisplays(n.getCollectionOfObjectValues(TeamworkConfiguredPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("displayCount", (n) -> { this.setDisplayCount(n.getIntegerValue()); });
        deserializerMap.put("inBuiltDisplayScreenConfiguration", (n) -> { this.setInBuiltDisplayScreenConfiguration(n.getObjectValue(TeamworkDisplayScreenConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("isContentDuplicationAllowed", (n) -> { this.setIsContentDuplicationAllowed(n.getBooleanValue()); });
        deserializerMap.put("isDualDisplayModeEnabled", (n) -> { this.setIsDualDisplayModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inBuiltDisplayScreenConfiguration property value. Configuration for the inbuilt display. Not applicable for Teams Rooms devices.
     * @return a teamworkDisplayScreenConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkDisplayScreenConfiguration getInBuiltDisplayScreenConfiguration() {
        return this.inBuiltDisplayScreenConfiguration;
    }
    /**
     * Gets the isContentDuplicationAllowed property value. True if content duplication is allowed. Applicable only for Teams Rooms devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsContentDuplicationAllowed() {
        return this.isContentDuplicationAllowed;
    }
    /**
     * Gets the isDualDisplayModeEnabled property value. True if dual display mode is enabled. If isDualDisplayModeEnabled is true, then the content will be displayed on both front of room screens instead of just the one screen, when it is shared via the HDMI ingest module on the Microsoft Teams Rooms device. Applicable only for Teams Rooms devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDualDisplayModeEnabled() {
        return this.isDualDisplayModeEnabled;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the configuredDisplays property value. The list of configured displays. Applicable only for Microsoft Teams Rooms devices.
     * @param value Value to set for the configuredDisplays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfiguredDisplays(@javax.annotation.Nullable final java.util.List<TeamworkConfiguredPeripheral> value) {
        this.configuredDisplays = value;
    }
    /**
     * Sets the displayCount property value. Total number of connected displays, including the inbuilt display. Applicable only for Teams Rooms devices.
     * @param value Value to set for the displayCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayCount(@javax.annotation.Nullable final Integer value) {
        this.displayCount = value;
    }
    /**
     * Sets the inBuiltDisplayScreenConfiguration property value. Configuration for the inbuilt display. Not applicable for Teams Rooms devices.
     * @param value Value to set for the inBuiltDisplayScreenConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInBuiltDisplayScreenConfiguration(@javax.annotation.Nullable final TeamworkDisplayScreenConfiguration value) {
        this.inBuiltDisplayScreenConfiguration = value;
    }
    /**
     * Sets the isContentDuplicationAllowed property value. True if content duplication is allowed. Applicable only for Teams Rooms devices.
     * @param value Value to set for the isContentDuplicationAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsContentDuplicationAllowed(@javax.annotation.Nullable final Boolean value) {
        this.isContentDuplicationAllowed = value;
    }
    /**
     * Sets the isDualDisplayModeEnabled property value. True if dual display mode is enabled. If isDualDisplayModeEnabled is true, then the content will be displayed on both front of room screens instead of just the one screen, when it is shared via the HDMI ingest module on the Microsoft Teams Rooms device. Applicable only for Teams Rooms devices.
     * @param value Value to set for the isDualDisplayModeEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDualDisplayModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isDualDisplayModeEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
