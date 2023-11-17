package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for mobile app PolicySetItem.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppPolicySetItem extends PolicySetItem implements Parsable {
    /**
     * Instantiates a new MobileAppPolicySetItem and sets the default values.
     */
    public MobileAppPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppPolicySetItem
     */
    @jakarta.annotation.Nonnull
    public static MobileAppPolicySetItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("intent", (n) -> { this.setIntent(n.getEnumValue(InstallIntent.class)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(MobileAppAssignmentSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intent property value. Possible values for the install intent chosen by the admin.
     * @return a InstallIntent
     */
    @jakarta.annotation.Nullable
    public InstallIntent getIntent() {
        return this.backingStore.get("intent");
    }
    /**
     * Gets the settings property value. Settings of the MobileAppPolicySetItem.
     * @return a MobileAppAssignmentSettings
     */
    @jakarta.annotation.Nullable
    public MobileAppAssignmentSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("intent", this.getIntent());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the intent property value. Possible values for the install intent chosen by the admin.
     * @param value Value to set for the intent property.
     */
    public void setIntent(@jakarta.annotation.Nullable final InstallIntent value) {
        this.backingStore.set("intent", value);
    }
    /**
     * Sets the settings property value. Settings of the MobileAppPolicySetItem.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final MobileAppAssignmentSettings value) {
        this.backingStore.set("settings", value);
    }
}
