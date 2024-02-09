package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilteringPolicyLink extends PolicyLink implements Parsable {
    /**
     * Instantiates a new {@link FilteringPolicyLink} and sets the default values.
     */
    public FilteringPolicyLink() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.filteringPolicyLink");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FilteringPolicyLink}
     */
    @jakarta.annotation.Nonnull
    public static FilteringPolicyLink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilteringPolicyLink();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the filtering Policy link was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("loggingState", (n) -> { this.setLoggingState(n.getEnumValue(Status::forValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the policy was most recently modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the loggingState property value. The loggingState property
     * @return a {@link Status}
     */
    @jakarta.annotation.Nullable
    public Status getLoggingState() {
        return this.backingStore.get("loggingState");
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("loggingState", this.getLoggingState());
        writer.writeLongValue("priority", this.getPriority());
    }
    /**
     * Sets the createdDateTime property value. The date and time when the filtering Policy link was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the policy was most recently modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the loggingState property value. The loggingState property
     * @param value Value to set for the loggingState property.
     */
    public void setLoggingState(@jakarta.annotation.Nullable final Status value) {
        this.backingStore.set("loggingState", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("priority", value);
    }
}
