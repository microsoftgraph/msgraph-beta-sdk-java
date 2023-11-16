package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkDisplayConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new TeamworkDisplayConfiguration and sets the default values.
     */
    public TeamworkDisplayConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkDisplayConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkDisplayConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDisplayConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the configuredDisplays property value. The list of configured displays. Applicable only for Microsoft Teams Rooms devices.
     * @return a java.util.List<TeamworkConfiguredPeripheral>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkConfiguredPeripheral> getConfiguredDisplays() {
        return this.backingStore.get("configuredDisplays");
    }
    /**
     * Gets the displayCount property value. Total number of connected displays, including the inbuilt display. Applicable only for Teams Rooms devices.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDisplayCount() {
        return this.backingStore.get("displayCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a TeamworkDisplayScreenConfiguration
     */
    @jakarta.annotation.Nullable
    public TeamworkDisplayScreenConfiguration getInBuiltDisplayScreenConfiguration() {
        return this.backingStore.get("inBuiltDisplayScreenConfiguration");
    }
    /**
     * Gets the isContentDuplicationAllowed property value. True if content duplication is allowed. Applicable only for Teams Rooms devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContentDuplicationAllowed() {
        return this.backingStore.get("isContentDuplicationAllowed");
    }
    /**
     * Gets the isDualDisplayModeEnabled property value. True if dual display mode is enabled. If isDualDisplayModeEnabled is true, then the content will be displayed on both front of room screens instead of just the one screen, when it is shared via the HDMI ingest module on the Microsoft Teams Rooms device. Applicable only for Teams Rooms devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDualDisplayModeEnabled() {
        return this.backingStore.get("isDualDisplayModeEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the configuredDisplays property value. The list of configured displays. Applicable only for Microsoft Teams Rooms devices.
     * @param value Value to set for the configuredDisplays property.
     */
    public void setConfiguredDisplays(@jakarta.annotation.Nullable final java.util.List<TeamworkConfiguredPeripheral> value) {
        this.backingStore.set("configuredDisplays", value);
    }
    /**
     * Sets the displayCount property value. Total number of connected displays, including the inbuilt display. Applicable only for Teams Rooms devices.
     * @param value Value to set for the displayCount property.
     */
    public void setDisplayCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("displayCount", value);
    }
    /**
     * Sets the inBuiltDisplayScreenConfiguration property value. Configuration for the inbuilt display. Not applicable for Teams Rooms devices.
     * @param value Value to set for the inBuiltDisplayScreenConfiguration property.
     */
    public void setInBuiltDisplayScreenConfiguration(@jakarta.annotation.Nullable final TeamworkDisplayScreenConfiguration value) {
        this.backingStore.set("inBuiltDisplayScreenConfiguration", value);
    }
    /**
     * Sets the isContentDuplicationAllowed property value. True if content duplication is allowed. Applicable only for Teams Rooms devices.
     * @param value Value to set for the isContentDuplicationAllowed property.
     */
    public void setIsContentDuplicationAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isContentDuplicationAllowed", value);
    }
    /**
     * Sets the isDualDisplayModeEnabled property value. True if dual display mode is enabled. If isDualDisplayModeEnabled is true, then the content will be displayed on both front of room screens instead of just the one screen, when it is shared via the HDMI ingest module on the Microsoft Teams Rooms device. Applicable only for Teams Rooms devices.
     * @param value Value to set for the isDualDisplayModeEnabled property.
     */
    public void setIsDualDisplayModeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDualDisplayModeEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
