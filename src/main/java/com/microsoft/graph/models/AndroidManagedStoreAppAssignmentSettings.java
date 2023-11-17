package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign an Android Managed Store mobile app to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidManagedStoreAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Instantiates a new AndroidManagedStoreAppAssignmentSettings and sets the default values.
     */
    public AndroidManagedStoreAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.androidManagedStoreAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedStoreAppAssignmentSettings
     */
    @jakarta.annotation.Nonnull
    public static AndroidManagedStoreAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppAssignmentSettings();
    }
    /**
     * Gets the androidManagedStoreAppTrackIds property value. The track IDs to enable for this app assignment.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAndroidManagedStoreAppTrackIds() {
        return this.backingStore.get("androidManagedStoreAppTrackIds");
    }
    /**
     * Gets the autoUpdateMode property value. Prioritization for automatic updates of Android Managed Store apps set on assignment.
     * @return a AndroidManagedStoreAutoUpdateMode
     */
    @jakarta.annotation.Nullable
    public AndroidManagedStoreAutoUpdateMode getAutoUpdateMode() {
        return this.backingStore.get("autoUpdateMode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("androidManagedStoreAppTrackIds", (n) -> { this.setAndroidManagedStoreAppTrackIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("autoUpdateMode", (n) -> { this.setAutoUpdateMode(n.getEnumValue(AndroidManagedStoreAutoUpdateMode.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("androidManagedStoreAppTrackIds", this.getAndroidManagedStoreAppTrackIds());
        writer.writeEnumValue("autoUpdateMode", this.getAutoUpdateMode());
    }
    /**
     * Sets the androidManagedStoreAppTrackIds property value. The track IDs to enable for this app assignment.
     * @param value Value to set for the androidManagedStoreAppTrackIds property.
     */
    public void setAndroidManagedStoreAppTrackIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("androidManagedStoreAppTrackIds", value);
    }
    /**
     * Sets the autoUpdateMode property value. Prioritization for automatic updates of Android Managed Store apps set on assignment.
     * @param value Value to set for the autoUpdateMode property.
     */
    public void setAutoUpdateMode(@jakarta.annotation.Nullable final AndroidManagedStoreAutoUpdateMode value) {
        this.backingStore.set("autoUpdateMode", value);
    }
}
