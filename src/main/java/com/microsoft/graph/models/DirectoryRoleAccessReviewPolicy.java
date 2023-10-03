package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryRoleAccessReviewPolicy extends Entity implements Parsable {
    /**
     * The settings property
     */
    private AccessReviewScheduleSettings settings;
    /**
     * Instantiates a new DirectoryRoleAccessReviewPolicy and sets the default values.
     */
    public DirectoryRoleAccessReviewPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DirectoryRoleAccessReviewPolicy
     */
    @jakarta.annotation.Nonnull
    public static DirectoryRoleAccessReviewPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryRoleAccessReviewPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(AccessReviewScheduleSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a AccessReviewScheduleSettings
     */
    @jakarta.annotation.Nullable
    public AccessReviewScheduleSettings getSettings() {
        return this.settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final AccessReviewScheduleSettings value) {
        this.settings = value;
    }
}
