package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidManagedStoreAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /** The track IDs to enable for this app assignment. */
    private java.util.List<String> _androidManagedStoreAppTrackIds;
    /** Prioritization for automatic updates of Android Managed Store apps set on assignment. */
    private AndroidManagedStoreAutoUpdateMode _autoUpdateMode;
    /**
     * Instantiates a new AndroidManagedStoreAppAssignmentSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.androidManagedStoreAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedStoreAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static AndroidManagedStoreAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppAssignmentSettings();
    }
    /**
     * Gets the androidManagedStoreAppTrackIds property value. The track IDs to enable for this app assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAndroidManagedStoreAppTrackIds() {
        return this._androidManagedStoreAppTrackIds;
    }
    /**
     * Gets the autoUpdateMode property value. Prioritization for automatic updates of Android Managed Store apps set on assignment.
     * @return a androidManagedStoreAutoUpdateMode
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAutoUpdateMode getAutoUpdateMode() {
        return this._autoUpdateMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidManagedStoreAppAssignmentSettings currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("androidManagedStoreAppTrackIds", (n) -> { currentObject.setAndroidManagedStoreAppTrackIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("autoUpdateMode", (n) -> { currentObject.setAutoUpdateMode(n.getEnumValue(AndroidManagedStoreAutoUpdateMode.class)); });
        return deserializerMap
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
        writer.writeCollectionOfPrimitiveValues("androidManagedStoreAppTrackIds", this.getAndroidManagedStoreAppTrackIds());
        writer.writeEnumValue("autoUpdateMode", this.getAutoUpdateMode());
    }
    /**
     * Sets the androidManagedStoreAppTrackIds property value. The track IDs to enable for this app assignment.
     * @param value Value to set for the androidManagedStoreAppTrackIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidManagedStoreAppTrackIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._androidManagedStoreAppTrackIds = value;
    }
    /**
     * Sets the autoUpdateMode property value. Prioritization for automatic updates of Android Managed Store apps set on assignment.
     * @param value Value to set for the autoUpdateMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoUpdateMode(@javax.annotation.Nullable final AndroidManagedStoreAutoUpdateMode value) {
        this._autoUpdateMode = value;
    }
}
