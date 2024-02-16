package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedRoleSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PrivilegedRoleSummary} and sets the default values.
     */
    public PrivilegedRoleSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegedRoleSummary}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedRoleSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleSummary();
    }
    /**
     * Gets the elevatedCount property value. The elevatedCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getElevatedCount() {
        return this.backingStore.get("elevatedCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("elevatedCount", (n) -> { this.setElevatedCount(n.getIntegerValue()); });
        deserializerMap.put("managedCount", (n) -> { this.setManagedCount(n.getIntegerValue()); });
        deserializerMap.put("mfaEnabled", (n) -> { this.setMfaEnabled(n.getBooleanValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RoleSummaryStatus::forValue)); });
        deserializerMap.put("usersCount", (n) -> { this.setUsersCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedCount property value. The managedCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getManagedCount() {
        return this.backingStore.get("managedCount");
    }
    /**
     * Gets the mfaEnabled property value. The mfaEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMfaEnabled() {
        return this.backingStore.get("mfaEnabled");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link RoleSummaryStatus}
     */
    @jakarta.annotation.Nullable
    public RoleSummaryStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the usersCount property value. The usersCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUsersCount() {
        return this.backingStore.get("usersCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("elevatedCount", this.getElevatedCount());
        writer.writeIntegerValue("managedCount", this.getManagedCount());
        writer.writeBooleanValue("mfaEnabled", this.getMfaEnabled());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeIntegerValue("usersCount", this.getUsersCount());
    }
    /**
     * Sets the elevatedCount property value. The elevatedCount property
     * @param value Value to set for the elevatedCount property.
     */
    public void setElevatedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("elevatedCount", value);
    }
    /**
     * Sets the managedCount property value. The managedCount property
     * @param value Value to set for the managedCount property.
     */
    public void setManagedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("managedCount", value);
    }
    /**
     * Sets the mfaEnabled property value. The mfaEnabled property
     * @param value Value to set for the mfaEnabled property.
     */
    public void setMfaEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("mfaEnabled", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RoleSummaryStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the usersCount property value. The usersCount property
     * @param value Value to set for the usersCount property.
     */
    public void setUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usersCount", value);
    }
}
