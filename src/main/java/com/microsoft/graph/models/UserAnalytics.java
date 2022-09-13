package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserAnalytics extends Entity implements Parsable {
    /** The collection of work activities that a user spent time on during and outside of working hours. Read-only. Nullable. */
    private java.util.List<ActivityStatistics> _activityStatistics;
    /** The current settings for a user to use the analytics API. */
    private Settings _settings;
    /**
     * Instantiates a new userAnalytics and sets the default values.
     * @return a void
     */
    public UserAnalytics() {
        super();
        this.setOdataType("#microsoft.graph.userAnalytics");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userAnalytics
     */
    @javax.annotation.Nonnull
    public static UserAnalytics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAnalytics();
    }
    /**
     * Gets the activityStatistics property value. The collection of work activities that a user spent time on during and outside of working hours. Read-only. Nullable.
     * @return a activityStatistics
     */
    @javax.annotation.Nullable
    public java.util.List<ActivityStatistics> getActivityStatistics() {
        return this._activityStatistics;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserAnalytics currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activityStatistics", (n) -> { currentObject.setActivityStatistics(n.getCollectionOfObjectValues(ActivityStatistics::createFromDiscriminatorValue)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(Settings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the settings property value. The current settings for a user to use the analytics API.
     * @return a settings
     */
    @javax.annotation.Nullable
    public Settings getSettings() {
        return this._settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activityStatistics", this.getActivityStatistics());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the activityStatistics property value. The collection of work activities that a user spent time on during and outside of working hours. Read-only. Nullable.
     * @param value Value to set for the activityStatistics property.
     * @return a void
     */
    public void setActivityStatistics(@javax.annotation.Nullable final java.util.List<ActivityStatistics> value) {
        this._activityStatistics = value;
    }
    /**
     * Sets the settings property value. The current settings for a user to use the analytics API.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final Settings value) {
        this._settings = value;
    }
}
