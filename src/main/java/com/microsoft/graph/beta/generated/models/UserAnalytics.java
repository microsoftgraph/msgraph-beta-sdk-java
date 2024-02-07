package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAnalytics extends Entity implements Parsable {
    /**
     * Instantiates a new UserAnalytics and sets the default values.
     */
    public UserAnalytics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserAnalytics
     */
    @jakarta.annotation.Nonnull
    public static UserAnalytics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAnalytics();
    }
    /**
     * Gets the activityStatistics property value. The collection of work activities that a user spent time on during and outside of working hours. Read-only. Nullable.
     * @return a java.util.List<ActivityStatistics>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivityStatistics> getActivityStatistics() {
        return this.backingStore.get("activityStatistics");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityStatistics", (n) -> { this.setActivityStatistics(n.getCollectionOfObjectValues(ActivityStatistics::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(Settings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. The current settings for a user to use the analytics API.
     * @return a Settings
     */
    @jakarta.annotation.Nullable
    public Settings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activityStatistics", this.getActivityStatistics());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the activityStatistics property value. The collection of work activities that a user spent time on during and outside of working hours. Read-only. Nullable.
     * @param value Value to set for the activityStatistics property.
     */
    public void setActivityStatistics(@jakarta.annotation.Nullable final java.util.List<ActivityStatistics> value) {
        this.backingStore.set("activityStatistics", value);
    }
    /**
     * Sets the settings property value. The current settings for a user to use the analytics API.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final Settings value) {
        this.backingStore.set("settings", value);
    }
}
