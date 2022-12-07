package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppPolicySetItem extends PolicySetItem implements Parsable {
    /** Possible values for the install intent chosen by the admin. */
    private InstallIntent _intent;
    /** Settings of the MobileAppPolicySetItem. */
    private MobileAppAssignmentSettings _settings;
    /**
     * Instantiates a new MobileAppPolicySetItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppPolicySetItem
     */
    @javax.annotation.Nonnull
    public static MobileAppPolicySetItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("intent", (n) -> { this.setIntent(n.getEnumValue(InstallIntent.class)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(MobileAppAssignmentSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intent property value. Possible values for the install intent chosen by the admin.
     * @return a installIntent
     */
    @javax.annotation.Nullable
    public InstallIntent getIntent() {
        return this._intent;
    }
    /**
     * Gets the settings property value. Settings of the MobileAppPolicySetItem.
     * @return a mobileAppAssignmentSettings
     */
    @javax.annotation.Nullable
    public MobileAppAssignmentSettings getSettings() {
        return this._settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("intent", this.getIntent());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the intent property value. Possible values for the install intent chosen by the admin.
     * @param value Value to set for the intent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntent(@javax.annotation.Nullable final InstallIntent value) {
        this._intent = value;
    }
    /**
     * Sets the settings property value. Settings of the MobileAppPolicySetItem.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final MobileAppAssignmentSettings value) {
        this._settings = value;
    }
}
