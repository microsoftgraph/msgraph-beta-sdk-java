package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilteringProfile extends Profile implements Parsable {
    /**
     * Instantiates a new FilteringProfile and sets the default values.
     */
    public FilteringProfile() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.filteringProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FilteringProfile
     */
    @jakarta.annotation.Nonnull
    public static FilteringProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilteringProfile();
    }
    /**
     * Gets the conditionalAccessPolicies property value. A set of associated policies defined to regulate access to resources or systems based on specific conditions. Automatically expanded.
     * @return a java.util.List<ConditionalAccessPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getConditionalAccessPolicies() {
        return this.backingStore.get("conditionalAccessPolicies");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the filteringProfile was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conditionalAccessPolicies", (n) -> { this.setConditionalAccessPolicies(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. The priority used to order the profile for processing within a list.
     * @return a Long
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
        writer.writeCollectionOfObjectValues("conditionalAccessPolicies", this.getConditionalAccessPolicies());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeLongValue("priority", this.getPriority());
    }
    /**
     * Sets the conditionalAccessPolicies property value. A set of associated policies defined to regulate access to resources or systems based on specific conditions. Automatically expanded.
     * @param value Value to set for the conditionalAccessPolicies property.
     */
    public void setConditionalAccessPolicies(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this.backingStore.set("conditionalAccessPolicies", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the filteringProfile was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the priority property value. The priority used to order the profile for processing within a list.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("priority", value);
    }
}
