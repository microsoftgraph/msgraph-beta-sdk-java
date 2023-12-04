package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessScenario extends Entity implements Parsable {
    /**
     * Instantiates a new BusinessScenario and sets the default values.
     */
    public BusinessScenario() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BusinessScenario
     */
    @jakarta.annotation.Nonnull
    public static BusinessScenario createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessScenario();
    }
    /**
     * Gets the createdBy property value. The identity of the user who created the scenario.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the scenario was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. Display name of the scenario.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ownerAppIds", (n) -> { this.setOwnerAppIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("planner", (n) -> { this.setPlanner(n.getObjectValue(BusinessScenarioPlanner::createFromDiscriminatorValue)); });
        deserializerMap.put("uniqueName", (n) -> { this.setUniqueName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The identity of the user who last modified the scenario.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the scenario was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the ownerAppIds property value. Identifiers of applications that are authorized to work with this scenario.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOwnerAppIds() {
        return this.backingStore.get("ownerAppIds");
    }
    /**
     * Gets the planner property value. Planner content related to the scenario.
     * @return a BusinessScenarioPlanner
     */
    @jakarta.annotation.Nullable
    public BusinessScenarioPlanner getPlanner() {
        return this.backingStore.get("planner");
    }
    /**
     * Gets the uniqueName property value. Unique name of the scenario. To avoid conflicts, the recommended value for the unique name is a reverse domain name format, owned by the author of the scenario. For example, a scenario authored by Contoso.com would have a unique name that starts with com.contoso.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUniqueName() {
        return this.backingStore.get("uniqueName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("ownerAppIds", this.getOwnerAppIds());
        writer.writeObjectValue("planner", this.getPlanner());
        writer.writeStringValue("uniqueName", this.getUniqueName());
    }
    /**
     * Sets the createdBy property value. The identity of the user who created the scenario.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the scenario was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. Display name of the scenario.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedBy property value. The identity of the user who last modified the scenario.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the scenario was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the ownerAppIds property value. Identifiers of applications that are authorized to work with this scenario.
     * @param value Value to set for the ownerAppIds property.
     */
    public void setOwnerAppIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ownerAppIds", value);
    }
    /**
     * Sets the planner property value. Planner content related to the scenario.
     * @param value Value to set for the planner property.
     */
    public void setPlanner(@jakarta.annotation.Nullable final BusinessScenarioPlanner value) {
        this.backingStore.set("planner", value);
    }
    /**
     * Sets the uniqueName property value. Unique name of the scenario. To avoid conflicts, the recommended value for the unique name is a reverse domain name format, owned by the author of the scenario. For example, a scenario authored by Contoso.com would have a unique name that starts with com.contoso.
     * @param value Value to set for the uniqueName property.
     */
    public void setUniqueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueName", value);
    }
}
