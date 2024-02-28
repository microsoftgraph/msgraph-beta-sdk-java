package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsAppDashboardCardDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamsAppDashboardCardDefinition} and sets the default values.
     */
    public TeamsAppDashboardCardDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamsAppDashboardCardDefinition}
     */
    @jakarta.annotation.Nonnull
    public static TeamsAppDashboardCardDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppDashboardCardDefinition();
    }
    /**
     * Gets the contentSource property value. The configuration for the source of the card content. Required.
     * @return a {@link TeamsAppDashboardCardContentSource}
     */
    @jakarta.annotation.Nullable
    public TeamsAppDashboardCardContentSource getContentSource() {
        return this.backingStore.get("contentSource");
    }
    /**
     * Gets the defaultSize property value. The size of the card. The possible values are: medium, large, unknownFutureValue. Required.
     * @return a {@link TeamsAppDashboardCardSize}
     */
    @jakarta.annotation.Nullable
    public TeamsAppDashboardCardSize getDefaultSize() {
        return this.backingStore.get("defaultSize");
    }
    /**
     * Gets the description property value. The description for the card. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The name of the card. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentSource", (n) -> { this.setContentSource(n.getObjectValue(TeamsAppDashboardCardContentSource::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultSize", (n) -> { this.setDefaultSize(n.getEnumValue(TeamsAppDashboardCardSize::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("icon", (n) -> { this.setIcon(n.getObjectValue(TeamsAppDashboardCardIcon::createFromDiscriminatorValue)); });
        deserializerMap.put("pickerGroupId", (n) -> { this.setPickerGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the icon property value. Configuration for the display of the icon in the card picker. If neither this nor any of its properties (iconUrl and officeUIFabricIconName) are specified, the color icon of the app is used. Optional.
     * @return a {@link TeamsAppDashboardCardIcon}
     */
    @jakarta.annotation.Nullable
    public TeamsAppDashboardCardIcon getIcon() {
        return this.backingStore.get("icon");
    }
    /**
     * Gets the pickerGroupId property value. ID for the group in the card picker. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPickerGroupId() {
        return this.backingStore.get("pickerGroupId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contentSource", this.getContentSource());
        writer.writeEnumValue("defaultSize", this.getDefaultSize());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("icon", this.getIcon());
        writer.writeStringValue("pickerGroupId", this.getPickerGroupId());
    }
    /**
     * Sets the contentSource property value. The configuration for the source of the card content. Required.
     * @param value Value to set for the contentSource property.
     */
    public void setContentSource(@jakarta.annotation.Nullable final TeamsAppDashboardCardContentSource value) {
        this.backingStore.set("contentSource", value);
    }
    /**
     * Sets the defaultSize property value. The size of the card. The possible values are: medium, large, unknownFutureValue. Required.
     * @param value Value to set for the defaultSize property.
     */
    public void setDefaultSize(@jakarta.annotation.Nullable final TeamsAppDashboardCardSize value) {
        this.backingStore.set("defaultSize", value);
    }
    /**
     * Sets the description property value. The description for the card. Required.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The name of the card. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the icon property value. Configuration for the display of the icon in the card picker. If neither this nor any of its properties (iconUrl and officeUIFabricIconName) are specified, the color icon of the app is used. Optional.
     * @param value Value to set for the icon property.
     */
    public void setIcon(@jakarta.annotation.Nullable final TeamsAppDashboardCardIcon value) {
        this.backingStore.set("icon", value);
    }
    /**
     * Sets the pickerGroupId property value. ID for the group in the card picker. Required.
     * @param value Value to set for the pickerGroupId property.
     */
    public void setPickerGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("pickerGroupId", value);
    }
}
